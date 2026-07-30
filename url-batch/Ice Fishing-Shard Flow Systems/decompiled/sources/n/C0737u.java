package n;

import I.C0108d;
import I.C0110f;
import I.InterfaceC0107c;
import I.InterfaceC0125v;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.icefishing.icefish.ice.fishing.s294s.R;

/* renamed from: n.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737u extends EditText implements InterfaceC0125v {

    /* renamed from: d, reason: collision with root package name */
    public final C0726o f6901d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f6902e;

    /* renamed from: i, reason: collision with root package name */
    public final C0695A f6903i;

    /* renamed from: l, reason: collision with root package name */
    public final L.i f6904l;

    /* renamed from: m, reason: collision with root package name */
    public final C0695A f6905m;

    /* renamed from: n, reason: collision with root package name */
    public C0735t f6906n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0737u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        j1.a(context);
        i1.a(this, getContext());
        C0726o c0726o = new C0726o(this);
        this.f6901d = c0726o;
        c0726o.d(attributeSet, R.attr.editTextStyle);
        Z z7 = new Z(this);
        this.f6902e = z7;
        z7.f(attributeSet, R.attr.editTextStyle);
        z7.b();
        C0695A c0695a = new C0695A();
        c0695a.f6605b = this;
        this.f6903i = c0695a;
        this.f6904l = new L.i();
        C0695A c0695a2 = new C0695A(this);
        this.f6905m = c0695a2;
        c0695a2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a7 = c0695a2.a(keyListener);
        if (a7 == keyListener) {
            return;
        }
        super.setKeyListener(a7);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    private C0735t getSuperCaller() {
        if (this.f6906n == null) {
            this.f6906n = new C0735t(this);
        }
        return this.f6906n;
    }

    @Override // I.InterfaceC0125v
    public final C0110f a(C0110f c0110f) {
        this.f6904l.getClass();
        return L.i.a(this, c0110f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0726o c0726o = this.f6901d;
        if (c0726o != null) {
            c0726o.a();
        }
        Z z7 = this.f6902e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return P0.f.N(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0726o c0726o = this.f6901d;
        if (c0726o != null) {
            return c0726o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0726o c0726o = this.f6901d;
        if (c0726o != null) {
            return c0726o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6902e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6902e.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0695A c0695a;
        if (Build.VERSION.SDK_INT >= 28 || (c0695a = this.f6903i) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0695a.f6606c;
        return textClassifier == null ? T.a((TextView) c0695a.f6605b) : textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r1 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r1 != null) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        String[] e7;
        String[] stringArray;
        InputConnection fVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f6902e.getClass();
        Z.h(editorInfo, onCreateInputConnection, this);
        O6.g.W(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && (i2 = Build.VERSION.SDK_INT) <= 30 && (e7 = I.T.e(this)) != null) {
            K.d.a(editorInfo, e7);
            A4.b bVar = new A4.b(1, this);
            if (i2 >= 25) {
                fVar = new K.e(onCreateInputConnection, bVar);
            } else {
                String[] strArr = K.d.f1416a;
                if (i2 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        fVar = new K.f(onCreateInputConnection, bVar);
                    }
                }
            }
            onCreateInputConnection = fVar;
        }
        return this.f6905m.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z7 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && I.T.e(this) != null) {
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
                z7 = D.a(dragEvent, this, activity);
            }
        }
        if (z7) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        InterfaceC0107c interfaceC0107c;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31 || I.T.e(this) == null || !(i2 == 16908322 || i2 == 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i5 >= 31) {
                interfaceC0107c = new l2.c(primaryClip, 1);
            } else {
                C0108d c0108d = new C0108d();
                c0108d.f1177e = primaryClip;
                c0108d.f1178i = 1;
                interfaceC0107c = c0108d;
            }
            interfaceC0107c.t(i2 == 16908322 ? 0 : 1);
            I.T.g(this, interfaceC0107c.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0726o c0726o = this.f6901d;
        if (c0726o != null) {
            c0726o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0726o c0726o = this.f6901d;
        if (c0726o != null) {
            c0726o.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6902e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z7 = this.f6902e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(P0.f.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f6905m.d(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f6905m.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0726o c0726o = this.f6901d;
        if (c0726o != null) {
            c0726o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0726o c0726o = this.f6901d;
        if (c0726o != null) {
            c0726o.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z7 = this.f6902e;
        z7.l(colorStateList);
        z7.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z7 = this.f6902e;
        z7.m(mode);
        z7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        Z z7 = this.f6902e;
        if (z7 != null) {
            z7.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0695A c0695a;
        if (Build.VERSION.SDK_INT >= 28 || (c0695a = this.f6903i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0695a.f6606c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}
