package l;

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
import android.text.TextUtils;
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
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class u extends EditText implements q3.q {

    /* renamed from: d, reason: collision with root package name */
    public final n f4417d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f4418e;

    /* renamed from: f, reason: collision with root package name */
    public final a0.a0 f4419f;

    /* renamed from: g, reason: collision with root package name */
    public final u3.i f4420g;

    /* renamed from: h, reason: collision with root package name */
    public final a0.a0 f4421h;
    public t i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        w1.a(context);
        v1.a(this, getContext());
        n nVar = new n(this);
        this.f4417d = nVar;
        nVar.d(attributeSet, R.attr.editTextStyle);
        f0 f0Var = new f0(this);
        this.f4418e = f0Var;
        f0Var.d(attributeSet, R.attr.editTextStyle);
        f0Var.b();
        a0.a0 a0Var = new a0.a0(11, false);
        a0Var.f11e = this;
        this.f4419f = a0Var;
        this.f4420g = new u3.i();
        a0.a0 a0Var2 = new a0.a0(this, 10);
        this.f4421h = a0Var2;
        a0Var2.p(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener o2 = a0Var2.o(keyListener);
        if (o2 == keyListener) {
            return;
        }
        super.setKeyListener(o2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private t getSuperCaller() {
        if (this.i == null) {
            this.i = new t(this);
        }
        return this.i;
    }

    @Override // q3.q
    public final q3.g a(q3.g gVar) {
        this.f4420g.getClass();
        return u3.i.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f4417d;
        if (nVar != null) {
            nVar.a();
        }
        f0 f0Var = this.f4418e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r2.o.v0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f4417d;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f4417d;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        x1 x1Var = this.f4418e.f4239h;
        if (x1Var != null) {
            return x1Var.f4452a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        x1 x1Var = this.f4418e.f4239h;
        if (x1Var != null) {
            return x1Var.f4453b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0.a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f4419f) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a0Var.f12f;
        return textClassifier == null ? a0.a((TextView) a0Var.f11e) : textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        if (r3 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012a, code lost:
    
        if (r3 != null) goto L69;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] e8;
        String[] stringArray;
        InputConnection eVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4418e.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i >= 30) {
                s3.b.a(editorInfo, text);
            } else {
                text.getClass();
                if (i >= 30) {
                    s3.b.a(editorInfo, text);
                } else {
                    int i8 = editorInfo.initialSelStart;
                    int i9 = editorInfo.initialSelEnd;
                    int i10 = i8 > i9 ? i9 : i8;
                    if (i8 <= i9) {
                        i8 = i9;
                    }
                    int length = text.length();
                    if (i10 < 0 || i8 > length) {
                        s3.c.a(editorInfo, null, 0, 0);
                    } else {
                        int i11 = editorInfo.inputType & 4095;
                        if (i11 == 129 || i11 == 225 || i11 == 18) {
                            s3.c.a(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            s3.c.a(editorInfo, text, i10, i8);
                        } else {
                            int i12 = i8 - i10;
                            int i13 = i12 > 1024 ? 0 : i12;
                            int i14 = 2048 - i13;
                            int min = Math.min(text.length() - i8, i14 - Math.min(i10, (int) (i14 * 0.8d)));
                            int min2 = Math.min(i10, i14 - min);
                            int i15 = i10 - min2;
                            if (Character.isLowSurrogate(text.charAt(i15))) {
                                i15++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i8 + min) - 1))) {
                                min--;
                            }
                            int i16 = min2 + i13;
                            s3.c.a(editorInfo, i13 != i12 ? TextUtils.concat(text.subSequence(i15, i15 + min2), text.subSequence(i8, min + i8)) : text.subSequence(i15, i16 + min + i15), min2, i16);
                        }
                    }
                }
            }
        }
        h0.a.Q(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && i <= 30 && (e8 = q3.k0.e(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = e8;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", e8);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", e8);
            }
            b.q qVar = new b.q(this);
            if (i >= 25) {
                eVar = new s3.d(onCreateInputConnection, qVar);
            } else {
                String[] strArr = s3.c.f6696a;
                if (i >= 25) {
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
                        eVar = new s3.e(onCreateInputConnection, qVar);
                    }
                }
            }
            onCreateInputConnection = eVar;
        }
        return this.f4421h.q(onCreateInputConnection, editorInfo);
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
        boolean z3 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && q3.k0.e(this) != null) {
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
                z3 = z.a(dragEvent, this, activity);
            }
        }
        if (z3) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        q3.c cVar;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31 || q3.k0.e(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i8 >= 31) {
                cVar = new b1.b(primaryClip, 1);
            } else {
                q3.d dVar = new q3.d();
                dVar.f6093e = primaryClip;
                dVar.f6094f = 1;
                cVar = dVar;
            }
            cVar.q(i == 16908322 ? 0 : 1);
            q3.k0.g(this, cVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f4417d;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        n nVar = this.f4417d;
        if (nVar != null) {
            nVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f4418e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f4418e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r2.o.y0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f4421h.u(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4421h.o(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f4417d;
        if (nVar != null) {
            nVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f4417d;
        if (nVar != null) {
            nVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f0 f0Var = this.f4418e;
        f0Var.i(colorStateList);
        f0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f0 f0Var = this.f4418e;
        f0Var.j(mode);
        f0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f0 f0Var = this.f4418e;
        if (f0Var != null) {
            f0Var.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0.a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f4419f) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f12f = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
