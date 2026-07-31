package com.yandex.div.storage.templates;

import O1.Jd;
import V1.a;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramRecorder;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class CommonTemplatesPool {

    @NotNull
    private final ConcurrentHashMap<String, Jd> commonTemplates;

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final DivParsingEnvironment env;

    @Nullable
    private final String histogramComponent;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final a parsingHistogramProxy;

    public CommonTemplatesPool(@NotNull DivStorage divStorage, @NotNull ParsingErrorLogger logger, @Nullable String str, @NotNull HistogramRecorder histogramRecorder, @NotNull a parsingHistogramProxy) {
        DivParsingEnvironment createEmptyEnv;
        Intrinsics.checkNotNullParameter(divStorage, "divStorage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(histogramRecorder, "histogramRecorder");
        Intrinsics.checkNotNullParameter(parsingHistogramProxy, "parsingHistogramProxy");
        this.divStorage = divStorage;
        this.histogramComponent = str;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = parsingHistogramProxy;
        this.commonTemplates = new ConcurrentHashMap<>();
        createEmptyEnv = TemplatesContainerKt.createEmptyEnv(logger);
        this.env = createEmptyEnv;
    }
}
