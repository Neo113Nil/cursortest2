package l;

import E.AbstractC0018t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import g.AbstractC0328a;
import java.lang.reflect.Field;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092n {

    /* renamed from: a, reason: collision with root package name */
    public final View f9854a;

    /* renamed from: b, reason: collision with root package name */
    public final C1093o f9855b;

    /* renamed from: c, reason: collision with root package name */
    public int f9856c = -1;

    /* renamed from: d, reason: collision with root package name */
    public j0 f9857d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f9858e;
    public j0 f;

    public C1092n(View view) {
        C1093o c1093o;
        this.f9854a = view;
        PorterDuff.Mode mode = C1093o.f9861b;
        synchronized (C1093o.class) {
            try {
                if (C1093o.f9862c == null) {
                    C1093o.b();
                }
                c1093o = C1093o.f9862c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9855b = c1093o;
    }

    public final void a() {
        View view = this.f9854a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f9857d != null) {
                if (this.f == null) {
                    this.f = new j0();
                }
                j0 j0Var = this.f;
                j0Var.f9837a = null;
                j0Var.f9840d = false;
                j0Var.f9838b = null;
                j0Var.f9839c = false;
                Field field = E.A.f243a;
                ColorStateList b3 = AbstractC0018t.b(view);
                if (b3 != null) {
                    j0Var.f9840d = true;
                    j0Var.f9837a = b3;
                }
                PorterDuff.Mode c3 = AbstractC0018t.c(view);
                if (c3 != null) {
                    j0Var.f9839c = true;
                    j0Var.f9838b = c3;
                }
                if (j0Var.f9840d || j0Var.f9839c) {
                    C1093o.c(background, j0Var, view.getDrawableState());
                    return;
                }
            }
            j0 j0Var2 = this.f9858e;
            if (j0Var2 != null) {
                C1093o.c(background, j0Var2, view.getDrawableState());
                return;
            }
            j0 j0Var3 = this.f9857d;
            if (j0Var3 != null) {
                C1093o.c(background, j0Var3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i3) {
        ColorStateList f;
        View view = this.f9854a;
        A0.f K2 = A0.f.K(view.getContext(), attributeSet, AbstractC0328a.f5007u, i3);
        TypedArray typedArray = (TypedArray) K2.f24c;
        try {
            if (typedArray.hasValue(0)) {
                this.f9856c = typedArray.getResourceId(0, -1);
                C1093o c1093o = this.f9855b;
                Context context = view.getContext();
                int i4 = this.f9856c;
                synchronized (c1093o) {
                    f = c1093o.f9863a.f(context, i4);
                }
                if (f != null) {
                    d(f);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList B3 = K2.B(1);
                Field field = E.A.f243a;
                AbstractC0018t.d(view, B3);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c3 = AbstractC1103z.c(typedArray.getInt(2, -1), null);
                Field field2 = E.A.f243a;
                AbstractC0018t.e(view, c3);
            }
        } finally {
            K2.O();
        }
    }

    public final void c(int i3) {
        ColorStateList colorStateList;
        this.f9856c = i3;
        C1093o c1093o = this.f9855b;
        if (c1093o != null) {
            Context context = this.f9854a.getContext();
            synchronized (c1093o) {
                colorStateList = c1093o.f9863a.f(context, i3);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f9857d == null) {
                this.f9857d = new j0();
            }
            j0 j0Var = this.f9857d;
            j0Var.f9837a = colorStateList;
            j0Var.f9840d = true;
        } else {
            this.f9857d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f9858e == null) {
            this.f9858e = new j0();
        }
        j0 j0Var = this.f9858e;
        j0Var.f9837a = colorStateList;
        j0Var.f9840d = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f9858e == null) {
            this.f9858e = new j0();
        }
        j0 j0Var = this.f9858e;
        j0Var.f9838b = mode;
        j0Var.f9839c = true;
        a();
    }
}
