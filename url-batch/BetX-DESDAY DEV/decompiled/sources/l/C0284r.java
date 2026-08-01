package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: l.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0284r extends CheckBox implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final C0288t f3435a;

    /* renamed from: b, reason: collision with root package name */
    public final C0280p f3436b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f3437c;

    /* renamed from: d, reason: collision with root package name */
    public C0298y f3438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0284r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        S0.a(this, getContext());
        C0288t c0288t = new C0288t(this);
        this.f3435a = c0288t;
        c0288t.c(attributeSet, i);
        C0280p c0280p = new C0280p(this);
        this.f3436b = c0280p;
        c0280p.d(attributeSet, i);
        Z z2 = new Z(this);
        this.f3437c = z2;
        z2.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0298y getEmojiTextViewHelper() {
        if (this.f3438d == null) {
            this.f3438d = new C0298y(this);
        }
        return this.f3438d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0280p c0280p = this.f3436b;
        if (c0280p != null) {
            c0280p.a();
        }
        Z z2 = this.f3437c;
        if (z2 != null) {
            z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0280p c0280p = this.f3436b;
        if (c0280p != null) {
            return c0280p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0280p c0280p = this.f3436b;
        if (c0280p != null) {
            return c0280p.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        C0288t c0288t = this.f3435a;
        if (c0288t != null) {
            return c0288t.f3446a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0288t c0288t = this.f3435a;
        if (c0288t != null) {
            return c0288t.f3447b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3437c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3437c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0280p c0280p = this.f3436b;
        if (c0280p != null) {
            c0280p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0280p c0280p = this.f3436b;
        if (c0280p != null) {
            c0280p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0288t c0288t = this.f3435a;
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3437c;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3437c;
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
        C0280p c0280p = this.f3436b;
        if (c0280p != null) {
            c0280p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0280p c0280p = this.f3436b;
        if (c0280p != null) {
            c0280p.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0288t c0288t = this.f3435a;
        if (c0288t != null) {
            c0288t.f3446a = colorStateList;
            c0288t.f3448c = true;
            c0288t.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0288t c0288t = this.f3435a;
        if (c0288t != null) {
            c0288t.f3447b = mode;
            c0288t.f3449d = true;
            c0288t.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f3437c;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f3437c;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(q1.d.z(getContext(), i));
    }
}
