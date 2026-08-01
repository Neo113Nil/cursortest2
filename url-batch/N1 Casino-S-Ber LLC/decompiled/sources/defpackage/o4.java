package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class o4 extends MultiAutoCompleteTextView {
    public static final int[] i = {R.attr.popupBackground};
    public final x1 f;
    public final n5 g;
    public final q4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.derinko.gbini.n1casino.R.attr.autoCompleteTextViewStyle);
        w50.a(context);
        s50.a(this, getContext());
        a6 u = a6.u(com.derinko.gbini.n1casino.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, i);
        if (((TypedArray) u.b).hasValue(0)) {
            setDropDownBackgroundDrawable(u.k(0));
        }
        u.w();
        x1 x1Var = new x1(this);
        this.f = x1Var;
        x1Var.l(attributeSet, com.derinko.gbini.n1casino.R.attr.autoCompleteTextViewStyle);
        n5 n5Var = new n5(this);
        this.g = n5Var;
        n5Var.f(attributeSet, com.derinko.gbini.n1casino.R.attr.autoCompleteTextViewStyle);
        n5Var.b();
        q4 q4Var = new q4(this, 6);
        this.h = q4Var;
        q4Var.E(attributeSet, com.derinko.gbini.n1casino.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener z = q4Var.z(keyListener);
        if (z == keyListener) {
            return;
        }
        super.setKeyListener(z);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.a();
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x1 x1Var = this.f;
        if (x1Var != null) {
            return x1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x1 x1Var = this.f;
        if (x1Var != null) {
            return x1Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        o8.Y(editorInfo, onCreateInputConnection, this);
        return this.h.H(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.o(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(zo.s(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.h.R(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.z(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        n5 n5Var = this.g;
        n5Var.l(colorStateList);
        n5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        n5 n5Var = this.g;
        n5Var.m(mode);
        n5Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.g(context, i2);
        }
    }
}
