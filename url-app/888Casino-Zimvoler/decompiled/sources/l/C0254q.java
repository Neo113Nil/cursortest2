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
    public final View f3020a;
    public i1.g d;

    /* renamed from: e, reason: collision with root package name */
    public i1.g f3023e;

    /* renamed from: f, reason: collision with root package name */
    public i1.g f3024f;

    /* renamed from: c, reason: collision with root package name */
    public int f3022c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0264v f3021b = C0264v.a();

    public C0254q(View view) {
        this.f3020a = view;
    }

    public final void a() {
        View view = this.f3020a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3024f == null) {
                    this.f3024f = new i1.g();
                }
                i1.g gVar = this.f3024f;
                gVar.f2423c = null;
                gVar.f2422b = false;
                gVar.d = null;
                gVar.f2421a = false;
                WeakHashMap weakHashMap = K.T.f381a;
                ColorStateList g2 = K.H.g(view);
                if (g2 != null) {
                    gVar.f2422b = true;
                    gVar.f2423c = g2;
                }
                PorterDuff.Mode h = K.H.h(view);
                if (h != null) {
                    gVar.f2421a = true;
                    gVar.d = h;
                }
                if (gVar.f2422b || gVar.f2421a) {
                    C0264v.e(background, gVar, view.getDrawableState());
                    return;
                }
            }
            i1.g gVar2 = this.f3023e;
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
        i1.g gVar = this.f3023e;
        if (gVar != null) {
            return (ColorStateList) gVar.f2423c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        i1.g gVar = this.f3023e;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3020a;
        Context context = view.getContext();
        int[] iArr = f.a.f1942y;
        C0012l r2 = C0012l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f432c;
        View view2 = this.f3020a;
        K.T.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f432c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3022c = typedArray.getResourceId(0, -1);
                C0264v c0264v = this.f3021b;
                Context context2 = view.getContext();
                int i2 = this.f3022c;
                synchronized (c0264v) {
                    f2 = c0264v.f3053a.f(context2, i2);
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
        this.f3022c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3022c = i;
        C0264v c0264v = this.f3021b;
        if (c0264v != null) {
            Context context = this.f3020a.getContext();
            synchronized (c0264v) {
                colorStateList = c0264v.f3053a.f(context, i);
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
            gVar.f2423c = colorStateList;
            gVar.f2422b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3023e == null) {
            this.f3023e = new i1.g();
        }
        i1.g gVar = this.f3023e;
        gVar.f2423c = colorStateList;
        gVar.f2422b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3023e == null) {
            this.f3023e = new i1.g();
        }
        i1.g gVar = this.f3023e;
        gVar.d = mode;
        gVar.f2421a = true;
        a();
    }
}
