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
public final class C0236p {

    /* renamed from: a, reason: collision with root package name */
    public final View f2970a;
    public U0 d;

    /* renamed from: e, reason: collision with root package name */
    public U0 f2973e;

    /* renamed from: f, reason: collision with root package name */
    public U0 f2974f;

    /* renamed from: c, reason: collision with root package name */
    public int f2972c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0246u f2971b = C0246u.a();

    public C0236p(View view) {
        this.f2970a = view;
    }

    public final void a() {
        View view = this.f2970a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f2974f == null) {
                    this.f2974f = new U0();
                }
                U0 u02 = this.f2974f;
                u02.f2869c = null;
                u02.f2868b = false;
                u02.d = null;
                u02.f2867a = false;
                WeakHashMap weakHashMap = K.S.f369a;
                ColorStateList g2 = K.G.g(view);
                if (g2 != null) {
                    u02.f2868b = true;
                    u02.f2869c = g2;
                }
                PorterDuff.Mode h = K.G.h(view);
                if (h != null) {
                    u02.f2867a = true;
                    u02.d = h;
                }
                if (u02.f2868b || u02.f2867a) {
                    C0246u.e(background, u02, view.getDrawableState());
                    return;
                }
            }
            U0 u03 = this.f2973e;
            if (u03 != null) {
                C0246u.e(background, u03, view.getDrawableState());
                return;
            }
            U0 u04 = this.d;
            if (u04 != null) {
                C0246u.e(background, u04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        U0 u02 = this.f2973e;
        if (u02 != null) {
            return (ColorStateList) u02.f2869c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        U0 u02 = this.f2973e;
        if (u02 != null) {
            return (PorterDuff.Mode) u02.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f2970a;
        Context context = view.getContext();
        int[] iArr = f.a.f2011y;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f423c;
        View view2 = this.f2970a;
        K.S.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f423c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f2972c = typedArray.getResourceId(0, -1);
                C0246u c0246u = this.f2971b;
                Context context2 = view.getContext();
                int i2 = this.f2972c;
                synchronized (c0246u) {
                    f2 = c0246u.f3006a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.G.q(view, r2.g(1));
            }
            if (typedArray.hasValue(2)) {
                K.G.r(view, AbstractC0233n0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            r2.t();
        }
    }

    public final void e() {
        this.f2972c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f2972c = i;
        C0246u c0246u = this.f2971b;
        if (c0246u != null) {
            Context context = this.f2970a.getContext();
            synchronized (c0246u) {
                colorStateList = c0246u.f3006a.f(context, i);
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
            u02.f2869c = colorStateList;
            u02.f2868b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f2973e == null) {
            this.f2973e = new U0();
        }
        U0 u02 = this.f2973e;
        u02.f2869c = colorStateList;
        u02.f2868b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f2973e == null) {
            this.f2973e = new U0();
        }
        U0 u02 = this.f2973e;
        u02.d = mode;
        u02.f2867a = true;
        a();
    }
}
