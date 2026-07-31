package r;

import s0.InterfaceC0886c;

/* renamed from: r.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825w implements InterfaceC0886c {

    /* renamed from: a, reason: collision with root package name */
    public final Y1.c f7102a;

    /* renamed from: b, reason: collision with root package name */
    public U f7103b;

    public C0825w(Y1.c cVar) {
        this.f7102a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0825w) && ((C0825w) obj).f7102a == this.f7102a;
    }

    @Override // s0.InterfaceC0886c
    public final void f(s0.g gVar) {
        U u3 = (U) gVar.e(X.f7049a);
        if (Z1.i.a(u3, this.f7103b)) {
            return;
        }
        this.f7103b = u3;
        this.f7102a.j(u3);
    }

    public final int hashCode() {
        return this.f7102a.hashCode();
    }
}
