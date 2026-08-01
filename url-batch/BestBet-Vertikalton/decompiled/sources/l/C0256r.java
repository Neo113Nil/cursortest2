package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import c1.AbstractC0091d;

/* renamed from: l.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0256r extends CheckBox implements Q.s {

    /* renamed from: a, reason: collision with root package name */
    public final j0.d f3452a;

    /* renamed from: b, reason: collision with root package name */
    public final C0252p f3453b;

    /* renamed from: c, reason: collision with root package name */
    public final W f3454c;
    public C0266w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0256r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        Q0.a(this, getContext());
        j0.d dVar = new j0.d(this);
        this.f3452a = dVar;
        dVar.d(attributeSet, i);
        C0252p c0252p = new C0252p(this);
        this.f3453b = c0252p;
        c0252p.d(attributeSet, i);
        W w2 = new W(this);
        this.f3454c = w2;
        w2.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0266w getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0266w(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0252p c0252p = this.f3453b;
        if (c0252p != null) {
            c0252p.a();
        }
        W w2 = this.f3454c;
        if (w2 != null) {
            w2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0252p c0252p = this.f3453b;
        if (c0252p != null) {
            return c0252p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0252p c0252p = this.f3453b;
        if (c0252p != null) {
            return c0252p.c();
        }
        return null;
    }

    @Override // Q.s
    public ColorStateList getSupportButtonTintList() {
        j0.d dVar = this.f3452a;
        if (dVar != null) {
            return (ColorStateList) dVar.f3081e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j0.d dVar = this.f3452a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f3082f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3454c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3454c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0252p c0252p = this.f3453b;
        if (c0252p != null) {
            c0252p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0252p c0252p = this.f3453b;
        if (c0252p != null) {
            c0252p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j0.d dVar = this.f3452a;
        if (dVar != null) {
            if (dVar.f3080c) {
                dVar.f3080c = false;
            } else {
                dVar.f3080c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3454c;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3454c;
        if (w2 != null) {
            w2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((H1.l) getEmojiTextViewHelper().f3485b.f6b).H(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0252p c0252p = this.f3453b;
        if (c0252p != null) {
            c0252p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0252p c0252p = this.f3453b;
        if (c0252p != null) {
            c0252p.i(mode);
        }
    }

    @Override // Q.s
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j0.d dVar = this.f3452a;
        if (dVar != null) {
            dVar.f3081e = colorStateList;
            dVar.f3078a = true;
            dVar.a();
        }
    }

    @Override // Q.s
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j0.d dVar = this.f3452a;
        if (dVar != null) {
            dVar.f3082f = mode;
            dVar.f3079b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w2 = this.f3454c;
        w2.l(colorStateList);
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w2 = this.f3454c;
        w2.m(mode);
        w2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0091d.j(getContext(), i));
    }
}
