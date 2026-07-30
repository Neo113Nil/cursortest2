package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Cv implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24269n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ev f24270u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f24271v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Hv f24272w;

    public /* synthetic */ Cv(Ev ev, int i, Hv hv) {
        this.f24270u = ev;
        this.f24271v = i;
        this.f24272w = hv;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f24269n) {
            case 0:
                this.f24270u.n(this.f24272w, this.f24271v);
                break;
            default:
                Ev ev = this.f24270u;
                int i = this.f24271v;
                if (i > 0) {
                    ev.n(this.f24272w, i);
                }
                ev.k(0L);
                break;
        }
    }

    public /* synthetic */ Cv(Ev ev, Hv hv, int i) {
        this.f24270u = ev;
        this.f24272w = hv;
        this.f24271v = i;
    }
}
