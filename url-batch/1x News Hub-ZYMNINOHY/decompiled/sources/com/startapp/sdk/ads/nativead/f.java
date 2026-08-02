package com.startapp.sdk.ads.nativead;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f3127a;

    public f(NativeAdDetails nativeAdDetails) {
        this.f3127a = nativeAdDetails;
    }

    public final void a() {
        NativeAdDisplayListener nativeAdDisplayListener;
        boolean z;
        NativeAdDisplayListener nativeAdDisplayListener2;
        nativeAdDisplayListener = this.f3127a.displayListener;
        if (nativeAdDisplayListener != null) {
            z = this.f3127a.hiddenSent;
            if (z) {
                return;
            }
            nativeAdDisplayListener2 = this.f3127a.displayListener;
            nativeAdDisplayListener2.adHidden(this.f3127a);
            this.f3127a.hiddenSent = true;
        }
    }
}
