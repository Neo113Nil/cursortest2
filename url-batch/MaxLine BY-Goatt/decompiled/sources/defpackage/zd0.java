package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zd0 extends tk3 implements wd0 {
    public final q9 r;
    public final ef0 s;
    public RenderNode t;

    public zd0(q9 q9Var, ef0 ef0Var) {
        this.r = q9Var;
        this.s = ef0Var;
    }

    public static boolean n0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.wd0
    public final void g(k91 k91Var) {
        boolean z;
        float f;
        float f2;
        float f3;
        ns nsVar = k91Var.m;
        long f4 = nsVar.f();
        q9 q9Var = this.r;
        q9Var.l(f4);
        if (ql2.e(nsVar.f())) {
            k91Var.a();
            return;
        }
        q9Var.o.getValue();
        vl1 vl1Var = tu.a;
        float D = k91Var.D(30.0f);
        Canvas a = z6.a(nsVar.n.o());
        ef0 ef0Var = this.s;
        boolean z2 = ef0.f(ef0Var.d) || ef0.g(ef0Var.h) || ef0.f(ef0Var.e) || ef0.g(ef0Var.i);
        boolean z3 = ef0.f(ef0Var.f) || ef0.g(ef0Var.j) || ef0.f(ef0Var.g) || ef0.g(ef0Var.k);
        if (z2 && z3) {
            o0().setPosition(0, 0, a.getWidth(), a.getHeight());
        } else if (z2) {
            o0().setPosition(0, 0, (si1.b(D) * 2) + a.getWidth(), a.getHeight());
        } else {
            if (!z3) {
                k91Var.a();
                return;
            }
            o0().setPosition(0, 0, a.getWidth(), (si1.b(D) * 2) + a.getHeight());
        }
        RecordingCanvas beginRecording = o0().beginRecording();
        if (ef0.g(ef0Var.j)) {
            EdgeEffect edgeEffect = ef0Var.j;
            if (edgeEffect == null) {
                edgeEffect = ef0Var.a();
                ef0Var.j = edgeEffect;
            }
            n0(90.0f, edgeEffect, beginRecording);
            edgeEffect.finish();
        }
        boolean f5 = ef0.f(ef0Var.f);
        ge geVar = ge.a;
        if (f5) {
            EdgeEffect c = ef0Var.c();
            z = n0(270.0f, c, beginRecording);
            if (ef0.g(ef0Var.f)) {
                float e = au1.e(q9Var.c());
                EdgeEffect edgeEffect2 = ef0Var.j;
                if (edgeEffect2 == null) {
                    edgeEffect2 = ef0Var.a();
                    ef0Var.j = edgeEffect2;
                }
                int i = Build.VERSION.SDK_INT;
                float b = i >= 31 ? geVar.b(c) : 0.0f;
                float f6 = 1.0f - e;
                if (i >= 31) {
                    geVar.c(edgeEffect2, b, f6);
                } else {
                    edgeEffect2.onPull(b, f6);
                }
            }
        } else {
            z = false;
        }
        if (ef0.g(ef0Var.h)) {
            EdgeEffect edgeEffect3 = ef0Var.h;
            if (edgeEffect3 == null) {
                edgeEffect3 = ef0Var.a();
                ef0Var.h = edgeEffect3;
            }
            n0(180.0f, edgeEffect3, beginRecording);
            edgeEffect3.finish();
        }
        if (ef0.f(ef0Var.d)) {
            EdgeEffect e2 = ef0Var.e();
            z = n0(0.0f, e2, beginRecording) || z;
            if (ef0.g(ef0Var.d)) {
                float d = au1.d(q9Var.c());
                EdgeEffect edgeEffect4 = ef0Var.h;
                if (edgeEffect4 == null) {
                    edgeEffect4 = ef0Var.a();
                    ef0Var.h = edgeEffect4;
                }
                int i2 = Build.VERSION.SDK_INT;
                float b2 = i2 >= 31 ? geVar.b(e2) : 0.0f;
                if (i2 >= 31) {
                    geVar.c(edgeEffect4, b2, d);
                } else {
                    edgeEffect4.onPull(b2, d);
                }
            }
        }
        if (ef0.g(ef0Var.k)) {
            EdgeEffect edgeEffect5 = ef0Var.k;
            if (edgeEffect5 == null) {
                edgeEffect5 = ef0Var.a();
                ef0Var.k = edgeEffect5;
            }
            n0(270.0f, edgeEffect5, beginRecording);
            edgeEffect5.finish();
        }
        if (ef0.f(ef0Var.g)) {
            EdgeEffect d2 = ef0Var.d();
            z = n0(90.0f, d2, beginRecording) || z;
            if (ef0.g(ef0Var.g)) {
                float e3 = au1.e(q9Var.c());
                EdgeEffect edgeEffect6 = ef0Var.k;
                if (edgeEffect6 == null) {
                    edgeEffect6 = ef0Var.a();
                    ef0Var.k = edgeEffect6;
                }
                int i3 = Build.VERSION.SDK_INT;
                float b3 = i3 >= 31 ? geVar.b(d2) : 0.0f;
                if (i3 >= 31) {
                    geVar.c(edgeEffect6, b3, e3);
                } else {
                    edgeEffect6.onPull(b3, e3);
                }
            }
        }
        if (ef0.g(ef0Var.i)) {
            EdgeEffect edgeEffect7 = ef0Var.i;
            if (edgeEffect7 == null) {
                edgeEffect7 = ef0Var.a();
                ef0Var.i = edgeEffect7;
            }
            f = 0.0f;
            n0(0.0f, edgeEffect7, beginRecording);
            edgeEffect7.finish();
        } else {
            f = 0.0f;
        }
        if (ef0.f(ef0Var.e)) {
            EdgeEffect b4 = ef0Var.b();
            boolean z4 = n0(180.0f, b4, beginRecording) || z;
            if (ef0.g(ef0Var.e)) {
                float d3 = au1.d(q9Var.c());
                EdgeEffect edgeEffect8 = ef0Var.i;
                if (edgeEffect8 == null) {
                    edgeEffect8 = ef0Var.a();
                    ef0Var.i = edgeEffect8;
                }
                int i4 = Build.VERSION.SDK_INT;
                float b5 = i4 >= 31 ? geVar.b(b4) : f;
                float f7 = 1.0f - d3;
                if (i4 >= 31) {
                    geVar.c(edgeEffect8, b5, f7);
                } else {
                    edgeEffect8.onPull(b5, f7);
                }
            }
            z = z4;
        }
        if (z) {
            q9Var.d();
        }
        float f8 = z3 ? f : D;
        if (z2) {
            D = f;
        }
        u81 layoutDirection = k91Var.getLayoutDirection();
        y6 y6Var = new y6();
        y6Var.a = beginRecording;
        long f9 = nsVar.f();
        mh mhVar = nsVar.n;
        ms msVar = ((ns) mhVar.p).m;
        ca0 ca0Var = msVar.a;
        u81 u81Var = msVar.b;
        ls o = mhVar.o();
        long v = nsVar.n.v();
        mh mhVar2 = nsVar.n;
        dw0 dw0Var = (dw0) mhVar2.o;
        mhVar2.H(k91Var);
        mhVar2.I(layoutDirection);
        mhVar2.G(y6Var);
        mhVar2.J(f9);
        mhVar2.o = null;
        y6Var.m();
        try {
            ((ar0) nsVar.n.n).z(f8, D);
            try {
                k91Var.a();
                y6Var.j();
                mh mhVar3 = nsVar.n;
                mhVar3.H(ca0Var);
                mhVar3.I(u81Var);
                mhVar3.G(o);
                mhVar3.J(v);
                mhVar3.o = dw0Var;
                o0().endRecording();
                int save = a.save();
                a.translate(f2, f3);
                a.drawRenderNode(o0());
                a.restoreToCount(save);
            } finally {
                ((ar0) nsVar.n.n).z(-f8, -D);
            }
        } catch (Throwable th) {
            y6Var.j();
            mh mhVar4 = nsVar.n;
            mhVar4.H(ca0Var);
            mhVar4.I(u81Var);
            mhVar4.G(o);
            mhVar4.J(v);
            mhVar4.o = dw0Var;
            throw th;
        }
    }

    public final RenderNode o0() {
        RenderNode renderNode = this.t;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode b = no.b();
        this.t = b;
        return b;
    }
}
