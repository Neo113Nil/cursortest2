package x;

import F.C0093f;
import e2.InterfaceC0422a;
import m.AbstractC0625j;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0921r;

/* loaded from: classes.dex */
public final class r0 implements InterfaceC0921r {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f10247a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10248b;

    /* renamed from: c, reason: collision with root package name */
    public final I0.G f10249c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0422a f10250d;

    public r0(n0 n0Var, int i3, I0.G g3, InterfaceC0422a interfaceC0422a) {
        this.f10247a = n0Var;
        this.f10248b = i3;
        this.f10249c = g3;
        this.f10250d = interfaceC0422a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return f2.j.a(this.f10247a, r0Var.f10247a) && this.f10248b == r0Var.f10248b && f2.j.a(this.f10249c, r0Var.f10249c) && f2.j.a(this.f10250d, r0Var.f10250d);
    }

    @Override // r0.InterfaceC0921r
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        AbstractC0893O b3 = interfaceC0884F.b(O0.a.a(j3, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(b3.f8127e, O0.a.g(j3));
        return interfaceC0887I.i0(b3.f8126d, min, S1.v.f4321d, new C0093f(interfaceC0887I, this, b3, min, 6));
    }

    public final int hashCode() {
        return this.f10250d.hashCode() + ((this.f10249c.hashCode() + AbstractC0625j.a(this.f10248b, this.f10247a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f10247a + ", cursorOffset=" + this.f10248b + ", transformedText=" + this.f10249c + ", textLayoutResultProvider=" + this.f10250d + ')';
    }
}
