package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class ib0 extends hb0 {
    public vz[] a;
    public String b;
    public int c;

    public ib0(ib0 ib0Var) {
        this.a = null;
        this.c = 0;
        this.b = ib0Var.b;
        vz[] vzVarArr = ib0Var.a;
        vz[] vzVarArr2 = new vz[vzVarArr.length];
        for (int i = 0; i < vzVarArr.length; i++) {
            vzVarArr2[i] = new vz(vzVarArr[i]);
        }
        this.a = vzVarArr2;
    }

    public vz[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(vz[] vzVarArr) {
        int i;
        vz[] vzVarArr2 = this.a;
        if (vzVarArr2 != null && vzVarArr != null && vzVarArr2.length == vzVarArr.length) {
            for (0; i < vzVarArr2.length; i + 1) {
                vz vzVar = vzVarArr2[i];
                char c = vzVar.a;
                vz vzVar2 = vzVarArr[i];
                i = (c == vzVar2.a && vzVar.b.length == vzVar2.b.length) ? i + 1 : 0;
            }
            vz[] vzVarArr3 = this.a;
            for (int i2 = 0; i2 < vzVarArr.length; i2++) {
                vzVarArr3[i2].a = vzVarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = vzVarArr[i2].b;
                    if (i3 < fArr.length) {
                        vzVarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        vz[] vzVarArr4 = new vz[vzVarArr.length];
        for (int i4 = 0; i4 < vzVarArr.length; i4++) {
            vzVarArr4[i4] = new vz(vzVarArr[i4]);
        }
        this.a = vzVarArr4;
    }

    public ib0() {
        this.a = null;
        this.c = 0;
    }
}
