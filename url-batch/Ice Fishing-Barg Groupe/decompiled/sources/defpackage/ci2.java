package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ci2 implements kn1 {
    public final ArrayList OPXfSBeufaJ8;
    public final View PxuCJdSBwIXG;
    public oh2 RAsUl2FVSrh6;
    public final di2 TSizfFm2Yiuu;
    public boolean Y1f8riQaR6yg;
    public le0 a92UlCVFR9N8;
    public final f91 cpQdD2nAriOS;
    public Rect dgRBjINgWbAK;
    public le0 e9gEMXR7LXtO;
    public final m9 lS5Rgt96tfkO;
    public BRwzKIf41E4i r3s1LDPKFs1S;
    public ln0 rtx2ld2ELZv4;
    public final nx0 wdg6QnbFHrFF;
    public final fv x50lh2ztY7Y5;

    public ci2(View view, r1 r1Var) {
        m9 m9Var = new m9(view);
        di2 di2Var = new di2(Choreographer.getInstance());
        this.PxuCJdSBwIXG = view;
        this.lS5Rgt96tfkO = m9Var;
        this.TSizfFm2Yiuu = di2Var;
        this.e9gEMXR7LXtO = gi1.RfyTYNmI9Srp;
        this.a92UlCVFR9N8 = gi1.EcgxDIVH5in8;
        vi2.Companion.getClass();
        this.RAsUl2FVSrh6 = new oh2(4, vi2.lS5Rgt96tfkO, "");
        ln0.Companion.getClass();
        this.rtx2ld2ELZv4 = ln0.a92UlCVFR9N8;
        this.OPXfSBeufaJ8 = new ArrayList();
        this.wdg6QnbFHrFF = vi0.ryVscX7ZL4Ux(pz0.OPXfSBeufaJ8, new y4(14, this));
        this.x50lh2ztY7Y5 = new fv(r1Var, m9Var);
        this.cpQdD2nAriOS = new f91(new bi2[16]);
    }

    public final void OPXfSBeufaJ8(bi2 bi2Var) {
        this.cpQdD2nAriOS.lS5Rgt96tfkO(bi2Var);
        if (this.r3s1LDPKFs1S == null) {
            BRwzKIf41E4i bRwzKIf41E4i = new BRwzKIf41E4i(12, this);
            this.TSizfFm2Yiuu.execute(bRwzKIf41E4i);
            this.r3s1LDPKFs1S = bRwzKIf41E4i;
        }
    }

    @Override // defpackage.kn1
    public final void PxuCJdSBwIXG(oh2 oh2Var, ln0 ln0Var, cd cdVar, le0 le0Var) {
        this.Y1f8riQaR6yg = true;
        this.RAsUl2FVSrh6 = oh2Var;
        this.rtx2ld2ELZv4 = ln0Var;
        this.e9gEMXR7LXtO = cdVar;
        this.a92UlCVFR9N8 = le0Var;
        OPXfSBeufaJ8(bi2.rtx2ld2ELZv4);
    }

    @Override // defpackage.kn1
    public final void RAsUl2FVSrh6() {
        this.Y1f8riQaR6yg = false;
        this.e9gEMXR7LXtO = gi1.S9EYkSpbGuxq;
        this.a92UlCVFR9N8 = gi1.VhhvGxCb8gfr;
        this.dgRBjINgWbAK = null;
        OPXfSBeufaJ8(bi2.OPXfSBeufaJ8);
    }

    @Override // defpackage.kn1
    public final void TSizfFm2Yiuu(oh2 oh2Var, df1 df1Var, ji2 ji2Var, d0 d0Var, qt1 qt1Var, qt1 qt1Var2) {
        fv fvVar = this.x50lh2ztY7Y5;
        synchronized (fvVar.TSizfFm2Yiuu) {
            try {
                fvVar.wdg6QnbFHrFF = oh2Var;
                fvVar.x50lh2ztY7Y5 = df1Var;
                fvVar.dgRBjINgWbAK = ji2Var;
                fvVar.cpQdD2nAriOS = d0Var;
                fvVar.r3s1LDPKFs1S = qt1Var;
                fvVar.QrzZRwfaDlRX = qt1Var2;
                if (!fvVar.e9gEMXR7LXtO) {
                    if (fvVar.Y1f8riQaR6yg) {
                    }
                }
                fvVar.PxuCJdSBwIXG();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kn1
    public final void Y1f8riQaR6yg(oh2 oh2Var, oh2 oh2Var2) {
        boolean z = (vi2.lS5Rgt96tfkO(this.RAsUl2FVSrh6.lS5Rgt96tfkO, oh2Var2.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.RAsUl2FVSrh6.TSizfFm2Yiuu, oh2Var2.TSizfFm2Yiuu)) ? false : true;
        this.RAsUl2FVSrh6 = oh2Var2;
        int size = this.OPXfSBeufaJ8.size();
        for (int i = 0; i < size; i++) {
            kt1 kt1Var = (kt1) ((WeakReference) this.OPXfSBeufaJ8.get(i)).get();
            if (kt1Var != null) {
                kt1Var.Y1f8riQaR6yg = oh2Var2;
            }
        }
        fv fvVar = this.x50lh2ztY7Y5;
        synchronized (fvVar.TSizfFm2Yiuu) {
            fvVar.wdg6QnbFHrFF = null;
            fvVar.x50lh2ztY7Y5 = null;
            fvVar.dgRBjINgWbAK = null;
            fvVar.cpQdD2nAriOS = k1.S2OOm9zPNm0h;
            fvVar.r3s1LDPKFs1S = null;
            fvVar.QrzZRwfaDlRX = null;
        }
        if (cs0.wdg6QnbFHrFF(oh2Var, oh2Var2)) {
            if (z) {
                m9 m9Var = this.lS5Rgt96tfkO;
                int a92UlCVFR9N8 = vi2.a92UlCVFR9N8(oh2Var2.lS5Rgt96tfkO);
                int e9gEMXR7LXtO = vi2.e9gEMXR7LXtO(oh2Var2.lS5Rgt96tfkO);
                vi2 vi2Var = this.RAsUl2FVSrh6.TSizfFm2Yiuu;
                int a92UlCVFR9N82 = vi2Var != null ? vi2.a92UlCVFR9N8(vi2Var.PxuCJdSBwIXG) : -1;
                vi2 vi2Var2 = this.RAsUl2FVSrh6.TSizfFm2Yiuu;
                ((InputMethodManager) ((nx0) m9Var.wdg6QnbFHrFF).getValue()).updateSelection((View) m9Var.OPXfSBeufaJ8, a92UlCVFR9N8, e9gEMXR7LXtO, a92UlCVFR9N82, vi2Var2 != null ? vi2.e9gEMXR7LXtO(vi2Var2.PxuCJdSBwIXG) : -1);
                return;
            }
            return;
        }
        if (oh2Var != null && (!cs0.wdg6QnbFHrFF(oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8, oh2Var2.PxuCJdSBwIXG.OPXfSBeufaJ8) || (vi2.lS5Rgt96tfkO(oh2Var.lS5Rgt96tfkO, oh2Var2.lS5Rgt96tfkO) && !cs0.wdg6QnbFHrFF(oh2Var.TSizfFm2Yiuu, oh2Var2.TSizfFm2Yiuu)))) {
            m9 m9Var2 = this.lS5Rgt96tfkO;
            ((InputMethodManager) ((nx0) m9Var2.wdg6QnbFHrFF).getValue()).restartInput((View) m9Var2.OPXfSBeufaJ8);
            return;
        }
        int size2 = this.OPXfSBeufaJ8.size();
        for (int i2 = 0; i2 < size2; i2++) {
            kt1 kt1Var2 = (kt1) ((WeakReference) this.OPXfSBeufaJ8.get(i2)).get();
            if (kt1Var2 != null) {
                oh2 oh2Var3 = this.RAsUl2FVSrh6;
                m9 m9Var3 = this.lS5Rgt96tfkO;
                if (kt1Var2.rtx2ld2ELZv4) {
                    kt1Var2.Y1f8riQaR6yg = oh2Var3;
                    if (kt1Var2.a92UlCVFR9N8) {
                        ((InputMethodManager) ((nx0) m9Var3.wdg6QnbFHrFF).getValue()).updateExtractedText((View) m9Var3.OPXfSBeufaJ8, kt1Var2.e9gEMXR7LXtO, ki0.nxJAScVArhE9(oh2Var3));
                    }
                    vi2 vi2Var3 = oh2Var3.TSizfFm2Yiuu;
                    long j = oh2Var3.lS5Rgt96tfkO;
                    int a92UlCVFR9N83 = vi2Var3 != null ? vi2.a92UlCVFR9N8(vi2Var3.PxuCJdSBwIXG) : -1;
                    vi2 vi2Var4 = oh2Var3.TSizfFm2Yiuu;
                    ((InputMethodManager) ((nx0) m9Var3.wdg6QnbFHrFF).getValue()).updateSelection((View) m9Var3.OPXfSBeufaJ8, vi2.a92UlCVFR9N8(j), vi2.e9gEMXR7LXtO(j), a92UlCVFR9N83, vi2Var4 != null ? vi2.e9gEMXR7LXtO(vi2Var4.PxuCJdSBwIXG) : -1);
                }
            }
        }
    }

    @Override // defpackage.kn1
    public final void a92UlCVFR9N8() {
        OPXfSBeufaJ8(bi2.dgRBjINgWbAK);
    }

    @Override // defpackage.kn1
    public final void e9gEMXR7LXtO() {
        OPXfSBeufaJ8(bi2.wdg6QnbFHrFF);
    }

    @Override // defpackage.kn1
    public final void lS5Rgt96tfkO() {
        OPXfSBeufaJ8(bi2.rtx2ld2ELZv4);
    }

    @Override // defpackage.kn1
    public final void rtx2ld2ELZv4(qt1 qt1Var) {
        Rect rect;
        this.dgRBjINgWbAK = new Rect(b51.IXK6ba3ucyzm(qt1Var.PxuCJdSBwIXG), b51.IXK6ba3ucyzm(qt1Var.lS5Rgt96tfkO), b51.IXK6ba3ucyzm(qt1Var.TSizfFm2Yiuu), b51.IXK6ba3ucyzm(qt1Var.Y1f8riQaR6yg));
        if (!this.OPXfSBeufaJ8.isEmpty() || (rect = this.dgRBjINgWbAK) == null) {
            return;
        }
        this.PxuCJdSBwIXG.requestRectangleOnScreen(new Rect(rect));
    }
}
