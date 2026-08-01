package com.google.android.material.carousel;

import D0.p;
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
import com.winworm.neongrid.R;
import g0.C0140y;
import g0.J;
import g0.K;
import g0.P;
import g0.V;
import g0.W;
import p0.AbstractC0285a;
import w0.b;
import w0.c;
import w0.e;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends J implements V {

    /* renamed from: p, reason: collision with root package name */
    public final e f1769p;

    /* renamed from: q, reason: collision with root package name */
    public c f1770q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1771r;

    public CarouselLayoutManager() {
        e eVar = new e();
        new b();
        this.f1771r = new View.OnLayoutChangeListener() { // from class: w0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new p(12, carouselLayoutManager));
            }
        };
        this.f1769p = eVar;
        n0();
        E0(0);
    }

    public final boolean C0() {
        return this.f1770q.f4090a == 0;
    }

    public final boolean D0() {
        return C0() && C() == 1;
    }

    public final void E0(int i) {
        c cVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(Y.V.e("invalid orientation:", i));
        }
        c(null);
        c cVar2 = this.f1770q;
        if (cVar2 == null || i != cVar2.f4090a) {
            if (i == 0) {
                cVar = new c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f1770q = cVar;
            n0();
        }
    }

    @Override // g0.J
    public final boolean L() {
        return true;
    }

    @Override // g0.J
    public final void R(RecyclerView recyclerView) {
        e eVar = this.f1769p;
        Context context = recyclerView.getContext();
        float f2 = eVar.f4093a;
        if (f2 <= RecyclerView.f1559A0) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eVar.f4093a = f2;
        float f3 = eVar.f4094b;
        if (f3 <= RecyclerView.f1559A0) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eVar.f4094b = f3;
        n0();
        recyclerView.addOnLayoutChangeListener(this.f1771r);
    }

    @Override // g0.J
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1771r);
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
    @Override // g0.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, P p2, W w2) {
        char c2;
        if (v() == 0) {
            return null;
        }
        int i2 = this.f1770q.f4090a;
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
                    if (J.H(view) == 0) {
                        return null;
                    }
                    int H2 = J.H(u(0)) - 1;
                    if (H2 < 0 || H2 >= B()) {
                        return u(D0() ? v() - 1 : 0);
                    }
                    this.f1770q.a();
                    throw null;
                }
                if (J.H(view) == B() - 1) {
                    return null;
                }
                int H3 = J.H(u(v() - 1)) + 1;
                if (H3 < 0 || H3 >= B()) {
                    return u(D0() ? 0 : v() - 1);
                }
                this.f1770q.a();
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

    @Override // g0.J
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(J.H(u(0)));
            accessibilityEvent.setToIndex(J.H(u(v() - 1)));
        }
    }

    @Override // g0.J
    public final void Y(int i, int i2) {
        B();
    }

    @Override // g0.V
    public final PointF a(int i) {
        return null;
    }

    @Override // g0.J
    public final void b0(int i, int i2) {
        B();
    }

    @Override // g0.J
    public final boolean d() {
        return C0();
    }

    @Override // g0.J
    public final void d0(P p2, W w2) {
        if (w2.b() > 0) {
            if ((C0() ? this.f2320n : this.f2321o) > RecyclerView.f1559A0) {
                D0();
                View view = p2.k(0, Long.MAX_VALUE).f2366a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        i0(p2);
    }

    @Override // g0.J
    public final boolean e() {
        return !C0();
    }

    @Override // g0.J
    public final void e0(W w2) {
        if (v() == 0) {
            return;
        }
        J.H(u(0));
    }

    @Override // g0.J
    public final int j(W w2) {
        v();
        return 0;
    }

    @Override // g0.J
    public final int k(W w2) {
        return 0;
    }

    @Override // g0.J
    public final int l(W w2) {
        return 0;
    }

    @Override // g0.J
    public final int m(W w2) {
        v();
        return 0;
    }

    @Override // g0.J
    public final boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // g0.J
    public final int n(W w2) {
        return 0;
    }

    @Override // g0.J
    public final int o(W w2) {
        return 0;
    }

    @Override // g0.J
    public final int o0(int i, P p2, W w2) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = p2.k(0, Long.MAX_VALUE).f2366a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // g0.J
    public final void p0(int i) {
    }

    @Override // g0.J
    public final int q0(int i, P p2, W w2) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = p2.k(0, Long.MAX_VALUE).f2366a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // g0.J
    public final K r() {
        return new K(-2, -2);
    }

    @Override // g0.J
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // g0.J
    public final void z0(RecyclerView recyclerView, int i) {
        C0140y c0140y = new C0140y(this, recyclerView.getContext(), 1);
        c0140y.f2527a = i;
        A0(c0140y);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new b();
        this.f1771r = new View.OnLayoutChangeListener() { // from class: w0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new p(12, carouselLayoutManager));
            }
        };
        this.f1769p = new e();
        n0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0285a.f3324b);
            obtainStyledAttributes.getInt(0, 0);
            n0();
            E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
