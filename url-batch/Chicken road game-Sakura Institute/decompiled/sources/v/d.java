package v;

import r6.k;
import u3.t;
import v1.g;
import y0.f;
import z0.h0;
import z0.i0;
import z0.j0;
import z0.p0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements p0 {

    /* renamed from: f, reason: collision with root package name */
    public final a f9093f;

    /* renamed from: g, reason: collision with root package name */
    public final a f9094g;

    /* renamed from: h, reason: collision with root package name */
    public final a f9095h;

    /* renamed from: i, reason: collision with root package name */
    public final a f9096i;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f9093f = aVar;
        this.f9094g = aVar2;
        this.f9095h = aVar3;
        this.f9096i = aVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [v.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [v.a] */
    public static d a(d dVar, b bVar, b bVar2, b bVar3, int i7) {
        b bVar4 = bVar;
        if ((i7 & 1) != 0) {
            bVar4 = dVar.f9093f;
        }
        a aVar = dVar.f9094g;
        b bVar5 = bVar2;
        if ((i7 & 4) != 0) {
            bVar5 = dVar.f9095h;
        }
        dVar.getClass();
        return new d(bVar4, aVar, bVar5, bVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.a(this.f9093f, dVar.f9093f) && k.a(this.f9094g, dVar.f9094g) && k.a(this.f9095h, dVar.f9095h) && k.a(this.f9096i, dVar.f9096i);
    }

    @Override // z0.p0
    public final j0 g(long j8, m2.k kVar, m2.b bVar) {
        float a3 = this.f9093f.a(j8, bVar);
        float a9 = this.f9094g.a(j8, bVar);
        float a10 = this.f9095h.a(j8, bVar);
        float a11 = this.f9096i.a(j8, bVar);
        float c4 = f.c(j8);
        float f9 = a3 + a11;
        if (f9 > c4) {
            float f10 = c4 / f9;
            a3 *= f10;
            a11 *= f10;
        }
        float f11 = a9 + a10;
        if (f11 > c4) {
            float f12 = c4 / f11;
            a9 *= f12;
            a10 *= f12;
        }
        if (a3 < 0.0f || a9 < 0.0f || a10 < 0.0f || a11 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a3 + ", topEnd = " + a9 + ", bottomEnd = " + a10 + ", bottomStart = " + a11 + ")!").toString());
        }
        if (a3 + a9 + a10 + a11 == 0.0f) {
            return new h0(t.a(0L, j8));
        }
        y0.d a12 = t.a(0L, j8);
        m2.k kVar2 = m2.k.f6322f;
        float f13 = kVar == kVar2 ? a3 : a9;
        long a13 = g.a(f13, f13);
        if (kVar == kVar2) {
            a3 = a9;
        }
        long a14 = g.a(a3, a3);
        float f14 = kVar == kVar2 ? a10 : a11;
        long a15 = g.a(f14, f14);
        if (kVar != kVar2) {
            a11 = a10;
        }
        return new i0(new y0.e(a12.f9780a, a12.f9781b, a12.f9782c, a12.f9783d, a13, a14, a15, g.a(a11, a11)));
    }

    public final int hashCode() {
        return this.f9096i.hashCode() + ((this.f9095h.hashCode() + ((this.f9094g.hashCode() + (this.f9093f.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f9093f + ", topEnd = " + this.f9094g + ", bottomEnd = " + this.f9095h + ", bottomStart = " + this.f9096i + ')';
    }
}
