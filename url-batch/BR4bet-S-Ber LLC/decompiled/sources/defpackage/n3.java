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
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class n3 extends AutoCompleteTextView {
    public static final int[] i = {R.attr.popupBackground};
    public final y1 f;
    public final x5 g;
    public final a5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.moontiko.really.admiralcasino.R.attr.autoCompleteTextViewStyle);
        g90.a(context);
        z80.a(this, getContext());
        k6 z = k6.z(com.moontiko.really.admiralcasino.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, i);
        if (((TypedArray) z.g).hasValue(0)) {
            setDropDownBackgroundDrawable(z.o(0));
        }
        z.B();
        y1 y1Var = new y1(this);
        this.f = y1Var;
        y1Var.l(attributeSet, com.moontiko.really.admiralcasino.R.attr.autoCompleteTextViewStyle);
        x5 x5Var = new x5(this);
        this.g = x5Var;
        x5Var.f(attributeSet, com.moontiko.really.admiralcasino.R.attr.autoCompleteTextViewStyle);
        x5Var.b();
        a5 a5Var = new a5(this, 6);
        this.h = a5Var;
        a5Var.E(attributeSet, com.moontiko.really.admiralcasino.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener A = a5Var.A(keyListener);
        if (A == keyListener) {
            return;
        }
        super.setKeyListener(A);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.a();
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof w80 ? ((w80) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.i();
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
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kr.M(editorInfo, onCreateInputConnection, this);
        return this.h.H(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.o(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xf.O(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(mz.m(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.h.R(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.A(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x5 x5Var = this.g;
        x5Var.l(colorStateList);
        x5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x5 x5Var = this.g;
        x5Var.m(mode);
        x5Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.g(context, i2);
        }
    }
}
