package i1;

import a0.g1;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import f1.q;
import f1.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final l f3380n = new l(0);

    /* renamed from: d, reason: collision with root package name */
    public final j1.a f3381d;

    /* renamed from: e, reason: collision with root package name */
    public final r f3382e;

    /* renamed from: f, reason: collision with root package name */
    public final h1.b f3383f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3384g;

    /* renamed from: h, reason: collision with root package name */
    public Outline f3385h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public r2.c f3386j;

    /* renamed from: k, reason: collision with root package name */
    public r2.l f3387k;

    /* renamed from: l, reason: collision with root package name */
    public p6.c f3388l;

    /* renamed from: m, reason: collision with root package name */
    public b f3389m;

    public m(j1.a aVar, r rVar, h1.b bVar) {
        super(aVar.getContext());
        this.f3381d = aVar;
        this.f3382e = rVar;
        this.f3383f = bVar;
        setOutlineProvider(f3380n);
        this.i = true;
        this.f3386j = h1.c.f3078a;
        this.f3387k = r2.l.f6529d;
        d.f3318a.getClass();
        this.f3388l = a.f3292g;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r rVar = this.f3382e;
        f1.b bVar = rVar.f2697a;
        Canvas canvas2 = bVar.f2622a;
        bVar.f2622a = canvas;
        r2.c cVar = this.f3386j;
        r2.l lVar = this.f3387k;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar2 = this.f3389m;
        p6.c cVar2 = this.f3388l;
        h1.b bVar3 = this.f3383f;
        g1 g1Var = bVar3.f3075e;
        h1.a aVar = ((h1.b) g1Var.f86d).f3074d;
        r2.c cVar3 = aVar.f3070a;
        r2.l lVar2 = aVar.f3071b;
        q m7 = g1Var.m();
        g1 g1Var2 = bVar3.f3075e;
        long u7 = g1Var2.u();
        b bVar4 = (b) g1Var2.f85c;
        g1Var2.K(cVar);
        g1Var2.L(lVar);
        g1Var2.J(bVar);
        g1Var2.M(floatToRawIntBits);
        g1Var2.f85c = bVar2;
        bVar.h();
        try {
            cVar2.i(bVar3);
            bVar.f();
            g1Var2.K(cVar3);
            g1Var2.L(lVar2);
            g1Var2.J(m7);
            g1Var2.M(u7);
            g1Var2.f85c = bVar4;
            rVar.f2697a.f2622a = canvas2;
            this.f3384g = false;
        } catch (Throwable th) {
            bVar.f();
            g1Var2.K(cVar3);
            g1Var2.L(lVar2);
            g1Var2.J(m7);
            g1Var2.M(u7);
            g1Var2.f85c = bVar4;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.i;
    }

    public final r getCanvasHolder() {
        return this.f3382e;
    }

    public final View getOwnerView() {
        return this.f3381d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.i;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f3384g) {
            return;
        }
        this.f3384g = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z3) {
        if (this.i != z3) {
            this.i = z3;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z3) {
        this.f3384g = z3;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
    }
}
