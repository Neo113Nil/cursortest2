package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fdy implements fdv {
    int b = 0;
    double[] a = new double[5];

    @Override // defpackage.fdv
    public final ihp a() {
        jkj k = ihn.a.k();
        for (int i = 0; i < this.b; i++) {
            jkj k2 = ihm.a.k();
            double d = this.a[i];
            if (!k2.b.M()) {
                k2.t();
            }
            jkp jkpVar = k2.b;
            ihm ihmVar = (ihm) jkpVar;
            ihmVar.b |= 1;
            ihmVar.c = d;
            if (!jkpVar.M()) {
                k2.t();
            }
            ihm ihmVar2 = (ihm) k2.b;
            ihmVar2.b |= 2;
            ihmVar2.d = 1L;
            if (!k.b.M()) {
                k.t();
            }
            ihn ihnVar = (ihn) k.b;
            ihm ihmVar3 = (ihm) k2.q();
            ihmVar3.getClass();
            jkx jkxVar = ihnVar.b;
            if (!jkxVar.c()) {
                ihnVar.b = jkp.A(jkxVar);
            }
            ihnVar.b.add(ihmVar3);
        }
        jkj k3 = ihp.a.k();
        if (!k3.b.M()) {
            k3.t();
        }
        ihp ihpVar = (ihp) k3.b;
        ihn ihnVar2 = (ihn) k.q();
        ihnVar2.getClass();
        ihpVar.c = ihnVar2;
        ihpVar.b = 3;
        return (ihp) k3.q();
    }

    @Override // defpackage.fdv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = 2147483639;
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                }
            }
            dArr = Arrays.copyOf(dArr, i2);
            this.a = dArr;
        }
        dArr[this.b] = d.doubleValue();
        this.b++;
    }

    public final String toString() {
        return ", count = " + this.b + ", value =" + Arrays.toString(this.a);
    }
}
