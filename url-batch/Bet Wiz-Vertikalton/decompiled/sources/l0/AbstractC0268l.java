package l0;

/* renamed from: l0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0268l extends AbstractC0267k {

    /* renamed from: a, reason: collision with root package name */
    public C.f[] f3127a;

    /* renamed from: b, reason: collision with root package name */
    public String f3128b;

    /* renamed from: c, reason: collision with root package name */
    public int f3129c;

    public AbstractC0268l() {
        this.f3127a = null;
        this.f3129c = 0;
    }

    public C.f[] getPathData() {
        return this.f3127a;
    }

    public String getPathName() {
        return this.f3128b;
    }

    public void setPathData(C.f[] fVarArr) {
        C.f[] fVarArr2 = this.f3127a;
        boolean z2 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.f fVar = fVarArr2[i];
                char c2 = fVar.f63a;
                C.f fVar2 = fVarArr[i];
                if (c2 != fVar2.f63a || fVar.f64b.length != fVar2.f64b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3127a = x1.d.u(fVarArr);
            return;
        }
        C.f[] fVarArr3 = this.f3127a;
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            fVarArr3[i2].f63a = fVarArr[i2].f63a;
            int i3 = 0;
            while (true) {
                float[] fArr = fVarArr[i2].f64b;
                if (i3 < fArr.length) {
                    fVarArr3[i2].f64b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0268l(AbstractC0268l abstractC0268l) {
        this.f3127a = null;
        this.f3129c = 0;
        this.f3128b = abstractC0268l.f3128b;
        this.f3127a = x1.d.u(abstractC0268l.f3127a);
    }
}
