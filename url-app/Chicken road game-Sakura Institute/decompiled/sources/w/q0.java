package w;

import D.C0129f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0982r;
import z2.C1412P;

/* loaded from: classes.dex */
public final class q0 implements InterfaceC0982r {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f11320a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11321b;

    /* renamed from: c, reason: collision with root package name */
    public final G0.F f11322c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f11323d;

    public q0(m0 m0Var, int i2, G0.F f4, Function0 function0) {
        this.f11320a = m0Var;
        this.f11321b = i2;
        this.f11322c = f4;
        this.f11323d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.a(this.f11320a, q0Var.f11320a) && this.f11321b == q0Var.f11321b && Intrinsics.a(this.f11322c, q0Var.f11322c) && Intrinsics.a(this.f11323d, q0Var.f11323d);
    }

    public final int hashCode() {
        return this.f11323d.hashCode() + ((this.f11322c.hashCode() + AbstractC0784j.c(this.f11321b, this.f11320a.hashCode() * 31, 31)) * 31);
    }

    @Override // p0.InterfaceC0982r
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        AbstractC0954O a4 = interfaceC0944E.a(M0.a.b(j4, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(a4.f9006e, M0.a.h(j4));
        t4 = interfaceC0947H.t(a4.f9005d, min, C1412P.c(), new C0129f(interfaceC0947H, this, a4, min, 6));
        return t4;
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f11320a + ", cursorOffset=" + this.f11321b + ", transformedText=" + this.f11322c + ", textLayoutResultProvider=" + this.f11323d + ')';
    }
}
