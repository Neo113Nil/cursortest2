package c0;

import Z.AbstractC0307d;
import Z.C0306c;
import Z.C0321s;
import Z.C0323u;
import Z.K;
import Z.r;
import a.AbstractC0345a;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import b0.C0494b;
import d0.AbstractC0541a;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i implements InterfaceC0533d {

    /* renamed from: A, reason: collision with root package name */
    public static final h f5795A = new h();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0541a f5796b;

    /* renamed from: c, reason: collision with root package name */
    public final C0321s f5797c;

    /* renamed from: d, reason: collision with root package name */
    public final n f5798d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f5799e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f5800f;

    /* renamed from: g, reason: collision with root package name */
    public int f5801g;

    /* renamed from: h, reason: collision with root package name */
    public int f5802h;

    /* renamed from: i, reason: collision with root package name */
    public long f5803i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5804j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5805k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5806l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5807m;

    /* renamed from: n, reason: collision with root package name */
    public int f5808n;

    /* renamed from: o, reason: collision with root package name */
    public float f5809o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5810p;

    /* renamed from: q, reason: collision with root package name */
    public float f5811q;

    /* renamed from: r, reason: collision with root package name */
    public float f5812r;

    /* renamed from: s, reason: collision with root package name */
    public float f5813s;

    /* renamed from: t, reason: collision with root package name */
    public float f5814t;

    /* renamed from: u, reason: collision with root package name */
    public float f5815u;

    /* renamed from: v, reason: collision with root package name */
    public long f5816v;

    /* renamed from: w, reason: collision with root package name */
    public long f5817w;

    /* renamed from: x, reason: collision with root package name */
    public float f5818x;

    /* renamed from: y, reason: collision with root package name */
    public float f5819y;

    /* renamed from: z, reason: collision with root package name */
    public float f5820z;

    public i(AbstractC0541a abstractC0541a) {
        C0321s c0321s = new C0321s();
        C0494b c0494b = new C0494b();
        this.f5796b = abstractC0541a;
        this.f5797c = c0321s;
        n nVar = new n(abstractC0541a, c0321s, c0494b);
        this.f5798d = nVar;
        this.f5799e = abstractC0541a.getResources();
        this.f5800f = new Rect();
        abstractC0541a.addView(nVar);
        nVar.setClipBounds(null);
        this.f5803i = 0L;
        View.generateViewId();
        this.f5807m = 3;
        this.f5808n = 0;
        this.f5809o = 1.0f;
        this.f5811q = 1.0f;
        this.f5812r = 1.0f;
        long j4 = C0323u.f4542b;
        this.f5816v = j4;
        this.f5817w = j4;
    }

    @Override // c0.InterfaceC0533d
    public final void A(int i2, int i4, long j4) {
        boolean a4 = M0.j.a(this.f5803i, j4);
        n nVar = this.f5798d;
        if (a4) {
            int i5 = this.f5801g;
            if (i5 != i2) {
                nVar.offsetLeftAndRight(i2 - i5);
            }
            int i6 = this.f5802h;
            if (i6 != i4) {
                nVar.offsetTopAndBottom(i4 - i6);
            }
        } else {
            if (u()) {
                this.f5804j = true;
            }
            int i7 = (int) (j4 >> 32);
            int i8 = (int) (4294967295L & j4);
            nVar.layout(i2, i4, i2 + i7, i4 + i8);
            this.f5803i = j4;
            if (this.f5810p) {
                nVar.setPivotX(i7 / 2.0f);
                nVar.setPivotY(i8 / 2.0f);
            }
        }
        this.f5801g = i2;
        this.f5802h = i4;
    }

    @Override // c0.InterfaceC0533d
    public final float B() {
        return this.f5819y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c0.InterfaceC0533d
    public final void C(M0.b bVar, M0.k kVar, C0531b c0531b, Function1 function1) {
        n nVar = this.f5798d;
        ViewParent parent = nVar.getParent();
        AbstractC0541a abstractC0541a = this.f5796b;
        if (parent == null) {
            abstractC0541a.addView(nVar);
        }
        nVar.f5832m = bVar;
        nVar.f5833n = kVar;
        nVar.f5834o = (M2.p) function1;
        nVar.f5835p = c0531b;
        if (nVar.isAttachedToWindow()) {
            nVar.setVisibility(4);
            nVar.setVisibility(0);
            try {
                C0321s c0321s = this.f5797c;
                h hVar = f5795A;
                C0306c c0306c = c0321s.f4540a;
                Canvas canvas = c0306c.f4515a;
                c0306c.f4515a = hVar;
                abstractC0541a.a(c0306c, nVar, nVar.getDrawingTime());
                c0321s.f4540a.f4515a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // c0.InterfaceC0533d
    public final long D() {
        return this.f5817w;
    }

    @Override // c0.InterfaceC0533d
    public final void E(long j4) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5816v = j4;
            o.f5836a.b(this.f5798d, K.D(j4));
        }
    }

    @Override // c0.InterfaceC0533d
    public final float F() {
        return this.f5815u;
    }

    @Override // c0.InterfaceC0533d
    public final float G() {
        return this.f5812r;
    }

    @Override // c0.InterfaceC0533d
    public final float H() {
        return this.f5798d.getCameraDistance() / this.f5799e.getDisplayMetrics().densityDpi;
    }

    @Override // c0.InterfaceC0533d
    public final float I() {
        return this.f5820z;
    }

    @Override // c0.InterfaceC0533d
    public final int J() {
        return this.f5807m;
    }

    @Override // c0.InterfaceC0533d
    public final void K(long j4) {
        boolean A4 = AbstractC0345a.A(j4);
        n nVar = this.f5798d;
        if (!A4) {
            this.f5810p = false;
            nVar.setPivotX(Y.c.d(j4));
            nVar.setPivotY(Y.c.e(j4));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                o.f5836a.a(nVar);
                return;
            }
            this.f5810p = true;
            nVar.setPivotX(((int) (this.f5803i >> 32)) / 2.0f);
            nVar.setPivotY(((int) (this.f5803i & 4294967295L)) / 2.0f);
        }
    }

    @Override // c0.InterfaceC0533d
    public final long L() {
        return this.f5816v;
    }

    @Override // c0.InterfaceC0533d
    public final float M() {
        return this.f5813s;
    }

    @Override // c0.InterfaceC0533d
    public final void N(boolean z4) {
        boolean z5 = false;
        this.f5806l = z4 && !this.f5805k;
        this.f5804j = true;
        if (z4 && this.f5805k) {
            z5 = true;
        }
        this.f5798d.setClipToOutline(z5);
    }

    @Override // c0.InterfaceC0533d
    public final int O() {
        return this.f5808n;
    }

    @Override // c0.InterfaceC0533d
    public final float P() {
        return this.f5818x;
    }

    @Override // c0.InterfaceC0533d
    public final float a() {
        return this.f5809o;
    }

    @Override // c0.InterfaceC0533d
    public final void b(float f4) {
        this.f5819y = f4;
        this.f5798d.setRotationY(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void c(float f4) {
        this.f5813s = f4;
        this.f5798d.setTranslationX(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void d(float f4) {
        this.f5809o = f4;
        this.f5798d.setAlpha(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void e(float f4) {
        this.f5812r = f4;
        this.f5798d.setScaleY(f4);
    }

    public final void f(int i2) {
        boolean z4 = true;
        boolean c02 = u3.l.c0(i2, 1);
        n nVar = this.f5798d;
        if (c02) {
            nVar.setLayerType(2, null);
        } else if (u3.l.c0(i2, 2)) {
            nVar.setLayerType(0, null);
            z4 = false;
        } else {
            nVar.setLayerType(0, null);
        }
        nVar.setCanUseCompositingLayer$ui_graphics_release(z4);
    }

    @Override // c0.InterfaceC0533d
    public final void h() {
        if (Build.VERSION.SDK_INT >= 31) {
            p.f5837a.a(this.f5798d, null);
        }
    }

    @Override // c0.InterfaceC0533d
    public final void k(float f4) {
        this.f5820z = f4;
        this.f5798d.setRotation(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void l(float f4) {
        this.f5814t = f4;
        this.f5798d.setTranslationY(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void m(float f4) {
        this.f5798d.setCameraDistance(f4 * this.f5799e.getDisplayMetrics().densityDpi);
    }

    @Override // c0.InterfaceC0533d
    public final void o(Outline outline) {
        n nVar = this.f5798d;
        nVar.f5830k = outline;
        nVar.invalidateOutline();
        if (u() && outline != null) {
            nVar.setClipToOutline(true);
            if (this.f5806l) {
                this.f5806l = false;
                this.f5804j = true;
            }
        }
        this.f5805k = outline != null;
    }

    @Override // c0.InterfaceC0533d
    public final void p(float f4) {
        this.f5811q = f4;
        this.f5798d.setScaleX(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void q(float f4) {
        this.f5818x = f4;
        this.f5798d.setRotationX(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void r() {
        this.f5796b.removeViewInLayout(this.f5798d);
    }

    @Override // c0.InterfaceC0533d
    public final void s(int i2) {
        this.f5808n = i2;
        if (u3.l.c0(i2, 1) || !K.o(this.f5807m, 3)) {
            f(1);
        } else {
            f(this.f5808n);
        }
    }

    @Override // c0.InterfaceC0533d
    public final void t(long j4) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5817w = j4;
            o.f5836a.c(this.f5798d, K.D(j4));
        }
    }

    @Override // c0.InterfaceC0533d
    public final boolean u() {
        return this.f5806l || this.f5798d.getClipToOutline();
    }

    @Override // c0.InterfaceC0533d
    public final float v() {
        return this.f5811q;
    }

    @Override // c0.InterfaceC0533d
    public final Matrix w() {
        return this.f5798d.getMatrix();
    }

    @Override // c0.InterfaceC0533d
    public final void x(float f4) {
        this.f5815u = f4;
        this.f5798d.setElevation(f4);
    }

    @Override // c0.InterfaceC0533d
    public final float y() {
        return this.f5814t;
    }

    @Override // c0.InterfaceC0533d
    public final void z(r rVar) {
        Rect rect;
        boolean z4 = this.f5804j;
        n nVar = this.f5798d;
        if (z4) {
            if (!u() || this.f5805k) {
                rect = null;
            } else {
                rect = this.f5800f;
                rect.left = 0;
                rect.top = 0;
                rect.right = nVar.getWidth();
                rect.bottom = nVar.getHeight();
            }
            nVar.setClipBounds(rect);
        }
        if (AbstractC0307d.a(rVar).isHardwareAccelerated()) {
            this.f5796b.a(rVar, nVar, nVar.getDrawingTime());
        }
    }
}
