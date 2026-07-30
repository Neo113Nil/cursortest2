package n;

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

/* renamed from: n.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745y extends MultiAutoCompleteTextView {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f6952l = {R.attr.popupBackground};

    /* renamed from: d, reason: collision with root package name */
    public final C0726o f6953d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f6954e;

    /* renamed from: i, reason: collision with root package name */
    public final C0695A f6955i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0745y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.icefishing.icefish.ice.fishing.s294s.R.attr.autoCompleteTextViewStyle);
        j1.a(context);
        i1.a(this, getContext());
        D0.j R4 = D0.j.R(getContext(), attributeSet, f6952l, com.icefishing.icefish.ice.fishing.s294s.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) R4.f331i).hasValue(0)) {
            setDropDownBackgroundDrawable(R4.J(0));
        }
        R4.W();
        C0726o c0726o = new C0726o(this);
        this.f6953d = c0726o;
        c0726o.d(attributeSet, com.icefishing.icefish.ice.fishing.s294s.R.attr.autoCompleteTextViewStyle);
        Z z7 = new Z(this);
        this.f6954e = z7;
        z7.f(attributeSet, com.icefishing.icefish.ice.fishing.s294s.R.attr.autoCompleteTextViewStyle);
        z7.b();
        C0695A c0695a = new C0695A(this);
        this.f6955i = c0695a;
        c0695a.b(attributeSet, com.icefishing.icefish.ice.fishing.s294s.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a7 = c0695a.a(keyListener);
        if (a7 == keyListener) {
            return;
        }
        super.setKeyListener(a7);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0726o c0726o = this.f6953d;
        if (c0726o != null) {
            c0726o.a();
        }
        Z z7 = this.f6954e;
        if (z7 != null) {
            z7.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0726o c0726o = this.f6953d;
        if (c0726o != null) {
            return c0726o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0726o c0726o = this.f6953d;
        if (c0726o != null) {
            return c0726o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6954e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6954e.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        O6.g.W(editorInfo, onCreateInputConnection, this);
        return this.f6955i.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0726o c0726o = this.f6953d;
        if (c0726o != null) {
            c0726o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0726o c0726o = this.f6953d;
        if (c0726o != null) {
            c0726o.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6954e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6954e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(O6.g.M(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f6955i.d(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f6955i.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0726o c0726o = this.f6953d;
        if (c0726o != null) {
            c0726o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0726o c0726o = this.f6953d;
        if (c0726o != null) {
            c0726o.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z7 = this.f6954e;
        z7.l(colorStateList);
        z7.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z7 = this.f6954e;
        z7.m(mode);
        z7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        Z z7 = this.f6954e;
        if (z7 != null) {
            z7.g(context, i2);
        }
    }
}
