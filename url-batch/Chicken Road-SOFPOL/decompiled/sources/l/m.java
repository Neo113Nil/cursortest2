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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class m extends AutoCompleteTextView {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f4337g = {R.attr.popupBackground};

    /* renamed from: d, reason: collision with root package name */
    public final n f4338d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f4339e;

    /* renamed from: f, reason: collision with root package name */
    public final a0.a0 f4340f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.snovikpovik.vuevnxsj.R.attr.autoCompleteTextViewStyle);
        w1.a(context);
        v1.a(this, getContext());
        a0.g1 E = a0.g1.E(getContext(), attributeSet, f4337g, com.snovikpovik.vuevnxsj.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) E.f85c).hasValue(0)) {
            setDropDownBackgroundDrawable(E.q(0));
        }
        E.G();
        n nVar = new n(this);
        this.f4338d = nVar;
        nVar.d(attributeSet, com.snovikpovik.vuevnxsj.R.attr.autoCompleteTextViewStyle);
        f0 f0Var = new f0(this);
        this.f4339e = f0Var;
        f0Var.d(attributeSet, com.snovikpovik.vuevnxsj.R.attr.autoCompleteTextViewStyle);
        f0Var.b();
        a0.a0 a0Var = new a0.a0(this, 10);
        this.f4340f = a0Var;
        a0Var.p(attributeSet, com.snovikpovik.vuevnxsj.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener o2 = a0Var.o(keyListener);
        if (o2 == keyListener) {
            return;
        }
        super.setKeyListener(o2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f4338d;
        if (nVar != null) {
            nVar.a();
        }
        f0 f0Var = this.f4339e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r2.o.v0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f4338d;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f4338d;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        x1 x1Var = this.f4339e.f4239h;
        if (x1Var != null) {
            return x1Var.f4452a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        x1 x1Var = this.f4339e.f4239h;
        if (x1Var != null) {
            return x1Var.f4453b;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h0.a.Q(onCreateInputConnection, editorInfo, this);
        return this.f4340f.q(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f4338d;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        n nVar = this.f4338d;
        if (nVar != null) {
            nVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f4339e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f4339e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r2.o.y0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(h0.a.D(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f4340f.u(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4340f.o(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f4338d;
        if (nVar != null) {
            nVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f4338d;
        if (nVar != null) {
            nVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f0 f0Var = this.f4339e;
        f0Var.i(colorStateList);
        f0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f0 f0Var = this.f4339e;
        f0Var.j(mode);
        f0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f0 f0Var = this.f4339e;
        if (f0Var != null) {
            f0Var.e(context, i);
        }
    }
}
