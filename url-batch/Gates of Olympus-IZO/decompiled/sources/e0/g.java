package e0;

import D1.C0014b;
import F.C0047j0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import b0.AbstractC0259J;
import b0.AbstractC0272e;
import b0.C0271d;
import b0.C0286s;
import b0.C0288u;
import b0.InterfaceC0285r;
import d0.C0321b;

/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    public final C0286s f4521b;

    /* renamed from: c, reason: collision with root package name */
    public final C0321b f4522c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f4523d;

    /* renamed from: e, reason: collision with root package name */
    public long f4524e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f4525f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4526g;

    /* renamed from: h, reason: collision with root package name */
    public float f4527h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4528i;

    /* renamed from: j, reason: collision with root package name */
    public float f4529j;

    /* renamed from: k, reason: collision with root package name */
    public float f4530k;

    /* renamed from: l, reason: collision with root package name */
    public float f4531l;

    /* renamed from: m, reason: collision with root package name */
    public float f4532m;

    /* renamed from: n, reason: collision with root package name */
    public float f4533n;

    /* renamed from: o, reason: collision with root package name */
    public long f4534o;
    public long p;

    /* renamed from: q, reason: collision with root package name */
    public float f4535q;

    /* renamed from: r, reason: collision with root package name */
    public float f4536r;

    /* renamed from: s, reason: collision with root package name */
    public float f4537s;

    /* renamed from: t, reason: collision with root package name */
    public float f4538t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4539u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4540v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4541w;

    /* renamed from: x, reason: collision with root package name */
    public int f4542x;

    public g() {
        C0286s c0286s = new C0286s();
        C0321b c0321b = new C0321b();
        this.f4521b = c0286s;
        this.f4522c = c0321b;
        RenderNode e3 = f.e();
        this.f4523d = e3;
        this.f4524e = 0L;
        e3.setClipToBounds(false);
        h(e3, 0);
        this.f4527h = 1.0f;
        this.f4528i = 3;
        this.f4529j = 1.0f;
        this.f4530k = 1.0f;
        long j3 = C0288u.f4292b;
        this.f4534o = j3;
        this.p = j3;
        this.f4538t = 8.0f;
        this.f4542x = 0;
    }

    public static void h(RenderNode renderNode, int i3) {
        if (I2.l.x(i3, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (I2.l.x(i3, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // e0.d
    public final float A() {
        return this.f4533n;
    }

    @Override // e0.d
    public final void B(Outline outline, long j3) {
        this.f4523d.setOutline(outline);
        this.f4526g = outline != null;
        f();
    }

    @Override // e0.d
    public final float C() {
        return this.f4530k;
    }

    @Override // e0.d
    public final float D() {
        return this.f4538t;
    }

    @Override // e0.d
    public final float E() {
        return this.f4537s;
    }

    @Override // e0.d
    public final int F() {
        return this.f4528i;
    }

    @Override // e0.d
    public final void G(long j3) {
        if (I2.l.F(j3)) {
            this.f4523d.resetPivot();
        } else {
            this.f4523d.setPivotX(a0.c.d(j3));
            this.f4523d.setPivotY(a0.c.e(j3));
        }
    }

    @Override // e0.d
    public final long H() {
        return this.f4534o;
    }

    @Override // e0.d
    public final float I() {
        return this.f4531l;
    }

    @Override // e0.d
    public final void J(boolean z3) {
        this.f4539u = z3;
        f();
    }

    @Override // e0.d
    public final int K() {
        return this.f4542x;
    }

    @Override // e0.d
    public final void L(M0.b bVar, M0.j jVar, C0336b c0336b, C0047j0 c0047j0) {
        RecordingCanvas beginRecording;
        C0321b c0321b = this.f4522c;
        beginRecording = this.f4523d.beginRecording();
        try {
            C0286s c0286s = this.f4521b;
            C0271d c0271d = c0286s.f4290a;
            Canvas canvas = c0271d.f4263a;
            c0271d.f4263a = beginRecording;
            C0014b c0014b = c0321b.f4444e;
            c0014b.v(bVar);
            c0014b.x(jVar);
            c0014b.f537c = c0336b;
            c0014b.y(this.f4524e);
            c0014b.u(c0271d);
            c0047j0.j(c0321b);
            c0286s.f4290a.f4263a = canvas;
        } finally {
            this.f4523d.endRecording();
        }
    }

    @Override // e0.d
    public final float M() {
        return this.f4535q;
    }

    @Override // e0.d
    public final float a() {
        return this.f4527h;
    }

    @Override // e0.d
    public final void b(float f3) {
        this.f4536r = f3;
        this.f4523d.setRotationY(f3);
    }

    @Override // e0.d
    public final void c(float f3) {
        this.f4531l = f3;
        this.f4523d.setTranslationX(f3);
    }

    @Override // e0.d
    public final void d(float f3) {
        this.f4527h = f3;
        this.f4523d.setAlpha(f3);
    }

    @Override // e0.d
    public final void e(float f3) {
        this.f4530k = f3;
        this.f4523d.setScaleY(f3);
    }

    public final void f() {
        boolean z3 = this.f4539u;
        boolean z4 = false;
        boolean z5 = z3 && !this.f4526g;
        if (z3 && this.f4526g) {
            z4 = true;
        }
        if (z5 != this.f4540v) {
            this.f4540v = z5;
            this.f4523d.setClipToBounds(z5);
        }
        if (z4 != this.f4541w) {
            this.f4541w = z4;
            this.f4523d.setClipToOutline(z4);
        }
    }

    @Override // e0.d
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            n.f4572a.a(this.f4523d, null);
        }
    }

    @Override // e0.d
    public final void i(float f3) {
        this.f4537s = f3;
        this.f4523d.setRotationZ(f3);
    }

    @Override // e0.d
    public final void j(float f3) {
        this.f4532m = f3;
        this.f4523d.setTranslationY(f3);
    }

    @Override // e0.d
    public final void k(float f3) {
        this.f4538t = f3;
        this.f4523d.setCameraDistance(f3);
    }

    @Override // e0.d
    public final boolean l() {
        boolean hasDisplayList;
        hasDisplayList = this.f4523d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // e0.d
    public final void m(float f3) {
        this.f4529j = f3;
        this.f4523d.setScaleX(f3);
    }

    @Override // e0.d
    public final void n(float f3) {
        this.f4535q = f3;
        this.f4523d.setRotationX(f3);
    }

    @Override // e0.d
    public final void o() {
        this.f4523d.discardDisplayList();
    }

    @Override // e0.d
    public final void p(int i3) {
        this.f4542x = i3;
        if (I2.l.x(i3, 1) || !AbstractC0259J.n(this.f4528i, 3)) {
            h(this.f4523d, 1);
        } else {
            h(this.f4523d, this.f4542x);
        }
    }

    @Override // e0.d
    public final void q(long j3) {
        this.p = j3;
        this.f4523d.setSpotShadowColor(AbstractC0259J.E(j3));
    }

    @Override // e0.d
    public final void r(InterfaceC0285r interfaceC0285r) {
        AbstractC0272e.a(interfaceC0285r).drawRenderNode(this.f4523d);
    }

    @Override // e0.d
    public final float s() {
        return this.f4529j;
    }

    @Override // e0.d
    public final Matrix t() {
        Matrix matrix = this.f4525f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f4525f = matrix;
        }
        this.f4523d.getMatrix(matrix);
        return matrix;
    }

    @Override // e0.d
    public final void u(float f3) {
        this.f4533n = f3;
        this.f4523d.setElevation(f3);
    }

    @Override // e0.d
    public final float v() {
        return this.f4532m;
    }

    @Override // e0.d
    public final void w(int i3, int i4, long j3) {
        this.f4523d.setPosition(i3, i4, ((int) (j3 >> 32)) + i3, ((int) (4294967295L & j3)) + i4);
        this.f4524e = I2.l.R(j3);
    }

    @Override // e0.d
    public final float x() {
        return this.f4536r;
    }

    @Override // e0.d
    public final long y() {
        return this.p;
    }

    @Override // e0.d
    public final void z(long j3) {
        this.f4534o = j3;
        this.f4523d.setAmbientShadowColor(AbstractC0259J.E(j3));
    }
}
