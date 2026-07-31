package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramColdTypeChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;

@Metadata
/* loaded from: classes2.dex */
/* synthetic */ class DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1 extends p implements Function0<HistogramColdTypeChecker> {
    DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(Object obj) {
        super(0, obj, V1.a.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HistogramColdTypeChecker invoke() {
        return (HistogramColdTypeChecker) ((V1.a) this.receiver).get();
    }
}
