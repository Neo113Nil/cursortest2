package e0;

import a0.C0238c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import b0.AbstractC0335d;
import b0.C0334c;
import b0.C0349s;
import b0.C0352v;
import b0.M;
import b0.r;
import d0.C0401b;
import h2.AbstractC0508a;

/* loaded from: classes.dex */
public final class g implements InterfaceC0418d {

    /* renamed from: b, reason: collision with root package name */
    public final C0349s f5745b;

    /* renamed from: c, reason: collision with root package name */
    public final C0401b f5746c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f5747d;

    /* renamed from: e, reason: collision with root package name */
    public long f5748e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f5749f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5750g;

    /* renamed from: h, reason: collision with root package name */
    public float f5751h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5752i;

    /* renamed from: j, reason: collision with root package name */
    public float f5753j;

    /* renamed from: k, reason: collision with root package name */
    public float f5754k;

    /* renamed from: l, reason: collision with root package name */
    public float f5755l;

    /* renamed from: m, reason: collision with root package name */
    public float f5756m;

    /* renamed from: n, reason: collision with root package name */
    public float f5757n;

    /* renamed from: o, reason: collision with root package name */
    public long f5758o;

    /* renamed from: p, reason: collision with root package name */
    public long f5759p;

    /* renamed from: q, reason: collision with root package name */
    public float f5760q;

    /* renamed from: r, reason: collision with root package name */
    public float f5761r;

    /* renamed from: s, reason: collision with root package name */
    public float f5762s;

    /* renamed from: t, reason: collision with root package name */
    public float f5763t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5764u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5765v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5766w;

    /* renamed from: x, reason: collision with root package name */
    public int f5767x;

    public g() {
        C0349s c0349s = new C0349s();
        C0401b c0401b = new C0401b();
        this.f5745b = c0349s;
        this.f5746c = c0401b;
        RenderNode e3 = AbstractC0420f.e();
        this.f5747d = e3;
        this.f5748e = 0L;
        e3.setClipToBounds(false);
        h(e3, 0);
        this.f5751h = 1.0f;
        this.f5752i = 3;
        this.f5753j = 1.0f;
        this.f5754k = 1.0f;
        long j3 = C0352v.f5434b;
        this.f5758o = j3;
        this.f5759p = j3;
        this.f5763t = 8.0f;
        this.f5767x = 0;
    }

