package com.yandex.div.storage.templates;

import V1.a;
import W1.h;
import W1.i;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class TemplatesContainer {

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final ParsingErrorLogger errorLogger;

    @NotNull
    private final Map<String, Object> groupTemplateReferences;

    @Nullable
    private final String histogramComponentName;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final h messageDigest$delegate;

    @NotNull
    private final a parsingHistogramProxy;

    @NotNull
    private final Map<String, DivParsingEnvironment> templateEnvironments;

    @NotNull
    private final CommonTemplatesPool templatesPool;

    public TemplatesContainer(@NotNull DivStorage divStorage, @NotNull ParsingErrorLogger errorLogger, @NotNull HistogramRecorder histogramRecorder, @NotNull a parsingHistogramProxy, @Nullable HistogramNameProvider histogramNameProvider) {
        Intrinsics.checkNotNullParameter(divStorage, "divStorage");
        Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
        Intrinsics.checkNotNullParameter(histogramRecorder, "histogramRecorder");
        Intrinsics.checkNotNullParameter(parsingHistogramProxy, "parsingHistogramProxy");
        this.divStorage = divStorage;
        this.errorLogger = errorLogger;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = parsingHistogramProxy;
        this.histogramComponentName = null;
        this.templatesPool = new CommonTemplatesPool(divStorage, errorLogger, null, histogramRecorder, parsingHistogramProxy);
        this.groupTemplateReferences = new LinkedHashMap();
        this.templateEnvironments = new LinkedHashMap();
        this.messageDigest$delegate = i.b(new TemplatesContainer$messageDigest$2(this));
    }
}
