package n;

import a0.C0238c;
import a0.C0241f;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import b0.AbstractC0335d;
import b0.C0334c;
import d0.C0401b;
import e0.AbstractC0420f;
import e0.C0416b;
import h2.AbstractC0508a;
import r.InterfaceC0849K;

/* renamed from: n.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663F extends u0.L implements Y.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7031c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final C0687m f7032d;

    /* renamed from: e, reason: collision with root package name */
    public final C0664G f7033e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7034f;

    public C0663F(C0687m c0687m, C0664G c0664g) {
        this.f7032d = c0687m;
        this.f7033e = c0664g;
    }

    public static boolean C(float f3, EdgeEffect edgeEffect, Canvas canvas) {
        if (f3 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f3);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean D(float f3, long j3, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f3);
        canvas.translate(C0238c.d(j3), C0238c.e(j3));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode E() {
        RenderNode renderNode = (RenderNode) this.f7034f;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode r3 = AbstractC0420f.r();
        this.f7034f = r3;
        return r3;
    }

    @Override // Y.e
    public final void h(t0.G g3) {
        RecordingCanvas beginRecording;
        float f3;
        boolean z3;
        float f4;
        float f5;
        switch (this.f7031c) {
            case 0:
                C0401b c0401b = g3.f8573d;
                long d3 = c0401b.d();
                C0687m c0687m = this.f7032d;
                c0687m.l(d3);
                if (C0241f.e(c0401b.d())) {
                    g3.b();
                    return;
                }
                g3.b();
                c0687m.f7166f.getValue();
                Canvas a3 = AbstractC0335d.a(c0401b.f5649e.h());
                C0664G c0664g = this.f7033e;
                boolean f6 = C0664G.f(c0664g.f7040f);
                InterfaceC0849K interfaceC0849K = ((j0) this.f7034f).f7156b;
                boolean D = f6 ? D(270.0f, l0.c.e(-C0241f.b(c0401b.d()), g3.J(interfaceC0849K.b(g3.getLayoutDirection()))), c0664g.c(), a3) : false;
                if (C0664G.f(c0664g.f7038d)) {
                    D = D(0.0f, l0.c.e(0.0f, g3.J(interfaceC0849K.d())), c0664g.e(), a3) || D;
                }
                if (C0664G.f(c0664g.f7041g)) {
                    D = D(90.0f, l0.c.e(0.0f, g3.J(interfaceC0849K.a(g3.getLayoutDirection())) + (-((float) AbstractC0508a.Q(C0241f.d(c0401b.d()))))), c0664g.d(), a3) || D;
                }
                if (C0664G.f(c0664g.f7039e)) {
                    D = D(180.0f, l0.c.e(-C0241f.d(c0401b.d()), (-C0241f.b(c0401b.d())) + g3.J(interfaceC0849K.c())), c0664g.b(), a3) || D;
                }
                if (D) {
                    c0687m.g();
                    return;
                }
                return;
            default:
                C0401b c0401b2 = g3.f8573d;
                long d4 = c0401b2.d();
                C0687m c0687m2 = this.f7032d;
                c0687m2.l(d4);
                if (C0241f.e(c0401b2.d())) {
                    g3.b();
                    return;
                }
                c0687m2.f7166f.getValue();
                float J3 = g3.J(AbstractC0658A.f7013a);
                Canvas a4 = AbstractC0335d.a(c0401b2.f5649e.h());
                C0664G c0664g2 = this.f7033e;
                boolean z4 = C0664G.f(c0664g2.f7038d) || C0664G.g(c0664g2.f7042h) || C0664G.f(c0664g2.f7039e) || C0664G.g(c0664g2.f7043i);
                boolean z5 = C0664G.f(c0664g2.f7040f) || C0664G.g(c0664g2.f7044j) || C0664G.f(c0664g2.f7041g) || C0664G.g(c0664g2.f7045k);
                if (z4 && z5) {
                    E().setPosition(0, 0, a4.getWidth(), a4.getHeight());
                } else if (z4) {
                    E().setPosition(0, 0, (AbstractC0508a.Q(J3) * 2) + a4.getWidth(), a4.getHeight());
                } else {
                    if (!z5) {
                        g3.b();
                        return;
                    }
                    E().setPosition(0, 0, a4.getWidth(), (AbstractC0508a.Q(J3) * 2) + a4.getHeight());
                }
                beginRecording = E().beginRecording();
                if (C0664G.g(c0664g2.f7044j)) {
                    EdgeEffect edgeEffect = c0664g2.f7044j;
                    if (edgeEffect == null) {
                        edgeEffect = c0664g2.a();
                        c0664g2.f7044j = edgeEffect;
                    }
                    C(90.0f, edgeEffect, beginRecording);
                    edgeEffect.finish();
                }
                boolean f7 = C0664G.f(c0664g2.f7040f);
                C0688n c0688n = C0688n.f7172a;
                if (f7) {
                    EdgeEffect c2 = c0664g2.c();
                    z3 = C(270.0f, c2, beginRecording);
                    if (C0664G.g(c0664g2.f7040f)) {
                        float e3 = C0238c.e(c0687m2.e());
                        EdgeEffect edgeEffect2 = c0664g2.f7044j;
                        if (edgeEffect2 == null) {
                            edgeEffect2 = c0664g2.a();
                            c0664g2.f7044j = edgeEffect2;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 31) {
                            f5 = c0688n.b(c2);
                            f3 = J3;
                        } else {
                            f3 = J3;
                            f5 = 0.0f;
                        }
                        float f8 = 1 - e3;
                        if (i3 >= 31) {
                            c0688n.c(edgeEffect2, f5, f8);
                        } else {
                            edgeEffect2.onPull(f5, f8);
                        }
                    } else {
                        f3 = J3;
                    }
                } else {
                    f3 = J3;
                    z3 = false;
                }
                if (C0664G.g(c0664g2.f7042h)) {
                    EdgeEffect edgeEffect3 = c0664g2.f7042h;
                    if (edgeEffect3 == null) {
                        edgeEffect3 = c0664g2.a();
                        c0664g2.f7042h = edgeEffect3;
                    }
                    C(180.0f, edgeEffect3, beginRecording);
                    edgeEffect3.finish();
                }
                if (C0664G.f(c0664g2.f7038d)) {
                    EdgeEffect e4 = c0664g2.e();
                    boolean z6 = C(0.0f, e4, beginRecording) || z3;
                    if (C0664G.g(c0664g2.f7038d)) {
                        float d5 = C0238c.d(c0687m2.e());
                        EdgeEffect edgeEffect4 = c0664g2.f7042h;
                        if (edgeEffect4 == null) {
                            edgeEffect4 = c0664g2.a();
                            c0664g2.f7042h = edgeEffect4;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float b3 = i4 >= 31 ? c0688n.b(e4) : 0.0f;
                        if (i4 >= 31) {
                            c0688n.c(edgeEffect4, b3, d5);
                        } else {
                            edgeEffect4.onPull(b3, d5);
                        }
                    }
                    z3 = z6;
                }
                if (C0664G.g(c0664g2.f7045k)) {
                    EdgeEffect edgeEffect5 = c0664g2.f7045k;
                    if (edgeEffect5 == null) {
                        edgeEffect5 = c0664g2.a();
                        c0664g2.f7045k = edgeEffect5;
                    }
                    C(270.0f, edgeEffect5, beginRecording);
                    edgeEffect5.finish();
                }
                if (C0664G.f(c0664g2.f7041g)) {
                    EdgeEffect d6 = c0664g2.d();
                    boolean z7 = C(90.0f, d6, beginRecording) || z3;
                    if (C0664G.g(c0664g2.f7041g)) {
                        float e5 = C0238c.e(c0687m2.e());
                        EdgeEffect edgeEffect6 = c0664g2.f7045k;
                        if (edgeEffect6 == null) {
                            edgeEffect6 = c0664g2.a();
                            c0664g2.f7045k = edgeEffect6;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float b4 = i5 >= 31 ? c0688n.b(d6) : 0.0f;
                        if (i5 >= 31) {
                            c0688n.c(edgeEffect6, b4, e5);
                        } else {
                            edgeEffect6.onPull(b4, e5);
                        }
                    }
                    z3 = z7;
                }
                if (C0664G.g(c0664g2.f7043i)) {
                    EdgeEffect edgeEffect7 = c0664g2.f7043i;
                    if (edgeEffect7 == null) {
                        edgeEffect7 = c0664g2.a();
                        c0664g2.f7043i = edgeEffect7;
                    }
                    f4 = 0.0f;
                    C(0.0f, edgeEffect7, beginRecording);
                    edgeEffect7.finish();
                } else {
                    f4 = 0.0f;
                }
                if (C0664G.f(c0664g2.f7039e)) {
                    EdgeEffect b5 = c0664g2.b();
                    boolean z8 = C(180.0f, b5, beginRecording) || z3;
                    if (C0664G.g(c0664g2.f7039e)) {
                        float d7 = C0238c.d(c0687m2.e());
                        EdgeEffect edgeEffect8 = c0664g2.f7043i;
                        if (edgeEffect8 == null) {
                            edgeEffect8 = c0664g2.a();
                            c0664g2.f7043i = edgeEffect8;
                        }
                        int i6 = Build.VERSION.SDK_INT;
                        float b6 = i6 >= 31 ? c0688n.b(b5) : f4;
                        float f9 = 1 - d7;
                        if (i6 >= 31) {
                            c0688n.c(edgeEffect8, b6, f9);
                        } else {
                            edgeEffect8.onPull(b6, f9);
                        }
                    }
                    z3 = z8;
                }
                if (z3) {
                    c0687m2.g();
                }
                float f10 = z5 ? f4 : f3;
                if (!z4) {
                    f4 = f3;
                }
                O0.k layoutDirection = g3.getLayoutDirection();
                C0334c c0334c = new C0334c();
                c0334c.f5405a = beginRecording;
                long d8 = c0401b2.d();
                O0.b j3 = c0401b2.f5649e.j();
                O0.k m3 = c0401b2.f5649e.m();
                b0.r h3 = c0401b2.f5649e.h();
                long n3 = c0401b2.f5649e.n();
                G1.m mVar = c0401b2.f5649e;
                C0416b c0416b = (C0416b) mVar.f2117c;
                mVar.w(g3);
                mVar.y(layoutDirection);
                mVar.v(c0334c);
                mVar.z(d8);
                mVar.f2117c = null;
                c0334c.f();
                try {
                    ((B.Y) c0401b2.f5649e.f2116b).r(f10, f4);
                    try {
                        g3.b();
                        float f11 = -f10;
                        float f12 = -f4;
                        ((B.Y) c0401b2.f5649e.f2116b).r(f11, f12);
                        c0334c.a();
                        G1.m mVar2 = c0401b2.f5649e;
                        mVar2.w(j3);
                        mVar2.y(m3);
                        mVar2.v(h3);
                        mVar2.z(n3);
                        mVar2.f2117c = c0416b;
                        E().endRecording();
                        int save = a4.save();
                        a4.translate(f11, f12);
                        a4.drawRenderNode(E());
                        a4.restoreToCount(save);
                        return;
                    } catch (Throwable th) {
                        ((B.Y) c0401b2.f5649e.f2116b).r(-f10, -f4);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c0334c.a();
                    G1.m mVar3 = c0401b2.f5649e;
                    mVar3.w(j3);
                    mVar3.y(m3);
                    mVar3.v(h3);
                    mVar3.z(n3);
                    mVar3.f2117c = c0416b;
                    throw th2;
                }
        }
    }

    public C0663F(C0687m c0687m, C0664G c0664g, j0 j0Var) {
        this.f7032d = c0687m;
        this.f7033e = c0664g;
        this.f7034f = j0Var;
    }
}
