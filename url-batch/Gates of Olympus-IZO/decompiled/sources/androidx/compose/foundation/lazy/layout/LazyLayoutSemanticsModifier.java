package androidx.compose.foundation.lazy.layout;

import H2.AbstractC0080b;
import U.k;
import Z1.i;
import f2.InterfaceC0388c;
import o.J;
import t0.AbstractC0898f;
import t0.T;
import u.C0931M;
import u.InterfaceC0927I;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends T {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0388c f3648a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0927I f3649b;

    /* renamed from: c, reason: collision with root package name */
    public final J f3650c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3651d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3652e;

    public LazyLayoutSemanticsModifier(InterfaceC0388c interfaceC0388c, InterfaceC0927I interfaceC0927I, J j3, boolean z3, boolean z4) {
        this.f3648a = interfaceC0388c;
        this.f3649b = interfaceC0927I;
        this.f3650c = j3;
        this.f3651d = z3;
        this.f3652e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f3648a == lazyLayoutSemanticsModifier.f3648a && i.a(this.f3649b, lazyLayoutSemanticsModifier.f3649b) && this.f3650c == lazyLayoutSemanticsModifier.f3650c && this.f3651d == lazyLayoutSemanticsModifier.f3651d && this.f3652e == lazyLayoutSemanticsModifier.f3652e;
    }

    @Override // t0.T
    public final k h() {
        return new C0931M(this.f3648a, this.f3649b, this.f3650c, this.f3651d, this.f3652e);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3652e) + AbstractC0080b.f((this.f3650c.hashCode() + ((this.f3649b.hashCode() + (this.f3648a.hashCode() * 31)) * 31)) * 31, 31, this.f3651d);
    }

    @Override // t0.T
    public final void i(k kVar) {
        C0931M c0931m = (C0931M) kVar;
        c0931m.f8020q = this.f3648a;
        c0931m.f8021r = this.f3649b;
        J j3 = c0931m.f8022s;
        J j4 = this.f3650c;
        if (j3 != j4) {
            c0931m.f8022s = j4;
            AbstractC0898f.o(c0931m);
        }
        boolean z3 = c0931m.f8023t;
        boolean z4 = this.f3651d;
        boolean z5 = this.f3652e;
        if (z3 == z4 && c0931m.f8024u == z5) {
            return;
        }
        c0931m.f8023t = z4;
        c0931m.f8024u = z5;
        c0931m.v0();
        AbstractC0898f.o(c0931m);
    }
}
