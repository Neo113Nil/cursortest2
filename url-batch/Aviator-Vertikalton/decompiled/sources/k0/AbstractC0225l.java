package k0;

/* renamed from: k0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0225l extends AbstractC0224k {

    /* renamed from: a, reason: collision with root package name */
    public C.g[] f3167a;

    /* renamed from: b, reason: collision with root package name */
    public String f3168b;

    /* renamed from: c, reason: collision with root package name */
    public int f3169c;

    public AbstractC0225l() {
        this.f3167a = null;
        this.f3169c = 0;
    }

    public C.g[] getPathData() {
        return this.f3167a;
    }

    public String getPathName() {
        return this.f3168b;
    }

    public void setPathData(C.g[] gVarArr) {
        C.g[] gVarArr2 = this.f3167a;
        boolean z2 = false;
        if (gVarArr2 != null && gVarArr != null && gVarArr2.length == gVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= gVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.g gVar = gVarArr2[i];
                char c2 = gVar.f163a;
                C.g gVar2 = gVarArr[i];
                if (c2 != gVar2.f163a || gVar.f164b.length != gVar2.f164b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3167a = q1.d.u(gVarArr);
            return;
        }
        C.g[] gVarArr3 = this.f3167a;
        for (int i2 = 0; i2 < gVarArr.length; i2++) {
            gVarArr3[i2].f163a = gVarArr[i2].f163a;
            int i3 = 0;
            while (true) {
                float[] fArr = gVarArr[i2].f164b;
                if (i3 < fArr.length) {
                    gVarArr3[i2].f164b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0225l(AbstractC0225l abstractC0225l) {
        this.f3167a = null;
        this.f3169c = 0;
        this.f3168b = abstractC0225l.f3168b;
        this.f3167a = q1.d.u(abstractC0225l.f3167a);
    }
}
