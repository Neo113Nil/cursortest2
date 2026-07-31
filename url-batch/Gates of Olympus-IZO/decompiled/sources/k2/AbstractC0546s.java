package k2;

/* renamed from: k2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0546s extends P1.a implements P1.f {

    /* renamed from: e, reason: collision with root package name */
    public static final r f5385e = new r(P1.e.f3072d, new D1.E(4));

    public AbstractC0546s() {
        super(P1.e.f3072d);
    }

    public abstract void P(P1.i iVar, Runnable runnable);

    public boolean Q(P1.i iVar) {
        return !(this instanceof t0);
    }

    public AbstractC0546s R(String str, int i3) {
        p2.a.c(i3);
        return new p2.g(this, i3, str);
    }

    @Override // P1.a, P1.i
    public final P1.g k(P1.h hVar) {
        P1.g gVar;
        Z1.i.f(hVar, "key");
        if (!(hVar instanceof r)) {
            if (P1.e.f3072d == hVar) {
                return this;
            }
            return null;
        }
        r rVar = (r) hVar;
        P1.h hVar2 = this.f3066d;
        if ((hVar2 == rVar || rVar.f5383e == hVar2) && (gVar = (P1.g) rVar.f5382d.j(this)) != null) {
            return gVar;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0552y.i(this);
    }

    @Override // P1.a, P1.i
    public final P1.i x(P1.h hVar) {
        Z1.i.f(hVar, "key");
        boolean z3 = hVar instanceof r;
        P1.j jVar = P1.j.f3073d;
        if (z3) {
            r rVar = (r) hVar;
            P1.h hVar2 = this.f3066d;
            if ((hVar2 == rVar || rVar.f5383e == hVar2) && ((P1.g) rVar.f5382d.j(this)) != null) {
                return jVar;
            }
        } else if (P1.e.f3072d == hVar) {
            return jVar;
        }
        return this;
    }
}