    public static void h(RenderNode renderNode, int i3) {
        if (AbstractC0508a.x(i3, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC0508a.x(i3, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // e0.InterfaceC0418d
    public final float A() {
        return this.f5757n;
    }

    @Override // e0.InterfaceC0418d
    public final void B(Outline outline, long j3) {
        this.f5747d.setOutline(outline);
        this.f5750g = outline != null;
        f();
    }

    @Override // e0.InterfaceC0418d
    public final void C(O0.b bVar, O0.k kVar, C0416b c0416b, A0.l lVar) {
        RecordingCanvas beginRecording;
        C0401b c0401b = this.f5746c;
        beginRecording = this.f5747d.beginRecording();
        try {
            C0349s c0349s = this.f5745b;
            C0334c c0334c = c0349s.f5432a;
            Canvas canvas = c0334c.f5405a;
            c0334c.f5405a = beginRecording;
            G1.m mVar = c0401b.f5649e;
            mVar.w(bVar);
            mVar.y(kVar);
            mVar.f2117c = c0416b;
            mVar.z(this.f5748e);
            mVar.v(c0334c);
            lVar.n(c0401b);
            c0349s.f5432a.f5405a = canvas;
        } finally {
            this.f5747d.endRecording();
        }
    }

    @Override // e0.InterfaceC0418d
    public final float D() {
        return this.f5754k;
    }

    @Override // e0.InterfaceC0418d
    public final float E() {
        return this.f5763t;
    }

    @Override // e0.InterfaceC0418d
    public final float F() {
        return this.f5762s;
    }

    @Override // e0.InterfaceC0418d
    public final int G() {
        return this.f5752i;
    }

    @Override // e0.InterfaceC0418d
    public final void H(long j3) {
        if (l0.c.E(j3)) {
            this.f5747d.resetPivot();
        } else {
            this.f5747d.setPivotX(C0238c.d(j3));
            this.f5747d.setPivotY(C0238c.e(j3));
        }
    }

    @Override // e0.InterfaceC0418d
    public final long I() {
        return this.f5758o;
    }

    @Override // e0.InterfaceC0418d
    public final float J() {
        return this.f5755l;
    }

    @Override // e0.InterfaceC0418d
    public final void K(boolean z3) {
        this.f5764u = z3;
        f();
    }

    @Override // e0.InterfaceC0418d
    public final int L() {
        return this.f5767x;
    }

    @Override // e0.InterfaceC0418d
    public final float M() {
        return this.f5760q;
    }

    @Override // e0.InterfaceC0418d
    public final float a() {
        return this.f5751h;
    }

    @Override // e0.InterfaceC0418d
    public final void b(float f3) {
        this.f5761r = f3;
        this.f5747d.setRotationY(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void c(float f3) {
        this.f5755l = f3;
        this.f5747d.setTranslationX(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void d(float f3) {
        this.f5751h = f3;
        this.f5747d.setAlpha(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void e(float f3) {
        this.f5754k = f3;
        this.f5747d.setScaleY(f3);
    }

    public final void f() {
        boolean z3 = this.f5764u;
        boolean z4 = false;
        boolean z5 = z3 && !this.f5750g;
        if (z3 && this.f5750g) {
            z4 = true;
        }
        if (z5 != this.f5765v) {
            this.f5765v = z5;
            this.f5747d.setClipToBounds(z5);
        }
        if (z4 != this.f5766w) {
            this.f5766w = z4;
            this.f5747d.setClipToOutline(z4);
        }
    }

    @Override // e0.InterfaceC0418d
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            n.f5798a.a(this.f5747d, null);
        }
    }

    @Override // e0.InterfaceC0418d
    public final void i(float f3) {
        this.f5762s = f3;
        this.f5747d.setRotationZ(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void j(float f3) {
        this.f5756m = f3;
        this.f5747d.setTranslationY(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void k(float f3) {
        this.f5763t = f3;
        this.f5747d.setCameraDistance(f3);
    }

    @Override // e0.InterfaceC0418d
    public final boolean l() {
        boolean hasDisplayList;
        hasDisplayList = this.f5747d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // e0.InterfaceC0418d
    public final void m(float f3) {
        this.f5753j = f3;
        this.f5747d.setScaleX(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void n(float f3) {
        this.f5760q = f3;
        this.f5747d.setRotationX(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void o() {
        this.f5747d.discardDisplayList();
    }

    @Override // e0.InterfaceC0418d
    public final void p(int i3) {
        this.f5767x = i3;
        if (AbstractC0508a.x(i3, 1) || !M.p(this.f5752i, 3)) {
            h(this.f5747d, 1);
        } else {
            h(this.f5747d, this.f5767x);
        }
    }

    @Override // e0.InterfaceC0418d
    public final void q(long j3) {
        this.f5759p = j3;
        this.f5747d.setSpotShadowColor(M.D(j3));
    }

    @Override // e0.InterfaceC0418d
    public final void r(r rVar) {
        AbstractC0335d.a(rVar).drawRenderNode(this.f5747d);
    }

    @Override // e0.InterfaceC0418d
    public final float s() {
        return this.f5753j;
    }

    @Override // e0.InterfaceC0418d
    public final Matrix t() {
        Matrix matrix = this.f5749f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f5749f = matrix;
        }
        this.f5747d.getMatrix(matrix);
        return matrix;
    }

    @Override // e0.InterfaceC0418d
    public final void u(float f3) {
        this.f5757n = f3;
        this.f5747d.setElevation(f3);
    }

    @Override // e0.InterfaceC0418d
    public final float v() {
        return this.f5756m;
    }

    @Override // e0.InterfaceC0418d
    public final void w(int i3, int i4, long j3) {
        this.f5747d.setPosition(i3, i4, ((int) (j3 >> 32)) + i3, ((int) (4294967295L & j3)) + i4);
        this.f5748e = O2.d.f0(j3);
    }

    @Override // e0.InterfaceC0418d
    public final float x() {
        return this.f5761r;
    }

    @Override // e0.InterfaceC0418d
    public final long y() {
        return this.f5759p;
    }

    @Override // e0.InterfaceC0418d
    public final void z(long j3) {
        this.f5758o = j3;
        this.f5747d.setAmbientShadowColor(M.D(j3));
    }
}
