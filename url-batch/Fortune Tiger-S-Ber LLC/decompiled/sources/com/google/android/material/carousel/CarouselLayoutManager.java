package com.google.android.material.carousel;

import a2.r;
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
import b1.n0;
import b1.o0;
import b1.t0;
import b1.y0;
import b1.z0;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.datepicker.y;
import l1.a;
import r0.f;
import s1.b;
import s1.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends n0 implements y0 {

    /* renamed from: p, reason: collision with root package name */
    public final f f1252p;

    /* renamed from: q, reason: collision with root package name */
    public c f1253q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1254r;

    public CarouselLayoutManager() {
        f fVar = new f();
        new b();
        this.f1254r = new View.OnLayoutChangeListener() { // from class: s1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                if (i6 - i4 == i10 - i8 && i7 - i5 == i11 - i9) {
                    return;
                }
                view.post(new r(13, CarouselLayoutManager.this));
            }
        };
        this.f1252p = fVar;
        m0();
        E0(0);
    }

    public final float B0(float f4, float f5) {
        return D0() ? f4 - f5 : f4 + f5;
    }

    public final boolean C0() {
        return this.f1253q.f3317a == 0;
    }

    public final boolean D0() {
        return C0() && C() == 1;
    }

    public final void E0(int i4) {
        c cVar;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(w0.e("invalid orientation:", i4));
        }
        c(null);
        c cVar2 = this.f1253q;
        if (cVar2 == null || i4 != cVar2.f3317a) {
            if (i4 == 0) {
                cVar = new c(this, 1);
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f1253q = cVar;
            m0();
        }
    }

    @Override // b1.n0
    public final boolean L() {
        return true;
    }

    @Override // b1.n0
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        f fVar = this.f1252p;
        float f4 = fVar.f3150a;
        if (f4 <= 0.0f) {
            f4 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        fVar.f3150a = f4;
        float f5 = fVar.f3151b;
        if (f5 <= 0.0f) {
            f5 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        fVar.f3151b = f5;
        m0();
        recyclerView.addOnLayoutChangeListener(this.f1254r);
    }

    @Override // b1.n0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1254r);
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
    @Override // b1.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i4, t0 t0Var, z0 z0Var) {
        char c;
        if (v() == 0) {
            return null;
        }
        int i5 = this.f1253q.f3317a;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 17) {
                    if (i5 == 0) {
                    }
                    c = 0;
                } else if (i4 != 33) {
                    if (i4 != 66) {
                        if (i4 != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i4);
                        }
                        c = 0;
                    } else {
                        if (i5 == 0) {
                        }
                        c = 0;
                    }
                }
                if (c == 0) {
                    return null;
                }
                if (c == 65535) {
                    if (n0.H(view) == 0) {
                        return null;
                    }
                    int H = n0.H(u(0)) - 1;
                    if (H < 0 || H >= B()) {
                        return u(D0() ? v() - 1 : 0);
                    }
                    this.f1253q.a();
                    throw null;
                }
                if (n0.H(view) == B() - 1) {
                    return null;
                }
                int H2 = n0.H(u(v() - 1)) + 1;
                if (H2 < 0 || H2 >= B()) {
                    return u(D0() ? 0 : v() - 1);
                }
                this.f1253q.a();
                throw null;
            }
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    @Override // b1.n0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(n0.H(u(0)));
            accessibilityEvent.setToIndex(n0.H(u(v() - 1)));
        }
    }

    @Override // b1.n0
    public final void X(int i4, int i5) {
        B();
    }

    @Override // b1.n0
    public final void Y() {
        B();
    }

    @Override // b1.y0
    public final PointF a(int i4) {
        return null;
    }

    @Override // b1.n0
    public final void a0(int i4, int i5) {
        B();
    }

    @Override // b1.n0
    public final void c0(t0 t0Var, z0 z0Var) {
        if (z0Var.b() > 0) {
            if ((C0() ? this.f884n : this.f885o) > 0.0f) {
                D0();
                t0Var.d(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        h0(t0Var);
    }

    @Override // b1.n0
    public final boolean d() {
        return C0();
    }

    @Override // b1.n0
    public final void d0(z0 z0Var) {
        if (v() == 0) {
            return;
        }
        n0.H(u(0));
    }

    @Override // b1.n0
    public final boolean e() {
        return !C0();
    }

    @Override // b1.n0
    public final int j(z0 z0Var) {
        v();
        return 0;
    }

    @Override // b1.n0
    public final int k(z0 z0Var) {
        return 0;
    }

    @Override // b1.n0
    public final int l(z0 z0Var) {
        return 0;
    }

    @Override // b1.n0
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        return false;
    }

    @Override // b1.n0
    public final int m(z0 z0Var) {
        v();
        return 0;
    }

    @Override // b1.n0
    public final int n(z0 z0Var) {
        return 0;
    }

    @Override // b1.n0
    public final int n0(int i4, t0 t0Var, z0 z0Var) {
        if (!C0() || v() == 0 || i4 == 0) {
            return 0;
        }
        t0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // b1.n0
    public final int o(z0 z0Var) {
        return 0;
    }

    @Override // b1.n0
    public final int p0(int i4, t0 t0Var, z0 z0Var) {
        if (!e() || v() == 0 || i4 == 0) {
            return 0;
        }
        t0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // b1.n0
    public final o0 r() {
        return new o0(-2, -2);
    }

    @Override // b1.n0
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // b1.n0
    public final void y0(RecyclerView recyclerView, int i4) {
        y yVar = new y(this, recyclerView.getContext());
        yVar.f936a = i4;
        z0(yVar);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        new b();
        this.f1254r = new View.OnLayoutChangeListener() { // from class: s1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i42, int i52, int i6, int i7, int i8, int i9, int i10, int i11) {
                if (i6 - i42 == i10 - i8 && i7 - i52 == i11 - i9) {
                    return;
                }
                view.post(new r(13, CarouselLayoutManager.this));
            }
        };
        this.f1252p = new f();
        m0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2859b);
            obtainStyledAttributes.getInt(0, 0);
            m0();
            E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // b1.n0
    public final void o0(int i4) {
    }
}
