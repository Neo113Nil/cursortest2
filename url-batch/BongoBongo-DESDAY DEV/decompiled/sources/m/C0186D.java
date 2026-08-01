package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.winfour.winrandom.R;
import h.AbstractC0112a;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0186D extends RadioButton implements R.t {

    /* renamed from: a, reason: collision with root package name */
    public final j0.d f2913a;

    /* renamed from: b, reason: collision with root package name */
    public final C0231p f2914b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f2915c;
    public C0247x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0186D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        Y0.a(context);
        X0.a(this, getContext());
        j0.d dVar = new j0.d(this);
        this.f2913a = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        C0231p c0231p = new C0231p(this);
        this.f2914b = c0231p;
        c0231p.d(attributeSet, R.attr.radioButtonStyle);
        Y y2 = new Y(this);
        this.f2915c = y2;
        y2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private C0247x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0247x(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f2914b;
        if (c0231p != null) {
            c0231p.a();
        }
        Y y2 = this.f2915c;
        if (y2 != null) {
            y2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f2914b;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f2914b;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    @Override // R.t
    public ColorStateList getSupportButtonTintList() {
        j0.d dVar = this.f2913a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2663e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j0.d dVar = this.f2913a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2664f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2915c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2915c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f2914b;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f2914b;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j0.d dVar = this.f2913a;
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2915c;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2915c;
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
        C0231p c0231p = this.f2914b;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f2914b;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    @Override // R.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j0.d dVar = this.f2913a;
        if (dVar != null) {
            dVar.f2663e = colorStateList;
            dVar.f2660a = true;
            dVar.a();
        }
    }

    @Override // R.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j0.d dVar = this.f2913a;
        if (dVar != null) {
            dVar.f2664f = mode;
            dVar.f2661b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f2915c;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f2915c;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0112a.l(getContext(), i));
    }
}
