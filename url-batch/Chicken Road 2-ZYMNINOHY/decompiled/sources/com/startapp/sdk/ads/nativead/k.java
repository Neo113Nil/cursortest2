package com.startapp.sdk.ads.nativead;

import io.appmetrica.analytics.impl.C0963t1;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f6222b;

    public /* synthetic */ k(int i4, Object[] objArr) {
        this.f6221a = i4;
        this.f6222b = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6221a) {
            case 0:
                NativeAdDetails.lambda$finishOmAdSession$0(this.f6222b);
                break;
            default:
                C0963t1.a(this.f6222b);
                break;
        }
    }
}
