package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.StatFs;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vz0 {

    public static final class a {
        public static long a(@NotNull Context context, long j4, long j5) {
            long j6;
            Intrinsics.checkNotNullParameter(context, "context");
            long h4 = kotlin.ranges.g.h(j4, j5);
            try {
                StatFs statFs = new StatFs(g10.a(context, "").getAbsolutePath());
                j6 = statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (IllegalArgumentException unused) {
                ap0.c(new Object[0]);
                j6 = h4;
            }
            long j7 = 100;
            return kotlin.ranges.g.e(kotlin.ranges.g.h((2 * j6) / j7, j5), kotlin.ranges.g.h(h4, (j6 * 50) / j7));
        }
    }

    public static long a() {
        Runtime runtime = Runtime.getRuntime();
        return Runtime.getRuntime().maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }
}
