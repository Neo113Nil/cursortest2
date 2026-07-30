package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.eq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3167eq implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30515n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Wv f30516u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ View f30517v;

    public /* synthetic */ RunnableC3167eq(Wv wv, View view, int i) {
        this.f30515n = i;
        this.f30516u = wv;
        this.f30517v = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30515n) {
            case 0:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31685h6)).booleanValue() && AbstractC2655Lg.f26175K.f26640u) {
                    Yv yv = Yv.f28919n;
                    Wv wv = this.f30516u;
                    if (!wv.f28531f) {
                        wv.f28527b.a(this.f30517v, yv);
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31685h6)).booleanValue() && AbstractC2655Lg.f26175K.f26640u) {
                    this.f30516u.b(this.f30517v);
                    break;
                }
                break;
        }
    }
}
