package com.google.android.material.carousel;

import a.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.gdmhkmf.belbet.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.datepicker.g0;
import g1.a1;
import g1.b1;
import g1.g1;
import g1.l1;
import g1.m1;
import q1.a;
import v0.d;
import y1.b;
import y1.c;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends a1 implements l1 {

    /* renamed from: p, reason: collision with root package name */
    public final d f997p;

    /* renamed from: q, reason: collision with root package name */
    public c f998q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f999r;

    public CarouselLayoutManager() {
        d dVar = new d();
        new b();
        this.f999r = new View.OnLayoutChangeListener() { // from class: y1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new j(14, CarouselLayoutManager.this));
            }
        };
        this.f997p = dVar;
        o0();
        G0(0);
    }

    @Override // g1.a1
    public final void A0(RecyclerView recyclerView, int i) {
        g0 g0Var = new g0(this, recyclerView.getContext());
        g0Var.f1675a = i;
        B0(g0Var);
    }

    public final float D0(float f5, float f6) {
        return F0() ? f5 - f6 : f5 + f6;
    }

    public final boolean E0() {
        return this.f998q.f4100a == 0;
    }

    public final boolean F0() {
        return E0() && this.f1598b.getLayoutDirection() == 1;
    }

    public final void G0(int i) {
        c cVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a4.b.f("invalid orientation:", i));
        }
        c(null);
        c cVar2 = this.f998q;
        if (cVar2 == null || i != cVar2.f4100a) {
            if (i == 0) {
                cVar = new c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f998q = cVar;
            o0();
        }
    }

    @Override // g1.a1
    public final boolean K() {
        return true;
    }

    @Override // g1.a1
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        d dVar = this.f997p;
        float f5 = dVar.f3700a;
        if (f5 <= 0.0f) {
            f5 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        dVar.f3700a = f5;
        float f6 = dVar.f3701b;
        if (f6 <= 0.0f) {
            f6 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        dVar.f3701b = f6;
        o0();
        recyclerView.addOnLayoutChangeListener(this.f999r);
    }

    @Override // g1.a1
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f999r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (F0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (F0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // g1.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, g1 g1Var, m1 m1Var) {
        char c5;
        if (v() == 0) {
            return null;
        }
        int i4 = this.f998q.f4100a;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i4 == 0) {
                    }
                    c5 = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        }
                        c5 = 0;
                    } else {
                        if (i4 == 0) {
                        }
                        c5 = 0;
                    }
                }
                if (c5 == 0) {
                    return null;
                }
                if (c5 == 65535) {
                    if (a1.G(view) == 0) {
                        return null;
                    }
                    int G = a1.G(u(0)) - 1;
                    if (G < 0 || G >= B()) {
                        return u(F0() ? v() - 1 : 0);
                    }
                    this.f998q.a();
                    throw null;
                }
                if (a1.G(view) == B() - 1) {
                    return null;
                }
                int G2 = a1.G(u(v() - 1)) + 1;
                if (G2 < 0 || G2 >= B()) {
                    return u(F0() ? 0 : v() - 1);
                }
                this.f998q.a();
                throw null;
            }
            c5 = 1;
            if (c5 == 0) {
            }
        }
        c5 = 65535;
        if (c5 == 0) {
        }
    }

    @Override // g1.a1
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(a1.G(u(0)));
            accessibilityEvent.setToIndex(a1.G(u(v() - 1)));
        }
    }

    @Override // g1.a1
    public final void Y(int i, int i4) {
        B();
    }

    @Override // g1.a1
    public final void Z() {
        B();
    }

    @Override // g1.l1
    public final PointF a(int i) {
        return null;
    }

    @Override // g1.a1
    public final void b0(int i, int i4) {
        B();
    }

    @Override // g1.a1
    public final boolean d() {
        return E0();
    }

    @Override // g1.a1
    public final void d0(g1 g1Var, m1 m1Var) {
        if (m1Var.b() > 0) {
            if ((E0() ? this.f1607n : this.f1608o) > 0.0f) {
                F0();
                g1Var.d(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        j0(g1Var);
    }

    @Override // g1.a1
    public final boolean e() {
        return !E0();
    }

    @Override // g1.a1
    public final void e0(m1 m1Var) {
        if (v() == 0) {
            return;
        }
        a1.G(u(0));
    }

    @Override // g1.a1
    public final int j(m1 m1Var) {
        v();
        return 0;
    }

    @Override // g1.a1
    public final int k(m1 m1Var) {
        return 0;
    }

    @Override // g1.a1
    public final int l(m1 m1Var) {
        return 0;
    }

    @Override // g1.a1
    public final int m(m1 m1Var) {
        v();
        return 0;
    }

    @Override // g1.a1
    public final int n(m1 m1Var) {
        return 0;
    }

    @Override // g1.a1
    public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
        return false;
    }

    @Override // g1.a1
    public final int o(m1 m1Var) {
        return 0;
    }

    @Override // g1.a1
    public final int p0(int i, g1 g1Var, m1 m1Var) {
        if (!E0() || v() == 0 || i == 0) {
            return 0;
        }
        g1Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // g1.a1
    public final b1 r() {
        return new b1(-2, -2);
    }

    @Override // g1.a1
    public final int r0(int i, g1 g1Var, m1 m1Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        g1Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // g1.a1
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (E0()) {
            rect.centerX();
        }
        throw null;
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        new b();
        this.f999r = new View.OnLayoutChangeListener() { // from class: y1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i42, int i52, int i6, int i7, int i8, int i9, int i10) {
                if (i52 - i5 == i9 - i7 && i6 - i42 == i10 - i8) {
                    return;
                }
                view.post(new j(14, CarouselLayoutManager.this));
            }
        };
        this.f997p = new d();
        o0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3141b);
            obtainStyledAttributes.getInt(0, 0);
            o0();
            G0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // g1.a1
    public final void q0(int i) {
    }
}
