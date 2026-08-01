package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import u0.C0372k;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252p {

    /* renamed from: a, reason: collision with root package name */
    public final View f3441a;
    public S0 d;

    /* renamed from: e, reason: collision with root package name */
    public S0 f3444e;

    /* renamed from: f, reason: collision with root package name */
    public S0 f3445f;

    /* renamed from: c, reason: collision with root package name */
    public int f3443c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0260t f3442b = C0260t.a();

    public C0252p(View view) {
        this.f3441a = view;
    }

    public final void a() {
        View view = this.f3441a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3445f == null) {
                    this.f3445f = new S0();
                }
                S0 s0 = this.f3445f;
                s0.f3338c = null;
                s0.f3337b = false;
                s0.d = null;
                s0.f3336a = false;
                WeakHashMap weakHashMap = K.Q.f578a;
                ColorStateList g2 = K.F.g(view);
                if (g2 != null) {
                    s0.f3337b = true;
                    s0.f3338c = g2;
                }
                PorterDuff.Mode h = K.F.h(view);
                if (h != null) {
                    s0.f3336a = true;
                    s0.d = h;
                }
                if (s0.f3337b || s0.f3336a) {
                    C0260t.e(background, s0, view.getDrawableState());
                    return;
                }
            }
            S0 s02 = this.f3444e;
            if (s02 != null) {
                C0260t.e(background, s02, view.getDrawableState());
                return;
            }
            S0 s03 = this.d;
            if (s03 != null) {
                C0260t.e(background, s03, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        S0 s0 = this.f3444e;
        if (s0 != null) {
            return (ColorStateList) s0.f3338c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        S0 s0 = this.f3444e;
        if (s0 != null) {
            return (PorterDuff.Mode) s0.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3441a;
        Context context = view.getContext();
        int[] iArr = f.a.f2535y;
        C0372k j2 = C0372k.j(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) j2.f4191b;
        View view2 = this.f3441a;
        K.Q.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) j2.f4191b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3443c = typedArray.getResourceId(0, -1);
                C0260t c0260t = this.f3442b;
                Context context2 = view.getContext();
                int i2 = this.f3443c;
                synchronized (c0260t) {
                    f2 = c0260t.f3469a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.F.q(view, j2.c(1));
            }
            if (typedArray.hasValue(2)) {
                K.F.r(view, AbstractC0245l0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            j2.l();
        }
    }

    public final void e() {
        this.f3443c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3443c = i;
        C0260t c0260t = this.f3442b;
        if (c0260t != null) {
            Context context = this.f3441a.getContext();
            synchronized (c0260t) {
                colorStateList = c0260t.f3469a.f(context, i);
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
                this.d = new S0();
            }
            S0 s0 = this.d;
            s0.f3338c = colorStateList;
            s0.f3337b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3444e == null) {
            this.f3444e = new S0();
        }
        S0 s0 = this.f3444e;
        s0.f3338c = colorStateList;
        s0.f3337b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3444e == null) {
            this.f3444e = new S0();
        }
        S0 s0 = this.f3444e;
        s0.d = mode;
        s0.f3336a = true;
        a();
    }
}
