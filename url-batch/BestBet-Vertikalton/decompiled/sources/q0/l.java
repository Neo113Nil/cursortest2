package q0;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public C.g[] f3780a;

    /* renamed from: b, reason: collision with root package name */
    public String f3781b;

    /* renamed from: c, reason: collision with root package name */
    public int f3782c;

    public l() {
        this.f3780a = null;
        this.f3782c = 0;
    }

    public C.g[] getPathData() {
        return this.f3780a;
    }

    public String getPathName() {
        return this.f3781b;
    }

    public void setPathData(C.g[] gVarArr) {
        C.g[] gVarArr2 = this.f3780a;
        boolean z2 = false;
        if (gVarArr2 != null && gVarArr != null && gVarArr2.length == gVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= gVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.g gVar = gVarArr2[i];
                char c2 = gVar.f72a;
                C.g gVar2 = gVarArr[i];
                if (c2 != gVar2.f72a || gVar.f73b.length != gVar2.f73b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3780a = H1.l.y(gVarArr);
            return;
        }
        C.g[] gVarArr3 = this.f3780a;
        for (int i2 = 0; i2 < gVarArr.length; i2++) {
            gVarArr3[i2].f72a = gVarArr[i2].f72a;
            int i3 = 0;
            while (true) {
                float[] fArr = gVarArr[i2].f73b;
                if (i3 < fArr.length) {
                    gVarArr3[i2].f73b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f3780a = null;
        this.f3782c = 0;
        this.f3781b = lVar.f3781b;
        this.f3780a = H1.l.y(lVar.f3780a);
    }
}
