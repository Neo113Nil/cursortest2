package l;

import K.C0014l;
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
import g0.C0116b;
import m.C0260a;

/* renamed from: l.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246z extends MultiAutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0116b f3029a;

    /* renamed from: b, reason: collision with root package name */
    public final X f3030b;

    /* renamed from: c, reason: collision with root package name */
    public final C0179B f3031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.playbag.tripgear.R.attr.autoCompleteTextViewStyle);
        S0.a(context);
        R0.a(this, getContext());
        C0014l i = C0014l.i(getContext(), attributeSet, d, com.playbag.tripgear.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) i.f475b).hasValue(0)) {
            setDropDownBackgroundDrawable(i.c(0));
        }
        i.k();
        C0116b c0116b = new C0116b(this);
        this.f3029a = c0116b;
        c0116b.k(attributeSet, com.playbag.tripgear.R.attr.autoCompleteTextViewStyle);
        X x2 = new X(this);
        this.f3030b = x2;
        x2.f(attributeSet, com.playbag.tripgear.R.attr.autoCompleteTextViewStyle);
        x2.b();
        C0179B c0179b = new C0179B(this);
        this.f3031c = c0179b;
        c0179b.b(attributeSet, com.playbag.tripgear.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a2 = c0179b.a(keyListener);
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
        C0116b c0116b = this.f3029a;
        if (c0116b != null) {
            c0116b.a();
        }
        X x2 = this.f3030b;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0116b c0116b = this.f3029a;
        if (c0116b != null) {
            return c0116b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0116b c0116b = this.f3029a;
        if (c0116b != null) {
            return c0116b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3030b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3030b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0260a.o(editorInfo, onCreateInputConnection, this);
        return this.f3031c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0116b c0116b = this.f3029a;
        if (c0116b != null) {
            c0116b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0116b c0116b = this.f3029a;
        if (c0116b != null) {
            c0116b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3030b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3030b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(w1.l.z(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3031c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3031c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0116b c0116b = this.f3029a;
        if (c0116b != null) {
            c0116b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0116b c0116b = this.f3029a;
        if (c0116b != null) {
            c0116b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3030b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3030b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f3030b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }
}
