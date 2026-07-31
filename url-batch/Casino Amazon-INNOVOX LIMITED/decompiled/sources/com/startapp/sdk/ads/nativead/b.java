package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.internal.ef;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b implements ef {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f94a;

    public b(NativeAdDetails nativeAdDetails) {
        this.f94a = nativeAdDetails;
    }

    @Override // com.startapp.sdk.internal.ef
    public final void a(String str) {
        this.f94a.onImpressionSent(str);
    }
}
