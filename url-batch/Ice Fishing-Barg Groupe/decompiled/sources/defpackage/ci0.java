package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ci0 implements sh0 {
    public static final bi0 Companion = new bi0();
    public static final ai0 VhhvGxCb8gfr = new ai0();
    public float BRwzKIf41E4i;
    public long EcgxDIVH5in8;
    public long OPXfSBeufaJ8;
    public final g30 PxuCJdSBwIXG;
    public float QrzZRwfaDlRX;
    public int RAsUl2FVSrh6;
    public float RfyTYNmI9Srp;
    public long S9EYkSpbGuxq;
    public final br2 TSizfFm2Yiuu;
    public float XL4ISE6Oc65B;
    public final Resources Y1f8riQaR6yg;
    public Paint a92UlCVFR9N8;
    public int cpQdD2nAriOS;
    public boolean dgRBjINgWbAK;
    public final Rect e9gEMXR7LXtO;
    public boolean gPXPFXrUH4XX;
    public final ki lS5Rgt96tfkO;
    public int r3s1LDPKFs1S;
    public int rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;
    public boolean x50lh2ztY7Y5;

    public ci0(g30 g30Var) {
        ki kiVar = new ki();
        ji jiVar = new ji();
        this.PxuCJdSBwIXG = g30Var;
        this.lS5Rgt96tfkO = kiVar;
        br2 br2Var = new br2(g30Var, kiVar, jiVar);
        this.TSizfFm2Yiuu = br2Var;
        this.Y1f8riQaR6yg = g30Var.getResources();
        this.e9gEMXR7LXtO = new Rect();
        g30Var.addView(br2Var);
        br2Var.setClipBounds(null);
        ir0.Companion.getClass();
        this.OPXfSBeufaJ8 = 0L;
        View.generateViewId();
        sd.Companion.getClass();
        this.cpQdD2nAriOS = 3;
        rp.Companion.getClass();
        this.r3s1LDPKFs1S = 0;
        this.QrzZRwfaDlRX = 1.0f;
        bf1.Companion.getClass();
        this.BRwzKIf41E4i = 1.0f;
        this.XL4ISE6Oc65B = 1.0f;
        hl.Companion.getClass();
        long j = hl.lS5Rgt96tfkO;
        this.EcgxDIVH5in8 = j;
        this.S9EYkSpbGuxq = j;
    }

    @Override // defpackage.sh0
    public final float BRwzKIf41E4i() {
        return 0.0f;
    }

    @Override // defpackage.sh0
    public final void BjEWd04qc7Mw(float f) {
        this.TSizfFm2Yiuu.setCameraDistance(f * this.Y1f8riQaR6yg.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.sh0
    public final void EcgxDIVH5in8(boolean z) {
        boolean z2 = false;
        this.x50lh2ztY7Y5 = z && !this.dgRBjINgWbAK;
        this.wdg6QnbFHrFF = true;
        if (z && this.dgRBjINgWbAK) {
            z2 = true;
        }
        this.TSizfFm2Yiuu.setClipToOutline(z2);
    }

    @Override // defpackage.sh0
    public final float EpkonXwzFgDB() {
        return 0.0f;
    }

    @Override // defpackage.sh0
    public final void IAToe7bXGz4N() {
        this.TSizfFm2Yiuu.setRotation(0.0f);
    }

    @Override // defpackage.sh0
    public final float J54yh1s3n4Aq() {
        return this.XL4ISE6Oc65B;
    }

    @Override // defpackage.sh0
    public final long OPXfSBeufaJ8() {
        return this.S9EYkSpbGuxq;
    }

    public final void Pf0ThKz3j5YS() {
        int i = this.r3s1LDPKFs1S;
        rp.Companion.getClass();
        if (i != 1) {
            int i2 = this.cpQdD2nAriOS;
            sd.Companion.getClass();
            if (i2 == 3) {
                amuv7NJvPxHu(this.r3s1LDPKFs1S);
                return;
            }
        }
        amuv7NJvPxHu(1);
    }

    @Override // defpackage.sh0
    public final float PxuCJdSBwIXG() {
        return this.QrzZRwfaDlRX;
    }

    @Override // defpackage.sh0
    public final float QrzZRwfaDlRX() {
        return this.TSizfFm2Yiuu.getCameraDistance() / this.Y1f8riQaR6yg.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.sh0
    public final void RAsUl2FVSrh6() {
        this.TSizfFm2Yiuu.setTranslationY(0.0f);
    }

    @Override // defpackage.sh0
    public final void RfyTYNmI9Srp(gi giVar) {
        Rect rect;
        boolean z = this.wdg6QnbFHrFF;
        br2 br2Var = this.TSizfFm2Yiuu;
        if (z) {
            if ((this.x50lh2ztY7Y5 || br2Var.getClipToOutline()) && !this.dgRBjINgWbAK) {
                rect = this.e9gEMXR7LXtO;
                rect.left = 0;
                rect.top = 0;
                rect.right = br2Var.getWidth();
                rect.bottom = br2Var.getHeight();
            } else {
                rect = null;
            }
            br2Var.setClipBounds(rect);
        }
        Canvas canvas = u0.PxuCJdSBwIXG;
        if (((t0) giVar).PxuCJdSBwIXG.isHardwareAccelerated()) {
            this.PxuCJdSBwIXG.PxuCJdSBwIXG(giVar, br2Var, br2Var.getDrawingTime());
        }
    }

    @Override // defpackage.sh0
    public final void S2OOm9zPNm0h(hy hyVar, cw0 cw0Var, ph0 ph0Var, y yVar) {
        br2 br2Var = this.TSizfFm2Yiuu;
        ViewParent parent = br2Var.getParent();
        g30 g30Var = this.PxuCJdSBwIXG;
        if (parent == null) {
            g30Var.addView(br2Var);
        }
        br2Var.r3s1LDPKFs1S = hyVar;
        br2Var.QrzZRwfaDlRX = cw0Var;
        br2Var.gPXPFXrUH4XX = yVar;
        br2Var.BRwzKIf41E4i = ph0Var;
        if (br2Var.isAttachedToWindow()) {
            br2Var.setVisibility(4);
            br2Var.setVisibility(0);
            try {
                ki kiVar = this.lS5Rgt96tfkO;
                ai0 ai0Var = VhhvGxCb8gfr;
                t0 t0Var = kiVar.PxuCJdSBwIXG;
                Canvas canvas = t0Var.PxuCJdSBwIXG;
                t0Var.PxuCJdSBwIXG = ai0Var;
                g30Var.PxuCJdSBwIXG(t0Var, br2Var, br2Var.getDrawingTime());
                kiVar.PxuCJdSBwIXG.PxuCJdSBwIXG = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.sh0
    public final int S9EYkSpbGuxq() {
        return this.r3s1LDPKFs1S;
    }

    @Override // defpackage.sh0
    public final void TSizfFm2Yiuu(float f) {
        this.QrzZRwfaDlRX = f;
        this.TSizfFm2Yiuu.setAlpha(f);
    }

    @Override // defpackage.sh0
    public final float VhhvGxCb8gfr() {
        return 0.0f;
    }

    @Override // defpackage.sh0
    public final void XL4ISE6Oc65B() {
        this.TSizfFm2Yiuu.setTranslationX(0.0f);
    }

    @Override // defpackage.sh0
    public final float Y1f8riQaR6yg() {
        return this.BRwzKIf41E4i;
    }

    @Override // defpackage.sh0
    public final jl ZbWwgt3aGe7A() {
        return null;
    }

    @Override // defpackage.sh0
    public final float a92UlCVFR9N8() {
        return 0.0f;
    }

    @Override // defpackage.sh0
    public final Matrix aF05bpZJlKEP() {
        return this.TSizfFm2Yiuu.getMatrix();
    }

    public final void amuv7NJvPxHu(int i) {
        pp ppVar = rp.Companion;
        ppVar.getClass();
        br2 br2Var = this.TSizfFm2Yiuu;
        boolean z = true;
        if (i == 1) {
            br2Var.setLayerType(2, this.a92UlCVFR9N8);
        } else {
            ppVar.getClass();
            if (i == 2) {
                br2Var.setLayerType(0, this.a92UlCVFR9N8);
                z = false;
            } else {
                br2Var.setLayerType(0, this.a92UlCVFR9N8);
            }
        }
        br2Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // defpackage.sh0
    public final void cpQdD2nAriOS(float f) {
        this.BRwzKIf41E4i = f;
        this.TSizfFm2Yiuu.setScaleX(f);
    }

    @Override // defpackage.sh0
    public final void dgRBjINgWbAK(Outline outline, long j) {
        br2 br2Var = this.TSizfFm2Yiuu;
        br2Var.x50lh2ztY7Y5 = outline;
        br2Var.invalidateOutline();
        if ((this.x50lh2ztY7Y5 || br2Var.getClipToOutline()) && outline != null) {
            br2Var.setClipToOutline(true);
            if (this.x50lh2ztY7Y5) {
                this.x50lh2ztY7Y5 = false;
                this.wdg6QnbFHrFF = true;
            }
        }
        this.dgRBjINgWbAK = outline != null;
    }

    @Override // defpackage.sh0
    public final void e6tOsSdd2EFb(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.S9EYkSpbGuxq = j;
            this.TSizfFm2Yiuu.setOutlineSpotShadowColor(mm2.ngxnMNrpiKat(j));
        }
    }

    @Override // defpackage.sh0
    public final void e9gEMXR7LXtO(float f) {
        this.RfyTYNmI9Srp = f;
        this.TSizfFm2Yiuu.setElevation(f);
    }

    @Override // defpackage.sh0
    public final void gPXPFXrUH4XX() {
        this.PxuCJdSBwIXG.removeViewInLayout(this.TSizfFm2Yiuu);
    }

    @Override // defpackage.sh0
    public final void jyegZNwi31qc(float f) {
        this.XL4ISE6Oc65B = f;
        this.TSizfFm2Yiuu.setScaleY(f);
    }

    @Override // defpackage.sh0
    public final void kpCQ9veP6n3I(int i, int i2, long j) {
        boolean PxuCJdSBwIXG = ir0.PxuCJdSBwIXG(this.OPXfSBeufaJ8, j);
        br2 br2Var = this.TSizfFm2Yiuu;
        if (PxuCJdSBwIXG) {
            int i3 = this.RAsUl2FVSrh6;
            if (i3 != i) {
                br2Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.rtx2ld2ELZv4;
            if (i4 != i2) {
                br2Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.x50lh2ztY7Y5 || br2Var.getClipToOutline()) {
                this.wdg6QnbFHrFF = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            br2Var.layout(i, i2, i + i5, i2 + i6);
            this.OPXfSBeufaJ8 = j;
            if (this.gPXPFXrUH4XX) {
                br2Var.setPivotX(i5 / 2.0f);
                br2Var.setPivotY(i6 / 2.0f);
            }
        }
        this.RAsUl2FVSrh6 = i;
        this.rtx2ld2ELZv4 = i2;
    }

    @Override // defpackage.sh0
    public final void lS5Rgt96tfkO() {
        this.TSizfFm2Yiuu.setRotationX(0.0f);
    }

    @Override // defpackage.sh0
    public final void nLZGh9p8gVSu(long j) {
        long j2 = 9223372034707292159L & j;
        br2 br2Var = this.TSizfFm2Yiuu;
        if (j2 != 9205357640488583168L) {
            this.gPXPFXrUH4XX = false;
            br2Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            br2Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                br2Var.resetPivot();
                return;
            }
            this.gPXPFXrUH4XX = true;
            br2Var.setPivotX(((int) (this.OPXfSBeufaJ8 >> 32)) / 2.0f);
            br2Var.setPivotY(((int) (this.OPXfSBeufaJ8 & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.sh0
    public final float ozEBbv0hFTAB() {
        return this.RfyTYNmI9Srp;
    }

    @Override // defpackage.sh0
    public final void pnx5pC0XzaCw(int i) {
        this.r3s1LDPKFs1S = i;
        Pf0ThKz3j5YS();
    }

    @Override // defpackage.sh0
    public final void r3s1LDPKFs1S(int i) {
        this.cpQdD2nAriOS = i;
        Paint paint = this.a92UlCVFR9N8;
        if (paint == null) {
            paint = new Paint();
            this.a92UlCVFR9N8 = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(cs0.xfACYKDMU6Dj(i)));
        Pf0ThKz3j5YS();
    }

    @Override // defpackage.sh0
    public final float rZjpSjn4zoMv() {
        return 0.0f;
    }

    @Override // defpackage.sh0
    public final void rtx2ld2ELZv4() {
        this.TSizfFm2Yiuu.setRotationY(0.0f);
    }

    @Override // defpackage.sh0
    public final long ryVscX7ZL4Ux() {
        return this.EcgxDIVH5in8;
    }

    @Override // defpackage.sh0
    public final void wdg6QnbFHrFF(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.EcgxDIVH5in8 = j;
            this.TSizfFm2Yiuu.setOutlineAmbientShadowColor(mm2.ngxnMNrpiKat(j));
        }
    }

    @Override // defpackage.sh0
    public final void x50lh2ztY7Y5() {
        Paint paint = this.a92UlCVFR9N8;
        if (paint == null) {
            paint = new Paint();
            this.a92UlCVFR9N8 = paint;
        }
        paint.setColorFilter(null);
        Pf0ThKz3j5YS();
    }

    @Override // defpackage.sh0
    public final int xfACYKDMU6Dj() {
        return this.cpQdD2nAriOS;
    }
}
