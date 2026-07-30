package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wf1 extends zl0 implements ux0, nr, tx0 {
    public mx0 A;
    public Object s;
    public Object t;
    public PointerInputEventHandler u;
    public rc1 v;
    public mx0 w = uf1.a;
    public final eo0 x;
    public final eo0 y;
    public final eo0 z;

    public wf1(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.s = obj;
        this.t = obj2;
        this.u = pointerInputEventHandler;
        eo0 eo0Var = new eo0(new vf1[16]);
        this.x = eo0Var;
        this.y = eo0Var;
        this.z = new eo0(new vf1[16]);
    }

    public final void A0() {
        rc1 rc1Var = this.v;
        if (rc1Var != null) {
            rc1Var.F(new dm0("Pointer input was reset", 2));
            this.v = null;
        }
    }

    @Override // defpackage.tx0
    public final void S() {
        A0();
    }

    @Override // defpackage.tx0
    public final void X() {
        mx0 mx0Var = this.A;
        if (mx0Var == null) {
            return;
        }
        List list = mx0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((qx0) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    qx0 qx0Var = (qx0) list.get(i2);
                    long j = qx0Var.a;
                    long j2 = qx0Var.c;
                    long j3 = qx0Var.b;
                    float f = qx0Var.e;
                    boolean z = qx0Var.d;
                    arrayList.add(new qx0(j, j3, j2, false, f, j3, j2, z, z, qx0Var.i, 0L));
                }
                mx0 mx0Var2 = new mx0(arrayList, null);
                this.w = mx0Var2;
                z0(mx0Var2, nx0.d);
                z0(mx0Var2, nx0.e);
                z0(mx0Var2, nx0.g);
                this.A = null;
                return;
            }
        }
    }

    @Override // defpackage.yq
    public final void a() {
        A0();
    }

    @Override // defpackage.nr
    public final float f() {
        return op.I(this).C.f();
    }

    @Override // defpackage.nr
    public final float k() {
        return op.I(this).C.k();
    }

    @Override // defpackage.zl0
    public final void s0() {
        A0();
    }

    @Override // defpackage.tx0
    public final void z(mx0 mx0Var, nx0 nx0Var, long j) {
        if (nx0Var == nx0.d) {
            this.w = mx0Var;
        }
        dn dnVar = null;
        if (this.v == null) {
            sn n0 = n0();
            vn vnVar = vn.d;
            this.v = uq1.N(n0, null, new rp(this, dnVar, 9), 1);
        }
        z0(mx0Var, nx0Var);
        List list = mx0Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                mx0Var = null;
                break;
            } else if (!ka0.j((qx0) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.A = mx0Var;
    }

    public final void z0(mx0 mx0Var, nx0 nx0Var) {
        tf tfVar;
        tf tfVar2;
        synchronized (this.y) {
            eo0 eo0Var = this.z;
            eo0Var.c(eo0Var.g, this.x);
        }
        try {
            int ordinal = nx0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    eo0 eo0Var2 = this.z;
                    int i = eo0Var2.g - 1;
                    Object[] objArr = eo0Var2.d;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            vf1 vf1Var = (vf1) objArr[i];
                            if (nx0Var == vf1Var.h && (tfVar2 = vf1Var.g) != null) {
                                vf1Var.g = null;
                                i31 i31Var = k31.d;
                                tfVar2.l(mx0Var);
                            }
                            i--;
                        }
                    }
                    this.z.g();
                }
                if (ordinal != 2) {
                    throw new ip0();
                }
            }
            eo0 eo0Var3 = this.z;
            Object[] objArr2 = eo0Var3.d;
            int i2 = eo0Var3.g;
            for (int i3 = 0; i3 < i2; i3++) {
                vf1 vf1Var2 = (vf1) objArr2[i3];
                if (nx0Var == vf1Var2.h && (tfVar = vf1Var2.g) != null) {
                    vf1Var2.g = null;
                    i31 i31Var2 = k31.d;
                    tfVar.l(mx0Var);
                }
            }
            this.z.g();
        } catch (Throwable th) {
            this.z.g();
            throw th;
        }
    }
}
