package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class d12 extends t20 implements vu0, b32 {
    public final ab0 IXK6ba3ucyzm;
    public final fs JHNfcAUfKc4G;
    public nk2 KUoIVIumpKat;
    public k3 POWyO8hTM6YC;
    public l4 bEKsvqmvPh2y;
    public lw i68hK7ahKtgp;
    public b12 ngxnMNrpiKat;
    public final gp nxJAScVArhE9;
    public final lw wLFCmsViZrNT;
    public final l12 xbgXKYA2cIfu;
    public l71 yQRudnv4La6p;
    public final e0 zf8DYfih6EZu;

    public d12(k3 k3Var, lw lwVar, e81 e81Var, th1 th1Var, e12 e12Var, boolean z, boolean z2) {
        super(x02.PxuCJdSBwIXG, z, e81Var, th1Var);
        this.POWyO8hTM6YC = k3Var;
        this.i68hK7ahKtgp = lwVar;
        e0 e0Var = new e0(6);
        this.zf8DYfih6EZu = e0Var;
        lw lwVar2 = new lw(new bw(new b42(x02.Y1f8riQaR6yg)));
        this.wLFCmsViZrNT = lwVar2;
        k3 k3Var2 = this.POWyO8hTM6YC;
        lw lwVar3 = this.i68hK7ahKtgp;
        l12 l12Var = new l12(e12Var, k3Var2, lwVar3 == null ? lwVar2 : lwVar3, th1Var, z2, e0Var, this, new z02(this, 0));
        this.xbgXKYA2cIfu = l12Var;
        gp gpVar = new gp();
        gpVar.lS5Rgt96tfkO = l12Var;
        gpVar.PxuCJdSBwIXG = z;
        this.nxJAScVArhE9 = gpVar;
        cb0.Companion.getClass();
        ab0 ab0Var = new ab0(2, null, 10);
        W7ceZOzvrRuI(ab0Var);
        this.IXK6ba3ucyzm = ab0Var;
        fs fsVar = new fs(th1Var, l12Var, z2, new z02(this, 1));
        W7ceZOzvrRuI(fsVar);
        this.JHNfcAUfKc4G = fsVar;
        W7ceZOzvrRuI(new dd1(gpVar, e0Var));
        mf mfVar = new mf();
        mfVar.VhhvGxCb8gfr = fsVar;
        W7ceZOzvrRuI(mfVar);
    }

    @Override // defpackage.b32
    public final void D0aTLcX6Uhyo(l32 l32Var) {
        if (this.IAToe7bXGz4N && (this.bEKsvqmvPh2y == null || this.ngxnMNrpiKat == null)) {
            this.bEKsvqmvPh2y = new l4(14, this);
            this.ngxnMNrpiKat = new b12(this, null);
        }
        l4 l4Var = this.bEKsvqmvPh2y;
        if (l4Var != null) {
            iu0[] iu0VarArr = j32.PxuCJdSBwIXG;
            l32Var.PxuCJdSBwIXG(y22.Y1f8riQaR6yg, new nxJAScVArhE9(null, l4Var));
        }
        b12 b12Var = this.ngxnMNrpiKat;
        if (b12Var != null) {
            iu0[] iu0VarArr2 = j32.PxuCJdSBwIXG;
            l32Var.PxuCJdSBwIXG(y22.e9gEMXR7LXtO, b12Var);
        }
    }

    @Override // defpackage.t20, defpackage.do1
    public final void EpkonXwzFgDB(qn1 qn1Var, rn1 rn1Var, long j) {
        int i;
        int i2;
        List list = qn1Var.PxuCJdSBwIXG;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            if (((Boolean) this.pnx5pC0XzaCw.OPXfSBeufaJ8(new ho1(((ao1) list.get(i4)).OPXfSBeufaJ8))).booleanValue()) {
                super.EpkonXwzFgDB(qn1Var, rn1Var, j);
                break;
            }
            i4++;
        }
        if (this.jyegZNwi31qc == null) {
            pg0 pg0Var = new pg0(this);
            W7ceZOzvrRuI(pg0Var);
            this.jyegZNwi31qc = pg0Var;
        }
        if (this.IAToe7bXGz4N) {
            rn1 rn1Var2 = rn1.rtx2ld2ELZv4;
            bt btVar = null;
            l12 l12Var = this.xbgXKYA2cIfu;
            if (rn1Var == rn1Var2) {
                int i5 = qn1Var.a92UlCVFR9N8;
                un1.Companion.getClass();
                if (i5 == 6) {
                    if (this.yQRudnv4La6p == null) {
                        this.yQRudnv4La6p = new l71(l12Var, new i2(i3, ViewConfiguration.get(hq0.amuv7NJvPxHu(this).getContext())), new nn(2, this, d12.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), zv.zf8DYfih6EZu(this).rZjpSjn4zoMv);
                    }
                    l71 l71Var = this.yQRudnv4La6p;
                    if (l71Var != null) {
                        ru GlTbNTgfSMqy = GlTbNTgfSMqy();
                        if (l71Var.rtx2ld2ELZv4 == null) {
                            l71Var.rtx2ld2ELZv4 = fx1.KUoIVIumpKat(GlTbNTgfSMqy, null, new a92UlCVFR9N8(l71Var, btVar, 20), 3);
                        }
                    }
                }
            }
            l71 l71Var2 = this.yQRudnv4La6p;
            rn1 rn1Var3 = rn1.OPXfSBeufaJ8;
            if (l71Var2 != null) {
                int i6 = qn1Var.a92UlCVFR9N8;
                un1.Companion.getClass();
                if (i6 == 6) {
                    int size2 = list.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size2) {
                            if (rn1Var == rn1Var2 && l71Var2.Y1f8riQaR6yg) {
                                l71Var2.a92UlCVFR9N8(qn1Var);
                                zd1.PxuCJdSBwIXG(qn1Var);
                            }
                            if (rn1Var == rn1Var3 && !l71Var2.Y1f8riQaR6yg && l71Var2.a92UlCVFR9N8(qn1Var)) {
                                zd1.PxuCJdSBwIXG(qn1Var);
                            }
                        } else if (((ao1) list.get(i7)).lS5Rgt96tfkO()) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
            if (rn1Var == rn1Var2) {
                int i8 = qn1Var.a92UlCVFR9N8;
                un1.Companion.getClass();
                if (i8 == 10 || (i2 = qn1Var.a92UlCVFR9N8) == 11 || i2 == 12) {
                    if (this.KUoIVIumpKat == null) {
                        this.KUoIVIumpKat = new nk2(l12Var, new nn(2, this, d12.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), zv.zf8DYfih6EZu(this).rZjpSjn4zoMv);
                    }
                    nk2 nk2Var = this.KUoIVIumpKat;
                    if (nk2Var != null) {
                        ru GlTbNTgfSMqy2 = GlTbNTgfSMqy();
                        if (nk2Var.RAsUl2FVSrh6 == null) {
                            nk2Var.RAsUl2FVSrh6 = fx1.KUoIVIumpKat(GlTbNTgfSMqy2, null, new e4(nk2Var, null), 3);
                        }
                    }
                }
            }
            nk2 nk2Var2 = this.KUoIVIumpKat;
            if (nk2Var2 != null) {
                int i9 = qn1Var.a92UlCVFR9N8;
                un1.Companion.getClass();
                if (i9 == 10 || (i = qn1Var.a92UlCVFR9N8) == 11 || i == 12) {
                    int size3 = list.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        if (((ao1) list.get(i10)).lS5Rgt96tfkO()) {
                            return;
                        }
                    }
                    if (rn1Var == rn1Var2 && nk2Var2.Y1f8riQaR6yg) {
                        nk2Var2.Y1f8riQaR6yg(qn1Var);
                        zd1.PxuCJdSBwIXG(qn1Var);
                    }
                    if (rn1Var == rn1Var3 && !nk2Var2.Y1f8riQaR6yg && nk2Var2.Y1f8riQaR6yg(qn1Var)) {
                        zd1.PxuCJdSBwIXG(qn1Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.t20
    public final void HiC8volkyM7b(e20 e20Var) {
        fx1.KUoIVIumpKat(this.zf8DYfih6EZu.RAsUl2FVSrh6(), null, new a92UlCVFR9N8(e20Var, this, null, 28), 3);
    }

    @Override // defpackage.m61
    public final void OYiFbU3x63rc() {
        if (this.S9EYkSpbGuxq) {
            hy hyVar = zv.zf8DYfih6EZu(this).rZjpSjn4zoMv;
            lw lwVar = this.wLFCmsViZrNT;
            lwVar.getClass();
            lwVar.PxuCJdSBwIXG = new bw(new b42(hyVar));
        }
        l71 l71Var = this.yQRudnv4La6p;
        if (l71Var != null) {
            l71Var.TSizfFm2Yiuu = zv.zf8DYfih6EZu(this).rZjpSjn4zoMv;
        }
        nk2 nk2Var = this.KUoIVIumpKat;
        if (nk2Var != null) {
            nk2Var.TSizfFm2Yiuu = zv.zf8DYfih6EZu(this).rZjpSjn4zoMv;
        }
    }

    @Override // defpackage.tx, defpackage.do1
    public final void PxuCJdSBwIXG() {
        JTxCbbCwomzt();
        if (this.S9EYkSpbGuxq) {
            hy hyVar = zv.zf8DYfih6EZu(this).rZjpSjn4zoMv;
            lw lwVar = this.wLFCmsViZrNT;
            lwVar.getClass();
            lwVar.PxuCJdSBwIXG = new bw(new b42(hyVar));
        }
        l71 l71Var = this.yQRudnv4La6p;
        if (l71Var != null) {
            l71Var.TSizfFm2Yiuu = zv.zf8DYfih6EZu(this).rZjpSjn4zoMv;
        }
        nk2 nk2Var = this.KUoIVIumpKat;
        if (nk2Var != null) {
            nk2Var.TSizfFm2Yiuu = zv.zf8DYfih6EZu(this).rZjpSjn4zoMv;
        }
    }

    @Override // defpackage.t20
    public final Object TVHukqbqS4tB(s20 s20Var, s20 s20Var2) {
        l12 l12Var = this.xbgXKYA2cIfu;
        Object a92UlCVFR9N8 = l12Var.a92UlCVFR9N8(h91.OPXfSBeufaJ8, new rtx2ld2ELZv4(s20Var, l12Var, null, 15), s20Var2);
        return a92UlCVFR9N8 == su.rtx2ld2ELZv4 ? a92UlCVFR9N8 : no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.t20
    public final boolean c() {
        l12 l12Var = this.xbgXKYA2cIfu;
        if (l12Var.PxuCJdSBwIXG.lS5Rgt96tfkO()) {
            return true;
        }
        k3 k3Var = l12Var.lS5Rgt96tfkO;
        if (k3Var == null) {
            return false;
        }
        c40 c40Var = k3Var.TSizfFm2Yiuu;
        EdgeEffect edgeEffect = c40Var.Y1f8riQaR6yg;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? d9.TSizfFm2Yiuu(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c40Var.e9gEMXR7LXtO;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? d9.TSizfFm2Yiuu(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c40Var.a92UlCVFR9N8;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? d9.TSizfFm2Yiuu(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c40Var.RAsUl2FVSrh6;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? d9.TSizfFm2Yiuu(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void f(k3 k3Var, lw lwVar, e81 e81Var, th1 th1Var, e12 e12Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.IAToe7bXGz4N != z) {
            this.nxJAScVArhE9.PxuCJdSBwIXG = z;
            z3 = true;
        } else {
            z3 = false;
        }
        lw lwVar2 = lwVar == null ? this.wLFCmsViZrNT : lwVar;
        l12 l12Var = this.xbgXKYA2cIfu;
        if (!cs0.wdg6QnbFHrFF(l12Var.PxuCJdSBwIXG, e12Var)) {
            l12Var.PxuCJdSBwIXG = e12Var;
            z5 = true;
        }
        l12Var.lS5Rgt96tfkO = k3Var;
        if (l12Var.Y1f8riQaR6yg != th1Var) {
            l12Var.Y1f8riQaR6yg = th1Var;
            z5 = true;
        }
        if (l12Var.e9gEMXR7LXtO != z2) {
            l12Var.e9gEMXR7LXtO = z2;
        } else {
            z4 = z5;
        }
        l12Var.TSizfFm2Yiuu = lwVar2;
        l12Var.a92UlCVFR9N8 = this.zf8DYfih6EZu;
        fs fsVar = this.JHNfcAUfKc4G;
        fsVar.VhhvGxCb8gfr = th1Var;
        fsVar.ZbWwgt3aGe7A = z2;
        this.POWyO8hTM6YC = k3Var;
        this.i68hK7ahKtgp = lwVar;
        vz1 vz1Var = x02.PxuCJdSBwIXG;
        th1 th1Var2 = l12Var.Y1f8riQaR6yg;
        th1 th1Var3 = th1.rtx2ld2ELZv4;
        if (th1Var2 != th1Var3) {
            th1Var3 = th1.OPXfSBeufaJ8;
        }
        e(vz1Var, z, e81Var, th1Var3, z4);
        if (z3) {
            this.bEKsvqmvPh2y = null;
            this.ngxnMNrpiKat = null;
            th0.S2OOm9zPNm0h(this);
        }
    }

    @Override // defpackage.m61
    public final boolean mFd1aGiJX24N() {
        return false;
    }

    @Override // defpackage.vu0
    public final boolean x50lh2ztY7Y5(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.vu0
    public final boolean zf8DYfih6EZu(KeyEvent keyEvent) {
        long floatToRawIntBits;
        if (this.IAToe7bXGz4N) {
            long XL4ISE6Oc65B = jh0.XL4ISE6Oc65B(keyEvent);
            ou0.Companion.getClass();
            if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.kpCQ9veP6n3I) || ou0.PxuCJdSBwIXG(ki0.TSizfFm2Yiuu(keyEvent.getKeyCode()), ou0.aF05bpZJlKEP)) {
                int S9EYkSpbGuxq = jh0.S9EYkSpbGuxq(keyEvent);
                su0.Companion.getClass();
                if (S9EYkSpbGuxq == 2 && !keyEvent.isCtrlPressed()) {
                    boolean z = this.xbgXKYA2cIfu.Y1f8riQaR6yg == th1.rtx2ld2ELZv4;
                    fs fsVar = this.JHNfcAUfKc4G;
                    if (z) {
                        int X1HMmH2Ks65g = (int) (fsVar.X1HMmH2Ks65g() & 4294967295L);
                        floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(ou0.PxuCJdSBwIXG(ki0.TSizfFm2Yiuu(keyEvent.getKeyCode()), ou0.aF05bpZJlKEP) ? X1HMmH2Ks65g : -X1HMmH2Ks65g));
                    } else {
                        int X1HMmH2Ks65g2 = (int) (fsVar.X1HMmH2Ks65g() >> 32);
                        floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(ou0.PxuCJdSBwIXG(ki0.TSizfFm2Yiuu(keyEvent.getKeyCode()), ou0.aF05bpZJlKEP) ? X1HMmH2Ks65g2 : -X1HMmH2Ks65g2) << 32);
                    }
                    fx1.KUoIVIumpKat(GlTbNTgfSMqy(), null, new b12(this, floatToRawIntBits, null, 0), 3);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.t20
    public final void BUo4iHFctTZi(long j) {
    }
}
