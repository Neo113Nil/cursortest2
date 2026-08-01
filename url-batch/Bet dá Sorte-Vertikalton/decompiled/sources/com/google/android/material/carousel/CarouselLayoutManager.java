package com.google.android.material.carousel;

import G0.o;
import X.V;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.glasspulse.glasspulse.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import f0.C0109x;
import f0.I;
import f0.J;
import f0.O;
import f0.T;
import f0.U;
import s0.AbstractC0283a;
import z0.b;
import z0.c;
import z0.e;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends I implements T {

    /* renamed from: p, reason: collision with root package name */
    public final e f1742p;

    /* renamed from: q, reason: collision with root package name */
    public c f1743q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1744r;

    public CarouselLayoutManager() {
        e eVar = new e();
        new b();
        this.f1744r = new View.OnLayoutChangeListener() { // from class: z0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new o(12, carouselLayoutManager));
            }
        };
        this.f1742p = eVar;
        l0();
        C0(0);
    }

    public final boolean A0() {
        return this.f1743q.f4250a == 0;
    }

    public final boolean B0() {
        return A0() && C() == 1;
    }

    public final void C0(int i) {
        c cVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(V.d("invalid orientation:", i));
        }
        c(null);
        c cVar2 = this.f1743q;
        if (cVar2 == null || i != cVar2.f4250a) {
            if (i == 0) {
                cVar = new c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f1743q = cVar;
            l0();
        }
    }

    @Override // f0.I
    public final boolean L() {
        return true;
    }

    @Override // f0.I
    public final void Q(RecyclerView recyclerView) {
        e eVar = this.f1742p;
        Context context = recyclerView.getContext();
        float f2 = eVar.f4253a;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eVar.f4253a = f2;
        float f3 = eVar.f4254b;
        if (f3 <= 0.0f) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eVar.f4254b = f3;
        l0();
        recyclerView.addOnLayoutChangeListener(this.f1744r);
    }

    @Override // f0.I
    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1744r);
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
    @Override // f0.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, O o2, U u2) {
        char c2;
        if (v() == 0) {
            return null;
        }
        int i2 = this.f1743q.f4250a;
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
                    if (I.H(view) == 0) {
                        return null;
                    }
                    int H2 = I.H(u(0)) - 1;
                    if (H2 < 0 || H2 >= B()) {
                        return u(B0() ? v() - 1 : 0);
                    }
                    this.f1743q.a();
                    throw null;
                }
                if (I.H(view) == B() - 1) {
                    return null;
                }
                int H3 = I.H(u(v() - 1)) + 1;
                if (H3 < 0 || H3 >= B()) {
                    return u(B0() ? 0 : v() - 1);
                }
                this.f1743q.a();
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

    @Override // f0.I
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(I.H(u(0)));
            accessibilityEvent.setToIndex(I.H(u(v() - 1)));
        }
    }

    @Override // f0.I
    public final void W(int i, int i2) {
        B();
    }

    @Override // f0.I
    public final void Z(int i, int i2) {
        B();
    }

    @Override // f0.T
    public final PointF a(int i) {
        return null;
    }

    @Override // f0.I
    public final void b0(O o2, U u2) {
        if (u2.b() > 0) {
            if ((A0() ? this.f2077n : this.f2078o) > 0.0f) {
                B0();
                View view = o2.i(0, Long.MAX_VALUE).f2118a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        g0(o2);
    }

    @Override // f0.I
    public final void c0(U u2) {
        if (v() == 0) {
            return;
        }
        I.H(u(0));
    }

    @Override // f0.I
    public final boolean d() {
        return A0();
    }

    @Override // f0.I
    public final boolean e() {
        return !A0();
    }

    @Override // f0.I
    public final int j(U u2) {
        v();
        return 0;
    }

    @Override // f0.I
    public final int k(U u2) {
        return 0;
    }

    @Override // f0.I
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // f0.I
    public final int l(U u2) {
        return 0;
    }

    @Override // f0.I
    public final int m(U u2) {
        v();
        return 0;
    }

    @Override // f0.I
    public final int m0(int i, O o2, U u2) {
        if (!A0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = o2.i(0, Long.MAX_VALUE).f2118a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // f0.I
    public final int n(U u2) {
        return 0;
    }

    @Override // f0.I
    public final void n0(int i) {
    }

    @Override // f0.I
    public final int o(U u2) {
        return 0;
    }

    @Override // f0.I
    public final int o0(int i, O o2, U u2) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = o2.i(0, Long.MAX_VALUE).f2118a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // f0.I
    public final J r() {
        return new J(-2, -2);
    }

    @Override // f0.I
    public final void x0(RecyclerView recyclerView, int i) {
        C0109x c0109x = new C0109x(this, recyclerView.getContext(), 1);
        c0109x.f2277a = i;
        y0(c0109x);
    }

    @Override // f0.I
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (A0()) {
            rect.centerX();
        }
        throw null;
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new b();
        this.f1744r = new View.OnLayoutChangeListener() { // from class: z0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new o(12, carouselLayoutManager));
            }
        };
        this.f1742p = new e();
        l0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0283a.f3744b);
            obtainStyledAttributes.getInt(0, 0);
            l0();
            C0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
