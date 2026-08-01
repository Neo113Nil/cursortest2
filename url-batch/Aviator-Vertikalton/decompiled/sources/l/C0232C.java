package l;

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

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232C extends MultiAutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3209d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0280q f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final C0249a0 f3211b;

    /* renamed from: c, reason: collision with root package name */
    public final C0234E f3212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.fortuneink.neonpad.R.attr.autoCompleteTextViewStyle);
        U0.a(context);
        T0.a(this, getContext());
        T.r r2 = T.r.r(getContext(), attributeSet, f3209d, com.fortuneink.neonpad.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r2.f811c).hasValue(0)) {
            setDropDownBackgroundDrawable(r2.h(0));
        }
        r2.t();
        C0280q c0280q = new C0280q(this);
        this.f3210a = c0280q;
        c0280q.d(attributeSet, com.fortuneink.neonpad.R.attr.autoCompleteTextViewStyle);
        C0249a0 c0249a0 = new C0249a0(this);
        this.f3211b = c0249a0;
        c0249a0.f(attributeSet, com.fortuneink.neonpad.R.attr.autoCompleteTextViewStyle);
        c0249a0.b();
        C0234E c0234e = new C0234E(this);
        this.f3212c = c0234e;
        c0234e.b(attributeSet, com.fortuneink.neonpad.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a2 = c0234e.a(keyListener);
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
        C0280q c0280q = this.f3210a;
        if (c0280q != null) {
            c0280q.a();
        }
        C0249a0 c0249a0 = this.f3211b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0280q c0280q = this.f3210a;
        if (c0280q != null) {
            return c0280q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0280q c0280q = this.f3210a;
        if (c0280q != null) {
            return c0280q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3211b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3211b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        i1.r.m(editorInfo, onCreateInputConnection, this);
        return this.f3212c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0280q c0280q = this.f3210a;
        if (c0280q != null) {
            c0280q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0280q c0280q = this.f3210a;
        if (c0280q != null) {
            c0280q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3211b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3211b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(q1.d.z(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3212c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3212c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0280q c0280q = this.f3210a;
        if (c0280q != null) {
            c0280q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0280q c0280q = this.f3210a;
        if (c0280q != null) {
            c0280q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0249a0 c0249a0 = this.f3211b;
        c0249a0.l(colorStateList);
        c0249a0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0249a0 c0249a0 = this.f3211b;
        c0249a0.m(mode);
        c0249a0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0249a0 c0249a0 = this.f3211b;
        if (c0249a0 != null) {
            c0249a0.g(context, i);
        }
    }
}
