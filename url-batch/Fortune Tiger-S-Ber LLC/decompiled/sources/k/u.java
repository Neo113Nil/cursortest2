package k;

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
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class u extends EditText implements k0.n {

    /* renamed from: f, reason: collision with root package name */
    public final b1.b f2651f;
    public final v0 g;
    public final a0 h;

    /* renamed from: i, reason: collision with root package name */
    public final o0.i f2652i;

    /* renamed from: j, reason: collision with root package name */
    public final a0 f2653j;

    /* renamed from: k, reason: collision with root package name */
    public t f2654k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        p2.a(context);
        o2.a(this, getContext());
        b1.b bVar = new b1.b(this);
        this.f2651f = bVar;
        bVar.l(attributeSet, R.attr.editTextStyle);
        v0 v0Var = new v0(this);
        this.g = v0Var;
        v0Var.f(attributeSet, R.attr.editTextStyle);
        v0Var.b();
        a0 a0Var = new a0();
        a0Var.f2499b = this;
        this.h = a0Var;
        this.f2652i = new o0.i();
        a0 a0Var2 = new a0(this);
        this.f2653j = a0Var2;
        a0Var2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a4 = a0Var2.a(keyListener);
        if (a4 == keyListener) {
            return;
        }
        super.setKeyListener(a4);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private t getSuperCaller() {
        if (this.f2654k == null) {
            this.f2654k = new t(this);
        }
        return this.f2654k;
    }

    @Override // k0.n
    public final k0.f a(k0.f fVar) {
        this.f2652i.getClass();
        return o0.i.a(this, fVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b1.b bVar = this.f2651f;
        if (bVar != null) {
            bVar.a();
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof o0.h ? ((o0.h) customSelectionActionModeCallback).f2981a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        b1.b bVar = this.f2651f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b1.b bVar = this.f2651f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a0Var.c;
        return textClassifier == null ? p0.a((TextView) a0Var.f2499b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        v0.h(editorInfo, onCreateInputConnection, this);
        k3.m.I(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (g = k0.j0.g(this)) != null) {
            editorInfo.contentMimeTypes = g;
            onCreateInputConnection = new m0.b(onCreateInputConnection, new j2.z(this));
        }
        return this.f2653j.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 || i4 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z3 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && k0.j0.g(this) != null) {
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
                z3 = d0.a(dragEvent, this, activity);
            }
        }
        if (z3) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i4) {
        k0.c cVar;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31 || k0.j0.g(this) == null || !(i4 == 16908322 || i4 == 16908337)) {
            return super.onTextContextMenuItem(i4);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i5 >= 31) {
                cVar = new a2.e(primaryClip, 1);
            } else {
                k0.d dVar = new k0.d();
                dVar.g = primaryClip;
                dVar.h = 1;
                cVar = dVar;
            }
            cVar.s(i4 == 16908322 ? 0 : 1);
            k0.j0.i(this, cVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b1.b bVar = this.f2651f;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        b1.b bVar = this.f2651f;
        if (bVar != null) {
            bVar.o(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l0.g.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f2653j.d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2653j.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b1.b bVar = this.f2651f;
        if (bVar != null) {
            bVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b1.b bVar = this.f2651f;
        if (bVar != null) {
            bVar.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.g;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.g;
        v0Var.m(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.g(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
