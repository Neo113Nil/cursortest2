package c0;

import b0.AbstractC0259J;
import b0.C0288u;
import java.util.Arrays;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303f extends C0304g {

    /* renamed from: e, reason: collision with root package name */
    public final C0314q f4369e;

    /* renamed from: f, reason: collision with root package name */
    public final C0314q f4370f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f4371g;

    public C0303f(C0314q c0314q, C0314q c0314q2, int i3) {
        super(c0314q2, c0314q, c0314q2, null);
        float[] h3;
        this.f4369e = c0314q;
        this.f4370f = c0314q2;
        C0316s c0316s = c0314q2.f4396d;
        C0316s c0316s2 = c0314q.f4396d;
        boolean d3 = AbstractC0307j.d(c0316s2, c0316s);
        float[] fArr = c0314q.f4401i;
        float[] fArr2 = c0314q2.f4402j;
        if (d3) {
            h3 = AbstractC0307j.h(fArr2, fArr);
        } else {
            float[] a3 = c0316s2.a();
            C0316s c0316s3 = c0314q2.f4396d;
            float[] a4 = c0316s3.a();
            C0316s c0316s4 = AbstractC0307j.f4378b;
            boolean d4 = AbstractC0307j.d(c0316s2, c0316s4);
            float[] fArr3 = AbstractC0307j.f4381e;
            float[] fArr4 = C0298a.f4339b.f4340a;
            if (!d4) {
                float[] copyOf = Arrays.copyOf(fArr3, 3);
                Z1.i.e(copyOf, "copyOf(this, size)");
                fArr = AbstractC0307j.h(AbstractC0307j.c(fArr4, a3, copyOf), fArr);
            }
            if (!AbstractC0307j.d(c0316s3, c0316s4)) {
                float[] copyOf2 = Arrays.copyOf(fArr3, 3);
                Z1.i.e(copyOf2, "copyOf(this, size)");
                fArr2 = AbstractC0307j.g(AbstractC0307j.h(AbstractC0307j.c(fArr4, a4, copyOf2), c0314q2.f4401i));
            }
            h3 = AbstractC0307j.h(fArr2, i3 == 3 ? AbstractC0307j.i(new float[]{a3[0] / a4[0], a3[1] / a4[1], a3[2] / a4[2]}, fArr) : fArr);
        }
        this.f4371g = h3;
    }

    @Override // c0.C0304g
    public final long a(long j3) {
        float h3 = C0288u.h(j3);
        float g3 = C0288u.g(j3);
        float e3 = C0288u.e(j3);
        float d3 = C0288u.d(j3);
        C0310m c0310m = this.f4369e.p;
        float b2 = (float) c0310m.b(h3);
        float b3 = (float) c0310m.b(g3);
        float b4 = (float) c0310m.b(e3);
        float[] fArr = this.f4371g;
        float f3 = (fArr[6] * b4) + (fArr[3] * b3) + (fArr[0] * b2);
        float f4 = (fArr[7] * b4) + (fArr[4] * b3) + (fArr[1] * b2);
        float f5 = (fArr[8] * b4) + (fArr[5] * b3) + (fArr[2] * b2);
        C0314q c0314q = this.f4370f;
        float b5 = (float) c0314q.f4405m.b(f3);
        double d4 = f4;
        C0310m c0310m2 = c0314q.f4405m;
        return AbstractC0259J.a(b5, (float) c0310m2.b(d4), (float) c0310m2.b(f5), d3, c0314q);
    }
}
