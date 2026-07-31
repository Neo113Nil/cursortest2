package com.yandex.div.storage.templates;

import W1.h;
import W1.i;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class DivParsingHistogramProxy {

    @NotNull
    private final h reporter$delegate;

    public DivParsingHistogramProxy(@NotNull Function0<? extends DivParsingHistogramReporter> initReporter) {
        Intrinsics.checkNotNullParameter(initReporter, "initReporter");
        this.reporter$delegate = i.b(initReporter);
    }
}
