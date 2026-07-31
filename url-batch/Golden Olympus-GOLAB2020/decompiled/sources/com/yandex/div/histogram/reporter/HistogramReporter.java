package com.yandex.div.histogram.reporter;

import com.yandex.div.histogram.HistogramFilter;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class HistogramReporter {

    @NotNull
    private final HistogramReporterDelegate histogramReporterDelegate;

    public HistogramReporter(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        Intrinsics.checkNotNullParameter(histogramReporterDelegate, "histogramReporterDelegate");
        this.histogramReporterDelegate = histogramReporterDelegate;
    }

    public static /* synthetic */ void reportDuration$default(HistogramReporter histogramReporter, String str, long j4, String str2, String str3, HistogramFilter histogramFilter, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDuration");
        }
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        if ((i4 & 8) != 0) {
            str3 = null;
        }
        if ((i4 & 16) != 0) {
            histogramFilter = HistogramFilter.Companion.getON();
        }
        histogramReporter.reportDuration(str, j4, str2, str3, histogramFilter);
    }

    public void reportDuration(@NotNull String histogramName, long j4, @Nullable String str, @Nullable String str2, @NotNull HistogramFilter filter) {
        Intrinsics.checkNotNullParameter(histogramName, "histogramName");
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (filter.report(null)) {
            this.histogramReporterDelegate.reportDuration(histogramName, j4, str2);
        }
        if (str != null) {
            String str3 = str + JwtParser.SEPARATOR_CHAR + histogramName;
            if (filter.report(str)) {
                this.histogramReporterDelegate.reportDuration(str3, j4, str2);
            }
        }
    }
}
