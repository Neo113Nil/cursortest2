package l;

import K.C0012m;
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
public final class C0231p {

    /* renamed from: a, reason: collision with root package name */
    public final View f3020a;
    public S0 d;

    /* renamed from: e, reason: collision with root package name */
    public S0 f3023e;

    /* renamed from: f, reason: collision with root package name */
    public S0 f3024f;

    /* renamed from: c, reason: collision with root package name */
    public int f3022c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0239t f3021b = C0239t.a();

    public C0231p(View view) {
        this.f3020a = view;
    }

    public final void a() {
        View view = this.f3020a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3024f == null) {
                    this.f3024f = new S0();
                }
                S0 s02 = this.f3024f;
                s02.f2913a = null;
                s02.d = false;
                s02.f2914b = null;
                s02.f2915c = false;
                WeakHashMap weakHashMap = K.S.f365a;
                ColorStateList g2 = K.G.g(view);
                if (g2 != null) {
                    s02.d = true;
                    s02.f2913a = g2;
                }
                PorterDuff.Mode h = K.G.h(view);
                if (h != null) {
                    s02.f2915c = true;
                    s02.f2914b = h;
                }
                if (s02.d || s02.f2915c) {
                    C0239t.e(background, s02, view.getDrawableState());
                    return;
                }
            }
            S0 s03 = this.f3023e;
            if (s03 != null) {
                C0239t.e(background, s03, view.getDrawableState());
                return;
            }
            S0 s04 = this.d;
            if (s04 != null) {
                C0239t.e(background, s04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        S0 s02 = this.f3023e;
        if (s02 != null) {
            return s02.f2913a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        S0 s02 = this.f3023e;
        if (s02 != null) {
            return s02.f2914b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3020a;
        Context context = view.getContext();
        int[] iArr = f.a.f2130y;
        C0012m r2 = C0012m.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f423c;
        View view2 = this.f3020a;
        K.S.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f423c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3022c = typedArray.getResourceId(0, -1);
                C0239t c0239t = this.f3021b;
                Context context2 = view.getContext();
                int i2 = this.f3022c;
                synchronized (c0239t) {
                    f2 = c0239t.f3050a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.G.q(view, r2.g(1));
            }
            if (typedArray.hasValue(2)) {
                K.G.r(view, AbstractC0224l0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            r2.t();
        }
    }

    public final void e() {
        this.f3022c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3022c = i;
        C0239t c0239t = this.f3021b;
        if (c0239t != null) {
            Context context = this.f3020a.getContext();
            synchronized (c0239t) {
                colorStateList = c0239t.f3050a.f(context, i);
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
            S0 s02 = this.d;
            s02.f2913a = colorStateList;
            s02.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3023e == null) {
            this.f3023e = new S0();
        }
        S0 s02 = this.f3023e;
        s02.f2913a = colorStateList;
        s02.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3023e == null) {
            this.f3023e = new S0();
        }
        S0 s02 = this.f3023e;
        s02.f2914b = mode;
        s02.f2915c = true;
        a();
    }
}
