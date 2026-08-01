package d0;

import k1.a0;
import k1.f0;
import k1.v;
import k1.z;
import kotlin.jvm.internal.Intrinsics;
import x2.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f3277a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3278b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3279c;

    /* renamed from: d, reason: collision with root package name */
    public final a f3280d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f3277a = aVar;
        this.f3278b = aVar2;
        this.f3279c = aVar3;
        this.f3280d = aVar4;
    }

    public static d b(d dVar, a aVar, a aVar2, a aVar3, a aVar4, int i3) {
        if ((i3 & 1) != 0) {
            aVar = dVar.f3277a;
        }
        if ((i3 & 2) != 0) {
            aVar2 = dVar.f3278b;
        }
        if ((i3 & 4) != 0) {
            aVar3 = dVar.f3279c;
        }
        if ((i3 & 8) != 0) {
            aVar4 = dVar.f3280d;
        }
        dVar.getClass();
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    @Override // k1.f0
    public final v a(long j, l lVar, x2.c cVar) {
        float a9 = this.f3277a.a(j, cVar);
        float a10 = this.f3278b.a(j, cVar);
        float a11 = this.f3279c.a(j, cVar);
        float a12 = this.f3280d.a(j, cVar);
        float b10 = j1.e.b(j);
        float f3 = a9 + a12;
        if (f3 > b10) {
            float f10 = b10 / f3;
            a9 *= f10;
            a12 *= f10;
        }
        float f11 = a10 + a11;
        if (f11 > b10) {
            float f12 = b10 / f11;
            a10 *= f12;
            a11 *= f12;
        }
        if (a9 < 0.0f || a10 < 0.0f || a11 < 0.0f || a12 < 0.0f) {
            a0.a.a("Corner size in Px can't be negative(topStart = " + a9 + ", topEnd = " + a10 + ", bottomEnd = " + a11 + ", bottomStart = " + a12 + ")!");
        }
        if (a9 + a10 + a11 + a12 == 0.0f) {
            return new z(cf.c.k(0L, j));
        }
        j1.c k10 = cf.c.k(0L, j);
        l lVar2 = l.f10330d;
        float f13 = lVar == lVar2 ? a9 : a10;
        long floatToRawIntBits = (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
        if (lVar == lVar2) {
            a9 = a10;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a9) << 32) | (Float.floatToRawIntBits(a9) & 4294967295L);
        float f14 = lVar == lVar2 ? a11 : a12;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
        if (lVar != lVar2) {
            a12 = a11;
        }
        return new a0(new j1.d(k10.f4916a, k10.f4917b, k10.f4918c, k10.f4919d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a12) << 32) | (Float.floatToRawIntBits(a12) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f3277a, dVar.f3277a) && Intrinsics.a(this.f3278b, dVar.f3278b) && Intrinsics.a(this.f3279c, dVar.f3279c) && Intrinsics.a(this.f3280d, dVar.f3280d);
    }

    public final int hashCode() {
        return this.f3280d.hashCode() + ((this.f3279c.hashCode() + ((this.f3278b.hashCode() + (this.f3277a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f3277a + ", topEnd = " + this.f3278b + ", bottomEnd = " + this.f3279c + ", bottomStart = " + this.f3280d + ')';
    }
}
