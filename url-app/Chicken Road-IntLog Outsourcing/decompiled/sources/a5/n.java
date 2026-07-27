package a5;

import E.AbstractC0048x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import g.AbstractC0444a;
import java.lang.reflect.Field;
import l.AbstractC1250w;
import l.C1242n;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f3972a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3973b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3974c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3975d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3976e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3977f;

    public n(View view) {
        C1242n c1242n;
        this.f3972a = -1;
        this.f3973b = view;
        PorterDuff.Mode mode = C1242n.f10908b;
        synchronized (C1242n.class) {
            try {
                if (C1242n.f10909c == null) {
                    C1242n.b();
                }
                c1242n = C1242n.f10909c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3974c = c1242n;
    }

    public void a() {
        View view = (View) this.f3973b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((T4.h) this.f3975d) != null) {
                if (((T4.h) this.f3977f) == null) {
                    this.f3977f = new T4.h();
                }
                T4.h hVar = (T4.h) this.f3977f;
                hVar.f2878c = null;
                hVar.f2877b = false;
                hVar.f2879d = null;
                hVar.f2876a = false;
                Field field = E.G.f566a;
                ColorStateList g6 = AbstractC0048x.g(view);
                if (g6 != null) {
                    hVar.f2877b = true;
                    hVar.f2878c = g6;
                }
                PorterDuff.Mode h3 = AbstractC0048x.h(view);
                if (h3 != null) {
                    hVar.f2876a = true;
                    hVar.f2879d = h3;
                }
                if (hVar.f2877b || hVar.f2876a) {
                    C1242n.c(background, hVar, view.getDrawableState());
                    return;
                }
            }
            T4.h hVar2 = (T4.h) this.f3976e;
            if (hVar2 != null) {
                C1242n.c(background, hVar2, view.getDrawableState());
                return;
            }
            T4.h hVar3 = (T4.h) this.f3975d;
            if (hVar3 != null) {
                C1242n.c(background, hVar3, view.getDrawableState());
            }
        }
    }

    public void b(AttributeSet attributeSet, int i2) {
        ColorStateList f3;
        View view = (View) this.f3973b;
        B4.i M5 = B4.i.M(view.getContext(), attributeSet, AbstractC0444a.f5713u, i2);
        TypedArray typedArray = (TypedArray) M5.f312c;
        try {
            if (typedArray.hasValue(0)) {
                this.f3972a = typedArray.getResourceId(0, -1);
                C1242n c1242n = (C1242n) this.f3974c;
                Context context = view.getContext();
                int i3 = this.f3972a;
                synchronized (c1242n) {
                    f3 = c1242n.f10910a.f(context, i3);
                }
                if (f3 != null) {
                    d(f3);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList E5 = M5.E(1);
                Field field = E.G.f566a;
                AbstractC0048x.q(view, E5);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c2 = AbstractC1250w.c(typedArray.getInt(2, -1), null);
                Field field2 = E.G.f566a;
                AbstractC0048x.r(view, c2);
            }
        } finally {
            M5.P();
        }
    }

    public void c(int i2) {
        ColorStateList colorStateList;
        this.f3972a = i2;
        C1242n c1242n = (C1242n) this.f3974c;
        if (c1242n != null) {
            Context context = ((View) this.f3973b).getContext();
            synchronized (c1242n) {
                colorStateList = c1242n.f10910a.f(context, i2);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((T4.h) this.f3975d) == null) {
                this.f3975d = new T4.h();
            }
            T4.h hVar = (T4.h) this.f3975d;
            hVar.f2878c = colorStateList;
            hVar.f2877b = true;
        } else {
            this.f3975d = null;
        }
        a();
    }

    public void e(ColorStateList colorStateList) {
        if (((T4.h) this.f3976e) == null) {
            this.f3976e = new T4.h();
        }
        T4.h hVar = (T4.h) this.f3976e;
        hVar.f2878c = colorStateList;
        hVar.f2877b = true;
        a();
    }

    public void f(PorterDuff.Mode mode) {
        if (((T4.h) this.f3976e) == null) {
            this.f3976e = new T4.h();
        }
        T4.h hVar = (T4.h) this.f3976e;
        hVar.f2879d = mode;
        hVar.f2876a = true;
        a();
    }

    public n(W4.d taskRunner) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        this.f3973b = taskRunner;
        this.f3976e = p.f3978a;
        this.f3977f = C0201c.f3925a;
    }
}
