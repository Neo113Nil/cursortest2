package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3058cq implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29760n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Wv f29761u;

    public /* synthetic */ RunnableC3058cq(Wv wv, int i) {
        this.f29760n = i;
        this.f29761u = wv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29760n) {
            case 0:
                this.f29761u.a();
                break;
            default:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31685h6)).booleanValue() && AbstractC2655Lg.f26175K.f26640u) {
                    this.f29761u.c();
                    break;
                }
                break;
        }
    }
}
