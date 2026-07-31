package n;

import D1.C0014b;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import b0.AbstractC0272e;
import b0.C0271d;
import b0.InterfaceC0285r;
import d0.C0321b;
import e0.C0336b;
import r.InterfaceC0796H;

/* renamed from: n.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633D extends u0.L implements Y.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5986c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final C0658m f5987d;

    /* renamed from: e, reason: collision with root package name */
    public final C0634E f5988e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5989f;

    public C0633D(C0658m c0658m, C0634E c0634e) {
        this.f5987d = c0658m;
        this.f5988e = c0634e;
    }

    public static boolean y(float f3, EdgeEffect edgeEffect, Canvas canvas) {
        if (f3 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f3);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean z(float f3, long j3, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f3);
        canvas.translate(a0.c.d(j3), a0.c.e(j3));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode A() {
        RenderNode renderNode = (RenderNode) this.f5989f;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode s3 = e0.f.s();
        this.f5989f = s3;
        return s3;
    }

    @Override // Y.e
    public final void d(t0.F f3) {
        RecordingCanvas beginRecording;
        float f4;
        boolean z3;
        float f5;
        float f6;
        switch (this.f5986c) {
            case 0:
                C0321b c0321b = f3.f7748d;
                long c3 = c0321b.c();
                C0658m c0658m = this.f5987d;
                c0658m.l(c3);
                if (a0.f.e(c0321b.c())) {
                    f3.b();
                    return;
                }
                f3.b();
                c0658m.f6122f.getValue();
                Canvas a3 = AbstractC0272e.a(c0321b.f4444e.h());
                C0634E c0634e = this.f5988e;
                boolean f7 = C0634E.f(c0634e.f5995f);
                InterfaceC0796H interfaceC0796H = ((c0) this.f5989f).f6068b;
                boolean z4 = f7 ? z(270.0f, I2.l.f(-a0.f.b(c0321b.c()), f3.F(interfaceC0796H.b(f3.getLayoutDirection()))), c0634e.c(), a3) : false;
                if (C0634E.f(c0634e.f5993d)) {
                    z4 = z(0.0f, I2.l.f(0.0f, f3.F(interfaceC0796H.d())), c0634e.e(), a3) || z4;
                }
                if (C0634E.f(c0634e.f5996g)) {
                    z4 = z(90.0f, I2.l.f(0.0f, f3.F(interfaceC0796H.a(f3.getLayoutDirection())) + (-((float) M1.B.M(a0.f.d(c0321b.c()))))), c0634e.d(), a3) || z4;
                }
                if (C0634E.f(c0634e.f5994e)) {
                    z4 = z(180.0f, I2.l.f(-a0.f.d(c0321b.c()), (-a0.f.b(c0321b.c())) + f3.F(interfaceC0796H.c())), c0634e.b(), a3) || z4;
                }
                if (z4) {
                    c0658m.g();
                    return;
                }
                return;
            default:
                C0321b c0321b2 = f3.f7748d;
                long c4 = c0321b2.c();
                C0658m c0658m2 = this.f5987d;
                c0658m2.l(c4);
                if (a0.f.e(c0321b2.c())) {
                    f3.b();
                    return;
                }
                c0658m2.f6122f.getValue();
                float F3 = f3.F(AbstractC0669y.f6185a);
                Canvas a4 = AbstractC0272e.a(c0321b2.f4444e.h());
                C0634E c0634e2 = this.f5988e;
                boolean z5 = C0634E.f(c0634e2.f5993d) || C0634E.g(c0634e2.f5997h) || C0634E.f(c0634e2.f5994e) || C0634E.g(c0634e2.f5998i);
                boolean z6 = C0634E.f(c0634e2.f5995f) || C0634E.g(c0634e2.f5999j) || C0634E.f(c0634e2.f5996g) || C0634E.g(c0634e2.f6000k);
                if (z5 && z6) {
                    A().setPosition(0, 0, a4.getWidth(), a4.getHeight());
                } else if (z5) {
                    A().setPosition(0, 0, (M1.B.M(F3) * 2) + a4.getWidth(), a4.getHeight());
                } else {
                    if (!z6) {
                        f3.b();
                        return;
                    }
                    A().setPosition(0, 0, a4.getWidth(), (M1.B.M(F3) * 2) + a4.getHeight());
                }
                beginRecording = A().beginRecording();
                if (C0634E.g(c0634e2.f5999j)) {
                    EdgeEffect edgeEffect = c0634e2.f5999j;
                    if (edgeEffect == null) {
                        edgeEffect = c0634e2.a();
                        c0634e2.f5999j = edgeEffect;
                    }
                    y(90.0f, edgeEffect, beginRecording);
                    edgeEffect.finish();
                }
                boolean f8 = C0634E.f(c0634e2.f5995f);
                C0659n c0659n = C0659n.f6128a;
                if (f8) {
                    EdgeEffect c5 = c0634e2.c();
                    z3 = y(270.0f, c5, beginRecording);
                    if (C0634E.g(c0634e2.f5995f)) {
                        float e3 = a0.c.e(c0658m2.d());
                        EdgeEffect edgeEffect2 = c0634e2.f5999j;
                        if (edgeEffect2 == null) {
                            edgeEffect2 = c0634e2.a();
                            c0634e2.f5999j = edgeEffect2;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 31) {
                            f6 = c0659n.b(c5);
                            f4 = F3;
                        } else {
                            f4 = F3;
                            f6 = 0.0f;
                        }
                        float f9 = 1 - e3;
                        if (i3 >= 31) {
                            c0659n.c(edgeEffect2, f6, f9);
                        } else {
                            edgeEffect2.onPull(f6, f9);
                        }
                    } else {
                        f4 = F3;
                    }
                } else {
                    f4 = F3;
                    z3 = false;
                }
                if (C0634E.g(c0634e2.f5997h)) {
                    EdgeEffect edgeEffect3 = c0634e2.f5997h;
                    if (edgeEffect3 == null) {
                        edgeEffect3 = c0634e2.a();
                        c0634e2.f5997h = edgeEffect3;
                    }
                    y(180.0f, edgeEffect3, beginRecording);
                    edgeEffect3.finish();
                }
                if (C0634E.f(c0634e2.f5993d)) {
                    EdgeEffect e4 = c0634e2.e();
                    boolean z7 = y(0.0f, e4, beginRecording) || z3;
                    if (C0634E.g(c0634e2.f5993d)) {
                        float d3 = a0.c.d(c0658m2.d());
                        EdgeEffect edgeEffect4 = c0634e2.f5997h;
                        if (edgeEffect4 == null) {
                            edgeEffect4 = c0634e2.a();
                            c0634e2.f5997h = edgeEffect4;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float b2 = i4 >= 31 ? c0659n.b(e4) : 0.0f;
                        if (i4 >= 31) {
                            c0659n.c(edgeEffect4, b2, d3);
                        } else {
                            edgeEffect4.onPull(b2, d3);
                        }
                    }
                    z3 = z7;
                }
                if (C0634E.g(c0634e2.f6000k)) {
                    EdgeEffect edgeEffect5 = c0634e2.f6000k;
                    if (edgeEffect5 == null) {
                        edgeEffect5 = c0634e2.a();
                        c0634e2.f6000k = edgeEffect5;
                    }
                    y(270.0f, edgeEffect5, beginRecording);
                    edgeEffect5.finish();
                }
                if (C0634E.f(c0634e2.f5996g)) {
                    EdgeEffect d4 = c0634e2.d();
                    boolean z8 = y(90.0f, d4, beginRecording) || z3;
                    if (C0634E.g(c0634e2.f5996g)) {
                        float e5 = a0.c.e(c0658m2.d());
                        EdgeEffect edgeEffect6 = c0634e2.f6000k;
                        if (edgeEffect6 == null) {
                            edgeEffect6 = c0634e2.a();
                            c0634e2.f6000k = edgeEffect6;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float b3 = i5 >= 31 ? c0659n.b(d4) : 0.0f;
                        if (i5 >= 31) {
                            c0659n.c(edgeEffect6, b3, e5);
                        } else {
                            edgeEffect6.onPull(b3, e5);
                        }
                    }
                    z3 = z8;
                }
                if (C0634E.g(c0634e2.f5998i)) {
                    EdgeEffect edgeEffect7 = c0634e2.f5998i;
                    if (edgeEffect7 == null) {
                        edgeEffect7 = c0634e2.a();
                        c0634e2.f5998i = edgeEffect7;
                    }
                    f5 = 0.0f;
                    y(0.0f, edgeEffect7, beginRecording);
                    edgeEffect7.finish();
                } else {
                    f5 = 0.0f;
                }
                if (C0634E.f(c0634e2.f5994e)) {
                    EdgeEffect b4 = c0634e2.b();
                    boolean z9 = y(180.0f, b4, beginRecording) || z3;
                    if (C0634E.g(c0634e2.f5994e)) {
                        float d5 = a0.c.d(c0658m2.d());
                        EdgeEffect edgeEffect8 = c0634e2.f5998i;
                        if (edgeEffect8 == null) {
                            edgeEffect8 = c0634e2.a();
                            c0634e2.f5998i = edgeEffect8;
                        }
                        int i6 = Build.VERSION.SDK_INT;
                        float b5 = i6 >= 31 ? c0659n.b(b4) : f5;
                        float f10 = 1 - d5;
                        if (i6 >= 31) {
                            c0659n.c(edgeEffect8, b5, f10);
                        } else {
                            edgeEffect8.onPull(b5, f10);
                        }
                    }
                    z3 = z9;
                }
                if (z3) {
                    c0658m2.g();
                }
                float f11 = z6 ? f5 : f4;
                if (!z5) {
                    f5 = f4;
                }
                M0.j layoutDirection = f3.getLayoutDirection();
                C0271d c0271d = new C0271d();
                c0271d.f4263a = beginRecording;
                long c6 = c0321b2.c();
                M0.b j3 = c0321b2.f4444e.j();
                M0.j l3 = c0321b2.f4444e.l();
                InterfaceC0285r h3 = c0321b2.f4444e.h();
                long m3 = c0321b2.f4444e.m();
                C0014b c0014b = c0321b2.f4444e;
                C0336b c0336b = (C0336b) c0014b.f537c;
                c0014b.v(f3);
                c0014b.x(layoutDirection);
                c0014b.u(c0271d);
                c0014b.y(c6);
                c0014b.f537c = null;
                c0271d.f();
                try {
                    ((A2.g) c0321b2.f4444e.f536b).u(f11, f5);
                    try {
                        f3.b();
                        float f12 = -f11;
                        float f13 = -f5;
                        ((A2.g) c0321b2.f4444e.f536b).u(f12, f13);
                        c0271d.a();
                        C0014b c0014b2 = c0321b2.f4444e;
                        c0014b2.v(j3);
                        c0014b2.x(l3);
                        c0014b2.u(h3);
                        c0014b2.y(m3);
                        c0014b2.f537c = c0336b;
                        A().endRecording();
                        int save = a4.save();
                        a4.translate(f12, f13);
                        a4.drawRenderNode(A());
                        a4.restoreToCount(save);
                        return;
                    } catch (Throwable th) {
                        ((A2.g) c0321b2.f4444e.f536b).u(-f11, -f5);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c0271d.a();
                    C0014b c0014b3 = c0321b2.f4444e;
                    c0014b3.v(j3);
                    c0014b3.x(l3);
                    c0014b3.u(h3);
                    c0014b3.y(m3);
                    c0014b3.f537c = c0336b;
                    throw th2;
                }
        }
    }

    public C0633D(C0658m c0658m, C0634E c0634e, c0 c0Var) {
        this.f5987d = c0658m;
        this.f5988e = c0634e;
        this.f5989f = c0Var;
    }
}
