package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class br2 extends View {
    public static final zq2 Companion = new zq2();
    public static final yz XL4ISE6Oc65B = new yz(2);
    public ph0 BRwzKIf41E4i;
    public final ki OPXfSBeufaJ8;
    public cw0 QrzZRwfaDlRX;
    public boolean cpQdD2nAriOS;
    public boolean dgRBjINgWbAK;
    public le0 gPXPFXrUH4XX;
    public hy r3s1LDPKFs1S;
    public final g30 rtx2ld2ELZv4;
    public final ji wdg6QnbFHrFF;
    public Outline x50lh2ztY7Y5;

    public br2(g30 g30Var, ki kiVar, ji jiVar) {
        super(g30Var.getContext());
        this.rtx2ld2ELZv4 = g30Var;
        this.OPXfSBeufaJ8 = kiVar;
        this.wdg6QnbFHrFF = jiVar;
        setOutlineProvider(XL4ISE6Oc65B);
        this.cpQdD2nAriOS = true;
        this.r3s1LDPKFs1S = b51.TSizfFm2Yiuu;
        this.QrzZRwfaDlRX = cw0.rtx2ld2ELZv4;
        sh0.Companion.getClass();
        this.gPXPFXrUH4XX = k1.BjEWd04qc7Mw;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ki kiVar = this.OPXfSBeufaJ8;
        t0 t0Var = kiVar.PxuCJdSBwIXG;
        Canvas canvas2 = t0Var.PxuCJdSBwIXG;
        t0Var.PxuCJdSBwIXG = canvas;
        hy hyVar = this.r3s1LDPKFs1S;
        cw0 cw0Var = this.QrzZRwfaDlRX;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        ph0 ph0Var = this.BRwzKIf41E4i;
        le0 le0Var = this.gPXPFXrUH4XX;
        ji jiVar = this.wdg6QnbFHrFF;
        m9 m9Var = jiVar.OPXfSBeufaJ8;
        ii iiVar = ((ji) m9Var.dgRBjINgWbAK).rtx2ld2ELZv4;
        hy hyVar2 = iiVar.PxuCJdSBwIXG;
        cw0 cw0Var2 = iiVar.lS5Rgt96tfkO;
        gi gPXPFXrUH4XX = m9Var.gPXPFXrUH4XX();
        m9 m9Var2 = jiVar.OPXfSBeufaJ8;
        long S2OOm9zPNm0h = m9Var2.S2OOm9zPNm0h();
        ph0 ph0Var2 = (ph0) m9Var2.wdg6QnbFHrFF;
        m9Var2.rZjpSjn4zoMv(hyVar);
        m9Var2.BjEWd04qc7Mw(cw0Var);
        m9Var2.kpCQ9veP6n3I(t0Var);
        m9Var2.ozEBbv0hFTAB(floatToRawIntBits);
        m9Var2.wdg6QnbFHrFF = ph0Var;
        t0Var.wdg6QnbFHrFF();
        try {
            le0Var.OPXfSBeufaJ8(jiVar);
            t0Var.RAsUl2FVSrh6();
            m9Var2.rZjpSjn4zoMv(hyVar2);
            m9Var2.BjEWd04qc7Mw(cw0Var2);
            m9Var2.kpCQ9veP6n3I(gPXPFXrUH4XX);
            m9Var2.ozEBbv0hFTAB(S2OOm9zPNm0h);
            m9Var2.wdg6QnbFHrFF = ph0Var2;
            kiVar.PxuCJdSBwIXG.PxuCJdSBwIXG = canvas2;
            this.dgRBjINgWbAK = false;
        } catch (Throwable th) {
            t0Var.RAsUl2FVSrh6();
            m9Var2.rZjpSjn4zoMv(hyVar2);
            m9Var2.BjEWd04qc7Mw(cw0Var2);
            m9Var2.kpCQ9veP6n3I(gPXPFXrUH4XX);
            m9Var2.ozEBbv0hFTAB(S2OOm9zPNm0h);
            m9Var2.wdg6QnbFHrFF = ph0Var2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.cpQdD2nAriOS;
    }

    public final ki getCanvasHolder() {
        return this.OPXfSBeufaJ8;
    }

    public final View getOwnerView() {
        return this.rtx2ld2ELZv4;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.cpQdD2nAriOS;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.dgRBjINgWbAK) {
            return;
        }
        this.dgRBjINgWbAK = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.cpQdD2nAriOS != z) {
            this.cpQdD2nAriOS = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.dgRBjINgWbAK = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
