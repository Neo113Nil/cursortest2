package y1;

import r1.n1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends s0.n implements n1 {

    /* renamed from: s, reason: collision with root package name */
    public boolean f9797s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f9798t;

    /* renamed from: u, reason: collision with root package name */
    public q6.c f9799u;

    public c(boolean z8, boolean z9, q6.c cVar) {
        this.f9797s = z8;
        this.f9798t = z9;
        this.f9799u = cVar;
    }

    @Override // r1.n1
    public final void S(i iVar) {
        this.f9799u.f(iVar);
    }

    @Override // r1.n1
    public final boolean b0() {
        return this.f9798t;
    }

    @Override // r1.n1
    public final boolean e0() {
        return this.f9797s;
    }
}
