package com.google.android.material.carousel;

import a0.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import c4.e;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.snovikpovik.vuevnxsj.R;
import f5.a;
import m5.b;
import m5.c;
import w4.d0;
import w4.e0;
import w4.j0;
import w4.m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends d0 {

    /* renamed from: k, reason: collision with root package name */
    public final e f1897k;

    /* renamed from: l, reason: collision with root package name */
    public c f1898l;

    /* renamed from: m, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1899m;

    public CarouselLayoutManager() {
        e eVar = new e();
        new b();
        this.f1899m = new View.OnLayoutChangeListener() { // from class: m5.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                if (i9 - i == i13 - i11 && i10 - i8 == i14 - i12) {
                    return;
                }
                view.post(new a1.a(8, CarouselLayoutManager.this));
            }
        };
        this.f1897k = eVar;
        W();
        d0(0);
    }

    @Override // w4.d0
    public final boolean E() {
        return true;
    }

    @Override // w4.d0
    public final void K(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        e eVar = this.f1897k;
        float f6 = eVar.f1624a;
        if (f6 <= 0.0f) {
            f6 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eVar.f1624a = f6;
        float f8 = eVar.f1625b;
        if (f8 <= 0.0f) {
            f8 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eVar.f1625b = f8;
        W();
        recyclerView.addOnLayoutChangeListener(this.f1899m);
    }

    @Override // w4.d0
    public final void L(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1899m);
    }

    @Override // w4.d0
    public final void M(AccessibilityEvent accessibilityEvent) {
        super.M(accessibilityEvent);
        if (q() > 0) {
            accessibilityEvent.setFromIndex(d0.A(p(0)));
            accessibilityEvent.setToIndex(d0.A(p(q() - 1)));
        }
    }

    @Override // w4.d0
    public final boolean V(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z7) {
        return false;
    }

    @Override // w4.d0
    public final int X(int i, j0 j0Var, m0 m0Var) {
        if (!c0() || q() == 0 || i == 0) {
            return 0;
        }
        j0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // w4.d0
    public final int Y(int i, j0 j0Var, m0 m0Var) {
        if (!d() || q() == 0 || i == 0) {
            return 0;
        }
        j0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // w4.d0
    public final boolean c() {
        return c0();
    }

    public final boolean c0() {
        return this.f1898l.f5226a == 0;
    }

    @Override // w4.d0
    public final boolean d() {
        return !c0();
    }

    public final void d0(int i) {
        c cVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(q.h("invalid orientation:", i));
        }
        b(null);
        c cVar2 = this.f1898l;
        if (cVar2 == null || i != cVar2.f5226a) {
            if (i == 0) {
                cVar = new c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f1898l = cVar;
            W();
        }
    }

    @Override // w4.d0
    public final int g(m0 m0Var) {
        q();
        return 0;
    }

    @Override // w4.d0
    public final int h(m0 m0Var) {
        return 0;
    }

    @Override // w4.d0
    public final int i(m0 m0Var) {
        return 0;
    }

    @Override // w4.d0
    public final int j(m0 m0Var) {
        q();
        return 0;
    }

    @Override // w4.d0
    public final int k(m0 m0Var) {
        return 0;
    }

    @Override // w4.d0
    public final int l(m0 m0Var) {
        return 0;
    }

    @Override // w4.d0
    public final e0 m() {
        return new e0(-2, -2);
    }

    @Override // w4.d0
    public final void t(View view, Rect rect) {
        super.t(view, rect);
        rect.centerY();
        if (c0()) {
            rect.centerX();
        }
        throw null;
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i8) {
        new b();
        this.f1899m = new View.OnLayoutChangeListener() { // from class: m5.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i82, int i92, int i10, int i11, int i12, int i13, int i14) {
                if (i92 - i9 == i13 - i11 && i10 - i82 == i14 - i12) {
                    return;
                }
                view.post(new a1.a(8, CarouselLayoutManager.this));
            }
        };
        this.f1897k = new e();
        W();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2737b);
            obtainStyledAttributes.getInt(0, 0);
            W();
            d0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
