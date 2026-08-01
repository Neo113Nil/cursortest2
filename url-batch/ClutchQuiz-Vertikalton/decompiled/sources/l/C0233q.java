package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0233q extends CheckBox implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final h0.d f3027a;

    /* renamed from: b, reason: collision with root package name */
    public final C0231p f3028b;

    /* renamed from: c, reason: collision with root package name */
    public final X f3029c;
    public C0245w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0233q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        Q0.a(this, getContext());
        h0.d dVar = new h0.d(this);
        this.f3027a = dVar;
        dVar.d(attributeSet, i);
        C0231p c0231p = new C0231p(this);
        this.f3028b = c0231p;
        c0231p.d(attributeSet, i);
        X x2 = new X(this);
        this.f3029c = x2;
        x2.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0245w getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0245w(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f3028b;
        if (c0231p != null) {
            c0231p.a();
        }
        X x2 = this.f3029c;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f3028b;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f3028b;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        h0.d dVar = this.f3027a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2577e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h0.d dVar = this.f3027a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2578f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3029c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3029c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f3028b;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f3028b;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h0.d dVar = this.f3027a;
        if (dVar != null) {
            if (dVar.f2576c) {
                dVar.f2576c = false;
            } else {
                dVar.f2576c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3029c;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3029c;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((T.d) getEmojiTextViewHelper().f3066b.f30b).v(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f3028b;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f3028b;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h0.d dVar = this.f3027a;
        if (dVar != null) {
            dVar.f2577e = colorStateList;
            dVar.f2574a = true;
            dVar.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h0.d dVar = this.f3027a;
        if (dVar != null) {
            dVar.f2578f = mode;
            dVar.f2575b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3029c;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3029c;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(T.d.t(getContext(), i));
    }
}
