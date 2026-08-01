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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class g5 extends MultiAutoCompleteTextView {
    public static final int[] i = {R.attr.popupBackground};
    public final f2 f;
    public final f6 g;
    public final i5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.trembin.nirefon.betfury.R.attr.autoCompleteTextViewStyle);
        ji0.a(context);
        yh0.a(this, getContext());
        s6 t = s6.t(com.trembin.nirefon.betfury.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, i);
        if (((TypedArray) t.b).hasValue(0)) {
            setDropDownBackgroundDrawable(t.j(0));
        }
        t.v();
        f2 f2Var = new f2(this);
        this.f = f2Var;
        f2Var.l(attributeSet, com.trembin.nirefon.betfury.R.attr.autoCompleteTextViewStyle);
        f6 f6Var = new f6(this);
        this.g = f6Var;
        f6Var.f(attributeSet, com.trembin.nirefon.betfury.R.attr.autoCompleteTextViewStyle);
        f6Var.b();
        i5 i5Var = new i5(this, 5);
        this.h = i5Var;
        i5Var.A(attributeSet, com.trembin.nirefon.betfury.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener w = i5Var.w(keyListener);
        if (w == keyListener) {
            return;
        }
        super.setKeyListener(w);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.a();
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            return f2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            return f2Var.i();
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
        mv.F(editorInfo, onCreateInputConnection, this);
        return this.h.E(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.o(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(d50.v(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.h.P(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.w(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f6 f6Var = this.g;
        f6Var.l(colorStateList);
        f6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f6 f6Var = this.g;
        f6Var.m(mode);
        f6Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.g(context, i2);
        }
    }
}
