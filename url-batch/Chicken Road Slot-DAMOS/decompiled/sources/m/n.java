package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class n extends AutoCompleteTextView {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f6137r = {R.attr.popupBackground};

    /* renamed from: d, reason: collision with root package name */
    public final c2.w1 f6138d;

    /* renamed from: e, reason: collision with root package name */
    public final y f6139e;

    /* renamed from: i, reason: collision with root package name */
    public final l.d f6140i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        p1.a(context);
        o1.a(this, getContext());
        a1.n z10 = a1.n.z(getContext(), attributeSet, f6137r, i3);
        if (((TypedArray) z10.f40e).hasValue(0)) {
            setDropDownBackgroundDrawable(z10.r(0));
        }
        z10.D();
        c2.w1 w1Var = new c2.w1(this);
        this.f6138d = w1Var;
        w1Var.b(attributeSet, i3);
        y yVar = new y(this);
        this.f6139e = yVar;
        yVar.d(attributeSet, i3);
        yVar.b();
        l.d dVar = new l.d(this);
        this.f6140i = dVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.a.g, i3, 0);
        try {
            boolean z11 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            dVar.A(z11);
            KeyListener keyListener = getKeyListener();
            if (keyListener instanceof NumberKeyListener) {
                return;
            }
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener s3 = dVar.s(keyListener);
            if (s3 == keyListener) {
                return;
            }
            super.setKeyListener(s3);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c2.w1 w1Var = this.f6138d;
        if (w1Var != null) {
            w1Var.a();
        }
        y yVar = this.f6139e;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return (!(customSelectionActionModeCallback instanceof t3.h) || Build.VERSION.SDK_INT < 26) ? customSelectionActionModeCallback : ((t3.h) customSelectionActionModeCallback).f9274a;
    }

    public ColorStateList getSupportBackgroundTintList() {
        q1 q1Var;
        c2.w1 w1Var = this.f6138d;
        if (w1Var == null || (q1Var = (q1) w1Var.f1698e) == null) {
            return null;
        }
        return q1Var.f6171a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q1 q1Var;
        c2.w1 w1Var = this.f6138d;
        if (w1Var == null || (q1Var = (q1) w1Var.f1698e) == null) {
            return null;
        }
        return q1Var.f6172b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        q1 q1Var = this.f6139e.f6212h;
        if (q1Var != null) {
            return q1Var.f6171a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        q1 q1Var = this.f6139e.f6212h;
        if (q1Var != null) {
            return q1Var.f6172b;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        d9.c cVar = (d9.c) this.f6140i.f5643e;
        if (onCreateInputConnection == null) {
            cVar.getClass();
            return null;
        }
        c6.l lVar = (c6.l) cVar.f3701e;
        lVar.getClass();
        return onCreateInputConnection instanceof e4.b ? onCreateInputConnection : new e4.b((n) lVar.f1829e, onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c2.w1 w1Var = this.f6138d;
        if (w1Var != null) {
            w1Var.f1694a = -1;
            w1Var.e(null);
            w1Var.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        c2.w1 w1Var = this.f6138d;
        if (w1Var != null) {
            w1Var.d(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f6139e;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f6139e;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 <= 27 && !(callback instanceof t3.h) && callback != null) {
            callback = new t3.h(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(z4.w.v(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f6140i.A(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f6140i.s(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c2.w1 w1Var = this.f6138d;
        if (w1Var != null) {
            w1Var.f(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c2.w1 w1Var = this.f6138d;
        if (w1Var != null) {
            w1Var.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y yVar = this.f6139e;
        if (yVar.f6212h == null) {
            yVar.f6212h = new q1();
        }
        q1 q1Var = yVar.f6212h;
        q1Var.f6171a = colorStateList;
        q1Var.f6174d = colorStateList != null;
        yVar.f6207b = q1Var;
        yVar.f6208c = q1Var;
        yVar.f6209d = q1Var;
        yVar.f6210e = q1Var;
        yVar.f6211f = q1Var;
        yVar.g = q1Var;
        yVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y yVar = this.f6139e;
        if (yVar.f6212h == null) {
            yVar.f6212h = new q1();
        }
        q1 q1Var = yVar.f6212h;
        q1Var.f6172b = mode;
        q1Var.f6173c = mode != null;
        yVar.f6207b = q1Var;
        yVar.f6208c = q1Var;
        yVar.f6209d = q1Var;
        yVar.f6210e = q1Var;
        yVar.f6211f = q1Var;
        yVar.g = q1Var;
        yVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        y yVar = this.f6139e;
        if (yVar != null) {
            yVar.e(context, i3);
        }
    }
}
