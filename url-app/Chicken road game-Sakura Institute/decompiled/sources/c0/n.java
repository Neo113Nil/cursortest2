package c0;

import B1.C0097d;
import P0.x;
import Z.C0306c;
import Z.C0321s;
import Z.r;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import b0.AbstractC0495c;
import b0.C0494b;
import d0.AbstractC0541a;

/* loaded from: classes.dex */
public final class n extends View {

    /* renamed from: q, reason: collision with root package name */
    public static final x f5825q = new x(2);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0541a f5826d;

    /* renamed from: e, reason: collision with root package name */
    public final C0321s f5827e;

    /* renamed from: i, reason: collision with root package name */
    public final C0494b f5828i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5829j;

    /* renamed from: k, reason: collision with root package name */
    public Outline f5830k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5831l;

    /* renamed from: m, reason: collision with root package name */
    public M0.b f5832m;

    /* renamed from: n, reason: collision with root package name */
    public M0.k f5833n;

    /* renamed from: o, reason: collision with root package name */
    public M2.p f5834o;

    /* renamed from: p, reason: collision with root package name */
    public C0531b f5835p;

    public n(AbstractC0541a abstractC0541a, C0321s c0321s, C0494b c0494b) {
        super(abstractC0541a.getContext());
        this.f5826d = abstractC0541a;
        this.f5827e = c0321s;
        this.f5828i = c0494b;
        setOutlineProvider(f5825q);
        this.f5831l = true;
        this.f5832m = AbstractC0495c.f5606a;
        this.f5833n = M0.k.f3555d;
        InterfaceC0533d.f5746a.getClass();
        this.f5834o = C0530a.f5723i;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0321s c0321s = this.f5827e;
        C0306c c0306c = c0321s.f4540a;
        Canvas canvas2 = c0306c.f4515a;
        c0306c.f4515a = canvas;
        M0.b bVar = this.f5832m;
        M0.k kVar = this.f5833n;
        long N3 = u3.l.N(getWidth(), getHeight());
        C0531b c0531b = this.f5835p;
        ?? r9 = this.f5834o;
        C0494b c0494b = this.f5828i;
        M0.b m4 = c0494b.f5603e.m();
        C0097d c0097d = c0494b.f5603e;
        M0.k q2 = c0097d.q();
        r k4 = c0097d.k();
        long s4 = c0097d.s();
        C0531b c0531b2 = (C0531b) c0097d.f988i;
        c0097d.D(bVar);
        c0097d.F(kVar);
        c0097d.C(c0306c);
        c0097d.G(N3);
        c0097d.f988i = c0531b;
        c0306c.g();
        try {
            r9.invoke(c0494b);
            c0306c.b();
            c0097d.D(m4);
            c0097d.F(q2);
            c0097d.C(k4);
            c0097d.G(s4);
            c0097d.f988i = c0531b2;
            c0321s.f4540a.f4515a = canvas2;
            this.f5829j = false;
        } catch (Throwable th) {
            c0306c.b();
            c0097d.D(m4);
            c0097d.F(q2);
            c0097d.C(k4);
            c0097d.G(s4);
            c0097d.f988i = c0531b2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f5831l;
    }

    public final C0321s getCanvasHolder() {
        return this.f5827e;
    }

    public final View getOwnerView() {
        return this.f5826d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f5831l;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f5829j) {
            return;
        }
        this.f5829j = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i2, int i4, int i5, int i6) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z4) {
        if (this.f5831l != z4) {
            this.f5831l = z4;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z4) {
        this.f5829j = z4;
    }
}
