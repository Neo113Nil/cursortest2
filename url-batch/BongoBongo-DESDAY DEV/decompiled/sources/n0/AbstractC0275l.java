package n0;

/* renamed from: n0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0275l extends AbstractC0274k {

    /* renamed from: a, reason: collision with root package name */
    public D.f[] f3349a;

    /* renamed from: b, reason: collision with root package name */
    public String f3350b;

    /* renamed from: c, reason: collision with root package name */
    public int f3351c;

    public AbstractC0275l() {
        this.f3349a = null;
        this.f3351c = 0;
    }

    public D.f[] getPathData() {
        return this.f3349a;
    }

    public String getPathName() {
        return this.f3350b;
    }

    public void setPathData(D.f[] fVarArr) {
        D.f[] fVarArr2 = this.f3349a;
        boolean z2 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z2 = true;
                    break;
                }
                D.f fVar = fVarArr2[i];
                char c2 = fVar.f118a;
                D.f fVar2 = fVarArr[i];
                if (c2 != fVar2.f118a || fVar.f119b.length != fVar2.f119b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3349a = A1.d.x(fVarArr);
            return;
        }
        D.f[] fVarArr3 = this.f3349a;
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            fVarArr3[i2].f118a = fVarArr[i2].f118a;
            int i3 = 0;
            while (true) {
                float[] fArr = fVarArr[i2].f119b;
                if (i3 < fArr.length) {
                    fVarArr3[i2].f119b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0275l(AbstractC0275l abstractC0275l) {
        this.f3349a = null;
        this.f3351c = 0;
        this.f3350b = abstractC0275l.f3350b;
        this.f3349a = A1.d.x(abstractC0275l.f3349a);
    }
}
