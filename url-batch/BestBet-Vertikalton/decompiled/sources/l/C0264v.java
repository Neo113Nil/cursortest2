package l;

import K.C0008d;
import K.C0010f;
import K.InterfaceC0007c;
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
import com.fortunequest.neontrack.R;

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0264v extends EditText implements K.r {

    /* renamed from: a, reason: collision with root package name */
    public final C0252p f3479a;

    /* renamed from: b, reason: collision with root package name */
    public final W f3480b;

    /* renamed from: c, reason: collision with root package name */
    public final C0205B f3481c;
    public final Q.r d;

    /* renamed from: e, reason: collision with root package name */
    public final C0205B f3482e;

    /* renamed from: f, reason: collision with root package name */
    public C0262u f3483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0264v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        R0.a(context);
        Q0.a(this, getContext());
        C0252p c0252p = new C0252p(this);
        this.f3479a = c0252p;
        c0252p.d(attributeSet, R.attr.editTextStyle);
        W w2 = new W(this);
        this.f3480b = w2;
        w2.f(attributeSet, R.attr.editTextStyle);
        w2.b();
        C0205B c0205b = new C0205B();
        c0205b.f3250b = this;
        this.f3481c = c0205b;
        this.d = new Q.r();
        C0205B c0205b2 = new C0205B(this);
        this.f3482e = c0205b2;
        c0205b2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0205b2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0262u getSuperCaller() {
        if (this.f3483f == null) {
            this.f3483f = new C0262u(this);
        }
        return this.f3483f;
    }

    @Override // K.r
    public final C0010f a(C0010f c0010f) {
        return this.d.a(this, c0010f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0252p c0252p = this.f3479a;
        if (c0252p != null) {
            c0252p.a();
        }
        W w2 = this.f3480b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.q ? ((Q.q) customSelectionActionModeCallback).f883a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0252p c0252p = this.f3479a;
        if (c0252p != null) {
            return c0252p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0252p c0252p = this.f3479a;
        if (c0252p != null) {
            return c0252p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3480b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3480b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0205B c0205b;
        if (Build.VERSION.SDK_INT >= 28 || (c0205b = this.f3481c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0205b.f3251c;
        return textClassifier == null ? AbstractC0220Q.a((TextView) c0205b.f3250b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3480b.getClass();
        W.h(editorInfo, onCreateInputConnection, this);
        b1.g.u(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f2 = K.Q.f(this)) != null) {
            editorInfo.contentMimeTypes = f2;
            onCreateInputConnection = new P.c(onCreateInputConnection, new P.b(this));
        }
        return this.f3482e.c(onCreateInputConnection, editorInfo);
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
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && K.Q.f(this) != null) {
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
                z2 = AbstractC0208E.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0007c interfaceC0007c;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || K.Q.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC0007c = new A0.c(primaryClip, 1);
            } else {
                C0008d c0008d = new C0008d();
                c0008d.f601b = primaryClip;
                c0008d.f602c = 1;
                interfaceC0007c = c0008d;
            }
            interfaceC0007c.o(i == 16908322 ? 0 : 1);
            K.Q.h(this, interfaceC0007c.h());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0252p c0252p = this.f3479a;
        if (c0252p != null) {
            c0252p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0252p c0252p = this.f3479a;
        if (c0252p != null) {
            c0252p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3480b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w2 = this.f3480b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H1.d.x0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3482e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3482e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0252p c0252p = this.f3479a;
        if (c0252p != null) {
            c0252p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0252p c0252p = this.f3479a;
        if (c0252p != null) {
            c0252p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w2 = this.f3480b;
        w2.l(colorStateList);
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w2 = this.f3480b;
        w2.m(mode);
        w2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        W w2 = this.f3480b;
        if (w2 != null) {
            w2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0205B c0205b;
        if (Build.VERSION.SDK_INT >= 28 || (c0205b = this.f3481c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0205b.f3251c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
