package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class pd1 extends u31 implements e51, bw0, fi1 {
    public l81 BjEWd04qc7Mw;
    public wv0 EpkonXwzFgDB;
    public boolean IAToe7bXGz4N;
    public u81 J54yh1s3n4Aq;
    public final od1 POWyO8hTM6YC;
    public gi Pf0ThKz3j5YS;
    public pd1 S2OOm9zPNm0h;
    public final vw0 VhhvGxCb8gfr;
    public pd1 ZbWwgt3aGe7A;
    public cw0 aF05bpZJlKEP;
    public ph0 amuv7NJvPxHu;
    public le0 e6tOsSdd2EFb;
    public n2 gGoUzNp9JO5I;
    public boolean i68hK7ahKtgp;
    public hy jyegZNwi31qc;
    public float kpCQ9veP6n3I = 0.8f;
    public boolean nLZGh9p8gVSu;
    public long ozEBbv0hFTAB;
    public boolean pnx5pC0XzaCw;
    public k51 rZjpSjn4zoMv;
    public boolean ryVscX7ZL4Ux;
    public float tmVwIGCQF4zR;
    public z42 xfACYKDMU6Dj;
    public ci1 zf8DYfih6EZu;
    public static final md1 Companion = new md1();
    public static final dw1 wLFCmsViZrNT = new dw1();
    public static final wv0 xbgXKYA2cIfu = new wv0();
    public static final float[] nxJAScVArhE9 = d51.PxuCJdSBwIXG();
    public static final ld1 IXK6ba3ucyzm = new ld1();
    public static final fb0 JHNfcAUfKc4G = new fb0(7);

    public pd1(vw0 vw0Var) {
        this.VhhvGxCb8gfr = vw0Var;
        this.jyegZNwi31qc = vw0Var.rZjpSjn4zoMv;
        this.aF05bpZJlKEP = vw0Var.BjEWd04qc7Mw;
        wq0.Companion.getClass();
        this.ozEBbv0hFTAB = 0L;
        this.xfACYKDMU6Dj = b51.x50lh2ztY7Y5;
        this.POWyO8hTM6YC = new od1(this, 1);
    }

    public static pd1 q(bw0 bw0Var) {
        pd1 pd1Var;
        x31 x31Var = bw0Var instanceof x31 ? (x31) bw0Var : null;
        if (x31Var != null && (pd1Var = x31Var.rtx2ld2ELZv4.VhhvGxCb8gfr) != null) {
            return pd1Var;
        }
        bw0Var.getClass();
        return (pd1) bw0Var;
    }

    public final m61 BUo4iHFctTZi(int i) {
        boolean RAsUl2FVSrh6 = qd1.RAsUl2FVSrh6(i);
        m61 kRWHK87H9qm4 = kRWHK87H9qm4();
        if (!RAsUl2FVSrh6 && (kRWHK87H9qm4 = kRWHK87H9qm4.x50lh2ztY7Y5) == null) {
            return null;
        }
        for (m61 HiC8volkyM7b = HiC8volkyM7b(RAsUl2FVSrh6); HiC8volkyM7b != null && (HiC8volkyM7b.dgRBjINgWbAK & i) != 0; HiC8volkyM7b = HiC8volkyM7b.cpQdD2nAriOS) {
            if ((HiC8volkyM7b.wdg6QnbFHrFF & i) != 0) {
                return HiC8volkyM7b;
            }
            if (HiC8volkyM7b == kRWHK87H9qm4) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.bw0
    public final long BjEWd04qc7Mw(bw0 bw0Var, long j) {
        if (bw0Var instanceof x31) {
            x31 x31Var = (x31) bw0Var;
            x31Var.rtx2ld2ELZv4.VhhvGxCb8gfr.e();
            return x31Var.BjEWd04qc7Mw(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        pd1 q = q(bw0Var);
        q.e();
        pd1 TVHukqbqS4tB = TVHukqbqS4tB(q);
        while (q != TVHukqbqS4tB) {
            ci1 ci1Var = q.zf8DYfih6EZu;
            if (ci1Var != null) {
                uh0 uh0Var = (uh0) ci1Var;
                float[] lS5Rgt96tfkO = uh0Var.lS5Rgt96tfkO();
                if (!uh0Var.IAToe7bXGz4N) {
                    j = d51.lS5Rgt96tfkO(j, lS5Rgt96tfkO);
                }
            }
            j = vi0.zf8DYfih6EZu(j, q.ozEBbv0hFTAB);
            q = q.ZbWwgt3aGe7A;
            q.getClass();
        }
        return X1HMmH2Ks65g(TVHukqbqS4tB, j);
    }

    @Override // defpackage.u31
    public final void EP3hG58ROvHh() {
        hVNtCUZb4tYH(this.ozEBbv0hFTAB, this.tmVwIGCQF4zR, this.e6tOsSdd2EFb);
    }

    @Override // defpackage.bw0
    public final void EpkonXwzFgDB(bw0 bw0Var, float[] fArr) {
        pd1 q = q(bw0Var);
        q.e();
        pd1 TVHukqbqS4tB = TVHukqbqS4tB(q);
        d51.Y1f8riQaR6yg(fArr);
        q.t(TVHukqbqS4tB, fArr);
        s(TVHukqbqS4tB, fArr);
    }

    public final void FT2GK7JK5Ma2(gi giVar, ph0 ph0Var) {
        pd1 pd1Var;
        gi giVar2;
        ph0 ph0Var2;
        m61 BUo4iHFctTZi = BUo4iHFctTZi(4);
        if (BUo4iHFctTZi == null) {
            k(giVar, ph0Var);
            return;
        }
        vw0 vw0Var = this.VhhvGxCb8gfr;
        vw0Var.getClass();
        xw0 sharedDrawScope = ((r1) yw0.PxuCJdSBwIXG(vw0Var)).getSharedDrawScope();
        long gGoUzNp9JO5I = kj0.gGoUzNp9JO5I(this.wdg6QnbFHrFF);
        sharedDrawScope.getClass();
        f91 f91Var = null;
        while (BUo4iHFctTZi != null) {
            if (BUo4iHFctTZi instanceof i30) {
                pd1Var = this;
                giVar2 = giVar;
                ph0Var2 = ph0Var;
                sharedDrawScope.TSizfFm2Yiuu(giVar2, gGoUzNp9JO5I, pd1Var, (i30) BUo4iHFctTZi, ph0Var2);
            } else {
                pd1Var = this;
                giVar2 = giVar;
                ph0Var2 = ph0Var;
                if ((BUo4iHFctTZi.wdg6QnbFHrFF & 4) != 0 && (BUo4iHFctTZi instanceof ux)) {
                    int i = 0;
                    for (m61 m61Var = ((ux) BUo4iHFctTZi).S2OOm9zPNm0h; m61Var != null; m61Var = m61Var.cpQdD2nAriOS) {
                        if ((m61Var.wdg6QnbFHrFF & 4) != 0) {
                            i++;
                            if (i == 1) {
                                BUo4iHFctTZi = m61Var;
                            } else {
                                if (f91Var == null) {
                                    f91Var = new f91(new m61[16]);
                                }
                                if (BUo4iHFctTZi != null) {
                                    f91Var.lS5Rgt96tfkO(BUo4iHFctTZi);
                                    BUo4iHFctTZi = null;
                                }
                                f91Var.lS5Rgt96tfkO(m61Var);
                            }
                        }
                    }
                    if (i == 1) {
                        giVar = giVar2;
                        this = pd1Var;
                        ph0Var = ph0Var2;
                    }
                }
            }
            BUo4iHFctTZi = zv.dgRBjINgWbAK(f91Var);
            giVar = giVar2;
            this = pd1Var;
            ph0Var = ph0Var2;
        }
    }

    @Override // defpackage.u31
    public final u31 HGgCfDnf0ga9() {
        return this.ZbWwgt3aGe7A;
    }

    public final m61 HiC8volkyM7b(boolean z) {
        m61 kRWHK87H9qm4;
        kd1 kd1Var = this.VhhvGxCb8gfr.nLZGh9p8gVSu;
        if (kd1Var.Y1f8riQaR6yg == this) {
            return kd1Var.a92UlCVFR9N8;
        }
        pd1 pd1Var = this.ZbWwgt3aGe7A;
        if (!z) {
            if (pd1Var != null) {
                return pd1Var.kRWHK87H9qm4();
            }
            return null;
        }
        if (pd1Var == null || (kRWHK87H9qm4 = pd1Var.kRWHK87H9qm4()) == null) {
            return null;
        }
        return kRWHK87H9qm4.cpQdD2nAriOS;
    }

    @Override // defpackage.u31
    public final k51 IxJ9cAW40yOk() {
        k51 k51Var = this.rZjpSjn4zoMv;
        if (k51Var != null) {
            return k51Var;
        }
        u9.rtx2ld2ELZv4("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public final void MDTGUQSX7PXD(gi giVar, ph0 ph0Var) {
        boolean z;
        float f;
        ci1 ci1Var = this.zf8DYfih6EZu;
        if (ci1Var == null) {
            long j = this.ozEBbv0hFTAB;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            giVar.Y1f8riQaR6yg(f2, f3);
            FT2GK7JK5Ma2(giVar, ph0Var);
            giVar.Y1f8riQaR6yg(-f2, -f3);
            return;
        }
        uh0 uh0Var = (uh0) ci1Var;
        ji jiVar = uh0Var.EcgxDIVH5in8;
        uh0Var.RAsUl2FVSrh6();
        boolean z2 = false;
        uh0Var.e6tOsSdd2EFb = uh0Var.rtx2ld2ELZv4.PxuCJdSBwIXG.ozEBbv0hFTAB() > 0.0f;
        m9 m9Var = jiVar.OPXfSBeufaJ8;
        m9Var.kpCQ9veP6n3I(giVar);
        m9Var.wdg6QnbFHrFF = ph0Var;
        ph0 ph0Var2 = uh0Var.rtx2ld2ELZv4;
        gi gPXPFXrUH4XX = jiVar.rZjpSjn4zoMv().gPXPFXrUH4XX();
        ph0 ph0Var3 = (ph0) jiVar.rZjpSjn4zoMv().wdg6QnbFHrFF;
        sh0 sh0Var = ph0Var2.PxuCJdSBwIXG;
        if (ph0Var2.RfyTYNmI9Srp) {
            return;
        }
        ph0Var2.PxuCJdSBwIXG();
        if (!sh0Var.tmVwIGCQF4zR()) {
            try {
                ph0Var2.PxuCJdSBwIXG.S2OOm9zPNm0h(ph0Var2.lS5Rgt96tfkO, ph0Var2.TSizfFm2Yiuu, ph0Var2, ph0Var2.e9gEMXR7LXtO);
            } catch (Throwable unused) {
            }
        }
        boolean z3 = sh0Var.ozEBbv0hFTAB() > 0.0f;
        if (z3) {
            gPXPFXrUH4XX.RfyTYNmI9Srp();
        }
        Canvas PxuCJdSBwIXG = u0.PxuCJdSBwIXG(gPXPFXrUH4XX);
        boolean isHardwareAccelerated = PxuCJdSBwIXG.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j2 = ph0Var2.EcgxDIVH5in8;
            float f4 = (int) (j2 >> 32);
            float f5 = (int) (j2 & 4294967295L);
            long j3 = ph0Var2.S9EYkSpbGuxq;
            float f6 = ((int) (j3 >> 32)) + f4;
            float f7 = f5 + ((int) (j3 & 4294967295L));
            float PxuCJdSBwIXG2 = sh0Var.PxuCJdSBwIXG();
            jl ZbWwgt3aGe7A = sh0Var.ZbWwgt3aGe7A();
            int xfACYKDMU6Dj = sh0Var.xfACYKDMU6Dj();
            if (PxuCJdSBwIXG2 >= 1.0f) {
                sd.Companion.getClass();
                if (xfACYKDMU6Dj == 3 && ZbWwgt3aGe7A == null) {
                    int S9EYkSpbGuxq = sh0Var.S9EYkSpbGuxq();
                    rp.Companion.getClass();
                    if (S9EYkSpbGuxq != 1) {
                        PxuCJdSBwIXG.save();
                        f = f4;
                        PxuCJdSBwIXG.translate(f, f5);
                        PxuCJdSBwIXG.concat(sh0Var.aF05bpZJlKEP());
                    }
                }
            }
            j4 j4Var = ph0Var2.gPXPFXrUH4XX;
            if (j4Var == null) {
                j4Var = ov2.OPXfSBeufaJ8();
                ph0Var2.gPXPFXrUH4XX = j4Var;
            }
            j4Var.a92UlCVFR9N8(PxuCJdSBwIXG2);
            j4Var.RAsUl2FVSrh6(xfACYKDMU6Dj);
            j4Var.OPXfSBeufaJ8(ZbWwgt3aGe7A);
            f = f4;
            PxuCJdSBwIXG.saveLayer(f, f5, f6, f7, (Paint) j4Var.TSizfFm2Yiuu);
            PxuCJdSBwIXG.translate(f, f5);
            PxuCJdSBwIXG.concat(sh0Var.aF05bpZJlKEP());
        }
        boolean z4 = !isHardwareAccelerated && ph0Var2.S2OOm9zPNm0h;
        if (z4) {
            gPXPFXrUH4XX.wdg6QnbFHrFF();
            th0 Y1f8riQaR6yg = ph0Var2.Y1f8riQaR6yg();
            if (Y1f8riQaR6yg instanceof xh1) {
                gi.OPXfSBeufaJ8(gPXPFXrUH4XX, ((xh1) Y1f8riQaR6yg).TSizfFm2Yiuu);
            } else if (Y1f8riQaR6yg instanceof yh1) {
                r4 r4Var = ph0Var2.cpQdD2nAriOS;
                if (r4Var != null) {
                    r4Var.PxuCJdSBwIXG.rewind();
                } else {
                    r4Var = t4.PxuCJdSBwIXG();
                    ph0Var2.cpQdD2nAriOS = r4Var;
                }
                yj1.TSizfFm2Yiuu(r4Var, ((yh1) Y1f8riQaR6yg).TSizfFm2Yiuu);
                pk.Companion.getClass();
                gPXPFXrUH4XX.BRwzKIf41E4i(r4Var);
            } else if (!(Y1f8riQaR6yg instanceof wh1)) {
                u9.gPXPFXrUH4XX();
                return;
            } else {
                yj1 yj1Var = ((wh1) Y1f8riQaR6yg).TSizfFm2Yiuu;
                pk.Companion.getClass();
                gPXPFXrUH4XX.BRwzKIf41E4i(yj1Var);
            }
        }
        if (ph0Var3 != null) {
            uj ujVar = ph0Var3.XL4ISE6Oc65B;
            if (!ujVar.PxuCJdSBwIXG) {
                dp0.PxuCJdSBwIXG("Only add dependencies during a tracking");
            }
            w81 w81Var = (w81) ujVar.Y1f8riQaR6yg;
            if (w81Var != null) {
                w81Var.PxuCJdSBwIXG(ph0Var2);
            } else if (((ph0) ujVar.lS5Rgt96tfkO) != null) {
                w81 w81Var2 = d02.PxuCJdSBwIXG;
                w81 w81Var3 = new w81();
                ph0 ph0Var4 = (ph0) ujVar.lS5Rgt96tfkO;
                ph0Var4.getClass();
                w81Var3.PxuCJdSBwIXG(ph0Var4);
                w81Var3.PxuCJdSBwIXG(ph0Var2);
                ujVar.Y1f8riQaR6yg = w81Var3;
                ujVar.lS5Rgt96tfkO = null;
            } else {
                ujVar.lS5Rgt96tfkO = ph0Var2;
            }
            w81 w81Var4 = (w81) ujVar.e9gEMXR7LXtO;
            if (w81Var4 != null) {
                z2 = !w81Var4.x50lh2ztY7Y5(ph0Var2);
            } else if (((ph0) ujVar.TSizfFm2Yiuu) != ph0Var2) {
                z2 = true;
            } else {
                ujVar.TSizfFm2Yiuu = null;
            }
            if (z2) {
                ph0Var2.BRwzKIf41E4i++;
            }
        }
        if (((t0) gPXPFXrUH4XX).PxuCJdSBwIXG.isHardwareAccelerated()) {
            z = z4;
            sh0Var.RfyTYNmI9Srp(gPXPFXrUH4XX);
        } else {
            ji jiVar2 = ph0Var2.QrzZRwfaDlRX;
            if (jiVar2 == null) {
                jiVar2 = new ji();
                ph0Var2.QrzZRwfaDlRX = jiVar2;
            }
            m9 m9Var2 = jiVar2.OPXfSBeufaJ8;
            hy hyVar = ph0Var2.lS5Rgt96tfkO;
            cw0 cw0Var = ph0Var2.TSizfFm2Yiuu;
            long gGoUzNp9JO5I = kj0.gGoUzNp9JO5I(ph0Var2.S9EYkSpbGuxq);
            ii iiVar = ((ji) m9Var2.dgRBjINgWbAK).rtx2ld2ELZv4;
            hy hyVar2 = iiVar.PxuCJdSBwIXG;
            cw0 cw0Var2 = iiVar.lS5Rgt96tfkO;
            gi gPXPFXrUH4XX2 = m9Var2.gPXPFXrUH4XX();
            long S2OOm9zPNm0h = m9Var2.S2OOm9zPNm0h();
            z = z4;
            ph0 ph0Var5 = (ph0) m9Var2.wdg6QnbFHrFF;
            m9Var2.rZjpSjn4zoMv(hyVar);
            m9Var2.BjEWd04qc7Mw(cw0Var);
            m9Var2.kpCQ9veP6n3I(gPXPFXrUH4XX);
            m9Var2.ozEBbv0hFTAB(gGoUzNp9JO5I);
            m9Var2.wdg6QnbFHrFF = ph0Var2;
            gPXPFXrUH4XX.wdg6QnbFHrFF();
            try {
                ph0Var2.TSizfFm2Yiuu(jiVar2);
            } finally {
                gPXPFXrUH4XX.RAsUl2FVSrh6();
                m9Var2.rZjpSjn4zoMv(hyVar2);
                m9Var2.BjEWd04qc7Mw(cw0Var2);
                m9Var2.kpCQ9veP6n3I(gPXPFXrUH4XX2);
                m9Var2.ozEBbv0hFTAB(S2OOm9zPNm0h);
                m9Var2.wdg6QnbFHrFF = ph0Var5;
            }
        }
        if (z) {
            gPXPFXrUH4XX.RAsUl2FVSrh6();
        }
        if (z3) {
            gPXPFXrUH4XX.cpQdD2nAriOS();
        }
        if (isHardwareAccelerated) {
            return;
        }
        PxuCJdSBwIXG.restore();
    }

    @Override // defpackage.bw0
    public final long OPXfSBeufaJ8(long j) {
        long Pf0ThKz3j5YS = Pf0ThKz3j5YS(j);
        r1 r1Var = (r1) yw0.PxuCJdSBwIXG(this.VhhvGxCb8gfr);
        r1Var.kpCQ9veP6n3I();
        return d51.lS5Rgt96tfkO(Pf0ThKz3j5YS, r1Var.JTxCbbCwomzt);
    }

    @Override // defpackage.u31
    public final vw0 OYiFbU3x63rc() {
        return this.VhhvGxCb8gfr;
    }

    public final void P6VAkUObIv30(m61 m61Var, nd1 nd1Var, long j, zj0 zj0Var, int i, boolean z) {
        if (m61Var == null) {
            b(nd1Var, j, zj0Var, i, z);
            return;
        }
        if (!nd1Var.RAsUl2FVSrh6(m61Var)) {
            P6VAkUObIv30(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i, z);
            return;
        }
        int i2 = zj0Var.wdg6QnbFHrFF;
        p81 p81Var = zj0Var.rtx2ld2ELZv4;
        zj0Var.lS5Rgt96tfkO(i2 + 1, p81Var.lS5Rgt96tfkO);
        zj0Var.wdg6QnbFHrFF++;
        p81Var.PxuCJdSBwIXG(m61Var);
        zj0Var.OPXfSBeufaJ8.PxuCJdSBwIXG(ng0.PxuCJdSBwIXG(-1.0f, z, false));
        P6VAkUObIv30(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i, z);
        zj0Var.wdg6QnbFHrFF = i2;
    }

    @Override // defpackage.bw0
    public final long Pf0ThKz3j5YS(long j) {
        if (!kRWHK87H9qm4().S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("LayoutCoordinate operations are only valid when isAttached is true");
        }
        e();
        while (this != null) {
            vw0 vw0Var = this.VhhvGxCb8gfr;
            if (this == vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg && !vw0Var.wdg6QnbFHrFF) {
                long lS5Rgt96tfkO = ((r1) yw0.PxuCJdSBwIXG(vw0Var)).getRectManager().lS5Rgt96tfkO(vw0Var);
                wq0.Companion.getClass();
                if (!wq0.PxuCJdSBwIXG(lS5Rgt96tfkO, 9223372034707292159L)) {
                    return vi0.zf8DYfih6EZu(j, lS5Rgt96tfkO);
                }
            }
            ci1 ci1Var = this.zf8DYfih6EZu;
            if (ci1Var != null) {
                uh0 uh0Var = (uh0) ci1Var;
                float[] lS5Rgt96tfkO2 = uh0Var.lS5Rgt96tfkO();
                if (!uh0Var.IAToe7bXGz4N) {
                    j = d51.lS5Rgt96tfkO(j, lS5Rgt96tfkO2);
                }
            }
            j = vi0.zf8DYfih6EZu(j, this.ozEBbv0hFTAB);
            this = this.ZbWwgt3aGe7A;
        }
        return j;
    }

    @Override // defpackage.bw0
    public final long RAsUl2FVSrh6(long j) {
        if (!kRWHK87H9qm4().S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("LayoutCoordinate operations are only valid when isAttached is true");
        }
        bw0 ZbWwgt3aGe7A = kj0.ZbWwgt3aGe7A(this);
        r1 r1Var = (r1) yw0.PxuCJdSBwIXG(this.VhhvGxCb8gfr);
        r1Var.kpCQ9veP6n3I();
        return BjEWd04qc7Mw(ZbWwgt3aGe7A, bf1.Y1f8riQaR6yg(d51.lS5Rgt96tfkO(j, r1Var.VzNxmvWisHL1), kj0.J54yh1s3n4Aq(ZbWwgt3aGe7A)));
    }

    @Override // defpackage.bw0
    public final long S2OOm9zPNm0h(long j) {
        if (!kRWHK87H9qm4().S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return BjEWd04qc7Mw(kj0.ZbWwgt3aGe7A(this), ((r1) yw0.PxuCJdSBwIXG(this.VhhvGxCb8gfr)).tmVwIGCQF4zR(j));
    }

    @Override // defpackage.bw0
    public final long S9EYkSpbGuxq(bw0 bw0Var, long j) {
        return BjEWd04qc7Mw(bw0Var, j);
    }

    @Override // defpackage.bw0
    public final long TSizfFm2Yiuu(long j) {
        if (!kRWHK87H9qm4().S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((r1) yw0.PxuCJdSBwIXG(this.VhhvGxCb8gfr)).VhhvGxCb8gfr(Pf0ThKz3j5YS(j));
    }

    public final pd1 TVHukqbqS4tB(pd1 pd1Var) {
        vw0 vw0Var = pd1Var.VhhvGxCb8gfr;
        vw0 vw0Var2 = this.VhhvGxCb8gfr;
        if (vw0Var == vw0Var2) {
            m61 kRWHK87H9qm4 = pd1Var.kRWHK87H9qm4();
            m61 kRWHK87H9qm42 = kRWHK87H9qm4();
            if (!kRWHK87H9qm42.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                ep0.lS5Rgt96tfkO("visitLocalAncestors called on an unattached node");
            }
            for (m61 m61Var = kRWHK87H9qm42.rtx2ld2ELZv4.x50lh2ztY7Y5; m61Var != null; m61Var = m61Var.x50lh2ztY7Y5) {
                if ((m61Var.wdg6QnbFHrFF & 2) != 0 && m61Var == kRWHK87H9qm4) {
                    return pd1Var;
                }
            }
            return this;
        }
        while (vw0Var.VhhvGxCb8gfr > vw0Var2.VhhvGxCb8gfr) {
            vw0Var = vw0Var.S9EYkSpbGuxq();
            vw0Var.getClass();
        }
        vw0 vw0Var3 = vw0Var2;
        while (vw0Var3.VhhvGxCb8gfr > vw0Var.VhhvGxCb8gfr) {
            vw0Var3 = vw0Var3.S9EYkSpbGuxq();
            vw0Var3.getClass();
        }
        while (vw0Var != vw0Var3) {
            vw0Var = vw0Var.S9EYkSpbGuxq();
            vw0Var3 = vw0Var3.S9EYkSpbGuxq();
            if (vw0Var == null || vw0Var3 == null) {
                u9.XL4ISE6Oc65B("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (vw0Var3 != vw0Var2) {
            if (vw0Var != pd1Var.VhhvGxCb8gfr) {
                return vw0Var.nLZGh9p8gVSu.TSizfFm2Yiuu;
            }
            return pd1Var;
        }
        return this;
    }

    public final void W7ceZOzvrRuI(pd1 pd1Var, u81 u81Var, boolean z) {
        if (pd1Var == this) {
            return;
        }
        pd1 pd1Var2 = this.ZbWwgt3aGe7A;
        if (pd1Var2 != null) {
            pd1Var2.W7ceZOzvrRuI(pd1Var, u81Var, z);
        }
        long j = this.ozEBbv0hFTAB;
        float f = (int) (j >> 32);
        u81Var.PxuCJdSBwIXG -= f;
        u81Var.TSizfFm2Yiuu -= f;
        float f2 = (int) (j & 4294967295L);
        u81Var.lS5Rgt96tfkO -= f2;
        u81Var.Y1f8riQaR6yg -= f2;
        ci1 ci1Var = this.zf8DYfih6EZu;
        if (ci1Var != null) {
            uh0 uh0Var = (uh0) ci1Var;
            float[] PxuCJdSBwIXG = uh0Var.PxuCJdSBwIXG();
            if (!uh0Var.IAToe7bXGz4N) {
                if (PxuCJdSBwIXG == null) {
                    u81Var.PxuCJdSBwIXG = 0.0f;
                    u81Var.lS5Rgt96tfkO = 0.0f;
                    u81Var.TSizfFm2Yiuu = 0.0f;
                    u81Var.Y1f8riQaR6yg = 0.0f;
                } else {
                    d51.TSizfFm2Yiuu(PxuCJdSBwIXG, u81Var);
                }
            }
            if (this.IAToe7bXGz4N && z) {
                long j2 = this.wdg6QnbFHrFF;
                u81Var.PxuCJdSBwIXG(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long X1HMmH2Ks65g(pd1 pd1Var, long j) {
        if (pd1Var == this) {
            return j;
        }
        pd1 pd1Var2 = this.ZbWwgt3aGe7A;
        return (pd1Var2 == null || cs0.wdg6QnbFHrFF(pd1Var, pd1Var2)) ? i6zQx8Kd7UPU(j) : i6zQx8Kd7UPU(pd1Var2.X1HMmH2Ks65g(pd1Var, j));
    }

    public final float Yadk4uqlxLy8(long j, long j2) {
        if (JTxCbbCwomzt() >= Float.intBitsToFloat((int) (j2 >> 32)) && D0aTLcX6Uhyo() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long fkblLSN2bAgv = fkblLSN2bAgv(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (fkblLSN2bAgv >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (fkblLSN2bAgv & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - JTxCbbCwomzt());
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - D0aTLcX6Uhyo())) & 4294967295L);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i);
                    float intBitsToFloat5 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        if (defpackage.zv.r3s1LDPKFs1S(r18.PxuCJdSBwIXG(), defpackage.ng0.PxuCJdSBwIXG(r2, r7, false)) > 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(nd1 nd1Var, long j, zj0 zj0Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        m61 BUo4iHFctTZi = BUo4iHFctTZi(nd1Var.e9gEMXR7LXtO());
        if (!w(j)) {
            ho1.Companion.getClass();
            if (i == 1) {
                float Yadk4uqlxLy8 = Yadk4uqlxLy8(j, ctD2u3GUHhtA());
                if ((Float.floatToRawIntBits(Yadk4uqlxLy8) & Integer.MAX_VALUE) < 2139095040) {
                    if (zj0Var.wdg6QnbFHrFF != zj0Var.rtx2ld2ELZv4.lS5Rgt96tfkO - 1) {
                        if (zv.r3s1LDPKFs1S(zj0Var.PxuCJdSBwIXG(), ng0.PxuCJdSBwIXG(Yadk4uqlxLy8, false, false)) <= 0) {
                            return;
                        }
                    }
                    wcHq2YQJmeHg(BUo4iHFctTZi, nd1Var, j, zj0Var, i, false, Yadk4uqlxLy8);
                    return;
                }
                return;
            }
            return;
        }
        if (BUo4iHFctTZi == null) {
            b(nd1Var, j, zj0Var, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < JTxCbbCwomzt() && intBitsToFloat2 < D0aTLcX6Uhyo()) {
            P6VAkUObIv30(BUo4iHFctTZi, nd1Var, j, zj0Var, i, z);
            return;
        }
        ho1.Companion.getClass();
        float Yadk4uqlxLy82 = i == 1 ? Yadk4uqlxLy8(j, ctD2u3GUHhtA()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(Yadk4uqlxLy82) & Integer.MAX_VALUE) < 2139095040) {
            if (zj0Var.wdg6QnbFHrFF == zj0Var.rtx2ld2ELZv4.lS5Rgt96tfkO - 1) {
                z2 = z;
            } else {
                z2 = z;
            }
            z3 = true;
            j(BUo4iHFctTZi, nd1Var, j, zj0Var, i, z2, Yadk4uqlxLy82, z3);
        }
        z2 = z;
        z3 = false;
        j(BUo4iHFctTZi, nd1Var, j, zj0Var, i, z2, Yadk4uqlxLy82, z3);
    }

    @Override // defpackage.bw0
    public final boolean aF05bpZJlKEP() {
        return kRWHK87H9qm4().S9EYkSpbGuxq;
    }

    public void b(nd1 nd1Var, long j, zj0 zj0Var, int i, boolean z) {
        pd1 pd1Var = this.S2OOm9zPNm0h;
        if (pd1Var != null) {
            pd1Var.a(nd1Var, pd1Var.i6zQx8Kd7UPU(j), zj0Var, i, z);
        }
    }

    public final void c() {
        ci1 ci1Var = this.zf8DYfih6EZu;
        if (ci1Var != null) {
            ((uh0) ci1Var).TSizfFm2Yiuu();
            return;
        }
        pd1 pd1Var = this.ZbWwgt3aGe7A;
        if (pd1Var != null) {
            pd1Var.c();
        }
    }

    public final long ctD2u3GUHhtA() {
        return this.jyegZNwi31qc.bEKsvqmvPh2y(this.VhhvGxCb8gfr.ozEBbv0hFTAB.RAsUl2FVSrh6());
    }

    public final boolean d() {
        if (this.zf8DYfih6EZu != null && this.kpCQ9veP6n3I <= 0.0f) {
            return true;
        }
        pd1 pd1Var = this.ZbWwgt3aGe7A;
        if (pd1Var != null) {
            return pd1Var.d();
        }
        return false;
    }

    @Override // defpackage.bw0
    public final bw0 dgRBjINgWbAK() {
        boolean z = kRWHK87H9qm4().S9EYkSpbGuxq;
        vw0 vw0Var = this.VhhvGxCb8gfr;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (vw0 vw0Var2 = vw0Var; vw0Var2 != null; vw0Var2 = vw0Var2.S9EYkSpbGuxq()) {
                sb.append("\n|");
                sb.append(vw0Var2);
                sb.append(" isAttached=");
                sb.append(vw0Var2.J54yh1s3n4Aq());
                sb.append(" modifier=");
                sb.append(vw0Var2.POWyO8hTM6YC);
                sb.append(" tail=");
                sb.append(kRWHK87H9qm4());
            }
            ep0.lS5Rgt96tfkO(sb.toString());
        }
        e();
        return vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg.ZbWwgt3aGe7A;
    }

    public final void e() {
        this.VhhvGxCb8gfr.ryVscX7ZL4Ux.lS5Rgt96tfkO();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [m61] */
    /* JADX WARN: Type inference failed for: r7v7, types: [m61] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [f91] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [f91] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void f() {
        m61 m61Var;
        boolean RAsUl2FVSrh6 = qd1.RAsUl2FVSrh6(128);
        m61 HiC8volkyM7b = HiC8volkyM7b(RAsUl2FVSrh6);
        if (HiC8volkyM7b == null || (HiC8volkyM7b.rtx2ld2ELZv4.dgRBjINgWbAK & 128) == 0) {
            return;
        }
        j72.Companion.getClass();
        j72 PxuCJdSBwIXG = i72.PxuCJdSBwIXG();
        le0 e9gEMXR7LXtO = PxuCJdSBwIXG != null ? PxuCJdSBwIXG.e9gEMXR7LXtO() : null;
        j72 lS5Rgt96tfkO = i72.lS5Rgt96tfkO(PxuCJdSBwIXG);
        try {
            if (RAsUl2FVSrh6) {
                m61Var = kRWHK87H9qm4();
            } else {
                m61Var = kRWHK87H9qm4().x50lh2ztY7Y5;
                if (m61Var == null) {
                }
            }
            for (m61 HiC8volkyM7b2 = HiC8volkyM7b(RAsUl2FVSrh6); HiC8volkyM7b2 != null; HiC8volkyM7b2 = HiC8volkyM7b2.cpQdD2nAriOS) {
                if ((HiC8volkyM7b2.dgRBjINgWbAK & 128) == 0) {
                    break;
                }
                if ((HiC8volkyM7b2.wdg6QnbFHrFF & 128) != 0) {
                    ux uxVar = HiC8volkyM7b2;
                    ?? r8 = 0;
                    while (uxVar != 0) {
                        if (uxVar instanceof m51) {
                            ((m51) uxVar).TSizfFm2Yiuu(this.wdg6QnbFHrFF);
                        } else if ((uxVar.wdg6QnbFHrFF & 128) != 0 && (uxVar instanceof ux)) {
                            m61 m61Var2 = uxVar.S2OOm9zPNm0h;
                            int i = 0;
                            uxVar = uxVar;
                            r8 = r8;
                            while (m61Var2 != null) {
                                if ((m61Var2.wdg6QnbFHrFF & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        uxVar = m61Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new f91(new m61[16]);
                                        }
                                        if (uxVar != 0) {
                                            r8.lS5Rgt96tfkO(uxVar);
                                            uxVar = 0;
                                        }
                                        r8.lS5Rgt96tfkO(m61Var2);
                                    }
                                }
                                m61Var2 = m61Var2.cpQdD2nAriOS;
                                uxVar = uxVar;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        uxVar = zv.dgRBjINgWbAK(r8);
                    }
                }
                if (HiC8volkyM7b2 == m61Var) {
                    break;
                }
            }
        } finally {
            i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
        }
    }

    public final long fkblLSN2bAgv(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - JTxCbbCwomzt();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - D0aTLcX6Uhyo();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [m61] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [m61] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f91] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f91] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void g() {
        boolean RAsUl2FVSrh6 = qd1.RAsUl2FVSrh6(4194304);
        m61 kRWHK87H9qm4 = kRWHK87H9qm4();
        if (!RAsUl2FVSrh6 && (kRWHK87H9qm4 = kRWHK87H9qm4.x50lh2ztY7Y5) == null) {
            return;
        }
        for (m61 HiC8volkyM7b = HiC8volkyM7b(RAsUl2FVSrh6); HiC8volkyM7b != null && (HiC8volkyM7b.dgRBjINgWbAK & 4194304) != 0; HiC8volkyM7b = HiC8volkyM7b.cpQdD2nAriOS) {
            if ((HiC8volkyM7b.wdg6QnbFHrFF & 4194304) != 0) {
                ux uxVar = HiC8volkyM7b;
                ?? r5 = 0;
                while (uxVar != 0) {
                    if (uxVar instanceof xv0) {
                        ((xv0) uxVar).XL4ISE6Oc65B(this);
                    } else if ((uxVar.wdg6QnbFHrFF & 4194304) != 0 && (uxVar instanceof ux)) {
                        m61 m61Var = uxVar.S2OOm9zPNm0h;
                        int i = 0;
                        uxVar = uxVar;
                        r5 = r5;
                        while (m61Var != null) {
                            if ((m61Var.wdg6QnbFHrFF & 4194304) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    uxVar = m61Var;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new f91(new m61[16]);
                                    }
                                    if (uxVar != 0) {
                                        r5.lS5Rgt96tfkO(uxVar);
                                        uxVar = 0;
                                    }
                                    r5.lS5Rgt96tfkO(m61Var);
                                }
                            }
                            m61Var = m61Var.cpQdD2nAriOS;
                            uxVar = uxVar;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    uxVar = zv.dgRBjINgWbAK(r5);
                }
            }
            if (HiC8volkyM7b == kRWHK87H9qm4) {
                return;
            }
        }
    }

    @Override // defpackage.vr0
    public final cw0 getLayoutDirection() {
        return this.VhhvGxCb8gfr.BjEWd04qc7Mw;
    }

    public final void h() {
        this.pnx5pC0XzaCw = true;
        this.POWyO8hTM6YC.PxuCJdSBwIXG();
        n();
        long j = this.ozEBbv0hFTAB;
        wq0.Companion.getClass();
        if (wq0.PxuCJdSBwIXG(j, 0L)) {
            return;
        }
        this.VhhvGxCb8gfr.Pf0ThKz3j5YS(this);
    }

    public final void i() {
        boolean RAsUl2FVSrh6 = qd1.RAsUl2FVSrh6(1048576);
        m61 HiC8volkyM7b = HiC8volkyM7b(RAsUl2FVSrh6);
        if (HiC8volkyM7b == null || (HiC8volkyM7b.rtx2ld2ELZv4.dgRBjINgWbAK & 1048576) == 0) {
            return;
        }
        m61 kRWHK87H9qm4 = kRWHK87H9qm4();
        if (!RAsUl2FVSrh6 && (kRWHK87H9qm4 = kRWHK87H9qm4.x50lh2ztY7Y5) == null) {
            return;
        }
        for (m61 HiC8volkyM7b2 = HiC8volkyM7b(RAsUl2FVSrh6); HiC8volkyM7b2 != null && (HiC8volkyM7b2.dgRBjINgWbAK & 1048576) != 0; HiC8volkyM7b2 = HiC8volkyM7b2.cpQdD2nAriOS) {
            if ((HiC8volkyM7b2.wdg6QnbFHrFF & 1048576) != 0) {
                m61 m61Var = HiC8volkyM7b2;
                f91 f91Var = null;
                while (m61Var != null) {
                    if ((m61Var.wdg6QnbFHrFF & 1048576) != 0 && (m61Var instanceof ux)) {
                        int i = 0;
                        for (m61 m61Var2 = ((ux) m61Var).S2OOm9zPNm0h; m61Var2 != null; m61Var2 = m61Var2.cpQdD2nAriOS) {
                            if ((m61Var2.wdg6QnbFHrFF & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    m61Var = m61Var2;
                                } else {
                                    if (f91Var == null) {
                                        f91Var = new f91(new m61[16]);
                                    }
                                    if (m61Var != null) {
                                        f91Var.lS5Rgt96tfkO(m61Var);
                                        m61Var = null;
                                    }
                                    f91Var.lS5Rgt96tfkO(m61Var2);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    m61Var = zv.dgRBjINgWbAK(f91Var);
                }
            }
            if (HiC8volkyM7b2 == kRWHK87H9qm4) {
                return;
            }
        }
    }

    public final long i6zQx8Kd7UPU(long j) {
        long j2 = this.ozEBbv0hFTAB;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        ci1 ci1Var = this.zf8DYfih6EZu;
        if (ci1Var != null) {
            uh0 uh0Var = (uh0) ci1Var;
            float[] PxuCJdSBwIXG = uh0Var.PxuCJdSBwIXG();
            if (PxuCJdSBwIXG == null) {
                bf1.Companion.getClass();
                return 9187343241974906880L;
            }
            if (!uh0Var.IAToe7bXGz4N) {
                return d51.lS5Rgt96tfkO(floatToRawIntBits, PxuCJdSBwIXG);
            }
        }
        return floatToRawIntBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [m61] */
    /* JADX WARN: Type inference failed for: r3v25 */
    public final void j(m61 m61Var, nd1 nd1Var, long j, zj0 zj0Var, int i, boolean z, float f, boolean z2) {
        m61 dgRBjINgWbAK;
        if (m61Var == null) {
            b(nd1Var, j, zj0Var, i, z);
            return;
        }
        if (!nd1Var.RAsUl2FVSrh6(m61Var)) {
            j(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i, z, f, z2);
            return;
        }
        int i2 = i;
        boolean z3 = z;
        ho1.Companion.getClass();
        char c = 3;
        if (i2 == 3 || i2 == 4) {
            ux uxVar = m61Var;
            f91 f91Var = null;
            while (true) {
                if (uxVar == 0) {
                    break;
                }
                int i3 = 0;
                if (uxVar instanceof do1) {
                    long S9EYkSpbGuxq = ((do1) uxVar).S9EYkSpbGuxq();
                    int i4 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i4);
                    vw0 vw0Var = this.VhhvGxCb8gfr;
                    cw0 cw0Var = vw0Var.BjEWd04qc7Mw;
                    gk2 gk2Var = hk2.Companion;
                    long j2 = Long.MIN_VALUE & S9EYkSpbGuxq;
                    cw0 cw0Var2 = cw0.rtx2ld2ELZv4;
                    if (intBitsToFloat >= (-((j2 == 0 || cw0Var == cw0Var2) ? gk2.PxuCJdSBwIXG(hk2.Companion, S9EYkSpbGuxq, 0) : gk2.PxuCJdSBwIXG(hk2.Companion, S9EYkSpbGuxq, 2)))) {
                        if (Float.intBitsToFloat(i4) < JTxCbbCwomzt() + ((j2 == 0 || vw0Var.BjEWd04qc7Mw == cw0Var2) ? gk2.PxuCJdSBwIXG(hk2.Companion, S9EYkSpbGuxq, 2) : gk2.PxuCJdSBwIXG(hk2.Companion, S9EYkSpbGuxq, 0))) {
                            int i5 = (int) (j & 4294967295L);
                            float intBitsToFloat2 = Float.intBitsToFloat(i5);
                            gk2 gk2Var2 = hk2.Companion;
                            if (intBitsToFloat2 >= (-gk2.PxuCJdSBwIXG(gk2Var2, S9EYkSpbGuxq, 1))) {
                                if (Float.intBitsToFloat(i5) < gk2.PxuCJdSBwIXG(gk2Var2, S9EYkSpbGuxq, 3) + D0aTLcX6Uhyo()) {
                                    g81 g81Var = zj0Var.OPXfSBeufaJ8;
                                    p81 p81Var = zj0Var.rtx2ld2ELZv4;
                                    int i6 = zj0Var.wdg6QnbFHrFF;
                                    int i7 = p81Var.lS5Rgt96tfkO;
                                    if (i6 == i7 - 1) {
                                        zj0Var.lS5Rgt96tfkO(i6 + 1, i7);
                                        zj0Var.wdg6QnbFHrFF++;
                                        p81Var.PxuCJdSBwIXG(m61Var);
                                        g81Var.PxuCJdSBwIXG(ng0.PxuCJdSBwIXG(0.0f, z3, true));
                                        j(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i2, z3, f, z2);
                                        zj0Var.wdg6QnbFHrFF = i6;
                                        return;
                                    }
                                    long PxuCJdSBwIXG = zj0Var.PxuCJdSBwIXG();
                                    int i8 = zj0Var.wdg6QnbFHrFF;
                                    if (!zv.ozEBbv0hFTAB(PxuCJdSBwIXG)) {
                                        if (zv.S9EYkSpbGuxq(PxuCJdSBwIXG) > 0.0f) {
                                            int i9 = zj0Var.wdg6QnbFHrFF;
                                            zj0Var.lS5Rgt96tfkO(i9 + 1, p81Var.lS5Rgt96tfkO);
                                            zj0Var.wdg6QnbFHrFF++;
                                            p81Var.PxuCJdSBwIXG(m61Var);
                                            g81Var.PxuCJdSBwIXG(ng0.PxuCJdSBwIXG(0.0f, z3, true));
                                            j(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i, z3, f, z2);
                                            zj0Var.wdg6QnbFHrFF = i9;
                                            return;
                                        }
                                        return;
                                    }
                                    int i10 = p81Var.lS5Rgt96tfkO;
                                    int i11 = i10 - 1;
                                    zj0Var.wdg6QnbFHrFF = i11;
                                    zj0Var.lS5Rgt96tfkO(i10, p81Var.lS5Rgt96tfkO);
                                    zj0Var.wdg6QnbFHrFF++;
                                    p81Var.PxuCJdSBwIXG(m61Var);
                                    g81Var.PxuCJdSBwIXG(ng0.PxuCJdSBwIXG(0.0f, z3, true));
                                    j(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i, z3, f, z2);
                                    zj0Var.wdg6QnbFHrFF = i11;
                                    if (zv.S9EYkSpbGuxq(zj0Var.PxuCJdSBwIXG()) < 0.0f) {
                                        zj0Var.lS5Rgt96tfkO(i8 + 1, zj0Var.wdg6QnbFHrFF + 1);
                                    }
                                    zj0Var.wdg6QnbFHrFF = i8;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    char c2 = c;
                    if ((uxVar.wdg6QnbFHrFF & 16) != 0 && (uxVar instanceof ux)) {
                        m61 m61Var2 = uxVar.S2OOm9zPNm0h;
                        dgRBjINgWbAK = uxVar;
                        f91Var = f91Var;
                        while (m61Var2 != null) {
                            if ((m61Var2.wdg6QnbFHrFF & 16) != 0) {
                                i3++;
                                f91Var = f91Var;
                                if (i3 == 1) {
                                    dgRBjINgWbAK = m61Var2;
                                } else {
                                    if (f91Var == null) {
                                        f91Var = new f91(new m61[16]);
                                    }
                                    if (dgRBjINgWbAK != null) {
                                        f91Var.lS5Rgt96tfkO(dgRBjINgWbAK);
                                        dgRBjINgWbAK = null;
                                    }
                                    f91Var.lS5Rgt96tfkO(m61Var2);
                                }
                            }
                            m61Var2 = m61Var2.cpQdD2nAriOS;
                            dgRBjINgWbAK = dgRBjINgWbAK;
                            f91Var = f91Var;
                        }
                        if (i3 == 1) {
                            i2 = i;
                            z3 = z;
                            c = c2;
                            uxVar = dgRBjINgWbAK;
                            f91Var = f91Var;
                        }
                    }
                    dgRBjINgWbAK = zv.dgRBjINgWbAK(f91Var);
                    i2 = i;
                    z3 = z;
                    c = c2;
                    uxVar = dgRBjINgWbAK;
                    f91Var = f91Var;
                }
            }
        }
        if (z2) {
            wcHq2YQJmeHg(m61Var, nd1Var, j, zj0Var, i, z, f);
        } else {
            p(m61Var, nd1Var, j, zj0Var, i, z, f);
        }
    }

    @Override // defpackage.fi1
    public final boolean jyegZNwi31qc() {
        return (this.zf8DYfih6EZu == null || this.pnx5pC0XzaCw || !this.VhhvGxCb8gfr.J54yh1s3n4Aq()) ? false : true;
    }

    public abstract void k(gi giVar, ph0 ph0Var);

    public abstract m61 kRWHK87H9qm4();

    @Override // defpackage.bw0
    public final void kpCQ9veP6n3I(float[] fArr) {
        ei1 PxuCJdSBwIXG = yw0.PxuCJdSBwIXG(this.VhhvGxCb8gfr);
        pd1 q = q(kj0.ZbWwgt3aGe7A(this));
        t(q, fArr);
        if (PxuCJdSBwIXG instanceof r1) {
            ((r1) PxuCJdSBwIXG).S9EYkSpbGuxq(fArr);
            return;
        }
        long EpkonXwzFgDB = kj0.EpkonXwzFgDB(q);
        if ((9223372034707292159L & EpkonXwzFgDB) != 9205357640488583168L) {
            d51.a92UlCVFR9N8(fArr, Float.intBitsToFloat((int) (EpkonXwzFgDB >> 32)), Float.intBitsToFloat((int) (EpkonXwzFgDB & 4294967295L)));
        }
    }

    public final void l(long j, float f, le0 le0Var) {
        u(le0Var, false);
        boolean PxuCJdSBwIXG = wq0.PxuCJdSBwIXG(this.ozEBbv0hFTAB, j);
        vw0 vw0Var = this.VhhvGxCb8gfr;
        if (!PxuCJdSBwIXG) {
            ei1 PxuCJdSBwIXG2 = yw0.PxuCJdSBwIXG(vw0Var);
            md0.Companion.getClass();
            ((r1) PxuCJdSBwIXG2).amuv7NJvPxHu(-4.0f);
            this.ozEBbv0hFTAB = j;
            ci1 ci1Var = this.zf8DYfih6EZu;
            if (ci1Var != null) {
                ((uh0) ci1Var).Y1f8riQaR6yg(j);
            } else {
                pd1 pd1Var = this.ZbWwgt3aGe7A;
                if (pd1Var != null) {
                    pd1Var.c();
                }
            }
            vw0Var.Pf0ThKz3j5YS(this);
            u31.Y2PHjkwWz56c(this);
            ei1 ei1Var = vw0Var.S9EYkSpbGuxq;
            if (ei1Var != null) {
                ((r1) ei1Var).IAToe7bXGz4N(vw0Var);
            }
        }
        this.tmVwIGCQF4zR = f;
        if (this == vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg) {
            ((r1) yw0.PxuCJdSBwIXG(vw0Var)).getRectManager().a92UlCVFR9N8(vw0Var);
        }
        if (this.XL4ISE6Oc65B) {
            return;
        }
        GlTbNTgfSMqy(IxJ9cAW40yOk());
    }

    @Override // defpackage.hy
    public final float lS5Rgt96tfkO() {
        return this.VhhvGxCb8gfr.rZjpSjn4zoMv.lS5Rgt96tfkO();
    }

    public final void m(u81 u81Var, boolean z, boolean z2) {
        long j;
        ci1 ci1Var = this.zf8DYfih6EZu;
        if (ci1Var != null) {
            if (this.IAToe7bXGz4N) {
                if (z2) {
                    long ctD2u3GUHhtA = ctD2u3GUHhtA();
                    float f = u81Var.PxuCJdSBwIXG;
                    float f2 = u81Var.lS5Rgt96tfkO;
                    if (u81Var.TSizfFm2Yiuu >= 0.0f) {
                        long j2 = this.wdg6QnbFHrFF;
                        if (f <= ((int) (j2 >> 32)) && u81Var.Y1f8riQaR6yg >= 0.0f && f2 <= ((int) (j2 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (ctD2u3GUHhtA >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (ctD2u3GUHhtA & 4294967295L));
                            float f3 = (intBitsToFloat - (u81Var.TSizfFm2Yiuu - u81Var.PxuCJdSBwIXG)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (u81Var.Y1f8riQaR6yg - u81Var.lS5Rgt96tfkO)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j3 = this.wdg6QnbFHrFF;
                            float f7 = (int) (j3 >> 32);
                            int i = (int) (ctD2u3GUHhtA >> 32);
                            float f8 = (int) (j3 & 4294967295L);
                            int i2 = (int) (ctD2u3GUHhtA & 4294967295L);
                            u81Var.PxuCJdSBwIXG(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat4)));
                        }
                    }
                    bf1.Companion.getClass();
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j32 = this.wdg6QnbFHrFF;
                    float f72 = (int) (j32 >> 32);
                    int i3 = (int) (ctD2u3GUHhtA >> 32);
                    float f82 = (int) (j32 & 4294967295L);
                    int i22 = (int) (ctD2u3GUHhtA & 4294967295L);
                    u81Var.PxuCJdSBwIXG(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i3) + f72, Math.max(f72, Float.intBitsToFloat(i3) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.wdg6QnbFHrFF;
                    u81Var.PxuCJdSBwIXG(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (u81Var.lS5Rgt96tfkO()) {
                    return;
                }
            }
            uh0 uh0Var = (uh0) ci1Var;
            float[] lS5Rgt96tfkO = uh0Var.lS5Rgt96tfkO();
            if (!uh0Var.IAToe7bXGz4N) {
                if (lS5Rgt96tfkO == null) {
                    u81Var.PxuCJdSBwIXG = 0.0f;
                    u81Var.lS5Rgt96tfkO = 0.0f;
                    u81Var.TSizfFm2Yiuu = 0.0f;
                    u81Var.Y1f8riQaR6yg = 0.0f;
                } else {
                    d51.TSizfFm2Yiuu(lS5Rgt96tfkO, u81Var);
                }
            }
        }
        long j5 = this.ozEBbv0hFTAB;
        float f9 = (int) (j5 >> 32);
        u81Var.PxuCJdSBwIXG += f9;
        u81Var.TSizfFm2Yiuu += f9;
        float f10 = (int) (j5 & 4294967295L);
        u81Var.lS5Rgt96tfkO += f10;
        u81Var.Y1f8riQaR6yg += f10;
    }

    @Override // defpackage.u31
    public final u31 mFd1aGiJX24N() {
        return this.S2OOm9zPNm0h;
    }

    public final void n() {
        if (this.zf8DYfih6EZu != null) {
            u(null, false);
            this.VhhvGxCb8gfr.nxJAScVArhE9(false);
        }
    }

    @Override // defpackage.bw0
    public final qt1 nLZGh9p8gVSu(bw0 bw0Var, boolean z) {
        if (!kRWHK87H9qm4().S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!bw0Var.aF05bpZJlKEP()) {
            ep0.lS5Rgt96tfkO("LayoutCoordinates " + bw0Var + " is not attached!");
        }
        pd1 q = q(bw0Var);
        q.e();
        pd1 TVHukqbqS4tB = TVHukqbqS4tB(q);
        u81 u81Var = this.J54yh1s3n4Aq;
        if (u81Var == null) {
            u81Var = new u81();
            this.J54yh1s3n4Aq = u81Var;
        }
        u81Var.PxuCJdSBwIXG = 0.0f;
        u81Var.lS5Rgt96tfkO = 0.0f;
        u81Var.TSizfFm2Yiuu = (int) (bw0Var.ryVscX7ZL4Ux() >> 32);
        u81Var.Y1f8riQaR6yg = (int) (bw0Var.ryVscX7ZL4Ux() & 4294967295L);
        while (q != TVHukqbqS4tB) {
            q.m(u81Var, z, false);
            if (u81Var.lS5Rgt96tfkO()) {
                qt1.Companion.getClass();
                return qt1.e9gEMXR7LXtO;
            }
            q = q.ZbWwgt3aGe7A;
            q.getClass();
        }
        W7ceZOzvrRuI(TVHukqbqS4tB, u81Var, z);
        return new qt1(u81Var.PxuCJdSBwIXG, u81Var.lS5Rgt96tfkO, u81Var.TSizfFm2Yiuu, u81Var.Y1f8riQaR6yg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [m61] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [m61] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [f91] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [f91] */
    public final void o(k51 k51Var) {
        pd1 pd1Var;
        k51 k51Var2 = this.rZjpSjn4zoMv;
        if (k51Var != k51Var2) {
            this.rZjpSjn4zoMv = k51Var;
            vw0 vw0Var = this.VhhvGxCb8gfr;
            int i = 0;
            if (k51Var2 == null || k51Var.e9gEMXR7LXtO() != k51Var2.e9gEMXR7LXtO() || k51Var.TSizfFm2Yiuu() != k51Var2.TSizfFm2Yiuu()) {
                int e9gEMXR7LXtO = k51Var.e9gEMXR7LXtO();
                int TSizfFm2Yiuu = k51Var.TSizfFm2Yiuu();
                ci1 ci1Var = this.zf8DYfih6EZu;
                if (ci1Var != null) {
                    ((uh0) ci1Var).e9gEMXR7LXtO((e9gEMXR7LXtO << 32) | (TSizfFm2Yiuu & 4294967295L));
                } else if (vw0Var.EpkonXwzFgDB() && (pd1Var = this.ZbWwgt3aGe7A) != null) {
                    pd1Var.c();
                }
                fRTaYY6FBZcX((TSizfFm2Yiuu & 4294967295L) | (e9gEMXR7LXtO << 32));
                if (this.e6tOsSdd2EFb != null) {
                    v(false);
                }
                boolean RAsUl2FVSrh6 = qd1.RAsUl2FVSrh6(4);
                m61 kRWHK87H9qm4 = kRWHK87H9qm4();
                if (RAsUl2FVSrh6 || (kRWHK87H9qm4 = kRWHK87H9qm4.x50lh2ztY7Y5) != null) {
                    for (m61 HiC8volkyM7b = HiC8volkyM7b(RAsUl2FVSrh6); HiC8volkyM7b != null && (HiC8volkyM7b.dgRBjINgWbAK & 4) != 0; HiC8volkyM7b = HiC8volkyM7b.cpQdD2nAriOS) {
                        if ((HiC8volkyM7b.wdg6QnbFHrFF & 4) != 0) {
                            ux uxVar = HiC8volkyM7b;
                            ?? r9 = 0;
                            while (uxVar != 0) {
                                if (uxVar instanceof i30) {
                                    ((i30) uxVar).v6yxfmkxNKhL();
                                } else if ((uxVar.wdg6QnbFHrFF & 4) != 0 && (uxVar instanceof ux)) {
                                    m61 m61Var = uxVar.S2OOm9zPNm0h;
                                    int i2 = 0;
                                    uxVar = uxVar;
                                    r9 = r9;
                                    while (m61Var != null) {
                                        if ((m61Var.wdg6QnbFHrFF & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                uxVar = m61Var;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new f91(new m61[16]);
                                                }
                                                if (uxVar != 0) {
                                                    r9.lS5Rgt96tfkO(uxVar);
                                                    uxVar = 0;
                                                }
                                                r9.lS5Rgt96tfkO(m61Var);
                                            }
                                        }
                                        m61Var = m61Var.cpQdD2nAriOS;
                                        uxVar = uxVar;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                uxVar = zv.dgRBjINgWbAK(r9);
                            }
                        }
                        if (HiC8volkyM7b == kRWHK87H9qm4) {
                            break;
                        }
                    }
                }
                ei1 ei1Var = vw0Var.S9EYkSpbGuxq;
                if (ei1Var != null) {
                    ((r1) ei1Var).IAToe7bXGz4N(vw0Var);
                }
                vw0Var.Pf0ThKz3j5YS(this);
            }
            l81 l81Var = this.BjEWd04qc7Mw;
            if ((l81Var == null || l81Var.e9gEMXR7LXtO == 0) && k51Var.PxuCJdSBwIXG().isEmpty()) {
                return;
            }
            l81 l81Var2 = this.BjEWd04qc7Mw;
            Map PxuCJdSBwIXG = k51Var.PxuCJdSBwIXG();
            if (l81Var2 != null && l81Var2.e9gEMXR7LXtO == PxuCJdSBwIXG.size()) {
                Object[] objArr = l81Var2.lS5Rgt96tfkO;
                int[] iArr = l81Var2.TSizfFm2Yiuu;
                long[] jArr = l81Var2.PxuCJdSBwIXG;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) PxuCJdSBwIXG.get((u) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            vw0Var.ryVscX7ZL4Ux.gPXPFXrUH4XX.rZjpSjn4zoMv.a92UlCVFR9N8();
            l81 l81Var3 = this.BjEWd04qc7Mw;
            if (l81Var3 == null) {
                l81 l81Var4 = oe1.PxuCJdSBwIXG;
                l81Var3 = new l81();
                this.BjEWd04qc7Mw = l81Var3;
            }
            l81Var3.PxuCJdSBwIXG();
            for (Map.Entry entry : k51Var.PxuCJdSBwIXG().entrySet()) {
                l81Var3.RAsUl2FVSrh6(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void p(m61 m61Var, nd1 nd1Var, long j, zj0 zj0Var, int i, boolean z, float f) {
        int i2;
        if (m61Var == null) {
            b(nd1Var, j, zj0Var, i, z);
            return;
        }
        if (!nd1Var.RAsUl2FVSrh6(m61Var)) {
            p(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i, z, f);
            return;
        }
        if (!nd1Var.TSizfFm2Yiuu(m61Var)) {
            j(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i, z, f, false);
            return;
        }
        g81 g81Var = zj0Var.OPXfSBeufaJ8;
        p81 p81Var = zj0Var.rtx2ld2ELZv4;
        int i3 = zj0Var.wdg6QnbFHrFF;
        int i4 = p81Var.lS5Rgt96tfkO;
        if (i3 != i4 - 1) {
            long PxuCJdSBwIXG = zj0Var.PxuCJdSBwIXG();
            int i5 = zj0Var.wdg6QnbFHrFF;
            int i6 = p81Var.lS5Rgt96tfkO;
            int i7 = i6 - 1;
            zj0Var.wdg6QnbFHrFF = i7;
            zj0Var.lS5Rgt96tfkO(i6, p81Var.lS5Rgt96tfkO);
            zj0Var.wdg6QnbFHrFF++;
            p81Var.PxuCJdSBwIXG(m61Var);
            g81Var.PxuCJdSBwIXG(ng0.PxuCJdSBwIXG(f, z, false));
            j(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i, z, f, false);
            zj0Var.wdg6QnbFHrFF = i7;
            long PxuCJdSBwIXG2 = zj0Var.PxuCJdSBwIXG();
            if (zj0Var.wdg6QnbFHrFF + 1 >= p81Var.lS5Rgt96tfkO - 1 || zv.r3s1LDPKFs1S(PxuCJdSBwIXG, PxuCJdSBwIXG2) <= 0) {
                zj0Var.lS5Rgt96tfkO(zj0Var.wdg6QnbFHrFF + 1, p81Var.lS5Rgt96tfkO);
            } else {
                int i8 = i5 + 1;
                boolean ozEBbv0hFTAB = zv.ozEBbv0hFTAB(PxuCJdSBwIXG2);
                int i9 = zj0Var.wdg6QnbFHrFF;
                zj0Var.lS5Rgt96tfkO(i8, ozEBbv0hFTAB ? i9 + 2 : i9 + 1);
            }
            zj0Var.wdg6QnbFHrFF = i5;
            return;
        }
        int i10 = i3 + 1;
        zj0Var.lS5Rgt96tfkO(i10, i4);
        zj0Var.wdg6QnbFHrFF++;
        p81Var.PxuCJdSBwIXG(m61Var);
        g81Var.PxuCJdSBwIXG(ng0.PxuCJdSBwIXG(f, z, false));
        j(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i, z, f, false);
        zj0Var.wdg6QnbFHrFF = i3;
        if (i10 == p81Var.lS5Rgt96tfkO - 1 || zv.ozEBbv0hFTAB(zj0Var.PxuCJdSBwIXG())) {
            int i11 = zj0Var.wdg6QnbFHrFF;
            int i12 = i11 + 1;
            p81Var.dgRBjINgWbAK(i12);
            if (i12 < 0 || i12 >= (i2 = g81Var.lS5Rgt96tfkO)) {
                throw new IndexOutOfBoundsException("Index must be between 0 and size");
            }
            long[] jArr = g81Var.PxuCJdSBwIXG;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                na.JTxCbbCwomzt(jArr, jArr, i12, i11 + 2, i2);
            }
            g81Var.lS5Rgt96tfkO--;
        }
    }

    public abstract void qYgDo2Ye5PY7();

    public final qt1 r() {
        boolean z = kRWHK87H9qm4().S9EYkSpbGuxq;
        qt1 qt1Var = qt1.e9gEMXR7LXtO;
        if (!z) {
            qt1.Companion.getClass();
            return qt1Var;
        }
        bw0 ZbWwgt3aGe7A = kj0.ZbWwgt3aGe7A(this);
        u81 u81Var = this.J54yh1s3n4Aq;
        if (u81Var == null) {
            u81Var = new u81();
            this.J54yh1s3n4Aq = u81Var;
        }
        long fkblLSN2bAgv = fkblLSN2bAgv(ctD2u3GUHhtA());
        int i = (int) (fkblLSN2bAgv >> 32);
        u81Var.PxuCJdSBwIXG = -Float.intBitsToFloat(i);
        int i2 = (int) (fkblLSN2bAgv & 4294967295L);
        u81Var.lS5Rgt96tfkO = -Float.intBitsToFloat(i2);
        u81Var.TSizfFm2Yiuu = Float.intBitsToFloat(i) + JTxCbbCwomzt();
        u81Var.Y1f8riQaR6yg = Float.intBitsToFloat(i2) + D0aTLcX6Uhyo();
        while (this != ZbWwgt3aGe7A) {
            this.m(u81Var, false, true);
            if (u81Var.lS5Rgt96tfkO()) {
                qt1.Companion.getClass();
                return qt1Var;
            }
            this = this.ZbWwgt3aGe7A;
            this.getClass();
        }
        return new qt1(u81Var.PxuCJdSBwIXG, u81Var.lS5Rgt96tfkO, u81Var.TSizfFm2Yiuu, u81Var.Y1f8riQaR6yg);
    }

    @Override // defpackage.hy
    public final float r3s1LDPKFs1S() {
        return this.VhhvGxCb8gfr.rZjpSjn4zoMv.r3s1LDPKFs1S();
    }

    @Override // defpackage.bw0
    public final long ryVscX7ZL4Ux() {
        return this.wdg6QnbFHrFF;
    }

    public final void s(pd1 pd1Var, float[] fArr) {
        float[] PxuCJdSBwIXG;
        if (cs0.wdg6QnbFHrFF(pd1Var, this)) {
            return;
        }
        pd1 pd1Var2 = this.ZbWwgt3aGe7A;
        pd1Var2.getClass();
        pd1Var2.s(pd1Var, fArr);
        long j = this.ozEBbv0hFTAB;
        wq0.Companion.getClass();
        if (!wq0.PxuCJdSBwIXG(j, 0L)) {
            float[] fArr2 = nxJAScVArhE9;
            d51.Y1f8riQaR6yg(fArr2);
            long j2 = this.ozEBbv0hFTAB;
            d51.a92UlCVFR9N8(fArr2, -((int) (j2 >> 32)), -((int) (j2 & 4294967295L)));
            d51.e9gEMXR7LXtO(fArr, fArr2);
        }
        ci1 ci1Var = this.zf8DYfih6EZu;
        if (ci1Var == null || (PxuCJdSBwIXG = ((uh0) ci1Var).PxuCJdSBwIXG()) == null) {
            return;
        }
        d51.e9gEMXR7LXtO(fArr, PxuCJdSBwIXG);
    }

    public final void t(pd1 pd1Var, float[] fArr) {
        while (!this.equals(pd1Var)) {
            ci1 ci1Var = this.zf8DYfih6EZu;
            if (ci1Var != null) {
                d51.e9gEMXR7LXtO(fArr, ((uh0) ci1Var).lS5Rgt96tfkO());
            }
            long j = this.ozEBbv0hFTAB;
            wq0.Companion.getClass();
            if (!wq0.PxuCJdSBwIXG(j, 0L)) {
                float[] fArr2 = nxJAScVArhE9;
                d51.Y1f8riQaR6yg(fArr2);
                d51.a92UlCVFR9N8(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                d51.e9gEMXR7LXtO(fArr, fArr2);
            }
            this = this.ZbWwgt3aGe7A;
            this.getClass();
        }
    }

    @Override // defpackage.u31
    public final boolean twy4zb2fCtqq() {
        return this.rZjpSjn4zoMv != null;
    }

    public final void u(le0 le0Var, boolean z) {
        ei1 ei1Var;
        f91 f91Var;
        Reference poll;
        n2 n2Var;
        f91 f91Var2;
        Reference poll2;
        Object obj;
        int i = 0;
        vw0 vw0Var = this.VhhvGxCb8gfr;
        boolean z2 = (!z && this.e6tOsSdd2EFb == le0Var && cs0.wdg6QnbFHrFF(this.jyegZNwi31qc, vw0Var.rZjpSjn4zoMv) && this.aF05bpZJlKEP == vw0Var.BjEWd04qc7Mw) ? false : true;
        this.jyegZNwi31qc = vw0Var.rZjpSjn4zoMv;
        this.aF05bpZJlKEP = vw0Var.BjEWd04qc7Mw;
        boolean J54yh1s3n4Aq = vw0Var.J54yh1s3n4Aq();
        od1 od1Var = this.POWyO8hTM6YC;
        if (!J54yh1s3n4Aq || le0Var == null) {
            this.e6tOsSdd2EFb = null;
            ci1 ci1Var = this.zf8DYfih6EZu;
            if (ci1Var != null) {
                uh0 uh0Var = (uh0) ci1Var;
                if (!vi0.J54yh1s3n4Aq(uh0Var.lS5Rgt96tfkO())) {
                    vw0Var.Pf0ThKz3j5YS(this);
                }
                uh0Var.dgRBjINgWbAK = null;
                uh0Var.x50lh2ztY7Y5 = null;
                uh0Var.r3s1LDPKFs1S = true;
                uh0Var.a92UlCVFR9N8(false);
                nh0 nh0Var = uh0Var.OPXfSBeufaJ8;
                if (nh0Var != null) {
                    nh0Var.PxuCJdSBwIXG(uh0Var.rtx2ld2ELZv4);
                    r1 r1Var = uh0Var.wdg6QnbFHrFF;
                    cr1 cr1Var = r1Var.HGgCfDnf0ga9;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) cr1Var.wdg6QnbFHrFF;
                        f91Var = (f91) cr1Var.OPXfSBeufaJ8;
                        poll = referenceQueue.poll();
                        if (poll != null) {
                            f91Var.wdg6QnbFHrFF(poll);
                        }
                    } while (poll != null);
                    f91Var.lS5Rgt96tfkO(new WeakReference(uh0Var, (ReferenceQueue) cr1Var.wdg6QnbFHrFF));
                    r1Var.nLZGh9p8gVSu.wdg6QnbFHrFF(uh0Var);
                }
                this.zf8DYfih6EZu = null;
                vw0Var.gGoUzNp9JO5I = true;
                od1Var.PxuCJdSBwIXG();
                if (kRWHK87H9qm4().S9EYkSpbGuxq && vw0Var.EpkonXwzFgDB() && (ei1Var = vw0Var.S9EYkSpbGuxq) != null) {
                    ((r1) ei1Var).IAToe7bXGz4N(vw0Var);
                }
            }
            this.i68hK7ahKtgp = false;
            return;
        }
        this.e6tOsSdd2EFb = le0Var;
        if (this.zf8DYfih6EZu != null) {
            if (z2) {
                v(true);
                return;
            }
            return;
        }
        ei1 PxuCJdSBwIXG = yw0.PxuCJdSBwIXG(vw0Var);
        n2 n2Var2 = this.gGoUzNp9JO5I;
        if (n2Var2 == null) {
            n2 n2Var3 = new n2(2, this, new od1(this, i));
            this.gGoUzNp9JO5I = n2Var3;
            n2Var = n2Var3;
        } else {
            n2Var = n2Var2;
        }
        di1 di1Var = ei1.Companion;
        r1 r1Var2 = (r1) PxuCJdSBwIXG;
        cr1 cr1Var2 = r1Var2.HGgCfDnf0ga9;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) cr1Var2.wdg6QnbFHrFF;
            f91Var2 = (f91) cr1Var2.OPXfSBeufaJ8;
            poll2 = referenceQueue2.poll();
            if (poll2 != null) {
                f91Var2.wdg6QnbFHrFF(poll2);
            }
        } while (poll2 != null);
        while (true) {
            int i2 = f91Var2.wdg6QnbFHrFF;
            if (i2 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) f91Var2.dgRBjINgWbAK(i2 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        ci1 ci1Var2 = (ci1) obj;
        if (ci1Var2 != null) {
            uh0 uh0Var2 = (uh0) ci1Var2;
            nh0 nh0Var2 = uh0Var2.OPXfSBeufaJ8;
            if (nh0Var2 == null) {
                throw o0.a92UlCVFR9N8("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!uh0Var2.rtx2ld2ELZv4.RfyTYNmI9Srp) {
                ep0.PxuCJdSBwIXG("layer should have been released before reuse");
            }
            uh0Var2.rtx2ld2ELZv4 = nh0Var2.lS5Rgt96tfkO();
            uh0Var2.r3s1LDPKFs1S = false;
            uh0Var2.dgRBjINgWbAK = n2Var;
            uh0Var2.x50lh2ztY7Y5 = od1Var;
            uh0Var2.ZbWwgt3aGe7A = false;
            uh0Var2.pnx5pC0XzaCw = false;
            uh0Var2.IAToe7bXGz4N = true;
            d51.Y1f8riQaR6yg(uh0Var2.QrzZRwfaDlRX);
            float[] fArr = uh0Var2.gPXPFXrUH4XX;
            if (fArr != null) {
                d51.Y1f8riQaR6yg(fArr);
            }
            xk2.Companion.getClass();
            uh0Var2.VhhvGxCb8gfr = xk2.lS5Rgt96tfkO;
            uh0Var2.e6tOsSdd2EFb = false;
            uh0Var2.cpQdD2nAriOS = 9223372034707292159L;
            uh0Var2.S2OOm9zPNm0h = null;
            uh0Var2.S9EYkSpbGuxq = 0;
        } else {
            ci1Var2 = new uh0(r1Var2.getGraphicsContext().lS5Rgt96tfkO(), r1Var2.getGraphicsContext(), r1Var2, n2Var, od1Var);
        }
        uh0 uh0Var3 = (uh0) ci1Var2;
        uh0Var3.e9gEMXR7LXtO(this.wdg6QnbFHrFF);
        uh0Var3.Y1f8riQaR6yg(this.ozEBbv0hFTAB);
        this.zf8DYfih6EZu = ci1Var2;
        v(true);
        vw0Var.gGoUzNp9JO5I = true;
        od1Var.PxuCJdSBwIXG();
    }

    public final void v(boolean z) {
        char c;
        long j;
        int i;
        boolean z2;
        ei1 ei1Var;
        ae0 ae0Var;
        ae0 ae0Var2;
        ci1 ci1Var = this.zf8DYfih6EZu;
        le0 le0Var = this.e6tOsSdd2EFb;
        if (ci1Var == null) {
            if (le0Var == null) {
                return;
            }
            ep0.lS5Rgt96tfkO("null layer with a non-null layerBlock");
            return;
        }
        if (le0Var == null) {
            throw o0.a92UlCVFR9N8("updateLayerParameters requires a non-null layerBlock");
        }
        dw1 dw1Var = wLFCmsViZrNT;
        dw1Var.PxuCJdSBwIXG();
        vw0 vw0Var = this.VhhvGxCb8gfr;
        dw1Var.EcgxDIVH5in8 = vw0Var.rZjpSjn4zoMv;
        dw1Var.S9EYkSpbGuxq = vw0Var.BjEWd04qc7Mw;
        dw1Var.RfyTYNmI9Srp = kj0.gGoUzNp9JO5I(this.wdg6QnbFHrFF);
        ((r1) yw0.PxuCJdSBwIXG(vw0Var)).getSnapshotObserver().PxuCJdSBwIXG.Y1f8riQaR6yg(this, k1.J54yh1s3n4Aq, new i1(7, le0Var, this));
        wv0 wv0Var = this.EpkonXwzFgDB;
        if (wv0Var == null) {
            wv0Var = new wv0();
            this.EpkonXwzFgDB = wv0Var;
        }
        wv0 wv0Var2 = xbgXKYA2cIfu;
        wv0Var2.getClass();
        wv0Var2.PxuCJdSBwIXG = wv0Var.PxuCJdSBwIXG;
        wv0Var2.lS5Rgt96tfkO = wv0Var.lS5Rgt96tfkO;
        wv0Var2.TSizfFm2Yiuu = wv0Var.TSizfFm2Yiuu;
        wv0Var2.Y1f8riQaR6yg = wv0Var.Y1f8riQaR6yg;
        float f = dw1Var.OPXfSBeufaJ8;
        wv0Var.PxuCJdSBwIXG = f;
        wv0Var.lS5Rgt96tfkO = dw1Var.wdg6QnbFHrFF;
        wv0Var.TSizfFm2Yiuu = dw1Var.QrzZRwfaDlRX;
        long j2 = dw1Var.gPXPFXrUH4XX;
        wv0Var.Y1f8riQaR6yg = j2;
        uh0 uh0Var = (uh0) ci1Var;
        r1 r1Var = uh0Var.wdg6QnbFHrFF;
        int i2 = dw1Var.rtx2ld2ELZv4 | uh0Var.S9EYkSpbGuxq;
        uh0Var.RfyTYNmI9Srp = dw1Var.S9EYkSpbGuxq;
        uh0Var.XL4ISE6Oc65B = dw1Var.EcgxDIVH5in8;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            uh0Var.VhhvGxCb8gfr = j2;
        }
        if ((i2 & 1) != 0) {
            sh0 sh0Var = uh0Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
            if (sh0Var.Y1f8riQaR6yg() != f) {
                sh0Var.cpQdD2nAriOS(f);
            }
        }
        if ((i2 & 2) != 0) {
            ph0 ph0Var = uh0Var.rtx2ld2ELZv4;
            float f2 = dw1Var.wdg6QnbFHrFF;
            sh0 sh0Var2 = ph0Var.PxuCJdSBwIXG;
            if (sh0Var2.J54yh1s3n4Aq() != f2) {
                sh0Var2.jyegZNwi31qc(f2);
            }
        }
        if ((i2 & 4) != 0) {
            ph0 ph0Var2 = uh0Var.rtx2ld2ELZv4;
            float f3 = dw1Var.dgRBjINgWbAK;
            sh0 sh0Var3 = ph0Var2.PxuCJdSBwIXG;
            if (sh0Var3.PxuCJdSBwIXG() != f3) {
                sh0Var3.TSizfFm2Yiuu(f3);
            }
        }
        if ((i2 & 8) != 0) {
            sh0 sh0Var4 = uh0Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
            if (sh0Var4.BRwzKIf41E4i() != 0.0f) {
                sh0Var4.XL4ISE6Oc65B();
            }
        }
        if ((i2 & 16) != 0) {
            sh0 sh0Var5 = uh0Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
            if (sh0Var5.a92UlCVFR9N8() != 0.0f) {
                sh0Var5.RAsUl2FVSrh6();
            }
        }
        if ((i2 & 32) != 0) {
            ph0 ph0Var3 = uh0Var.rtx2ld2ELZv4;
            float f4 = dw1Var.x50lh2ztY7Y5;
            sh0 sh0Var6 = ph0Var3.PxuCJdSBwIXG;
            if (sh0Var6.ozEBbv0hFTAB() != f4) {
                sh0Var6.e9gEMXR7LXtO(f4);
                ph0Var3.RAsUl2FVSrh6 = true;
                ph0Var3.PxuCJdSBwIXG();
            }
            if (dw1Var.x50lh2ztY7Y5 > 0.0f && !uh0Var.e6tOsSdd2EFb && (ae0Var2 = uh0Var.x50lh2ztY7Y5) != null) {
                ae0Var2.PxuCJdSBwIXG();
            }
        }
        if ((i2 & 64) != 0) {
            ph0 ph0Var4 = uh0Var.rtx2ld2ELZv4;
            long j3 = dw1Var.cpQdD2nAriOS;
            sh0 sh0Var7 = ph0Var4.PxuCJdSBwIXG;
            if (!hl.TSizfFm2Yiuu(j3, sh0Var7.ryVscX7ZL4Ux())) {
                sh0Var7.wdg6QnbFHrFF(j3);
            }
        }
        if ((i2 & 128) != 0) {
            ph0 ph0Var5 = uh0Var.rtx2ld2ELZv4;
            long j4 = dw1Var.r3s1LDPKFs1S;
            sh0 sh0Var8 = ph0Var5.PxuCJdSBwIXG;
            if (!hl.TSizfFm2Yiuu(j4, sh0Var8.OPXfSBeufaJ8())) {
                sh0Var8.e6tOsSdd2EFb(j4);
            }
        }
        if ((i2 & 1024) != 0) {
            sh0 sh0Var9 = uh0Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
            if (sh0Var9.EpkonXwzFgDB() != 0.0f) {
                sh0Var9.IAToe7bXGz4N();
            }
        }
        if ((i2 & 256) != 0) {
            sh0 sh0Var10 = uh0Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
            if (sh0Var10.VhhvGxCb8gfr() != 0.0f) {
                sh0Var10.lS5Rgt96tfkO();
            }
        }
        if ((i2 & 512) != 0) {
            sh0 sh0Var11 = uh0Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
            if (sh0Var11.rZjpSjn4zoMv() != 0.0f) {
                sh0Var11.rtx2ld2ELZv4();
            }
        }
        if ((i2 & 2048) != 0) {
            ph0 ph0Var6 = uh0Var.rtx2ld2ELZv4;
            float f5 = dw1Var.QrzZRwfaDlRX;
            sh0 sh0Var12 = ph0Var6.PxuCJdSBwIXG;
            if (sh0Var12.QrzZRwfaDlRX() != f5) {
                sh0Var12.BjEWd04qc7Mw(f5);
            }
        }
        if (i3 != 0) {
            long j5 = uh0Var.VhhvGxCb8gfr;
            xk2.Companion.getClass();
            j = 4294967295L;
            boolean PxuCJdSBwIXG = xk2.PxuCJdSBwIXG(j5, xk2.lS5Rgt96tfkO);
            ph0 ph0Var7 = uh0Var.rtx2ld2ELZv4;
            if (PxuCJdSBwIXG) {
                bf1.Companion.getClass();
                c = ' ';
                if (!bf1.lS5Rgt96tfkO(ph0Var7.VhhvGxCb8gfr, 9205357640488583168L)) {
                    ph0Var7.VhhvGxCb8gfr = 9205357640488583168L;
                    ph0Var7.PxuCJdSBwIXG.nLZGh9p8gVSu(9205357640488583168L);
                }
            } else {
                c = ' ';
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (uh0Var.VhhvGxCb8gfr & 4294967295L)) * ((int) (uh0Var.cpQdD2nAriOS & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (uh0Var.VhhvGxCb8gfr >> 32)) * ((int) (uh0Var.cpQdD2nAriOS >> 32))) << 32);
                if (!bf1.lS5Rgt96tfkO(ph0Var7.VhhvGxCb8gfr, floatToRawIntBits)) {
                    ph0Var7.VhhvGxCb8gfr = floatToRawIntBits;
                    ph0Var7.PxuCJdSBwIXG.nLZGh9p8gVSu(floatToRawIntBits);
                }
            }
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if ((i2 & 16384) != 0) {
            ph0 ph0Var8 = uh0Var.rtx2ld2ELZv4;
            boolean z3 = dw1Var.XL4ISE6Oc65B;
            if (ph0Var8.S2OOm9zPNm0h != z3) {
                ph0Var8.S2OOm9zPNm0h = z3;
                ph0Var8.RAsUl2FVSrh6 = true;
                ph0Var8.PxuCJdSBwIXG();
            }
        }
        if ((131072 & i2) != 0) {
            sh0 sh0Var13 = uh0Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
        }
        if ((262144 & i2) != 0) {
            sh0 sh0Var14 = uh0Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
            if (!cs0.wdg6QnbFHrFF(sh0Var14.ZbWwgt3aGe7A(), null)) {
                sh0Var14.x50lh2ztY7Y5();
            }
        }
        if ((524288 & i2) != 0) {
            ph0 ph0Var9 = uh0Var.rtx2ld2ELZv4;
            int i4 = dw1Var.VhhvGxCb8gfr;
            sh0 sh0Var15 = ph0Var9.PxuCJdSBwIXG;
            if (sh0Var15.xfACYKDMU6Dj() != i4) {
                sh0Var15.r3s1LDPKFs1S(i4);
            }
        }
        if ((32768 & i2) != 0) {
            ph0 ph0Var10 = uh0Var.rtx2ld2ELZv4;
            sp.Companion.getClass();
            rp.Companion.getClass();
            sh0 sh0Var16 = ph0Var10.PxuCJdSBwIXG;
            if (sh0Var16.S9EYkSpbGuxq() != 0) {
                sh0Var16.pnx5pC0XzaCw(0);
            }
        }
        if ((i2 & 7963) != 0) {
            uh0Var.ZbWwgt3aGe7A = true;
            uh0Var.pnx5pC0XzaCw = true;
        }
        if (cs0.wdg6QnbFHrFF(uh0Var.S2OOm9zPNm0h, dw1Var.S2OOm9zPNm0h)) {
            i = i2;
            z2 = false;
        } else {
            th0 th0Var = dw1Var.S2OOm9zPNm0h;
            uh0Var.S2OOm9zPNm0h = th0Var;
            if (th0Var == null) {
                i = i2;
            } else {
                ph0 ph0Var11 = uh0Var.rtx2ld2ELZv4;
                if (th0Var instanceof xh1) {
                    qt1 qt1Var = ((xh1) th0Var).TSizfFm2Yiuu;
                    float f6 = qt1Var.PxuCJdSBwIXG;
                    float f7 = qt1Var.lS5Rgt96tfkO;
                    char c2 = c;
                    ph0Var11.a92UlCVFR9N8(0.0f, (Float.floatToRawIntBits(f6) << c2) | (Float.floatToRawIntBits(f7) & j), (Float.floatToRawIntBits(qt1Var.TSizfFm2Yiuu - f6) << c2) | (Float.floatToRawIntBits(qt1Var.Y1f8riQaR6yg - f7) & j));
                } else {
                    char c3 = c;
                    if (th0Var instanceof wh1) {
                        yj1 yj1Var = ((wh1) th0Var).TSizfFm2Yiuu;
                        ph0Var11.e9gEMXR7LXtO();
                        ph0Var11.x50lh2ztY7Y5 = yj1Var;
                        ph0Var11.PxuCJdSBwIXG();
                    } else {
                        if (!(th0Var instanceof yh1)) {
                            u9.gPXPFXrUH4XX();
                            return;
                        }
                        yh1 yh1Var = (yh1) th0Var;
                        r4 r4Var = yh1Var.Y1f8riQaR6yg;
                        if (r4Var != null) {
                            ph0Var11.e9gEMXR7LXtO();
                            ph0Var11.x50lh2ztY7Y5 = r4Var;
                            ph0Var11.PxuCJdSBwIXG();
                        } else {
                            mx1 mx1Var = yh1Var.TSizfFm2Yiuu;
                            float f8 = mx1Var.lS5Rgt96tfkO;
                            float f9 = mx1Var.PxuCJdSBwIXG;
                            i = i2;
                            ph0Var11.a92UlCVFR9N8(Float.intBitsToFloat((int) (mx1Var.rtx2ld2ELZv4 >> c3)), (Float.floatToRawIntBits(f9) << c3) | (Float.floatToRawIntBits(f8) & j), (Float.floatToRawIntBits(mx1Var.TSizfFm2Yiuu - f9) << c3) | (Float.floatToRawIntBits(mx1Var.Y1f8riQaR6yg - f8) & j));
                            if (Build.VERSION.SDK_INT < 33 && (((th0Var instanceof wh1) || ((th0Var instanceof yh1) && !ki0.zf8DYfih6EZu(((yh1) th0Var).TSizfFm2Yiuu))) && (ae0Var = uh0Var.x50lh2ztY7Y5) != null)) {
                                ae0Var.PxuCJdSBwIXG();
                            }
                        }
                    }
                }
                i = i2;
                if (Build.VERSION.SDK_INT < 33) {
                    ae0Var.PxuCJdSBwIXG();
                }
            }
            z2 = true;
        }
        uh0Var.S9EYkSpbGuxq = dw1Var.rtx2ld2ELZv4;
        if (i != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                ViewParent parent = r1Var.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(r1Var, r1Var);
                }
            } else {
                r1Var.invalidate();
            }
            if (r1.BRwzKIf41E4i()) {
                r1Var.amuv7NJvPxHu(0.0f);
            }
        }
        boolean z4 = this.IAToe7bXGz4N;
        this.IAToe7bXGz4N = dw1Var.XL4ISE6Oc65B;
        this.kpCQ9veP6n3I = dw1Var.dgRBjINgWbAK;
        boolean z5 = wv0Var2.PxuCJdSBwIXG == wv0Var.PxuCJdSBwIXG && wv0Var2.lS5Rgt96tfkO == wv0Var.lS5Rgt96tfkO && wv0Var2.TSizfFm2Yiuu == wv0Var.TSizfFm2Yiuu && xk2.PxuCJdSBwIXG(wv0Var2.Y1f8riQaR6yg, wv0Var.Y1f8riQaR6yg);
        if (z && ((!z5 || z4 != this.IAToe7bXGz4N) && (ei1Var = vw0Var.S9EYkSpbGuxq) != null)) {
            ((r1) ei1Var).IAToe7bXGz4N(vw0Var);
        }
        if (z5) {
            return;
        }
        vw0Var.Pf0ThKz3j5YS(this);
        if (vw0Var.wLFCmsViZrNT > 0) {
            r1 r1Var2 = (r1) yw0.PxuCJdSBwIXG(vw0Var);
            bg1 bg1Var = r1Var2.qudtW7lwm99e.e9gEMXR7LXtO;
            bg1Var.getClass();
            if (vw0Var.wLFCmsViZrNT > 0) {
                bg1Var.PxuCJdSBwIXG.lS5Rgt96tfkO(vw0Var);
                vw0Var.zf8DYfih6EZu = true;
            }
            r1Var2.ozEBbv0hFTAB(null);
        }
    }

    public abstract w31 vfcx0XMziUg4();

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        ci1 ci1Var = this.zf8DYfih6EZu;
        if (ci1Var == null || !this.IAToe7bXGz4N) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        ph0 ph0Var = ((uh0) ci1Var).rtx2ld2ELZv4;
        if (ph0Var.S2OOm9zPNm0h) {
            th0 Y1f8riQaR6yg = ph0Var.Y1f8riQaR6yg();
            if (!(Y1f8riQaR6yg instanceof xh1)) {
                if (Y1f8riQaR6yg instanceof yh1) {
                    mx1 mx1Var = ((yh1) Y1f8riQaR6yg).TSizfFm2Yiuu;
                    float f = mx1Var.TSizfFm2Yiuu;
                    float f2 = mx1Var.lS5Rgt96tfkO;
                    float f3 = mx1Var.Y1f8riQaR6yg;
                    float f4 = mx1Var.PxuCJdSBwIXG;
                    long j2 = mx1Var.a92UlCVFR9N8;
                    long j3 = mx1Var.rtx2ld2ELZv4;
                    z = false;
                    z2 = true;
                    long j4 = mx1Var.RAsUl2FVSrh6;
                    long j5 = mx1Var.e9gEMXR7LXtO;
                    if (intBitsToFloat >= f4 && intBitsToFloat < f && intBitsToFloat2 >= f2 && intBitsToFloat2 < f3) {
                        int i = (int) (j5 >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        int i2 = (int) (j2 >> 32);
                        if (Float.intBitsToFloat(i2) + intBitsToFloat3 <= f - f4) {
                            int i3 = (int) (j3 >> 32);
                            float intBitsToFloat4 = Float.intBitsToFloat(i3);
                            int i4 = (int) (j4 >> 32);
                            if (Float.intBitsToFloat(i4) + intBitsToFloat4 <= f - f4) {
                                int i5 = (int) (j5 & 4294967295L);
                                int i6 = (int) (j3 & 4294967295L);
                                if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                    int i7 = (int) (j2 & 4294967295L);
                                    int i8 = (int) (j4 & 4294967295L);
                                    if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                        float intBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                        float intBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                        float intBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                        float intBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                        float intBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                        float intBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                        float intBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                        float intBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                        if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                            z3 = th0.pnx5pC0XzaCw(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, mx1Var.e9gEMXR7LXtO);
                                        } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                            z3 = th0.pnx5pC0XzaCw(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, mx1Var.rtx2ld2ELZv4);
                                        } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                z3 = th0.pnx5pC0XzaCw(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, mx1Var.RAsUl2FVSrh6);
                                            }
                                            z3 = z2;
                                        } else {
                                            z3 = th0.pnx5pC0XzaCw(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, mx1Var.a92UlCVFR9N8);
                                        }
                                    }
                                }
                            }
                        }
                        r4 PxuCJdSBwIXG = t4.PxuCJdSBwIXG();
                        yj1.TSizfFm2Yiuu(PxuCJdSBwIXG, mx1Var);
                        z3 = th0.ZbWwgt3aGe7A(PxuCJdSBwIXG, intBitsToFloat, intBitsToFloat2);
                    }
                } else {
                    z = false;
                    z2 = true;
                    if (!(Y1f8riQaR6yg instanceof wh1)) {
                        u9.gPXPFXrUH4XX();
                        return false;
                    }
                    z3 = th0.ZbWwgt3aGe7A(((wh1) Y1f8riQaR6yg).TSizfFm2Yiuu, intBitsToFloat, intBitsToFloat2);
                }
                return z3 ? z2 : z;
            }
            qt1 qt1Var = ((xh1) Y1f8riQaR6yg).TSizfFm2Yiuu;
            if (qt1Var.PxuCJdSBwIXG > intBitsToFloat || intBitsToFloat >= qt1Var.TSizfFm2Yiuu || qt1Var.lS5Rgt96tfkO > intBitsToFloat2 || intBitsToFloat2 >= qt1Var.Y1f8riQaR6yg) {
                z = false;
                z2 = true;
            }
            z3 = z;
            if (z3) {
            }
        }
        z = false;
        z2 = true;
        z3 = z2;
        if (z3) {
        }
    }

    public final void wcHq2YQJmeHg(m61 m61Var, nd1 nd1Var, long j, zj0 zj0Var, int i, boolean z, float f) {
        if (m61Var == null) {
            b(nd1Var, j, zj0Var, i, z);
            return;
        }
        if (!nd1Var.RAsUl2FVSrh6(m61Var)) {
            wcHq2YQJmeHg(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i, z, f);
            return;
        }
        int i2 = zj0Var.wdg6QnbFHrFF;
        p81 p81Var = zj0Var.rtx2ld2ELZv4;
        zj0Var.lS5Rgt96tfkO(i2 + 1, p81Var.lS5Rgt96tfkO);
        zj0Var.wdg6QnbFHrFF++;
        p81Var.PxuCJdSBwIXG(m61Var);
        zj0Var.OPXfSBeufaJ8.PxuCJdSBwIXG(ng0.PxuCJdSBwIXG(f, z, false));
        j(ki0.dgRBjINgWbAK(m61Var, nd1Var.e9gEMXR7LXtO()), nd1Var, j, zj0Var, i, z, f, true);
        zj0Var.wdg6QnbFHrFF = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [m61] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [m61] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [f91] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [f91] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.em1, defpackage.e51
    public final Object wdg6QnbFHrFF() {
        vw0 vw0Var = this.VhhvGxCb8gfr;
        if (!vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg(64)) {
            return null;
        }
        kRWHK87H9qm4();
        Object obj = null;
        for (m61 m61Var = vw0Var.nLZGh9p8gVSu.e9gEMXR7LXtO; m61Var != null; m61Var = m61Var.x50lh2ztY7Y5) {
            if ((m61Var.wdg6QnbFHrFF & 64) != 0) {
                ux uxVar = m61Var;
                ?? r4 = 0;
                while (uxVar != 0) {
                    if (uxVar instanceof nj1) {
                        obj = ((nj1) uxVar).fRTaYY6FBZcX(obj);
                    } else if ((uxVar.wdg6QnbFHrFF & 64) != 0 && (uxVar instanceof ux)) {
                        m61 m61Var2 = uxVar.S2OOm9zPNm0h;
                        int i = 0;
                        uxVar = uxVar;
                        r4 = r4;
                        while (m61Var2 != null) {
                            if ((m61Var2.wdg6QnbFHrFF & 64) != 0) {
                                i++;
                                r4 = r4;
                                if (i == 1) {
                                    uxVar = m61Var2;
                                } else {
                                    if (r4 == 0) {
                                        r4 = new f91(new m61[16]);
                                    }
                                    if (uxVar != 0) {
                                        r4.lS5Rgt96tfkO(uxVar);
                                        uxVar = 0;
                                    }
                                    r4.lS5Rgt96tfkO(m61Var2);
                                }
                            }
                            m61Var2 = m61Var2.cpQdD2nAriOS;
                            uxVar = uxVar;
                            r4 = r4;
                        }
                        if (i == 1) {
                        }
                    }
                    uxVar = zv.dgRBjINgWbAK(r4);
                }
            }
        }
        return obj;
    }

    @Override // defpackage.u31
    public final long wnqUPcAvl7HT() {
        return this.ozEBbv0hFTAB;
    }

    @Override // defpackage.u31
    public final bw0 HqMwxkFaipxD() {
        return this;
    }
}
