package h;

import L.C0026b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import c.AbstractC0098a;
import java.lang.reflect.Field;
import w.AbstractC0270p;

/* renamed from: h.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161n {

    /* renamed from: a, reason: collision with root package name */
    public final View f2239a;

    /* renamed from: b, reason: collision with root package name */
    public final C0162o f2240b;

    /* renamed from: c, reason: collision with root package name */
    public int f2241c = -1;

    /* renamed from: d, reason: collision with root package name */
    public j0 f2242d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f2243e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f2244f;

    public C0161n(View view) {
        C0162o c0162o;
        this.f2239a = view;
        PorterDuff.Mode mode = C0162o.f2247b;
        synchronized (C0162o.class) {
            try {
                if (C0162o.f2248c == null) {
                    C0162o.b();
                }
                c0162o = C0162o.f2248c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2240b = c0162o;
    }

    public final void a() {
        View view = this.f2239a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f2242d != null) {
                if (this.f2244f == null) {
                    this.f2244f = new j0();
                }
                j0 j0Var = this.f2244f;
                j0Var.f2221a = null;
                j0Var.f2224d = false;
                j0Var.f2222b = null;
                j0Var.f2223c = false;
                Field field = w.x.f3075a;
                ColorStateList g2 = AbstractC0270p.g(view);
                if (g2 != null) {
                    j0Var.f2224d = true;
                    j0Var.f2221a = g2;
                }
                PorterDuff.Mode h2 = AbstractC0270p.h(view);
                if (h2 != null) {
                    j0Var.f2223c = true;
                    j0Var.f2222b = h2;
                }
                if (j0Var.f2224d || j0Var.f2223c) {
                    C0162o.c(background, j0Var, view.getDrawableState());
                    return;
                }
            }
            j0 j0Var2 = this.f2243e;
            if (j0Var2 != null) {
                C0162o.c(background, j0Var2, view.getDrawableState());
                return;
            }
            j0 j0Var3 = this.f2242d;
            if (j0Var3 != null) {
                C0162o.c(background, j0Var3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i2) {
        ColorStateList f2;
        View view = this.f2239a;
        C0026b E2 = C0026b.E(view.getContext(), attributeSet, AbstractC0098a.f1659u, i2);
        TypedArray typedArray = (TypedArray) E2.f520f;
        try {
            if (typedArray.hasValue(0)) {
                this.f2241c = typedArray.getResourceId(0, -1);
                C0162o c0162o = this.f2240b;
                Context context = view.getContext();
                int i3 = this.f2241c;
                synchronized (c0162o) {
                    f2 = c0162o.f2249a.f(context, i3);
                }
                if (f2 != null) {
                    d(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList w2 = E2.w(1);
                Field field = w.x.f3075a;
                AbstractC0270p.q(view, w2);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c2 = AbstractC0171y.c(typedArray.getInt(2, -1), null);
                Field field2 = w.x.f3075a;
                AbstractC0270p.r(view, c2);
            }
        } finally {
            E2.H();
        }
    }

    public final void c(int i2) {
        ColorStateList colorStateList;
        this.f2241c = i2;
        C0162o c0162o = this.f2240b;
        if (c0162o != null) {
            Context context = this.f2239a.getContext();
            synchronized (c0162o) {
                colorStateList = c0162o.f2249a.f(context, i2);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2242d == null) {
                this.f2242d = new j0();
            }
            j0 j0Var = this.f2242d;
            j0Var.f2221a = colorStateList;
            j0Var.f2224d = true;
        } else {
            this.f2242d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f2243e == null) {
            this.f2243e = new j0();
        }
        j0 j0Var = this.f2243e;
        j0Var.f2221a = colorStateList;
        j0Var.f2224d = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f2243e == null) {
            this.f2243e = new j0();
        }
        j0 j0Var = this.f2243e;
        j0Var.f2222b = mode;
        j0Var.f2223c = true;
        a();
    }
}
