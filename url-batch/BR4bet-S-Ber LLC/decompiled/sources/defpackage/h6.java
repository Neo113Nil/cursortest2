package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class h6 extends ToggleButton {
    public final y1 f;
    public final x5 g;
    public u4 h;

    public h6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        z80.a(this, getContext());
        y1 y1Var = new y1(this);
        this.f = y1Var;
        y1Var.l(attributeSet, R.attr.buttonStyleToggle);
        x5 x5Var = new x5(this);
        this.g = x5Var;
        x5Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private u4 getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new u4(this);
        }
        return this.h;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.a();
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.i();
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
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((kr) getEmojiTextViewHelper().b.g).z(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x5 x5Var = this.g;
        x5Var.l(colorStateList);
        x5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x5 x5Var = this.g;
        x5Var.m(mode);
        x5Var.b();
    }
}
