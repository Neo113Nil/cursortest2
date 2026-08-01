package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class j5 extends RadioButton implements li0 {
    public final a4 f;
    public final f2 g;
    public final f6 h;
    public d5 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        ji0.a(context);
        yh0.a(this, getContext());
        a4 a4Var = new a4(this);
        this.f = a4Var;
        a4Var.c(attributeSet, R.attr.radioButtonStyle);
        f2 f2Var = new f2(this);
        this.g = f2Var;
        f2Var.l(attributeSet, R.attr.radioButtonStyle);
        f6 f6Var = new f6(this);
        this.h = f6Var;
        f6Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private d5 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new d5(this);
        }
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f2 f2Var = this.g;
        if (f2Var != null) {
            f2Var.a();
        }
        f6 f6Var = this.h;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f2 f2Var = this.g;
        if (f2Var != null) {
            return f2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f2 f2Var = this.g;
        if (f2Var != null) {
            return f2Var.i();
        }
        return null;
    }

    @Override // defpackage.li0
    public ColorStateList getSupportButtonTintList() {
        a4 a4Var = this.f;
        if (a4Var != null) {
            return a4Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        a4 a4Var = this.f;
        if (a4Var != null) {
            return a4Var.b;
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
        f2 f2Var = this.g;
        if (f2Var != null) {
            f2Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f2 f2Var = this.g;
        if (f2Var != null) {
            f2Var.o(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        a4 a4Var = this.f;
        if (a4Var != null) {
            if (a4Var.e) {
                a4Var.e = false;
            } else {
                a4Var.e = true;
                a4Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f6 f6Var = this.h;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f6 f6Var = this.h;
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
        f2 f2Var = this.g;
        if (f2Var != null) {
            f2Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f2 f2Var = this.g;
        if (f2Var != null) {
            f2Var.u(mode);
        }
    }

    @Override // defpackage.li0
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        a4 a4Var = this.f;
        if (a4Var != null) {
            a4Var.a = colorStateList;
            a4Var.c = true;
            a4Var.a();
        }
    }

    @Override // defpackage.li0
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        a4 a4Var = this.f;
        if (a4Var != null) {
            a4Var.b = mode;
            a4Var.d = true;
            a4Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f6 f6Var = this.h;
        f6Var.l(colorStateList);
        f6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f6 f6Var = this.h;
        f6Var.m(mode);
        f6Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(d50.v(getContext(), i));
    }
}
