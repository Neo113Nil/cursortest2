package p2;

import b0.l0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final c4.o f7627a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7628b;

    /* renamed from: c, reason: collision with root package name */
    public final c6.l f7629c;

    /* renamed from: d, reason: collision with root package name */
    public final n f7630d;

    /* renamed from: e, reason: collision with root package name */
    public final l.d f7631e;

    /* renamed from: f, reason: collision with root package name */
    public final a1.d f7632f;

    public j(c4.o oVar, a aVar) {
        c6.l lVar = k.f7633a;
        n nVar = new n(k.f7634b);
        l.d dVar = new l.d(15);
        this.f7627a = oVar;
        this.f7628b = aVar;
        this.f7629c = lVar;
        this.f7630d = nVar;
        this.f7631e = dVar;
        this.f7632f = new a1.d(14, this);
    }

    public final d0 a(a0 a0Var) {
        c6.l lVar = this.f7629c;
        l0 l0Var = new l0(16, this, a0Var);
        synchronized (((s7.c0) lVar.f1829e)) {
            d0 d0Var = (d0) ((s.r) lVar.f1830i).c(a0Var);
            if (d0Var != null) {
                if (d0Var.a()) {
                    return d0Var;
                }
            }
            try {
                d0 d0Var2 = (d0) l0Var.invoke(new l0(17, lVar, a0Var));
                synchronized (((s7.c0) lVar.f1829e)) {
                    if (((s.r) lVar.f1830i).c(a0Var) == null && d0Var2.a()) {
                        ((s.r) lVar.f1830i).d(a0Var, d0Var2);
                    }
                }
                return d0Var2;
            } catch (Exception e2) {
                throw new IllegalStateException("Could not load font", e2);
            }
        }
    }

    public final d0 b(i iVar, s sVar, int i3, int i10) {
        a aVar = this.f7628b;
        aVar.getClass();
        int i11 = aVar.f7602d;
        s sVar2 = (i11 == 0 || i11 == Integer.MAX_VALUE) ? sVar : new s(be.f.c(sVar.f7648d + i11, 1, 1000));
        this.f7627a.getClass();
        return a(new a0(iVar, sVar2, i3, i10, null));
    }
}
