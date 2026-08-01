package r1;

import a1.AbstractC0063a;

/* renamed from: r1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0366p extends AbstractC0063a implements a1.f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0365o f4088b = new C0365o(a1.e.f1672a, C0364n.f4085b);

    public AbstractC0366p() {
        super(a1.e.f1672a);
    }

    public abstract void D(a1.i iVar, Runnable runnable);

    public boolean E() {
        return !(this instanceof e0);
    }

    @Override // a1.AbstractC0063a, a1.i
    public final a1.g d(a1.h hVar) {
        a1.g a2;
        j1.h.e(hVar, "key");
        if (!(hVar instanceof C0365o)) {
            if (a1.e.f1672a == hVar) {
                return this;
            }
            return null;
        }
        C0365o c0365o = (C0365o) hVar;
        a1.h hVar2 = this.f1666a;
        if ((hVar2 == c0365o || c0365o.f4087b == hVar2) && (a2 = c0365o.a(this)) != null) {
            return a2;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0369t.c(this);
    }

    @Override // a1.AbstractC0063a, a1.i
    public final a1.i z(a1.h hVar) {
        j1.h.e(hVar, "key");
        boolean z2 = hVar instanceof C0365o;
        a1.j jVar = a1.j.f1673a;
        if (z2) {
            C0365o c0365o = (C0365o) hVar;
            a1.h hVar2 = this.f1666a;
            if ((hVar2 == c0365o || c0365o.f4087b == hVar2) && c0365o.a(this) != null) {
                return jVar;
            }
        } else if (a1.e.f1672a == hVar) {
            return jVar;
        }
        return this;
    }
}
