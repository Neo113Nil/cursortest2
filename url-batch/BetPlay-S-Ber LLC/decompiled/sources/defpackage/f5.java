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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class f5 extends MultiAutoCompleteTextView {
    public static final int[] i = {R.attr.popupBackground};
    public final t3 f;
    public final e6 g;
    public final h5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.awerser.monnit.betplay.R.attr.autoCompleteTextViewStyle);
        e60.a(context);
        a60.a(this, getContext());
        r6 u = r6.u(com.awerser.monnit.betplay.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, i);
        if (((TypedArray) u.b).hasValue(0)) {
            setDropDownBackgroundDrawable(u.k(0));
        }
        u.w();
        t3 t3Var = new t3(this);
        this.f = t3Var;
        t3Var.d(attributeSet, com.awerser.monnit.betplay.R.attr.autoCompleteTextViewStyle);
        e6 e6Var = new e6(this);
        this.g = e6Var;
        e6Var.f(attributeSet, com.awerser.monnit.betplay.R.attr.autoCompleteTextViewStyle);
        e6Var.b();
        h5 h5Var = new h5(this, 4);
        this.h = h5Var;
        h5Var.y(attributeSet, com.awerser.monnit.betplay.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener u2 = h5Var.u(keyListener);
        if (u2 == keyListener) {
            return;
        }
        super.setKeyListener(u2);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.a();
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t3 t3Var = this.f;
        if (t3Var != null) {
            return t3Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t3 t3Var = this.f;
        if (t3Var != null) {
            return t3Var.c();
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
        vw.a0(editorInfo, onCreateInputConnection, this);
        return this.h.B(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(l70.p(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.h.L(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e6 e6Var = this.g;
        e6Var.l(colorStateList);
        e6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e6 e6Var = this.g;
        e6Var.m(mode);
        e6Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.g(context, i2);
        }
    }
}
