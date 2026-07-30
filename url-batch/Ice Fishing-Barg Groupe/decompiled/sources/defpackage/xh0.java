package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xh0 implements sh0 {
    public static final wh0 Companion = new wh0();
    public static final AtomicBoolean VhhvGxCb8gfr = new AtomicBoolean(true);
    public long BRwzKIf41E4i;
    public boolean EcgxDIVH5in8;
    public int OPXfSBeufaJ8;
    public final ki PxuCJdSBwIXG;
    public float QrzZRwfaDlRX;
    public boolean RAsUl2FVSrh6;
    public boolean RfyTYNmI9Srp;
    public boolean S9EYkSpbGuxq;
    public final RenderNode TSizfFm2Yiuu;
    public float XL4ISE6Oc65B;
    public long Y1f8riQaR6yg;
    public Matrix a92UlCVFR9N8;
    public float cpQdD2nAriOS;
    public float dgRBjINgWbAK;
    public Paint e9gEMXR7LXtO;
    public long gPXPFXrUH4XX;
    public final ji lS5Rgt96tfkO;
    public float r3s1LDPKFs1S;
    public long rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;
    public boolean x50lh2ztY7Y5;

    public xh0(r1 r1Var, ki kiVar, ji jiVar) {
        this.PxuCJdSBwIXG = kiVar;
        this.lS5Rgt96tfkO = jiVar;
        RenderNode create = RenderNode.create("Compose", r1Var);
        this.TSizfFm2Yiuu = create;
        ir0.Companion.getClass();
        this.Y1f8riQaR6yg = 0L;
        this.rtx2ld2ELZv4 = 0L;
        if (VhhvGxCb8gfr.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                tu1.TSizfFm2Yiuu(create, tu1.PxuCJdSBwIXG(create));
                tu1.Y1f8riQaR6yg(create, tu1.lS5Rgt96tfkO(create));
            }
            su1.PxuCJdSBwIXG(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        rp.Companion.getClass();
        Pf0ThKz3j5YS(0);
        this.OPXfSBeufaJ8 = 0;
        sd.Companion.getClass();
        this.wdg6QnbFHrFF = 3;
        this.dgRBjINgWbAK = 1.0f;
        bf1.Companion.getClass();
        this.cpQdD2nAriOS = 1.0f;
        this.r3s1LDPKFs1S = 1.0f;
        hl.Companion.getClass();
        long j = hl.lS5Rgt96tfkO;
        this.gPXPFXrUH4XX = j;
        this.BRwzKIf41E4i = j;
        this.XL4ISE6Oc65B = 8.0f;
    }

    @Override // defpackage.sh0
    public final float BRwzKIf41E4i() {
        return 0.0f;
    }

    @Override // defpackage.sh0
    public final void BjEWd04qc7Mw(float f) {
        this.XL4ISE6Oc65B = f;
        this.TSizfFm2Yiuu.setCameraDistance(-f);
    }

    @Override // defpackage.sh0
    public final void EcgxDIVH5in8(boolean z) {
        this.RfyTYNmI9Srp = z;
        amuv7NJvPxHu();
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
        return this.r3s1LDPKFs1S;
    }

    @Override // defpackage.sh0
    public final long OPXfSBeufaJ8() {
        return this.BRwzKIf41E4i;
    }

    public final void Pf0ThKz3j5YS(int i) {
        RenderNode renderNode = this.TSizfFm2Yiuu;
        pp ppVar = rp.Companion;
        ppVar.getClass();
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.e9gEMXR7LXtO);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        ppVar.getClass();
        if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.e9gEMXR7LXtO);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.e9gEMXR7LXtO);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.sh0
    public final float PxuCJdSBwIXG() {
        return this.dgRBjINgWbAK;
    }

    @Override // defpackage.sh0
    public final float QrzZRwfaDlRX() {
        return this.XL4ISE6Oc65B;
    }

    @Override // defpackage.sh0
    public final void RAsUl2FVSrh6() {
        this.TSizfFm2Yiuu.setTranslationY(0.0f);
    }

    @Override // defpackage.sh0
    public final void RfyTYNmI9Srp(gi giVar) {
        Canvas canvas = u0.PxuCJdSBwIXG;
        DisplayListCanvas displayListCanvas = ((t0) giVar).PxuCJdSBwIXG;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.TSizfFm2Yiuu);
    }

    @Override // defpackage.sh0
    public final void S2OOm9zPNm0h(hy hyVar, cw0 cw0Var, ph0 ph0Var, y yVar) {
        Canvas start = this.TSizfFm2Yiuu.start(Math.max((int) (this.Y1f8riQaR6yg >> 32), (int) (this.rtx2ld2ELZv4 >> 32)), Math.max((int) (this.Y1f8riQaR6yg & 4294967295L), (int) (this.rtx2ld2ELZv4 & 4294967295L)));
        try {
            t0 t0Var = this.PxuCJdSBwIXG.PxuCJdSBwIXG;
            Canvas canvas = t0Var.PxuCJdSBwIXG;
            t0Var.PxuCJdSBwIXG = start;
            ji jiVar = this.lS5Rgt96tfkO;
            m9 m9Var = jiVar.OPXfSBeufaJ8;
            long gGoUzNp9JO5I = kj0.gGoUzNp9JO5I(this.Y1f8riQaR6yg);
            ii iiVar = ((ji) m9Var.dgRBjINgWbAK).rtx2ld2ELZv4;
            hy hyVar2 = iiVar.PxuCJdSBwIXG;
            cw0 cw0Var2 = iiVar.lS5Rgt96tfkO;
            gi gPXPFXrUH4XX = m9Var.gPXPFXrUH4XX();
            long S2OOm9zPNm0h = m9Var.S2OOm9zPNm0h();
            ph0 ph0Var2 = (ph0) m9Var.wdg6QnbFHrFF;
            m9Var.rZjpSjn4zoMv(hyVar);
            m9Var.BjEWd04qc7Mw(cw0Var);
            m9Var.kpCQ9veP6n3I(t0Var);
            m9Var.ozEBbv0hFTAB(gGoUzNp9JO5I);
            m9Var.wdg6QnbFHrFF = ph0Var;
            t0Var.wdg6QnbFHrFF();
            try {
                yVar.OPXfSBeufaJ8(jiVar);
                t0Var.RAsUl2FVSrh6();
                m9Var.rZjpSjn4zoMv(hyVar2);
                m9Var.BjEWd04qc7Mw(cw0Var2);
                m9Var.kpCQ9veP6n3I(gPXPFXrUH4XX);
                m9Var.ozEBbv0hFTAB(S2OOm9zPNm0h);
                m9Var.wdg6QnbFHrFF = ph0Var2;
                t0Var.PxuCJdSBwIXG = canvas;
            } catch (Throwable th) {
                t0Var.RAsUl2FVSrh6();
                m9 m9Var2 = jiVar.OPXfSBeufaJ8;
                m9Var2.rZjpSjn4zoMv(hyVar2);
                m9Var2.BjEWd04qc7Mw(cw0Var2);
                m9Var2.kpCQ9veP6n3I(gPXPFXrUH4XX);
                m9Var2.ozEBbv0hFTAB(S2OOm9zPNm0h);
                m9Var2.wdg6QnbFHrFF = ph0Var2;
                throw th;
            }
        } finally {
            this.TSizfFm2Yiuu.end(start);
        }
    }

    @Override // defpackage.sh0
    public final int S9EYkSpbGuxq() {
        return this.OPXfSBeufaJ8;
    }

    @Override // defpackage.sh0
    public final void TSizfFm2Yiuu(float f) {
        this.dgRBjINgWbAK = f;
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
        return this.cpQdD2nAriOS;
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
        Matrix matrix = this.a92UlCVFR9N8;
        if (matrix == null) {
            matrix = new Matrix();
            this.a92UlCVFR9N8 = matrix;
        }
        this.TSizfFm2Yiuu.getMatrix(matrix);
        return matrix;
    }

    public final void amuv7NJvPxHu() {
        boolean z = this.RfyTYNmI9Srp;
        boolean z2 = false;
        boolean z3 = z && !this.RAsUl2FVSrh6;
        if (z && this.RAsUl2FVSrh6) {
            z2 = true;
        }
        if (z3 != this.EcgxDIVH5in8) {
            this.EcgxDIVH5in8 = z3;
            this.TSizfFm2Yiuu.setClipToBounds(z3);
        }
        if (z2 != this.S9EYkSpbGuxq) {
            this.S9EYkSpbGuxq = z2;
            this.TSizfFm2Yiuu.setClipToOutline(z2);
        }
    }

    @Override // defpackage.sh0
    public final void cpQdD2nAriOS(float f) {
        this.cpQdD2nAriOS = f;
        this.TSizfFm2Yiuu.setScaleX(f);
    }

    @Override // defpackage.sh0
    public final void dgRBjINgWbAK(Outline outline, long j) {
        this.rtx2ld2ELZv4 = j;
        this.TSizfFm2Yiuu.setOutline(outline);
        this.RAsUl2FVSrh6 = outline != null;
        amuv7NJvPxHu();
    }

    @Override // defpackage.sh0
    public final void e6tOsSdd2EFb(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.BRwzKIf41E4i = j;
            tu1.Y1f8riQaR6yg(this.TSizfFm2Yiuu, mm2.ngxnMNrpiKat(j));
        }
    }

    @Override // defpackage.sh0
    public final void e9gEMXR7LXtO(float f) {
        this.QrzZRwfaDlRX = f;
        this.TSizfFm2Yiuu.setElevation(f);
    }

    public final void gGoUzNp9JO5I() {
        int i = this.OPXfSBeufaJ8;
        rp.Companion.getClass();
        if (i != 1) {
            int i2 = this.wdg6QnbFHrFF;
            sd.Companion.getClass();
            if (i2 == 3) {
                Pf0ThKz3j5YS(this.OPXfSBeufaJ8);
                return;
            }
        }
        Pf0ThKz3j5YS(1);
    }

    @Override // defpackage.sh0
    public final void gPXPFXrUH4XX() {
        su1.PxuCJdSBwIXG(this.TSizfFm2Yiuu);
    }

    @Override // defpackage.sh0
    public final void jyegZNwi31qc(float f) {
        this.r3s1LDPKFs1S = f;
        this.TSizfFm2Yiuu.setScaleY(f);
    }

    @Override // defpackage.sh0
    public final void kpCQ9veP6n3I(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.TSizfFm2Yiuu.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (ir0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, j)) {
            return;
        }
        if (this.x50lh2ztY7Y5) {
            this.TSizfFm2Yiuu.setPivotX(i3 / 2.0f);
            this.TSizfFm2Yiuu.setPivotY(i4 / 2.0f);
        }
        this.Y1f8riQaR6yg = j;
    }

    @Override // defpackage.sh0
    public final void lS5Rgt96tfkO() {
        this.TSizfFm2Yiuu.setRotationX(0.0f);
    }

    @Override // defpackage.sh0
    public final void nLZGh9p8gVSu(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.x50lh2ztY7Y5 = true;
            this.TSizfFm2Yiuu.setPivotX(((int) (this.Y1f8riQaR6yg >> 32)) / 2.0f);
            this.TSizfFm2Yiuu.setPivotY(((int) (4294967295L & this.Y1f8riQaR6yg)) / 2.0f);
        } else {
            this.x50lh2ztY7Y5 = false;
            this.TSizfFm2Yiuu.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.TSizfFm2Yiuu.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.sh0
    public final float ozEBbv0hFTAB() {
        return this.QrzZRwfaDlRX;
    }

    @Override // defpackage.sh0
    public final void pnx5pC0XzaCw(int i) {
        this.OPXfSBeufaJ8 = i;
        gGoUzNp9JO5I();
    }

    @Override // defpackage.sh0
    public final void r3s1LDPKFs1S(int i) {
        if (this.wdg6QnbFHrFF == i) {
            return;
        }
        this.wdg6QnbFHrFF = i;
        Paint paint = this.e9gEMXR7LXtO;
        if (paint == null) {
            paint = new Paint();
            this.e9gEMXR7LXtO = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(cs0.xfACYKDMU6Dj(i)));
        gGoUzNp9JO5I();
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
        return this.gPXPFXrUH4XX;
    }

    @Override // defpackage.sh0
    public final boolean tmVwIGCQF4zR() {
        return this.TSizfFm2Yiuu.isValid();
    }

    @Override // defpackage.sh0
    public final void wdg6QnbFHrFF(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.gPXPFXrUH4XX = j;
            tu1.TSizfFm2Yiuu(this.TSizfFm2Yiuu, mm2.ngxnMNrpiKat(j));
        }
    }

    @Override // defpackage.sh0
    public final void x50lh2ztY7Y5() {
        gGoUzNp9JO5I();
    }

    @Override // defpackage.sh0
    public final int xfACYKDMU6Dj() {
        return this.wdg6QnbFHrFF;
    }
}
