package com.google.android.material.carousel;

import B0.c;
import B0.d;
import B0.e;
import B0.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.clutchquizarena.app.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import f0.H;
import f0.I;
import f0.N;
import f0.S;
import f0.T;
import u0.AbstractC0361a;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends H implements S {

    /* renamed from: p, reason: collision with root package name */
    public final g f1820p;

    /* renamed from: q, reason: collision with root package name */
    public e f1821q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1822r;

    public CarouselLayoutManager() {
        g gVar = new g();
        new d();
        this.f1822r = new View.OnLayoutChangeListener() { // from class: B0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new b(0, carouselLayoutManager));
            }
        };
        this.f1820p = gVar;
        l0();
        C0(0);
    }

    public final boolean A0() {
        return this.f1821q.f87a == 0;
    }

    public final boolean B0() {
        return A0() && C() == 1;
    }

    public final void C0(int i) {
        e eVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        c(null);
        e eVar2 = this.f1821q;
        if (eVar2 == null || i != eVar2.f87a) {
            if (i == 0) {
                eVar = new e(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                eVar = new e(this, 0);
            }
            this.f1821q = eVar;
            l0();
        }
    }

    @Override // f0.H
    public final boolean L() {
        return true;
    }

    @Override // f0.H
    public final void Q(RecyclerView recyclerView) {
        g gVar = this.f1820p;
        Context context = recyclerView.getContext();
        float f2 = gVar.f90a;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        gVar.f90a = f2;
        float f3 = gVar.f91b;
        if (f3 <= 0.0f) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        gVar.f91b = f3;
        l0();
        recyclerView.addOnLayoutChangeListener(this.f1822r);
    }

    @Override // f0.H
    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1822r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
    
        if (r7 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0043, code lost:
    
        if (B0() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0046, code lost:
    
        if (r7 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004f, code lost:
    
        if (B0() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // f0.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, N n2, T t2) {
        char c2;
        if (v() == 0) {
            return null;
        }
        int i2 = this.f1821q.f87a;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i2 == 0) {
                    }
                    c2 = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        }
                        c2 = 0;
                    } else {
                        if (i2 == 0) {
                        }
                        c2 = 0;
                    }
                }
                if (c2 == 0) {
                    return null;
                }
                if (c2 == 65535) {
                    if (H.H(view) == 0) {
                        return null;
                    }
                    int H2 = H.H(u(0)) - 1;
                    if (H2 < 0 || H2 >= B()) {
                        return u(B0() ? v() - 1 : 0);
                    }
                    this.f1821q.a();
                    throw null;
                }
                if (H.H(view) == B() - 1) {
                    return null;
                }
                int H3 = H.H(u(v() - 1)) + 1;
                if (H3 < 0 || H3 >= B()) {
                    return u(B0() ? 0 : v() - 1);
                }
                this.f1821q.a();
                throw null;
            }
            c2 = 1;
            if (c2 == 0) {
            }
        }
        c2 = 65535;
        if (c2 == 0) {
        }
    }

    @Override // f0.H
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(H.H(u(0)));
            accessibilityEvent.setToIndex(H.H(u(v() - 1)));
        }
    }

    @Override // f0.H
    public final void W(int i, int i2) {
        B();
    }

    @Override // f0.H
    public final void Z(int i, int i2) {
        B();
    }

    @Override // f0.S
    public final PointF a(int i) {
        return null;
    }

    @Override // f0.H
    public final void b0(N n2, T t2) {
        if (t2.b() > 0) {
            if ((A0() ? this.f2152n : this.f2153o) > 0.0f) {
                B0();
                View view = n2.i(0, Long.MAX_VALUE).f2193a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        g0(n2);
    }

    @Override // f0.H
    public final void c0(T t2) {
        if (v() == 0) {
            return;
        }
        H.H(u(0));
    }

    @Override // f0.H
    public final boolean d() {
        return A0();
    }

    @Override // f0.H
    public final boolean e() {
        return !A0();
    }

    @Override // f0.H
    public final int j(T t2) {
        v();
        return 0;
    }

    @Override // f0.H
    public final int k(T t2) {
        return 0;
    }

    @Override // f0.H
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // f0.H
    public final int l(T t2) {
        return 0;
    }

    @Override // f0.H
    public final int m(T t2) {
        v();
        return 0;
    }

    @Override // f0.H
    public final int m0(int i, N n2, T t2) {
        if (!A0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = n2.i(0, Long.MAX_VALUE).f2193a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // f0.H
    public final int n(T t2) {
        return 0;
    }

    @Override // f0.H
    public final void n0(int i) {
    }

    @Override // f0.H
    public final int o(T t2) {
        return 0;
    }

    @Override // f0.H
    public final int o0(int i, N n2, T t2) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = n2.i(0, Long.MAX_VALUE).f2193a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // f0.H
    public final I r() {
        return new I(-2, -2);
    }

    @Override // f0.H
    public final void x0(RecyclerView recyclerView, int i) {
        c cVar = new c(this, recyclerView.getContext(), 0);
        cVar.f2351a = i;
        y0(cVar);
    }

    @Override // f0.H
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (A0()) {
            rect.centerX();
        }
        throw null;
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new d();
        this.f1822r = new View.OnLayoutChangeListener() { // from class: B0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new b(0, carouselLayoutManager));
            }
        };
        this.f1820p = new g();
        l0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0361a.f3729b);
            obtainStyledAttributes.getInt(0, 0);
            l0();
            C0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
