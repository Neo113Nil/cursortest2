package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class t3 {
    public final View a;
    public gc d;
    public gc e;
    public gc f;
    public int c = -1;
    public final y4 b = y4.a();

    public t3(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new gc();
                }
                gc gcVar = this.f;
                gcVar.c = null;
                gcVar.b = false;
                gcVar.d = null;
                gcVar.a = false;
                WeakHashMap weakHashMap = e90.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    gcVar.b = true;
                    gcVar.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    gcVar.a = true;
                    gcVar.d = backgroundTintMode;
                }
                if (gcVar.b || gcVar.a) {
                    y4.e(background, gcVar, view.getDrawableState());
                    return;
                }
            }
            gc gcVar2 = this.e;
            if (gcVar2 != null) {
                y4.e(background, gcVar2, view.getDrawableState());
                return;
            }
            gc gcVar3 = this.d;
            if (gcVar3 != null) {
                y4.e(background, gcVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        gc gcVar = this.e;
        if (gcVar != null) {
            return (ColorStateList) gcVar.c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        gc gcVar = this.e;
        if (gcVar != null) {
            return (PorterDuff.Mode) gcVar.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = my.y;
        r6 u = r6.u(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) u.b;
        View view2 = this.a;
        e90.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) u.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                y4 y4Var = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (y4Var) {
                    f = y4Var.a.f(context2, i2);
                }
                if (f != null) {
                    g(f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(u.j(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(xf.b(typedArray.getInt(2, -1), null));
            }
            u.w();
        } catch (Throwable th) {
            u.w();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.c = i;
        y4 y4Var = this.b;
        if (y4Var != null) {
            Context context = this.a.getContext();
            synchronized (y4Var) {
                colorStateList = y4Var.a.f(context, i);
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
                this.d = new gc();
            }
            gc gcVar = this.d;
            gcVar.c = colorStateList;
            gcVar.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new gc();
        }
        gc gcVar = this.e;
        gcVar.c = colorStateList;
        gcVar.b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new gc();
        }
        gc gcVar = this.e;
        gcVar.d = mode;
        gcVar.a = true;
        a();
    }
}
