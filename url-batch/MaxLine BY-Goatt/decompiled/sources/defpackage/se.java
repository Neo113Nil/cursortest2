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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class se extends AutoCompleteTextView {
    public static final int[] p = {R.attr.popupBackground};
    public final te m;
    public final xg n;
    public final t21 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.majelw.libystne.R.attr.autoCompleteTextViewStyle);
        vx2.a(context);
        xw2.a(this, getContext());
        mh z = mh.z(getContext(), attributeSet, p, com.majelw.libystne.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) z.n).hasValue(0)) {
            setDropDownBackgroundDrawable(z.q(0));
        }
        z.B();
        te teVar = new te(this);
        this.m = teVar;
        teVar.e(attributeSet, com.majelw.libystne.R.attr.autoCompleteTextViewStyle);
        xg xgVar = new xg(this);
        this.n = xgVar;
        xgVar.f(attributeSet, com.majelw.libystne.R.attr.autoCompleteTextViewStyle);
        xgVar.b();
        t21 t21Var = new t21(this, 4);
        this.o = t21Var;
        t21Var.B(attributeSet, com.majelw.libystne.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener z2 = t21Var.z(keyListener);
        if (z2 == keyListener) {
            return;
        }
        super.setKeyListener(z2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        te teVar = this.m;
        if (teVar != null) {
            teVar.a();
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ti2.m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        te teVar = this.m;
        if (teVar != null) {
            return teVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        te teVar = this.m;
        if (teVar != null) {
            return teVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.n.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.n.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        zm3.F(editorInfo, onCreateInputConnection, this);
        return this.o.D(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        te teVar = this.m;
        if (teVar != null) {
            teVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        te teVar = this.m;
        if (teVar != null) {
            teVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ti2.n(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(j8.F(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.o.H(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.o.z(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        te teVar = this.m;
        if (teVar != null) {
            teVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        te teVar = this.m;
        if (teVar != null) {
            teVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        xg xgVar = this.n;
        xgVar.k(colorStateList);
        xgVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        xg xgVar = this.n;
        xgVar.l(mode);
        xgVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.g(context, i);
        }
    }
}
