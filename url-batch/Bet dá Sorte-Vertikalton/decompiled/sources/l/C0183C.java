package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.glasspulse.glasspulse.R;

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0183C extends RadioButton implements Q.s {

    /* renamed from: a, reason: collision with root package name */
    public final h0.d f2815a;

    /* renamed from: b, reason: collision with root package name */
    public final C0229p f2816b;

    /* renamed from: c, reason: collision with root package name */
    public final X f2817c;
    public C0243w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        R0.a(context);
        Q0.a(this, getContext());
        h0.d dVar = new h0.d(this);
        this.f2815a = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        C0229p c0229p = new C0229p(this);
        this.f2816b = c0229p;
        c0229p.d(attributeSet, R.attr.radioButtonStyle);
        X x2 = new X(this);
        this.f2817c = x2;
        x2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0243w getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0243w(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0229p c0229p = this.f2816b;
        if (c0229p != null) {
            c0229p.a();
        }
        X x2 = this.f2817c;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0229p c0229p = this.f2816b;
        if (c0229p != null) {
            return c0229p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0229p c0229p = this.f2816b;
        if (c0229p != null) {
            return c0229p.c();
        }
        return null;
    }

    @Override // Q.s
    public ColorStateList getSupportButtonTintList() {
        h0.d dVar = this.f2815a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2483e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h0.d dVar = this.f2815a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2484f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2817c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2817c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0229p c0229p = this.f2816b;
        if (c0229p != null) {
            c0229p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0229p c0229p = this.f2816b;
        if (c0229p != null) {
            c0229p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h0.d dVar = this.f2815a;
        if (dVar != null) {
            if (dVar.f2482c) {
                dVar.f2482c = false;
            } else {
                dVar.f2482c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2817c;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2817c;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((u1.d) getEmojiTextViewHelper().f3051b.f150b).G(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0229p c0229p = this.f2816b;
        if (c0229p != null) {
            c0229p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0229p c0229p = this.f2816b;
        if (c0229p != null) {
            c0229p.i(mode);
        }
    }

    @Override // Q.s
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h0.d dVar = this.f2815a;
        if (dVar != null) {
            dVar.f2483e = colorStateList;
            dVar.f2480a = true;
            dVar.a();
        }
    }

    @Override // Q.s
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h0.d dVar = this.f2815a;
        if (dVar != null) {
            dVar.f2484f = mode;
            dVar.f2481b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f2817c;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f2817c;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(u1.d.D(getContext(), i));
    }
}
