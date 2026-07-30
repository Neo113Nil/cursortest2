package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class w31 extends u31 implements e51 {
    public k51 IAToe7bXGz4N;
    public long S2OOm9zPNm0h;
    public final pd1 VhhvGxCb8gfr;
    public LinkedHashMap ZbWwgt3aGe7A;
    public final l81 e6tOsSdd2EFb;
    public final x31 pnx5pC0XzaCw;

    public w31(pd1 pd1Var) {
        this.VhhvGxCb8gfr = pd1Var;
        wq0.Companion.getClass();
        this.S2OOm9zPNm0h = 0L;
        this.pnx5pC0XzaCw = new x31(this);
        l81 l81Var = oe1.PxuCJdSBwIXG;
        this.e6tOsSdd2EFb = new l81();
    }

    public static final void W7ceZOzvrRuI(w31 w31Var, k51 k51Var) {
        LinkedHashMap linkedHashMap;
        if (k51Var != null) {
            w31Var.fRTaYY6FBZcX((k51Var.TSizfFm2Yiuu() & 4294967295L) | (k51Var.e9gEMXR7LXtO() << 32));
        } else {
            ir0.Companion.getClass();
            w31Var.fRTaYY6FBZcX(0L);
        }
        if (!cs0.wdg6QnbFHrFF(w31Var.IAToe7bXGz4N, k51Var) && k51Var != null && ((((linkedHashMap = w31Var.ZbWwgt3aGe7A) != null && !linkedHashMap.isEmpty()) || !k51Var.PxuCJdSBwIXG().isEmpty()) && !cs0.wdg6QnbFHrFF(k51Var.PxuCJdSBwIXG(), w31Var.ZbWwgt3aGe7A))) {
            a41 a41Var = w31Var.VhhvGxCb8gfr.VhhvGxCb8gfr.ryVscX7ZL4Ux.BRwzKIf41E4i;
            a41Var.getClass();
            a41Var.pnx5pC0XzaCw.a92UlCVFR9N8();
            LinkedHashMap linkedHashMap2 = w31Var.ZbWwgt3aGe7A;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                w31Var.ZbWwgt3aGe7A = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(k51Var.PxuCJdSBwIXG());
        }
        w31Var.IAToe7bXGz4N = k51Var;
    }

    @Override // defpackage.u31
    public final void EP3hG58ROvHh() {
        hVNtCUZb4tYH(this.S2OOm9zPNm0h, 0.0f, null);
    }

    @Override // defpackage.u31
    public final u31 HGgCfDnf0ga9() {
        pd1 pd1Var = this.VhhvGxCb8gfr.ZbWwgt3aGe7A;
        if (pd1Var != null) {
            return pd1Var.vfcx0XMziUg4();
        }
        return null;
    }

    @Override // defpackage.u31
    public final bw0 HqMwxkFaipxD() {
        return this.pnx5pC0XzaCw;
    }

    @Override // defpackage.u31
    public final k51 IxJ9cAW40yOk() {
        k51 k51Var = this.IAToe7bXGz4N;
        if (k51Var != null) {
            return k51Var;
        }
        throw o0.a92UlCVFR9N8("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.u31
    public final vw0 OYiFbU3x63rc() {
        return this.VhhvGxCb8gfr.VhhvGxCb8gfr;
    }

    @Override // defpackage.u31, defpackage.vr0
    public final boolean VhhvGxCb8gfr() {
        return true;
    }

    public void X1HMmH2Ks65g() {
        IxJ9cAW40yOk().lS5Rgt96tfkO();
    }

    public final long Yadk4uqlxLy8(w31 w31Var, boolean z) {
        wq0.Companion.getClass();
        long j = 0;
        while (!this.equals(w31Var)) {
            if (!this.gPXPFXrUH4XX || !z) {
                j = wq0.TSizfFm2Yiuu(j, this.S2OOm9zPNm0h);
            }
            pd1 pd1Var = this.VhhvGxCb8gfr.ZbWwgt3aGe7A;
            pd1Var.getClass();
            this = pd1Var.vfcx0XMziUg4();
            this.getClass();
        }
        return j;
    }

    public final void fkblLSN2bAgv(long j) {
        if (!wq0.PxuCJdSBwIXG(this.S2OOm9zPNm0h, j)) {
            this.S2OOm9zPNm0h = j;
            pd1 pd1Var = this.VhhvGxCb8gfr;
            a41 a41Var = pd1Var.VhhvGxCb8gfr.ryVscX7ZL4Ux.BRwzKIf41E4i;
            if (a41Var != null) {
                a41Var.GlTbNTgfSMqy();
            }
            u31.Y2PHjkwWz56c(pd1Var);
        }
        if (this.XL4ISE6Oc65B) {
            return;
        }
        GlTbNTgfSMqy(IxJ9cAW40yOk());
    }

    @Override // defpackage.vr0
    public final cw0 getLayoutDirection() {
        return this.VhhvGxCb8gfr.VhhvGxCb8gfr.BjEWd04qc7Mw;
    }

    @Override // defpackage.em1
    public final void hVNtCUZb4tYH(long j, float f, le0 le0Var) {
        fkblLSN2bAgv(j);
        if (this.BRwzKIf41E4i) {
            return;
        }
        X1HMmH2Ks65g();
    }

    @Override // defpackage.hy
    public final float lS5Rgt96tfkO() {
        return this.VhhvGxCb8gfr.lS5Rgt96tfkO();
    }

    @Override // defpackage.u31
    public final u31 mFd1aGiJX24N() {
        pd1 pd1Var = this.VhhvGxCb8gfr.S2OOm9zPNm0h;
        if (pd1Var != null) {
            return pd1Var.vfcx0XMziUg4();
        }
        return null;
    }

    @Override // defpackage.hy
    public final float r3s1LDPKFs1S() {
        return this.VhhvGxCb8gfr.r3s1LDPKFs1S();
    }

    @Override // defpackage.u31
    public final boolean twy4zb2fCtqq() {
        return this.IAToe7bXGz4N != null;
    }

    @Override // defpackage.em1, defpackage.e51
    public final Object wdg6QnbFHrFF() {
        return this.VhhvGxCb8gfr.wdg6QnbFHrFF();
    }

    @Override // defpackage.u31
    public final long wnqUPcAvl7HT() {
        return this.S2OOm9zPNm0h;
    }
}
