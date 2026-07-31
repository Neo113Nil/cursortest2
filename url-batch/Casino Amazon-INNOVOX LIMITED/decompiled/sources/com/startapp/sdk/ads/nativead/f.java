package com.startapp.sdk.ads.nativead;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f98a;

    public f(NativeAdDetails nativeAdDetails) {
        this.f98a = nativeAdDetails;
    }

    public final void a() {
        NativeAdDisplayListener nativeAdDisplayListener;
        boolean z;
        NativeAdDisplayListener nativeAdDisplayListener2;
        nativeAdDisplayListener = this.f98a.displayListener;
        if (nativeAdDisplayListener != null) {
            z = this.f98a.hiddenSent;
            if (z) {
                return;
            }
            nativeAdDisplayListener2 = this.f98a.displayListener;
            nativeAdDisplayListener2.adHidden(this.f98a);
            this.f98a.hiddenSent = true;
        }
    }
}
