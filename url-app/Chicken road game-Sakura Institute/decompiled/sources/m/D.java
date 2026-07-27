package m;

import B1.C0097d;
import Z.AbstractC0307d;
import Z.C0306c;
import a.AbstractC0345a;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import b0.C0494b;
import c0.AbstractC0535f;
import c0.C0531b;
import q.InterfaceC1021Z;
import s0.C1157n;
import w2.C1294c;

/* loaded from: classes.dex */
public final class D extends l.t0 implements W.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8001b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final C0840m f8002c;

    /* renamed from: d, reason: collision with root package name */
    public final E f8003d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8004e;

    public D(C0840m c0840m, E e4) {
        super(C1157n.f10272m);
        this.f8002c = c0840m;
        this.f8003d = e4;
    }

    public static boolean q(float f4, EdgeEffect edgeEffect, Canvas canvas) {
        if (f4 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f4);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean r(float f4, long j4, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f4);
        canvas.translate(Y.c.d(j4), Y.c.e(j4));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // W.e
    public final void a(r0.G g4) {
        RecordingCanvas beginRecording;
        float f4;
        boolean z4;
        float f5;
        float f6;
        switch (this.f8001b) {
            case 0:
                C0494b c0494b = g4.f9624d;
                long h4 = c0494b.h();
                C0840m c0840m = this.f8002c;
                c0840m.l(h4);
                if (Y.f.e(c0494b.h())) {
                    g4.a();
                    return;
                }
                g4.a();
                c0840m.f8139i.getValue();
                Canvas a4 = AbstractC0307d.a(c0494b.f5603e.k());
                E e4 = this.f8003d;
                boolean f7 = E.f(e4.f8010f);
                InterfaceC1021Z interfaceC1021Z = ((g0) this.f8004e).f8119b;
                boolean r2 = f7 ? r(270.0f, AbstractC0345a.c(-Y.f.b(c0494b.h()), g4.L(interfaceC1021Z.b(g4.getLayoutDirection()))), e4.c(), a4) : false;
                if (E.f(e4.f8008d)) {
                    r2 = r(0.0f, AbstractC0345a.c(0.0f, g4.L(interfaceC1021Z.d())), e4.e(), a4) || r2;
                }
                if (E.f(e4.f8011g)) {
                    r2 = r(90.0f, AbstractC0345a.c(0.0f, g4.L(interfaceC1021Z.a(g4.getLayoutDirection())) + (-((float) O2.c.a(Y.f.d(c0494b.h()))))), e4.d(), a4) || r2;
                }
                if (E.f(e4.f8009e)) {
                    r2 = r(180.0f, AbstractC0345a.c(-Y.f.d(c0494b.h()), (-Y.f.b(c0494b.h())) + g4.L(interfaceC1021Z.c())), e4.b(), a4) || r2;
                }
                if (r2) {
                    c0840m.g();
                    return;
                }
                return;
            default:
                C0494b c0494b2 = g4.f9624d;
                long h5 = c0494b2.h();
                C0840m c0840m2 = this.f8002c;
                c0840m2.l(h5);
                if (Y.f.e(c0494b2.h())) {
                    g4.a();
                    return;
                }
                c0840m2.f8139i.getValue();
                float L3 = g4.L(AbstractC0852z.f8232a);
                Canvas a5 = AbstractC0307d.a(c0494b2.f5603e.k());
                E e5 = this.f8003d;
                boolean z5 = E.f(e5.f8008d) || E.g(e5.f8012h) || E.f(e5.f8009e) || E.g(e5.f8013i);
                boolean z6 = E.f(e5.f8010f) || E.g(e5.f8014j) || E.f(e5.f8011g) || E.g(e5.f8015k);
                if (z5 && z6) {
                    s().setPosition(0, 0, a5.getWidth(), a5.getHeight());
                } else if (z5) {
                    s().setPosition(0, 0, (O2.c.a(L3) * 2) + a5.getWidth(), a5.getHeight());
                } else {
                    if (!z6) {
                        g4.a();
                        return;
                    }
                    s().setPosition(0, 0, a5.getWidth(), (O2.c.a(L3) * 2) + a5.getHeight());
                }
                beginRecording = s().beginRecording();
                if (E.g(e5.f8014j)) {
                    EdgeEffect edgeEffect = e5.f8014j;
                    if (edgeEffect == null) {
                        edgeEffect = e5.a();
                        e5.f8014j = edgeEffect;
                    }
                    q(90.0f, edgeEffect, beginRecording);
                    edgeEffect.finish();
                }
                boolean f8 = E.f(e5.f8010f);
                C0841n c0841n = C0841n.f8146a;
                if (f8) {
                    EdgeEffect c4 = e5.c();
                    z4 = q(270.0f, c4, beginRecording);
                    if (E.g(e5.f8010f)) {
                        float e6 = Y.c.e(c0840m2.c());
                        EdgeEffect edgeEffect2 = e5.f8014j;
                        if (edgeEffect2 == null) {
                            edgeEffect2 = e5.a();
                            e5.f8014j = edgeEffect2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            f6 = c0841n.b(c4);
                            f4 = L3;
                        } else {
                            f4 = L3;
                            f6 = 0.0f;
                        }
                        float f9 = 1 - e6;
                        if (i2 >= 31) {
                            c0841n.c(edgeEffect2, f6, f9);
                        } else {
                            edgeEffect2.onPull(f6, f9);
                        }
                    } else {
                        f4 = L3;
                    }
                } else {
                    f4 = L3;
                    z4 = false;
                }
                if (E.g(e5.f8012h)) {
                    EdgeEffect edgeEffect3 = e5.f8012h;
                    if (edgeEffect3 == null) {
                        edgeEffect3 = e5.a();
                        e5.f8012h = edgeEffect3;
                    }
                    q(180.0f, edgeEffect3, beginRecording);
                    edgeEffect3.finish();
                }
                if (E.f(e5.f8008d)) {
                    EdgeEffect e7 = e5.e();
                    boolean z7 = q(0.0f, e7, beginRecording) || z4;
                    if (E.g(e5.f8008d)) {
                        float d4 = Y.c.d(c0840m2.c());
                        EdgeEffect edgeEffect4 = e5.f8012h;
                        if (edgeEffect4 == null) {
                            edgeEffect4 = e5.a();
                            e5.f8012h = edgeEffect4;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float b4 = i4 >= 31 ? c0841n.b(e7) : 0.0f;
                        if (i4 >= 31) {
                            c0841n.c(edgeEffect4, b4, d4);
                        } else {
                            edgeEffect4.onPull(b4, d4);
                        }
                    }
                    z4 = z7;
                }
                if (E.g(e5.f8015k)) {
                    EdgeEffect edgeEffect5 = e5.f8015k;
                    if (edgeEffect5 == null) {
                        edgeEffect5 = e5.a();
                        e5.f8015k = edgeEffect5;
                    }
                    q(270.0f, edgeEffect5, beginRecording);
                    edgeEffect5.finish();
                }
                if (E.f(e5.f8011g)) {
                    EdgeEffect d5 = e5.d();
                    boolean z8 = q(90.0f, d5, beginRecording) || z4;
                    if (E.g(e5.f8011g)) {
                        float e8 = Y.c.e(c0840m2.c());
                        EdgeEffect edgeEffect6 = e5.f8015k;
                        if (edgeEffect6 == null) {
                            edgeEffect6 = e5.a();
                            e5.f8015k = edgeEffect6;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float b5 = i5 >= 31 ? c0841n.b(d5) : 0.0f;
                        if (i5 >= 31) {
                            c0841n.c(edgeEffect6, b5, e8);
                        } else {
                            edgeEffect6.onPull(b5, e8);
                        }
                    }
                    z4 = z8;
                }
                if (E.g(e5.f8013i)) {
                    EdgeEffect edgeEffect7 = e5.f8013i;
                    if (edgeEffect7 == null) {
                        edgeEffect7 = e5.a();
                        e5.f8013i = edgeEffect7;
                    }
                    f5 = 0.0f;
                    q(0.0f, edgeEffect7, beginRecording);
                    edgeEffect7.finish();
                } else {
                    f5 = 0.0f;
                }
                if (E.f(e5.f8009e)) {
                    EdgeEffect b6 = e5.b();
                    boolean z9 = q(180.0f, b6, beginRecording) || z4;
                    if (E.g(e5.f8009e)) {
                        float d6 = Y.c.d(c0840m2.c());
                        EdgeEffect edgeEffect8 = e5.f8013i;
                        if (edgeEffect8 == null) {
                            edgeEffect8 = e5.a();
                            e5.f8013i = edgeEffect8;
                        }
                        int i6 = Build.VERSION.SDK_INT;
                        float b7 = i6 >= 31 ? c0841n.b(b6) : f5;
                        float f10 = 1 - d6;
                        if (i6 >= 31) {
                            c0841n.c(edgeEffect8, b7, f10);
                        } else {
                            edgeEffect8.onPull(b7, f10);
                        }
                    }
                    z4 = z9;
                }
                if (z4) {
                    c0840m2.g();
                }
                float f11 = z6 ? f5 : f4;
                if (!z5) {
                    f5 = f4;
                }
                M0.k layoutDirection = g4.getLayoutDirection();
                C0306c c0306c = new C0306c();
                c0306c.f4515a = beginRecording;
                long h6 = c0494b2.h();
                M0.b m4 = c0494b2.f5603e.m();
                M0.k q2 = c0494b2.f5603e.q();
                Z.r k4 = c0494b2.f5603e.k();
                long s4 = c0494b2.f5603e.s();
                C0097d c0097d = c0494b2.f5603e;
                C0531b c0531b = (C0531b) c0097d.f988i;
                c0097d.D(g4);
                c0097d.F(layoutDirection);
                c0097d.C(c0306c);
                c0097d.G(h6);
                c0097d.f988i = null;
                c0306c.g();
                try {
                    ((C1294c) c0494b2.f5603e.f987e).r(f11, f5);
                    try {
                        g4.a();
                        float f12 = -f11;
                        float f13 = -f5;
                        ((C1294c) c0494b2.f5603e.f987e).r(f12, f13);
                        c0306c.b();
                        C0097d c0097d2 = c0494b2.f5603e;
                        c0097d2.D(m4);
                        c0097d2.F(q2);
                        c0097d2.C(k4);
                        c0097d2.G(s4);
                        c0097d2.f988i = c0531b;
                        s().endRecording();
                        int save = a5.save();
                        a5.translate(f12, f13);
                        a5.drawRenderNode(s());
                        a5.restoreToCount(save);
                        return;
                    } catch (Throwable th) {
                        ((C1294c) c0494b2.f5603e.f987e).r(-f11, -f5);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c0306c.b();
                    C0097d c0097d3 = c0494b2.f5603e;
                    c0097d3.D(m4);
                    c0097d3.F(q2);
                    c0097d3.C(k4);
                    c0097d3.G(s4);
                    c0097d3.f988i = c0531b;
                    throw th2;
                }
        }
    }

    public RenderNode s() {
        RenderNode renderNode = (RenderNode) this.f8004e;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode s4 = AbstractC0535f.s();
        this.f8004e = s4;
        return s4;
    }

    public D(C0840m c0840m, E e4, g0 g0Var) {
        super(C1157n.f10272m);
        this.f8002c = c0840m;
        this.f8003d = e4;
        this.f8004e = g0Var;
    }
}
