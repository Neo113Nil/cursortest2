package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class hs implements zh {
    @Override // com.ironsource.zh
    public void a(@NotNull Context context, @NotNull String key, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.saveIntToSharedPrefs(context, key, i4);
    }

    @Override // com.ironsource.zh
    public int b(@NotNull Context context, @NotNull String key, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.getIntFromSharedPrefs(context, key, i4);
    }

    @Override // com.ironsource.zh
    public void a(@NotNull Context context, @NotNull String key, long j4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.saveLongToSharedPrefs(context, key, j4);
    }

    @Override // com.ironsource.zh
    public long b(@NotNull Context context, @NotNull String key, long j4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.getLongFromSharedPrefs(context, key, j4);
    }
}
