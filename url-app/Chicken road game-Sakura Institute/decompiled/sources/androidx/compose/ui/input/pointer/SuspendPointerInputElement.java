package androidx.compose.ui.input.pointer;

import l1.d0;
import q6.e;
import r1.s0;
import r6.k;
import s0.n;
import w.n0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f731a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f732b;

    /* renamed from: c, reason: collision with root package name */
    public final e f733c;

    public SuspendPointerInputElement(Object obj, n0 n0Var, e eVar, int i7) {
        n0Var = (i7 & 2) != 0 ? null : n0Var;
        this.f731a = obj;
        this.f732b = n0Var;
        this.f733c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return k.a(this.f731a, suspendPointerInputElement.f731a) && k.a(this.f732b, suspendPointerInputElement.f732b) && this.f733c == suspendPointerInputElement.f733c;
    }

    public final int hashCode() {
        Object obj = this.f731a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f732b;
        return this.f733c.hashCode() + ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // r1.s0
    public final n l() {
        return new d0(this.f731a, this.f732b, this.f733c);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        d0 d0Var = (d0) nVar;
        Object obj = d0Var.f5788s;
        Object obj2 = this.f731a;
        boolean z8 = !k.a(obj, obj2);
        d0Var.f5788s = obj2;
        Object obj3 = d0Var.f5789t;
        Object obj4 = this.f732b;
        boolean z9 = k.a(obj3, obj4) ? z8 : true;
        d0Var.f5789t = obj4;
        if (z9) {
            d0Var.C0();
        }
        d0Var.f5790u = this.f733c;
    }
}
