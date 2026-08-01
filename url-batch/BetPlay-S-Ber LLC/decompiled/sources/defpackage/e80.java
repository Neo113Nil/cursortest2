package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class e80 extends d80 {
    public ex[] a;
    public String b;
    public int c;

    public e80(e80 e80Var) {
        this.a = null;
        this.c = 0;
        this.b = e80Var.b;
        ex[] exVarArr = e80Var.a;
        ex[] exVarArr2 = new ex[exVarArr.length];
        for (int i = 0; i < exVarArr.length; i++) {
            exVarArr2[i] = new ex(exVarArr[i]);
        }
        this.a = exVarArr2;
    }

    public ex[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(ex[] exVarArr) {
        int i;
        ex[] exVarArr2 = this.a;
        if (exVarArr2 != null && exVarArr != null && exVarArr2.length == exVarArr.length) {
            for (0; i < exVarArr2.length; i + 1) {
                ex exVar = exVarArr2[i];
                char c = exVar.a;
                ex exVar2 = exVarArr[i];
                i = (c == exVar2.a && exVar.b.length == exVar2.b.length) ? i + 1 : 0;
            }
            ex[] exVarArr3 = this.a;
            for (int i2 = 0; i2 < exVarArr.length; i2++) {
                exVarArr3[i2].a = exVarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = exVarArr[i2].b;
                    if (i3 < fArr.length) {
                        exVarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        ex[] exVarArr4 = new ex[exVarArr.length];
        for (int i4 = 0; i4 < exVarArr.length; i4++) {
            exVarArr4[i4] = new ex(exVarArr[i4]);
        }
        this.a = exVarArr4;
    }

    public e80() {
        this.a = null;
        this.c = 0;
    }
}
