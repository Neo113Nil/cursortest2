package com.yandex.div.histogram;

import com.yandex.div.histogram.CpuUsageHistogramReporter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1 extends s implements Function0<CpuUsageHistogramReporter> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1();

    HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CpuUsageHistogramReporter invoke() {
        return new CpuUsageHistogramReporter.NoOp();
    }
}
