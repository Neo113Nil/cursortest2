package l;

import K.C0011l;
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

/* renamed from: l.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249z extends MultiAutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0229p f3071a;

    /* renamed from: b, reason: collision with root package name */
    public final X f3072b;

    /* renamed from: c, reason: collision with root package name */
    public final C0182B f3073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.glasspulse.glasspulse.R.attr.autoCompleteTextViewStyle);
        R0.a(context);
        Q0.a(this, getContext());
        C0011l r2 = C0011l.r(getContext(), attributeSet, d, com.glasspulse.glasspulse.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r2.f405c).hasValue(0)) {
            setDropDownBackgroundDrawable(r2.h(0));
        }
        r2.t();
        C0229p c0229p = new C0229p(this);
        this.f3071a = c0229p;
        c0229p.d(attributeSet, com.glasspulse.glasspulse.R.attr.autoCompleteTextViewStyle);
        X x2 = new X(this);
        this.f3072b = x2;
        x2.f(attributeSet, com.glasspulse.glasspulse.R.attr.autoCompleteTextViewStyle);
        x2.b();
        C0182B c0182b = new C0182B(this);
        this.f3073c = c0182b;
        c0182b.b(attributeSet, com.glasspulse.glasspulse.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a2 = c0182b.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0229p c0229p = this.f3071a;
        if (c0229p != null) {
            c0229p.a();
        }
        X x2 = this.f3072b;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0229p c0229p = this.f3071a;
        if (c0229p != null) {
            return c0229p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0229p c0229p = this.f3071a;
        if (c0229p != null) {
            return c0229p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3072b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3072b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        k0.w.m(editorInfo, onCreateInputConnection, this);
        return this.f3073c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0229p c0229p = this.f3071a;
        if (c0229p != null) {
            c0229p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0229p c0229p = this.f3071a;
        if (c0229p != null) {
            c0229p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3072b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3072b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(u1.d.D(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3073c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3073c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0229p c0229p = this.f3071a;
        if (c0229p != null) {
            c0229p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0229p c0229p = this.f3071a;
        if (c0229p != null) {
            c0229p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3072b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3072b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f3072b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }
}
