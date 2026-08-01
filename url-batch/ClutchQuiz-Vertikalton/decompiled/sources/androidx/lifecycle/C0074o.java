package androidx.lifecycle;

import o1.AbstractC0299s;
import o1.InterfaceC0298q;

/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074o implements r, InterfaceC0298q {

    /* renamed from: a, reason: collision with root package name */
    public final v f1510a;

    /* renamed from: b, reason: collision with root package name */
    public final X0.i f1511b;

    public C0074o(v vVar, X0.i iVar) {
        g1.f.e(iVar, "coroutineContext");
        this.f1510a = vVar;
        this.f1511b = iVar;
        if (vVar.d == EnumC0072m.f1503a) {
            AbstractC0299s.a(iVar, null);
        }
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0071l enumC0071l) {
        v vVar = this.f1510a;
        if (vVar.d.compareTo(EnumC0072m.f1503a) <= 0) {
            vVar.f(this);
            AbstractC0299s.a(this.f1511b, null);
        }
    }

    @Override // o1.InterfaceC0298q
    public final X0.i c() {
        return this.f1511b;
    }
}
