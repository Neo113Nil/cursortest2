package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import g.AbstractC0122a;
import java.util.WeakHashMap;

/* renamed from: n.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294q {

    /* renamed from: a, reason: collision with root package name */
    public final View f3693a;

    /* renamed from: d, reason: collision with root package name */
    public Y0 f3696d;
    public Y0 e;

    /* renamed from: f, reason: collision with root package name */
    public Y0 f3697f;

    /* renamed from: c, reason: collision with root package name */
    public int f3695c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0302u f3694b = C0302u.a();

    public C0294q(View view) {
        this.f3693a = view;
    }

    public final void a() {
        View view = this.f3693a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f3696d != null) {
                if (this.f3697f == null) {
                    this.f3697f = new Y0();
                }
                Y0 y02 = this.f3697f;
                y02.f3591c = null;
                y02.f3590b = false;
                y02.f3592d = null;
                y02.f3589a = false;
                WeakHashMap weakHashMap = M.P.f711a;
                ColorStateList g2 = M.E.g(view);
                if (g2 != null) {
                    y02.f3590b = true;
                    y02.f3591c = g2;
                }
                PorterDuff.Mode h2 = M.E.h(view);
                if (h2 != null) {
                    y02.f3589a = true;
                    y02.f3592d = h2;
                }
                if (y02.f3590b || y02.f3589a) {
                    C0302u.e(background, y02, view.getDrawableState());
                    return;
                }
            }
            Y0 y03 = this.e;
            if (y03 != null) {
                C0302u.e(background, y03, view.getDrawableState());
                return;
            }
            Y0 y04 = this.f3696d;
            if (y04 != null) {
                C0302u.e(background, y04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        Y0 y02 = this.e;
        if (y02 != null) {
            return (ColorStateList) y02.f3591c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        Y0 y02 = this.e;
        if (y02 != null) {
            return (PorterDuff.Mode) y02.f3592d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3693a;
        Context context = view.getContext();
        int[] iArr = AbstractC0122a.f2717z;
        I0.h r2 = I0.h.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f592c;
        View view2 = this.f3693a;
        M.P.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f592c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3695c = typedArray.getResourceId(0, -1);
                C0302u c0302u = this.f3694b;
                Context context2 = view.getContext();
                int i2 = this.f3695c;
                synchronized (c0302u) {
                    f2 = c0302u.f3717a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                M.E.q(view, r2.g(1));
            }
            if (typedArray.hasValue(2)) {
                M.E.r(view, AbstractC0293p0.c(typedArray.getInt(2, -1), null));
            }
        } finally {
            r2.t();
        }
    }

    public final void e() {
        this.f3695c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3695c = i;
        C0302u c0302u = this.f3694b;
        if (c0302u != null) {
            Context context = this.f3693a.getContext();
            synchronized (c0302u) {
                colorStateList = c0302u.f3717a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3696d == null) {
                this.f3696d = new Y0();
            }
            Y0 y02 = this.f3696d;
            y02.f3591c = colorStateList;
            y02.f3590b = true;
        } else {
            this.f3696d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new Y0();
        }
        Y0 y02 = this.e;
        y02.f3591c = colorStateList;
        y02.f3590b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new Y0();
        }
        Y0 y02 = this.e;
        y02.f3592d = mode;
        y02.f3589a = true;
        a();
    }
}
