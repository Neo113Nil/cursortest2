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
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import g0.C0116b;
import m.C0260a;

/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0224o extends AutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0116b f2959a;

    /* renamed from: b, reason: collision with root package name */
    public final X f2960b;

    /* renamed from: c, reason: collision with root package name */
    public final C0179B f2961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0224o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.playbag.tripgear.R.attr.autoCompleteTextViewStyle);
        S0.a(context);
        R0.a(this, getContext());
        C0014l i = C0014l.i(getContext(), attributeSet, d, com.playbag.tripgear.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) i.f475b).hasValue(0)) {
            setDropDownBackgroundDrawable(i.c(0));
        }
        i.k();
        C0116b c0116b = new C0116b(this);
        this.f2959a = c0116b;
        c0116b.k(attributeSet, com.playbag.tripgear.R.attr.autoCompleteTextViewStyle);
        X x2 = new X(this);
        this.f2960b = x2;
        x2.f(attributeSet, com.playbag.tripgear.R.attr.autoCompleteTextViewStyle);
        x2.b();
        C0179B c0179b = new C0179B(this);
        this.f2961c = c0179b;
        c0179b.b(attributeSet, com.playbag.tripgear.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0179b.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0116b c0116b = this.f2959a;
        if (c0116b != null) {
            c0116b.a();
        }
        X x2 = this.f2960b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f743a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0116b c0116b = this.f2959a;
        if (c0116b != null) {
            return c0116b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0116b c0116b = this.f2959a;
        if (c0116b != null) {
            return c0116b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2960b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2960b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0260a.o(editorInfo, onCreateInputConnection, this);
        return this.f2961c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0116b c0116b = this.f2959a;
        if (c0116b != null) {
            c0116b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0116b c0116b = this.f2959a;
        if (c0116b != null) {
            c0116b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2960b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f2960b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w1.d.w0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(w1.l.z(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f2961c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2961c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0116b c0116b = this.f2959a;
        if (c0116b != null) {
            c0116b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0116b c0116b = this.f2959a;
        if (c0116b != null) {
            c0116b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f2960b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f2960b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f2960b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }
}
