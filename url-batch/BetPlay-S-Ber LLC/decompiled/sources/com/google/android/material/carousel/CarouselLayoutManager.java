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
import com.awerser.monnit.betplay.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import defpackage.f9;
import defpackage.g9;
import defpackage.h9;
import defpackage.lg;
import defpackage.ly;
import defpackage.nz;
import defpackage.o30;
import defpackage.o8;
import defpackage.oz;
import defpackage.tz;
import defpackage.yz;
import defpackage.zz;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends nz implements yz {
    public final lg p;
    public h9 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new g9();
        this.r = new View.OnLayoutChangeListener() { // from class: e9
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new q1(2, CarouselLayoutManager.this));
            }
        };
        this.p = new lg();
        m0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.b);
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
        h9 h9Var;
        if (i != 0 && i != 1) {
            o8.j(o30.e("invalid orientation:", i));
            return;
        }
        c(null);
        h9 h9Var2 = this.q;
        if (h9Var2 == null || i != h9Var2.a) {
            if (i == 0) {
                h9Var = new h9(this, 1);
            } else {
                if (i != 1) {
                    o8.j("invalid orientation");
                    return;
                }
                h9Var = new h9(this, 0);
            }
            this.q = h9Var;
            m0();
        }
    }

    @Override // defpackage.nz
    public final boolean L() {
        return true;
    }

    @Override // defpackage.nz
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        lg lgVar = this.p;
        float f = lgVar.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        lgVar.a = f;
        float f2 = lgVar.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        lgVar.b = f2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.nz
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
    @Override // defpackage.nz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, tz tzVar, zz zzVar) {
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
                            if (nz.H(view) != 0) {
                                int H = nz.H(u(0)) - 1;
                                if (H < 0 || H >= B()) {
                                    return u(D0() ? v() - 1 : 0);
                                }
                                this.q.a();
                                throw null;
                            }
                        } else if (nz.H(view) != B() - 1) {
                            int H2 = nz.H(u(v() - 1)) + 1;
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

    @Override // defpackage.nz
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(nz.H(u(0)));
            accessibilityEvent.setToIndex(nz.H(u(v() - 1)));
        }
    }

    @Override // defpackage.nz
    public final void X(int i, int i2) {
        B();
    }

    @Override // defpackage.nz
    public final void Y() {
        B();
    }

    @Override // defpackage.yz
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.nz
    public final void a0(int i, int i2) {
        B();
    }

    @Override // defpackage.nz
    public final void c0(tz tzVar, zz zzVar) {
        if (zzVar.b() > 0) {
            if ((C0() ? this.n : this.o) > 0.0f) {
                D0();
                tzVar.d(0);
                o8.t("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        h0(tzVar);
    }

    @Override // defpackage.nz
    public final boolean d() {
        return C0();
    }

    @Override // defpackage.nz
    public final void d0(zz zzVar) {
        if (v() == 0) {
            return;
        }
        nz.H(u(0));
    }

    @Override // defpackage.nz
    public final boolean e() {
        return !C0();
    }

    @Override // defpackage.nz
    public final int j(zz zzVar) {
        v();
        return 0;
    }

    @Override // defpackage.nz
    public final int k(zz zzVar) {
        return 0;
    }

    @Override // defpackage.nz
    public final int l(zz zzVar) {
        return 0;
    }

    @Override // defpackage.nz
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.nz
    public final int m(zz zzVar) {
        v();
        return 0;
    }

    @Override // defpackage.nz
    public final int n(zz zzVar) {
        return 0;
    }

    @Override // defpackage.nz
    public final int n0(int i, tz tzVar, zz zzVar) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        tzVar.d(0);
        o8.t("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.nz
    public final int o(zz zzVar) {
        return 0;
    }

    @Override // defpackage.nz
    public final int p0(int i, tz tzVar, zz zzVar) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        tzVar.d(0);
        o8.t("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.nz
    public final oz r() {
        return new oz(-2, -2);
    }

    @Override // defpackage.nz
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.nz
    public final void y0(RecyclerView recyclerView, int i) {
        f9 f9Var = new f9(this, recyclerView.getContext());
        f9Var.a = i;
        z0(f9Var);
    }

    public CarouselLayoutManager() {
        lg lgVar = new lg();
        new g9();
        this.r = new View.OnLayoutChangeListener() { // from class: e9
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new q1(2, CarouselLayoutManager.this));
            }
        };
        this.p = lgVar;
        m0();
        E0(0);
    }

    @Override // defpackage.nz
    public final void o0(int i) {
    }
}
