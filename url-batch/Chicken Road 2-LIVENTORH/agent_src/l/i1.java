package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i1 extends ToggleButton {

    /* renamed from: f, reason: collision with root package name */
    public final f1.b f2347f;

    /* renamed from: g, reason: collision with root package name */
    public final y0 f2348g;

    /* renamed from: h, reason: collision with root package name */
    public x f2349h;

    public i1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        r2.a(this, getContext());
        f1.b bVar = new f1.b(this);
        this.f2347f = bVar;
        bVar.k(attributeSet, R.attr.buttonStyleToggle);
        y0 y0Var = new y0(this);
        this.f2348g = y0Var;
        y0Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private x getEmojiTextViewHelper() {
        if (this.f2349h == null) {
            this.f2349h = new x(this);
        }
        return this.f2349h;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f1.b bVar = this.f2347f;
        if (bVar != null) {
            bVar.a();
        }
        y0 y0Var = this.f2348g;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f1.b bVar = this.f2347f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f1.b bVar = this.f2347f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2348g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2348g.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f1.b bVar = this.f2347f;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f1.b bVar = this.f2347f;
        if (bVar != null) {
            bVar.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f2348g;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f2348g;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((t0.d) getEmojiTextViewHelper().f2491b.f3355a).g(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f1.b bVar = this.f2347f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f1.b bVar = this.f2347f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f2348g;
        y0Var.l(colorStateList);
        y0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f2348g;
        y0Var.m(mode);
        y0Var.b();
    }
}
