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

/* renamed from: w.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259H implements InterfaceC0982r {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f11030a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11031b;

    /* renamed from: c, reason: collision with root package name */
    public final G0.F f11032c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f11033d;

    public C1259H(m0 m0Var, int i2, G0.F f4, Function0 function0) {
        this.f11030a = m0Var;
        this.f11031b = i2;
        this.f11032c = f4;
        this.f11033d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1259H)) {
            return false;
        }
        C1259H c1259h = (C1259H) obj;
        return Intrinsics.a(this.f11030a, c1259h.f11030a) && this.f11031b == c1259h.f11031b && Intrinsics.a(this.f11032c, c1259h.f11032c) && Intrinsics.a(this.f11033d, c1259h.f11033d);
    }

    public final int hashCode() {
        return this.f11033d.hashCode() + ((this.f11032c.hashCode() + AbstractC0784j.c(this.f11031b, this.f11030a.hashCode() * 31, 31)) * 31);
    }

    @Override // p0.InterfaceC0982r
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        AbstractC0954O a4 = interfaceC0944E.a(interfaceC0944E.X(M0.a.h(j4)) < M0.a.i(j4) ? j4 : M0.a.b(j4, 0, Integer.MAX_VALUE, 0, 0, 13));
        int min = Math.min(a4.f9005d, M0.a.i(j4));
        t4 = interfaceC0947H.t(min, a4.f9006e, C1412P.c(), new C0129f(interfaceC0947H, this, a4, min, 5));
        return t4;
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f11030a + ", cursorOffset=" + this.f11031b + ", transformedText=" + this.f11032c + ", textLayoutResultProvider=" + this.f11033d + ')';
    }
}
