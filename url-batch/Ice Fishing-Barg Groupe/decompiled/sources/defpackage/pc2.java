package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pc2 extends m61 implements eo1, hy, do1 {
    public qn1 IAToe7bXGz4N = lc2.PxuCJdSBwIXG;
    public Object S2OOm9zPNm0h;
    public Object VhhvGxCb8gfr;
    public PointerInputEventHandler ZbWwgt3aGe7A;
    public final f91 aF05bpZJlKEP;
    public final f91 e6tOsSdd2EFb;
    public final f91 jyegZNwi31qc;
    public qn1 kpCQ9veP6n3I;
    public z82 pnx5pC0XzaCw;
    public long rZjpSjn4zoMv;

    public pc2(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.VhhvGxCb8gfr = obj;
        this.S2OOm9zPNm0h = obj2;
        this.ZbWwgt3aGe7A = pointerInputEventHandler;
        f91 f91Var = new f91(new oc2[16]);
        this.e6tOsSdd2EFb = f91Var;
        this.jyegZNwi31qc = f91Var;
        this.aF05bpZJlKEP = new f91(new oc2[16]);
        ir0.Companion.getClass();
        this.rZjpSjn4zoMv = 0L;
    }

    @Override // defpackage.do1
    public final void EpkonXwzFgDB(qn1 qn1Var, rn1 rn1Var, long j) {
        this.rZjpSjn4zoMv = j;
        if (rn1Var == rn1.rtx2ld2ELZv4) {
            this.IAToe7bXGz4N = qn1Var;
        }
        bt btVar = null;
        if (this.pnx5pC0XzaCw == null) {
            this.pnx5pC0XzaCw = fx1.KUoIVIumpKat(GlTbNTgfSMqy(), null, new ew(this, btVar, 12), 1);
        }
        X1HMmH2Ks65g(qn1Var, rn1Var);
        List list = qn1Var.PxuCJdSBwIXG;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                qn1Var = null;
                break;
            } else if (!ni0.x50lh2ztY7Y5((ao1) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.kpCQ9veP6n3I = qn1Var;
    }

    @Override // defpackage.m61
    public final void IxJ9cAW40yOk() {
        fkblLSN2bAgv();
    }

    @Override // defpackage.do1
    public final void JTxCbbCwomzt() {
        qn1 qn1Var = this.kpCQ9veP6n3I;
        if (qn1Var == null) {
            return;
        }
        List list = qn1Var.PxuCJdSBwIXG;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ao1) list.get(i)).Y1f8riQaR6yg) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ao1 ao1Var = (ao1) list.get(i2);
                    long j = ao1Var.PxuCJdSBwIXG;
                    long j2 = ao1Var.TSizfFm2Yiuu;
                    long j3 = ao1Var.lS5Rgt96tfkO;
                    float f = ao1Var.e9gEMXR7LXtO;
                    boolean z = ao1Var.Y1f8riQaR6yg;
                    int i3 = ao1Var.OPXfSBeufaJ8;
                    bf1.Companion.getClass();
                    arrayList.add(new ao1(j, j3, j2, false, f, j3, j2, z, z, i3, 0L, 1.0f, 0L));
                }
                qn1 qn1Var2 = new qn1(arrayList, null);
                this.IAToe7bXGz4N = qn1Var2;
                X1HMmH2Ks65g(qn1Var2, rn1.rtx2ld2ELZv4);
                X1HMmH2Ks65g(qn1Var2, rn1.OPXfSBeufaJ8);
                X1HMmH2Ks65g(qn1Var2, rn1.wdg6QnbFHrFF);
                this.kpCQ9veP6n3I = null;
                return;
            }
        }
    }

    @Override // defpackage.tx, defpackage.do1
    public final void PxuCJdSBwIXG() {
        fkblLSN2bAgv();
    }

    public final Object W7ceZOzvrRuI(pe0 pe0Var, bt btVar) {
        bi biVar = new bi(1, ng0.IAToe7bXGz4N(btVar));
        biVar.ZbWwgt3aGe7A();
        oc2 oc2Var = new oc2(this, biVar);
        synchronized (this.jyegZNwi31qc) {
            this.e6tOsSdd2EFb.lS5Rgt96tfkO(oc2Var);
            new my1(ng0.IAToe7bXGz4N(ng0.QrzZRwfaDlRX(oc2Var, oc2Var, pe0Var))).RAsUl2FVSrh6(no2.PxuCJdSBwIXG);
        }
        biVar.IAToe7bXGz4N(new y(22, oc2Var));
        return biVar.VhhvGxCb8gfr();
    }

    public final void X1HMmH2Ks65g(qn1 qn1Var, rn1 rn1Var) {
        bi biVar;
        bi biVar2;
        synchronized (this.jyegZNwi31qc) {
            f91 f91Var = this.aF05bpZJlKEP;
            f91Var.TSizfFm2Yiuu(f91Var.wdg6QnbFHrFF, this.e6tOsSdd2EFb);
        }
        try {
            int ordinal = rn1Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    f91 f91Var2 = this.aF05bpZJlKEP;
                    int i = f91Var2.wdg6QnbFHrFF - 1;
                    Object[] objArr = f91Var2.rtx2ld2ELZv4;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            oc2 oc2Var = (oc2) objArr[i];
                            if (rn1Var == oc2Var.dgRBjINgWbAK && (biVar2 = oc2Var.wdg6QnbFHrFF) != null) {
                                oc2Var.wdg6QnbFHrFF = null;
                                biVar2.RAsUl2FVSrh6(qn1Var);
                            }
                            i--;
                        }
                    }
                    this.aF05bpZJlKEP.RAsUl2FVSrh6();
                }
                if (ordinal != 2) {
                    throw new tm();
                }
            }
            f91 f91Var3 = this.aF05bpZJlKEP;
            Object[] objArr2 = f91Var3.rtx2ld2ELZv4;
            int i2 = f91Var3.wdg6QnbFHrFF;
            for (int i3 = 0; i3 < i2; i3++) {
                oc2 oc2Var2 = (oc2) objArr2[i3];
                if (rn1Var == oc2Var2.dgRBjINgWbAK && (biVar = oc2Var2.wdg6QnbFHrFF) != null) {
                    oc2Var2.wdg6QnbFHrFF = null;
                    biVar.RAsUl2FVSrh6(qn1Var);
                }
            }
            this.aF05bpZJlKEP.RAsUl2FVSrh6();
        } catch (Throwable th) {
            this.aF05bpZJlKEP.RAsUl2FVSrh6();
            throw th;
        }
    }

    public final void fkblLSN2bAgv() {
        z82 z82Var = this.pnx5pC0XzaCw;
        if (z82Var != null) {
            z82Var.e6tOsSdd2EFb(new q61("Pointer input was reset", 2));
            this.pnx5pC0XzaCw = null;
        }
    }

    @Override // defpackage.hy
    public final float lS5Rgt96tfkO() {
        return zv.zf8DYfih6EZu(this).rZjpSjn4zoMv.lS5Rgt96tfkO();
    }

    @Override // defpackage.do1
    public final void ngxnMNrpiKat() {
        fkblLSN2bAgv();
    }

    @Override // defpackage.hy
    public final float r3s1LDPKFs1S() {
        return zv.zf8DYfih6EZu(this).rZjpSjn4zoMv.r3s1LDPKFs1S();
    }
}
