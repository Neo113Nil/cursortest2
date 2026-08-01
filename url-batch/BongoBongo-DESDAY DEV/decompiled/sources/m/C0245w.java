package m;

import L.C0006d;
import L.C0008f;
import L.InterfaceC0004c;
import L.InterfaceC0021t;
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
import com.winfour.winrandom.R;

/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0245w extends EditText implements InterfaceC0021t {

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f3193a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3194b;

    /* renamed from: c, reason: collision with root package name */
    public final C0185C f3195c;
    public final R.s d;

    /* renamed from: e, reason: collision with root package name */
    public final C0185C f3196e;

    /* renamed from: f, reason: collision with root package name */
    public C0243v f3197f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0245w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        Y0.a(context);
        X0.a(this, getContext());
        C0231p c0231p = new C0231p(this);
        this.f3193a = c0231p;
        c0231p.d(attributeSet, R.attr.editTextStyle);
        Y y2 = new Y(this);
        this.f3194b = y2;
        y2.f(attributeSet, R.attr.editTextStyle);
        y2.b();
        C0185C c0185c = new C0185C();
        c0185c.f2910b = this;
        this.f3195c = c0185c;
        this.d = new R.s();
        C0185C c0185c2 = new C0185C(this);
        this.f3196e = c0185c2;
        c0185c2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0185c2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0243v getSuperCaller() {
        if (this.f3197f == null) {
            this.f3197f = new C0243v(this);
        }
        return this.f3197f;
    }

    @Override // L.InterfaceC0021t
    public final C0008f a(C0008f c0008f) {
        return this.d.a(this, c0008f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f3193a;
        if (c0231p != null) {
            c0231p.a();
        }
        Y y2 = this.f3194b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return A1.m.n0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f3193a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f3193a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3194b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3194b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0185C c0185c;
        if (Build.VERSION.SDK_INT >= 28 || (c0185c = this.f3195c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0185c.f2911c;
        return textClassifier == null ? AbstractC0200S.a((TextView) c0185c.f2910b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3194b.getClass();
        Y.h(editorInfo, onCreateInputConnection, this);
        h0.d0.l(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f2 = L.T.f(this)) != null) {
            editorInfo.contentMimeTypes = f2;
            onCreateInputConnection = new Q.b(onCreateInputConnection, new N0.k(this));
        }
        return this.f3196e.c(onCreateInputConnection, editorInfo);
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
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && L.T.f(this) != null) {
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
                z2 = AbstractC0188F.a(dragEvent, this, activity);
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
        if (i2 >= 31 || L.T.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC0004c = new D.g(primaryClip, 1);
            } else {
                C0006d c0006d = new C0006d();
                c0006d.f512b = primaryClip;
                c0006d.f513c = 1;
                interfaceC0004c = c0006d;
            }
            interfaceC0004c.t(i == 16908322 ? 0 : 1);
            L.T.h(this, interfaceC0004c.k());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f3193a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f3193a;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3194b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3194b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A1.m.p0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3196e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3196e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f3193a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f3193a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3194b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3194b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3194b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0185C c0185c;
        if (Build.VERSION.SDK_INT >= 28 || (c0185c = this.f3195c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0185c.f2911c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
