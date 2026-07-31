package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.yg1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gw1 implements d62 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gd1 f26340a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final no1 f26341b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final jk0 f26342c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final yg1 f26343d;

    public gw1(@NotNull r21 noticeTrackingManager, @NotNull no1 renderTrackingManager, @NotNull jk0 indicatorManager, @NotNull yg1 phoneStateTracker) {
        Intrinsics.checkNotNullParameter(noticeTrackingManager, "noticeTrackingManager");
        Intrinsics.checkNotNullParameter(renderTrackingManager, "renderTrackingManager");
        Intrinsics.checkNotNullParameter(indicatorManager, "indicatorManager");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        this.f26340a = noticeTrackingManager;
        this.f26341b = renderTrackingManager;
        this.f26342c = indicatorManager;
        this.f26343d = phoneStateTracker;
    }

    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull v61 nativeAdViewAdapter) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        this.f26342c.a(nativeAdViewAdapter);
    }

    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull ck0 impressionTrackingListener) {
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
        this.f26340a.a(impressionTrackingListener);
    }

    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull h91 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f26341b.a(reportParameterManager);
    }

    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull Context context, @NotNull yg1.b phoneStateListener, @Nullable v61 v61Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(phoneStateListener, "phoneStateListener");
        this.f26341b.b();
        this.f26340a.b();
        this.f26343d.a(phoneStateListener);
        if (v61Var != null) {
            this.f26342c.a(context, v61Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull Context context, @NotNull yg1.b phoneStateListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(phoneStateListener, "phoneStateListener");
        this.f26341b.c();
        this.f26340a.a();
        this.f26343d.b(phoneStateListener);
        this.f26342c.a();
    }

    @Override // com.yandex.mobile.ads.impl.d62
    public final void a(@NotNull C2360y7<?> adResponse, @NotNull List<tx1> showNotices) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        this.f26340a.a(adResponse, showNotices);
    }
}
