package k;

import D.AbstractC0108v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import g.AbstractC0389a;
import java.lang.reflect.Field;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455n {

    /* renamed from: a, reason: collision with root package name */
    public final View f5062a;

    /* renamed from: b, reason: collision with root package name */
    public final C0456o f5063b;

    /* renamed from: c, reason: collision with root package name */
    public int f5064c = -1;

    /* renamed from: d, reason: collision with root package name */
    public X5.h f5065d;

    /* renamed from: e, reason: collision with root package name */
    public X5.h f5066e;

    /* renamed from: f, reason: collision with root package name */
    public X5.h f5067f;

    public C0455n(View view) {
        C0456o c0456o;
        this.f5062a = view;
        PorterDuff.Mode mode = C0456o.f5070b;
        synchronized (C0456o.class) {
            try {
                if (C0456o.f5071c == null) {
                    C0456o.b();
                }
                c0456o = C0456o.f5071c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5063b = c0456o;
    }

    public final void a() {
        View view = this.f5062a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f5065d != null) {
                if (this.f5067f == null) {
                    this.f5067f = new X5.h();
                }
                X5.h hVar = this.f5067f;
                hVar.f2938c = null;
                hVar.f2937b = false;
                hVar.f2939d = null;
                hVar.f2936a = false;
                Field field = D.D.f240a;
                ColorStateList g7 = AbstractC0108v.g(view);
                if (g7 != null) {
                    hVar.f2937b = true;
                    hVar.f2938c = g7;
                }
                PorterDuff.Mode h7 = AbstractC0108v.h(view);
                if (h7 != null) {
                    hVar.f2936a = true;
                    hVar.f2939d = h7;
                }
                if (hVar.f2937b || hVar.f2936a) {
                    C0456o.c(background, hVar, view.getDrawableState());
                    return;
                }
            }
            X5.h hVar2 = this.f5066e;
            if (hVar2 != null) {
                C0456o.c(background, hVar2, view.getDrawableState());
                return;
            }
            X5.h hVar3 = this.f5065d;
            if (hVar3 != null) {
                C0456o.c(background, hVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i7) {
        ColorStateList f7;
        View view = this.f5062a;
        Context context = view.getContext();
        int[] iArr = AbstractC0389a.f4273t;
        B0.c r6 = B0.c.r(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) r6.f73i;
        View view2 = this.f5062a;
        D.D.a(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r6.f73i, i7);
        try {
            if (typedArray.hasValue(0)) {
                this.f5064c = typedArray.getResourceId(0, -1);
                C0456o c0456o = this.f5063b;
                Context context2 = view.getContext();
                int i8 = this.f5064c;
                synchronized (c0456o) {
                    f7 = c0456o.f5072a.f(context2, i8);
                }
                if (f7 != null) {
                    d(f7);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0108v.q(view, r6.l(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0108v.r(view, AbstractC0441C.b(typedArray.getInt(2, -1), null));
            }
            r6.v();
        } catch (Throwable th) {
            r6.v();
            throw th;
        }
    }

    public final void c(int i7) {
        ColorStateList colorStateList;
        this.f5064c = i7;
        C0456o c0456o = this.f5063b;
        if (c0456o != null) {
            Context context = this.f5062a.getContext();
            synchronized (c0456o) {
                colorStateList = c0456o.f5072a.f(context, i7);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f5065d == null) {
                this.f5065d = new X5.h();
            }
            X5.h hVar = this.f5065d;
            hVar.f2938c = colorStateList;
            hVar.f2937b = true;
        } else {
            this.f5065d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f5066e == null) {
            this.f5066e = new X5.h();
        }
        X5.h hVar = this.f5066e;
        hVar.f2938c = colorStateList;
        hVar.f2937b = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f5066e == null) {
            this.f5066e = new X5.h();
        }
        X5.h hVar = this.f5066e;
        hVar.f2939d = mode;
        hVar.f2936a = true;
        a();
    }
}
