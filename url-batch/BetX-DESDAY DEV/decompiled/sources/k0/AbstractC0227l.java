package k0;

/* renamed from: k0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0227l extends AbstractC0226k {

    /* renamed from: a, reason: collision with root package name */
    public C.g[] f3171a;

    /* renamed from: b, reason: collision with root package name */
    public String f3172b;

    /* renamed from: c, reason: collision with root package name */
    public int f3173c;

    public AbstractC0227l() {
        this.f3171a = null;
        this.f3173c = 0;
    }

    public C.g[] getPathData() {
        return this.f3171a;
    }

    public String getPathName() {
        return this.f3172b;
    }

    public void setPathData(C.g[] gVarArr) {
        C.g[] gVarArr2 = this.f3171a;
        boolean z2 = false;
        if (gVarArr2 != null && gVarArr != null && gVarArr2.length == gVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= gVarArr2.length) {
                    z2 = true;
                    break;
                }
                C.g gVar = gVarArr2[i];
                char c2 = gVar.f162a;
                C.g gVar2 = gVarArr[i];
                if (c2 != gVar2.f162a || gVar.f163b.length != gVar2.f163b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3171a = q1.d.u(gVarArr);
            return;
        }
        C.g[] gVarArr3 = this.f3171a;
        for (int i2 = 0; i2 < gVarArr.length; i2++) {
            gVarArr3[i2].f162a = gVarArr[i2].f162a;
            int i3 = 0;
            while (true) {
                float[] fArr = gVarArr[i2].f163b;
                if (i3 < fArr.length) {
                    gVarArr3[i2].f163b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0227l(AbstractC0227l abstractC0227l) {
        this.f3171a = null;
        this.f3173c = 0;
        this.f3172b = abstractC0227l.f3172b;
        this.f3171a = q1.d.u(abstractC0227l.f3171a);
    }
}
