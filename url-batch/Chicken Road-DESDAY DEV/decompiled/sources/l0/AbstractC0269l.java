package l0;

/* renamed from: l0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0269l extends AbstractC0268k {

    /* renamed from: a, reason: collision with root package name */
    public C.f[] f3074a;

    /* renamed from: b, reason: collision with root package name */
    public String f3075b;

    /* renamed from: c, reason: collision with root package name */
    public int f3076c;

    public AbstractC0269l() {
        this.f3074a = null;
        this.f3076c = 0;
    }

    public C.f[] getPathData() {
        return this.f3074a;
    }

    public String getPathName() {
        return this.f3075b;
    }

    public void setPathData(C.f[] fVarArr) {
        C.f[] fVarArr2 = this.f3074a;
        boolean z2 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.f fVar = fVarArr2[i];
                char c2 = fVar.f62a;
                C.f fVar2 = fVarArr[i];
                if (c2 != fVar2.f62a || fVar.f63b.length != fVar2.f63b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3074a = u1.l.s(fVarArr);
            return;
        }
        C.f[] fVarArr3 = this.f3074a;
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            fVarArr3[i2].f62a = fVarArr[i2].f62a;
            int i3 = 0;
            while (true) {
                float[] fArr = fVarArr[i2].f63b;
                if (i3 < fArr.length) {
                    fVarArr3[i2].f63b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0269l(AbstractC0269l abstractC0269l) {
        this.f3074a = null;
        this.f3076c = 0;
        this.f3075b = abstractC0269l.f3075b;
        this.f3074a = u1.l.s(abstractC0269l.f3074a);
    }
}
