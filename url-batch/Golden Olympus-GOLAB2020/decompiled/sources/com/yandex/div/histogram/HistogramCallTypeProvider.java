package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class HistogramCallTypeProvider extends HistogramCallTypeChecker {

    @NotNull
    private final Function0<HistogramColdTypeChecker> histogramColdTypeChecker;

    public HistogramCallTypeProvider(@NotNull Function0<HistogramColdTypeChecker> histogramColdTypeChecker) {
        Intrinsics.checkNotNullParameter(histogramColdTypeChecker, "histogramColdTypeChecker");
        this.histogramColdTypeChecker = histogramColdTypeChecker;
    }

    @NotNull
    public final String getHistogramCallType(@NotNull String histogramName) {
        Intrinsics.checkNotNullParameter(histogramName, "histogramName");
        if (!((HistogramColdTypeChecker) this.histogramColdTypeChecker.invoke()).addReported(histogramName)) {
            return addReported(histogramName) ? "Cool" : "Warm";
        }
        addReported(histogramName);
        return "Cold";
    }
}
