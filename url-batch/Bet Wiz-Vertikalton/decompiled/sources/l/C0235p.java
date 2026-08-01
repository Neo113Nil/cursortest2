package l;

import K.C0011l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235p {

    /* renamed from: a, reason: collision with root package name */
    public final View f3026a;
    public T0 d;

    /* renamed from: e, reason: collision with root package name */
    public T0 f3029e;

    /* renamed from: f, reason: collision with root package name */
    public T0 f3030f;

    /* renamed from: c, reason: collision with root package name */
    public int f3028c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0245u f3027b = C0245u.a();

    public C0235p(View view) {
        this.f3026a = view;
    }

    public final void a() {
        View view = this.f3026a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3030f == null) {
                    this.f3030f = new T0();
                }
                T0 t02 = this.f3030f;
                t02.f2921c = null;
                t02.f2920b = false;
                t02.d = null;
                t02.f2919a = false;
                WeakHashMap weakHashMap = K.S.f422a;
                ColorStateList g2 = K.G.g(view);
                if (g2 != null) {
                    t02.f2920b = true;
                    t02.f2921c = g2;
                }
                PorterDuff.Mode h = K.G.h(view);
                if (h != null) {
                    t02.f2919a = true;
                    t02.d = h;
                }
                if (t02.f2920b || t02.f2919a) {
                    C0245u.e(background, t02, view.getDrawableState());
                    return;
                }
            }
            T0 t03 = this.f3029e;
            if (t03 != null) {
                C0245u.e(background, t03, view.getDrawableState());
                return;
            }
            T0 t04 = this.d;
            if (t04 != null) {
                C0245u.e(background, t04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        T0 t02 = this.f3029e;
        if (t02 != null) {
            return (ColorStateList) t02.f2921c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        T0 t02 = this.f3029e;
        if (t02 != null) {
            return (PorterDuff.Mode) t02.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3026a;
        Context context = view.getContext();
        int[] iArr = f.a.f2078y;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f476c;
        View view2 = this.f3026a;
        K.S.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f476c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3028c = typedArray.getResourceId(0, -1);
                C0245u c0245u = this.f3027b;
                Context context2 = view.getContext();
                int i2 = this.f3028c;
                synchronized (c0245u) {
                    f2 = c0245u.f3059a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.G.q(view, r2.g(1));
            }
            if (typedArray.hasValue(2)) {
                K.G.r(view, AbstractC0230m0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            r2.t();
        }
    }

    public final void e() {
        this.f3028c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3028c = i;
        C0245u c0245u = this.f3027b;
        if (c0245u != null) {
            Context context = this.f3026a.getContext();
            synchronized (c0245u) {
                colorStateList = c0245u.f3059a.f(context, i);
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
                this.d = new T0();
            }
            T0 t02 = this.d;
            t02.f2921c = colorStateList;
            t02.f2920b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3029e == null) {
            this.f3029e = new T0();
        }
        T0 t02 = this.f3029e;
        t02.f2921c = colorStateList;
        t02.f2920b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3029e == null) {
            this.f3029e = new T0();
        }
        T0 t02 = this.f3029e;
        t02.d = mode;
        t02.f2919a = true;
        a();
    }
}
