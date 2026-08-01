package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class b5 extends RadioButton implements i90 {
    public final s3 f;
    public final y1 g;
    public final x5 h;
    public u4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        g90.a(context);
        z80.a(this, getContext());
        s3 s3Var = new s3(this);
        this.f = s3Var;
        s3Var.d(attributeSet, R.attr.radioButtonStyle);
        y1 y1Var = new y1(this);
        this.g = y1Var;
        y1Var.l(attributeSet, R.attr.radioButtonStyle);
        x5 x5Var = new x5(this);
        this.h = x5Var;
        x5Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private u4 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new u4(this);
        }
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.a();
        }
        x5 x5Var = this.h;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.g;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.g;
        if (y1Var != null) {
            return y1Var.i();
        }
        return null;
    }

    @Override // defpackage.i90
    public ColorStateList getSupportButtonTintList() {
        s3 s3Var = this.f;
        if (s3Var != null) {
            return (ColorStateList) s3Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        s3 s3Var = this.f;
        if (s3Var != null) {
            return (PorterDuff.Mode) s3Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        s3 s3Var = this.f;
        if (s3Var != null) {
            if (s3Var.e) {
                s3Var.e = false;
            } else {
                s3Var.e = true;
                s3Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.h;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.h;
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
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    @Override // defpackage.i90
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        s3 s3Var = this.f;
        if (s3Var != null) {
            s3Var.a = colorStateList;
            s3Var.c = true;
            s3Var.a();
        }
    }

    @Override // defpackage.i90
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        s3 s3Var = this.f;
        if (s3Var != null) {
            s3Var.b = mode;
            s3Var.d = true;
            s3Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x5 x5Var = this.h;
        x5Var.l(colorStateList);
        x5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x5 x5Var = this.h;
        x5Var.m(mode);
        x5Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(mz.m(getContext(), i));
    }
}
