package g1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public c0.e[] f1792a;

    /* renamed from: b, reason: collision with root package name */
    public String f1793b;
    public int c;

    public l() {
        this.f1792a = null;
        this.c = 0;
    }

    public c0.e[] getPathData() {
        return this.f1792a;
    }

    public String getPathName() {
        return this.f1793b;
    }

    public void setPathData(c0.e[] eVarArr) {
        c0.e[] eVarArr2 = this.f1792a;
        boolean z3 = false;
        if (eVarArr2 != null && eVarArr != null && eVarArr2.length == eVarArr.length) {
            int i4 = 0;
            while (true) {
                if (i4 >= eVarArr2.length) {
                    z3 = true;
                    break;
                }
                c0.e eVar = eVarArr2[i4];
                char c = eVar.f982a;
                c0.e eVar2 = eVarArr[i4];
                if (c != eVar2.f982a || eVar.f983b.length != eVar2.f983b.length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (!z3) {
            this.f1792a = k3.m.q(eVarArr);
            return;
        }
        c0.e[] eVarArr3 = this.f1792a;
        for (int i5 = 0; i5 < eVarArr.length; i5++) {
            eVarArr3[i5].f982a = eVarArr[i5].f982a;
            int i6 = 0;
            while (true) {
                float[] fArr = eVarArr[i5].f983b;
                if (i6 < fArr.length) {
                    eVarArr3[i5].f983b[i6] = fArr[i6];
                    i6++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f1792a = null;
        this.c = 0;
        this.f1793b = lVar.f1793b;
        this.f1792a = k3.m.q(lVar.f1792a);
    }
}
