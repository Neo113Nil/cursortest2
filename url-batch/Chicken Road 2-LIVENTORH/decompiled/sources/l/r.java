package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class r extends CheckBox implements r0.j {

    /* renamed from: f, reason: collision with root package name */
    public final g1.c f2421f;

    /* renamed from: g, reason: collision with root package name */
    public final f1.b f2422g;

    /* renamed from: h, reason: collision with root package name */
    public final y0 f2423h;
    public x i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s2.a(context);
        r2.a(this, getContext());
        g1.c cVar = new g1.c(this);
        this.f2421f = cVar;
        cVar.d(attributeSet, i);
        f1.b bVar = new f1.b(this);
        this.f2422g = bVar;
        bVar.k(attributeSet, i);
        y0 y0Var = new y0(this);
        this.f2423h = y0Var;
        y0Var.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private x getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new x(this);
        }
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f1.b bVar = this.f2422g;
        if (bVar != null) {
            bVar.a();
        }
        y0 y0Var = this.f2423h;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f1.b bVar = this.f2422g;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f1.b bVar = this.f2422g;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    @Override // r0.j
    public ColorStateList getSupportButtonTintList() {
        g1.c cVar = this.f2421f;
        if (cVar != null) {
            return (ColorStateList) cVar.f1700e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g1.c cVar = this.f2421f;
        if (cVar != null) {
            return (PorterDuff.Mode) cVar.f1701f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2423h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2423h.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f1.b bVar = this.f2422g;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f1.b bVar = this.f2422g;
        if (bVar != null) {
            bVar.n(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g1.c cVar = this.f2421f;
        if (cVar != null) {
            if (cVar.f1699c) {
                cVar.f1699c = false;
            } else {
                cVar.f1699c = true;
                cVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f2423h;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f2423h;
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
        f1.b bVar = this.f2422g;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f1.b bVar = this.f2422g;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    @Override // r0.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g1.c cVar = this.f2421f;
        if (cVar != null) {
            cVar.f1700e = colorStateList;
            cVar.f1697a = true;
            cVar.a();
        }
    }

    @Override // r0.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g1.c cVar = this.f2421f;
        if (cVar != null) {
            cVar.f1701f = mode;
            cVar.f1698b = true;
            cVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f2423h;
        y0Var.l(colorStateList);
        y0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f2423h;
        y0Var.m(mode);
        y0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(h.a.x(getContext(), i));
    }
}
