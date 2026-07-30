package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l53 extends View {
    public static final db0 w = new db0(2);
    public final ud0 m;
    public final os n;
    public final ns o;
    public boolean p;
    public Outline q;
    public boolean r;
    public ca0 s;
    public u81 t;
    public Function1 u;
    public dw0 v;

    public l53(ud0 ud0Var, os osVar, ns nsVar) {
        super(ud0Var.getContext());
        this.m = ud0Var;
        this.n = osVar;
        this.o = nsVar;
        setOutlineProvider(w);
        this.r = true;
        this.s = o70.d;
        this.t = u81.m;
        ew0.a.getClass();
        this.u = bl0.u;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        os osVar = this.n;
        y6 y6Var = osVar.a;
        Canvas canvas2 = y6Var.a;
        y6Var.a = canvas;
        ca0 ca0Var = this.s;
        u81 u81Var = this.t;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        dw0 dw0Var = this.v;
        Function1 function1 = this.u;
        ns nsVar = this.o;
        mh mhVar = nsVar.n;
        ms msVar = ((ns) mhVar.p).m;
        ca0 ca0Var2 = msVar.a;
        u81 u81Var2 = msVar.b;
        ls o = mhVar.o();
        mh mhVar2 = nsVar.n;
        long v = mhVar2.v();
        dw0 dw0Var2 = (dw0) mhVar2.o;
        mhVar2.H(ca0Var);
        mhVar2.I(u81Var);
        mhVar2.G(y6Var);
        mhVar2.J(floatToRawIntBits);
        mhVar2.o = dw0Var;
        y6Var.m();
        try {
            function1.invoke(nsVar);
            y6Var.j();
            mhVar2.H(ca0Var2);
            mhVar2.I(u81Var2);
            mhVar2.G(o);
            mhVar2.J(v);
            mhVar2.o = dw0Var2;
            osVar.a.a = canvas2;
            this.p = false;
        } catch (Throwable th) {
            y6Var.j();
            mhVar2.H(ca0Var2);
            mhVar2.I(u81Var2);
            mhVar2.G(o);
            mhVar2.J(v);
            mhVar2.o = dw0Var2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.r;
    }

    public final os getCanvasHolder() {
        return this.n;
    }

    public final View getOwnerView() {
        return this.m;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.r;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.p) {
            return;
        }
        this.p = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.r != z) {
            this.r = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.p = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
