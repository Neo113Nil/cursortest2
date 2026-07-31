package com.yandex.div.core.dagger;

import com.yandex.div.histogram.reporter.HistogramReporter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;

@Metadata
/* loaded from: classes2.dex */
/* synthetic */ class DivKitHistogramsModule$provideDivParsingHistogramReporter$1 extends p implements Function0<HistogramReporter> {
    DivKitHistogramsModule$provideDivParsingHistogramReporter$1(Object obj) {
        super(0, obj, V1.a.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HistogramReporter invoke() {
        return (HistogramReporter) ((V1.a) this.receiver).get();
    }
}
