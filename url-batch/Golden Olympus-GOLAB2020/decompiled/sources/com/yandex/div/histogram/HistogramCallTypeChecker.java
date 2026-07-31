package com.yandex.div.histogram;

import W1.h;
import W1.i;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class HistogramCallTypeChecker {

    @NotNull
    private final h reportedHistograms$delegate = i.b(HistogramCallTypeChecker$reportedHistograms$2.INSTANCE);

    private final ConcurrentHashMap<String, Unit> getReportedHistograms() {
        return (ConcurrentHashMap) this.reportedHistograms$delegate.getValue();
    }

    public final boolean addReported(@NotNull String histogramName) {
        Intrinsics.checkNotNullParameter(histogramName, "histogramName");
        return !getReportedHistograms().containsKey(histogramName) && getReportedHistograms().putIfAbsent(histogramName, Unit.f41027a) == null;
    }
}
