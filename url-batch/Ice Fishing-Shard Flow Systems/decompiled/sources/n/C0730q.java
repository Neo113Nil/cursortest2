package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.icefishing.icefish.ice.fishing.s294s.R;

/* renamed from: n.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730q extends CheckBox {

    /* renamed from: d, reason: collision with root package name */
    public final A6.j f6864d;

    /* renamed from: e, reason: collision with root package name */
    public final C0726o f6865e;

    /* renamed from: i, reason: collision with root package name */
    public final Z f6866i;

    /* renamed from: l, reason: collision with root package name */
    public C0739v f6867l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0730q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        j1.a(context);
        i1.a(this, getContext());
        A6.j jVar = new A6.j(this, 2);
        this.f6864d = jVar;
        jVar.c(attributeSet, R.attr.checkboxStyle);
        C0726o c0726o = new C0726o(this);
        this.f6865e = c0726o;
        c0726o.d(attributeSet, R.attr.checkboxStyle);
        Z z7 = new Z(this);
        this.f6866i = z7;
        z7.f(attributeSet, R.attr.checkboxStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.checkboxStyle);
    }

    private C0739v getEmojiTextViewHelper() {
        if (this.f6867l == null) {
            this.f6867l = new C0739v(this);
        }
        return this.f6867l;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0726o c0726o = this.f6865e;
        if (c0726o != null) {
            c0726o.a();
        }
        Z z7 = this.f6866i;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        A6.j jVar = this.f6864d;
        if (jVar != null) {
            jVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0726o c0726o = this.f6865e;
        if (c0726o != null) {
            return c0726o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0726o c0726o = this.f6865e;
        if (c0726o != null) {
            return c0726o.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        A6.j jVar = this.f6864d;
        if (jVar != null) {
            return (ColorStateList) jVar.f118f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        A6.j jVar = this.f6864d;
        if (jVar != null) {
            return (PorterDuff.Mode) jVar.f119g;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6866i.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6866i.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().c(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0726o c0726o = this.f6865e;
        if (c0726o != null) {
            c0726o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0726o c0726o = this.f6865e;
        if (c0726o != null) {
            c0726o.f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        A6.j jVar = this.f6864d;
        if (jVar != null) {
            if (jVar.f116d) {
                jVar.f116d = false;
            } else {
                jVar.f116d = true;
                jVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6866i;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6866i;
        if (z7 != null) {
            z7.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0726o c0726o = this.f6865e;
        if (c0726o != null) {
            c0726o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0726o c0726o = this.f6865e;
        if (c0726o != null) {
            c0726o.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        A6.j jVar = this.f6864d;
        if (jVar != null) {
            jVar.f118f = colorStateList;
            jVar.f114b = true;
            jVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        A6.j jVar = this.f6864d;
        if (jVar != null) {
            jVar.f119g = mode;
            jVar.f115c = true;
            jVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z7 = this.f6866i;
        z7.l(colorStateList);
        z7.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z7 = this.f6866i;
        z7.m(mode);
        z7.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(O6.g.M(getContext(), i2));
    }
}
