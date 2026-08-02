package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hv extends CheckedTextView {
    private final hs a;
    private final it b;
    private final efg c;
    private afr d;

    public hv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        mb.d(this, getContext());
        it itVar = new it(this);
        this.b = itVar;
        itVar.c(attributeSet, R.attr.checkedTextViewStyle);
        itVar.a();
        hs hsVar = new hs(this);
        this.a = hsVar;
        hsVar.b(attributeSet, R.attr.checkedTextViewStyle);
        efg efgVar = new efg(this);
        this.c = efgVar;
        efgVar.d(attributeSet);
        a().r(attributeSet, R.attr.checkedTextViewStyle);
    }

    private final afr a() {
        afr afrVar = this.d;
        if (afrVar != null) {
            return afrVar;
        }
        afr afrVar2 = new afr(this);
        this.d = afrVar2;
        return afrVar2;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        it itVar = this.b;
        if (itVar != null) {
            itVar.a();
        }
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.a();
        }
        efg efgVar = this.c;
        if (efgVar != null) {
            efgVar.c();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        zy.d(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kt.u(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        acv acvVar = acv.a;
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

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        efg efgVar = this.c;
        if (efgVar != null) {
            if (efgVar.a) {
                efgVar.a = false;
            } else {
                efgVar.a = true;
                efgVar.c();
            }
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        it itVar = this.b;
        if (itVar != null) {
            itVar.d(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(e.f(getContext(), i));
    }
}
