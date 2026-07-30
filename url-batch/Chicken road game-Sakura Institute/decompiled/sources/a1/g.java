package a1;

import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final c f242a;

    /* renamed from: b, reason: collision with root package name */
    public final c f243b;

    /* renamed from: c, reason: collision with root package name */
    public final c f244c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f245d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f242a = cVar;
        this.f243b = cVar2;
        this.f244c = cVar3;
        this.f245d = fArr;
    }

    public long a(long j8) {
        float h3 = u.h(j8);
        float g9 = u.g(j8);
        float e9 = u.e(j8);
        float d8 = u.d(j8);
        c cVar = this.f243b;
        long d9 = cVar.d(h3, g9, e9);
        float intBitsToFloat = Float.intBitsToFloat((int) (d9 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d9 & 4294967295L));
        float e10 = cVar.e(h3, g9, e9);
        float[] fArr = this.f245d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e10 *= fArr[2];
        }
        float f9 = intBitsToFloat;
        float f10 = intBitsToFloat2;
        return this.f244c.f(f9, f10, e10, d8, this.f242a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(c cVar, c cVar2, int i7) {
        this(cVar2, r0, r1, r3);
        float[] fArr;
        long j8 = cVar.f216b;
        long j9 = b.f210a;
        c a3 = b.a(j8, j9) ? j.a(cVar) : cVar;
        c a9 = b.a(cVar2.f216b, j9) ? j.a(cVar2) : cVar2;
        if (i7 == 3) {
            boolean a10 = b.a(cVar.f216b, j9);
            boolean a11 = b.a(cVar2.f216b, j9);
            if ((!a10 || !a11) && (a10 || a11)) {
                s sVar = ((q) (a10 ? cVar : cVar2)).f266d;
                float[] fArr2 = j.f251e;
                float[] a12 = a10 ? sVar.a() : fArr2;
                fArr2 = a11 ? sVar.a() : fArr2;
                fArr = new float[]{a12[0] / fArr2[0], a12[1] / fArr2[1], a12[2] / fArr2[2]};
            }
        }
        fArr = null;
    }
}
