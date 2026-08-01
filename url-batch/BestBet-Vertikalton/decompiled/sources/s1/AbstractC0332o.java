package s1;

import b1.AbstractC0081a;

/* renamed from: s1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0332o extends AbstractC0081a implements b1.f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0331n f4059b = new C0331n(b1.e.f2046a, C0330m.f4056b);

    public AbstractC0332o() {
        super(b1.e.f2046a);
    }

    @Override // b1.AbstractC0081a, b1.j
    public final b1.j d(b1.i iVar) {
        k1.e.e(iVar, "key");
        boolean z2 = iVar instanceof C0331n;
        b1.k kVar = b1.k.f2050a;
        if (z2) {
            C0331n c0331n = (C0331n) iVar;
            b1.i iVar2 = this.f2041a;
            if ((iVar2 == c0331n || c0331n.f4058b == iVar2) && c0331n.a(this) != null) {
                return kVar;
            }
        } else if (b1.e.f2046a == iVar) {
            return kVar;
        }
        return this;
    }

    @Override // b1.AbstractC0081a, b1.j
    public final b1.h p(b1.i iVar) {
        b1.h a2;
        k1.e.e(iVar, "key");
        if (!(iVar instanceof C0331n)) {
            if (b1.e.f2046a == iVar) {
                return this;
            }
            return null;
        }
        C0331n c0331n = (C0331n) iVar;
        b1.i iVar2 = this.f2041a;
        if ((iVar2 == c0331n || c0331n.f4058b == iVar2) && (a2 = c0331n.a(this)) != null) {
            return a2;
        }
        return null;
    }

    public abstract void r(b1.j jVar, Runnable runnable);

    public boolean s() {
        return !(this instanceof d0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0335s.c(this);
    }
}
