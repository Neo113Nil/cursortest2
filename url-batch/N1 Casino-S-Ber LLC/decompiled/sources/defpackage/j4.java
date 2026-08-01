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
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class j4 extends EditText implements hw {
    public final x1 f;
    public final n5 g;
    public final q4 h;
    public final q50 i;
    public final q4 j;
    public i4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        w50.a(context);
        s50.a(this, getContext());
        x1 x1Var = new x1(this);
        this.f = x1Var;
        x1Var.l(attributeSet, R.attr.editTextStyle);
        n5 n5Var = new n5(this);
        this.g = n5Var;
        n5Var.f(attributeSet, R.attr.editTextStyle);
        n5Var.b();
        q4 q4Var = new q4(7, false);
        q4Var.g = this;
        this.h = q4Var;
        this.i = new q50();
        q4 q4Var2 = new q4(this, 6);
        this.j = q4Var2;
        q4Var2.E(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener z = q4Var2.z(keyListener);
        if (z == keyListener) {
            return;
        }
        super.setKeyListener(z);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private i4 getSuperCaller() {
        if (this.k == null) {
            this.k = new i4(this);
        }
        return this.k;
    }

    @Override // defpackage.hw
    public final id a(id idVar) {
        this.i.getClass();
        return q50.a(this, idVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.a();
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof p50 ? ((p50) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        x1 x1Var = this.f;
        if (x1Var != null) {
            return x1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x1 x1Var = this.f;
        if (x1Var != null) {
            return x1Var.i();
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
        q4 q4Var;
        if (Build.VERSION.SDK_INT >= 28 || (q4Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) q4Var.h;
        return textClassifier == null ? h5.a((TextView) q4Var.g) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        n5.h(editorInfo, onCreateInputConnection, this);
        o8.Y(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (g = x80.g(this)) != null) {
            editorInfo.contentMimeTypes = g;
            onCreateInputConnection = new ro(onCreateInputConnection, new l40(2, this));
        }
        return this.j.H(onCreateInputConnection, editorInfo);
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
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && x80.g(this) != null) {
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
                z = t4.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        fd fdVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || x80.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                fdVar = new k0(primaryClip, 1);
            } else {
                gd gdVar = new gd();
                gdVar.g = primaryClip;
                gdVar.h = 1;
                fdVar = gdVar;
            }
            fdVar.y(i == 16908322 ? 0 : 1);
            x80.i(this, fdVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jw.f0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.j.R(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.j.z(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        n5 n5Var = this.g;
        n5Var.l(colorStateList);
        n5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        n5 n5Var = this.g;
        n5Var.m(mode);
        n5Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        q4 q4Var;
        if (Build.VERSION.SDK_INT >= 28 || (q4Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            q4Var.h = textClassifier;
        }
    }
}
