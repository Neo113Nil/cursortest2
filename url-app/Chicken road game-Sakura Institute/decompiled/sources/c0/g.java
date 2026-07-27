package c0;

import B1.C0097d;
import Z.AbstractC0307d;
import Z.C0306c;
import Z.C0321s;
import Z.C0323u;
import Z.K;
import Z.r;
import a.AbstractC0345a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import b0.C0494b;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g implements InterfaceC0533d {

    /* renamed from: b, reason: collision with root package name */
    public final C0321s f5772b;

    /* renamed from: c, reason: collision with root package name */
    public final C0494b f5773c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f5774d;

    /* renamed from: e, reason: collision with root package name */
    public long f5775e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f5776f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5777g;

    /* renamed from: h, reason: collision with root package name */
    public float f5778h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5779i;

    /* renamed from: j, reason: collision with root package name */
    public float f5780j;

    /* renamed from: k, reason: collision with root package name */
    public float f5781k;

    /* renamed from: l, reason: collision with root package name */
    public float f5782l;

    /* renamed from: m, reason: collision with root package name */
    public float f5783m;

    /* renamed from: n, reason: collision with root package name */
    public float f5784n;

    /* renamed from: o, reason: collision with root package name */
    public long f5785o;

    /* renamed from: p, reason: collision with root package name */
    public long f5786p;

    /* renamed from: q, reason: collision with root package name */
    public float f5787q;

    /* renamed from: r, reason: collision with root package name */
    public float f5788r;

    /* renamed from: s, reason: collision with root package name */
    public float f5789s;

    /* renamed from: t, reason: collision with root package name */
    public float f5790t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5791u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5792v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5793w;

    /* renamed from: x, reason: collision with root package name */
    public int f5794x;

    public g() {
        C0321s c0321s = new C0321s();
        C0494b c0494b = new C0494b();
        this.f5772b = c0321s;
        this.f5773c = c0494b;
        RenderNode e4 = AbstractC0535f.e();
        this.f5774d = e4;
        this.f5775e = 0L;
        e4.setClipToBounds(false);
        g(e4, 0);
        this.f5778h = 1.0f;
        this.f5779i = 3;
        this.f5780j = 1.0f;
        this.f5781k = 1.0f;
        long j4 = C0323u.f4542b;
        this.f5785o = j4;
        this.f5786p = j4;
        this.f5790t = 8.0f;
        this.f5794x = 0;
    }

    public static void g(RenderNode renderNode, int i2) {
        if (u3.l.c0(i2, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (u3.l.c0(i2, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // c0.InterfaceC0533d
    public final void A(int i2, int i4, long j4) {
        this.f5774d.setPosition(i2, i4, ((int) (j4 >> 32)) + i2, ((int) (4294967295L & j4)) + i4);
        this.f5775e = u3.d.U(j4);
    }

    @Override // c0.InterfaceC0533d
    public final float B() {
        return this.f5788r;
    }

    @Override // c0.InterfaceC0533d
    public final void C(M0.b bVar, M0.k kVar, C0531b c0531b, Function1 function1) {
        RecordingCanvas beginRecording;
        C0494b c0494b = this.f5773c;
        beginRecording = this.f5774d.beginRecording();
        try {
            C0321s c0321s = this.f5772b;
            C0306c c0306c = c0321s.f4540a;
            Canvas canvas = c0306c.f4515a;
            c0306c.f4515a = beginRecording;
            C0097d c0097d = c0494b.f5603e;
            c0097d.D(bVar);
            c0097d.F(kVar);
            c0097d.f988i = c0531b;
            c0097d.G(this.f5775e);
            c0097d.C(c0306c);
            function1.invoke(c0494b);
            c0321s.f4540a.f4515a = canvas;
        } finally {
            this.f5774d.endRecording();
        }
    }

    @Override // c0.InterfaceC0533d
    public final long D() {
        return this.f5786p;
    }

    @Override // c0.InterfaceC0533d
    public final void E(long j4) {
        this.f5785o = j4;
        this.f5774d.setAmbientShadowColor(K.D(j4));
    }

    @Override // c0.InterfaceC0533d
    public final float F() {
        return this.f5784n;
    }

    @Override // c0.InterfaceC0533d
    public final float G() {
        return this.f5781k;
    }

    @Override // c0.InterfaceC0533d
    public final float H() {
        return this.f5790t;
    }

    @Override // c0.InterfaceC0533d
    public final float I() {
        return this.f5789s;
    }

    @Override // c0.InterfaceC0533d
    public final int J() {
        return this.f5779i;
    }

    @Override // c0.InterfaceC0533d
    public final void K(long j4) {
        if (AbstractC0345a.A(j4)) {
            this.f5774d.resetPivot();
        } else {
            this.f5774d.setPivotX(Y.c.d(j4));
            this.f5774d.setPivotY(Y.c.e(j4));
        }
    }

    @Override // c0.InterfaceC0533d
    public final long L() {
        return this.f5785o;
    }

    @Override // c0.InterfaceC0533d
    public final float M() {
        return this.f5782l;
    }

    @Override // c0.InterfaceC0533d
    public final void N(boolean z4) {
        this.f5791u = z4;
        f();
    }

    @Override // c0.InterfaceC0533d
    public final int O() {
        return this.f5794x;
    }

    @Override // c0.InterfaceC0533d
    public final float P() {
        return this.f5787q;
    }

    @Override // c0.InterfaceC0533d
    public final float a() {
        return this.f5778h;
    }

    @Override // c0.InterfaceC0533d
    public final void b(float f4) {
        this.f5788r = f4;
        this.f5774d.setRotationY(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void c(float f4) {
        this.f5782l = f4;
        this.f5774d.setTranslationX(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void d(float f4) {
        this.f5778h = f4;
        this.f5774d.setAlpha(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void e(float f4) {
        this.f5781k = f4;
        this.f5774d.setScaleY(f4);
    }

    public final void f() {
        boolean z4 = this.f5791u;
        boolean z5 = false;
        boolean z6 = z4 && !this.f5777g;
        if (z4 && this.f5777g) {
            z5 = true;
        }
        if (z6 != this.f5792v) {
            this.f5792v = z6;
            this.f5774d.setClipToBounds(z6);
        }
        if (z5 != this.f5793w) {
            this.f5793w = z5;
            this.f5774d.setClipToOutline(z5);
        }
    }

    @Override // c0.InterfaceC0533d
    public final void h() {
        if (Build.VERSION.SDK_INT >= 31) {
            m.f5824a.a(this.f5774d, null);
        }
    }

    @Override // c0.InterfaceC0533d
    public final void k(float f4) {
        this.f5789s = f4;
        this.f5774d.setRotationZ(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void l(float f4) {
        this.f5783m = f4;
        this.f5774d.setTranslationY(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void m(float f4) {
        this.f5790t = f4;
        this.f5774d.setCameraDistance(f4);
    }

    @Override // c0.InterfaceC0533d
    public final boolean n() {
        boolean hasDisplayList;
        hasDisplayList = this.f5774d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // c0.InterfaceC0533d
    public final void o(Outline outline) {
        this.f5774d.setOutline(outline);
        this.f5777g = outline != null;
        f();
    }

    @Override // c0.InterfaceC0533d
    public final void p(float f4) {
        this.f5780j = f4;
        this.f5774d.setScaleX(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void q(float f4) {
        this.f5787q = f4;
        this.f5774d.setRotationX(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void r() {
        this.f5774d.discardDisplayList();
    }

    @Override // c0.InterfaceC0533d
    public final void s(int i2) {
        this.f5794x = i2;
        if (u3.l.c0(i2, 1) || !K.o(this.f5779i, 3)) {
            g(this.f5774d, 1);
        } else {
            g(this.f5774d, this.f5794x);
        }
    }

    @Override // c0.InterfaceC0533d
    public final void t(long j4) {
        this.f5786p = j4;
        this.f5774d.setSpotShadowColor(K.D(j4));
    }

    @Override // c0.InterfaceC0533d
    public final boolean u() {
        return this.f5791u;
    }

    @Override // c0.InterfaceC0533d
    public final float v() {
        return this.f5780j;
    }

    @Override // c0.InterfaceC0533d
    public final Matrix w() {
        Matrix matrix = this.f5776f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f5776f = matrix;
        }
        this.f5774d.getMatrix(matrix);
        return matrix;
    }

    @Override // c0.InterfaceC0533d
    public final void x(float f4) {
        this.f5784n = f4;
        this.f5774d.setElevation(f4);
    }

    @Override // c0.InterfaceC0533d
    public final float y() {
        return this.f5783m;
    }

    @Override // c0.InterfaceC0533d
    public final void z(r rVar) {
        AbstractC0307d.a(rVar).drawRenderNode(this.f5774d);
    }
}
