package androidx.compose.ui.draw;

import U.p;
import Y.b;
import Y.c;
import e2.InterfaceC0424c;
import f2.j;
import t0.U;

/* loaded from: classes.dex */
final class DrawWithCacheElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f4883a;

    public DrawWithCacheElement(InterfaceC0424c interfaceC0424c) {
        this.f4883a = interfaceC0424c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && j.a(this.f4883a, ((DrawWithCacheElement) obj).f4883a);
    }

    public final int hashCode() {
        return this.f4883a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        return new b(new c(), this.f4883a);
    }

    @Override // t0.U
    public final void m(p pVar) {
        b bVar = (b) pVar;
        bVar.f4650s = this.f4883a;
        bVar.y0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f4883a + ')';
    }
}
