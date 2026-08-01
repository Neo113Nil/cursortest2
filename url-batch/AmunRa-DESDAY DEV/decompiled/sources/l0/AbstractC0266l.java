package l0;

/* renamed from: l0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0266l extends AbstractC0265k {

    /* renamed from: a, reason: collision with root package name */
    public C.f[] f3218a;

    /* renamed from: b, reason: collision with root package name */
    public String f3219b;

    /* renamed from: c, reason: collision with root package name */
    public int f3220c;

    public AbstractC0266l() {
        this.f3218a = null;
        this.f3220c = 0;
    }

    public C.f[] getPathData() {
        return this.f3218a;
    }

    public String getPathName() {
        return this.f3219b;
    }

    public void setPathData(C.f[] fVarArr) {
        C.f[] fVarArr2 = this.f3218a;
        boolean z2 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.f fVar = fVarArr2[i];
                char c2 = fVar.f60a;
                C.f fVar2 = fVarArr[i];
                if (c2 != fVar2.f60a || fVar.f61b.length != fVar2.f61b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3218a = s1.l.u(fVarArr);
            return;
        }
        C.f[] fVarArr3 = this.f3218a;
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            fVarArr3[i2].f60a = fVarArr[i2].f60a;
            int i3 = 0;
            while (true) {
                float[] fArr = fVarArr[i2].f61b;
                if (i3 < fArr.length) {
                    fVarArr3[i2].f61b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0266l(AbstractC0266l abstractC0266l) {
        this.f3218a = null;
        this.f3220c = 0;
        this.f3219b = abstractC0266l.f3219b;
        this.f3218a = s1.l.u(abstractC0266l.f3218a);
    }
}
