package androidx.lifecycle;

import s1.AbstractC0335s;
import s1.InterfaceC0334q;

/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074o implements r, InterfaceC0334q {

    /* renamed from: a, reason: collision with root package name */
    public final v f1891a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.j f1892b;

    public C0074o(v vVar, b1.j jVar) {
        k1.e.e(jVar, "coroutineContext");
        this.f1891a = vVar;
        this.f1892b = jVar;
        if (vVar.d == EnumC0072m.f1884a) {
            AbstractC0335s.a(jVar, null);
        }
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0071l enumC0071l) {
        v vVar = this.f1891a;
        if (vVar.d.compareTo(EnumC0072m.f1884a) <= 0) {
            vVar.f(this);
            AbstractC0335s.a(this.f1892b, null);
        }
    }

    @Override // s1.InterfaceC0334q
    public final b1.j c() {
        return this.f1892b;
    }
}
