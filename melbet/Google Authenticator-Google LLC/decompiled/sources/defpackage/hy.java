package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hy extends EditText implements xr {
    private final hs a;
    private final it b;
    private is c;
    private final brr d;
    private kee e;

    public hy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mb.d(this, getContext());
        hs hsVar = new hs(this);
        this.a = hsVar;
        hsVar.b(attributeSet, i);
        it itVar = new it(this);
        this.b = itVar;
        itVar.c(attributeSet, i);
        itVar.a();
        brr brrVar = new brr(this);
        this.d = brrVar;
        brrVar.o(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (brr.p(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener q = brr.q(keyListener);
            if (q == keyListener) {
                return;
            }
            super.setKeyListener(q);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    private final kee d() {
        kee keeVar = this.e;
        if (keeVar != null) {
            return keeVar;
        }
        kee keeVar2 = new kee(this);
        this.e = keeVar2;
        return keeVar2;
    }

    final is a() {
        is isVar = this.c;
        if (isVar != null) {
            return isVar;
        }
        is isVar2 = new is(this, new be(this, 7));
        this.c = isVar2;
        return isVar2;
    }

    @Override // defpackage.xr
    public final xc b(xc xcVar) {
        return abf.d(this, xcVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.a();
        }
        it itVar = this.b;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        zy.d(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return a().b;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return a().a;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] p;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        it.f(this, onCreateInputConnection, editorInfo);
        kt.u(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (p = yq.p(this)) != null) {
            editorInfo.contentMimeTypes = p;
            kee keeVar = new kee(this, null);
            a.v(editorInfo, "editorInfo must be non-null");
            onCreateInputConnection = new aau(onCreateInputConnection, keeVar);
        }
        return this.d.r(onCreateInputConnection);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && yq.p(this) != null) {
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
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    yq.d(this, (Build.VERSION.SDK_INT >= 31 ? new ww(clipData, 3) : new wy(clipData, 3)).a());
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT < 31 && yq.p(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                wx wwVar = Build.VERSION.SDK_INT >= 31 ? new ww(primaryClip, 1) : new wy(primaryClip, 1);
                wwVar.c(i == 16908322 ? 0 : 1);
                yq.d(this, wwVar.a());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        it itVar = this.b;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        it itVar = this.b;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return a().b(str);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(brr.q(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        it itVar = this.b;
        if (itVar != null) {
            itVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        a().a(typeface);
    }

    public hy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public hy(Context context) {
        this(context, null);
    }
}
