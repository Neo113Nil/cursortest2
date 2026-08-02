package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hr extends AutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final hs b;
    private final it c;
    private final brr d;

    public hr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mb.d(this, getContext());
        byo u = byo.u(getContext(), attributeSet, a, i, 0);
        if (u.p(0)) {
            setDropDownBackgroundDrawable(u.j(0));
        }
        u.n();
        hs hsVar = new hs(this);
        this.b = hsVar;
        hsVar.b(attributeSet, i);
        it itVar = new it(this);
        this.c = itVar;
        itVar.c(attributeSet, i);
        itVar.a();
        brr brrVar = new brr(this);
        this.d = brrVar;
        brrVar.o(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (brr.p(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener q = brr.q(keyListener);
            if (q == keyListener) {
                return;
            }
            super.setKeyListener(q);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hs hsVar = this.b;
        if (hsVar != null) {
            hsVar.a();
        }
        it itVar = this.c;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        zy.d(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kt.u(onCreateInputConnection, editorInfo, this);
        return this.d.r(onCreateInputConnection);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hs hsVar = this.b;
        if (hsVar != null) {
            hsVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hs hsVar = this.b;
        if (hsVar != null) {
            hsVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        it itVar = this.c;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        it itVar = this.c;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(e.f(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(brr.q(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        it itVar = this.c;
        if (itVar != null) {
            itVar.d(context, i);
        }
    }

    public hr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.autoCompleteTextViewStyle);
    }

    public hr(Context context) {
        this(context, null);
    }
}
