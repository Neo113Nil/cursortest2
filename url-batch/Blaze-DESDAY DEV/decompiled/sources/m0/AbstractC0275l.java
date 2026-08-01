package m0;

/* renamed from: m0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0275l extends AbstractC0274k {

    /* renamed from: a, reason: collision with root package name */
    public C.f[] f3180a;

    /* renamed from: b, reason: collision with root package name */
    public String f3181b;

    /* renamed from: c, reason: collision with root package name */
    public int f3182c;

    public AbstractC0275l() {
        this.f3180a = null;
        this.f3182c = 0;
    }

    public C.f[] getPathData() {
        return this.f3180a;
    }

    public String getPathName() {
        return this.f3181b;
    }

    public void setPathData(C.f[] fVarArr) {
        C.f[] fVarArr2 = this.f3180a;
        boolean z2 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.f fVar = fVarArr2[i];
                char c2 = fVar.f76a;
                C.f fVar2 = fVarArr[i];
                if (c2 != fVar2.f76a || fVar.f77b.length != fVar2.f77b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3180a = z1.l.p(fVarArr);
            return;
        }
        C.f[] fVarArr3 = this.f3180a;
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            fVarArr3[i2].f76a = fVarArr[i2].f76a;
            int i3 = 0;
            while (true) {
                float[] fArr = fVarArr[i2].f77b;
                if (i3 < fArr.length) {
                    fVarArr3[i2].f77b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0275l(AbstractC0275l abstractC0275l) {
        this.f3180a = null;
        this.f3182c = 0;
        this.f3181b = abstractC0275l.f3181b;
        this.f3180a = z1.l.p(abstractC0275l.f3180a);
    }
}
