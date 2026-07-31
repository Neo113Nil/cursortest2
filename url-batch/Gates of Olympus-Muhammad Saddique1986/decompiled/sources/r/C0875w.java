package r;

import e2.InterfaceC0424c;
import s0.InterfaceC0957c;
import s0.InterfaceC0961g;

/* renamed from: r.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0875w implements InterfaceC0957c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f8091a;

    /* renamed from: b, reason: collision with root package name */
    public X f8092b;

    public C0875w(InterfaceC0424c interfaceC0424c) {
        this.f8091a = interfaceC0424c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0875w) && ((C0875w) obj).f8091a == this.f8091a;
    }

    public final int hashCode() {
        return this.f8091a.hashCode();
    }

    @Override // s0.InterfaceC0957c
    public final void j(InterfaceC0961g interfaceC0961g) {
        X x3 = (X) interfaceC0961g.i(a0.f8028a);
        if (f2.j.a(x3, this.f8092b)) {
            return;
        }
        this.f8092b = x3;
        this.f8091a.n(x3);
    }
}
