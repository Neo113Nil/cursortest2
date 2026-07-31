package com.yandex.div.storage;

import V1.a;
import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.TemplatesContainer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivDataRepositoryImpl implements DivDataRepository {

    @NotNull
    private final CardErrorLoggerFactory cardErrorFactory;

    @NotNull
    private Map<String, ? extends List<Object>> cardsWithErrors;

    @NotNull
    private final a divParsingHistogramProxy;

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final Map<String, Object> inMemoryData;

    @NotNull
    private final TemplatesContainer templateContainer;

    public DivDataRepositoryImpl(@NotNull DivStorage divStorage, @NotNull TemplatesContainer templateContainer, @NotNull HistogramRecorder histogramRecorder, @Nullable HistogramNameProvider histogramNameProvider, @NotNull a divParsingHistogramProxy, @NotNull CardErrorLoggerFactory cardErrorFactory) {
        Intrinsics.checkNotNullParameter(divStorage, "divStorage");
        Intrinsics.checkNotNullParameter(templateContainer, "templateContainer");
        Intrinsics.checkNotNullParameter(histogramRecorder, "histogramRecorder");
        Intrinsics.checkNotNullParameter(divParsingHistogramProxy, "divParsingHistogramProxy");
        Intrinsics.checkNotNullParameter(cardErrorFactory, "cardErrorFactory");
        this.divStorage = divStorage;
        this.templateContainer = templateContainer;
        this.histogramRecorder = histogramRecorder;
        this.divParsingHistogramProxy = divParsingHistogramProxy;
        this.cardErrorFactory = cardErrorFactory;
        this.inMemoryData = new LinkedHashMap();
        this.cardsWithErrors = MapsKt.emptyMap();
    }
}
