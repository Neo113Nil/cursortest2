package n1;

import a1.n;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import b3.p;
import k1.o;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends View {

    /* renamed from: y, reason: collision with root package name */
    public static final p f6978y = new p(2);

    /* renamed from: d, reason: collision with root package name */
    public final o1.a f6979d;

    /* renamed from: e, reason: collision with root package name */
    public final o f6980e;

    /* renamed from: i, reason: collision with root package name */
    public final m1.b f6981i;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6982r;

    /* renamed from: s, reason: collision with root package name */
    public Outline f6983s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6984t;

    /* renamed from: u, reason: collision with root package name */
    public x2.c f6985u;

    /* renamed from: v, reason: collision with root package name */
    public x2.l f6986v;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f6987w;

    /* renamed from: x, reason: collision with root package name */
    public b f6988x;

    public l(o1.a aVar, o oVar, m1.b bVar) {
        super(aVar.getContext());
        this.f6979d = aVar;
        this.f6980e = oVar;
        this.f6981i = bVar;
        setOutlineProvider(f6978y);
        this.f6984t = true;
        this.f6985u = m1.c.f6409a;
        this.f6986v = x2.l.f10330d;
        d.f6923a.getClass();
        this.f6987w = a.f6898i;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o oVar = this.f6980e;
        k1.b bVar = oVar.f5335a;
        Canvas canvas2 = bVar.f5296a;
        bVar.f5296a = canvas;
        x2.c cVar = this.f6985u;
        x2.l lVar = this.f6986v;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar2 = this.f6988x;
        Function1 function1 = this.f6987w;
        m1.b bVar3 = this.f6981i;
        n nVar = bVar3.f6406e;
        m1.a aVar = ((m1.b) nVar.f42r).f6405d;
        x2.c cVar2 = aVar.f6401a;
        x2.l lVar2 = aVar.f6402b;
        k1.n p4 = nVar.p();
        n nVar2 = bVar3.f6406e;
        long u2 = nVar2.u();
        b bVar4 = (b) nVar2.f40e;
        nVar2.I(cVar);
        nVar2.J(lVar);
        nVar2.H(bVar);
        nVar2.K(floatToRawIntBits);
        nVar2.f40e = bVar2;
        bVar.h();
        try {
            function1.invoke(bVar3);
            bVar.f();
            nVar2.I(cVar2);
            nVar2.J(lVar2);
            nVar2.H(p4);
            nVar2.K(u2);
            nVar2.f40e = bVar4;
            oVar.f5335a.f5296a = canvas2;
            this.f6982r = false;
        } catch (Throwable th) {
            bVar.f();
            nVar2.I(cVar2);
            nVar2.J(lVar2);
            nVar2.H(p4);
            nVar2.K(u2);
            nVar2.f40e = bVar4;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f6984t;
    }

    public final o getCanvasHolder() {
        return this.f6980e;
    }

    public final View getOwnerView() {
        return this.f6979d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f6984t;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f6982r) {
            return;
        }
        this.f6982r = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z10) {
        if (this.f6984t != z10) {
            this.f6984t = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f6982r = z10;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
    }
}
