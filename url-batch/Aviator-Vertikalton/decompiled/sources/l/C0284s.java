package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: l.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0284s extends CheckBox implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final C0288u f3436a;

    /* renamed from: b, reason: collision with root package name */
    public final C0280q f3437b;

    /* renamed from: c, reason: collision with root package name */
    public final C0249a0 f3438c;

    /* renamed from: d, reason: collision with root package name */
    public C0298z f3439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0284s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        U0.a(context);
        T0.a(this, getContext());
        C0288u c0288u = new C0288u(this);
        this.f3436a = c0288u;
        c0288u.c(attributeSet, i);
        C0280q c0280q = new C0280q(this);
        this.f3437b = c0280q;
        c0280q.d(attributeSet, i);
        C0249a0 c0249a0 = new C0249a0(this);
        this.f3438c = c0249a0;
        c0249a0.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0298z getEmojiTextViewHelper() {
        if (this.f3439d == null) {
            this.f3439d = new C0298z(this);
        }
        return this.f3439d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0280q c0280q = this.f3437b;
        if (c0280q != null) {
            c0280q.a();
        }
        C0249a0 c0249a0 = this.f3438c;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0280q c0280q = this.f3437b;
        if (c0280q != null) {
            return c0280q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0280q c0280q = this.f3437b;
        if (c0280q != null) {
            return c0280q.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        C0288u c0288u = this.f3436a;
        if (c0288u != null) {
            return c0288u.f3447a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0288u c0288u = this.f3436a;
        if (c0288u != null) {
            return c0288u.f3448b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3438c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3438c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0280q c0280q = this.f3437b;
        if (c0280q != null) {
            c0280q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0280q c0280q = this.f3437b;
        if (c0280q != null) {
            c0280q.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0288u c0288u = this.f3436a;
        if (c0288u != null) {
            if (c0288u.f3451e) {
                c0288u.f3451e = false;
            } else {
                c0288u.f3451e = true;
                c0288u.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3438c;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3438c;
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
        C0280q c0280q = this.f3437b;
        if (c0280q != null) {
            c0280q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0280q c0280q = this.f3437b;
        if (c0280q != null) {
            c0280q.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0288u c0288u = this.f3436a;
        if (c0288u != null) {
            c0288u.f3447a = colorStateList;
            c0288u.f3449c = true;
            c0288u.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0288u c0288u = this.f3436a;
        if (c0288u != null) {
            c0288u.f3448b = mode;
            c0288u.f3450d = true;
            c0288u.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0249a0 c0249a0 = this.f3438c;
        c0249a0.l(colorStateList);
        c0249a0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0249a0 c0249a0 = this.f3438c;
        c0249a0.m(mode);
        c0249a0.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(q1.d.z(getContext(), i));
    }
}
