package com.startapp.sdk.ads.nativead;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f6210a;

    public f(NativeAdDetails nativeAdDetails) {
        this.f6210a = nativeAdDetails;
    }

    public final void a() {
        NativeAdDisplayListener nativeAdDisplayListener;
        boolean z;
        NativeAdDisplayListener nativeAdDisplayListener2;
        nativeAdDisplayListener = this.f6210a.displayListener;
        if (nativeAdDisplayListener != null) {
            z = this.f6210a.hiddenSent;
            if (z) {
                return;
            }
            nativeAdDisplayListener2 = this.f6210a.displayListener;
            nativeAdDisplayListener2.adHidden(this.f6210a);
            this.f6210a.hiddenSent = true;
        }
    }
}
