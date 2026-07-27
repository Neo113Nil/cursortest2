package a0;

import Z.C0323u;
import Z.K;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351f extends C0352g {

    /* renamed from: e, reason: collision with root package name */
    public final C0362q f4782e;

    /* renamed from: f, reason: collision with root package name */
    public final C0362q f4783f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f4784g;

    public C0351f(C0362q c0362q, C0362q c0362q2, int i2) {
        super(c0362q2, c0362q, c0362q2, null);
        float[] h4;
        this.f4782e = c0362q;
        this.f4783f = c0362q2;
        C0364s c0364s = c0362q2.f4809d;
        C0364s c0364s2 = c0362q.f4809d;
        boolean d4 = AbstractC0355j.d(c0364s2, c0364s);
        float[] fArr = c0362q.f4814i;
        float[] fArr2 = c0362q2.f4815j;
        if (d4) {
            h4 = AbstractC0355j.h(fArr2, fArr);
        } else {
            float[] a4 = c0364s2.a();
            C0364s c0364s3 = c0362q2.f4809d;
            float[] a5 = c0364s3.a();
            C0364s c0364s4 = AbstractC0355j.f4791b;
            boolean d5 = AbstractC0355j.d(c0364s2, c0364s4);
            float[] fArr3 = AbstractC0355j.f4794e;
            float[] fArr4 = C0346a.f4751b.f4752a;
            if (!d5) {
                float[] copyOf = Arrays.copyOf(fArr3, 3);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                fArr = AbstractC0355j.h(AbstractC0355j.c(fArr4, a4, copyOf), fArr);
            }
            if (!AbstractC0355j.d(c0364s3, c0364s4)) {
                float[] copyOf2 = Arrays.copyOf(fArr3, 3);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                fArr2 = AbstractC0355j.g(AbstractC0355j.h(AbstractC0355j.c(fArr4, a5, copyOf2), c0362q2.f4814i));
            }
            h4 = AbstractC0355j.h(fArr2, i2 == 3 ? AbstractC0355j.i(new float[]{a4[0] / a5[0], a4[1] / a5[1], a4[2] / a5[2]}, fArr) : fArr);
        }
        this.f4784g = h4;
    }

    @Override // a0.C0352g
    public final long a(long j4) {
        float h4 = C0323u.h(j4);
        float g4 = C0323u.g(j4);
        float e4 = C0323u.e(j4);
        float d4 = C0323u.d(j4);
        C0358m c0358m = this.f4782e.f4821p;
        float c4 = (float) c0358m.c(h4);
        float c5 = (float) c0358m.c(g4);
        float c6 = (float) c0358m.c(e4);
        float[] fArr = this.f4784g;
        float f4 = (fArr[6] * c6) + (fArr[3] * c5) + (fArr[0] * c4);
        float f5 = (fArr[7] * c6) + (fArr[4] * c5) + (fArr[1] * c4);
        float f6 = (fArr[8] * c6) + (fArr[5] * c5) + (fArr[2] * c4);
        C0362q c0362q = this.f4783f;
        float c7 = (float) c0362q.f4818m.c(f4);
        double d5 = f5;
        C0358m c0358m2 = c0362q.f4818m;
        return K.b(c7, (float) c0358m2.c(d5), (float) c0358m2.c(f6), d4, c0362q);
    }
}
