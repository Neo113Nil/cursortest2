package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class i5 extends RadioButton implements g60 {
    public final y3 f;
    public final t3 g;
    public final e6 h;
    public b5 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        e60.a(context);
        a60.a(this, getContext());
        y3 y3Var = new y3(this);
        this.f = y3Var;
        y3Var.c(attributeSet, R.attr.radioButtonStyle);
        t3 t3Var = new t3(this);
        this.g = t3Var;
        t3Var.d(attributeSet, R.attr.radioButtonStyle);
        e6 e6Var = new e6(this);
        this.h = e6Var;
        e6Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private b5 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new b5(this);
        }
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t3 t3Var = this.g;
        if (t3Var != null) {
            t3Var.a();
        }
        e6 e6Var = this.h;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t3 t3Var = this.g;
        if (t3Var != null) {
            return t3Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t3 t3Var = this.g;
        if (t3Var != null) {
            return t3Var.c();
        }
        return null;
    }

    @Override // defpackage.g60
    public ColorStateList getSupportButtonTintList() {
        y3 y3Var = this.f;
        if (y3Var != null) {
            return y3Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        y3 y3Var = this.f;
        if (y3Var != null) {
            return y3Var.b;
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
        t3 t3Var = this.g;
        if (t3Var != null) {
            t3Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t3 t3Var = this.g;
        if (t3Var != null) {
            t3Var.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        y3 y3Var = this.f;
        if (y3Var != null) {
            if (y3Var.e) {
                y3Var.e = false;
            } else {
                y3Var.e = true;
                y3Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e6 e6Var = this.h;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e6 e6Var = this.h;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((vw) getEmojiTextViewHelper().b.g).B(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t3 t3Var = this.g;
        if (t3Var != null) {
            t3Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t3 t3Var = this.g;
        if (t3Var != null) {
            t3Var.i(mode);
        }
    }

    @Override // defpackage.g60
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        y3 y3Var = this.f;
        if (y3Var != null) {
            y3Var.a = colorStateList;
            y3Var.c = true;
            y3Var.a();
        }
    }

    @Override // defpackage.g60
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        y3 y3Var = this.f;
        if (y3Var != null) {
            y3Var.b = mode;
            y3Var.d = true;
            y3Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e6 e6Var = this.h;
        e6Var.l(colorStateList);
        e6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e6 e6Var = this.h;
        e6Var.m(mode);
        e6Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(l70.p(getContext(), i));
    }
}
