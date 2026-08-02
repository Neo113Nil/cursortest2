package k;

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
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import g.AbstractC0432a;

/* renamed from: k.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1226m extends AutoCompleteTextView {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f14044c = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final K3.n f14045a;

    /* renamed from: b, reason: collision with root package name */
    public final C1232s f14046b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1226m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.rockchicken.pump.up.road.R.attr.autoCompleteTextViewStyle);
        AbstractC1215g0.a(context);
        B1.j v = B1.j.v(getContext(), attributeSet, f14044c, com.rockchicken.pump.up.road.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) v.f202c).hasValue(0)) {
            setDropDownBackgroundDrawable(v.o(0));
        }
        v.x();
        K3.n nVar = new K3.n(this);
        this.f14045a = nVar;
        nVar.e(attributeSet, com.rockchicken.pump.up.road.R.attr.autoCompleteTextViewStyle);
        C1232s c1232s = new C1232s(this);
        this.f14046b = c1232s;
        c1232s.d(attributeSet, com.rockchicken.pump.up.road.R.attr.autoCompleteTextViewStyle);
        c1232s.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        K3.n nVar = this.f14045a;
        if (nVar != null) {
            nVar.b();
        }
        C1232s c1232s = this.f14046b;
        if (c1232s != null) {
            c1232s.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        G3.h hVar;
        K3.n nVar = this.f14045a;
        if (nVar == null || (hVar = (G3.h) nVar.f1595a) == null) {
            return null;
        }
        return (ColorStateList) hVar.f909c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        G3.h hVar;
        K3.n nVar = this.f14045a;
        if (nVar == null || (hVar = (G3.h) nVar.f1595a) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f910d;
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
        K3.n nVar = this.f14045a;
        if (nVar != null) {
            nVar.f1596b = -1;
            nVar.h(null);
            nVar.b();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        K3.n nVar = this.f14045a;
        if (nVar != null) {
            nVar.f(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0347t0.u(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(AbstractC0432a.a(getContext(), i4));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        K3.n nVar = this.f14045a;
        if (nVar != null) {
            nVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        K3.n nVar = this.f14045a;
        if (nVar != null) {
            nVar.k(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C1232s c1232s = this.f14046b;
        if (c1232s != null) {
            c1232s.e(context, i4);
        }
    }
}
