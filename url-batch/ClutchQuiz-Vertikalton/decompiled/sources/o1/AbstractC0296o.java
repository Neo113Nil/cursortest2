package o1;

/* renamed from: o1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0296o extends X0.a implements X0.f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0295n f3356b = new C0295n(X0.e.f1155a, C0294m.f3353b);

    public AbstractC0296o() {
        super(X0.e.f1155a);
    }

    @Override // X0.a, X0.i
    public final X0.g j(X0.h hVar) {
        X0.g a2;
        g1.f.e(hVar, "key");
        if (!(hVar instanceof C0295n)) {
            if (X0.e.f1155a == hVar) {
                return this;
            }
            return null;
        }
        C0295n c0295n = (C0295n) hVar;
        X0.h hVar2 = this.f1150a;
        if ((hVar2 == c0295n || c0295n.f3355b == hVar2) && (a2 = c0295n.a(this)) != null) {
            return a2;
        }
        return null;
    }

    @Override // X0.a, X0.i
    public final X0.i p(X0.h hVar) {
        g1.f.e(hVar, "key");
        boolean z2 = hVar instanceof C0295n;
        X0.j jVar = X0.j.f1156a;
        if (z2) {
            C0295n c0295n = (C0295n) hVar;
            X0.h hVar2 = this.f1150a;
            if ((hVar2 == c0295n || c0295n.f3355b == hVar2) && c0295n.a(this) != null) {
                return jVar;
            }
        } else if (X0.e.f1155a == hVar) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0299s.d(this);
    }

    public abstract void y(X0.i iVar, Runnable runnable);

    public boolean z() {
        return !(this instanceof d0);
    }
}
