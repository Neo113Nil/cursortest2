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

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235q {

    /* renamed from: a, reason: collision with root package name */
    public final View f3120a;
    public k1.h d;

    /* renamed from: e, reason: collision with root package name */
    public k1.h f3123e;

    /* renamed from: f, reason: collision with root package name */
    public k1.h f3124f;

    /* renamed from: c, reason: collision with root package name */
    public int f3122c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0245v f3121b = C0245v.a();

    public C0235q(View view) {
        this.f3120a = view;
    }

    public final void a() {
        View view = this.f3120a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3124f == null) {
                    this.f3124f = new k1.h();
                }
                k1.h hVar = this.f3124f;
                hVar.f2804c = null;
                hVar.f2803b = false;
                hVar.d = null;
                hVar.f2802a = false;
                WeakHashMap weakHashMap = K.S.f362a;
                ColorStateList g2 = K.G.g(view);
                if (g2 != null) {
                    hVar.f2803b = true;
                    hVar.f2804c = g2;
                }
                PorterDuff.Mode h = K.G.h(view);
                if (h != null) {
                    hVar.f2802a = true;
                    hVar.d = h;
                }
                if (hVar.f2803b || hVar.f2802a) {
                    C0245v.e(background, hVar, view.getDrawableState());
                    return;
                }
            }
            k1.h hVar2 = this.f3123e;
            if (hVar2 != null) {
                C0245v.e(background, hVar2, view.getDrawableState());
                return;
            }
            k1.h hVar3 = this.d;
            if (hVar3 != null) {
                C0245v.e(background, hVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        k1.h hVar = this.f3123e;
        if (hVar != null) {
            return (ColorStateList) hVar.f2804c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        k1.h hVar = this.f3123e;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3120a;
        Context context = view.getContext();
        int[] iArr = f.a.f2010y;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f416c;
        View view2 = this.f3120a;
        K.S.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f416c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3122c = typedArray.getResourceId(0, -1);
                C0245v c0245v = this.f3121b;
                Context context2 = view.getContext();
                int i2 = this.f3122c;
                synchronized (c0245v) {
                    f2 = c0245v.f3153a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.G.q(view, r2.g(1));
            }
            if (typedArray.hasValue(2)) {
                K.G.r(view, AbstractC0230n0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            r2.t();
        }
    }

    public final void e() {
        this.f3122c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3122c = i;
        C0245v c0245v = this.f3121b;
        if (c0245v != null) {
            Context context = this.f3120a.getContext();
            synchronized (c0245v) {
                colorStateList = c0245v.f3153a.f(context, i);
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
                this.d = new k1.h();
            }
            k1.h hVar = this.d;
            hVar.f2804c = colorStateList;
            hVar.f2803b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3123e == null) {
            this.f3123e = new k1.h();
        }
        k1.h hVar = this.f3123e;
        hVar.f2804c = colorStateList;
        hVar.f2803b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3123e == null) {
            this.f3123e = new k1.h();
        }
        k1.h hVar = this.f3123e;
        hVar.d = mode;
        hVar.f2802a = true;
        a();
    }
}
