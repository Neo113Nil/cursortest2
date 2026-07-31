package io.opentelemetry.sdk.metrics.internal.view;

import androidx.webkit.ProxyConfig;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.internal.GlobUtil;
import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.InstrumentSelector;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.View;
import io.opentelemetry.sdk.metrics.export.CardinalityLimitSelector;
import io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregationUtil;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory;
import io.opentelemetry.sdk.metrics.internal.debug.SourceInfo;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.state.MetricStorage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class ViewRegistry {
    static final RegisteredView DEFAULT_REGISTERED_VIEW;
    static final View DEFAULT_VIEW;
    private static final Logger logger;
    private final Map<InstrumentType, RegisteredView> instrumentDefaultRegisteredView = new HashMap();
    private final List<RegisteredView> registeredViews;

    static {
        View build = View.builder().build();
        DEFAULT_VIEW = build;
        DEFAULT_REGISTERED_VIEW = RegisteredView.create(InstrumentSelector.builder().setName(ProxyConfig.MATCH_ALL_SCHEMES).build(), build, NoopAttributesProcessor.NOOP, MetricStorage.DEFAULT_MAX_CARDINALITY, SourceInfo.noSourceInfo());
        logger = Logger.getLogger(ViewRegistry.class.getName());
    }

    ViewRegistry(DefaultAggregationSelector defaultAggregationSelector, CardinalityLimitSelector cardinalityLimitSelector, List<RegisteredView> list) {
        for (InstrumentType instrumentType : InstrumentType.values()) {
            this.instrumentDefaultRegisteredView.put(instrumentType, RegisteredView.create(InstrumentSelector.builder().setName(ProxyConfig.MATCH_ALL_SCHEMES).build(), View.builder().setAggregation(defaultAggregationSelector.getDefaultAggregation(instrumentType)).build(), AttributesProcessor.noop(), cardinalityLimitSelector.getCardinalityLimit(instrumentType), SourceInfo.noSourceInfo()));
        }
        this.registeredViews = list;
    }

    public static ViewRegistry create(DefaultAggregationSelector defaultAggregationSelector, CardinalityLimitSelector cardinalityLimitSelector, List<RegisteredView> list) {
        return new ViewRegistry(defaultAggregationSelector, cardinalityLimitSelector, new ArrayList(list));
    }

    public static ViewRegistry create() {
        return create(new DefaultAggregationSelector() { // from class: io.opentelemetry.sdk.metrics.internal.view.ViewRegistry$$ExternalSyntheticLambda0
            @Override // io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector
            public final Aggregation getDefaultAggregation(InstrumentType instrumentType) {
                Aggregation defaultAggregation;
                defaultAggregation = Aggregation.defaultAggregation();
                return defaultAggregation;
            }
        }, CardinalityLimitSelector.defaultCardinalityLimitSelector(), Collections.emptyList());
    }

    public List<RegisteredView> findViews(InstrumentDescriptor instrumentDescriptor, InstrumentationScopeInfo instrumentationScopeInfo) {
        ArrayList arrayList = new ArrayList();
        for (RegisteredView registeredView : this.registeredViews) {
            if (matchesSelector(registeredView.getInstrumentSelector(), instrumentDescriptor, instrumentationScopeInfo)) {
                if (((AggregatorFactory) registeredView.getView().getAggregation()).isCompatibleWithInstrument(instrumentDescriptor)) {
                    arrayList.add(registeredView);
                } else {
                    logger.log(Level.WARNING, "View aggregation " + AggregationUtil.aggregationName(registeredView.getView().getAggregation()) + " is incompatible with instrument " + instrumentDescriptor.getName() + " of type " + instrumentDescriptor.getType());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return Collections.unmodifiableList(arrayList);
        }
        RegisteredView registeredView2 = (RegisteredView) Objects.requireNonNull(this.instrumentDefaultRegisteredView.get(instrumentDescriptor.getType()));
        if (!((AggregatorFactory) registeredView2.getView().getAggregation()).isCompatibleWithInstrument(instrumentDescriptor)) {
            logger.log(Level.WARNING, "Instrument default aggregation " + AggregationUtil.aggregationName(registeredView2.getView().getAggregation()) + " is incompatible with instrument " + instrumentDescriptor.getName() + " of type " + instrumentDescriptor.getType());
            registeredView2 = DEFAULT_REGISTERED_VIEW;
        }
        if (instrumentDescriptor.getAdvice().hasAttributes()) {
            registeredView2 = applyAdviceToDefaultView(registeredView2, instrumentDescriptor.getAdvice());
        }
        return Collections.singletonList(registeredView2);
    }

    private static boolean matchesSelector(InstrumentSelector instrumentSelector, InstrumentDescriptor instrumentDescriptor, InstrumentationScopeInfo instrumentationScopeInfo) {
        if (instrumentSelector.getInstrumentType() != null && instrumentSelector.getInstrumentType() != instrumentDescriptor.getType()) {
            return false;
        }
        if (instrumentSelector.getInstrumentUnit() != null && !instrumentSelector.getInstrumentUnit().equals(instrumentDescriptor.getUnit())) {
            return false;
        }
        if (instrumentSelector.getInstrumentName() == null || GlobUtil.createGlobPatternPredicate(instrumentSelector.getInstrumentName()).test(instrumentDescriptor.getName())) {
            return matchesMeter(instrumentSelector, instrumentationScopeInfo);
        }
        return false;
    }

    private static boolean matchesMeter(InstrumentSelector instrumentSelector, InstrumentationScopeInfo instrumentationScopeInfo) {
        if (instrumentSelector.getMeterName() != null && !instrumentSelector.getMeterName().equals(instrumentationScopeInfo.getName())) {
            return false;
        }
        if (instrumentSelector.getMeterVersion() == null || instrumentSelector.getMeterVersion().equals(instrumentationScopeInfo.getVersion())) {
            return instrumentSelector.getMeterSchemaUrl() == null || instrumentSelector.getMeterSchemaUrl().equals(instrumentationScopeInfo.getSchemaUrl());
        }
        return false;
    }

    private static RegisteredView applyAdviceToDefaultView(RegisteredView registeredView, Advice advice) {
        return RegisteredView.create(registeredView.getInstrumentSelector(), registeredView.getView(), new AdviceAttributesProcessor((List) Objects.requireNonNull(advice.getAttributes())), registeredView.getCardinalityLimit(), registeredView.getViewSourceInfo());
    }
}
