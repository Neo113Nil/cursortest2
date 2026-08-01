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
import c1.AbstractC0091d;
import u0.C0372k;

/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0250o extends AutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0252p f3438a;

    /* renamed from: b, reason: collision with root package name */
    public final W f3439b;

    /* renamed from: c, reason: collision with root package name */
    public final C0205B f3440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0250o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.fortunequest.neontrack.R.attr.autoCompleteTextViewStyle);
        R0.a(context);
        Q0.a(this, getContext());
        C0372k j2 = C0372k.j(getContext(), attributeSet, d, com.fortunequest.neontrack.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) j2.f4191b).hasValue(0)) {
            setDropDownBackgroundDrawable(j2.d(0));
        }
        j2.l();
        C0252p c0252p = new C0252p(this);
        this.f3438a = c0252p;
        c0252p.d(attributeSet, com.fortunequest.neontrack.R.attr.autoCompleteTextViewStyle);
        W w2 = new W(this);
        this.f3439b = w2;
        w2.f(attributeSet, com.fortunequest.neontrack.R.attr.autoCompleteTextViewStyle);
        w2.b();
        C0205B c0205b = new C0205B(this);
        this.f3440c = c0205b;
        c0205b.b(attributeSet, com.fortunequest.neontrack.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0205b.a(keyListener);
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
        C0252p c0252p = this.f3438a;
        if (c0252p != null) {
            c0252p.a();
        }
        W w2 = this.f3439b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.q ? ((Q.q) customSelectionActionModeCallback).f883a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0252p c0252p = this.f3438a;
        if (c0252p != null) {
            return c0252p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0252p c0252p = this.f3438a;
        if (c0252p != null) {
            return c0252p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3439b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3439b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b1.g.u(editorInfo, onCreateInputConnection, this);
        return this.f3440c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0252p c0252p = this.f3438a;
        if (c0252p != null) {
            c0252p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0252p c0252p = this.f3438a;
        if (c0252p != null) {
            c0252p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3439b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3439b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H1.d.x0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0091d.j(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3440c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3440c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0252p c0252p = this.f3438a;
        if (c0252p != null) {
            c0252p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0252p c0252p = this.f3438a;
        if (c0252p != null) {
            c0252p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w2 = this.f3439b;
        w2.l(colorStateList);
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w2 = this.f3439b;
        w2.m(mode);
        w2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        W w2 = this.f3439b;
        if (w2 != null) {
            w2.g(context, i);
        }
    }
}
