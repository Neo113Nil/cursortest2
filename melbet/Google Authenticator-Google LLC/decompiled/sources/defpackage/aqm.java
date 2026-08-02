package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aqm extends ym {
    protected vc[] m;
    String n;
    int o;
    int p;

    public aqm(aqm aqmVar) {
        this.m = null;
        this.o = 0;
        this.n = aqmVar.n;
        int i = aqmVar.p;
        this.p = 0;
        this.m = pi.u(aqmVar.m);
    }

    public vc[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public boolean s() {
        return false;
    }

    public void setPathData(vc[] vcVarArr) {
        int i;
        vc[] vcVarArr2 = this.m;
        if (vcVarArr2 != null && vcVarArr != null) {
            if (vcVarArr2.length == vcVarArr.length) {
                for (0; i < vcVarArr2.length; i + 1) {
                    vc vcVar = vcVarArr2[i];
                    char c = vcVar.a;
                    vc vcVar2 = vcVarArr[i];
                    i = (c == vcVar2.a && vcVar.b.length == vcVar2.b.length) ? i + 1 : 0;
                }
                vc[] vcVarArr3 = this.m;
                for (int i2 = 0; i2 < vcVarArr.length; i2++) {
                    vcVarArr3[i2].a = vcVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = vcVarArr[i2].b;
                        if (i3 < fArr.length) {
                            vcVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = pi.u(vcVarArr);
    }

    public aqm() {
        this.m = null;
        this.o = 0;
    }
}
