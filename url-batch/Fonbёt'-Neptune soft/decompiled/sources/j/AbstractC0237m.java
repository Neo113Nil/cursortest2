package j;

import B0.C0031i;
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

/* renamed from: j.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0237m extends AutoCompleteTextView {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f3004g = {R.attr.popupBackground};

    /* renamed from: e, reason: collision with root package name */
    public final C0238n f3005e;

    /* renamed from: f, reason: collision with root package name */
    public final C0244u f3006f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0237m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.neptunesoft.languesbacdz.R.attr.autoCompleteTextViewStyle);
        k0.a(context);
        C0031i J = C0031i.J(getContext(), attributeSet, f3004g, com.neptunesoft.languesbacdz.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) J.f154f).hasValue(0)) {
            setDropDownBackgroundDrawable(J.A(0));
        }
        J.N();
        C0238n c0238n = new C0238n(this);
        this.f3005e = c0238n;
        c0238n.b(attributeSet, com.neptunesoft.languesbacdz.R.attr.autoCompleteTextViewStyle);
        C0244u c0244u = new C0244u(this);
        this.f3006f = c0244u;
        c0244u.d(attributeSet, com.neptunesoft.languesbacdz.R.attr.autoCompleteTextViewStyle);
        c0244u.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0238n c0238n = this.f3005e;
        if (c0238n != null) {
            c0238n.a();
        }
        C0244u c0244u = this.f3006f;
        if (c0244u != null) {
            c0244u.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        l0 l0Var;
        C0238n c0238n = this.f3005e;
        if (c0238n == null || (l0Var = c0238n.f3011e) == null) {
            return null;
        }
        return l0Var.f3000a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l0 l0Var;
        C0238n c0238n = this.f3005e;
        if (c0238n == null || (l0Var = c0238n.f3011e) == null) {
            return null;
        }
        return l0Var.f3001b;
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
        C0238n c0238n = this.f3005e;
        if (c0238n != null) {
            c0238n.f3009c = -1;
            c0238n.d(null);
            c0238n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0238n c0238n = this.f3005e;
        if (c0238n != null) {
            c0238n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i1.a.J(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(d.b.c(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0238n c0238n = this.f3005e;
        if (c0238n != null) {
            c0238n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0238n c0238n = this.f3005e;
        if (c0238n != null) {
            c0238n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0244u c0244u = this.f3006f;
        if (c0244u != null) {
            c0244u.e(context, i2);
        }
    }
}
