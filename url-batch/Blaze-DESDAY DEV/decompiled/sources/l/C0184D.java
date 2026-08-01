package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.winworm.neongrid.R;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0184D extends RadioButton implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final i0.d f2800a;

    /* renamed from: b, reason: collision with root package name */
    public final C0229p f2801b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f2802c;
    public C0245x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        S0.a(context);
        R0.a(this, getContext());
        i0.d dVar = new i0.d(this);
        this.f2800a = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        C0229p c0229p = new C0229p(this);
        this.f2801b = c0229p;
        c0229p.d(attributeSet, R.attr.radioButtonStyle);
        Y y2 = new Y(this);
        this.f2802c = y2;
        y2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0245x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0245x(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0229p c0229p = this.f2801b;
        if (c0229p != null) {
            c0229p.a();
        }
        Y y2 = this.f2802c;
        if (y2 != null) {
            y2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0229p c0229p = this.f2801b;
        if (c0229p != null) {
            return c0229p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0229p c0229p = this.f2801b;
        if (c0229p != null) {
            return c0229p.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        i0.d dVar = this.f2800a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2563e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i0.d dVar = this.f2800a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2564f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2802c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2802c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0229p c0229p = this.f2801b;
        if (c0229p != null) {
            c0229p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0229p c0229p = this.f2801b;
        if (c0229p != null) {
            c0229p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i0.d dVar = this.f2800a;
        if (dVar != null) {
            if (dVar.f2562c) {
                dVar.f2562c = false;
            } else {
                dVar.f2562c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2802c;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2802c;
        if (y2 != null) {
            y2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((z1.d) getEmojiTextViewHelper().f3039b.f80b).G(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0229p c0229p = this.f2801b;
        if (c0229p != null) {
            c0229p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0229p c0229p = this.f2801b;
        if (c0229p != null) {
            c0229p.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i0.d dVar = this.f2800a;
        if (dVar != null) {
            dVar.f2563e = colorStateList;
            dVar.f2560a = true;
            dVar.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i0.d dVar = this.f2800a;
        if (dVar != null) {
            dVar.f2564f = mode;
            dVar.f2561b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f2802c;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f2802c;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(z1.l.w(getContext(), i));
    }
}
