package l;

import K.C0004e;
import K.C0006g;
import K.InterfaceC0003d;
import K.InterfaceC0019u;
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
import com.clutchquizarena.app.R;

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0243v extends EditText implements InterfaceC0019u {

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f3060a;

    /* renamed from: b, reason: collision with root package name */
    public final X f3061b;

    /* renamed from: c, reason: collision with root package name */
    public final C0183B f3062c;
    public final Q.s d;

    /* renamed from: e, reason: collision with root package name */
    public final C0183B f3063e;

    /* renamed from: f, reason: collision with root package name */
    public C0241u f3064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0243v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        R0.a(context);
        Q0.a(this, getContext());
        C0231p c0231p = new C0231p(this);
        this.f3060a = c0231p;
        c0231p.d(attributeSet, R.attr.editTextStyle);
        X x2 = new X(this);
        this.f3061b = x2;
        x2.f(attributeSet, R.attr.editTextStyle);
        x2.b();
        C0183B c0183b = new C0183B();
        c0183b.f2827b = this;
        this.f3062c = c0183b;
        this.d = new Q.s();
        C0183B c0183b2 = new C0183B(this);
        this.f3063e = c0183b2;
        c0183b2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0183b2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0241u getSuperCaller() {
        if (this.f3064f == null) {
            this.f3064f = new C0241u(this);
        }
        return this.f3064f;
    }

    @Override // K.InterfaceC0019u
    public final C0006g a(C0006g c0006g) {
        return this.d.a(this, c0006g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f3060a;
        if (c0231p != null) {
            c0231p.a();
        }
        X x2 = this.f3061b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f632a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f3060a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f3060a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3061b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3061b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0183B c0183b;
        if (Build.VERSION.SDK_INT >= 28 || (c0183b = this.f3062c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0183b.f2828c;
        return textClassifier == null ? AbstractC0198Q.a((TextView) c0183b.f2827b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3061b.getClass();
        X.h(editorInfo, onCreateInputConnection, this);
        h0.g.h(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f2 = K.S.f(this)) != null) {
            editorInfo.contentMimeTypes = f2;
            onCreateInputConnection = new P.c(onCreateInputConnection, new P.b(this));
        }
        return this.f3063e.c(onCreateInputConnection, editorInfo);
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
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && K.S.f(this) != null) {
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
                z2 = AbstractC0186E.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0003d interfaceC0003d;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || K.S.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC0003d = new A0.h(primaryClip, 1);
            } else {
                C0004e c0004e = new C0004e();
                c0004e.f387b = primaryClip;
                c0004e.f388c = 1;
                interfaceC0003d = c0004e;
            }
            interfaceC0003d.u(i == 16908322 ? 0 : 1);
            K.S.h(this, interfaceC0003d.j());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f3060a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f3060a;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3061b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3061b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A.c.L0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3063e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3063e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f3060a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f3060a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3061b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3061b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f3061b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0183B c0183b;
        if (Build.VERSION.SDK_INT >= 28 || (c0183b = this.f3062c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0183b.f2828c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
