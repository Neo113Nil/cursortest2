package com.google.android.material.carousel;

import D0.p;
import Y.V;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.playbag.tripgear.R;
import g0.C0139z;
import g0.L;
import g0.M;
import g0.S;
import g0.X;
import g0.Y;
import p0.AbstractC0282a;
import w0.C0311b;
import w0.C0312c;
import w0.e;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends L implements X {

    /* renamed from: p, reason: collision with root package name */
    public final e f1738p;

    /* renamed from: q, reason: collision with root package name */
    public C0312c f1739q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1740r;

    public CarouselLayoutManager() {
        e eVar = new e();
        new C0311b();
        this.f1740r = new View.OnLayoutChangeListener() { // from class: w0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new p(11, carouselLayoutManager));
            }
        };
        this.f1738p = eVar;
        n0();
        E0(0);
    }

    public final boolean C0() {
        return this.f1739q.f4165a == 0;
    }

    public final boolean D0() {
        return C0() && C() == 1;
    }

    public final void E0(int i) {
        C0312c c0312c;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(V.e("invalid orientation:", i));
        }
        c(null);
        C0312c c0312c2 = this.f1739q;
        if (c0312c2 == null || i != c0312c2.f4165a) {
            if (i == 0) {
                c0312c = new C0312c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0312c = new C0312c(this, 0);
            }
            this.f1739q = c0312c;
            n0();
        }
    }

    @Override // g0.L
    public final boolean L() {
        return true;
    }

    @Override // g0.L
    public final void R(RecyclerView recyclerView) {
        e eVar = this.f1738p;
        Context context = recyclerView.getContext();
        float f2 = eVar.f4168a;
        if (f2 <= RecyclerView.f1530C0) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eVar.f4168a = f2;
        float f3 = eVar.f4169b;
        if (f3 <= RecyclerView.f1530C0) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eVar.f4169b = f3;
        n0();
        recyclerView.addOnLayoutChangeListener(this.f1740r);
    }

    @Override // g0.L
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1740r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
    
        if (r7 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0043, code lost:
    
        if (D0() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0046, code lost:
    
        if (r7 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004f, code lost:
    
        if (D0() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // g0.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, S s2, Y y2) {
        char c2;
        if (v() == 0) {
            return null;
        }
        int i2 = this.f1739q.f4165a;
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
                    if (L.H(view) == 0) {
                        return null;
                    }
                    int H2 = L.H(u(0)) - 1;
                    if (H2 < 0 || H2 >= B()) {
                        return u(D0() ? v() - 1 : 0);
                    }
                    this.f1739q.a();
                    throw null;
                }
                if (L.H(view) == B() - 1) {
                    return null;
                }
                int H3 = L.H(u(v() - 1)) + 1;
                if (H3 < 0 || H3 >= B()) {
                    return u(D0() ? 0 : v() - 1);
                }
                this.f1739q.a();
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

    @Override // g0.L
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(L.H(u(0)));
            accessibilityEvent.setToIndex(L.H(u(v() - 1)));
        }
    }

    @Override // g0.L
    public final void Y(int i, int i2) {
        B();
    }

    @Override // g0.X
    public final PointF a(int i) {
        return null;
    }

    @Override // g0.L
    public final void b0(int i, int i2) {
        B();
    }

    @Override // g0.L
    public final boolean d() {
        return C0();
    }

    @Override // g0.L
    public final void d0(S s2, Y y2) {
        if (y2.b() > 0) {
            if ((C0() ? this.f2285n : this.f2286o) > RecyclerView.f1530C0) {
                D0();
                View view = s2.k(0, Long.MAX_VALUE).f2339a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        i0(s2);
    }

    @Override // g0.L
    public final boolean e() {
        return !C0();
    }

    @Override // g0.L
    public final void e0(Y y2) {
        if (v() == 0) {
            return;
        }
        L.H(u(0));
    }

    @Override // g0.L
    public final int j(Y y2) {
        v();
        return 0;
    }

    @Override // g0.L
    public final int k(Y y2) {
        return 0;
    }

    @Override // g0.L
    public final int l(Y y2) {
        return 0;
    }

    @Override // g0.L
    public final int m(Y y2) {
        v();
        return 0;
    }

    @Override // g0.L
    public final boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // g0.L
    public final int n(Y y2) {
        return 0;
    }

    @Override // g0.L
    public final int o(Y y2) {
        return 0;
    }

    @Override // g0.L
    public final int o0(int i, S s2, Y y2) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = s2.k(0, Long.MAX_VALUE).f2339a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // g0.L
    public final void p0(int i) {
    }

    @Override // g0.L
    public final int q0(int i, S s2, Y y2) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = s2.k(0, Long.MAX_VALUE).f2339a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // g0.L
    public final M r() {
        return new M(-2, -2);
    }

    @Override // g0.L
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // g0.L
    public final void z0(RecyclerView recyclerView, int i) {
        C0139z c0139z = new C0139z(this, recyclerView.getContext(), 1);
        c0139z.f2497a = i;
        A0(c0139z);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C0311b();
        this.f1740r = new View.OnLayoutChangeListener() { // from class: w0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new p(11, carouselLayoutManager));
            }
        };
        this.f1738p = new e();
        n0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0282a.f3431b);
            obtainStyledAttributes.getInt(0, 0);
            n0();
            E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
