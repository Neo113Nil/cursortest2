package E0;

import a.AbstractC0415a;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public G.i[] f771a;

    /* renamed from: b, reason: collision with root package name */
    public String f772b;

    /* renamed from: c, reason: collision with root package name */
    public int f773c;

    public l() {
        this.f771a = null;
        this.f773c = 0;
    }

    public G.i[] getPathData() {
        return this.f771a;
    }

    public String getPathName() {
        return this.f772b;
    }

    public void setPathData(G.i[] iVarArr) {
        G.i[] iVarArr2 = this.f771a;
        boolean z8 = false;
        if (iVarArr2 != null && iVarArr != null && iVarArr2.length == iVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= iVarArr2.length) {
                    z8 = true;
                    break;
                }
                G.i iVar = iVarArr2[i];
                char c4 = iVar.f1156a;
                G.i iVar2 = iVarArr[i];
                if (c4 != iVar2.f1156a || iVar.f1157b.length != iVar2.f1157b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z8) {
            this.f771a = AbstractC0415a.m(iVarArr);
            return;
        }
        G.i[] iVarArr3 = this.f771a;
        for (int i4 = 0; i4 < iVarArr.length; i4++) {
            iVarArr3[i4].f1156a = iVarArr[i4].f1156a;
            int i9 = 0;
            while (true) {
                float[] fArr = iVarArr[i4].f1157b;
                if (i9 < fArr.length) {
                    iVarArr3[i4].f1157b[i9] = fArr[i9];
                    i9++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f771a = null;
        this.f773c = 0;
        this.f772b = lVar.f772b;
        this.f771a = AbstractC0415a.m(lVar.f771a);
    }
}
