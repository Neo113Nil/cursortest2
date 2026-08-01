package androidx.lifecycle;

import r1.AbstractC0369t;

/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080o implements r, r1.r {

    /* renamed from: a, reason: collision with root package name */
    public final v f1941a;

    /* renamed from: b, reason: collision with root package name */
    public final a1.i f1942b;

    public C0080o(v vVar, a1.i iVar) {
        j1.h.e(iVar, "coroutineContext");
        this.f1941a = vVar;
        this.f1942b = iVar;
        if (vVar.f1949d == EnumC0078m.f1934a) {
            AbstractC0369t.a(iVar, null);
        }
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0077l enumC0077l) {
        v vVar = this.f1941a;
        if (vVar.f1949d.compareTo(EnumC0078m.f1934a) <= 0) {
            vVar.f(this);
            AbstractC0369t.a(this.f1942b, null);
        }
    }

    @Override // r1.r
    public final a1.i b() {
        return this.f1942b;
    }
}
