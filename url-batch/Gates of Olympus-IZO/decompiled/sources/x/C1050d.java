package x;

import M0.j;
import M1.B;
import Z1.i;
import a.AbstractC0157a;
import a0.f;
import b0.AbstractC0257H;
import b0.C0255F;
import b0.C0256G;
import b0.InterfaceC0263N;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050d implements InterfaceC0263N {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1047a f8712d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1047a f8713e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1047a f8714f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1047a f8715g;

    public C1050d(InterfaceC1047a interfaceC1047a, InterfaceC1047a interfaceC1047a2, InterfaceC1047a interfaceC1047a3, InterfaceC1047a interfaceC1047a4) {
        this.f8712d = interfaceC1047a;
        this.f8713e = interfaceC1047a2;
        this.f8714f = interfaceC1047a3;
        this.f8715g = interfaceC1047a4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [x.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [x.a] */
    public static C1050d b(C1050d c1050d, C1048b c1048b, C1048b c1048b2, C1048b c1048b3, int i3) {
        C1048b c1048b4 = c1048b;
        if ((i3 & 1) != 0) {
            c1048b4 = c1050d.f8712d;
        }
        InterfaceC1047a interfaceC1047a = c1050d.f8713e;
        C1048b c1048b5 = c1048b2;
        if ((i3 & 4) != 0) {
            c1048b5 = c1050d.f8714f;
        }
        c1050d.getClass();
        return new C1050d(c1048b4, interfaceC1047a, c1048b5, c1048b3);
    }

    @Override // b0.InterfaceC0263N
    public final AbstractC0257H a(long j3, j jVar, M0.b bVar) {
        float a3 = this.f8712d.a(j3, bVar);
        float a4 = this.f8713e.a(j3, bVar);
        float a5 = this.f8714f.a(j3, bVar);
        float a6 = this.f8715g.a(j3, bVar);
        float c3 = f.c(j3);
        float f3 = a3 + a6;
        if (f3 > c3) {
            float f4 = c3 / f3;
            a3 *= f4;
            a6 *= f4;
        }
        float f5 = a4 + a5;
        if (f5 > c3) {
            float f6 = c3 / f5;
            a4 *= f6;
            a5 *= f6;
        }
        if (a3 < 0.0f || a4 < 0.0f || a5 < 0.0f || a6 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a3 + ", topEnd = " + a4 + ", bottomEnd = " + a5 + ", bottomStart = " + a6 + ")!").toString());
        }
        if (a3 + a4 + a5 + a6 == 0.0f) {
            return new C0255F(AbstractC0157a.f(0L, j3));
        }
        a0.d f7 = AbstractC0157a.f(0L, j3);
        j jVar2 = j.f2775d;
        float f8 = jVar == jVar2 ? a3 : a4;
        long a7 = B.a(f8, f8);
        if (jVar == jVar2) {
            a3 = a4;
        }
        long a8 = B.a(a3, a3);
        float f9 = jVar == jVar2 ? a5 : a6;
        long a9 = B.a(f9, f9);
        if (jVar != jVar2) {
            a6 = a5;
        }
        return new C0256G(new a0.e(f7.f3491a, f7.f3492b, f7.f3493c, f7.f3494d, a7, a8, a9, B.a(a6, a6)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1050d)) {
            return false;
        }
        C1050d c1050d = (C1050d) obj;
        if (!i.a(this.f8712d, c1050d.f8712d)) {
            return false;
        }
        if (!i.a(this.f8713e, c1050d.f8713e)) {
            return false;
        }
        if (i.a(this.f8714f, c1050d.f8714f)) {
            return i.a(this.f8715g, c1050d.f8715g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8715g.hashCode() + ((this.f8714f.hashCode() + ((this.f8713e.hashCode() + (this.f8712d.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f8712d + ", topEnd = " + this.f8713e + ", bottomEnd = " + this.f8714f + ", bottomStart = " + this.f8715g + ')';
    }
}
