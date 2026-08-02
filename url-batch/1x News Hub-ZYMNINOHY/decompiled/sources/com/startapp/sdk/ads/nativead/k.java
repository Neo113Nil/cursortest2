package com.startapp.sdk.ads.nativead;

import io.appmetrica.analytics.impl.C0815s1;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f3139b;

    public /* synthetic */ k(int i3, Object[] objArr) {
        this.f3138a = i3;
        this.f3139b = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3138a) {
            case 0:
                NativeAdDetails.lambda$finishOmAdSession$0(this.f3139b);
                break;
            default:
                C0815s1.a(this.f3139b);
                break;
        }
    }
}
