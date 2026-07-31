package com.yandex.div.histogram;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class HistogramCallTypeChecker$reportedHistograms$2 extends s implements Function0<ConcurrentHashMap<String, Unit>> {
    public static final HistogramCallTypeChecker$reportedHistograms$2 INSTANCE = new HistogramCallTypeChecker$reportedHistograms$2();

    HistogramCallTypeChecker$reportedHistograms$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ConcurrentHashMap<String, Unit> invoke() {
        return new ConcurrentHashMap<>();
    }
}
