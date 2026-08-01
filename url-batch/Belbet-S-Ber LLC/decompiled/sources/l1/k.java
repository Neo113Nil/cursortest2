package l1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class k extends j {

    /* renamed from: a, reason: collision with root package name */
    public f0.d[] f2666a;

    /* renamed from: b, reason: collision with root package name */
    public String f2667b;

    /* renamed from: c, reason: collision with root package name */
    public int f2668c;

    public k() {
        this.f2666a = null;
        this.f2668c = 0;
    }

    public f0.d[] getPathData() {
        return this.f2666a;
    }

    public String getPathName() {
        return this.f2667b;
    }

    public void setPathData(f0.d[] dVarArr) {
        f0.d[] dVarArr2 = this.f2666a;
        boolean z4 = false;
        if (dVarArr2 != null && dVarArr != null && dVarArr2.length == dVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= dVarArr2.length) {
                    z4 = true;
                    break;
                }
                f0.d dVar = dVarArr2[i];
                char c5 = dVar.f1418a;
                f0.d dVar2 = dVarArr[i];
                if (c5 != dVar2.f1418a || dVar.f1419b.length != dVar2.f1419b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z4) {
            this.f2666a = b4.l.p(dVarArr);
            return;
        }
        f0.d[] dVarArr3 = this.f2666a;
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            dVarArr3[i4].f1418a = dVarArr[i4].f1418a;
            int i5 = 0;
            while (true) {
                float[] fArr = dVarArr[i4].f1419b;
                if (i5 < fArr.length) {
                    dVarArr3[i4].f1419b[i5] = fArr[i5];
                    i5++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f2666a = null;
        this.f2668c = 0;
        this.f2667b = kVar.f2667b;
        this.f2666a = b4.l.p(kVar.f2666a);
    }
}
