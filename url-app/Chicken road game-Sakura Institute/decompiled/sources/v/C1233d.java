package v;

import M0.k;
import Y.f;
import Z.G;
import Z.H;
import Z.I;
import Z.P;
import kotlin.jvm.internal.Intrinsics;
import u3.l;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1233d implements P {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1230a f10968d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1230a f10969e;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1230a f10970i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC1230a f10971j;

    public C1233d(InterfaceC1230a interfaceC1230a, InterfaceC1230a interfaceC1230a2, InterfaceC1230a interfaceC1230a3, InterfaceC1230a interfaceC1230a4) {
        this.f10968d = interfaceC1230a;
        this.f10969e = interfaceC1230a2;
        this.f10970i = interfaceC1230a3;
        this.f10971j = interfaceC1230a4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [v.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [v.a] */
    public static C1233d b(C1233d c1233d, C1231b c1231b, C1231b c1231b2, C1231b c1231b3, int i2) {
        C1231b c1231b4 = c1231b;
        if ((i2 & 1) != 0) {
            c1231b4 = c1233d.f10968d;
        }
        InterfaceC1230a interfaceC1230a = c1233d.f10969e;
        C1231b c1231b5 = c1231b2;
        if ((i2 & 4) != 0) {
            c1231b5 = c1233d.f10970i;
        }
        c1233d.getClass();
        return new C1233d(c1231b4, interfaceC1230a, c1231b5, c1231b3);
    }

    @Override // Z.P
    public final I a(long j4, k kVar, M0.b bVar) {
        float a4 = this.f10968d.a(j4, bVar);
        float a5 = this.f10969e.a(j4, bVar);
        float a6 = this.f10970i.a(j4, bVar);
        float a7 = this.f10971j.a(j4, bVar);
        float c4 = f.c(j4);
        float f4 = a4 + a7;
        if (f4 > c4) {
            float f5 = c4 / f4;
            a4 *= f5;
            a7 *= f5;
        }
        float f6 = a5 + a6;
        if (f6 > c4) {
            float f7 = c4 / f6;
            a5 *= f7;
            a6 *= f7;
        }
        if (a4 < 0.0f || a5 < 0.0f || a6 < 0.0f || a7 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a4 + ", topEnd = " + a5 + ", bottomEnd = " + a6 + ", bottomStart = " + a7 + ")!").toString());
        }
        if (a4 + a5 + a6 + a7 == 0.0f) {
            return new G(j0.c.h(0L, j4));
        }
        Y.d h4 = j0.c.h(0L, j4);
        k kVar2 = k.f3555d;
        float f8 = kVar == kVar2 ? a4 : a5;
        long I3 = l.I(f8, f8);
        if (kVar == kVar2) {
            a4 = a5;
        }
        long I4 = l.I(a4, a4);
        float f9 = kVar == kVar2 ? a6 : a7;
        long I5 = l.I(f9, f9);
        if (kVar != kVar2) {
            a7 = a6;
        }
        return new H(new Y.e(h4.f4374a, h4.f4375b, h4.f4376c, h4.f4377d, I3, I4, I5, l.I(a7, a7)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1233d)) {
            return false;
        }
        C1233d c1233d = (C1233d) obj;
        if (!Intrinsics.a(this.f10968d, c1233d.f10968d)) {
            return false;
        }
        if (!Intrinsics.a(this.f10969e, c1233d.f10969e)) {
            return false;
        }
        if (Intrinsics.a(this.f10970i, c1233d.f10970i)) {
            return Intrinsics.a(this.f10971j, c1233d.f10971j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10971j.hashCode() + ((this.f10970i.hashCode() + ((this.f10969e.hashCode() + (this.f10968d.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f10968d + ", topEnd = " + this.f10969e + ", bottomEnd = " + this.f10970i + ", bottomStart = " + this.f10971j + ')';
    }
}
