package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.x;
import com.oriondriftchasers.arordrft.R;
import f1.m0;
import f1.n0;
import f1.s0;
import f1.x0;
import f1.y0;
import g2.c;
import u0.d;
import x1.a;
import x1.b;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends m0 implements x0 {

    /* renamed from: p, reason: collision with root package name */
    public final d f879p;

    /* renamed from: q, reason: collision with root package name */
    public b f880q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f881r;

    public CarouselLayoutManager() {
        d dVar = new d();
        new a();
        this.f881r = new c(1, this);
        this.f879p = dVar;
        m0();
        E0(0);
    }

    public final float B0(float f2, float f4) {
        return D0() ? f2 - f4 : f2 + f4;
    }

    public final boolean C0() {
        return this.f880q.f3616a == 0;
    }

    public final boolean D0() {
        return C0() && C() == 1;
    }

    public final void E0(int i) {
        b bVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(w0.d("invalid orientation:", i));
        }
        c(null);
        b bVar2 = this.f880q;
        if (bVar2 == null || i != bVar2.f3616a) {
            if (i == 0) {
                bVar = new b(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                bVar = new b(this, 0);
            }
            this.f880q = bVar;
            m0();
        }
    }

    @Override // f1.m0
    public final boolean L() {
        return true;
    }

    @Override // f1.m0
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        d dVar = this.f879p;
        float f2 = dVar.f3322a;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        dVar.f3322a = f2;
        float f4 = dVar.f3323b;
        if (f4 <= 0.0f) {
            f4 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        dVar.f3323b = f4;
        m0();
        recyclerView.addOnLayoutChangeListener(this.f881r);
    }

    @Override // f1.m0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f881r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (D0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (D0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // f1.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, s0 s0Var, y0 y0Var) {
        char c4;
        if (v() == 0) {
            return null;
        }
        int i4 = this.f880q.f3616a;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i4 == 0) {
                    }
                    c4 = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        }
                        c4 = 0;
                    } else {
                        if (i4 == 0) {
                        }
                        c4 = 0;
                    }
                }
                if (c4 == 0) {
                    return null;
                }
                if (c4 == 65535) {
                    if (m0.H(view) == 0) {
                        return null;
                    }
                    int H = m0.H(u(0)) - 1;
                    if (H < 0 || H >= B()) {
                        return u(D0() ? v() - 1 : 0);
                    }
                    this.f880q.a();
                    throw null;
                }
                if (m0.H(view) == B() - 1) {
                    return null;
                }
                int H2 = m0.H(u(v() - 1)) + 1;
                if (H2 < 0 || H2 >= B()) {
                    return u(D0() ? 0 : v() - 1);
                }
                this.f880q.a();
                throw null;
            }
            c4 = 1;
            if (c4 == 0) {
            }
        }
        c4 = 65535;
        if (c4 == 0) {
        }
    }

    @Override // f1.m0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(m0.H(u(0)));
            accessibilityEvent.setToIndex(m0.H(u(v() - 1)));
        }
    }

    @Override // f1.m0
    public final void X(int i, int i4) {
        B();
    }

    @Override // f1.m0
    public final void Y() {
        B();
    }

    @Override // f1.x0
    public final PointF a(int i) {
        return null;
    }

    @Override // f1.m0
    public final void a0(int i, int i4) {
        B();
    }

    @Override // f1.m0
    public final void c0(s0 s0Var, y0 y0Var) {
        if (y0Var.b() > 0) {
            if ((C0() ? this.f1455n : this.f1456o) > 0.0f) {
                D0();
                s0Var.d(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        h0(s0Var);
    }

    @Override // f1.m0
    public final boolean d() {
        return C0();
    }

    @Override // f1.m0
    public final void d0(y0 y0Var) {
        if (v() == 0) {
            return;
        }
        m0.H(u(0));
    }

    @Override // f1.m0
    public final boolean e() {
        return !C0();
    }

    @Override // f1.m0
    public final int j(y0 y0Var) {
        v();
        return 0;
    }

    @Override // f1.m0
    public final int k(y0 y0Var) {
        return 0;
    }

    @Override // f1.m0
    public final int l(y0 y0Var) {
        return 0;
    }

    @Override // f1.m0
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        return false;
    }

    @Override // f1.m0
    public final int m(y0 y0Var) {
        v();
        return 0;
    }

    @Override // f1.m0
    public final int n(y0 y0Var) {
        return 0;
    }

    @Override // f1.m0
    public final int n0(int i, s0 s0Var, y0 y0Var) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        s0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // f1.m0
    public final int o(y0 y0Var) {
        return 0;
    }

    @Override // f1.m0
    public final int p0(int i, s0 s0Var, y0 y0Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        s0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // f1.m0
    public final n0 r() {
        return new n0(-2, -2);
    }

    @Override // f1.m0
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // f1.m0
    public final void y0(RecyclerView recyclerView, int i) {
        x xVar = new x(this, recyclerView.getContext());
        xVar.f1515a = i;
        z0(xVar);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        new a();
        this.f881r = new c(1, this);
        this.f879p = new d();
        m0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.d);
            obtainStyledAttributes.getInt(0, 0);
            m0();
            E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // f1.m0
    public final void o0(int i) {
    }
}
