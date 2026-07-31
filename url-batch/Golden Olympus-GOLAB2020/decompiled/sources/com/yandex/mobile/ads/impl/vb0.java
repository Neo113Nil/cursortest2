package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vb0 implements wb0 {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f33565b = {kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(vb0.class, "forceImpressionTrackingListenerReference", "getForceImpressionTrackingListenerReference()Lcom/monetization/ads/base/impression/ForceImpressionTrackingListener;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ao1 f33566a = bo1.a();

    @Override // com.yandex.mobile.ads.impl.wb0
    public final void a() {
        wb0 wb0Var = (wb0) this.f33566a.getValue(this, f33565b[0]);
        if (wb0Var != null) {
            wb0Var.a();
        }
    }

    public final void a(@NotNull wb0 trackingListener) {
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        this.f33566a.setValue(this, f33565b[0], trackingListener);
    }
}
