package w;

import O0.k;
import a.AbstractC0235a;
import a0.C0239d;
import a0.C0240e;
import a0.C0241f;
import b0.I;
import b0.J;
import b0.K;
import b0.Q;
import f2.j;

/* loaded from: classes.dex */
public final class d implements Q {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1170a f9835d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1170a f9836e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1170a f9837f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1170a f9838g;

    public d(InterfaceC1170a interfaceC1170a, InterfaceC1170a interfaceC1170a2, InterfaceC1170a interfaceC1170a3, InterfaceC1170a interfaceC1170a4) {
        this.f9835d = interfaceC1170a;
        this.f9836e = interfaceC1170a2;
        this.f9837f = interfaceC1170a3;
        this.f9838g = interfaceC1170a4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [w.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [w.a] */
    public static d a(d dVar, C1171b c1171b, C1171b c1171b2, C1171b c1171b3, int i3) {
        C1171b c1171b4 = c1171b;
        if ((i3 & 1) != 0) {
            c1171b4 = dVar.f9835d;
        }
        InterfaceC1170a interfaceC1170a = dVar.f9836e;
        C1171b c1171b5 = c1171b2;
        if ((i3 & 4) != 0) {
            c1171b5 = dVar.f9837f;
        }
        dVar.getClass();
        return new d(c1171b4, interfaceC1170a, c1171b5, c1171b3);
    }

    @Override // b0.Q
    public final K d(long j3, k kVar, O0.b bVar) {
        float a3 = this.f9835d.a(j3, bVar);
        float a4 = this.f9836e.a(j3, bVar);
        float a5 = this.f9837f.a(j3, bVar);
        float a6 = this.f9838g.a(j3, bVar);
        float c2 = C0241f.c(j3);
        float f3 = a3 + a6;
        if (f3 > c2) {
            float f4 = c2 / f3;
            a3 *= f4;
            a6 *= f4;
        }
        float f5 = a4 + a5;
        if (f5 > c2) {
            float f6 = c2 / f5;
            a4 *= f6;
            a5 *= f6;
        }
        if (a3 < 0.0f || a4 < 0.0f || a5 < 0.0f || a6 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a3 + ", topEnd = " + a4 + ", bottomEnd = " + a5 + ", bottomStart = " + a6 + ")!").toString());
        }
        if (a3 + a4 + a5 + a6 == 0.0f) {
            return new I(O2.d.g(0L, j3));
        }
        C0239d g3 = O2.d.g(0L, j3);
        k kVar2 = k.f3741d;
        float f7 = kVar == kVar2 ? a3 : a4;
        long b3 = AbstractC0235a.b(f7, f7);
        if (kVar == kVar2) {
            a3 = a4;
        }
        long b4 = AbstractC0235a.b(a3, a3);
        float f8 = kVar == kVar2 ? a5 : a6;
        long b5 = AbstractC0235a.b(f8, f8);
        if (kVar != kVar2) {
            a6 = a5;
        }
        return new J(new C0240e(g3.f4724a, g3.f4725b, g3.f4726c, g3.f4727d, b3, b4, b5, AbstractC0235a.b(a6, a6)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!j.a(this.f9835d, dVar.f9835d)) {
            return false;
        }
        if (!j.a(this.f9836e, dVar.f9836e)) {
            return false;
        }
        if (j.a(this.f9837f, dVar.f9837f)) {
            return j.a(this.f9838g, dVar.f9838g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9838g.hashCode() + ((this.f9837f.hashCode() + ((this.f9836e.hashCode() + (this.f9835d.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f9835d + ", topEnd = " + this.f9836e + ", bottomEnd = " + this.f9837f + ", bottomStart = " + this.f9838g + ')';
    }
}
