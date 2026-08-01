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
import com.derinko.gbini.n1casino.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import defpackage.d30;
import defpackage.ez;
import defpackage.jz;
import defpackage.k9;
import defpackage.kz;
import defpackage.l9;
import defpackage.m9;
import defpackage.t8;
import defpackage.tg;
import defpackage.vx;
import defpackage.xy;
import defpackage.yy;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends xy implements jz {
    public final tg p;
    public m9 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new l9();
        this.r = new View.OnLayoutChangeListener() { // from class: j9
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new m1(2, CarouselLayoutManager.this));
            }
        };
        this.p = new tg();
        m0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vx.d);
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
        m9 m9Var;
        if (i != 0 && i != 1) {
            t8.k(d30.e("invalid orientation:", i));
            return;
        }
        c(null);
        m9 m9Var2 = this.q;
        if (m9Var2 == null || i != m9Var2.a) {
            if (i == 0) {
                m9Var = new m9(this, 1);
            } else {
                if (i != 1) {
                    t8.k("invalid orientation");
                    return;
                }
                m9Var = new m9(this, 0);
            }
            this.q = m9Var;
            m0();
        }
    }

    @Override // defpackage.xy
    public final boolean L() {
        return true;
    }

    @Override // defpackage.xy
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        tg tgVar = this.p;
        float f = tgVar.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        tgVar.a = f;
        float f2 = tgVar.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        tgVar.b = f2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.xy
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
    @Override // defpackage.xy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, ez ezVar, kz kzVar) {
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
                            if (xy.H(view) != 0) {
                                int H = xy.H(u(0)) - 1;
                                if (H < 0 || H >= B()) {
                                    return u(D0() ? v() - 1 : 0);
                                }
                                this.q.a();
                                throw null;
                            }
                        } else if (xy.H(view) != B() - 1) {
                            int H2 = xy.H(u(v() - 1)) + 1;
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

    @Override // defpackage.xy
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(xy.H(u(0)));
            accessibilityEvent.setToIndex(xy.H(u(v() - 1)));
        }
    }

    @Override // defpackage.xy
    public final void X(int i, int i2) {
        B();
    }

    @Override // defpackage.xy
    public final void Y() {
        B();
    }

    @Override // defpackage.jz
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.xy
    public final void a0(int i, int i2) {
        B();
    }

    @Override // defpackage.xy
    public final void c0(ez ezVar, kz kzVar) {
        if (kzVar.b() > 0) {
            if ((C0() ? this.n : this.o) > 0.0f) {
                D0();
                ezVar.d(0);
                t8.t("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        h0(ezVar);
    }

    @Override // defpackage.xy
    public final boolean d() {
        return C0();
    }

    @Override // defpackage.xy
    public final void d0(kz kzVar) {
        if (v() == 0) {
            return;
        }
        xy.H(u(0));
    }

    @Override // defpackage.xy
    public final boolean e() {
        return !C0();
    }

    @Override // defpackage.xy
    public final int j(kz kzVar) {
        v();
        return 0;
    }

    @Override // defpackage.xy
    public final int k(kz kzVar) {
        return 0;
    }

    @Override // defpackage.xy
    public final int l(kz kzVar) {
        return 0;
    }

    @Override // defpackage.xy
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.xy
    public final int m(kz kzVar) {
        v();
        return 0;
    }

    @Override // defpackage.xy
    public final int n(kz kzVar) {
        return 0;
    }

    @Override // defpackage.xy
    public final int n0(int i, ez ezVar, kz kzVar) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        ezVar.d(0);
        t8.t("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.xy
    public final int o(kz kzVar) {
        return 0;
    }

    @Override // defpackage.xy
    public final int p0(int i, ez ezVar, kz kzVar) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        ezVar.d(0);
        t8.t("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.xy
    public final yy r() {
        return new yy(-2, -2);
    }

    @Override // defpackage.xy
    public final void y(Rect rect, View view) {
        super.y(rect, view);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.xy
    public final void y0(RecyclerView recyclerView, int i) {
        k9 k9Var = new k9(this, recyclerView.getContext());
        k9Var.a = i;
        z0(k9Var);
    }

    public CarouselLayoutManager() {
        tg tgVar = new tg();
        new l9();
        this.r = new View.OnLayoutChangeListener() { // from class: j9
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new m1(2, CarouselLayoutManager.this));
            }
        };
        this.p = tgVar;
        m0();
        E0(0);
    }

    @Override // defpackage.xy
    public final void o0(int i) {
    }
}
