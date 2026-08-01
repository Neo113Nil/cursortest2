package l0;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public C.g[] f3118a;

    /* renamed from: b, reason: collision with root package name */
    public String f3119b;

    /* renamed from: c, reason: collision with root package name */
    public int f3120c;

    public l() {
        this.f3118a = null;
        this.f3120c = 0;
    }

    public C.g[] getPathData() {
        return this.f3118a;
    }

    public String getPathName() {
        return this.f3119b;
    }

    public void setPathData(C.g[] gVarArr) {
        C.g[] gVarArr2 = this.f3118a;
        boolean z2 = false;
        if (gVarArr2 != null && gVarArr != null && gVarArr2.length == gVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= gVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.g gVar = gVarArr2[i];
                char c2 = gVar.f152a;
                C.g gVar2 = gVarArr[i];
                if (c2 != gVar2.f152a || gVar.f153b.length != gVar2.f153b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3118a = q1.d.t(gVarArr);
            return;
        }
        C.g[] gVarArr3 = this.f3118a;
        for (int i2 = 0; i2 < gVarArr.length; i2++) {
            gVarArr3[i2].f152a = gVarArr[i2].f152a;
            int i3 = 0;
            while (true) {
                float[] fArr = gVarArr[i2].f153b;
                if (i3 < fArr.length) {
                    gVarArr3[i2].f153b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f3118a = null;
        this.f3120c = 0;
        this.f3119b = lVar.f3119b;
        this.f3118a = q1.d.t(lVar.f3118a);
    }
}
