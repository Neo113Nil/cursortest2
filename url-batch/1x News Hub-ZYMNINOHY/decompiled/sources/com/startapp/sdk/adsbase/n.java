package com.startapp.sdk.adsbase;

import io.appmetrica.analytics.impl.Zb;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3397c;

    public /* synthetic */ n(Object obj, boolean z, int i3) {
        this.f3395a = i3;
        this.f3397c = obj;
        this.f3396b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3395a) {
            case 0:
                ((c) this.f3397c).b(this.f3396b);
                break;
            default:
                Zb.a((Zb) this.f3397c, this.f3396b);
                break;
        }
    }
}
