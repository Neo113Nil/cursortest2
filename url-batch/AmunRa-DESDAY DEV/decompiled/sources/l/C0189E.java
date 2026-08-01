package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.visualfortune.eyerest.R;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0189E extends RadioButton implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final h0.d f2931a;

    /* renamed from: b, reason: collision with root package name */
    public final C0235q f2932b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f2933c;
    public C0251y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        T0.a(context);
        S0.a(this, getContext());
        h0.d dVar = new h0.d(this);
        this.f2931a = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        C0235q c0235q = new C0235q(this);
        this.f2932b = c0235q;
        c0235q.d(attributeSet, R.attr.radioButtonStyle);
        Z z2 = new Z(this);
        this.f2933c = z2;
        z2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0251y getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0251y(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0235q c0235q = this.f2932b;
        if (c0235q != null) {
            c0235q.a();
        }
        Z z2 = this.f2933c;
        if (z2 != null) {
            z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0235q c0235q = this.f2932b;
        if (c0235q != null) {
            return c0235q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0235q c0235q = this.f2932b;
        if (c0235q != null) {
            return c0235q.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        h0.d dVar = this.f2931a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2456e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h0.d dVar = this.f2931a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2457f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2933c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2933c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0235q c0235q = this.f2932b;
        if (c0235q != null) {
            c0235q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0235q c0235q = this.f2932b;
        if (c0235q != null) {
            c0235q.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h0.d dVar = this.f2931a;
        if (dVar != null) {
            if (dVar.f2455c) {
                dVar.f2455c = false;
            } else {
                dVar.f2455c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2933c;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2933c;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((s1.d) getEmojiTextViewHelper().f3169b.f64b).B(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0235q c0235q = this.f2932b;
        if (c0235q != null) {
            c0235q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0235q c0235q = this.f2932b;
        if (c0235q != null) {
            c0235q.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h0.d dVar = this.f2931a;
        if (dVar != null) {
            dVar.f2456e = colorStateList;
            dVar.f2453a = true;
            dVar.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h0.d dVar = this.f2931a;
        if (dVar != null) {
            dVar.f2457f = mode;
            dVar.f2454b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f2933c;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f2933c;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(s1.l.z(getContext(), i));
    }
}
