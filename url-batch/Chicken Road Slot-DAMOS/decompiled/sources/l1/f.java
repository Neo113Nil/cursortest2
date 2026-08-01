package l1;

import k1.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final q f5781e;

    /* renamed from: f, reason: collision with root package name */
    public final q f5782f;
    public final float[] g;

    public f(q qVar, q qVar2) {
        super(qVar2, qVar, qVar2, null);
        float[] g;
        this.f5781e = qVar;
        this.f5782f = qVar2;
        float[] fArr = a.f5748b.f5749a;
        s sVar = qVar.f5806d;
        float[] fArr2 = qVar.f5810i;
        s sVar2 = qVar2.f5806d;
        float[] fArr3 = qVar2.j;
        if (j.d(sVar, sVar2)) {
            g = j.g(fArr3, fArr2);
        } else {
            float[] a9 = sVar.a();
            float[] a10 = sVar2.a();
            s sVar3 = j.f5789b;
            g = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, a10, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f5810i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, a9, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = g;
    }

    @Override // l1.g
    public final long a(long j) {
        float g = k1.p.g(j);
        float f3 = k1.p.f(j);
        float e2 = k1.p.e(j);
        float d10 = k1.p.d(j);
        m mVar = this.f5781e.f5816p;
        float a9 = (float) mVar.a(g);
        float a10 = (float) mVar.a(f3);
        float a11 = (float) mVar.a(e2);
        float[] fArr = this.g;
        float f10 = (fArr[6] * a11) + (fArr[3] * a10) + (fArr[0] * a9);
        float f11 = (fArr[7] * a11) + (fArr[4] * a10) + (fArr[1] * a9);
        float f12 = (fArr[8] * a11) + (fArr[5] * a10) + (fArr[2] * a9);
        q qVar = this.f5782f;
        float a12 = (float) qVar.f5813m.a(f10);
        m mVar2 = qVar.f5813m;
        return v.a(a12, (float) mVar2.a(f11), (float) mVar2.a(f12), d10, qVar);
    }
}
