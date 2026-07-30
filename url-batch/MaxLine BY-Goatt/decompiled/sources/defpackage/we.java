package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class we extends CheckBox {
    public final ye m;
    public final te n;
    public final xg o;
    public wf p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        vx2.a(context);
        xw2.a(this, getContext());
        ye yeVar = new ye(this);
        this.m = yeVar;
        yeVar.d(attributeSet, R.attr.checkboxStyle);
        te teVar = new te(this);
        this.n = teVar;
        teVar.e(attributeSet, R.attr.checkboxStyle);
        xg xgVar = new xg(this);
        this.o = xgVar;
        xgVar.f(attributeSet, R.attr.checkboxStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.checkboxStyle);
    }

    private wf getEmojiTextViewHelper() {
        if (this.p == null) {
            this.p = new wf(this);
        }
        return this.p;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        te teVar = this.n;
        if (teVar != null) {
            teVar.a();
        }
        xg xgVar = this.o;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        te teVar = this.n;
        if (teVar != null) {
            return teVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        te teVar = this.n;
        if (teVar != null) {
            return teVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        ye yeVar = this.m;
        if (yeVar != null) {
            return (ColorStateList) yeVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        ye yeVar = this.m;
        if (yeVar != null) {
            return (PorterDuff.Mode) yeVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.o.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.o.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        te teVar = this.n;
        if (teVar != null) {
            teVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        te teVar = this.n;
        if (teVar != null) {
            teVar.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        ye yeVar = this.m;
        if (yeVar != null) {
            if (yeVar.e) {
                yeVar.e = false;
            } else {
                yeVar.e = true;
                yeVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.o;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.o;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((tk3) getEmojiTextViewHelper().b.n).O(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        te teVar = this.n;
        if (teVar != null) {
            teVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        te teVar = this.n;
        if (teVar != null) {
            teVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        ye yeVar = this.m;
        if (yeVar != null) {
            yeVar.a = colorStateList;
            yeVar.c = true;
            yeVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        ye yeVar = this.m;
        if (yeVar != null) {
            yeVar.b = mode;
            yeVar.d = true;
            yeVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        xg xgVar = this.o;
        xgVar.k(colorStateList);
        xgVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        xg xgVar = this.o;
        xgVar.l(mode);
        xgVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(j8.F(getContext(), i));
    }
}
