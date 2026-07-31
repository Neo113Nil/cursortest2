package com.yandex.div.histogram;

import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.util.Cancelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface CpuUsageHistogramReporter {

    @Metadata
    public static final class NoOp implements CpuUsageHistogramReporter {
        /* JADX INFO: Access modifiers changed from: private */
        public static final void startReporting$lambda$0() {
        }

        @Override // com.yandex.div.histogram.CpuUsageHistogramReporter
        @NotNull
        public Cancelable startReporting(@NotNull String histogramName, int i4) {
            Intrinsics.checkNotNullParameter(histogramName, "histogramName");
            return new Cancelable() { // from class: E1.a
                @Override // com.yandex.div.histogram.util.Cancelable
                public final void cancel() {
                    CpuUsageHistogramReporter.NoOp.startReporting$lambda$0();
                }
            };
        }
    }

    @NotNull
    Cancelable startReporting(@NotNull String str, int i4);
}
