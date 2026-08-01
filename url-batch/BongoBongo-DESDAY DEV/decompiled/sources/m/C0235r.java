package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import h.AbstractC0112a;

/* renamed from: m.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0235r extends CheckBox implements R.t {

    /* renamed from: a, reason: collision with root package name */
    public final j0.d f3172a;

    /* renamed from: b, reason: collision with root package name */
    public final C0231p f3173b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f3174c;
    public C0247x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Y0.a(context);
        X0.a(this, getContext());
        j0.d dVar = new j0.d(this);
        this.f3172a = dVar;
        dVar.d(attributeSet, i);
        C0231p c0231p = new C0231p(this);
        this.f3173b = c0231p;
        c0231p.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f3174c = y2;
        y2.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private C0247x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0247x(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f3173b;
        if (c0231p != null) {
            c0231p.a();
        }
        Y y2 = this.f3174c;
        if (y2 != null) {
            y2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f3173b;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f3173b;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    @Override // R.t
    public ColorStateList getSupportButtonTintList() {
        j0.d dVar = this.f3172a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2663e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j0.d dVar = this.f3172a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2664f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3174c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3174c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f3173b;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f3173b;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j0.d dVar = this.f3172a;
        if (dVar != null) {
            if (dVar.f2662c) {
                dVar.f2662c = false;
            } else {
                dVar.f2662c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3174c;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3174c;
        if (y2 != null) {
            y2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f3173b;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f3173b;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    @Override // R.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j0.d dVar = this.f3172a;
        if (dVar != null) {
            dVar.f2663e = colorStateList;
            dVar.f2660a = true;
            dVar.a();
        }
    }

    @Override // R.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j0.d dVar = this.f3172a;
        if (dVar != null) {
            dVar.f2664f = mode;
            dVar.f2661b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3174c;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3174c;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0112a.l(getContext(), i));
    }
}
