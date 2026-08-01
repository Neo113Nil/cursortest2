package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class x70 extends w70 {
    public rw[] a;
    public String b;
    public int c;

    public x70(x70 x70Var) {
        this.a = null;
        this.c = 0;
        this.b = x70Var.b;
        rw[] rwVarArr = x70Var.a;
        rw[] rwVarArr2 = new rw[rwVarArr.length];
        for (int i = 0; i < rwVarArr.length; i++) {
            rwVarArr2[i] = new rw(rwVarArr[i]);
        }
        this.a = rwVarArr2;
    }

    public rw[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(rw[] rwVarArr) {
        int i;
        rw[] rwVarArr2 = this.a;
        if (rwVarArr2 != null && rwVarArr != null && rwVarArr2.length == rwVarArr.length) {
            for (0; i < rwVarArr2.length; i + 1) {
                rw rwVar = rwVarArr2[i];
                char c = rwVar.a;
                rw rwVar2 = rwVarArr[i];
                i = (c == rwVar2.a && rwVar.b.length == rwVar2.b.length) ? i + 1 : 0;
            }
            rw[] rwVarArr3 = this.a;
            for (int i2 = 0; i2 < rwVarArr.length; i2++) {
                rwVarArr3[i2].a = rwVarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = rwVarArr[i2].b;
                    if (i3 < fArr.length) {
                        rwVarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        rw[] rwVarArr4 = new rw[rwVarArr.length];
        for (int i4 = 0; i4 < rwVarArr.length; i4++) {
            rwVarArr4[i4] = new rw(rwVarArr[i4]);
        }
        this.a = rwVarArr4;
    }

    public x70() {
        this.a = null;
        this.c = 0;
    }
}
