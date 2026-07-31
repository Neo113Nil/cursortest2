package q2;

/* renamed from: q2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0831s extends V1.a implements V1.f {

    /* renamed from: e, reason: collision with root package name */
    public static final r f7924e = new r(V1.e.f4557d, new A2.i(9));

    public AbstractC0831s() {
        super(V1.e.f4557d);
    }

    public abstract void D(V1.i iVar, Runnable runnable);

    public void E(V1.i iVar, Runnable runnable) {
        D(iVar, runnable);
    }

    public boolean F(V1.i iVar) {
        return !(this instanceof t0);
    }

    public AbstractC0831s G(String str, int i3) {
        v2.a.c(i3);
        return new v2.g(this, i3, str);
    }

    @Override // V1.a, V1.i
    public final V1.i l(V1.h hVar) {
        f2.j.f(hVar, "key");
        boolean z3 = hVar instanceof r;
        V1.j jVar = V1.j.f4558d;
        if (z3) {
            r rVar = (r) hVar;
            V1.h hVar2 = this.f4551d;
            if ((hVar2 == rVar || rVar.f7922e == hVar2) && ((V1.g) rVar.f7921d.n(this)) != null) {
                return jVar;
            }
        } else if (V1.e.f4557d == hVar) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0837y.j(this);
    }

    @Override // V1.a, V1.i
    public final V1.g v(V1.h hVar) {
        V1.g gVar;
        f2.j.f(hVar, "key");
        if (!(hVar instanceof r)) {
            if (V1.e.f4557d == hVar) {
                return this;
            }
            return null;
        }
        r rVar = (r) hVar;
        V1.h hVar2 = this.f4551d;
        if ((hVar2 == rVar || rVar.f7922e == hVar2) && (gVar = (V1.g) rVar.f7921d.n(this)) != null) {
            return gVar;
        }
        return null;
    }
}
