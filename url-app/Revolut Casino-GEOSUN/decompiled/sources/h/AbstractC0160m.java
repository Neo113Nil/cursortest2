package h;

import L.C0026b;
import a.AbstractC0069a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import d.AbstractC0110a;

/* renamed from: h.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0160m extends AutoCompleteTextView {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2233g = {R.attr.popupBackground};

    /* renamed from: e, reason: collision with root package name */
    public final C0161n f2234e;

    /* renamed from: f, reason: collision with root package name */
    public final C0166t f2235f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0160m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.aurifaber.valuta.rotatus.signum.modulus.R.attr.autoCompleteTextViewStyle);
        i0.a(context);
        C0026b E2 = C0026b.E(getContext(), attributeSet, f2233g, com.aurifaber.valuta.rotatus.signum.modulus.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) E2.f520f).hasValue(0)) {
            setDropDownBackgroundDrawable(E2.x(0));
        }
        E2.H();
        C0161n c0161n = new C0161n(this);
        this.f2234e = c0161n;
        c0161n.b(attributeSet, com.aurifaber.valuta.rotatus.signum.modulus.R.attr.autoCompleteTextViewStyle);
        C0166t c0166t = new C0166t(this);
        this.f2235f = c0166t;
        c0166t.d(attributeSet, com.aurifaber.valuta.rotatus.signum.modulus.R.attr.autoCompleteTextViewStyle);
        c0166t.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0161n c0161n = this.f2234e;
        if (c0161n != null) {
            c0161n.a();
        }
        C0166t c0166t = this.f2235f;
        if (c0166t != null) {
            c0166t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C0161n c0161n = this.f2234e;
        if (c0161n == null || (j0Var = c0161n.f2243e) == null) {
            return null;
        }
        return j0Var.f2221a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0161n c0161n = this.f2234e;
        if (c0161n == null || (j0Var = c0161n.f2243e) == null) {
            return null;
        }
        return j0Var.f2222b;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0161n c0161n = this.f2234e;
        if (c0161n != null) {
            c0161n.f2241c = -1;
            c0161n.d(null);
            c0161n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0161n c0161n = this.f2234e;
        if (c0161n != null) {
            c0161n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0069a.N(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC0110a.a(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0161n c0161n = this.f2234e;
        if (c0161n != null) {
            c0161n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0161n c0161n = this.f2234e;
        if (c0161n != null) {
            c0161n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0166t c0166t = this.f2235f;
        if (c0166t != null) {
            c0166t.e(context, i2);
        }
    }
}
