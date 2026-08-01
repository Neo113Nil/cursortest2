package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.neonpulse.gridlogic.R;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0190D extends RadioButton implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final h0.d f2836a;

    /* renamed from: b, reason: collision with root package name */
    public final C0235p f2837b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f2838c;
    public C0251x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        S0.a(context);
        R0.a(this, getContext());
        h0.d dVar = new h0.d(this);
        this.f2836a = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        C0235p c0235p = new C0235p(this);
        this.f2837b = c0235p;
        c0235p.d(attributeSet, R.attr.radioButtonStyle);
        Y y2 = new Y(this);
        this.f2838c = y2;
        y2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0251x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0251x(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0235p c0235p = this.f2837b;
        if (c0235p != null) {
            c0235p.a();
        }
        Y y2 = this.f2838c;
        if (y2 != null) {
            y2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0235p c0235p = this.f2837b;
        if (c0235p != null) {
            return c0235p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0235p c0235p = this.f2837b;
        if (c0235p != null) {
            return c0235p.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        h0.d dVar = this.f2836a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2509e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h0.d dVar = this.f2836a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2510f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2838c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2838c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0235p c0235p = this.f2837b;
        if (c0235p != null) {
            c0235p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0235p c0235p = this.f2837b;
        if (c0235p != null) {
            c0235p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h0.d dVar = this.f2836a;
        if (dVar != null) {
            if (dVar.f2508c) {
                dVar.f2508c = false;
            } else {
                dVar.f2508c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2838c;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2838c;
        if (y2 != null) {
            y2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((x1.l) getEmojiTextViewHelper().f3075b.f67b).D(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0235p c0235p = this.f2837b;
        if (c0235p != null) {
            c0235p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0235p c0235p = this.f2837b;
        if (c0235p != null) {
            c0235p.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h0.d dVar = this.f2836a;
        if (dVar != null) {
            dVar.f2509e = colorStateList;
            dVar.f2506a = true;
            dVar.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h0.d dVar = this.f2836a;
        if (dVar != null) {
            dVar.f2510f = mode;
            dVar.f2507b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f2838c;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f2838c;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(x1.l.z(getContext(), i));
    }
}
