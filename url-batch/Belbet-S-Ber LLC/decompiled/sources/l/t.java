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
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class t extends EditText implements n0.q {

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.datepicker.c f2565f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f2566g;
    public final z h;
    public final r0.h i;

    /* renamed from: j, reason: collision with root package name */
    public final z f2567j;

    /* renamed from: k, reason: collision with root package name */
    public s f2568k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        p2.a(context);
        o2.a(this, getContext());
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(this);
        this.f2565f = cVar;
        cVar.m(attributeSet, R.attr.editTextStyle);
        v0 v0Var = new v0(this);
        this.f2566g = v0Var;
        v0Var.f(attributeSet, R.attr.editTextStyle);
        v0Var.b();
        z zVar = new z();
        zVar.f2609b = this;
        this.h = zVar;
        this.i = new r0.h();
        z zVar2 = new z(this);
        this.f2567j = zVar2;
        zVar2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a5 = zVar2.a(keyListener);
        if (a5 == keyListener) {
            return;
        }
        super.setKeyListener(a5);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private s getSuperCaller() {
        if (this.f2568k == null) {
            this.f2568k = new s(this);
        }
        return this.f2568k;
    }

    @Override // n0.q
    public final n0.f a(n0.f fVar) {
        this.i.getClass();
        return r0.h.a(this, fVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f2565f;
        if (cVar != null) {
            cVar.a();
        }
        v0 v0Var = this.f2566g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof r0.g ? ((r0.g) customSelectionActionModeCallback).f3200a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f2565f;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f2565f;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2566g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2566g.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) zVar.f2610c;
        return textClassifier == null ? p0.a((TextView) zVar.f2609b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g3;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2566g.getClass();
        v0.h(editorInfo, onCreateInputConnection, this);
        b4.l.S(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (g3 = n0.p0.g(this)) != null) {
            editorInfo.contentMimeTypes = g3;
            onCreateInputConnection = new p0.a(onCreateInputConnection, new a.g0(3, this));
        }
        return this.f2567j.c(onCreateInputConnection, editorInfo);
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
        boolean z4 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && n0.p0.g(this) != null) {
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
                z4 = c0.a(dragEvent, this, activity);
            }
        }
        if (z4) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        n0.c cVar;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 || n0.p0.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i4 >= 31) {
                cVar = new a0.a(primaryClip, 1);
            } else {
                n0.d dVar = new n0.d();
                dVar.f2766g = primaryClip;
                dVar.h = 1;
                cVar = dVar;
            }
            cVar.A(i == 16908322 ? 0 : 1);
            n0.p0.i(this, cVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f2565f;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        com.google.android.material.datepicker.c cVar = this.f2565f;
        if (cVar != null) {
            cVar.p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f2566g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f2566g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b4.l.k0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f2567j.d(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2567j.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f2565f;
        if (cVar != null) {
            cVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f2565f;
        if (cVar != null) {
            cVar.v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f2566g;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f2566g;
        v0Var.m(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v0 v0Var = this.f2566g;
        if (v0Var != null) {
            v0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.f2610c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
