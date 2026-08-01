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
public final class C0237h0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0252p f3400a;

    /* renamed from: b, reason: collision with root package name */
    public final W f3401b;

    /* renamed from: c, reason: collision with root package name */
    public C0266w f3402c;

    public C0237h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        Q0.a(this, getContext());
        C0252p c0252p = new C0252p(this);
        this.f3400a = c0252p;
        c0252p.d(attributeSet, R.attr.buttonStyleToggle);
        W w2 = new W(this);
        this.f3401b = w2;
        w2.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0266w getEmojiTextViewHelper() {
        if (this.f3402c == null) {
            this.f3402c = new C0266w(this);
        }
        return this.f3402c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0252p c0252p = this.f3400a;
        if (c0252p != null) {
            c0252p.a();
        }
        W w2 = this.f3401b;
        if (w2 != null) {
            w2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0252p c0252p = this.f3400a;
        if (c0252p != null) {
            return c0252p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0252p c0252p = this.f3400a;
        if (c0252p != null) {
            return c0252p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3401b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3401b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0252p c0252p = this.f3400a;
        if (c0252p != null) {
            c0252p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0252p c0252p = this.f3400a;
        if (c0252p != null) {
            c0252p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3401b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3401b;
        if (w2 != null) {
            w2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((H1.l) getEmojiTextViewHelper().f3485b.f6b).H(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0252p c0252p = this.f3400a;
        if (c0252p != null) {
            c0252p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0252p c0252p = this.f3400a;
        if (c0252p != null) {
            c0252p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w2 = this.f3401b;
        w2.l(colorStateList);
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w2 = this.f3401b;
        w2.m(mode);
        w2.b();
    }
}
