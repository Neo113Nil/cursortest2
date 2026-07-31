package com.yandex.div.core.dagger;

import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivKitHistogramsModule$provideHistogramReporter$1 extends s implements Function0<HistogramReporter> {
    final /* synthetic */ HistogramReporterDelegate $histogramReporterDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivKitHistogramsModule$provideHistogramReporter$1(HistogramReporterDelegate histogramReporterDelegate) {
        super(0);
        this.$histogramReporterDelegate = histogramReporterDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final HistogramReporter invoke() {
        return DivHistogramsModuleKt.createHistogramReporter(this.$histogramReporterDelegate);
    }
}
