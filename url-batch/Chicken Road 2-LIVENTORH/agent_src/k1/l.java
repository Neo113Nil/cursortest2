package k1;

import a.y;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public f0.e[] f2194a;

    /* renamed from: b, reason: collision with root package name */
    public String f2195b;

    /* renamed from: c, reason: collision with root package name */
    public int f2196c;

    public l() {
        this.f2194a = null;
        this.f2196c = 0;
    }

    public f0.e[] getPathData() {
        return this.f2194a;
    }

    public String getPathName() {
        return this.f2195b;
    }

    public void setPathData(f0.e[] eVarArr) {
        f0.e[] eVarArr2 = this.f2194a;
        boolean z3 = false;
        if (eVarArr2 != null && eVarArr != null && eVarArr2.length == eVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= eVarArr2.length) {
                    z3 = true;
                    break;
                }
                f0.e eVar = eVarArr2[i];
                char c4 = eVar.f1270a;
                f0.e eVar2 = eVarArr[i];
                if (c4 != eVar2.f1270a || eVar.f1271b.length != eVar2.f1271b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z3) {
            this.f2194a = y.x(eVarArr);
            return;
        }
        f0.e[] eVarArr3 = this.f2194a;
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            eVarArr3[i4].f1270a = eVarArr[i4].f1270a;
            int i5 = 0;
            while (true) {
                float[] fArr = eVarArr[i4].f1271b;
                if (i5 < fArr.length) {
                    eVarArr3[i4].f1271b[i5] = fArr[i5];
                    i5++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f2194a = null;
        this.f2196c = 0;
        this.f2195b = lVar.f2195b;
        this.f2194a = y.x(lVar.f2194a);
    }
}
