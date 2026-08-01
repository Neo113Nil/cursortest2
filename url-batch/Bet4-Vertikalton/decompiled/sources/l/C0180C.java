package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.playbag.tripgear.R;
import g0.C0116b;

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0180C extends RadioButton implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final i0.d f2772a;

    /* renamed from: b, reason: collision with root package name */
    public final C0116b f2773b;

    /* renamed from: c, reason: collision with root package name */
    public final X f2774c;
    public C0240w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        S0.a(context);
        R0.a(this, getContext());
        i0.d dVar = new i0.d(this);
        this.f2772a = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        C0116b c0116b = new C0116b(this);
        this.f2773b = c0116b;
        c0116b.k(attributeSet, R.attr.radioButtonStyle);
        X x2 = new X(this);
        this.f2774c = x2;
        x2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0240w getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0240w(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0116b c0116b = this.f2773b;
        if (c0116b != null) {
            c0116b.a();
        }
        X x2 = this.f2774c;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0116b c0116b = this.f2773b;
        if (c0116b != null) {
            return c0116b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0116b c0116b = this.f2773b;
        if (c0116b != null) {
            return c0116b.i();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        i0.d dVar = this.f2772a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2532e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i0.d dVar = this.f2772a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2533f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2774c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2774c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0116b c0116b = this.f2773b;
        if (c0116b != null) {
            c0116b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0116b c0116b = this.f2773b;
        if (c0116b != null) {
            c0116b.n(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i0.d dVar = this.f2772a;
        if (dVar != null) {
            if (dVar.f2531c) {
                dVar.f2531c = false;
            } else {
                dVar.f2531c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2774c;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2774c;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((w1.d) getEmojiTextViewHelper().f3009b.f115b).D(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0116b c0116b = this.f2773b;
        if (c0116b != null) {
            c0116b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0116b c0116b = this.f2773b;
        if (c0116b != null) {
            c0116b.t(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i0.d dVar = this.f2772a;
        if (dVar != null) {
            dVar.f2532e = colorStateList;
            dVar.f2529a = true;
            dVar.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i0.d dVar = this.f2772a;
        if (dVar != null) {
            dVar.f2533f = mode;
            dVar.f2530b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f2774c;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f2774c;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(w1.l.z(getContext(), i));
    }
}
