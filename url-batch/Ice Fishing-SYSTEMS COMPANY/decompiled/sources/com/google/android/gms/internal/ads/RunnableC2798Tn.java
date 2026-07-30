package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2798Tn implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27827n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2815Un f27828u;

    public /* synthetic */ RunnableC2798Tn(C2815Un c2815Un, int i) {
        this.f27827n = i;
        this.f27828u = c2815Un;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f27827n) {
            case 0:
                C2815Un c2815Un = this.f27828u;
                c2815Un.getClass();
                c2815Un.f28081c.execute(new RunnableC2798Tn(c2815Un, 1));
                break;
            case 1:
                this.f27828u.a();
                break;
            default:
                this.f27828u.a();
                break;
        }
    }
}
