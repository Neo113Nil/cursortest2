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
public final class C0214h0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0229p f2964a;

    /* renamed from: b, reason: collision with root package name */
    public final X f2965b;

    /* renamed from: c, reason: collision with root package name */
    public C0243w f2966c;

    public C0214h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        Q0.a(this, getContext());
        C0229p c0229p = new C0229p(this);
        this.f2964a = c0229p;
        c0229p.d(attributeSet, R.attr.buttonStyleToggle);
        X x2 = new X(this);
        this.f2965b = x2;
        x2.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0243w getEmojiTextViewHelper() {
        if (this.f2966c == null) {
            this.f2966c = new C0243w(this);
        }
        return this.f2966c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0229p c0229p = this.f2964a;
        if (c0229p != null) {
            c0229p.a();
        }
        X x2 = this.f2965b;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0229p c0229p = this.f2964a;
        if (c0229p != null) {
            return c0229p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0229p c0229p = this.f2964a;
        if (c0229p != null) {
            return c0229p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2965b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2965b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0229p c0229p = this.f2964a;
        if (c0229p != null) {
            c0229p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0229p c0229p = this.f2964a;
        if (c0229p != null) {
            c0229p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2965b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2965b;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((u1.d) getEmojiTextViewHelper().f3051b.f150b).G(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0229p c0229p = this.f2964a;
        if (c0229p != null) {
            c0229p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0229p c0229p = this.f2964a;
        if (c0229p != null) {
            c0229p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f2965b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f2965b;
        x2.m(mode);
        x2.b();
    }
}
