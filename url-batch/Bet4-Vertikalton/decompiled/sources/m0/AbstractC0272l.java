package m0;

/* renamed from: m0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0272l extends AbstractC0271k {

    /* renamed from: a, reason: collision with root package name */
    public C.f[] f3156a;

    /* renamed from: b, reason: collision with root package name */
    public String f3157b;

    /* renamed from: c, reason: collision with root package name */
    public int f3158c;

    public AbstractC0272l() {
        this.f3156a = null;
        this.f3158c = 0;
    }

    public C.f[] getPathData() {
        return this.f3156a;
    }

    public String getPathName() {
        return this.f3157b;
    }

    public void setPathData(C.f[] fVarArr) {
        C.f[] fVarArr2 = this.f3156a;
        boolean z2 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.f fVar = fVarArr2[i];
                char c2 = fVar.f111a;
                C.f fVar2 = fVarArr[i];
                if (c2 != fVar2.f111a || fVar.f112b.length != fVar2.f112b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3156a = w1.d.z(fVarArr);
            return;
        }
        C.f[] fVarArr3 = this.f3156a;
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            fVarArr3[i2].f111a = fVarArr[i2].f111a;
            int i3 = 0;
            while (true) {
                float[] fArr = fVarArr[i2].f112b;
                if (i3 < fArr.length) {
                    fVarArr3[i2].f112b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0272l(AbstractC0272l abstractC0272l) {
        this.f3156a = null;
        this.f3158c = 0;
        this.f3157b = abstractC0272l.f3157b;
        this.f3156a = w1.d.z(abstractC0272l.f3156a);
    }
}
