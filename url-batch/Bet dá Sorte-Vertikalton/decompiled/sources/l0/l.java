package l0;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public C.g[] f3106a;

    /* renamed from: b, reason: collision with root package name */
    public String f3107b;

    /* renamed from: c, reason: collision with root package name */
    public int f3108c;

    public l() {
        this.f3106a = null;
        this.f3108c = 0;
    }

    public C.g[] getPathData() {
        return this.f3106a;
    }

    public String getPathName() {
        return this.f3107b;
    }

    public void setPathData(C.g[] gVarArr) {
        C.g[] gVarArr2 = this.f3106a;
        boolean z2 = false;
        if (gVarArr2 != null && gVarArr != null && gVarArr2.length == gVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= gVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.g gVar = gVarArr2[i];
                char c2 = gVar.f146a;
                C.g gVar2 = gVarArr[i];
                if (c2 != gVar2.f146a || gVar.f147b.length != gVar2.f147b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3106a = u1.d.y(gVarArr);
            return;
        }
        C.g[] gVarArr3 = this.f3106a;
        for (int i2 = 0; i2 < gVarArr.length; i2++) {
            gVarArr3[i2].f146a = gVarArr[i2].f146a;
            int i3 = 0;
            while (true) {
                float[] fArr = gVarArr[i2].f147b;
                if (i3 < fArr.length) {
                    gVarArr3[i2].f147b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f3106a = null;
        this.f3108c = 0;
        this.f3107b = lVar.f3107b;
        this.f3106a = u1.d.y(lVar.f3106a);
    }
}
