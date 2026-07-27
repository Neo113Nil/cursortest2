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
import h.AbstractC0477a;
import u1.AbstractC1477a;

/* renamed from: l.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1241m extends AutoCompleteTextView {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f10903c = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final a5.n f10904a;

    /* renamed from: b, reason: collision with root package name */
    public final r f10905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1241m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.chickyneer.roadway.R.attr.autoCompleteTextViewStyle);
        g0.a(context);
        B4.i M5 = B4.i.M(getContext(), attributeSet, f10903c, com.chickyneer.roadway.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) M5.f312c).hasValue(0)) {
            setDropDownBackgroundDrawable(M5.F(0));
        }
        M5.P();
        a5.n nVar = new a5.n(this);
        this.f10904a = nVar;
        nVar.b(attributeSet, com.chickyneer.roadway.R.attr.autoCompleteTextViewStyle);
        r rVar = new r(this);
        this.f10905b = rVar;
        rVar.d(attributeSet, com.chickyneer.roadway.R.attr.autoCompleteTextViewStyle);
        rVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a5.n nVar = this.f10904a;
        if (nVar != null) {
            nVar.a();
        }
        r rVar = this.f10905b;
        if (rVar != null) {
            rVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        T4.h hVar;
        a5.n nVar = this.f10904a;
        if (nVar == null || (hVar = (T4.h) nVar.f3976e) == null) {
            return null;
        }
        return (ColorStateList) hVar.f2878c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        T4.h hVar;
        a5.n nVar = this.f10904a;
        if (nVar == null || (hVar = (T4.h) nVar.f3976e) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f2879d;
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
        a5.n nVar = this.f10904a;
        if (nVar != null) {
            nVar.f3972a = -1;
            nVar.d(null);
            nVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        a5.n nVar = this.f10904a;
        if (nVar != null) {
            nVar.c(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1477a.C(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC0477a.a(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a5.n nVar = this.f10904a;
        if (nVar != null) {
            nVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a5.n nVar = this.f10904a;
        if (nVar != null) {
            nVar.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        r rVar = this.f10905b;
        if (rVar != null) {
            rVar.e(context, i2);
        }
    }
}
