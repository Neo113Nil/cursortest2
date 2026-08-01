package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import h0.C0132d;

/* renamed from: l.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0258s extends CheckBox implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final C0132d f3030a;

    /* renamed from: b, reason: collision with root package name */
    public final C0254q f3031b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f3032c;
    public C0270y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0258s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        S0.a(this, getContext());
        C0132d c0132d = new C0132d(this);
        this.f3030a = c0132d;
        c0132d.d(attributeSet, i);
        C0254q c0254q = new C0254q(this);
        this.f3031b = c0254q;
        c0254q.d(attributeSet, i);
        Z z2 = new Z(this);
        this.f3032c = z2;
        z2.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0270y getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0270y(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0254q c0254q = this.f3031b;
        if (c0254q != null) {
            c0254q.a();
        }
        Z z2 = this.f3032c;
        if (z2 != null) {
            z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0254q c0254q = this.f3031b;
        if (c0254q != null) {
            return c0254q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254q c0254q = this.f3031b;
        if (c0254q != null) {
            return c0254q.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        C0132d c0132d = this.f3030a;
        if (c0132d != null) {
            return (ColorStateList) c0132d.f2371e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0132d c0132d = this.f3030a;
        if (c0132d != null) {
            return (PorterDuff.Mode) c0132d.f2372f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3032c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3032c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254q c0254q = this.f3031b;
        if (c0254q != null) {
            c0254q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254q c0254q = this.f3031b;
        if (c0254q != null) {
            c0254q.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0132d c0132d = this.f3030a;
        if (c0132d != null) {
            if (c0132d.f2370c) {
                c0132d.f2370c = false;
            } else {
                c0132d.f2370c = true;
                c0132d.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3032c;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3032c;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q1.l) getEmojiTextViewHelper().f3069b.f59b).x(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254q c0254q = this.f3031b;
        if (c0254q != null) {
            c0254q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254q c0254q = this.f3031b;
        if (c0254q != null) {
            c0254q.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0132d c0132d = this.f3030a;
        if (c0132d != null) {
            c0132d.f2371e = colorStateList;
            c0132d.f2368a = true;
            c0132d.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0132d c0132d = this.f3030a;
        if (c0132d != null) {
            c0132d.f2372f = mode;
            c0132d.f2369b = true;
            c0132d.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f3032c;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f3032c;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(q1.l.v(getContext(), i));
    }
}
