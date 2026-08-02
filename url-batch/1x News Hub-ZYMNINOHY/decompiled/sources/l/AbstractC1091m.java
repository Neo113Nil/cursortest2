package l;

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
import h.AbstractC0337a;

/* renamed from: l.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1091m extends AutoCompleteTextView {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f9848c = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C1092n f9849a;

    /* renamed from: b, reason: collision with root package name */
    public final C1097t f9850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1091m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.fc.barca.football.R.attr.autoCompleteTextViewStyle);
        i0.a(context);
        A0.f K2 = A0.f.K(getContext(), attributeSet, f9848c, com.fc.barca.football.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) K2.f24c).hasValue(0)) {
            setDropDownBackgroundDrawable(K2.C(0));
        }
        K2.O();
        C1092n c1092n = new C1092n(this);
        this.f9849a = c1092n;
        c1092n.b(attributeSet, com.fc.barca.football.R.attr.autoCompleteTextViewStyle);
        C1097t c1097t = new C1097t(this);
        this.f9850b = c1097t;
        c1097t.d(attributeSet, com.fc.barca.football.R.attr.autoCompleteTextViewStyle);
        c1097t.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1092n c1092n = this.f9849a;
        if (c1092n != null) {
            c1092n.a();
        }
        C1097t c1097t = this.f9850b;
        if (c1097t != null) {
            c1097t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C1092n c1092n = this.f9849a;
        if (c1092n == null || (j0Var = c1092n.f9858e) == null) {
            return null;
        }
        return j0Var.f9837a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C1092n c1092n = this.f9849a;
        if (c1092n == null || (j0Var = c1092n.f9858e) == null) {
            return null;
        }
        return j0Var.f9838b;
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
        C1092n c1092n = this.f9849a;
        if (c1092n != null) {
            c1092n.f9856c = -1;
            c1092n.d(null);
            c1092n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1092n c1092n = this.f9849a;
        if (c1092n != null) {
            c1092n.c(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.W(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(AbstractC0337a.a(getContext(), i3));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1092n c1092n = this.f9849a;
        if (c1092n != null) {
            c1092n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1092n c1092n = this.f9849a;
        if (c1092n != null) {
            c1092n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1097t c1097t = this.f9850b;
        if (c1097t != null) {
            c1097t.e(context, i3);
        }
    }
}
