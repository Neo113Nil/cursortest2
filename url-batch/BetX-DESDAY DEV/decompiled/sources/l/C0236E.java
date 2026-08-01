package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.luckyarcade.spinthrow.R;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0236E extends RadioButton implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final C0288t f3220a;

    /* renamed from: b, reason: collision with root package name */
    public final C0280p f3221b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f3222c;

    /* renamed from: d, reason: collision with root package name */
    public C0298y f3223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0236E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        T0.a(context);
        S0.a(this, getContext());
        C0288t c0288t = new C0288t(this);
        this.f3220a = c0288t;
        c0288t.c(attributeSet, R.attr.radioButtonStyle);
        C0280p c0280p = new C0280p(this);
        this.f3221b = c0280p;
        c0280p.d(attributeSet, R.attr.radioButtonStyle);
        Z z2 = new Z(this);
        this.f3222c = z2;
        z2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0298y getEmojiTextViewHelper() {
        if (this.f3223d == null) {
            this.f3223d = new C0298y(this);
        }
        return this.f3223d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0280p c0280p = this.f3221b;
        if (c0280p != null) {
            c0280p.a();
        }
        Z z2 = this.f3222c;
        if (z2 != null) {
            z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0280p c0280p = this.f3221b;
        if (c0280p != null) {
            return c0280p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0280p c0280p = this.f3221b;
        if (c0280p != null) {
            return c0280p.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        C0288t c0288t = this.f3220a;
        if (c0288t != null) {
            return c0288t.f3446a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0288t c0288t = this.f3220a;
        if (c0288t != null) {
            return c0288t.f3447b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3222c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3222c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0280p c0280p = this.f3221b;
        if (c0280p != null) {
            c0280p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0280p c0280p = this.f3221b;
        if (c0280p != null) {
            c0280p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0288t c0288t = this.f3220a;
        if (c0288t != null) {
            if (c0288t.f3450e) {
                c0288t.f3450e = false;
            } else {
                c0288t.f3450e = true;
                c0288t.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3222c;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3222c;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q1.l) getEmojiTextViewHelper().f3488b.f66b).y(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0280p c0280p = this.f3221b;
        if (c0280p != null) {
            c0280p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0280p c0280p = this.f3221b;
        if (c0280p != null) {
            c0280p.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0288t c0288t = this.f3220a;
        if (c0288t != null) {
            c0288t.f3446a = colorStateList;
            c0288t.f3448c = true;
            c0288t.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0288t c0288t = this.f3220a;
        if (c0288t != null) {
            c0288t.f3447b = mode;
            c0288t.f3449d = true;
            c0288t.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f3222c;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f3222c;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(q1.d.z(getContext(), i));
    }
}
