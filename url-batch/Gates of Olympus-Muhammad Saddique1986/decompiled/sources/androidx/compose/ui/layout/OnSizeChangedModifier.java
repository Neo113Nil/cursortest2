package androidx.compose.ui.layout;

import O2.d;
import U.p;
import e2.InterfaceC0424c;
import r0.C0890L;
import t0.U;

/* loaded from: classes.dex */
final class OnSizeChangedModifier extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f4936a;

    public OnSizeChangedModifier(InterfaceC0424c interfaceC0424c) {
        this.f4936a = interfaceC0424c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f4936a == ((OnSizeChangedModifier) obj).f4936a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4936a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        C0890L c0890l = new C0890L();
        c0890l.f8122q = this.f4936a;
        c0890l.f8123r = d.d(Integer.MIN_VALUE, Integer.MIN_VALUE);
        return c0890l;
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0890L c0890l = (C0890L) pVar;
        c0890l.f8122q = this.f4936a;
        c0890l.f8123r = d.d(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
