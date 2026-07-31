package d0;

import f1.d0;
import f1.e0;
import f1.i0;
import f1.p;
import q6.i;
import r2.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f2048a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2049b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2050c;

    /* renamed from: d, reason: collision with root package name */
    public final a f2051d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f2048a = aVar;
        this.f2049b = aVar2;
        this.f2050c = aVar3;
        this.f2051d = aVar4;
    }

    public static d b(d dVar, a aVar, a aVar2, a aVar3, a aVar4, int i) {
        if ((i & 1) != 0) {
            aVar = dVar.f2048a;
        }
        if ((i & 2) != 0) {
            aVar2 = dVar.f2049b;
        }
        if ((i & 4) != 0) {
            aVar3 = dVar.f2050c;
        }
        if ((i & 8) != 0) {
            aVar4 = dVar.f2051d;
        }
        dVar.getClass();
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    @Override // f1.i0
    public final p a(long j7, l lVar, r2.c cVar) {
        float a8 = this.f2048a.a(j7, cVar);
        float a9 = this.f2049b.a(j7, cVar);
        float a10 = this.f2050c.a(j7, cVar);
        float a11 = this.f2051d.a(j7, cVar);
        float b8 = e1.e.b(j7);
        float f6 = a8 + a11;
        if (f6 > b8) {
            float f8 = b8 / f6;
            a8 *= f8;
            a11 *= f8;
        }
        float f9 = a9 + a10;
        if (f9 > b8) {
            float f10 = b8 / f9;
            a9 *= f10;
            a10 *= f10;
        }
        if (a8 < 0.0f || a9 < 0.0f || a10 < 0.0f || a11 < 0.0f) {
            w.a.a("Corner size in Px can't be negative(topStart = " + a8 + ", topEnd = " + a9 + ", bottomEnd = " + a10 + ", bottomStart = " + a11 + ")!");
        }
        if (a8 + a9 + a10 + a11 == 0.0f) {
            return new d0(a.a.b(0L, j7));
        }
        e1.c b9 = a.a.b(0L, j7);
        l lVar2 = l.f6529d;
        float f11 = lVar == lVar2 ? a8 : a9;
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
        if (lVar == lVar2) {
            a8 = a9;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a8) << 32) | (Float.floatToRawIntBits(a8) & 4294967295L);
        float f12 = lVar == lVar2 ? a10 : a11;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
        if (lVar != lVar2) {
            a11 = a10;
        }
        return new e0(new e1.d(b9.f2457a, b9.f2458b, b9.f2459c, b9.f2460d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a11) << 32) | (Float.floatToRawIntBits(a11) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.f2048a, dVar.f2048a) && i.a(this.f2049b, dVar.f2049b) && i.a(this.f2050c, dVar.f2050c) && i.a(this.f2051d, dVar.f2051d);
    }

    public final int hashCode() {
        return this.f2051d.hashCode() + ((this.f2050c.hashCode() + ((this.f2049b.hashCode() + (this.f2048a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f2048a + ", topEnd = " + this.f2049b + ", bottomEnd = " + this.f2050c + ", bottomStart = " + this.f2051d + ')';
    }
}
