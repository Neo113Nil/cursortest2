package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Bv implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24103n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ev f24104u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Hv f24105v;

    public /* synthetic */ Bv(Ev ev, Hv hv, int i) {
        this.f24103n = i;
        this.f24104u = ev;
        this.f24105v = hv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24103n) {
            case 0:
                this.f24104u.n(this.f24105v, 1);
                break;
            default:
                Hv hv = this.f24105v;
                Ev ev = this.f24104u;
                if (!ev.f24849b.get() && hv.t() == 0 && hv.u()) {
                    hv.k();
                }
                ev.k(((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31643d0)).longValue());
                break;
        }
    }
}
