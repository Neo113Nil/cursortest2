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
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import m.C0227a;

/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0203o extends AutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0205p f3040a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3041b;

    /* renamed from: c, reason: collision with root package name */
    public final C0174C f3042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winfour.neondrop.R.attr.autoCompleteTextViewStyle);
        T0.a(context);
        S0.a(this, getContext());
        A1.j t2 = A1.j.t(getContext(), attributeSet, d, com.winfour.neondrop.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) t2.f81c).hasValue(0)) {
            setDropDownBackgroundDrawable(t2.j(0));
        }
        t2.v();
        C0205p c0205p = new C0205p(this);
        this.f3040a = c0205p;
        c0205p.d(attributeSet, com.winfour.neondrop.R.attr.autoCompleteTextViewStyle);
        Y y2 = new Y(this);
        this.f3041b = y2;
        y2.f(attributeSet, com.winfour.neondrop.R.attr.autoCompleteTextViewStyle);
        y2.b();
        C0174C c0174c = new C0174C(this);
        this.f3042c = c0174c;
        c0174c.b(attributeSet, com.winfour.neondrop.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0174c.a(keyListener);
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
        C0205p c0205p = this.f3040a;
        if (c0205p != null) {
            c0205p.a();
        }
        Y y2 = this.f3041b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof S.r ? ((S.r) customSelectionActionModeCallback).f795a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0205p c0205p = this.f3040a;
        if (c0205p != null) {
            return c0205p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0205p c0205p = this.f3040a;
        if (c0205p != null) {
            return c0205p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3041b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3041b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0227a.m(editorInfo, onCreateInputConnection, this);
        return this.f3042c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0205p c0205p = this.f3040a;
        if (c0205p != null) {
            c0205p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0205p c0205p = this.f3040a;
        if (c0205p != null) {
            c0205p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3041b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3041b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(z1.l.x0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(z1.l.F(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3042c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3042c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0205p c0205p = this.f3040a;
        if (c0205p != null) {
            c0205p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0205p c0205p = this.f3040a;
        if (c0205p != null) {
            c0205p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3041b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3041b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3041b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }
}
