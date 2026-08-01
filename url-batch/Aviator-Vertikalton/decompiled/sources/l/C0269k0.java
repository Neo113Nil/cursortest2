package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: l.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269k0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0280q f3407a;

    /* renamed from: b, reason: collision with root package name */
    public final C0249a0 f3408b;

    /* renamed from: c, reason: collision with root package name */
    public C0298z f3409c;

    public C0269k0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        T0.a(this, getContext());
        C0280q c0280q = new C0280q(this);
        this.f3407a = c0280q;
        c0280q.d(attributeSet, R.attr.buttonStyleToggle);
        C0249a0 c0249a0 = new C0249a0(this);
        this.f3408b = c0249a0;
        c0249a0.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0298z getEmojiTextViewHelper() {
        if (this.f3409c == null) {
            this.f3409c = new C0298z(this);
        }
        return this.f3409c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0280q c0280q = this.f3407a;
        if (c0280q != null) {
            c0280q.a();
        }
        C0249a0 c0249a0 = this.f3408b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0280q c0280q = this.f3407a;
        if (c0280q != null) {
            return c0280q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0280q c0280q = this.f3407a;
        if (c0280q != null) {
            return c0280q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3408b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3408b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0280q c0280q = this.f3407a;
        if (c0280q != null) {
            c0280q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0280q c0280q = this.f3407a;
        if (c0280q != null) {
            c0280q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3408b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3408b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q1.l) getEmojiTextViewHelper().f3489b.f67b).y(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0280q c0280q = this.f3407a;
        if (c0280q != null) {
            c0280q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0280q c0280q = this.f3407a;
        if (c0280q != null) {
            c0280q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0249a0 c0249a0 = this.f3408b;
        c0249a0.l(colorStateList);
        c0249a0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0249a0 c0249a0 = this.f3408b;
        c0249a0.m(mode);
        c0249a0.b();
    }
}
