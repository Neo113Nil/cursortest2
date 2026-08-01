package l;

import K.C0012l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254q {

    /* renamed from: a, reason: collision with root package name */
    public final View f3042a;
    public i1.g d;

    /* renamed from: e, reason: collision with root package name */
    public i1.g f3045e;

    /* renamed from: f, reason: collision with root package name */
    public i1.g f3046f;

    /* renamed from: c, reason: collision with root package name */
    public int f3044c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0264v f3043b = C0264v.a();

    public C0254q(View view) {
        this.f3042a = view;
    }

    public final void a() {
        View view = this.f3042a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3046f == null) {
                    this.f3046f = new i1.g();
                }
                i1.g gVar = this.f3046f;
                gVar.f2426c = null;
                gVar.f2425b = false;
                gVar.d = null;
                gVar.f2424a = false;
                WeakHashMap weakHashMap = K.T.f381a;
                ColorStateList g2 = K.H.g(view);
                if (g2 != null) {
                    gVar.f2425b = true;
                    gVar.f2426c = g2;
                }
                PorterDuff.Mode h = K.H.h(view);
                if (h != null) {
                    gVar.f2424a = true;
                    gVar.d = h;
                }
                if (gVar.f2425b || gVar.f2424a) {
                    C0264v.e(background, gVar, view.getDrawableState());
                    return;
                }
            }
            i1.g gVar2 = this.f3045e;
            if (gVar2 != null) {
                C0264v.e(background, gVar2, view.getDrawableState());
                return;
            }
            i1.g gVar3 = this.d;
            if (gVar3 != null) {
                C0264v.e(background, gVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        i1.g gVar = this.f3045e;
        if (gVar != null) {
            return (ColorStateList) gVar.f2426c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        i1.g gVar = this.f3045e;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3042a;
        Context context = view.getContext();
        int[] iArr = f.a.f1945y;
        C0012l r2 = C0012l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f432c;
        View view2 = this.f3042a;
        K.T.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f432c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3044c = typedArray.getResourceId(0, -1);
                C0264v c0264v = this.f3043b;
                Context context2 = view.getContext();
                int i2 = this.f3044c;
                synchronized (c0264v) {
                    f2 = c0264v.f3075a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.H.q(view, r2.g(1));
            }
            if (typedArray.hasValue(2)) {
                K.H.r(view, AbstractC0249n0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            r2.t();
        }
    }

    public final void e() {
        this.f3044c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3044c = i;
        C0264v c0264v = this.f3043b;
        if (c0264v != null) {
            Context context = this.f3042a.getContext();
            synchronized (c0264v) {
                colorStateList = c0264v.f3075a.f(context, i);
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
                this.d = new i1.g();
            }
            i1.g gVar = this.d;
            gVar.f2426c = colorStateList;
            gVar.f2425b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3045e == null) {
            this.f3045e = new i1.g();
        }
        i1.g gVar = this.f3045e;
        gVar.f2426c = colorStateList;
        gVar.f2425b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3045e == null) {
            this.f3045e = new i1.g();
        }
        i1.g gVar = this.f3045e;
        gVar.d = mode;
        gVar.f2424a = true;
        a();
    }
}
