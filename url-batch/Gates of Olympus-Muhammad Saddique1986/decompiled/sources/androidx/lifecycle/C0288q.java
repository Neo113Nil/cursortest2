package androidx.lifecycle;

import q2.C0832t;
import q2.InterfaceC0835w;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288q implements InterfaceC0290t, InterfaceC0835w {

    /* renamed from: d, reason: collision with root package name */
    public final C0294x f5234d;

    /* renamed from: e, reason: collision with root package name */
    public final V1.i f5235e;

    public C0288q(C0294x c0294x, V1.i iVar) {
        q2.X x3;
        f2.j.f(iVar, "coroutineContext");
        this.f5234d = c0294x;
        this.f5235e = iVar;
        if (c0294x.f5242d != EnumC0286o.f5226d || (x3 = (q2.X) iVar.v(C0832t.f7929e)) == null) {
            return;
        }
        x3.a(null);
    }

    @Override // androidx.lifecycle.InterfaceC0290t
    public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
        C0294x c0294x = this.f5234d;
        if (c0294x.f5242d.compareTo(EnumC0286o.f5226d) <= 0) {
            c0294x.f(this);
            q2.X x3 = (q2.X) this.f5235e.v(C0832t.f7929e);
            if (x3 != null) {
                x3.a(null);
            }
        }
    }

    @Override // q2.InterfaceC0835w
    public final V1.i q() {
        return this.f5235e;
    }
}
