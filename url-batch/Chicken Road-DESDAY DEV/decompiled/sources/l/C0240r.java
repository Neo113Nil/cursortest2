package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: l.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0240r extends CheckBox implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final h0.d f2981a;

    /* renamed from: b, reason: collision with root package name */
    public final C0236p f2982b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f2983c;
    public C0252x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        S0.a(this, getContext());
        h0.d dVar = new h0.d(this);
        this.f2981a = dVar;
        dVar.d(attributeSet, i);
        C0236p c0236p = new C0236p(this);
        this.f2982b = c0236p;
        c0236p.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f2983c = y2;
        y2.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0252x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0252x(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0236p c0236p = this.f2982b;
        if (c0236p != null) {
            c0236p.a();
        }
        Y y2 = this.f2983c;
        if (y2 != null) {
            y2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0236p c0236p = this.f2982b;
        if (c0236p != null) {
            return c0236p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0236p c0236p = this.f2982b;
        if (c0236p != null) {
            return c0236p.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        h0.d dVar = this.f2981a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2444e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h0.d dVar = this.f2981a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2445f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2983c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2983c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0236p c0236p = this.f2982b;
        if (c0236p != null) {
            c0236p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0236p c0236p = this.f2982b;
        if (c0236p != null) {
            c0236p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h0.d dVar = this.f2981a;
        if (dVar != null) {
            if (dVar.f2443c) {
                dVar.f2443c = false;
            } else {
                dVar.f2443c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2983c;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f2983c;
        if (y2 != null) {
            y2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((u1.d) getEmojiTextViewHelper().f3022b.f66b).K(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0236p c0236p = this.f2982b;
        if (c0236p != null) {
            c0236p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0236p c0236p = this.f2982b;
        if (c0236p != null) {
            c0236p.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h0.d dVar = this.f2981a;
        if (dVar != null) {
            dVar.f2444e = colorStateList;
            dVar.f2441a = true;
            dVar.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h0.d dVar = this.f2981a;
        if (dVar != null) {
            dVar.f2445f = mode;
            dVar.f2442b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f2983c;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f2983c;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(u1.d.G(getContext(), i));
    }
}
