package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.common.collect.ImmutableMap;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class e {
    public static ImmutableMap a(CmcdConfiguration.RequestConfig requestConfig) {
        return ImmutableMap.of();
    }

    public static int b(CmcdConfiguration.RequestConfig requestConfig, int i8) {
        return C.RATE_UNSET_INT;
    }

    public static boolean c(CmcdConfiguration.RequestConfig requestConfig, String str) {
        return true;
    }
}
