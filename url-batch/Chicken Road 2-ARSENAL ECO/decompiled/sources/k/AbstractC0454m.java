package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import h.AbstractC0401a;

/* renamed from: k.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0454m extends AutoCompleteTextView {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f5059h = {R.attr.popupBackground};

    /* renamed from: f, reason: collision with root package name */
    public final C0455n f5060f;

    /* renamed from: g, reason: collision with root package name */
    public final C0461u f5061g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0454m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.strategylink.Row.Five.R.attr.autoCompleteTextViewStyle);
        l0.a(context);
        k0.a(this, getContext());
        B0.c r6 = B0.c.r(getContext(), attributeSet, f5059h, com.strategylink.Row.Five.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r6.f73i).hasValue(0)) {
            setDropDownBackgroundDrawable(r6.m(0));
        }
        r6.v();
        C0455n c0455n = new C0455n(this);
        this.f5060f = c0455n;
        c0455n.b(attributeSet, com.strategylink.Row.Five.R.attr.autoCompleteTextViewStyle);
        C0461u c0461u = new C0461u(this);
        this.f5061g = c0461u;
        c0461u.d(attributeSet, com.strategylink.Row.Five.R.attr.autoCompleteTextViewStyle);
        c0461u.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0455n c0455n = this.f5060f;
        if (c0455n != null) {
            c0455n.a();
        }
        C0461u c0461u = this.f5061g;
        if (c0461u != null) {
            c0461u.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        X5.h hVar;
        C0455n c0455n = this.f5060f;
        if (c0455n == null || (hVar = c0455n.f5066e) == null) {
            return null;
        }
        return (ColorStateList) hVar.f2938c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        X5.h hVar;
        C0455n c0455n = this.f5060f;
        if (c0455n == null || (hVar = c0455n.f5066e) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f2939d;
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
        C0455n c0455n = this.f5060f;
        if (c0455n != null) {
            c0455n.f5064c = -1;
            c0455n.d(null);
            c0455n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0455n c0455n = this.f5060f;
        if (c0455n != null) {
            c0455n.c(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && i7 <= 27 && !(callback instanceof I.p) && callback != null) {
            callback = new I.p(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(AbstractC0401a.a(getContext(), i7));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0455n c0455n = this.f5060f;
        if (c0455n != null) {
            c0455n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0455n c0455n = this.f5060f;
        if (c0455n != null) {
            c0455n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0461u c0461u = this.f5061g;
        if (c0461u != null) {
            c0461u.e(context, i7);
        }
    }
}
