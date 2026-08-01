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
import com.playgen.securelock.R;
import j0.AbstractC0143a;

/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0250w extends EditText implements InterfaceC0018t {

    /* renamed from: a, reason: collision with root package name */
    public final C0236p f3010a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3011b;

    /* renamed from: c, reason: collision with root package name */
    public final C0190C f3012c;
    public final Q.s d;

    /* renamed from: e, reason: collision with root package name */
    public final C0190C f3013e;

    /* renamed from: f, reason: collision with root package name */
    public C0248v f3014f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0250w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        T0.a(context);
        S0.a(this, getContext());
        C0236p c0236p = new C0236p(this);
        this.f3010a = c0236p;
        c0236p.d(attributeSet, R.attr.editTextStyle);
        Y y2 = new Y(this);
        this.f3011b = y2;
        y2.f(attributeSet, R.attr.editTextStyle);
        y2.b();
        C0190C c0190c = new C0190C();
        c0190c.f2776b = this;
        this.f3012c = c0190c;
        this.d = new Q.s();
        C0190C c0190c2 = new C0190C(this);
        this.f3013e = c0190c2;
        c0190c2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0190c2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0248v getSuperCaller() {
        if (this.f3014f == null) {
            this.f3014f = new C0248v(this);
        }
        return this.f3014f;
    }

    @Override // K.InterfaceC0018t
    public final C0005f a(C0005f c0005f) {
        return this.d.a(this, c0005f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0236p c0236p = this.f3010a;
        if (c0236p != null) {
            c0236p.a();
        }
        Y y2 = this.f3011b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f669a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0236p c0236p = this.f3010a;
        if (c0236p != null) {
            return c0236p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0236p c0236p = this.f3010a;
        if (c0236p != null) {
            return c0236p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3011b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3011b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0190C c0190c;
        if (Build.VERSION.SDK_INT >= 28 || (c0190c = this.f3012c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0190c.f2777c;
        return textClassifier == null ? AbstractC0205S.a((TextView) c0190c.f2776b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3011b.getClass();
        Y.h(editorInfo, onCreateInputConnection, this);
        AbstractC0143a.n(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f2 = K.S.f(this)) != null) {
            editorInfo.contentMimeTypes = f2;
            onCreateInputConnection = new P.b(onCreateInputConnection, new L0.k(this));
        }
        return this.f3013e.c(onCreateInputConnection, editorInfo);
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
                z2 = AbstractC0193F.a(dragEvent, this, activity);
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
                interfaceC0002c = new C.g(primaryClip, 1);
            } else {
                C0003d c0003d = new C0003d();
                c0003d.f388b = primaryClip;
                c0003d.f389c = 1;
                interfaceC0002c = c0003d;
            }
            interfaceC0002c.t(i == 16908322 ? 0 : 1);
            K.S.h(this, interfaceC0002c.j());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0236p c0236p = this.f3010a;
        if (c0236p != null) {
            c0236p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0236p c0236p = this.f3010a;
        if (c0236p != null) {
            c0236p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3011b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3011b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u1.l.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3013e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3013e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0236p c0236p = this.f3010a;
        if (c0236p != null) {
            c0236p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0236p c0236p = this.f3010a;
        if (c0236p != null) {
            c0236p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3011b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3011b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3011b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0190C c0190c;
        if (Build.VERSION.SDK_INT >= 28 || (c0190c = this.f3012c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0190c.f2777c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
