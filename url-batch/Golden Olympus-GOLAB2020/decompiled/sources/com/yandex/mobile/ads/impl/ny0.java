package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.yg1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ny0 implements d62 {
    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull v61 nativeAdViewAdapter) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
    }

    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull ck0 impressionTrackingListener) {
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
    }

    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull h91 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
    }

    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull Context context, @NotNull yg1.b phoneStateListener, @Nullable v61 v61Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(phoneStateListener, "phoneStateListener");
    }

    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull Context context, @NotNull yg1.b phoneStateListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(phoneStateListener, "phoneStateListener");
    }

    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull C2360y7<?> adResponse, @NotNull List<tx1> showNotices) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
    }
}
