package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3816qs implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33899n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3869rs f33900u;

    public /* synthetic */ RunnableC3816qs(C3869rs c3869rs, int i) {
        this.f33899n = i;
        this.f33900u = c3869rs;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f33899n) {
            case 0:
                C3869rs c3869rs = this.f33900u;
                c3869rs.f34123a.set(new C3762ps(c3869rs.f34127e.a(), c3869rs.f34128f, c3869rs.f34125c));
                break;
            default:
                C3869rs c3869rs2 = this.f33900u;
                c3869rs2.getClass();
                c3869rs2.f34126d.execute(new RunnableC3816qs(c3869rs2, 0));
                break;
        }
    }
}
