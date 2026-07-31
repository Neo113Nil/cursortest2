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
public final class H implements InterfaceC0921r {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f9951a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9952b;

    /* renamed from: c, reason: collision with root package name */
    public final I0.G f9953c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0422a f9954d;

    public H(n0 n0Var, int i3, I0.G g3, InterfaceC0422a interfaceC0422a) {
        this.f9951a = n0Var;
        this.f9952b = i3;
        this.f9953c = g3;
        this.f9954d = interfaceC0422a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h3 = (H) obj;
        return f2.j.a(this.f9951a, h3.f9951a) && this.f9952b == h3.f9952b && f2.j.a(this.f9953c, h3.f9953c) && f2.j.a(this.f9954d, h3.f9954d);
    }

    @Override // r0.InterfaceC0921r
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        AbstractC0893O b3 = interfaceC0884F.b(interfaceC0884F.U(O0.a.g(j3)) < O0.a.h(j3) ? j3 : O0.a.a(j3, 0, Integer.MAX_VALUE, 0, 0, 13));
        int min = Math.min(b3.f8126d, O0.a.h(j3));
        return interfaceC0887I.i0(min, b3.f8127e, S1.v.f4321d, new C0093f(interfaceC0887I, this, b3, min, 5));
    }

    public final int hashCode() {
        return this.f9954d.hashCode() + ((this.f9953c.hashCode() + AbstractC0625j.a(this.f9952b, this.f9951a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f9951a + ", cursorOffset=" + this.f9952b + ", transformedText=" + this.f9953c + ", textLayoutResultProvider=" + this.f9954d + ')';
    }
}
