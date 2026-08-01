package o0;

/* renamed from: o0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0277l extends AbstractC0276k {

    /* renamed from: a, reason: collision with root package name */
    public C.g[] f3273a;

    /* renamed from: b, reason: collision with root package name */
    public String f3274b;

    /* renamed from: c, reason: collision with root package name */
    public int f3275c;

    public AbstractC0277l() {
        this.f3273a = null;
        this.f3275c = 0;
    }

    public C.g[] getPathData() {
        return this.f3273a;
    }

    public String getPathName() {
        return this.f3274b;
    }

    public void setPathData(C.g[] gVarArr) {
        C.g[] gVarArr2 = this.f3273a;
        boolean z2 = false;
        if (gVarArr2 != null && gVarArr != null && gVarArr2.length == gVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= gVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.g gVar = gVarArr2[i];
                char c2 = gVar.f98a;
                C.g gVar2 = gVarArr[i];
                if (c2 != gVar2.f98a || gVar.f99b.length != gVar2.f99b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3273a = A.c.z(gVarArr);
            return;
        }
        C.g[] gVarArr3 = this.f3273a;
        for (int i2 = 0; i2 < gVarArr.length; i2++) {
            gVarArr3[i2].f98a = gVarArr[i2].f98a;
            int i3 = 0;
            while (true) {
                float[] fArr = gVarArr[i2].f99b;
                if (i3 < fArr.length) {
                    gVarArr3[i2].f99b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0277l(AbstractC0277l abstractC0277l) {
        this.f3273a = null;
        this.f3275c = 0;
        this.f3274b = abstractC0277l.f3274b;
        this.f3273a = A.c.z(abstractC0277l.f3273a);
    }
}
