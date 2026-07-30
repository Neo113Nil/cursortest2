package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2641Kj implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26004n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f26005u;

    public /* synthetic */ RunnableC2641Kj(r rVar, int i) {
        this.f26004n = i;
        this.f26005u = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26004n) {
            case 0:
                this.f26005u.q(new C3275gp(3));
                break;
            default:
                ((Fr) ((C3602mu) ((Q8) this.f26005u.f33923y).f27121v).f32775v).e();
                break;
        }
    }
}
