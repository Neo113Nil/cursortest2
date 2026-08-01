package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class p extends CheckBox implements r0.i {

    /* renamed from: f, reason: collision with root package name */
    public final h1.c f2528f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.c f2529g;
    public final v0 h;
    public u i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        p2.a(context);
        o2.a(this, getContext());
        h1.c cVar = new h1.c(this);
        this.f2528f = cVar;
        cVar.d(attributeSet, i);
        com.google.android.material.datepicker.c cVar2 = new com.google.android.material.datepicker.c(this);
        this.f2529g = cVar2;
        cVar2.m(attributeSet, i);
        v0 v0Var = new v0(this);
        this.h = v0Var;
        v0Var.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private u getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new u(this);
        }
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f2529g;
        if (cVar != null) {
            cVar.a();
        }
        v0 v0Var = this.h;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f2529g;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f2529g;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    @Override // r0.i
    public ColorStateList getSupportButtonTintList() {
        h1.c cVar = this.f2528f;
        if (cVar != null) {
            return (ColorStateList) cVar.f1969e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h1.c cVar = this.f2528f;
        if (cVar != null) {
            return (PorterDuff.Mode) cVar.f1970f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f2529g;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        com.google.android.material.datepicker.c cVar = this.f2529g;
        if (cVar != null) {
            cVar.p(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h1.c cVar = this.f2528f;
        if (cVar != null) {
            if (cVar.f1968c) {
                cVar.f1968c = false;
            } else {
                cVar.f1968c = true;
                cVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.h;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.h;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((r1.b) getEmojiTextViewHelper().f2571b.f3172a).l(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f2529g;
        if (cVar != null) {
            cVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f2529g;
        if (cVar != null) {
            cVar.v(mode);
        }
    }

    @Override // r0.i
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h1.c cVar = this.f2528f;
        if (cVar != null) {
            cVar.f1969e = colorStateList;
            cVar.f1966a = true;
            cVar.a();
        }
    }

    @Override // r0.i
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h1.c cVar = this.f2528f;
        if (cVar != null) {
            cVar.f1970f = mode;
            cVar.f1967b = true;
            cVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.h;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.h;
        v0Var.m(mode);
        v0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(b4.d.y(getContext(), i));
    }
}
