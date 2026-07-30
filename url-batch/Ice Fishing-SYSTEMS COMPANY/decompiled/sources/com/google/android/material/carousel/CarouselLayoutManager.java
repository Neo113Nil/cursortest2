package com.google.android.material.carousel;

import D.RunnableC0281a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.AbstractC3551lx;
import com.google.android.gms.internal.ads.BP;
import com.google.android.gms.internal.ads.CL;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import p3.C4859b;
import p3.c;
import p3.d;
import p3.f;
import t0.AbstractC5019C;
import t0.C5020D;
import t0.C5029M;
import t0.InterfaceC5028L;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends AbstractC5019C implements InterfaceC5028L {

    /* renamed from: p, reason: collision with root package name */
    public final f f36072p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC3551lx f36073q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f36074r;

    public CarouselLayoutManager() {
        f fVar = new f();
        new c();
        this.f36074r = new View.OnLayoutChangeListener() { // from class: p3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i4, int i9, int i10, int i11, int i12, int i13, int i14) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (i == i11 && i4 == i12 && i9 == i13 && i10 == i14) {
                    return;
                }
                view.post(new RunnableC0281a(26, carouselLayoutManager));
            }
        };
        this.f36072p = fVar;
        l0();
        C0(0);
    }

    public final boolean A0() {
        return this.f36073q.f32624b == 0;
    }

    public final boolean B0() {
        return A0() && C() == 1;
    }

    public final void C0(int i) {
        d dVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(CL.i(i, "invalid orientation:"));
        }
        c(null);
        AbstractC3551lx abstractC3551lx = this.f36073q;
        if (abstractC3551lx == null || i != abstractC3551lx.f32624b) {
            if (i == 0) {
                dVar = new d(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                dVar = new d(this, 0);
            }
            this.f36073q = dVar;
            l0();
        }
    }

    @Override // t0.AbstractC5019C
    public final boolean L() {
        return true;
    }

    @Override // t0.AbstractC5019C
    public final void Q(RecyclerView recyclerView) {
        f fVar = this.f36072p;
        Context context = recyclerView.getContext();
        float f6 = fVar.f39833a;
        if (f6 <= 0.0f) {
            f6 = context.getResources().getDimension(C5284R.dimen.m3_carousel_small_item_size_min);
        }
        fVar.f39833a = f6;
        float f9 = fVar.f39834b;
        if (f9 <= 0.0f) {
            f9 = context.getResources().getDimension(C5284R.dimen.m3_carousel_small_item_size_max);
        }
        fVar.f39834b = f9;
        l0();
        recyclerView.addOnLayoutChangeListener(this.f36074r);
    }

    @Override // t0.AbstractC5019C
    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f36074r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (B0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (B0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // t0.AbstractC5019C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, BP bp, C5029M c5029m) {
        char c4;
        if (v() == 0) {
            return null;
        }
        int i4 = this.f36073q.f32624b;
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
                    if (AbstractC5019C.H(view) == 0) {
                        return null;
                    }
                    int H6 = AbstractC5019C.H(u(0)) - 1;
                    if (H6 < 0 || H6 >= B()) {
                        return u(B0() ? v() - 1 : 0);
                    }
                    this.f36073q.d();
                    throw null;
                }
                if (AbstractC5019C.H(view) == B() - 1) {
                    return null;
                }
                int H8 = AbstractC5019C.H(u(v() - 1)) + 1;
                if (H8 < 0 || H8 >= B()) {
                    return u(B0() ? 0 : v() - 1);
                }
                this.f36073q.d();
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

    @Override // t0.AbstractC5019C
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC5019C.H(u(0)));
            accessibilityEvent.setToIndex(AbstractC5019C.H(u(v() - 1)));
        }
    }

    @Override // t0.AbstractC5019C
    public final void W(int i, int i4) {
        B();
    }

    @Override // t0.AbstractC5019C
    public final void Z(int i, int i4) {
        B();
    }

    @Override // t0.InterfaceC5028L
    public final PointF a(int i) {
        return null;
    }

    @Override // t0.AbstractC5019C
    public final void b0(BP bp, C5029M c5029m) {
        if (c5029m.b() > 0) {
            if ((A0() ? this.f40574n : this.f40575o) > 0.0f) {
                B0();
                View view = bp.i(0, Long.MAX_VALUE).f40615a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        g0(bp);
    }

    @Override // t0.AbstractC5019C
    public final void c0(C5029M c5029m) {
        if (v() == 0) {
            return;
        }
        AbstractC5019C.H(u(0));
    }

    @Override // t0.AbstractC5019C
    public final boolean d() {
        return A0();
    }

    @Override // t0.AbstractC5019C
    public final boolean e() {
        return !A0();
    }

    @Override // t0.AbstractC5019C
    public final int j(C5029M c5029m) {
        v();
        return 0;
    }

    @Override // t0.AbstractC5019C
    public final int k(C5029M c5029m) {
        return 0;
    }

    @Override // t0.AbstractC5019C
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z9) {
        return false;
    }

    @Override // t0.AbstractC5019C
    public final int l(C5029M c5029m) {
        return 0;
    }

    @Override // t0.AbstractC5019C
    public final int m(C5029M c5029m) {
        v();
        return 0;
    }

    @Override // t0.AbstractC5019C
    public final int m0(int i, BP bp, C5029M c5029m) {
        if (!A0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = bp.i(0, Long.MAX_VALUE).f40615a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // t0.AbstractC5019C
    public final int n(C5029M c5029m) {
        return 0;
    }

    @Override // t0.AbstractC5019C
    public final void n0(int i) {
    }

    @Override // t0.AbstractC5019C
    public final int o(C5029M c5029m) {
        return 0;
    }

    @Override // t0.AbstractC5019C
    public final int o0(int i, BP bp, C5029M c5029m) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = bp.i(0, Long.MAX_VALUE).f40615a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // t0.AbstractC5019C
    public final C5020D r() {
        return new C5020D(-2, -2);
    }

    @Override // t0.AbstractC5019C
    public final void x0(RecyclerView recyclerView, int i) {
        C4859b c4859b = new C4859b(0, recyclerView.getContext(), this);
        c4859b.f40779a = i;
        y0(c4859b);
    }

    @Override // t0.AbstractC5019C
    public final void y(Rect rect, View view) {
        super.y(rect, view);
        rect.centerY();
        if (A0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        new c();
        this.f36074r = new View.OnLayoutChangeListener() { // from class: p3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i42, int i92, int i10, int i11, int i12, int i13, int i14) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (i9 == i11 && i42 == i12 && i92 == i13 && i10 == i14) {
                    return;
                }
                view.post(new RunnableC0281a(26, carouselLayoutManager));
            }
        };
        this.f36072p = new f();
        l0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4576a.f38293b);
            obtainStyledAttributes.getInt(0, 0);
            l0();
            C0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
