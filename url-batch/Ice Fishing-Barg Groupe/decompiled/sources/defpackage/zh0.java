package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zh0 implements sh0 {
    public boolean BRwzKIf41E4i;
    public int OPXfSBeufaJ8;
    public final ki PxuCJdSBwIXG;
    public float QrzZRwfaDlRX;
    public boolean RAsUl2FVSrh6;
    public int RfyTYNmI9Srp;
    public final RenderNode TSizfFm2Yiuu;
    public boolean XL4ISE6Oc65B;
    public long Y1f8riQaR6yg;
    public Matrix a92UlCVFR9N8;
    public long cpQdD2nAriOS;
    public float dgRBjINgWbAK;
    public Paint e9gEMXR7LXtO;
    public boolean gPXPFXrUH4XX;
    public final ji lS5Rgt96tfkO;
    public long r3s1LDPKFs1S;
    public float rtx2ld2ELZv4;
    public float wdg6QnbFHrFF;
    public float x50lh2ztY7Y5;

    public zh0() {
        ki kiVar = new ki();
        ji jiVar = new ji();
        this.PxuCJdSBwIXG = kiVar;
        this.lS5Rgt96tfkO = jiVar;
        RenderNode TSizfFm2Yiuu = kh0.TSizfFm2Yiuu();
        this.TSizfFm2Yiuu = TSizfFm2Yiuu;
        a62.Companion.getClass();
        this.Y1f8riQaR6yg = 0L;
        TSizfFm2Yiuu.setClipToBounds(false);
        rp.Companion.getClass();
        Pf0ThKz3j5YS(TSizfFm2Yiuu, 0);
        this.rtx2ld2ELZv4 = 1.0f;
        sd.Companion.getClass();
        this.OPXfSBeufaJ8 = 3;
        bf1.Companion.getClass();
        this.wdg6QnbFHrFF = 1.0f;
        this.dgRBjINgWbAK = 1.0f;
        hl.Companion.getClass();
        long j = hl.lS5Rgt96tfkO;
        this.cpQdD2nAriOS = j;
        this.r3s1LDPKFs1S = j;
        this.QrzZRwfaDlRX = 8.0f;
        this.RfyTYNmI9Srp = 0;
    }

    @Override // defpackage.sh0
    public final float BRwzKIf41E4i() {
        return 0.0f;
    }

    @Override // defpackage.sh0
    public final void BjEWd04qc7Mw(float f) {
        this.QrzZRwfaDlRX = f;
        this.TSizfFm2Yiuu.setCameraDistance(f);
    }

    @Override // defpackage.sh0
    public final void EcgxDIVH5in8(boolean z) {
        this.gPXPFXrUH4XX = z;
        amuv7NJvPxHu();
    }

    @Override // defpackage.sh0
    public final float EpkonXwzFgDB() {
        return 0.0f;
    }

    @Override // defpackage.sh0
    public final void IAToe7bXGz4N() {
        this.TSizfFm2Yiuu.setRotationZ(0.0f);
    }

    @Override // defpackage.sh0
    public final float J54yh1s3n4Aq() {
        return this.dgRBjINgWbAK;
    }

    @Override // defpackage.sh0
    public final long OPXfSBeufaJ8() {
        return this.r3s1LDPKFs1S;
    }

    public final void Pf0ThKz3j5YS(RenderNode renderNode, int i) {
        rp.Companion.getClass();
        Paint paint = this.e9gEMXR7LXtO;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.sh0
    public final float PxuCJdSBwIXG() {
        return this.rtx2ld2ELZv4;
    }

    @Override // defpackage.sh0
    public final float QrzZRwfaDlRX() {
        return this.QrzZRwfaDlRX;
    }

    @Override // defpackage.sh0
    public final void RAsUl2FVSrh6() {
        this.TSizfFm2Yiuu.setTranslationY(0.0f);
    }

    @Override // defpackage.sh0
    public final void RfyTYNmI9Srp(gi giVar) {
        Canvas canvas = u0.PxuCJdSBwIXG;
        ((t0) giVar).PxuCJdSBwIXG.drawRenderNode(this.TSizfFm2Yiuu);
    }

    @Override // defpackage.sh0
    public final void S2OOm9zPNm0h(hy hyVar, cw0 cw0Var, ph0 ph0Var, y yVar) {
        RecordingCanvas beginRecording;
        ji jiVar = this.lS5Rgt96tfkO;
        beginRecording = this.TSizfFm2Yiuu.beginRecording();
        try {
            ki kiVar = this.PxuCJdSBwIXG;
            t0 t0Var = kiVar.PxuCJdSBwIXG;
            Canvas canvas = t0Var.PxuCJdSBwIXG;
            t0Var.PxuCJdSBwIXG = beginRecording;
            m9 m9Var = jiVar.OPXfSBeufaJ8;
            m9Var.rZjpSjn4zoMv(hyVar);
            m9Var.BjEWd04qc7Mw(cw0Var);
            m9Var.wdg6QnbFHrFF = ph0Var;
            m9Var.ozEBbv0hFTAB(this.Y1f8riQaR6yg);
            m9Var.kpCQ9veP6n3I(t0Var);
            yVar.OPXfSBeufaJ8(jiVar);
            kiVar.PxuCJdSBwIXG.PxuCJdSBwIXG = canvas;
        } finally {
            this.TSizfFm2Yiuu.endRecording();
        }
    }

    @Override // defpackage.sh0
    public final int S9EYkSpbGuxq() {
        return this.RfyTYNmI9Srp;
    }

    @Override // defpackage.sh0
    public final void TSizfFm2Yiuu(float f) {
        this.rtx2ld2ELZv4 = f;
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
        return this.wdg6QnbFHrFF;
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
        boolean z = this.gPXPFXrUH4XX;
        boolean z2 = false;
        boolean z3 = z && !this.RAsUl2FVSrh6;
        if (z && this.RAsUl2FVSrh6) {
            z2 = true;
        }
        if (z3 != this.BRwzKIf41E4i) {
            this.BRwzKIf41E4i = z3;
            this.TSizfFm2Yiuu.setClipToBounds(z3);
        }
        if (z2 != this.XL4ISE6Oc65B) {
            this.XL4ISE6Oc65B = z2;
            this.TSizfFm2Yiuu.setClipToOutline(z2);
        }
    }

    @Override // defpackage.sh0
    public final void cpQdD2nAriOS(float f) {
        this.wdg6QnbFHrFF = f;
        this.TSizfFm2Yiuu.setScaleX(f);
    }

    @Override // defpackage.sh0
    public final void dgRBjINgWbAK(Outline outline, long j) {
        this.TSizfFm2Yiuu.setOutline(outline);
        this.RAsUl2FVSrh6 = outline != null;
        amuv7NJvPxHu();
    }

    @Override // defpackage.sh0
    public final void e6tOsSdd2EFb(long j) {
        this.r3s1LDPKFs1S = j;
        this.TSizfFm2Yiuu.setSpotShadowColor(mm2.ngxnMNrpiKat(j));
    }

    @Override // defpackage.sh0
    public final void e9gEMXR7LXtO(float f) {
        this.x50lh2ztY7Y5 = f;
        this.TSizfFm2Yiuu.setElevation(f);
    }

    public final void gGoUzNp9JO5I() {
        int i = this.RfyTYNmI9Srp;
        rp.Companion.getClass();
        if (i != 1) {
            int i2 = this.OPXfSBeufaJ8;
            sd.Companion.getClass();
            if (i2 == 3) {
                Pf0ThKz3j5YS(this.TSizfFm2Yiuu, this.RfyTYNmI9Srp);
                return;
            }
        }
        Pf0ThKz3j5YS(this.TSizfFm2Yiuu, 1);
    }

    @Override // defpackage.sh0
    public final void gPXPFXrUH4XX() {
        this.TSizfFm2Yiuu.discardDisplayList();
    }

    @Override // defpackage.sh0
    public final void jyegZNwi31qc(float f) {
        this.dgRBjINgWbAK = f;
        this.TSizfFm2Yiuu.setScaleY(f);
    }

    @Override // defpackage.sh0
    public final void kpCQ9veP6n3I(int i, int i2, long j) {
        this.TSizfFm2Yiuu.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.Y1f8riQaR6yg = kj0.gGoUzNp9JO5I(j);
    }

    @Override // defpackage.sh0
    public final void lS5Rgt96tfkO() {
        this.TSizfFm2Yiuu.setRotationX(0.0f);
    }

    @Override // defpackage.sh0
    public final void nLZGh9p8gVSu(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.TSizfFm2Yiuu;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.TSizfFm2Yiuu.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.sh0
    public final float ozEBbv0hFTAB() {
        return this.x50lh2ztY7Y5;
    }

    @Override // defpackage.sh0
    public final void pnx5pC0XzaCw(int i) {
        this.RfyTYNmI9Srp = i;
        gGoUzNp9JO5I();
    }

    @Override // defpackage.sh0
    public final void r3s1LDPKFs1S(int i) {
        this.OPXfSBeufaJ8 = i;
        Paint paint = this.e9gEMXR7LXtO;
        if (paint == null) {
            paint = new Paint();
            this.e9gEMXR7LXtO = paint;
        }
        paint.setBlendMode(cs0.J54yh1s3n4Aq(i));
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
        return this.cpQdD2nAriOS;
    }

    @Override // defpackage.sh0
    public final boolean tmVwIGCQF4zR() {
        boolean hasDisplayList;
        hasDisplayList = this.TSizfFm2Yiuu.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.sh0
    public final void wdg6QnbFHrFF(long j) {
        this.cpQdD2nAriOS = j;
        this.TSizfFm2Yiuu.setAmbientShadowColor(mm2.ngxnMNrpiKat(j));
    }

    @Override // defpackage.sh0
    public final void x50lh2ztY7Y5() {
        Paint paint = this.e9gEMXR7LXtO;
        if (paint == null) {
            paint = new Paint();
            this.e9gEMXR7LXtO = paint;
        }
        paint.setColorFilter(null);
        gGoUzNp9JO5I();
    }

    @Override // defpackage.sh0
    public final int xfACYKDMU6Dj() {
        return this.OPXfSBeufaJ8;
    }
}
