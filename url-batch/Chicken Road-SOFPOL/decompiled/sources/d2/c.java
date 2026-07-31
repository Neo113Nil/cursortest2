package d2;

import w1.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends y0.l implements s1 {

    /* renamed from: r, reason: collision with root package name */
    public boolean f2112r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2113s;

    /* renamed from: t, reason: collision with root package name */
    public p6.c f2114t;

    public c(boolean z3, boolean z7, p6.c cVar) {
        this.f2112r = z3;
        this.f2113s = z7;
        this.f2114t = cVar;
    }

    @Override // w1.s1
    public final boolean T() {
        return this.f2113s;
    }

    @Override // w1.s1
    public final boolean U() {
        return this.f2112r;
    }

    @Override // w1.s1
    public final void q(j jVar) {
        this.f2114t.i(jVar);
    }
}
