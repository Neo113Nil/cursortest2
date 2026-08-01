package k;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class y extends MultiAutoCompleteTextView {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f2688i = {R.attr.popupBackground};

    /* renamed from: f, reason: collision with root package name */
    public final b1.b f2689f;
    public final v0 g;
    public final a0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.autoCompleteTextViewStyle);
        p2.a(context);
        o2.a(this, getContext());
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(com.gglhk.bofio.fortunetiger.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, f2688i);
        if (((TypedArray) r3.c).hasValue(0)) {
            setDropDownBackgroundDrawable(r3.i(0));
        }
        r3.t();
        b1.b bVar = new b1.b(this);
        this.f2689f = bVar;
        bVar.l(attributeSet, com.gglhk.bofio.fortunetiger.R.attr.autoCompleteTextViewStyle);
        v0 v0Var = new v0(this);
        this.g = v0Var;
        v0Var.f(attributeSet, com.gglhk.bofio.fortunetiger.R.attr.autoCompleteTextViewStyle);
        v0Var.b();
        a0 a0Var = new a0(this);
        this.h = a0Var;
        a0Var.b(attributeSet, com.gglhk.bofio.fortunetiger.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a4 = a0Var.a(keyListener);
        if (a4 == keyListener) {
            return;
        }
        super.setKeyListener(a4);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b1.b bVar = this.f2689f;
        if (bVar != null) {
            bVar.a();
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        b1.b bVar = this.f2689f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b1.b bVar = this.f2689f;
        if (bVar != null) {
            return bVar.i();
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
        k3.m.I(editorInfo, onCreateInputConnection, this);
        return this.h.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b1.b bVar = this.f2689f;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        b1.b bVar = this.f2689f;
        if (bVar != null) {
            bVar.o(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(k3.m.w(getContext(), i4));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.h.d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b1.b bVar = this.f2689f;
        if (bVar != null) {
            bVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b1.b bVar = this.f2689f;
        if (bVar != null) {
            bVar.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.g;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.g;
        v0Var.m(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.g(context, i4);
        }
    }
}
