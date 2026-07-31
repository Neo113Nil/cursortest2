package i;

import B0.C0008i;
import a.AbstractC0086a;
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
import e.AbstractC0121a;

/* renamed from: i.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0166m extends AutoCompleteTextView {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2261g = {R.attr.popupBackground};

    /* renamed from: e, reason: collision with root package name */
    public final C0167n f2262e;

    /* renamed from: f, reason: collision with root package name */
    public final C0173u f2263f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0166m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.crane.slab.beam.R.attr.autoCompleteTextViewStyle);
        i0.a(context);
        C0008i D2 = C0008i.D(getContext(), attributeSet, f2261g, com.crane.slab.beam.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) D2.f84f).hasValue(0)) {
            setDropDownBackgroundDrawable(D2.v(0));
        }
        D2.G();
        C0167n c0167n = new C0167n(this);
        this.f2262e = c0167n;
        c0167n.b(attributeSet, com.crane.slab.beam.R.attr.autoCompleteTextViewStyle);
        C0173u c0173u = new C0173u(this);
        this.f2263f = c0173u;
        c0173u.d(attributeSet, com.crane.slab.beam.R.attr.autoCompleteTextViewStyle);
        c0173u.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0167n c0167n = this.f2262e;
        if (c0167n != null) {
            c0167n.a();
        }
        C0173u c0173u = this.f2263f;
        if (c0173u != null) {
            c0173u.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C0167n c0167n = this.f2262e;
        if (c0167n == null || (j0Var = c0167n.f2271e) == null) {
            return null;
        }
        return j0Var.f2249a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0167n c0167n = this.f2262e;
        if (c0167n == null || (j0Var = c0167n.f2271e) == null) {
            return null;
        }
        return j0Var.f2250b;
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
        C0167n c0167n = this.f2262e;
        if (c0167n != null) {
            c0167n.f2269c = -1;
            c0167n.d(null);
            c0167n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0167n c0167n = this.f2262e;
        if (c0167n != null) {
            c0167n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0086a.K(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC0121a.a(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0167n c0167n = this.f2262e;
        if (c0167n != null) {
            c0167n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0167n c0167n = this.f2262e;
        if (c0167n != null) {
            c0167n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0173u c0173u = this.f2263f;
        if (c0173u != null) {
            c0173u.e(context, i2);
        }
    }
}
