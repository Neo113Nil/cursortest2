package com.google.android.material.carousel;

import A0.c;
import A0.d;
import A0.e;
import A0.g;
import G1.AbstractC0001b;
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
import com.winpower.neonfit.R;
import h0.AbstractC0141G;
import h0.C0142H;
import h0.C0147M;
import h0.Q;
import h0.S;
import t0.AbstractC0383a;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0141G implements Q {

    /* renamed from: p, reason: collision with root package name */
    public final g f2331p;

    /* renamed from: q, reason: collision with root package name */
    public e f2332q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f2333r;

    public CarouselLayoutManager() {
        g gVar = new g();
        new d();
        this.f2333r = new View.OnLayoutChangeListener() { // from class: A0.a
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
        this.f2331p = gVar;
        l0();
        C0(0);
    }

    public final boolean A0() {
        return this.f2332q.f11a == 0;
    }

    public final boolean B0() {
        return A0() && C() == 1;
    }

    public final void C0(int i) {
        e eVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0001b.e("invalid orientation:", i));
        }
        c(null);
        e eVar2 = this.f2332q;
        if (eVar2 == null || i != eVar2.f11a) {
            if (i == 0) {
                eVar = new e(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                eVar = new e(this, 0);
            }
            this.f2332q = eVar;
            l0();
        }
    }

    @Override // h0.AbstractC0141G
    public final boolean L() {
        return true;
    }

    @Override // h0.AbstractC0141G
    public final void Q(RecyclerView recyclerView) {
        g gVar = this.f2331p;
        Context context = recyclerView.getContext();
        float f2 = gVar.f14a;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        gVar.f14a = f2;
        float f3 = gVar.f15b;
        if (f3 <= 0.0f) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        gVar.f15b = f3;
        l0();
        recyclerView.addOnLayoutChangeListener(this.f2333r);
    }

    @Override // h0.AbstractC0141G
    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f2333r);
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
    @Override // h0.AbstractC0141G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, C0147M c0147m, S s2) {
        char c2;
        if (v() == 0) {
            return null;
        }
        int i2 = this.f2332q.f11a;
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
                    if (AbstractC0141G.H(view) == 0) {
                        return null;
                    }
                    int H = AbstractC0141G.H(u(0)) - 1;
                    if (H < 0 || H >= B()) {
                        return u(B0() ? v() - 1 : 0);
                    }
                    this.f2332q.a();
                    throw null;
                }
                if (AbstractC0141G.H(view) == B() - 1) {
                    return null;
                }
                int H2 = AbstractC0141G.H(u(v() - 1)) + 1;
                if (H2 < 0 || H2 >= B()) {
                    return u(B0() ? 0 : v() - 1);
                }
                this.f2332q.a();
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

    @Override // h0.AbstractC0141G
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0141G.H(u(0)));
            accessibilityEvent.setToIndex(AbstractC0141G.H(u(v() - 1)));
        }
    }

    @Override // h0.AbstractC0141G
    public final void W(int i, int i2) {
        B();
    }

    @Override // h0.AbstractC0141G
    public final void Z(int i, int i2) {
        B();
    }

    @Override // h0.Q
    public final PointF a(int i) {
        return null;
    }

    @Override // h0.AbstractC0141G
    public final void b0(C0147M c0147m, S s2) {
        if (s2.b() > 0) {
            if ((A0() ? this.f2914n : this.f2915o) > 0.0f) {
                B0();
                View view = c0147m.i(0, Long.MAX_VALUE).f2958a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        g0(c0147m);
    }

    @Override // h0.AbstractC0141G
    public final void c0(S s2) {
        if (v() == 0) {
            return;
        }
        AbstractC0141G.H(u(0));
    }

    @Override // h0.AbstractC0141G
    public final boolean d() {
        return A0();
    }

    @Override // h0.AbstractC0141G
    public final boolean e() {
        return !A0();
    }

    @Override // h0.AbstractC0141G
    public final int j(S s2) {
        v();
        return 0;
    }

    @Override // h0.AbstractC0141G
    public final int k(S s2) {
        return 0;
    }

    @Override // h0.AbstractC0141G
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // h0.AbstractC0141G
    public final int l(S s2) {
        return 0;
    }

    @Override // h0.AbstractC0141G
    public final int m(S s2) {
        v();
        return 0;
    }

    @Override // h0.AbstractC0141G
    public final int m0(int i, C0147M c0147m, S s2) {
        if (!A0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = c0147m.i(0, Long.MAX_VALUE).f2958a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // h0.AbstractC0141G
    public final int n(S s2) {
        return 0;
    }

    @Override // h0.AbstractC0141G
    public final void n0(int i) {
    }

    @Override // h0.AbstractC0141G
    public final int o(S s2) {
        return 0;
    }

    @Override // h0.AbstractC0141G
    public final int o0(int i, C0147M c0147m, S s2) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = c0147m.i(0, Long.MAX_VALUE).f2958a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // h0.AbstractC0141G
    public final C0142H r() {
        return new C0142H(-2, -2);
    }

    @Override // h0.AbstractC0141G
    public final void x0(RecyclerView recyclerView, int i) {
        c cVar = new c(this, recyclerView.getContext(), 0);
        cVar.f3117a = i;
        y0(cVar);
    }

    @Override // h0.AbstractC0141G
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
        this.f2333r = new View.OnLayoutChangeListener() { // from class: A0.a
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
        this.f2331p = new g();
        l0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0383a.f4148b);
            obtainStyledAttributes.getInt(0, 0);
            l0();
            C0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
