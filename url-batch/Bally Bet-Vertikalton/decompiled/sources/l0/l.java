package l0;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public C.g[] f3123a;

    /* renamed from: b, reason: collision with root package name */
    public String f3124b;

    /* renamed from: c, reason: collision with root package name */
    public int f3125c;

    public l() {
        this.f3123a = null;
        this.f3125c = 0;
    }

    public C.g[] getPathData() {
        return this.f3123a;
    }

    public String getPathName() {
        return this.f3124b;
    }

    public void setPathData(C.g[] gVarArr) {
        C.g[] gVarArr2 = this.f3123a;
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
            this.f3123a = q1.d.u(gVarArr);
            return;
        }
        C.g[] gVarArr3 = this.f3123a;
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
        this.f3123a = null;
        this.f3125c = 0;
        this.f3124b = lVar.f3124b;
        this.f3123a = q1.d.u(lVar.f3123a);
    }
}
