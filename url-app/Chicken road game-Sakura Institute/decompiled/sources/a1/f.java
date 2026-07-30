package a1;

import java.util.Arrays;
import z0.l0;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final q f239e;

    /* renamed from: f, reason: collision with root package name */
    public final q f240f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f241g;

    public f(q qVar, q qVar2) {
        super(qVar2, qVar, qVar2, null);
        float[] h3;
        this.f239e = qVar;
        this.f240f = qVar2;
        float[] fArr = a.f208b.f209a;
        s sVar = qVar.f266d;
        float[] fArr2 = qVar.f271i;
        s sVar2 = qVar2.f266d;
        float[] fArr3 = qVar2.f272j;
        if (j.d(sVar, sVar2)) {
            h3 = j.h(fArr3, fArr2);
        } else {
            float[] a3 = sVar.a();
            float[] a9 = sVar2.a();
            s sVar3 = j.f248b;
            boolean d8 = j.d(sVar, sVar3);
            float[] fArr4 = j.f251e;
            if (!d8) {
                float[] copyOf = Arrays.copyOf(fArr4, 3);
                r6.k.e(copyOf, "copyOf(this, size)");
                fArr2 = j.h(j.c(fArr, a3, copyOf), fArr2);
            }
            if (!j.d(sVar2, sVar3)) {
                float[] copyOf2 = Arrays.copyOf(fArr4, 3);
                r6.k.e(copyOf2, "copyOf(this, size)");
                fArr3 = j.g(j.h(j.c(fArr, a9, copyOf2), qVar2.f271i));
            }
            h3 = j.h(fArr3, fArr2);
        }
        this.f241g = h3;
    }

    @Override // a1.g
    public final long a(long j8) {
        float h3 = u.h(j8);
        float g9 = u.g(j8);
        float e9 = u.e(j8);
        float d8 = u.d(j8);
        m mVar = this.f239e.f278p;
        float d9 = (float) mVar.d(h3);
        float d10 = (float) mVar.d(g9);
        float d11 = (float) mVar.d(e9);
        float[] fArr = this.f241g;
        float f9 = (fArr[6] * d11) + (fArr[3] * d10) + (fArr[0] * d9);
        float f10 = (fArr[7] * d11) + (fArr[4] * d10) + (fArr[1] * d9);
        float f11 = (fArr[8] * d11) + (fArr[5] * d10) + (fArr[2] * d9);
        q qVar = this.f240f;
        float d12 = (float) qVar.f275m.d(f9);
        m mVar2 = qVar.f275m;
        return l0.b(d12, (float) mVar2.d(f10), (float) mVar2.d(f11), d8, qVar);
    }
}
