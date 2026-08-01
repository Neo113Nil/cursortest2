package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class b0 extends RadioButton implements o0.j {

    /* renamed from: f, reason: collision with root package name */
    public final c1.d f2502f;
    public final b1.b g;
    public final v0 h;

    /* renamed from: i, reason: collision with root package name */
    public v f2503i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        p2.a(context);
        o2.a(this, getContext());
        c1.d dVar = new c1.d(this);
        this.f2502f = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        b1.b bVar = new b1.b(this);
        this.g = bVar;
        bVar.l(attributeSet, R.attr.radioButtonStyle);
        v0 v0Var = new v0(this);
        this.h = v0Var;
        v0Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private v getEmojiTextViewHelper() {
        if (this.f2503i == null) {
            this.f2503i = new v(this);
        }
        return this.f2503i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b1.b bVar = this.g;
        if (bVar != null) {
            bVar.a();
        }
        v0 v0Var = this.h;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        b1.b bVar = this.g;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b1.b bVar = this.g;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    @Override // o0.j
    public ColorStateList getSupportButtonTintList() {
        c1.d dVar = this.f2502f;
        if (dVar != null) {
            return (ColorStateList) dVar.f1001e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        c1.d dVar = this.f2502f;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f1002f;
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
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b1.b bVar = this.g;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        b1.b bVar = this.g;
        if (bVar != null) {
            bVar.o(i4);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        c1.d dVar = this.f2502f;
        if (dVar != null) {
            if (dVar.c) {
                dVar.c = false;
            } else {
                dVar.c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.h;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.h;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((m0.a) getEmojiTextViewHelper().f2670b.f3139f).k(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b1.b bVar = this.g;
        if (bVar != null) {
            bVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b1.b bVar = this.g;
        if (bVar != null) {
            bVar.u(mode);
        }
    }

    @Override // o0.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        c1.d dVar = this.f2502f;
        if (dVar != null) {
            dVar.f1001e = colorStateList;
            dVar.f998a = true;
            dVar.a();
        }
    }

    @Override // o0.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        c1.d dVar = this.f2502f;
        if (dVar != null) {
            dVar.f1002f = mode;
            dVar.f999b = true;
            dVar.a();
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
    public void setButtonDrawable(int i4) {
        setButtonDrawable(k3.m.w(getContext(), i4));
    }
}
