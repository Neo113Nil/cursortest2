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

/* renamed from: n.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245A extends MultiAutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3422d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0294q f3423a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3424b;

    /* renamed from: c, reason: collision with root package name */
    public final C0247C f3425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0245A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winpower.neonfit.R.attr.autoCompleteTextViewStyle);
        X0.a(context);
        W0.a(this, getContext());
        I0.h r2 = I0.h.r(getContext(), attributeSet, f3422d, com.winpower.neonfit.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r2.f592c).hasValue(0)) {
            setDropDownBackgroundDrawable(r2.h(0));
        }
        r2.t();
        C0294q c0294q = new C0294q(this);
        this.f3423a = c0294q;
        c0294q.d(attributeSet, com.winpower.neonfit.R.attr.autoCompleteTextViewStyle);
        Y y2 = new Y(this);
        this.f3424b = y2;
        y2.f(attributeSet, com.winpower.neonfit.R.attr.autoCompleteTextViewStyle);
        y2.b();
        C0247C c0247c = new C0247C(this);
        this.f3425c = c0247c;
        c0247c.b(attributeSet, com.winpower.neonfit.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a2 = c0247c.a(keyListener);
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
        C0294q c0294q = this.f3423a;
        if (c0294q != null) {
            c0294q.a();
        }
        Y y2 = this.f3424b;
        if (y2 != null) {
            y2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0294q c0294q = this.f3423a;
        if (c0294q != null) {
            return c0294q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0294q c0294q = this.f3423a;
        if (c0294q != null) {
            return c0294q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3424b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3424b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        H1.l.K(editorInfo, onCreateInputConnection, this);
        return this.f3425c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0294q c0294q = this.f3423a;
        if (c0294q != null) {
            c0294q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0294q c0294q = this.f3423a;
        if (c0294q != null) {
            c0294q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3424b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3424b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(H1.d.F(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3425c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3425c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0294q c0294q = this.f3423a;
        if (c0294q != null) {
            c0294q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0294q c0294q = this.f3423a;
        if (c0294q != null) {
            c0294q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3424b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3424b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3424b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }
}
