package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q50 extends dm1 {
    public float[] b;
    public c6 h;
    public Function1 i;
    public float l;
    public float m;
    public float n;
    public float q;
    public float r;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = hi.g;
    public List f = mm1.a;
    public boolean g = true;
    public final a3 j = new a3(15, this);
    public String k = "";
    public float o = 1.0f;
    public float p = 1.0f;
    public boolean s = true;

    @Override // defpackage.dm1
    public final void a(hu huVar) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = y90.m();
                this.b = fArr;
            } else {
                y90.B(fArr);
            }
            y90.I(fArr, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = (f3 * cos) + (f2 * f5);
                float f7 = fArr[1];
                float f8 = fArr[5];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = (f8 * cos) + (f7 * f5);
                float f11 = fArr[2];
                float f12 = fArr[6];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = (f12 * cos) + (f11 * f5);
                float f15 = fArr[3];
                float f16 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f9;
                fArr[2] = f13;
                fArr[3] = (sin * f16) + (cos * f15);
                fArr[4] = f6;
                fArr[5] = f10;
                fArr[6] = f14;
                fArr[7] = (cos * f16) + (f5 * f15);
            }
            float f17 = this.o;
            float f18 = this.p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f17;
                fArr[1] = fArr[1] * f17;
                fArr[2] = fArr[2] * f17;
                fArr[3] = fArr[3] * f17;
                fArr[4] = fArr[4] * f18;
                fArr[5] = fArr[5] * f18;
                fArr[6] = fArr[6] * f18;
                fArr[7] = fArr[7] * f18;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            y90.I(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                c6 c6Var = this.h;
                if (c6Var == null) {
                    c6Var = e6.a();
                    this.h = c6Var;
                }
                y90.H(this.f, c6Var);
            }
            this.g = false;
        }
        i8 v = huVar.v();
        long i = v.i();
        v.g().k();
        try {
            i8 i8Var = (i8) ((s40) v.e).e;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                i8Var.g().o(fArr2);
            }
            c6 c6Var2 = this.h;
            if (!this.f.isEmpty() && c6Var2 != null) {
                i8Var.g().q(c6Var2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((dm1) arrayList.get(i2)).a(huVar);
            }
        } finally {
            qy0.s(v, i);
        }
    }

    @Override // defpackage.dm1
    public final Function1 b() {
        return this.i;
    }

    @Override // defpackage.dm1
    public final void d(a3 a3Var) {
        this.i = a3Var;
    }

    public final void e(int i, dm1 dm1Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, dm1Var);
        } else {
            arrayList.add(dm1Var);
        }
        g(dm1Var);
        dm1Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            nv nvVar = mm1.a;
            if (hi.h(j2) == hi.h(j) && hi.g(j2) == hi.g(j) && hi.e(j2) == hi.e(j)) {
                return;
            }
            this.d = false;
            this.e = hi.g;
        }
    }

    public final void g(dm1 dm1Var) {
        if (!(dm1Var instanceof fv0)) {
            if (dm1Var instanceof q50) {
                q50 q50Var = (q50) dm1Var;
                if (q50Var.d && this.d) {
                    f(q50Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = hi.g;
                    return;
                }
            }
            return;
        }
        fv0 fv0Var = (fv0) dm1Var;
        op opVar = fv0Var.b;
        if (this.d && opVar != null) {
            if (opVar instanceof ec1) {
                f(((ec1) opVar).t);
            } else {
                this.d = false;
                this.e = hi.g;
            }
        }
        op opVar2 = fv0Var.g;
        if (this.d && opVar2 != null) {
            if (opVar2 instanceof ec1) {
                f(((ec1) opVar2).t);
            } else {
                this.d = false;
                this.e = hi.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dm1 dm1Var = (dm1) arrayList.get(i);
            sb.append("\t");
            sb.append(dm1Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
