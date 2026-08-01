package q0;

import a.AbstractC0058a;

/* renamed from: q0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0343l extends AbstractC0342k {

    /* renamed from: a, reason: collision with root package name */
    public E.f[] f3963a;

    /* renamed from: b, reason: collision with root package name */
    public String f3964b;

    /* renamed from: c, reason: collision with root package name */
    public int f3965c;

    public AbstractC0343l() {
        this.f3963a = null;
        this.f3965c = 0;
    }

    public E.f[] getPathData() {
        return this.f3963a;
    }

    public String getPathName() {
        return this.f3964b;
    }

    public void setPathData(E.f[] fVarArr) {
        E.f[] fVarArr2 = this.f3963a;
        boolean z2 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z2 = true;
                    break;
                }
                E.f fVar = fVarArr2[i];
                char c2 = fVar.f284a;
                E.f fVar2 = fVarArr[i];
                if (c2 != fVar2.f284a || fVar.f285b.length != fVar2.f285b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3963a = AbstractC0058a.p(fVarArr);
            return;
        }
        E.f[] fVarArr3 = this.f3963a;
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            fVarArr3[i2].f284a = fVarArr[i2].f284a;
            int i3 = 0;
            while (true) {
                float[] fArr = fVarArr[i2].f285b;
                if (i3 < fArr.length) {
                    fVarArr3[i2].f285b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0343l(AbstractC0343l abstractC0343l) {
        this.f3963a = null;
        this.f3965c = 0;
        this.f3964b = abstractC0343l.f3964b;
        this.f3963a = AbstractC0058a.p(abstractC0343l.f3963a);
    }
}
