package i;

import B0.C0008i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import d.AbstractC0119a;
import java.lang.reflect.Field;
import y.AbstractC0272p;

/* renamed from: i.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167n {

    /* renamed from: a, reason: collision with root package name */
    public final View f2267a;

    /* renamed from: b, reason: collision with root package name */
    public final C0168o f2268b;

    /* renamed from: c, reason: collision with root package name */
    public int f2269c = -1;

    /* renamed from: d, reason: collision with root package name */
    public j0 f2270d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f2271e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f2272f;

    public C0167n(View view) {
        C0168o c0168o;
        this.f2267a = view;
        PorterDuff.Mode mode = C0168o.f2275b;
        synchronized (C0168o.class) {
            try {
                if (C0168o.f2276c == null) {
                    C0168o.b();
                }
                c0168o = C0168o.f2276c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2268b = c0168o;
    }

    public final void a() {
        View view = this.f2267a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f2270d != null) {
                if (this.f2272f == null) {
                    this.f2272f = new j0();
                }
                j0 j0Var = this.f2272f;
                j0Var.f2249a = null;
                j0Var.f2252d = false;
                j0Var.f2250b = null;
                j0Var.f2251c = false;
                Field field = y.x.f3160a;
                ColorStateList g2 = AbstractC0272p.g(view);
                if (g2 != null) {
                    j0Var.f2252d = true;
                    j0Var.f2249a = g2;
                }
                PorterDuff.Mode h2 = AbstractC0272p.h(view);
                if (h2 != null) {
                    j0Var.f2251c = true;
                    j0Var.f2250b = h2;
                }
                if (j0Var.f2252d || j0Var.f2251c) {
                    C0168o.c(background, j0Var, view.getDrawableState());
                    return;
                }
            }
            j0 j0Var2 = this.f2271e;
            if (j0Var2 != null) {
                C0168o.c(background, j0Var2, view.getDrawableState());
                return;
            }
            j0 j0Var3 = this.f2270d;
            if (j0Var3 != null) {
                C0168o.c(background, j0Var3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i2) {
        ColorStateList f2;
        View view = this.f2267a;
        C0008i D2 = C0008i.D(view.getContext(), attributeSet, AbstractC0119a.f1806u, i2);
        TypedArray typedArray = (TypedArray) D2.f84f;
        try {
            if (typedArray.hasValue(0)) {
                this.f2269c = typedArray.getResourceId(0, -1);
                C0168o c0168o = this.f2268b;
                Context context = view.getContext();
                int i3 = this.f2269c;
                synchronized (c0168o) {
                    f2 = c0168o.f2277a.f(context, i3);
                }
                if (f2 != null) {
                    d(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList u2 = D2.u(1);
                Field field = y.x.f3160a;
                AbstractC0272p.q(view, u2);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c2 = AbstractC0178z.c(typedArray.getInt(2, -1), null);
                Field field2 = y.x.f3160a;
                AbstractC0272p.r(view, c2);
            }
        } finally {
            D2.G();
        }
    }

    public final void c(int i2) {
        ColorStateList colorStateList;
        this.f2269c = i2;
        C0168o c0168o = this.f2268b;
        if (c0168o != null) {
            Context context = this.f2267a.getContext();
            synchronized (c0168o) {
                colorStateList = c0168o.f2277a.f(context, i2);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2270d == null) {
                this.f2270d = new j0();
            }
            j0 j0Var = this.f2270d;
            j0Var.f2249a = colorStateList;
            j0Var.f2252d = true;
        } else {
            this.f2270d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f2271e == null) {
            this.f2271e = new j0();
        }
        j0 j0Var = this.f2271e;
        j0Var.f2249a = colorStateList;
        j0Var.f2252d = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f2271e == null) {
            this.f2271e = new j0();
        }
        j0 j0Var = this.f2271e;
        j0Var.f2250b = mode;
        j0Var.f2251c = true;
        a();
    }
}
