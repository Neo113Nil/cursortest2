package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import g0.C0116b;

/* renamed from: l.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213i0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0116b f2926a;

    /* renamed from: b, reason: collision with root package name */
    public final X f2927b;

    /* renamed from: c, reason: collision with root package name */
    public C0240w f2928c;

    public C0213i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        R0.a(this, getContext());
        C0116b c0116b = new C0116b(this);
        this.f2926a = c0116b;
        c0116b.k(attributeSet, R.attr.buttonStyleToggle);
        X x2 = new X(this);
        this.f2927b = x2;
        x2.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0240w getEmojiTextViewHelper() {
        if (this.f2928c == null) {
            this.f2928c = new C0240w(this);
        }
        return this.f2928c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0116b c0116b = this.f2926a;
        if (c0116b != null) {
            c0116b.a();
        }
        X x2 = this.f2927b;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0116b c0116b = this.f2926a;
        if (c0116b != null) {
            return c0116b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0116b c0116b = this.f2926a;
        if (c0116b != null) {
            return c0116b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2927b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2927b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0116b c0116b = this.f2926a;
        if (c0116b != null) {
            c0116b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0116b c0116b = this.f2926a;
        if (c0116b != null) {
            c0116b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2927b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2927b;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((w1.d) getEmojiTextViewHelper().f3009b.f115b).D(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0116b c0116b = this.f2926a;
        if (c0116b != null) {
            c0116b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0116b c0116b = this.f2926a;
        if (c0116b != null) {
            c0116b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f2927b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f2927b;
        x2.m(mode);
        x2.b();
    }
}
