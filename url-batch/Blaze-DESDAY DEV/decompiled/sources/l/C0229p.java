package l;

import K.C0014l;
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
public final class C0229p {

    /* renamed from: a, reason: collision with root package name */
    public final View f2990a;
    public T0 d;

    /* renamed from: e, reason: collision with root package name */
    public T0 f2993e;

    /* renamed from: f, reason: collision with root package name */
    public T0 f2994f;

    /* renamed from: c, reason: collision with root package name */
    public int f2992c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0239u f2991b = C0239u.a();

    public C0229p(View view) {
        this.f2990a = view;
    }

    public final void a() {
        View view = this.f2990a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f2994f == null) {
                    this.f2994f = new T0();
                }
                T0 t02 = this.f2994f;
                t02.f2885c = null;
                t02.f2884b = false;
                t02.d = null;
                t02.f2883a = false;
                WeakHashMap weakHashMap = K.T.f440a;
                ColorStateList g2 = K.H.g(view);
                if (g2 != null) {
                    t02.f2884b = true;
                    t02.f2885c = g2;
                }
                PorterDuff.Mode h = K.H.h(view);
                if (h != null) {
                    t02.f2883a = true;
                    t02.d = h;
                }
                if (t02.f2884b || t02.f2883a) {
                    C0239u.e(background, t02, view.getDrawableState());
                    return;
                }
            }
            T0 t03 = this.f2993e;
            if (t03 != null) {
                C0239u.e(background, t03, view.getDrawableState());
                return;
            }
            T0 t04 = this.d;
            if (t04 != null) {
                C0239u.e(background, t04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        T0 t02 = this.f2993e;
        if (t02 != null) {
            return (ColorStateList) t02.f2885c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        T0 t02 = this.f2993e;
        if (t02 != null) {
            return (PorterDuff.Mode) t02.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f2990a;
        Context context = view.getContext();
        int[] iArr = f.a.f2119y;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i2.f492b;
        View view2 = this.f2990a;
        K.T.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) i2.f492b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f2992c = typedArray.getResourceId(0, -1);
                C0239u c0239u = this.f2991b;
                Context context2 = view.getContext();
                int i3 = this.f2992c;
                synchronized (c0239u) {
                    f2 = c0239u.f3023a.f(context2, i3);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.H.q(view, i2.b(1));
            }
            if (typedArray.hasValue(2)) {
                K.H.r(view, AbstractC0224m0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            i2.k();
        }
    }

    public final void e() {
        this.f2992c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f2992c = i;
        C0239u c0239u = this.f2991b;
        if (c0239u != null) {
            Context context = this.f2990a.getContext();
            synchronized (c0239u) {
                colorStateList = c0239u.f3023a.f(context, i);
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
            t02.f2885c = colorStateList;
            t02.f2884b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f2993e == null) {
            this.f2993e = new T0();
        }
        T0 t02 = this.f2993e;
        t02.f2885c = colorStateList;
        t02.f2884b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f2993e == null) {
            this.f2993e = new T0();
        }
        T0 t02 = this.f2993e;
        t02.d = mode;
        t02.f2883a = true;
        a();
    }
}
