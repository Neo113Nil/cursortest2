package l;

import K.C0012l;
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

/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205B extends MultiAutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0254q f2844a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f2845b;

    /* renamed from: c, reason: collision with root package name */
    public final C0207D f2846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0205B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.quicktoss.winflip.R.attr.autoCompleteTextViewStyle);
        T0.a(context);
        S0.a(this, getContext());
        C0012l r2 = C0012l.r(getContext(), attributeSet, d, com.quicktoss.winflip.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r2.f432c).hasValue(0)) {
            setDropDownBackgroundDrawable(r2.h(0));
        }
        r2.t();
        C0254q c0254q = new C0254q(this);
        this.f2844a = c0254q;
        c0254q.d(attributeSet, com.quicktoss.winflip.R.attr.autoCompleteTextViewStyle);
        Z z2 = new Z(this);
        this.f2845b = z2;
        z2.f(attributeSet, com.quicktoss.winflip.R.attr.autoCompleteTextViewStyle);
        z2.b();
        C0207D c0207d = new C0207D(this);
        this.f2846c = c0207d;
        c0207d.b(attributeSet, com.quicktoss.winflip.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a2 = c0207d.a(keyListener);
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
        C0254q c0254q = this.f2844a;
        if (c0254q != null) {
            c0254q.a();
        }
        Z z2 = this.f2845b;
        if (z2 != null) {
            z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0254q c0254q = this.f2844a;
        if (c0254q != null) {
            return c0254q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254q c0254q = this.f2844a;
        if (c0254q != null) {
            return c0254q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2845b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2845b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        i1.q.h(editorInfo, onCreateInputConnection, this);
        return this.f2846c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254q c0254q = this.f2844a;
        if (c0254q != null) {
            c0254q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254q c0254q = this.f2844a;
        if (c0254q != null) {
            c0254q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2845b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2845b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(q1.l.v(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f2846c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2846c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254q c0254q = this.f2844a;
        if (c0254q != null) {
            c0254q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254q c0254q = this.f2844a;
        if (c0254q != null) {
            c0254q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f2845b;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f2845b;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Z z2 = this.f2845b;
        if (z2 != null) {
            z2.g(context, i);
        }
    }
}
