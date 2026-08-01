package com.google.android.material.carousel;

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
import com.moontiko.really.admiralcasino.R;
import defpackage.b20;
import defpackage.c20;
import defpackage.f60;
import defpackage.g9;
import defpackage.h20;
import defpackage.m20;
import defpackage.n20;
import defpackage.ui;
import defpackage.x9;
import defpackage.y00;
import defpackage.y9;
import defpackage.z9;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends b20 implements m20 {
    public final ui p;
    public z9 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new y9();
        this.r = new View.OnLayoutChangeListener() { // from class: w9
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new n1(2, CarouselLayoutManager.this));
            }
        };
        this.p = new ui();
        m0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.d);
            obtainStyledAttributes.getInt(0, 0);
            m0();
            E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public final float B0(float f, float f2) {
        return D0() ? f - f2 : f + f2;
    }

    public final boolean C0() {
        return this.q.a == 0;
    }

    public final boolean D0() {
        return C0() && C() == 1;
    }

    public final void E0(int i) {
        z9 z9Var;
        if (i != 0 && i != 1) {
            g9.i(f60.e("invalid orientation:", i));
            return;
        }
        c(null);
        z9 z9Var2 = this.q;
        if (z9Var2 == null || i != z9Var2.a) {
            if (i == 0) {
                z9Var = new z9(this, 1);
            } else {
                if (i != 1) {
                    g9.i("invalid orientation");
                    return;
                }
                z9Var = new z9(this, 0);
            }
            this.q = z9Var;
            m0();
        }
    }

    @Override // defpackage.b20
    public final boolean L() {
        return true;
    }

    @Override // defpackage.b20
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        ui uiVar = this.p;
        float f = uiVar.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        uiVar.a = f;
        float f2 = uiVar.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        uiVar.b = f2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.b20
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x003b, code lost:
    
        if (r7 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0045, code lost:
    
        if (D0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0049, code lost:
    
        if (r7 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0052, code lost:
    
        if (D0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // defpackage.b20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, h20 h20Var, n20 n20Var) {
        char c;
        if (v() != 0) {
            int i2 = this.q.a;
            if (i != 1) {
                if (i != 2) {
                    if (i == 17) {
                        if (i2 == 0) {
                        }
                        c = 0;
                    } else if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                            }
                            c = 0;
                        } else {
                            if (i2 == 0) {
                            }
                            c = 0;
                        }
                    }
                    if (c != 0) {
                        if (c == 65535) {
                            if (b20.H(view) != 0) {
                                int H = b20.H(u(0)) - 1;
                                if (H < 0 || H >= B()) {
                                    return u(D0() ? v() - 1 : 0);
                                }
                                this.q.a();
                                throw null;
                            }
                        } else if (b20.H(view) != B() - 1) {
                            int H2 = b20.H(u(v() - 1)) + 1;
                            if (H2 < 0 || H2 >= B()) {
                                return u(D0() ? 0 : v() - 1);
                            }
                            this.q.a();
                            throw null;
                        }
                    }
                }
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
        return null;
    }

    @Override // defpackage.b20
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(b20.H(u(0)));
            accessibilityEvent.setToIndex(b20.H(u(v() - 1)));
        }
    }

    @Override // defpackage.b20
    public final void X(int i, int i2) {
        B();
    }

    @Override // defpackage.b20
    public final void Y() {
        B();
    }

    @Override // defpackage.m20
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.b20
    public final void a0(int i, int i2) {
        B();
    }

    @Override // defpackage.b20
    public final void c0(h20 h20Var, n20 n20Var) {
        if (n20Var.b() > 0) {
            if ((C0() ? this.n : this.o) > 0.0f) {
                D0();
                h20Var.d(0);
                g9.s("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        h0(h20Var);
    }

    @Override // defpackage.b20
    public final boolean d() {
        return C0();
    }

    @Override // defpackage.b20
    public final void d0(n20 n20Var) {
        if (v() == 0) {
            return;
        }
        b20.H(u(0));
    }

    @Override // defpackage.b20
    public final boolean e() {
        return !C0();
    }

    @Override // defpackage.b20
    public final int j(n20 n20Var) {
        v();
        return 0;
    }

    @Override // defpackage.b20
    public final int k(n20 n20Var) {
        return 0;
    }

    @Override // defpackage.b20
    public final int l(n20 n20Var) {
        return 0;
    }

    @Override // defpackage.b20
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.b20
    public final int m(n20 n20Var) {
        v();
        return 0;
    }

    @Override // defpackage.b20
    public final int n(n20 n20Var) {
        return 0;
    }

    @Override // defpackage.b20
    public final int n0(int i, h20 h20Var, n20 n20Var) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        h20Var.d(0);
        g9.s("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.b20
    public final int o(n20 n20Var) {
        return 0;
    }

    @Override // defpackage.b20
    public final int p0(int i, h20 h20Var, n20 n20Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        h20Var.d(0);
        g9.s("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.b20
    public final c20 r() {
        return new c20(-2, -2);
    }

    @Override // defpackage.b20
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.b20
    public final void y0(RecyclerView recyclerView, int i) {
        x9 x9Var = new x9(this, recyclerView.getContext());
        x9Var.a = i;
        z0(x9Var);
    }

    public CarouselLayoutManager() {
        ui uiVar = new ui();
        new y9();
        this.r = new View.OnLayoutChangeListener() { // from class: w9
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new n1(2, CarouselLayoutManager.this));
            }
        };
        this.p = uiVar;
        m0();
        E0(0);
    }

    @Override // defpackage.b20
    public final void o0(int i) {
    }
}
