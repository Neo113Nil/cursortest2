package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ow0 extends q33 {
    public float[] b;
    public oa h;
    public Function1 i;
    public float l;
    public float m;
    public float n;
    public float q;
    public float r;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = aw.g;
    public List f = y33.a;
    public boolean g = true;
    public final j6 j = new j6(19, this);
    public String k = BuildConfig.FLAVOR;
    public float o = 1.0f;
    public float p = 1.0f;
    public boolean s = true;

    @Override // defpackage.q33
    public final void a(yd0 yd0Var) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = ti1.a();
                this.b = fArr;
            } else {
                ti1.d(fArr);
            }
            ti1.f(fArr, this.q + this.m, this.r + this.n);
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
            ti1.f(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                oa oaVar = this.h;
                if (oaVar == null) {
                    oaVar = qa.a();
                    this.h = oaVar;
                }
                z71.S(this.f, oaVar);
            }
            this.g = false;
        }
        mh F = yd0Var.F();
        long v = F.v();
        F.o().m();
        try {
            mh mhVar = (mh) ((ar0) F.n).n;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                mhVar.o().q(fArr2);
            }
            oa oaVar2 = this.h;
            if (!this.f.isEmpty() && oaVar2 != null) {
                mhVar.o().s(oaVar2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((q33) arrayList.get(i)).a(yd0Var);
            }
        } finally {
            F.o().j();
            F.J(v);
        }
    }

    @Override // defpackage.q33
    public final Function1 b() {
        return this.i;
    }

    @Override // defpackage.q33
    public final void d(j6 j6Var) {
        this.i = j6Var;
    }

    public final void e(int i, q33 q33Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, q33Var);
        } else {
            arrayList.add(q33Var);
        }
        g(q33Var);
        q33Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            ah0 ah0Var = y33.a;
            if (aw.h(j2) == aw.h(j) && aw.g(j2) == aw.g(j) && aw.e(j2) == aw.e(j)) {
                return;
            }
            this.d = false;
            this.e = aw.g;
        }
    }

    public final void g(q33 q33Var) {
        if (!(q33Var instanceof rz1)) {
            if (q33Var instanceof ow0) {
                ow0 ow0Var = (ow0) q33Var;
                if (ow0Var.d && this.d) {
                    f(ow0Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = aw.g;
                    return;
                }
            }
            return;
        }
        rz1 rz1Var = (rz1) q33Var;
        cq cqVar = rz1Var.b;
        if (this.d && cqVar != null) {
            if (cqVar instanceof nn2) {
                f(((nn2) cqVar).a);
            } else {
                this.d = false;
                this.e = aw.g;
            }
        }
        cq cqVar2 = rz1Var.g;
        if (this.d && cqVar2 != null) {
            if (cqVar2 instanceof nn2) {
                f(((nn2) cqVar2).a);
            } else {
                this.d = false;
                this.e = aw.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q33 q33Var = (q33) arrayList.get(i);
            sb.append("\t");
            sb.append(q33Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
