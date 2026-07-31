package g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final q f2845e;

    /* renamed from: f, reason: collision with root package name */
    public final q f2846f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f2847g;

    public f(q qVar, q qVar2) {
        super(qVar2, qVar, qVar2, null);
        float[] g3;
        this.f2845e = qVar;
        this.f2846f = qVar2;
        float[] fArr = a.f2811b.f2812a;
        s sVar = qVar.f2872d;
        float[] fArr2 = qVar.i;
        s sVar2 = qVar2.f2872d;
        float[] fArr3 = qVar2.f2877j;
        if (j.d(sVar, sVar2)) {
            g3 = j.g(fArr3, fArr2);
        } else {
            float[] a8 = sVar.a();
            float[] a9 = sVar2.a();
            s sVar3 = j.f2854b;
            g3 = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, a9, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, a8, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f2847g = g3;
    }

    @Override // g1.g
    public final long a(long j7) {
        float h8 = f1.s.h(j7);
        float g3 = f1.s.g(j7);
        float e8 = f1.s.e(j7);
        float d8 = f1.s.d(j7);
        m mVar = this.f2845e.f2883p;
        float b8 = (float) mVar.b(h8);
        float b9 = (float) mVar.b(g3);
        float b10 = (float) mVar.b(e8);
        float[] fArr = this.f2847g;
        float f6 = (fArr[6] * b10) + (fArr[3] * b9) + (fArr[0] * b8);
        float f8 = (fArr[7] * b10) + (fArr[4] * b9) + (fArr[1] * b8);
        float f9 = (fArr[8] * b10) + (fArr[5] * b9) + (fArr[2] * b8);
        q qVar = this.f2846f;
        float b11 = (float) qVar.f2880m.b(f6);
        m mVar2 = qVar.f2880m;
        return f1.p.a(b11, (float) mVar2.b(f8), (float) mVar2.b(f9), d8, qVar);
    }
}
