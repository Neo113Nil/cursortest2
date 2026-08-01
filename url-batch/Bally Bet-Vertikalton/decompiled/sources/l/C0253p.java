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
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0253p extends AutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0255q f3019a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f3020b;

    /* renamed from: c, reason: collision with root package name */
    public final C0208D f3021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.skydrop.fallring.R.attr.autoCompleteTextViewStyle);
        T0.a(context);
        S0.a(this, getContext());
        C0012l r2 = C0012l.r(getContext(), attributeSet, d, com.skydrop.fallring.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r2.f432c).hasValue(0)) {
            setDropDownBackgroundDrawable(r2.h(0));
        }
        r2.t();
        C0255q c0255q = new C0255q(this);
        this.f3019a = c0255q;
        c0255q.d(attributeSet, com.skydrop.fallring.R.attr.autoCompleteTextViewStyle);
        Z z2 = new Z(this);
        this.f3020b = z2;
        z2.f(attributeSet, com.skydrop.fallring.R.attr.autoCompleteTextViewStyle);
        z2.b();
        C0208D c0208d = new C0208D(this);
        this.f3021c = c0208d;
        c0208d.b(attributeSet, com.skydrop.fallring.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0208d.a(keyListener);
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
        C0255q c0255q = this.f3019a;
        if (c0255q != null) {
            c0255q.a();
        }
        Z z2 = this.f3020b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f651a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0255q c0255q = this.f3019a;
        if (c0255q != null) {
            return c0255q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0255q c0255q = this.f3019a;
        if (c0255q != null) {
            return c0255q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3020b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3020b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        i1.p.h(editorInfo, onCreateInputConnection, this);
        return this.f3021c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0255q c0255q = this.f3019a;
        if (c0255q != null) {
            c0255q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0255q c0255q = this.f3019a;
        if (c0255q != null) {
            c0255q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3020b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3020b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q1.l.c0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(q1.l.v(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3021c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3021c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0255q c0255q = this.f3019a;
        if (c0255q != null) {
            c0255q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0255q c0255q = this.f3019a;
        if (c0255q != null) {
            c0255q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f3020b;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f3020b;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Z z2 = this.f3020b;
        if (z2 != null) {
            z2.g(context, i);
        }
    }
}
