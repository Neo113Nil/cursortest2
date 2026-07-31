package com.yandex.div.histogram.reporter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface HistogramReporterDelegate {

    @Metadata
    public static final class NoOp implements HistogramReporterDelegate {

        @NotNull
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
        }

        @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
        public void reportDuration(@NotNull String histogramName, long j4, @Nullable String str) {
            Intrinsics.checkNotNullParameter(histogramName, "histogramName");
        }
    }

    void reportDuration(@NotNull String str, long j4, @Nullable String str2);
}
