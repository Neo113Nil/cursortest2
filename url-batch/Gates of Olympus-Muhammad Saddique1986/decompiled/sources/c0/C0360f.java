package c0;

import b0.C0352v;
import b0.M;
import java.util.Arrays;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360f extends C0361g {

    /* renamed from: e, reason: collision with root package name */
    public final C0371q f5495e;

    /* renamed from: f, reason: collision with root package name */
    public final C0371q f5496f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f5497g;

    public C0360f(C0371q c0371q, C0371q c0371q2, int i3) {
        super(c0371q2, c0371q, c0371q2, null);
        float[] h3;
        this.f5495e = c0371q;
        this.f5496f = c0371q2;
        C0373s c0373s = c0371q2.f5522d;
        C0373s c0373s2 = c0371q.f5522d;
        boolean d3 = AbstractC0364j.d(c0373s2, c0373s);
        float[] fArr = c0371q.f5527i;
        float[] fArr2 = c0371q2.f5528j;
        if (d3) {
            h3 = AbstractC0364j.h(fArr2, fArr);
        } else {
            float[] a3 = c0373s2.a();
            C0373s c0373s3 = c0371q2.f5522d;
            float[] a4 = c0373s3.a();
            C0373s c0373s4 = AbstractC0364j.f5504b;
            boolean d4 = AbstractC0364j.d(c0373s2, c0373s4);
            float[] fArr3 = AbstractC0364j.f5507e;
            float[] fArr4 = C0355a.f5464b.f5465a;
            if (!d4) {
                float[] copyOf = Arrays.copyOf(fArr3, 3);
                f2.j.e(copyOf, "copyOf(this, size)");
                fArr = AbstractC0364j.h(AbstractC0364j.c(fArr4, a3, copyOf), fArr);
            }
            if (!AbstractC0364j.d(c0373s3, c0373s4)) {
                float[] copyOf2 = Arrays.copyOf(fArr3, 3);
                f2.j.e(copyOf2, "copyOf(this, size)");
                fArr2 = AbstractC0364j.g(AbstractC0364j.h(AbstractC0364j.c(fArr4, a4, copyOf2), c0371q2.f5527i));
            }
            h3 = AbstractC0364j.h(fArr2, i3 == 3 ? AbstractC0364j.i(new float[]{a3[0] / a4[0], a3[1] / a4[1], a3[2] / a4[2]}, fArr) : fArr);
        }
        this.f5497g = h3;
    }

    @Override // c0.C0361g
    public final long a(long j3) {
        float h3 = C0352v.h(j3);
        float g3 = C0352v.g(j3);
        float e3 = C0352v.e(j3);
        float d3 = C0352v.d(j3);
        C0367m c0367m = this.f5495e.f5534p;
        float b3 = (float) c0367m.b(h3);
        float b4 = (float) c0367m.b(g3);
        float b5 = (float) c0367m.b(e3);
        float[] fArr = this.f5497g;
        float f3 = (fArr[6] * b5) + (fArr[3] * b4) + (fArr[0] * b3);
        float f4 = (fArr[7] * b5) + (fArr[4] * b4) + (fArr[1] * b3);
        float f5 = (fArr[8] * b5) + (fArr[5] * b4) + (fArr[2] * b3);
        C0371q c0371q = this.f5496f;
        float b6 = (float) c0371q.f5531m.b(f3);
        double d4 = f4;
        C0367m c0367m2 = c0371q.f5531m;
        return M.b(b6, (float) c0367m2.b(d4), (float) c0367m2.b(f5), d3, c0371q);
    }
}
