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
import com.trembin.nirefon.betfury.R;
import defpackage.c70;
import defpackage.h80;
import defpackage.i80;
import defpackage.il;
import defpackage.o80;
import defpackage.qa;
import defpackage.r7;
import defpackage.ra;
import defpackage.s9;
import defpackage.sa;
import defpackage.t80;
import defpackage.u80;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends h80 implements t80 {
    public final il p;
    public sa q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new ra();
        this.r = new View.OnLayoutChangeListener() { // from class: pa
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new r1(2, CarouselLayoutManager.this));
            }
        };
        this.p = new il();
        m0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c70.d);
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
        sa saVar;
        if (i != 0 && i != 1) {
            s9.k(r7.b("invalid orientation:", i));
            return;
        }
        c(null);
        sa saVar2 = this.q;
        if (saVar2 == null || i != saVar2.a) {
            if (i == 0) {
                saVar = new sa(this, 1);
            } else {
                if (i != 1) {
                    s9.k("invalid orientation");
                    return;
                }
                saVar = new sa(this, 0);
            }
            this.q = saVar;
            m0();
        }
    }

    @Override // defpackage.h80
    public final boolean L() {
        return true;
    }

    @Override // defpackage.h80
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        il ilVar = this.p;
        float f = ilVar.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        ilVar.a = f;
        float f2 = ilVar.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        ilVar.b = f2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.h80
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
    @Override // defpackage.h80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, o80 o80Var, u80 u80Var) {
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
                            if (h80.H(view) != 0) {
                                int H = h80.H(u(0)) - 1;
                                if (H < 0 || H >= B()) {
                                    return u(D0() ? v() - 1 : 0);
                                }
                                this.q.a();
                                throw null;
                            }
                        } else if (h80.H(view) != B() - 1) {
                            int H2 = h80.H(u(v() - 1)) + 1;
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

    @Override // defpackage.h80
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(h80.H(u(0)));
            accessibilityEvent.setToIndex(h80.H(u(v() - 1)));
        }
    }

    @Override // defpackage.h80
    public final void X(int i, int i2) {
        B();
    }

    @Override // defpackage.h80
    public final void Y() {
        B();
    }

    @Override // defpackage.t80
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.h80
    public final void a0(int i, int i2) {
        B();
    }

    @Override // defpackage.h80
    public final void c0(o80 o80Var, u80 u80Var) {
        if (u80Var.b() > 0) {
            if ((C0() ? this.n : this.o) > 0.0f) {
                D0();
                o80Var.d(0);
                s9.u("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        h0(o80Var);
    }

    @Override // defpackage.h80
    public final boolean d() {
        return C0();
    }

    @Override // defpackage.h80
    public final void d0(u80 u80Var) {
        if (v() == 0) {
            return;
        }
        h80.H(u(0));
    }

    @Override // defpackage.h80
    public final boolean e() {
        return !C0();
    }

    @Override // defpackage.h80
    public final int j(u80 u80Var) {
        v();
        return 0;
    }

    @Override // defpackage.h80
    public final int k(u80 u80Var) {
        return 0;
    }

    @Override // defpackage.h80
    public final int l(u80 u80Var) {
        return 0;
    }

    @Override // defpackage.h80
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.h80
    public final int m(u80 u80Var) {
        v();
        return 0;
    }

    @Override // defpackage.h80
    public final int n(u80 u80Var) {
        return 0;
    }

    @Override // defpackage.h80
    public final int n0(int i, o80 o80Var, u80 u80Var) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        o80Var.d(0);
        s9.u("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.h80
    public final int o(u80 u80Var) {
        return 0;
    }

    @Override // defpackage.h80
    public final int p0(int i, o80 o80Var, u80 u80Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        o80Var.d(0);
        s9.u("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.h80
    public final i80 r() {
        return new i80(-2, -2);
    }

    @Override // defpackage.h80
    public final void y(Rect rect, View view) {
        super.y(rect, view);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.h80
    public final void y0(RecyclerView recyclerView, int i) {
        qa qaVar = new qa(this, recyclerView.getContext());
        qaVar.a = i;
        z0(qaVar);
    }

    public CarouselLayoutManager() {
        il ilVar = new il();
        new ra();
        this.r = new View.OnLayoutChangeListener() { // from class: pa
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new r1(2, CarouselLayoutManager.this));
            }
        };
        this.p = ilVar;
        m0();
        E0(0);
    }

    @Override // defpackage.h80
    public final void o0(int i) {
    }
}
