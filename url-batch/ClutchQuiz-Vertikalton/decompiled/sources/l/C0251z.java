package l;

import K.C0012m;
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
public final class C0251z extends MultiAutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f3086a;

    /* renamed from: b, reason: collision with root package name */
    public final X f3087b;

    /* renamed from: c, reason: collision with root package name */
    public final C0183B f3088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.clutchquizarena.app.R.attr.autoCompleteTextViewStyle);
        R0.a(context);
        Q0.a(this, getContext());
        C0012m r2 = C0012m.r(getContext(), attributeSet, d, com.clutchquizarena.app.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r2.f423c).hasValue(0)) {
            setDropDownBackgroundDrawable(r2.h(0));
        }
        r2.t();
        C0231p c0231p = new C0231p(this);
        this.f3086a = c0231p;
        c0231p.d(attributeSet, com.clutchquizarena.app.R.attr.autoCompleteTextViewStyle);
        X x2 = new X(this);
        this.f3087b = x2;
        x2.f(attributeSet, com.clutchquizarena.app.R.attr.autoCompleteTextViewStyle);
        x2.b();
        C0183B c0183b = new C0183B(this);
        this.f3088c = c0183b;
        c0183b.b(attributeSet, com.clutchquizarena.app.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a2 = c0183b.a(keyListener);
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
        C0231p c0231p = this.f3086a;
        if (c0231p != null) {
            c0231p.a();
        }
        X x2 = this.f3087b;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f3086a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f3086a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3087b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3087b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h0.g.h(editorInfo, onCreateInputConnection, this);
        return this.f3088c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f3086a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f3086a;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3087b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3087b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(T.d.t(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3088c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3088c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f3086a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f3086a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3087b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3087b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f3087b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }
}
