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
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class t4 extends EditText implements kz {
    public final y1 f;
    public final x5 g;
    public final a5 h;
    public final x80 i;
    public final a5 j;
    public s4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        g90.a(context);
        z80.a(this, getContext());
        y1 y1Var = new y1(this);
        this.f = y1Var;
        y1Var.l(attributeSet, R.attr.editTextStyle);
        x5 x5Var = new x5(this);
        this.g = x5Var;
        x5Var.f(attributeSet, R.attr.editTextStyle);
        x5Var.b();
        a5 a5Var = new a5(7, false);
        a5Var.g = this;
        this.h = a5Var;
        this.i = new x80();
        a5 a5Var2 = new a5(this, 6);
        this.j = a5Var2;
        a5Var2.E(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener A = a5Var2.A(keyListener);
        if (A == keyListener) {
            return;
        }
        super.setKeyListener(A);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private s4 getSuperCaller() {
        if (this.k == null) {
            this.k = new s4(this);
        }
        return this.k;
    }

    @Override // defpackage.kz
    public final ie a(ie ieVar) {
        this.i.getClass();
        return x80.a(this, ieVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.a();
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof w80 ? ((w80) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.i();
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
        a5 a5Var;
        if (Build.VERSION.SDK_INT >= 28 || (a5Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a5Var.h;
        return textClassifier == null ? r5.a((TextView) a5Var.g) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        x5.h(editorInfo, onCreateInputConnection, this);
        kr.M(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (g = ic0.g(this)) != null) {
            editorInfo.contentMimeTypes = g;
            onCreateInputConnection = new cr(onCreateInputConnection, new c2(1, this));
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
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ic0.g(this) != null) {
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
                z = d5.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        fe feVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || ic0.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                feVar = new rc0(primaryClip, 1);
            } else {
                ge geVar = new ge();
                geVar.g = primaryClip;
                geVar.h = 1;
                feVar = geVar;
            }
            feVar.x(i == 16908322 ? 0 : 1);
            ic0.i(this, feVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xf.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.j.R(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.j.A(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x5 x5Var = this.g;
        x5Var.l(colorStateList);
        x5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x5 x5Var = this.g;
        x5Var.m(mode);
        x5Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a5 a5Var;
        if (Build.VERSION.SDK_INT >= 28 || (a5Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a5Var.h = textClassifier;
        }
    }
}
