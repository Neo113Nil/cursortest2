package e0;

import D1.C0014b;
import P0.p;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import b0.C0271d;
import b0.C0286s;
import b0.InterfaceC0285r;
import d0.AbstractC0322c;
import d0.C0321b;
import f0.AbstractC0384a;

/* loaded from: classes.dex */
public final class o extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final p f4573n = new p(1);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0384a f4574d;

    /* renamed from: e, reason: collision with root package name */
    public final C0286s f4575e;

    /* renamed from: f, reason: collision with root package name */
    public final C0321b f4576f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4577g;

    /* renamed from: h, reason: collision with root package name */
    public Outline f4578h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4579i;

    /* renamed from: j, reason: collision with root package name */
    public M0.b f4580j;

    /* renamed from: k, reason: collision with root package name */
    public M0.j f4581k;

    /* renamed from: l, reason: collision with root package name */
    public Z1.j f4582l;

    /* renamed from: m, reason: collision with root package name */
    public C0336b f4583m;

    public o(AbstractC0384a abstractC0384a, C0286s c0286s, C0321b c0321b) {
        super(abstractC0384a.getContext());
        this.f4574d = abstractC0384a;
        this.f4575e = c0286s;
        this.f4576f = c0321b;
        setOutlineProvider(f4573n);
        this.f4579i = true;
        this.f4580j = AbstractC0322c.f4447a;
        this.f4581k = M0.j.f2775d;
        d.f4495a.getClass();
        this.f4582l = C0335a.f4470g;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [Y1.c, Z1.j] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0286s c0286s = this.f4575e;
        C0271d c0271d = c0286s.f4290a;
        Canvas canvas2 = c0271d.f4263a;
        c0271d.f4263a = canvas;
        M0.b bVar = this.f4580j;
        M0.j jVar = this.f4581k;
        long h3 = I2.d.h(getWidth(), getHeight());
        C0336b c0336b = this.f4583m;
        ?? r9 = this.f4582l;
        C0321b c0321b = this.f4576f;
        M0.b j3 = c0321b.f4444e.j();
        C0014b c0014b = c0321b.f4444e;
        M0.j l3 = c0014b.l();
        InterfaceC0285r h4 = c0014b.h();
        long m3 = c0014b.m();
        C0336b c0336b2 = (C0336b) c0014b.f537c;
        c0014b.v(bVar);
        c0014b.x(jVar);
        c0014b.u(c0271d);
        c0014b.y(h3);
        c0014b.f537c = c0336b;
        c0271d.f();
        try {
            r9.j(c0321b);
            c0271d.a();
            c0014b.v(j3);
            c0014b.x(l3);
            c0014b.u(h4);
            c0014b.y(m3);
            c0014b.f537c = c0336b2;
            c0286s.f4290a.f4263a = canvas2;
            this.f4577g = false;
        } catch (Throwable th) {
            c0271d.a();
            c0014b.v(j3);
            c0014b.x(l3);
            c0014b.u(h4);
            c0014b.y(m3);
            c0014b.f537c = c0336b2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f4579i;
    }

    public final C0286s getCanvasHolder() {
        return this.f4575e;
    }

    public final View getOwnerView() {
        return this.f4574d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f4579i;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f4577g) {
            return;
        }
        this.f4577g = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z3) {
        if (this.f4579i != z3) {
            this.f4579i = z3;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z3) {
        this.f4577g = z3;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }
}
