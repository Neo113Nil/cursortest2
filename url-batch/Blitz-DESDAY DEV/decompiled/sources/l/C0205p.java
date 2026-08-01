package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import f.AbstractC0084a;
import java.util.WeakHashMap;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205p {

    /* renamed from: a, reason: collision with root package name */
    public final View f3043a;
    public U0 d;

    /* renamed from: e, reason: collision with root package name */
    public U0 f3046e;

    /* renamed from: f, reason: collision with root package name */
    public U0 f3047f;

    /* renamed from: c, reason: collision with root package name */
    public int f3045c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0214u f3044b = C0214u.a();

    public C0205p(View view) {
        this.f3043a = view;
    }

    public final void a() {
        View view = this.f3043a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3047f == null) {
                    this.f3047f = new U0();
                }
                U0 u02 = this.f3047f;
                u02.f2942c = null;
                u02.f2941b = false;
                u02.d = null;
                u02.f2940a = false;
                WeakHashMap weakHashMap = M.Q.f513a;
                ColorStateList g2 = M.F.g(view);
                if (g2 != null) {
                    u02.f2941b = true;
                    u02.f2942c = g2;
                }
                PorterDuff.Mode h = M.F.h(view);
                if (h != null) {
                    u02.f2940a = true;
                    u02.d = h;
                }
                if (u02.f2941b || u02.f2940a) {
                    C0214u.e(background, u02, view.getDrawableState());
                    return;
                }
            }
            U0 u03 = this.f3046e;
            if (u03 != null) {
                C0214u.e(background, u03, view.getDrawableState());
                return;
            }
            U0 u04 = this.d;
            if (u04 != null) {
                C0214u.e(background, u04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        U0 u02 = this.f3046e;
        if (u02 != null) {
            return (ColorStateList) u02.f2942c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        U0 u02 = this.f3046e;
        if (u02 != null) {
            return (PorterDuff.Mode) u02.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3043a;
        Context context = view.getContext();
        int[] iArr = AbstractC0084a.f2148y;
        A1.j t2 = A1.j.t(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) t2.f81c;
        View view2 = this.f3043a;
        M.Q.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) t2.f81c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3045c = typedArray.getResourceId(0, -1);
                C0214u c0214u = this.f3044b;
                Context context2 = view.getContext();
                int i2 = this.f3045c;
                synchronized (c0214u) {
                    f2 = c0214u.f3079a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                M.F.q(view, t2.i(1));
            }
            if (typedArray.hasValue(2)) {
                M.F.r(view, AbstractC0202n0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            t2.v();
        }
    }

    public final void e() {
        this.f3045c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3045c = i;
        C0214u c0214u = this.f3044b;
        if (c0214u != null) {
            Context context = this.f3043a.getContext();
            synchronized (c0214u) {
                colorStateList = c0214u.f3079a.f(context, i);
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
                this.d = new U0();
            }
            U0 u02 = this.d;
            u02.f2942c = colorStateList;
            u02.f2941b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3046e == null) {
            this.f3046e = new U0();
        }
        U0 u02 = this.f3046e;
        u02.f2942c = colorStateList;
        u02.f2941b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3046e == null) {
            this.f3046e = new U0();
        }
        U0 u02 = this.f3046e;
        u02.d = mode;
        u02.f2940a = true;
        a();
    }
}
