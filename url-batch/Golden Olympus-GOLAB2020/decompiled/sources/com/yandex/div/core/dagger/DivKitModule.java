package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.internal.viewpool.ViewCreator;
import i1.AbstractC2470a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivKitModule {

    @NotNull
    public static final DivKitModule INSTANCE = new DivKitModule();

    private DivKitModule() {
    }

    @Nullable
    public static final i1.b provideSendBeaconManager(@NotNull Context context, @Nullable AbstractC2470a abstractC2470a) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    @NotNull
    public static final ViewCreator provideViewCreator(@NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        Intrinsics.checkNotNullParameter(cpuUsageHistogramReporter, "cpuUsageHistogramReporter");
        return new ViewCreator(cpuUsageHistogramReporter);
    }
}
