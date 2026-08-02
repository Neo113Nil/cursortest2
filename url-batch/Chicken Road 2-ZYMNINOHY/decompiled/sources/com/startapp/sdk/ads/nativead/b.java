package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.internal.wf;

/* loaded from: classes.dex */
public final class b implements wf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f6204a;

    public b(NativeAdDetails nativeAdDetails) {
        this.f6204a = nativeAdDetails;
    }

    @Override // com.startapp.sdk.internal.wf
    public final void a(String str) {
        this.f6204a.onImpressionSent(str);
    }
}
