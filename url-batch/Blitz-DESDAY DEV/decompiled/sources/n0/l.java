package n0;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public E.f[] f3258a;

    /* renamed from: b, reason: collision with root package name */
    public String f3259b;

    /* renamed from: c, reason: collision with root package name */
    public int f3260c;

    public l() {
        this.f3258a = null;
        this.f3260c = 0;
    }

    public E.f[] getPathData() {
        return this.f3258a;
    }

    public String getPathName() {
        return this.f3259b;
    }

    public void setPathData(E.f[] fVarArr) {
        E.f[] fVarArr2 = this.f3258a;
        boolean z2 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z2 = true;
                    break;
                }
                E.f fVar = fVarArr2[i];
                char c2 = fVar.f166a;
                E.f fVar2 = fVarArr[i];
                if (c2 != fVar2.f166a || fVar.f167b.length != fVar2.f167b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3258a = z1.l.C(fVarArr);
            return;
        }
        E.f[] fVarArr3 = this.f3258a;
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            fVarArr3[i2].f166a = fVarArr[i2].f166a;
            int i3 = 0;
            while (true) {
                float[] fArr = fVarArr[i2].f167b;
                if (i3 < fArr.length) {
                    fVarArr3[i2].f167b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f3258a = null;
        this.f3260c = 0;
        this.f3259b = lVar.f3259b;
        this.f3258a = z1.l.C(lVar.f3258a);
    }
}
