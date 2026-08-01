package m;

import L.C0014l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import f.AbstractC0097a;
import java.util.WeakHashMap;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231p {

    /* renamed from: a, reason: collision with root package name */
    public final View f3161a;
    public Z0 d;

    /* renamed from: e, reason: collision with root package name */
    public Z0 f3164e;

    /* renamed from: f, reason: collision with root package name */
    public Z0 f3165f;

    /* renamed from: c, reason: collision with root package name */
    public int f3163c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0241u f3162b = C0241u.a();

    public C0231p(View view) {
        this.f3161a = view;
    }

    public final void a() {
        View view = this.f3161a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3165f == null) {
                    this.f3165f = new Z0();
                }
                Z0 z02 = this.f3165f;
                z02.f3064c = null;
                z02.f3063b = false;
                z02.d = null;
                z02.f3062a = false;
                WeakHashMap weakHashMap = L.T.f490a;
                ColorStateList g2 = L.H.g(view);
                if (g2 != null) {
                    z02.f3063b = true;
                    z02.f3064c = g2;
                }
                PorterDuff.Mode h2 = L.H.h(view);
                if (h2 != null) {
                    z02.f3062a = true;
                    z02.d = h2;
                }
                if (z02.f3063b || z02.f3062a) {
                    C0241u.e(background, z02, view.getDrawableState());
                    return;
                }
            }
            Z0 z03 = this.f3164e;
            if (z03 != null) {
                C0241u.e(background, z03, view.getDrawableState());
                return;
            }
            Z0 z04 = this.d;
            if (z04 != null) {
                C0241u.e(background, z04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        Z0 z02 = this.f3164e;
        if (z02 != null) {
            return (ColorStateList) z02.f3064c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        Z0 z02 = this.f3164e;
        if (z02 != null) {
            return (PorterDuff.Mode) z02.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3161a;
        Context context = view.getContext();
        int[] iArr = AbstractC0097a.f2159z;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i2.f543b;
        View view2 = this.f3161a;
        L.T.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) i2.f543b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3163c = typedArray.getResourceId(0, -1);
                C0241u c0241u = this.f3162b;
                Context context2 = view.getContext();
                int i3 = this.f3163c;
                synchronized (c0241u) {
                    f2 = c0241u.f3188a.f(context2, i3);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                L.H.q(view, i2.b(1));
            }
            if (typedArray.hasValue(2)) {
                L.H.r(view, AbstractC0234q0.c(typedArray.getInt(2, -1), null));
            }
        } finally {
            i2.k();
        }
    }

    public final void e() {
        this.f3163c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3163c = i;
        C0241u c0241u = this.f3162b;
        if (c0241u != null) {
            Context context = this.f3161a.getContext();
            synchronized (c0241u) {
                colorStateList = c0241u.f3188a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new Z0();
            }
            Z0 z02 = this.d;
            z02.f3064c = colorStateList;
            z02.f3063b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3164e == null) {
            this.f3164e = new Z0();
        }
        Z0 z02 = this.f3164e;
        z02.f3064c = colorStateList;
        z02.f3063b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3164e == null) {
            this.f3164e = new Z0();
        }
        Z0 z02 = this.f3164e;
        z02.d = mode;
        z02.f3062a = true;
        a();
    }
}
