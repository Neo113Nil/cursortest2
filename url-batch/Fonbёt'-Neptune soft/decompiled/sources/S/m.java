package S;

import a.AbstractC0132a;

/* loaded from: classes.dex */
public abstract class m extends l {

    /* renamed from: a, reason: collision with root package name */
    public t.d[] f1031a;

    /* renamed from: b, reason: collision with root package name */
    public String f1032b;

    /* renamed from: c, reason: collision with root package name */
    public int f1033c;

    public m() {
        this.f1031a = null;
        this.f1033c = 0;
    }

    public t.d[] getPathData() {
        return this.f1031a;
    }

    public String getPathName() {
        return this.f1032b;
    }

    public void setPathData(t.d[] dVarArr) {
        if (!AbstractC0132a.f(this.f1031a, dVarArr)) {
            this.f1031a = AbstractC0132a.q(dVarArr);
            return;
        }
        t.d[] dVarArr2 = this.f1031a;
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            dVarArr2[i2].f3441a = dVarArr[i2].f3441a;
            int i3 = 0;
            while (true) {
                float[] fArr = dVarArr[i2].f3442b;
                if (i3 < fArr.length) {
                    dVarArr2[i2].f3442b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f1031a = null;
        this.f1033c = 0;
        this.f1032b = mVar.f1032b;
        this.f1031a = AbstractC0132a.q(mVar.f1031a);
    }
}
