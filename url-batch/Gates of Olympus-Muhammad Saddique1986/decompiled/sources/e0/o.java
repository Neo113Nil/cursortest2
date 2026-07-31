package e0;

import R0.w;
import a.AbstractC0235a;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import b0.C0334c;
import b0.C0349s;
import b0.r;
import d0.AbstractC0402c;
import d0.C0401b;
import f0.AbstractC0431a;

/* loaded from: classes.dex */
public final class o extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final w f5799n = new w(2);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0431a f5800d;

    /* renamed from: e, reason: collision with root package name */
    public final C0349s f5801e;

    /* renamed from: f, reason: collision with root package name */
    public final C0401b f5802f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5803g;

    /* renamed from: h, reason: collision with root package name */
    public Outline f5804h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5805i;

    /* renamed from: j, reason: collision with root package name */
    public O0.b f5806j;

    /* renamed from: k, reason: collision with root package name */
    public O0.k f5807k;

    /* renamed from: l, reason: collision with root package name */
    public f2.k f5808l;

    /* renamed from: m, reason: collision with root package name */
    public C0416b f5809m;

    public o(AbstractC0431a abstractC0431a, C0349s c0349s, C0401b c0401b) {
        super(abstractC0431a.getContext());
        this.f5800d = abstractC0431a;
        this.f5801e = c0349s;
        this.f5802f = c0401b;
        setOutlineProvider(f5799n);
        this.f5805i = true;
        this.f5806j = AbstractC0402c.f5652a;
        this.f5807k = O0.k.f3741d;
        InterfaceC0418d.f5718a.getClass();
        this.f5808l = C0415a.f5692g;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [e2.c, f2.k] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0349s c0349s = this.f5801e;
        C0334c c0334c = c0349s.f5432a;
        Canvas canvas2 = c0334c.f5405a;
        c0334c.f5405a = canvas;
        O0.b bVar = this.f5806j;
        O0.k kVar = this.f5807k;
        long e3 = AbstractC0235a.e(getWidth(), getHeight());
        C0416b c0416b = this.f5809m;
        ?? r9 = this.f5808l;
        C0401b c0401b = this.f5802f;
        O0.b j3 = c0401b.f5649e.j();
        G1.m mVar = c0401b.f5649e;
        O0.k m3 = mVar.m();
        r h3 = mVar.h();
        long n3 = mVar.n();
        C0416b c0416b2 = (C0416b) mVar.f2117c;
        mVar.w(bVar);
        mVar.y(kVar);
        mVar.v(c0334c);
        mVar.z(e3);
        mVar.f2117c = c0416b;
        c0334c.f();
        try {
            r9.n(c0401b);
            c0334c.a();
            mVar.w(j3);
            mVar.y(m3);
            mVar.v(h3);
            mVar.z(n3);
            mVar.f2117c = c0416b2;
            c0349s.f5432a.f5405a = canvas2;
            this.f5803g = false;
        } catch (Throwable th) {
            c0334c.a();
            mVar.w(j3);
            mVar.y(m3);
            mVar.v(h3);
            mVar.z(n3);
            mVar.f2117c = c0416b2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f5805i;
    }

    public final C0349s getCanvasHolder() {
        return this.f5801e;
    }

    public final View getOwnerView() {
        return this.f5800d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f5805i;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f5803g) {
            return;
        }
        this.f5803g = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z3) {
        if (this.f5805i != z3) {
            this.f5805i = z3;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z3) {
        this.f5803g = z3;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }
}
