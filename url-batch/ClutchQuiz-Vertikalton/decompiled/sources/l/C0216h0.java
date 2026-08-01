package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: l.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216h0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f2979a;

    /* renamed from: b, reason: collision with root package name */
    public final X f2980b;

    /* renamed from: c, reason: collision with root package name */
    public C0245w f2981c;

    public C0216h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        Q0.a(this, getContext());
        C0231p c0231p = new C0231p(this);
        this.f2979a = c0231p;
        c0231p.d(attributeSet, R.attr.buttonStyleToggle);
        X x2 = new X(this);
        this.f2980b = x2;
        x2.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0245w getEmojiTextViewHelper() {
        if (this.f2981c == null) {
            this.f2981c = new C0245w(this);
        }
        return this.f2981c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f2979a;
        if (c0231p != null) {
            c0231p.a();
        }
        X x2 = this.f2980b;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f2979a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f2979a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2980b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2980b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f2979a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f2979a;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2980b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2980b;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((T.d) getEmojiTextViewHelper().f3066b.f30b).v(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f2979a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f2979a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f2980b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f2980b;
        x2.m(mode);
        x2.b();
    }
}
