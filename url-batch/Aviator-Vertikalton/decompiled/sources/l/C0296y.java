package l;

import K.C0006d;
import K.C0010f;
import K.InterfaceC0004c;
import K.InterfaceC0027x;
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
import com.fortuneink.neonpad.R;

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0296y extends EditText implements InterfaceC0027x {

    /* renamed from: a, reason: collision with root package name */
    public final C0280q f3482a;

    /* renamed from: b, reason: collision with root package name */
    public final C0249a0 f3483b;

    /* renamed from: c, reason: collision with root package name */
    public final C0234E f3484c;

    /* renamed from: d, reason: collision with root package name */
    public final Q.s f3485d;

    /* renamed from: e, reason: collision with root package name */
    public final C0234E f3486e;

    /* renamed from: f, reason: collision with root package name */
    public C0294x f3487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0296y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        U0.a(context);
        T0.a(this, getContext());
        C0280q c0280q = new C0280q(this);
        this.f3482a = c0280q;
        c0280q.d(attributeSet, R.attr.editTextStyle);
        C0249a0 c0249a0 = new C0249a0(this);
        this.f3483b = c0249a0;
        c0249a0.f(attributeSet, R.attr.editTextStyle);
        c0249a0.b();
        C0234E c0234e = new C0234E();
        c0234e.f3217b = this;
        this.f3484c = c0234e;
        this.f3485d = new Q.s();
        C0234E c0234e2 = new C0234E(this);
        this.f3486e = c0234e2;
        c0234e2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0234e2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0294x getSuperCaller() {
        if (this.f3487f == null) {
            this.f3487f = new C0294x(this);
        }
        return this.f3487f;
    }

    @Override // K.InterfaceC0027x
    public final C0010f a(C0010f c0010f) {
        return this.f3485d.a(this, c0010f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0280q c0280q = this.f3482a;
        if (c0280q != null) {
            c0280q.a();
        }
        C0249a0 c0249a0 = this.f3483b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f727a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0280q c0280q = this.f3482a;
        if (c0280q != null) {
            return c0280q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0280q c0280q = this.f3482a;
        if (c0280q != null) {
            return c0280q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3483b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3483b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0234E c0234e;
        if (Build.VERSION.SDK_INT >= 28 || (c0234e = this.f3484c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0234e.f3218c;
        return textClassifier == null ? U.a((TextView) c0234e.f3217b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3483b.getClass();
        C0249a0.h(editorInfo, onCreateInputConnection, this);
        i1.r.m(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f2 = K.X.f(this)) != null) {
            editorInfo.contentMimeTypes = f2;
            onCreateInputConnection = new P.b(onCreateInputConnection, new K0.k(this));
        }
        return this.f3486e.c(onCreateInputConnection, editorInfo);
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
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && K.X.f(this) != null) {
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
                z2 = AbstractC0237H.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0004c interfaceC0004c;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || K.X.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC0004c = new B0.d(primaryClip, 1);
            } else {
                C0006d c0006d = new C0006d();
                c0006d.f431b = primaryClip;
                c0006d.f432c = 1;
                interfaceC0004c = c0006d;
            }
            interfaceC0004c.r(i == 16908322 ? 0 : 1);
            K.X.h(this, interfaceC0004c.i());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0280q c0280q = this.f3482a;
        if (c0280q != null) {
            c0280q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0280q c0280q = this.f3482a;
        if (c0280q != null) {
            c0280q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3483b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0249a0 c0249a0 = this.f3483b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q1.d.b0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3486e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3486e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0280q c0280q = this.f3482a;
        if (c0280q != null) {
            c0280q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0280q c0280q = this.f3482a;
        if (c0280q != null) {
            c0280q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0249a0 c0249a0 = this.f3483b;
        c0249a0.l(colorStateList);
        c0249a0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0249a0 c0249a0 = this.f3483b;
        c0249a0.m(mode);
        c0249a0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0249a0 c0249a0 = this.f3483b;
        if (c0249a0 != null) {
            c0249a0.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0234E c0234e;
        if (Build.VERSION.SDK_INT >= 28 || (c0234e = this.f3484c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0234e.f3218c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
