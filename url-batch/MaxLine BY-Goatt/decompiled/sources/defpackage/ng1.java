package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ng1 implements ca0 {
    public boolean m;
    public long n = 9223372034707292159L;
    public long o = 0;
    public final /* synthetic */ qg1 p;

    public ng1(qg1 qg1Var) {
        this.p = qg1Var;
    }

    public final void a(ay0 ay0Var, float f) {
        qg1 qg1Var = this.p;
        te teVar = qg1Var.y;
        if (teVar == null) {
            teVar = new te();
            qg1Var.y = teVar;
        }
        int u = oi.u((ay0[]) teVar.b, ay0Var);
        if (u >= 0) {
            float[] fArr = (float[]) teVar.c;
            if (fArr[u] != f) {
                fArr[u] = f;
                ((byte[]) teVar.d)[u] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) teVar.d;
                if (bArr[u] == 2) {
                    bArr[u] = 0;
                    return;
                }
                return;
            }
        }
        int i = teVar.a;
        ay0[] ay0VarArr = (ay0[]) teVar.b;
        if (i == ay0VarArr.length) {
            int i2 = i * 2;
            teVar.b = (ay0[]) Arrays.copyOf(ay0VarArr, i2);
            teVar.c = Arrays.copyOf((float[]) teVar.c, i2);
            teVar.d = Arrays.copyOf((byte[]) teVar.d, i2);
        }
        ((ay0[]) teVar.b)[i] = ay0Var;
        ((byte[]) teVar.d)[i] = 3;
        ((float[]) teVar.c)[i] = f;
        teVar.a++;
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.p.d();
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.p.p();
    }
}
