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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class n extends AutoCompleteTextView {
    public static final int[] i = {R.attr.popupBackground};

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.datepicker.c f2508f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f2509g;
    public final z h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gdmhkmf.belbet.R.attr.autoCompleteTextViewStyle);
        p2.a(context);
        o2.a(this, getContext());
        androidx.emoji2.text.t i4 = androidx.emoji2.text.t.i(com.gdmhkmf.belbet.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, i);
        if (((TypedArray) i4.f473b).hasValue(0)) {
            setDropDownBackgroundDrawable(i4.d(0));
        }
        i4.k();
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(this);
        this.f2508f = cVar;
        cVar.m(attributeSet, com.gdmhkmf.belbet.R.attr.autoCompleteTextViewStyle);
        v0 v0Var = new v0(this);
        this.f2509g = v0Var;
        v0Var.f(attributeSet, com.gdmhkmf.belbet.R.attr.autoCompleteTextViewStyle);
        v0Var.b();
        z zVar = new z(this);
        this.h = zVar;
        zVar.b(attributeSet, com.gdmhkmf.belbet.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a5 = zVar.a(keyListener);
        if (a5 == keyListener) {
            return;
        }
        super.setKeyListener(a5);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f2508f;
        if (cVar != null) {
            cVar.a();
        }
        v0 v0Var = this.f2509g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof r0.g ? ((r0.g) customSelectionActionModeCallback).f3200a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f2508f;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f2508f;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2509g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2509g.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b4.l.S(editorInfo, onCreateInputConnection, this);
        return this.h.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f2508f;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        com.google.android.material.datepicker.c cVar = this.f2508f;
        if (cVar != null) {
            cVar.p(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f2509g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f2509g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b4.l.k0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(b4.d.y(getContext(), i4));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.h.d(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f2508f;
        if (cVar != null) {
            cVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f2508f;
        if (cVar != null) {
            cVar.v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f2509g;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f2509g;
        v0Var.m(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        v0 v0Var = this.f2509g;
        if (v0Var != null) {
            v0Var.g(context, i4);
        }
    }
}
