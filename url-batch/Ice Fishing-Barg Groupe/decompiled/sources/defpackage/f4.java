package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class f4 implements kn1 {
    public tz0 PxuCJdSBwIXG;
    public zz0 TSizfFm2Yiuu;
    public h52 Y1f8riQaR6yg;
    public z82 lS5Rgt96tfkO;

    public final z81 OPXfSBeufaJ8() {
        h52 h52Var = this.Y1f8riQaR6yg;
        if (h52Var != null) {
            return h52Var;
        }
        if (!za2.PxuCJdSBwIXG) {
            return null;
        }
        h52 tmVwIGCQF4zR = b51.tmVwIGCQF4zR(2, ag.wdg6QnbFHrFF);
        this.Y1f8riQaR6yg = tmVwIGCQF4zR;
        return tmVwIGCQF4zR;
    }

    @Override // defpackage.kn1
    public final void PxuCJdSBwIXG(oh2 oh2Var, ln0 ln0Var, cd cdVar, le0 le0Var) {
        wdg6QnbFHrFF(new a4(oh2Var, this, ln0Var, cdVar, le0Var, 0));
    }

    @Override // defpackage.kn1
    public final void RAsUl2FVSrh6() {
        z82 z82Var = this.lS5Rgt96tfkO;
        if (z82Var != null) {
            z82Var.a92UlCVFR9N8(null);
        }
        this.lS5Rgt96tfkO = null;
        z81 OPXfSBeufaJ8 = OPXfSBeufaJ8();
        if (OPXfSBeufaJ8 != null) {
            h52 h52Var = (h52) OPXfSBeufaJ8;
            synchronized (h52Var) {
                h52Var.S9EYkSpbGuxq(h52Var.QrzZRwfaDlRX() + h52Var.XL4ISE6Oc65B, h52Var.BRwzKIf41E4i, h52Var.QrzZRwfaDlRX() + h52Var.XL4ISE6Oc65B, h52Var.QrzZRwfaDlRX() + h52Var.XL4ISE6Oc65B + h52Var.RfyTYNmI9Srp);
            }
        }
    }

    @Override // defpackage.kn1
    public final void TSizfFm2Yiuu(oh2 oh2Var, df1 df1Var, ji2 ji2Var, d0 d0Var, qt1 qt1Var, qt1 qt1Var2) {
        zz0 zz0Var = this.TSizfFm2Yiuu;
        if (zz0Var != null) {
            uz0 uz0Var = zz0Var.cpQdD2nAriOS;
            synchronized (uz0Var.TSizfFm2Yiuu) {
                try {
                    uz0Var.wdg6QnbFHrFF = oh2Var;
                    uz0Var.x50lh2ztY7Y5 = df1Var;
                    uz0Var.dgRBjINgWbAK = ji2Var;
                    uz0Var.cpQdD2nAriOS = qt1Var;
                    uz0Var.r3s1LDPKFs1S = qt1Var2;
                    if (!uz0Var.e9gEMXR7LXtO) {
                        if (uz0Var.Y1f8riQaR6yg) {
                        }
                    }
                    uz0Var.PxuCJdSBwIXG();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.kn1
    public final void Y1f8riQaR6yg(oh2 oh2Var, oh2 oh2Var2) {
        zz0 zz0Var = this.TSizfFm2Yiuu;
        if (zz0Var != null) {
            boolean z = (vi2.lS5Rgt96tfkO(zz0Var.rtx2ld2ELZv4.lS5Rgt96tfkO, oh2Var2.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(zz0Var.rtx2ld2ELZv4.TSizfFm2Yiuu, oh2Var2.TSizfFm2Yiuu)) ? false : true;
            zz0Var.rtx2ld2ELZv4 = oh2Var2;
            int size = zz0Var.wdg6QnbFHrFF.size();
            for (int i = 0; i < size; i++) {
                lt1 lt1Var = (lt1) ((WeakReference) zz0Var.wdg6QnbFHrFF.get(i)).get();
                if (lt1Var != null) {
                    lt1Var.RAsUl2FVSrh6 = oh2Var2;
                }
            }
            uz0 uz0Var = zz0Var.cpQdD2nAriOS;
            synchronized (uz0Var.TSizfFm2Yiuu) {
                uz0Var.wdg6QnbFHrFF = null;
                uz0Var.x50lh2ztY7Y5 = null;
                uz0Var.dgRBjINgWbAK = null;
                uz0Var.cpQdD2nAriOS = null;
                uz0Var.r3s1LDPKFs1S = null;
            }
            if (cs0.wdg6QnbFHrFF(oh2Var, oh2Var2)) {
                if (z) {
                    op0 op0Var = zz0Var.lS5Rgt96tfkO;
                    int a92UlCVFR9N8 = vi2.a92UlCVFR9N8(oh2Var2.lS5Rgt96tfkO);
                    int e9gEMXR7LXtO = vi2.e9gEMXR7LXtO(oh2Var2.lS5Rgt96tfkO);
                    vi2 vi2Var = zz0Var.rtx2ld2ELZv4.TSizfFm2Yiuu;
                    int a92UlCVFR9N82 = vi2Var != null ? vi2.a92UlCVFR9N8(vi2Var.PxuCJdSBwIXG) : -1;
                    vi2 vi2Var2 = zz0Var.rtx2ld2ELZv4.TSizfFm2Yiuu;
                    op0Var.gPXPFXrUH4XX().updateSelection((View) op0Var.OPXfSBeufaJ8, a92UlCVFR9N8, e9gEMXR7LXtO, a92UlCVFR9N82, vi2Var2 != null ? vi2.e9gEMXR7LXtO(vi2Var2.PxuCJdSBwIXG) : -1);
                    return;
                }
                return;
            }
            if (oh2Var != null && (!cs0.wdg6QnbFHrFF(oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8, oh2Var2.PxuCJdSBwIXG.OPXfSBeufaJ8) || (vi2.lS5Rgt96tfkO(oh2Var.lS5Rgt96tfkO, oh2Var2.lS5Rgt96tfkO) && !cs0.wdg6QnbFHrFF(oh2Var.TSizfFm2Yiuu, oh2Var2.TSizfFm2Yiuu)))) {
                op0 op0Var2 = zz0Var.lS5Rgt96tfkO;
                op0Var2.gPXPFXrUH4XX().restartInput((View) op0Var2.OPXfSBeufaJ8);
                return;
            }
            int size2 = zz0Var.wdg6QnbFHrFF.size();
            for (int i2 = 0; i2 < size2; i2++) {
                lt1 lt1Var2 = (lt1) ((WeakReference) zz0Var.wdg6QnbFHrFF.get(i2)).get();
                if (lt1Var2 != null) {
                    oh2 oh2Var3 = zz0Var.rtx2ld2ELZv4;
                    op0 op0Var3 = zz0Var.lS5Rgt96tfkO;
                    if (lt1Var2.dgRBjINgWbAK) {
                        lt1Var2.RAsUl2FVSrh6 = oh2Var3;
                        if (lt1Var2.OPXfSBeufaJ8) {
                            op0Var3.gPXPFXrUH4XX().updateExtractedText((View) op0Var3.OPXfSBeufaJ8, lt1Var2.rtx2ld2ELZv4, ni0.e9gEMXR7LXtO(oh2Var3));
                        }
                        vi2 vi2Var3 = oh2Var3.TSizfFm2Yiuu;
                        long j = oh2Var3.lS5Rgt96tfkO;
                        int a92UlCVFR9N83 = vi2Var3 != null ? vi2.a92UlCVFR9N8(vi2Var3.PxuCJdSBwIXG) : -1;
                        vi2 vi2Var4 = oh2Var3.TSizfFm2Yiuu;
                        op0Var3.gPXPFXrUH4XX().updateSelection((View) op0Var3.OPXfSBeufaJ8, vi2.a92UlCVFR9N8(j), vi2.e9gEMXR7LXtO(j), a92UlCVFR9N83, vi2Var4 != null ? vi2.e9gEMXR7LXtO(vi2Var4.PxuCJdSBwIXG) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.kn1
    public final void a92UlCVFR9N8() {
        j82 j82Var;
        tz0 tz0Var = this.PxuCJdSBwIXG;
        if (tz0Var == null || (j82Var = (j82) f2.QrzZRwfaDlRX(tz0Var, eq.BRwzKIf41E4i)) == null) {
            return;
        }
        ((wx) j82Var).PxuCJdSBwIXG();
    }

    public final void dgRBjINgWbAK(tz0 tz0Var) {
        if (!(this.PxuCJdSBwIXG == tz0Var)) {
            hp0.TSizfFm2Yiuu("Expected textInputModifierNode to be " + tz0Var + " but was " + this.PxuCJdSBwIXG);
        }
        this.PxuCJdSBwIXG = null;
    }

    @Override // defpackage.kn1
    public final void e9gEMXR7LXtO() {
        j82 j82Var;
        tz0 tz0Var = this.PxuCJdSBwIXG;
        if (tz0Var == null || (j82Var = (j82) f2.QrzZRwfaDlRX(tz0Var, eq.BRwzKIf41E4i)) == null) {
            return;
        }
        ((wx) j82Var).lS5Rgt96tfkO();
    }

    @Override // defpackage.kn1
    public final void lS5Rgt96tfkO() {
        wdg6QnbFHrFF(null);
    }

    @Override // defpackage.kn1
    public final void rtx2ld2ELZv4(qt1 qt1Var) {
        Rect rect;
        zz0 zz0Var = this.TSizfFm2Yiuu;
        if (zz0Var != null) {
            zz0Var.x50lh2ztY7Y5 = new Rect(b51.IXK6ba3ucyzm(qt1Var.PxuCJdSBwIXG), b51.IXK6ba3ucyzm(qt1Var.lS5Rgt96tfkO), b51.IXK6ba3ucyzm(qt1Var.TSizfFm2Yiuu), b51.IXK6ba3ucyzm(qt1Var.Y1f8riQaR6yg));
            if (!zz0Var.wdg6QnbFHrFF.isEmpty() || (rect = zz0Var.x50lh2ztY7Y5) == null) {
                return;
            }
            zz0Var.PxuCJdSBwIXG.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final void wdg6QnbFHrFF(a4 a4Var) {
        tz0 tz0Var = this.PxuCJdSBwIXG;
        if (tz0Var == null) {
            return;
        }
        this.lS5Rgt96tfkO = tz0Var.S9EYkSpbGuxq ? fx1.KUoIVIumpKat(tz0Var.GlTbNTgfSMqy(), null, new a92UlCVFR9N8(tz0Var, new e4(a4Var, this, tz0Var, r4, 0), r4, 18), 1) : null;
    }
}
