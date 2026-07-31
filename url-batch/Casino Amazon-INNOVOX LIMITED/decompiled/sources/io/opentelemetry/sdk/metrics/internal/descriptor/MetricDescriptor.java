package io.opentelemetry.sdk.metrics.internal.descriptor;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;
import io.opentelemetry.sdk.metrics.View;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregationUtil;
import io.opentelemetry.sdk.metrics.internal.debug.SourceInfo;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class MetricDescriptor {
    private int hashcode;
    private final AtomicReference<SourceInfo> viewSourceInfo = new AtomicReference<>();

    public abstract String getDescription();

    public abstract String getName();

    public abstract InstrumentDescriptor getSourceInstrument();

    public abstract View getView();

    public static MetricDescriptor create(String str, String str2, String str3) {
        return create(View.builder().build(), SourceInfo.fromCurrentStack(), InstrumentDescriptor.create(str, str2, str3, InstrumentType.OBSERVABLE_GAUGE, InstrumentValueType.DOUBLE, Advice.empty()));
    }

    public static MetricDescriptor create(View view, SourceInfo sourceInfo, InstrumentDescriptor instrumentDescriptor) {
        AutoValue_MetricDescriptor autoValue_MetricDescriptor = new AutoValue_MetricDescriptor(view.getName() == null ? instrumentDescriptor.getName() : view.getName(), view.getDescription() == null ? instrumentDescriptor.getDescription() : view.getDescription(), view, instrumentDescriptor);
        ((MetricDescriptor) autoValue_MetricDescriptor).viewSourceInfo.set(sourceInfo);
        return autoValue_MetricDescriptor;
    }

    MetricDescriptor() {
    }

    public final SourceInfo getViewSourceInfo() {
        SourceInfo sourceInfo = this.viewSourceInfo.get();
        return sourceInfo == null ? SourceInfo.noSourceInfo() : sourceInfo;
    }

    public String getAggregationName() {
        return AggregationUtil.aggregationName(getView().getAggregation());
    }

    public final int hashCode() {
        int i = this.hashcode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((getName().toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ getDescription().hashCode()) * 1000003) ^ getView().hashCode()) * 1000003) ^ getSourceInstrument().hashCode();
        this.hashcode = hashCode;
        return hashCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MetricDescriptor) {
            MetricDescriptor metricDescriptor = (MetricDescriptor) obj;
            if (getName().equalsIgnoreCase(metricDescriptor.getName()) && getDescription().equals(metricDescriptor.getDescription()) && getView().equals(metricDescriptor.getView()) && getSourceInstrument().equals(metricDescriptor.getSourceInstrument())) {
                return true;
            }
        }
        return false;
    }
}
