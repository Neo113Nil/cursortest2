package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vf extends EditText implements cv1 {
    public final te m;
    public final xg n;
    public final t21 o;
    public final vw2 p;
    public final t21 q;
    public uf r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        vx2.a(context);
        xw2.a(this, getContext());
        te teVar = new te(this);
        this.m = teVar;
        teVar.e(attributeSet, R.attr.editTextStyle);
        xg xgVar = new xg(this);
        this.n = xgVar;
        xgVar.f(attributeSet, R.attr.editTextStyle);
        xgVar.b();
        t21 t21Var = new t21(5);
        t21Var.n = this;
        this.o = t21Var;
        this.p = new vw2();
        t21 t21Var2 = new t21(this, 4);
        this.q = t21Var2;
        t21Var2.B(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener z = t21Var2.z(keyListener);
        if (z == keyListener) {
            return;
        }
        super.setKeyListener(z);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    private uf getSuperCaller() {
        if (this.r == null) {
            this.r = new uf(this);
        }
        return this.r;
    }

    @Override // defpackage.cv1
    public final n20 a(n20 n20Var) {
        this.p.getClass();
        return vw2.a(this, n20Var);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        te teVar = this.m;
        if (teVar != null) {
            teVar.a();
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ti2.m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        te teVar = this.m;
        if (teVar != null) {
            return teVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        te teVar = this.m;
        if (teVar != null) {
            return teVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.n.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.n.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        t21 t21Var;
        if (Build.VERSION.SDK_INT >= 28 || (t21Var = this.o) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) t21Var.o;
        return textClassifier == null ? rg.a((TextView) t21Var.n) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] e;
        InputConnection q21Var;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.n.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            tf0.c(editorInfo, getText());
        }
        zm3.F(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && i <= 30 && (e = e53.e(this)) != null) {
            tf0.b(editorInfo, e);
            k4 k4Var = new k4(7, this);
            if (i >= 25) {
                q21Var = new p21(onCreateInputConnection, k4Var);
            } else if (tf0.a(editorInfo).length != 0) {
                q21Var = new q21(onCreateInputConnection, k4Var);
            }
            onCreateInputConnection = q21Var;
        }
        return this.q.D(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && e53.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = dg.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        k20 k20Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || e53.e(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                k20Var = new j20(primaryClip, 1);
            } else {
                l20 l20Var = new l20();
                l20Var.b = primaryClip;
                l20Var.c = 1;
                k20Var = l20Var;
            }
            k20Var.f(i == 16908322 ? 0 : 1);
            e53.g(this, k20Var.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        te teVar = this.m;
        if (teVar != null) {
            teVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        te teVar = this.m;
        if (teVar != null) {
            teVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ti2.n(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.q.H(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.q.z(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        te teVar = this.m;
        if (teVar != null) {
            teVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        te teVar = this.m;
        if (teVar != null) {
            teVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        xg xgVar = this.n;
        xgVar.k(colorStateList);
        xgVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        xg xgVar = this.n;
        xgVar.l(mode);
        xgVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        t21 t21Var;
        if (Build.VERSION.SDK_INT >= 28 || (t21Var = this.o) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            t21Var.o = textClassifier;
        }
    }
}
