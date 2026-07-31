package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.AbstractC1281a0;
import f.AbstractC2415a;

/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1264m {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f10952a;

    /* renamed from: b, reason: collision with root package name */
    private X f10953b;

    /* renamed from: c, reason: collision with root package name */
    private X f10954c;

    /* renamed from: d, reason: collision with root package name */
    private X f10955d;

    /* renamed from: e, reason: collision with root package name */
    private int f10956e = 0;

    public C1264m(ImageView imageView) {
        this.f10952a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f10955d == null) {
            this.f10955d = new X();
        }
        X x4 = this.f10955d;
        x4.a();
        ColorStateList a4 = androidx.core.widget.g.a(this.f10952a);
        if (a4 != null) {
            x4.f10856d = true;
            x4.f10853a = a4;
        }
        PorterDuff.Mode b4 = androidx.core.widget.g.b(this.f10952a);
        if (b4 != null) {
            x4.f10855c = true;
            x4.f10854b = b4;
        }
        if (!x4.f10856d && !x4.f10855c) {
            return false;
        }
        C1259h.i(drawable, x4, this.f10952a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f10953b != null;
    }

    void b() {
        if (this.f10952a.getDrawable() != null) {
            this.f10952a.getDrawable().setLevel(this.f10956e);
        }
    }

    void c() {
        Drawable drawable = this.f10952a.getDrawable();
        if (drawable != null) {
            F.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            X x4 = this.f10954c;
            if (x4 != null) {
                C1259h.i(drawable, x4, this.f10952a.getDrawableState());
                return;
            }
            X x5 = this.f10953b;
            if (x5 != null) {
                C1259h.i(drawable, x5, this.f10952a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        X x4 = this.f10954c;
        if (x4 != null) {
            return x4.f10853a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        X x4 = this.f10954c;
        if (x4 != null) {
            return x4.f10854b;
        }
        return null;
    }

    boolean f() {
        return !(this.f10952a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i4) {
        int n4;
        Z v4 = Z.v(this.f10952a.getContext(), attributeSet, e.j.f36426P, i4, 0);
        ImageView imageView = this.f10952a;
        AbstractC1281a0.m0(imageView, imageView.getContext(), e.j.f36426P, attributeSet, v4.r(), i4, 0);
        try {
            Drawable drawable = this.f10952a.getDrawable();
            if (drawable == null && (n4 = v4.n(e.j.f36430Q, -1)) != -1 && (drawable = AbstractC2415a.b(this.f10952a.getContext(), n4)) != null) {
                this.f10952a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                F.b(drawable);
            }
            if (v4.s(e.j.f36434R)) {
                androidx.core.widget.g.c(this.f10952a, v4.c(e.j.f36434R));
            }
            if (v4.s(e.j.f36438S)) {
                androidx.core.widget.g.d(this.f10952a, F.e(v4.k(e.j.f36438S, -1), null));
            }
            v4.x();
        } catch (Throwable th) {
            v4.x();
            throw th;
        }
    }

    void h(Drawable drawable) {
        this.f10956e = drawable.getLevel();
    }

    public void i(int i4) {
        if (i4 != 0) {
            Drawable b4 = AbstractC2415a.b(this.f10952a.getContext(), i4);
            if (b4 != null) {
                F.b(b4);
            }
            this.f10952a.setImageDrawable(b4);
        } else {
            this.f10952a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f10954c == null) {
            this.f10954c = new X();
        }
        X x4 = this.f10954c;
        x4.f10853a = colorStateList;
        x4.f10856d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f10954c == null) {
            this.f10954c = new X();
        }
        X x4 = this.f10954c;
        x4.f10854b = mode;
        x4.f10855c = true;
        c();
    }
}
