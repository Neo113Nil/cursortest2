package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.lasercut.dash.R;
import h0.C0132d;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0208E extends RadioButton implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final C0132d f2852a;

    /* renamed from: b, reason: collision with root package name */
    public final C0254q f2853b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f2854c;
    public C0270y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        T0.a(context);
        S0.a(this, getContext());
        C0132d c0132d = new C0132d(this);
        this.f2852a = c0132d;
        c0132d.d(attributeSet, R.attr.radioButtonStyle);
        C0254q c0254q = new C0254q(this);
        this.f2853b = c0254q;
        c0254q.d(attributeSet, R.attr.radioButtonStyle);
        Z z2 = new Z(this);
        this.f2854c = z2;
        z2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0270y getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0270y(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0254q c0254q = this.f2853b;
        if (c0254q != null) {
            c0254q.a();
        }
        Z z2 = this.f2854c;
        if (z2 != null) {
            z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0254q c0254q = this.f2853b;
        if (c0254q != null) {
            return c0254q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254q c0254q = this.f2853b;
        if (c0254q != null) {
            return c0254q.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        C0132d c0132d = this.f2852a;
        if (c0132d != null) {
            return (ColorStateList) c0132d.f2375e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0132d c0132d = this.f2852a;
        if (c0132d != null) {
            return (PorterDuff.Mode) c0132d.f2376f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2854c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2854c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254q c0254q = this.f2853b;
        if (c0254q != null) {
            c0254q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254q c0254q = this.f2853b;
        if (c0254q != null) {
            c0254q.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0132d c0132d = this.f2852a;
        if (c0132d != null) {
            if (c0132d.f2374c) {
                c0132d.f2374c = false;
            } else {
                c0132d.f2374c = true;
                c0132d.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2854c;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2854c;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q1.l) getEmojiTextViewHelper().f3090b.f59b).x(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254q c0254q = this.f2853b;
        if (c0254q != null) {
            c0254q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254q c0254q = this.f2853b;
        if (c0254q != null) {
            c0254q.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0132d c0132d = this.f2852a;
        if (c0132d != null) {
            c0132d.f2375e = colorStateList;
            c0132d.f2372a = true;
            c0132d.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0132d c0132d = this.f2852a;
        if (c0132d != null) {
            c0132d.f2376f = mode;
            c0132d.f2373b = true;
            c0132d.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f2854c;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f2854c;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(q1.l.v(getContext(), i));
    }
}
