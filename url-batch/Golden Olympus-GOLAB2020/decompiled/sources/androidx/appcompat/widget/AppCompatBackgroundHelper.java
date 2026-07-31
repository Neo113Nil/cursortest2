package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.AbstractC1281a0;

/* loaded from: classes.dex */
class AppCompatBackgroundHelper {

    /* renamed from: a, reason: collision with root package name */
    private final View f10577a;

    /* renamed from: d, reason: collision with root package name */
    private X f10580d;

    /* renamed from: e, reason: collision with root package name */
    private X f10581e;

    /* renamed from: f, reason: collision with root package name */
    private X f10582f;

    /* renamed from: c, reason: collision with root package name */
    private int f10579c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final C1259h f10578b = C1259h.b();

    AppCompatBackgroundHelper(View view) {
        this.f10577a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f10582f == null) {
            this.f10582f = new X();
        }
        X x4 = this.f10582f;
        x4.a();
        ColorStateList t4 = AbstractC1281a0.t(this.f10577a);
        if (t4 != null) {
            x4.f10856d = true;
            x4.f10853a = t4;
        }
        PorterDuff.Mode u4 = AbstractC1281a0.u(this.f10577a);
        if (u4 != null) {
            x4.f10855c = true;
            x4.f10854b = u4;
        }
        if (!x4.f10856d && !x4.f10855c) {
            return false;
        }
        C1259h.i(drawable, x4, this.f10577a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f10580d != null;
    }

    void b() {
        Drawable background = this.f10577a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            X x4 = this.f10581e;
            if (x4 != null) {
                C1259h.i(background, x4, this.f10577a.getDrawableState());
                return;
            }
            X x5 = this.f10580d;
            if (x5 != null) {
                C1259h.i(background, x5, this.f10577a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        X x4 = this.f10581e;
        if (x4 != null) {
            return x4.f10853a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        X x4 = this.f10581e;
        if (x4 != null) {
            return x4.f10854b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i4) {
        Z v4 = Z.v(this.f10577a.getContext(), attributeSet, e.j.K3, i4, 0);
        View view = this.f10577a;
        AbstractC1281a0.m0(view, view.getContext(), e.j.K3, attributeSet, v4.r(), i4, 0);
        try {
            if (v4.s(e.j.L3)) {
                this.f10579c = v4.n(e.j.L3, -1);
                ColorStateList f4 = this.f10578b.f(this.f10577a.getContext(), this.f10579c);
                if (f4 != null) {
                    h(f4);
                }
            }
            if (v4.s(e.j.M3)) {
                AbstractC1281a0.t0(this.f10577a, v4.c(e.j.M3));
            }
            if (v4.s(e.j.N3)) {
                AbstractC1281a0.u0(this.f10577a, F.e(v4.k(e.j.N3, -1), null));
            }
            v4.x();
        } catch (Throwable th) {
            v4.x();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.f10579c = -1;
        h(null);
        b();
    }

    void g(int i4) {
        this.f10579c = i4;
        C1259h c1259h = this.f10578b;
        h(c1259h != null ? c1259h.f(this.f10577a.getContext(), i4) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f10580d == null) {
                this.f10580d = new X();
            }
            X x4 = this.f10580d;
            x4.f10853a = colorStateList;
            x4.f10856d = true;
        } else {
            this.f10580d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f10581e == null) {
            this.f10581e = new X();
        }
        X x4 = this.f10581e;
        x4.f10853a = colorStateList;
        x4.f10856d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f10581e == null) {
            this.f10581e = new X();
        }
        X x4 = this.f10581e;
        x4.f10854b = mode;
        x4.f10855c = true;
        b();
    }
}
