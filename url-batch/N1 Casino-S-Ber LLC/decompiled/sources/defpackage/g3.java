package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class g3 extends CheckBox implements y50 {
    public final i3 f;
    public final x1 g;
    public final n5 h;
    public k4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        w50.a(context);
        s50.a(this, getContext());
        i3 i3Var = new i3(this);
        this.f = i3Var;
        i3Var.d(attributeSet, i);
        x1 x1Var = new x1(this);
        this.g = x1Var;
        x1Var.l(attributeSet, i);
        n5 n5Var = new n5(this);
        this.h = n5Var;
        n5Var.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private k4 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new k4(this);
        }
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x1 x1Var = this.g;
        if (x1Var != null) {
            x1Var.a();
        }
        n5 n5Var = this.h;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x1 x1Var = this.g;
        if (x1Var != null) {
            return x1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x1 x1Var = this.g;
        if (x1Var != null) {
            return x1Var.i();
        }
        return null;
    }

    @Override // defpackage.y50
    public ColorStateList getSupportButtonTintList() {
        i3 i3Var = this.f;
        if (i3Var != null) {
            return (ColorStateList) i3Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i3 i3Var = this.f;
        if (i3Var != null) {
            return (PorterDuff.Mode) i3Var.b;
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
        x1 x1Var = this.g;
        if (x1Var != null) {
            x1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x1 x1Var = this.g;
        if (x1Var != null) {
            x1Var.o(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i3 i3Var = this.f;
        if (i3Var != null) {
            if (i3Var.e) {
                i3Var.e = false;
            } else {
                i3Var.e = true;
                i3Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        n5 n5Var = this.h;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        n5 n5Var = this.h;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((e70) getEmojiTextViewHelper().b.g).A(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x1 x1Var = this.g;
        if (x1Var != null) {
            x1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x1 x1Var = this.g;
        if (x1Var != null) {
            x1Var.u(mode);
        }
    }

    @Override // defpackage.y50
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i3 i3Var = this.f;
        if (i3Var != null) {
            i3Var.a = colorStateList;
            i3Var.c = true;
            i3Var.a();
        }
    }

    @Override // defpackage.y50
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i3 i3Var = this.f;
        if (i3Var != null) {
            i3Var.b = mode;
            i3Var.d = true;
            i3Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        n5 n5Var = this.h;
        n5Var.l(colorStateList);
        n5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        n5 n5Var = this.h;
        n5Var.m(mode);
        n5Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(zo.s(getContext(), i));
    }
}
