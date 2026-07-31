package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
/* synthetic */ class DivParsingHistogramReporter$Companion$DEFAULT$2 extends p implements Function0<DefaultDivParsingHistogramReporter> {
    public static final DivParsingHistogramReporter$Companion$DEFAULT$2 INSTANCE = new DivParsingHistogramReporter$Companion$DEFAULT$2();

    DivParsingHistogramReporter$Companion$DEFAULT$2() {
        super(0, DefaultDivParsingHistogramReporter.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DefaultDivParsingHistogramReporter invoke() {
        return new DefaultDivParsingHistogramReporter();
    }
}
