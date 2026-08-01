package l;

import K.C0003d;
import K.C0005f;
import K.InterfaceC0002c;
import K.InterfaceC0018t;
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
import com.glasspulse.glasspulse.R;

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0241v extends EditText implements InterfaceC0018t {

    /* renamed from: a, reason: collision with root package name */
    public final C0229p f3045a;

    /* renamed from: b, reason: collision with root package name */
    public final X f3046b;

    /* renamed from: c, reason: collision with root package name */
    public final C0182B f3047c;
    public final Q.r d;

    /* renamed from: e, reason: collision with root package name */
    public final C0182B f3048e;

    /* renamed from: f, reason: collision with root package name */
    public C0239u f3049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0241v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        R0.a(context);
        Q0.a(this, getContext());
        C0229p c0229p = new C0229p(this);
        this.f3045a = c0229p;
        c0229p.d(attributeSet, R.attr.editTextStyle);
        X x2 = new X(this);
        this.f3046b = x2;
        x2.f(attributeSet, R.attr.editTextStyle);
        x2.b();
        C0182B c0182b = new C0182B();
        c0182b.f2812b = this;
        this.f3047c = c0182b;
        this.d = new Q.r();
        C0182B c0182b2 = new C0182B(this);
        this.f3048e = c0182b2;
        c0182b2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0182b2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0239u getSuperCaller() {
        if (this.f3049f == null) {
            this.f3049f = new C0239u(this);
        }
        return this.f3049f;
    }

    @Override // K.InterfaceC0018t
    public final C0005f a(C0005f c0005f) {
        return this.d.a(this, c0005f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0229p c0229p = this.f3045a;
        if (c0229p != null) {
            c0229p.a();
        }
        X x2 = this.f3046b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.q ? ((Q.q) customSelectionActionModeCallback).f726a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0229p c0229p = this.f3045a;
        if (c0229p != null) {
            return c0229p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0229p c0229p = this.f3045a;
        if (c0229p != null) {
            return c0229p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3046b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3046b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0182B c0182b;
        if (Build.VERSION.SDK_INT >= 28 || (c0182b = this.f3047c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0182b.f2813c;
        return textClassifier == null ? AbstractC0197Q.a((TextView) c0182b.f2812b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3046b.getClass();
        X.h(editorInfo, onCreateInputConnection, this);
        k0.w.m(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f2 = K.S.f(this)) != null) {
            editorInfo.contentMimeTypes = f2;
            onCreateInputConnection = new P.c(onCreateInputConnection, new P.b(this));
        }
        return this.f3048e.c(onCreateInputConnection, editorInfo);
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
                z2 = AbstractC0185E.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0002c interfaceC0002c;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || K.S.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC0002c = new C.h(primaryClip, 1);
            } else {
                C0003d c0003d = new C0003d();
                c0003d.f370b = primaryClip;
                c0003d.f371c = 1;
                interfaceC0002c = c0003d;
            }
            interfaceC0002c.w(i == 16908322 ? 0 : 1);
            K.S.h(this, interfaceC0002c.k());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0229p c0229p = this.f3045a;
        if (c0229p != null) {
            c0229p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0229p c0229p = this.f3045a;
        if (c0229p != null) {
            c0229p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3046b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3046b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u1.d.j0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3048e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3048e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0229p c0229p = this.f3045a;
        if (c0229p != null) {
            c0229p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0229p c0229p = this.f3045a;
        if (c0229p != null) {
            c0229p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3046b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3046b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f3046b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0182B c0182b;
        if (Build.VERSION.SDK_INT >= 28 || (c0182b = this.f3047c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0182b.f2813c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
