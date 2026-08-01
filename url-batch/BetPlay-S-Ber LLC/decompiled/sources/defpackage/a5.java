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
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class a5 extends EditText implements sw {
    public final t3 f;
    public final e6 g;
    public final h5 h;
    public final y50 i;
    public final h5 j;
    public z4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        e60.a(context);
        a60.a(this, getContext());
        t3 t3Var = new t3(this);
        this.f = t3Var;
        t3Var.d(attributeSet, R.attr.editTextStyle);
        e6 e6Var = new e6(this);
        this.g = e6Var;
        e6Var.f(attributeSet, R.attr.editTextStyle);
        e6Var.b();
        h5 h5Var = new h5(5, false);
        h5Var.g = this;
        this.h = h5Var;
        this.i = new y50();
        h5 h5Var2 = new h5(this, 4);
        this.j = h5Var2;
        h5Var2.y(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener u = h5Var2.u(keyListener);
        if (u == keyListener) {
            return;
        }
        super.setKeyListener(u);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private z4 getSuperCaller() {
        if (this.k == null) {
            this.k = new z4(this);
        }
        return this.k;
    }

    @Override // defpackage.sw
    public final md a(md mdVar) {
        this.i.getClass();
        return y50.a(this, mdVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.a();
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof x50 ? ((x50) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        t3 t3Var = this.f;
        if (t3Var != null) {
            return t3Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t3 t3Var = this.f;
        if (t3Var != null) {
            return t3Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        h5 h5Var;
        if (Build.VERSION.SDK_INT >= 28 || (h5Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) h5Var.h;
        return textClassifier == null ? y5.a((TextView) h5Var.g) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        e6.h(editorInfo, onCreateInputConnection, this);
        vw.a0(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (g = e90.g(this)) != null) {
            editorInfo.contentMimeTypes = g;
            onCreateInputConnection = new gp(onCreateInputConnection, new u40(3, this));
        }
        return this.j.B(onCreateInputConnection, editorInfo);
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
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && e90.g(this) != null) {
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
                z = k5.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        jd jdVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || e90.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                jdVar = new j1(primaryClip, 1);
            } else {
                kd kdVar = new kd();
                kdVar.g = primaryClip;
                kdVar.h = 1;
                jdVar = kdVar;
            }
            jdVar.t(i == 16908322 ? 0 : 1);
            e90.i(this, jdVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j8.X(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.j.L(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.j.u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e6 e6Var = this.g;
        e6Var.l(colorStateList);
        e6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e6 e6Var = this.g;
        e6Var.m(mode);
        e6Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        h5 h5Var;
        if (Build.VERSION.SDK_INT >= 28 || (h5Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            h5Var.h = textClassifier;
        }
    }
}
