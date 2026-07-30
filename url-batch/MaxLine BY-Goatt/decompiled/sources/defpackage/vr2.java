package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.aa2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vr2 extends ul1 implements x22, ca0, w22 {
    public Object A;
    public Object B;
    public Function2 C;
    public PointerInputEventHandler D;
    public jo2 E;
    public m22 F = rr2.a;
    public final eo1 G;
    public final eo1 H;
    public final eo1 I;
    public m22 J;
    public long K;

    public vr2(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.A = obj;
        this.B = obj2;
        this.D = pointerInputEventHandler;
        eo1 eo1Var = new eo1(new ur2[16]);
        this.G = eo1Var;
        this.H = eo1Var;
        this.I = new eo1(new ur2[16]);
        this.K = 0L;
    }

    public final Object G0(Function2 function2, o30 o30Var) {
        fs fsVar = new fs(1, q41.b(o30Var));
        fsVar.u();
        ur2 ur2Var = new ur2(this, fsVar);
        synchronized (this.H) {
            this.G.b(ur2Var);
            yc2 yc2Var = new yc2(q41.b(q41.a(ur2Var, ur2Var, function2)), b50.m);
            aa2.a aVar = aa2.m;
            yc2Var.resumeWith(Unit.a);
        }
        fsVar.w(new s72(11, ur2Var));
        return fsVar.s();
    }

    public final void H0(m22 m22Var, n22 n22Var) {
        fs fsVar;
        fs fsVar2;
        synchronized (this.H) {
            eo1 eo1Var = this.I;
            eo1Var.c(eo1Var.o, this.G);
        }
        try {
            int ordinal = n22Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    eo1 eo1Var2 = this.I;
                    int i = eo1Var2.o - 1;
                    Object[] objArr = eo1Var2.m;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            ur2 ur2Var = (ur2) objArr[i];
                            if (n22Var == ur2Var.p && (fsVar2 = ur2Var.o) != null) {
                                ur2Var.o = null;
                                aa2.a aVar = aa2.m;
                                fsVar2.resumeWith(m22Var);
                            }
                            i--;
                        }
                    }
                    this.I.g();
                }
                if (ordinal != 2) {
                    throw new bs1();
                }
            }
            eo1 eo1Var3 = this.I;
            Object[] objArr2 = eo1Var3.m;
            int i2 = eo1Var3.o;
            for (int i3 = 0; i3 < i2; i3++) {
                ur2 ur2Var2 = (ur2) objArr2[i3];
                if (n22Var == ur2Var2.p && (fsVar = ur2Var2.o) != null) {
                    ur2Var2.o = null;
                    aa2.a aVar2 = aa2.m;
                    fsVar.resumeWith(m22Var);
                }
            }
            this.I.g();
        } catch (Throwable th) {
            this.I.g();
            throw th;
        }
    }

    public final void I0() {
        jo2 jo2Var = this.E;
        if (jo2Var != null) {
            jo2Var.w(new bm1("Pointer input was reset", 0));
            this.E = null;
        }
    }

    @Override // defpackage.w22
    public final void J(m22 m22Var, n22 n22Var, long j) {
        this.K = j;
        if (n22Var == n22.m) {
            this.F = m22Var;
        }
        o30 o30Var = null;
        if (this.E == null) {
            a50 u0 = u0();
            d50 d50Var = d50.m;
            this.E = z71.H(u0, null, new fj(10, o30Var, this), 1);
        }
        H0(m22Var, n22Var);
        List list = m22Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                m22Var = null;
                break;
            } else if (!s93.B((t22) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.J = m22Var;
    }

    @Override // defpackage.o90, defpackage.w22
    public final void b() {
        I0();
    }

    @Override // defpackage.ca0
    public final float d() {
        return s03.J(this).I.d();
    }

    @Override // defpackage.w22
    public final void e0() {
        I0();
    }

    @Override // defpackage.w22
    public final void h0() {
        m22 m22Var = this.J;
        if (m22Var == null) {
            return;
        }
        List list = m22Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((t22) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    t22 t22Var = (t22) list.get(i2);
                    long j = t22Var.a;
                    long j2 = t22Var.c;
                    long j3 = t22Var.b;
                    float f = t22Var.e;
                    boolean z = t22Var.d;
                    arrayList.add(new t22(j, j3, j2, false, f, j3, j2, z, z, t22Var.i, 0L));
                }
                m22 m22Var2 = new m22(arrayList, null);
                this.F = m22Var2;
                H0(m22Var2, n22.m);
                H0(m22Var2, n22.n);
                H0(m22Var2, n22.o);
                this.J = null;
                return;
            }
        }
    }

    @Override // defpackage.ca0
    public final float p() {
        return s03.J(this).I.p();
    }

    @Override // defpackage.ul1
    public final void z0() {
        I0();
    }
}
