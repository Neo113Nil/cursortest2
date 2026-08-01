package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class p6 extends ToggleButton {
    public final f2 f;
    public final f6 g;
    public d5 h;

    public p6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        yh0.a(this, getContext());
        f2 f2Var = new f2(this);
        this.f = f2Var;
        f2Var.l(attributeSet, R.attr.buttonStyleToggle);
        f6 f6Var = new f6(this);
        this.g = f6Var;
        f6Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private d5 getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new d5(this);
        }
        return this.h;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.a();
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            return f2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            return f2Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((d50) getEmojiTextViewHelper().b.g).w(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f6 f6Var = this.g;
        f6Var.l(colorStateList);
        f6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f6 f6Var = this.g;
        f6Var.m(mode);
        f6Var.b();
    }
}
