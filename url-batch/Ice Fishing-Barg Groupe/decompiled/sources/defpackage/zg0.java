package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zg0 extends ux implements i30 {
    public final c40 IAToe7bXGz4N;
    public final /* synthetic */ int ZbWwgt3aGe7A = 1;
    public Object e6tOsSdd2EFb;
    public final k3 pnx5pC0XzaCw;

    public zg0(pc2 pc2Var, k3 k3Var, c40 c40Var, mi1 mi1Var) {
        this.pnx5pC0XzaCw = k3Var;
        this.IAToe7bXGz4N = c40Var;
        this.e6tOsSdd2EFb = mi1Var;
        W7ceZOzvrRuI(pc2Var);
    }

    public static boolean MDTGUQSX7PXD(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean Yadk4uqlxLy8(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode FT2GK7JK5Ma2() {
        RenderNode renderNode = (RenderNode) this.e6tOsSdd2EFb;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode a92UlCVFR9N8 = yh0.a92UlCVFR9N8();
        this.e6tOsSdd2EFb = a92UlCVFR9N8;
        return a92UlCVFR9N8;
    }

    @Override // defpackage.i30
    public final void Pf0ThKz3j5YS(xw0 xw0Var) {
        boolean z;
        long j;
        char c;
        RecordingCanvas beginRecording;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        int i = this.ZbWwgt3aGe7A;
        k3 k3Var = this.pnx5pC0XzaCw;
        c40 c40Var = this.IAToe7bXGz4N;
        switch (i) {
            case 0:
                mi1 mi1Var = (mi1) this.e6tOsSdd2EFb;
                ji jiVar = xw0Var.rtx2ld2ELZv4;
                k3Var.OPXfSBeufaJ8(jiVar.Y1f8riQaR6yg());
                if (a62.TSizfFm2Yiuu(jiVar.Y1f8riQaR6yg())) {
                    xw0Var.PxuCJdSBwIXG();
                    return;
                }
                xw0Var.PxuCJdSBwIXG();
                k3Var.Y1f8riQaR6yg.getValue();
                Canvas PxuCJdSBwIXG = u0.PxuCJdSBwIXG(jiVar.OPXfSBeufaJ8.gPXPFXrUH4XX());
                if (c40.a92UlCVFR9N8(c40Var.a92UlCVFR9N8)) {
                    z = MDTGUQSX7PXD(270.0f, (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() & 4294967295L))) << 32) | (Float.floatToRawIntBits(xw0Var.e6tOsSdd2EFb(mi1Var.PxuCJdSBwIXG(xw0Var.getLayoutDirection()))) & 4294967295L), c40Var.TSizfFm2Yiuu(), PxuCJdSBwIXG);
                } else {
                    z = false;
                }
                if (c40.a92UlCVFR9N8(c40Var.Y1f8riQaR6yg)) {
                    z = MDTGUQSX7PXD(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(xw0Var.e6tOsSdd2EFb(mi1Var.Y1f8riQaR6yg()))) & 4294967295L), c40Var.e9gEMXR7LXtO(), PxuCJdSBwIXG) || z;
                }
                if (c40.a92UlCVFR9N8(c40Var.RAsUl2FVSrh6)) {
                    z = MDTGUQSX7PXD(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(xw0Var.e6tOsSdd2EFb(mi1Var.lS5Rgt96tfkO(xw0Var.getLayoutDirection())) + (-((float) b51.IXK6ba3ucyzm(Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() >> 32))))))) & 4294967295L), c40Var.Y1f8riQaR6yg(), PxuCJdSBwIXG) || z;
                }
                if (c40.a92UlCVFR9N8(c40Var.e9gEMXR7LXtO)) {
                    EdgeEffect lS5Rgt96tfkO = c40Var.lS5Rgt96tfkO();
                    z = MDTGUQSX7PXD(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() & 4294967295L))) + xw0Var.e6tOsSdd2EFb(mi1Var.TSizfFm2Yiuu()))) & 4294967295L), lS5Rgt96tfkO, PxuCJdSBwIXG) || z;
                }
                if (z) {
                    k3Var.Y1f8riQaR6yg();
                    return;
                }
                return;
            default:
                ji jiVar2 = xw0Var.rtx2ld2ELZv4;
                k3Var.OPXfSBeufaJ8(jiVar2.Y1f8riQaR6yg());
                Canvas PxuCJdSBwIXG2 = u0.PxuCJdSBwIXG(jiVar2.OPXfSBeufaJ8.gPXPFXrUH4XX());
                k3Var.Y1f8riQaR6yg.getValue();
                if (a62.TSizfFm2Yiuu(jiVar2.Y1f8riQaR6yg())) {
                    xw0Var.PxuCJdSBwIXG();
                    return;
                }
                if (!PxuCJdSBwIXG2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = c40Var.Y1f8riQaR6yg;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = c40Var.e9gEMXR7LXtO;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = c40Var.a92UlCVFR9N8;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = c40Var.RAsUl2FVSrh6;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = c40Var.rtx2ld2ELZv4;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = c40Var.OPXfSBeufaJ8;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = c40Var.wdg6QnbFHrFF;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = c40Var.dgRBjINgWbAK;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    xw0Var.PxuCJdSBwIXG();
                    return;
                }
                float e6tOsSdd2EFb = xw0Var.e6tOsSdd2EFb(30.0f);
                boolean z4 = c40.a92UlCVFR9N8(c40Var.Y1f8riQaR6yg) || c40.RAsUl2FVSrh6(c40Var.rtx2ld2ELZv4) || c40.a92UlCVFR9N8(c40Var.e9gEMXR7LXtO) || c40.RAsUl2FVSrh6(c40Var.OPXfSBeufaJ8);
                boolean z5 = c40.a92UlCVFR9N8(c40Var.a92UlCVFR9N8) || c40.RAsUl2FVSrh6(c40Var.wdg6QnbFHrFF) || c40.a92UlCVFR9N8(c40Var.RAsUl2FVSrh6) || c40.RAsUl2FVSrh6(c40Var.dgRBjINgWbAK);
                if (z4 && z5) {
                    j = 4294967295L;
                    c = ' ';
                    FT2GK7JK5Ma2().setPosition(0, 0, PxuCJdSBwIXG2.getWidth(), PxuCJdSBwIXG2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z4) {
                        FT2GK7JK5Ma2().setPosition(0, 0, (b51.IXK6ba3ucyzm(e6tOsSdd2EFb) * 2) + PxuCJdSBwIXG2.getWidth(), PxuCJdSBwIXG2.getHeight());
                    } else {
                        if (!z5) {
                            xw0Var.PxuCJdSBwIXG();
                            return;
                        }
                        FT2GK7JK5Ma2().setPosition(0, 0, PxuCJdSBwIXG2.getWidth(), (b51.IXK6ba3ucyzm(e6tOsSdd2EFb) * 2) + PxuCJdSBwIXG2.getHeight());
                    }
                }
                beginRecording = FT2GK7JK5Ma2().beginRecording();
                boolean RAsUl2FVSrh6 = c40.RAsUl2FVSrh6(c40Var.wdg6QnbFHrFF);
                th1 th1Var = th1.OPXfSBeufaJ8;
                if (RAsUl2FVSrh6) {
                    EdgeEffect edgeEffect9 = c40Var.wdg6QnbFHrFF;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = c40Var.PxuCJdSBwIXG(th1Var);
                        c40Var.wdg6QnbFHrFF = edgeEffect9;
                    }
                    Yadk4uqlxLy8(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (c40.a92UlCVFR9N8(c40Var.a92UlCVFR9N8)) {
                    EdgeEffect TSizfFm2Yiuu = c40Var.TSizfFm2Yiuu();
                    z3 = Yadk4uqlxLy8(270.0f, TSizfFm2Yiuu, beginRecording);
                    if (c40.RAsUl2FVSrh6(c40Var.a92UlCVFR9N8)) {
                        z2 = z5;
                        float intBitsToFloat = Float.intBitsToFloat((int) (k3Var.TSizfFm2Yiuu() & j));
                        EdgeEffect edgeEffect10 = c40Var.wdg6QnbFHrFF;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = c40Var.PxuCJdSBwIXG(th1Var);
                            c40Var.wdg6QnbFHrFF = edgeEffect10;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float TSizfFm2Yiuu2 = i2 >= 31 ? d9.TSizfFm2Yiuu(TSizfFm2Yiuu) : 0.0f;
                        float f3 = 1.0f - intBitsToFloat;
                        if (i2 >= 31) {
                            d9.Y1f8riQaR6yg(edgeEffect10, TSizfFm2Yiuu2, f3);
                        } else {
                            edgeEffect10.onPull(TSizfFm2Yiuu2, f3);
                        }
                    } else {
                        z2 = z5;
                    }
                } else {
                    z2 = z5;
                    z3 = false;
                }
                boolean RAsUl2FVSrh62 = c40.RAsUl2FVSrh6(c40Var.rtx2ld2ELZv4);
                th1 th1Var2 = th1.rtx2ld2ELZv4;
                if (RAsUl2FVSrh62) {
                    EdgeEffect edgeEffect11 = c40Var.rtx2ld2ELZv4;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = c40Var.PxuCJdSBwIXG(th1Var2);
                        c40Var.rtx2ld2ELZv4 = edgeEffect11;
                    }
                    Yadk4uqlxLy8(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (c40.a92UlCVFR9N8(c40Var.Y1f8riQaR6yg)) {
                    EdgeEffect e9gEMXR7LXtO = c40Var.e9gEMXR7LXtO();
                    z3 = Yadk4uqlxLy8(0.0f, e9gEMXR7LXtO, beginRecording) || z3;
                    if (c40.RAsUl2FVSrh6(c40Var.Y1f8riQaR6yg)) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (k3Var.TSizfFm2Yiuu() >> c));
                        EdgeEffect edgeEffect12 = c40Var.rtx2ld2ELZv4;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = c40Var.PxuCJdSBwIXG(th1Var2);
                            c40Var.rtx2ld2ELZv4 = edgeEffect12;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float TSizfFm2Yiuu3 = i3 >= 31 ? d9.TSizfFm2Yiuu(e9gEMXR7LXtO) : 0.0f;
                        if (i3 >= 31) {
                            d9.Y1f8riQaR6yg(edgeEffect12, TSizfFm2Yiuu3, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(TSizfFm2Yiuu3, intBitsToFloat2);
                        }
                    }
                }
                if (c40.RAsUl2FVSrh6(c40Var.dgRBjINgWbAK)) {
                    EdgeEffect edgeEffect13 = c40Var.dgRBjINgWbAK;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = c40Var.PxuCJdSBwIXG(th1Var);
                        c40Var.dgRBjINgWbAK = edgeEffect13;
                    }
                    Yadk4uqlxLy8(270.0f, edgeEffect13, beginRecording);
                    edgeEffect13.finish();
                }
                if (c40.a92UlCVFR9N8(c40Var.RAsUl2FVSrh6)) {
                    EdgeEffect Y1f8riQaR6yg = c40Var.Y1f8riQaR6yg();
                    z3 = Yadk4uqlxLy8(90.0f, Y1f8riQaR6yg, beginRecording) || z3;
                    if (c40.RAsUl2FVSrh6(c40Var.RAsUl2FVSrh6)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (k3Var.TSizfFm2Yiuu() & j));
                        EdgeEffect edgeEffect14 = c40Var.dgRBjINgWbAK;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = c40Var.PxuCJdSBwIXG(th1Var);
                            c40Var.dgRBjINgWbAK = edgeEffect14;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float TSizfFm2Yiuu4 = i4 >= 31 ? d9.TSizfFm2Yiuu(Y1f8riQaR6yg) : 0.0f;
                        if (i4 >= 31) {
                            d9.Y1f8riQaR6yg(edgeEffect14, TSizfFm2Yiuu4, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(TSizfFm2Yiuu4, intBitsToFloat3);
                        }
                    }
                }
                if (c40.RAsUl2FVSrh6(c40Var.OPXfSBeufaJ8)) {
                    EdgeEffect edgeEffect15 = c40Var.OPXfSBeufaJ8;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = c40Var.PxuCJdSBwIXG(th1Var2);
                        c40Var.OPXfSBeufaJ8 = edgeEffect15;
                    }
                    Yadk4uqlxLy8(0.0f, edgeEffect15, beginRecording);
                    edgeEffect15.finish();
                }
                if (c40.a92UlCVFR9N8(c40Var.e9gEMXR7LXtO)) {
                    EdgeEffect lS5Rgt96tfkO2 = c40Var.lS5Rgt96tfkO();
                    boolean z6 = Yadk4uqlxLy8(180.0f, lS5Rgt96tfkO2, beginRecording) || z3;
                    if (c40.RAsUl2FVSrh6(c40Var.e9gEMXR7LXtO)) {
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (k3Var.TSizfFm2Yiuu() >> c));
                        EdgeEffect edgeEffect16 = c40Var.OPXfSBeufaJ8;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = c40Var.PxuCJdSBwIXG(th1Var2);
                            c40Var.OPXfSBeufaJ8 = edgeEffect16;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float TSizfFm2Yiuu5 = i5 >= 31 ? d9.TSizfFm2Yiuu(lS5Rgt96tfkO2) : 0.0f;
                        float f4 = 1.0f - intBitsToFloat4;
                        if (i5 >= 31) {
                            d9.Y1f8riQaR6yg(edgeEffect16, TSizfFm2Yiuu5, f4);
                        } else {
                            edgeEffect16.onPull(TSizfFm2Yiuu5, f4);
                        }
                    }
                    z3 = z6;
                }
                if (z3) {
                    k3Var.Y1f8riQaR6yg();
                }
                float f5 = z2 ? 0.0f : e6tOsSdd2EFb;
                float f6 = z4 ? 0.0f : e6tOsSdd2EFb;
                cw0 layoutDirection = xw0Var.getLayoutDirection();
                t0 t0Var = new t0();
                t0Var.PxuCJdSBwIXG = beginRecording;
                long Y1f8riQaR6yg2 = jiVar2.Y1f8riQaR6yg();
                m9 m9Var = jiVar2.OPXfSBeufaJ8;
                ii iiVar = ((ji) m9Var.dgRBjINgWbAK).rtx2ld2ELZv4;
                hy hyVar = iiVar.PxuCJdSBwIXG;
                cw0 cw0Var = iiVar.lS5Rgt96tfkO;
                gi gPXPFXrUH4XX = m9Var.gPXPFXrUH4XX();
                long S2OOm9zPNm0h = jiVar2.OPXfSBeufaJ8.S2OOm9zPNm0h();
                m9 m9Var2 = jiVar2.OPXfSBeufaJ8;
                ph0 ph0Var = (ph0) m9Var2.wdg6QnbFHrFF;
                m9Var2.rZjpSjn4zoMv(xw0Var);
                m9Var2.BjEWd04qc7Mw(layoutDirection);
                m9Var2.kpCQ9veP6n3I(t0Var);
                m9Var2.ozEBbv0hFTAB(Y1f8riQaR6yg2);
                m9Var2.wdg6QnbFHrFF = null;
                t0Var.wdg6QnbFHrFF();
                try {
                    ((i2) jiVar2.OPXfSBeufaJ8.OPXfSBeufaJ8).BRwzKIf41E4i(f5, f6);
                    try {
                        xw0Var.PxuCJdSBwIXG();
                        t0Var.RAsUl2FVSrh6();
                        m9 m9Var3 = jiVar2.OPXfSBeufaJ8;
                        m9Var3.rZjpSjn4zoMv(hyVar);
                        m9Var3.BjEWd04qc7Mw(cw0Var);
                        m9Var3.kpCQ9veP6n3I(gPXPFXrUH4XX);
                        m9Var3.ozEBbv0hFTAB(S2OOm9zPNm0h);
                        m9Var3.wdg6QnbFHrFF = ph0Var;
                        FT2GK7JK5Ma2().endRecording();
                        int save = PxuCJdSBwIXG2.save();
                        PxuCJdSBwIXG2.translate(f, f2);
                        PxuCJdSBwIXG2.drawRenderNode(FT2GK7JK5Ma2());
                        PxuCJdSBwIXG2.restoreToCount(save);
                        return;
                    } finally {
                        ((i2) jiVar2.OPXfSBeufaJ8.OPXfSBeufaJ8).BRwzKIf41E4i(-f5, -f6);
                    }
                } catch (Throwable th) {
                    t0Var.RAsUl2FVSrh6();
                    m9 m9Var4 = jiVar2.OPXfSBeufaJ8;
                    m9Var4.rZjpSjn4zoMv(hyVar);
                    m9Var4.BjEWd04qc7Mw(cw0Var);
                    m9Var4.kpCQ9veP6n3I(gPXPFXrUH4XX);
                    m9Var4.ozEBbv0hFTAB(S2OOm9zPNm0h);
                    m9Var4.wdg6QnbFHrFF = ph0Var;
                    throw th;
                }
        }
    }

    public zg0(pc2 pc2Var, k3 k3Var, c40 c40Var) {
        this.pnx5pC0XzaCw = k3Var;
        this.IAToe7bXGz4N = c40Var;
        W7ceZOzvrRuI(pc2Var);
    }
}
