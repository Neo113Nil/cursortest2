package c1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import z0.r;
import z0.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: p, reason: collision with root package name */
    public static final o f1618p = new o(0);

    /* renamed from: f, reason: collision with root package name */
    public final d1.a f1619f;

    /* renamed from: g, reason: collision with root package name */
    public final s f1620g;

    /* renamed from: h, reason: collision with root package name */
    public final b1.c f1621h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1622i;

    /* renamed from: j, reason: collision with root package name */
    public Outline f1623j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1624k;

    /* renamed from: l, reason: collision with root package name */
    public m2.b f1625l;

    /* renamed from: m, reason: collision with root package name */
    public m2.k f1626m;

    /* renamed from: n, reason: collision with root package name */
    public r6.l f1627n;

    /* renamed from: o, reason: collision with root package name */
    public c f1628o;

    public p(d1.a aVar, s sVar, b1.c cVar) {
        super(aVar.getContext());
        this.f1619f = aVar;
        this.f1620g = sVar;
        this.f1621h = cVar;
        setOutlineProvider(f1618p);
        this.f1624k = true;
        this.f1625l = b1.d.f1237a;
        this.f1626m = m2.k.f6322f;
        e.f1552a.getClass();
        this.f1627n = b.f1526i;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [q6.c, r6.l] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s sVar = this.f1620g;
        z0.d dVar = sVar.f10046a;
        Canvas canvas2 = dVar.f9984a;
        dVar.f9984a = canvas;
        m2.b bVar = this.f1625l;
        m2.k kVar = this.f1626m;
        long a3 = v0.d.a(getWidth(), getHeight());
        c cVar = this.f1628o;
        ?? r9 = this.f1627n;
        b1.c cVar2 = this.f1621h;
        b1.b bVar2 = cVar2.f1234g;
        b1.a aVar = ((b1.c) bVar2.f1232i).f1233f;
        m2.b bVar3 = aVar.f1225a;
        m2.k kVar2 = aVar.f1226b;
        r k8 = bVar2.k();
        b1.b bVar4 = cVar2.f1234g;
        long p6 = bVar4.p();
        c cVar3 = (c) bVar4.f1231h;
        bVar4.A(bVar);
        bVar4.B(kVar);
        bVar4.z(dVar);
        bVar4.C(a3);
        bVar4.f1231h = cVar;
        dVar.o();
        try {
            r9.f(cVar2);
            dVar.n();
            bVar4.A(bVar3);
            bVar4.B(kVar2);
            bVar4.z(k8);
            bVar4.C(p6);
            bVar4.f1231h = cVar3;
            sVar.f10046a.f9984a = canvas2;
            this.f1622i = false;
        } catch (Throwable th) {
            dVar.n();
            bVar4.A(bVar3);
            bVar4.B(kVar2);
            bVar4.z(k8);
            bVar4.C(p6);
            bVar4.f1231h = cVar3;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f1624k;
    }

    public final s getCanvasHolder() {
        return this.f1620g;
    }

    public final View getOwnerView() {
        return this.f1619f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f1624k;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f1622i) {
            return;
        }
        this.f1622i = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z8) {
        if (this.f1624k != z8) {
            this.f1624k = z8;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z8) {
        this.f1622i = z8;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i7, int i8, int i9, int i10) {
    }
}
