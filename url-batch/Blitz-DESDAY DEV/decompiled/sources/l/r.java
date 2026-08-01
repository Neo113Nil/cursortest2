package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class r extends CheckBox implements S.t {

    /* renamed from: a, reason: collision with root package name */
    public final j0.d f3054a;

    /* renamed from: b, reason: collision with root package name */
    public final C0205p f3055b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f3056c;
    public C0220x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        S0.a(this, getContext());
        j0.d dVar = new j0.d(this);
        this.f3054a = dVar;
        dVar.d(attributeSet, i);
        C0205p c0205p = new C0205p(this);
        this.f3055b = c0205p;
        c0205p.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f3056c = y2;
        y2.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0220x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0220x(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0205p c0205p = this.f3055b;
        if (c0205p != null) {
            c0205p.a();
        }
        Y y2 = this.f3056c;
        if (y2 != null) {
            y2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0205p c0205p = this.f3055b;
        if (c0205p != null) {
            return c0205p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0205p c0205p = this.f3055b;
        if (c0205p != null) {
            return c0205p.c();
        }
        return null;
    }

    @Override // S.t
    public ColorStateList getSupportButtonTintList() {
        j0.d dVar = this.f3054a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2683e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j0.d dVar = this.f3054a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2684f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3056c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3056c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0205p c0205p = this.f3055b;
        if (c0205p != null) {
            c0205p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0205p c0205p = this.f3055b;
        if (c0205p != null) {
            c0205p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j0.d dVar = this.f3054a;
        if (dVar != null) {
            if (dVar.f2682c) {
                dVar.f2682c = false;
            } else {
                dVar.f2682c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3056c;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3056c;
        if (y2 != null) {
            y2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((z1.d) getEmojiTextViewHelper().f3095b.f170b).z(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0205p c0205p = this.f3055b;
        if (c0205p != null) {
            c0205p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0205p c0205p = this.f3055b;
        if (c0205p != null) {
            c0205p.i(mode);
        }
    }

    @Override // S.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j0.d dVar = this.f3054a;
        if (dVar != null) {
            dVar.f2683e = colorStateList;
            dVar.f2680a = true;
            dVar.a();
        }
    }

    @Override // S.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j0.d dVar = this.f3054a;
        if (dVar != null) {
            dVar.f2684f = mode;
            dVar.f2681b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3056c;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3056c;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(z1.l.F(getContext(), i));
    }
}
