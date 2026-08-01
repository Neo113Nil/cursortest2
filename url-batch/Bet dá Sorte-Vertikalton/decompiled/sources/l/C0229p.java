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
public final class C0229p {

    /* renamed from: a, reason: collision with root package name */
    public final View f3005a;
    public S0 d;

    /* renamed from: e, reason: collision with root package name */
    public S0 f3008e;

    /* renamed from: f, reason: collision with root package name */
    public S0 f3009f;

    /* renamed from: c, reason: collision with root package name */
    public int f3007c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0237t f3006b = C0237t.a();

    public C0229p(View view) {
        this.f3005a = view;
    }

    public final void a() {
        View view = this.f3005a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3009f == null) {
                    this.f3009f = new S0();
                }
                S0 s02 = this.f3009f;
                s02.f2900c = null;
                s02.f2899b = false;
                s02.d = null;
                s02.f2898a = false;
                WeakHashMap weakHashMap = K.S.f351a;
                ColorStateList g2 = K.G.g(view);
                if (g2 != null) {
                    s02.f2899b = true;
                    s02.f2900c = g2;
                }
                PorterDuff.Mode h = K.G.h(view);
                if (h != null) {
                    s02.f2898a = true;
                    s02.d = h;
                }
                if (s02.f2899b || s02.f2898a) {
                    C0237t.e(background, s02, view.getDrawableState());
                    return;
                }
            }
            S0 s03 = this.f3008e;
            if (s03 != null) {
                C0237t.e(background, s03, view.getDrawableState());
                return;
            }
            S0 s04 = this.d;
            if (s04 != null) {
                C0237t.e(background, s04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        S0 s02 = this.f3008e;
        if (s02 != null) {
            return (ColorStateList) s02.f2900c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        S0 s02 = this.f3008e;
        if (s02 != null) {
            return (PorterDuff.Mode) s02.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3005a;
        Context context = view.getContext();
        int[] iArr = f.a.f2053y;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f405c;
        View view2 = this.f3005a;
        K.S.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f405c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3007c = typedArray.getResourceId(0, -1);
                C0237t c0237t = this.f3006b;
                Context context2 = view.getContext();
                int i2 = this.f3007c;
                synchronized (c0237t) {
                    f2 = c0237t.f3035a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.G.q(view, r2.g(1));
            }
            if (typedArray.hasValue(2)) {
                K.G.r(view, AbstractC0222l0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            r2.t();
        }
    }

    public final void e() {
        this.f3007c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3007c = i;
        C0237t c0237t = this.f3006b;
        if (c0237t != null) {
            Context context = this.f3005a.getContext();
            synchronized (c0237t) {
                colorStateList = c0237t.f3035a.f(context, i);
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
            s02.f2900c = colorStateList;
            s02.f2899b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3008e == null) {
            this.f3008e = new S0();
        }
        S0 s02 = this.f3008e;
        s02.f2900c = colorStateList;
        s02.f2899b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3008e == null) {
            this.f3008e = new S0();
        }
        S0 s02 = this.f3008e;
        s02.d = mode;
        s02.f2898a = true;
        a();
    }
}
