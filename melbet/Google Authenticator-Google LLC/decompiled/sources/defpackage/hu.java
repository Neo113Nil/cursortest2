package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hu extends CheckBox {
    public final hw a;
    private final hs b;
    private final it c;
    private afr d;

    public hu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mb.d(this, getContext());
        hw hwVar = new hw(this);
        this.a = hwVar;
        hwVar.b(attributeSet, i);
        hs hsVar = new hs(this);
        this.b = hsVar;
        hsVar.b(attributeSet, i);
        it itVar = new it(this);
        this.c = itVar;
        itVar.c(attributeSet, i);
        a().r(attributeSet, i);
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        hs hsVar = this.b;
        if (hsVar != null) {
            hsVar.a();
        }
        it itVar = this.c;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        acv acvVar = acv.a;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hs hsVar = this.b;
        if (hsVar != null) {
            hsVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hs hsVar = this.b;
        if (hsVar != null) {
            hsVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(e.f(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        it itVar = this.c;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        it itVar = this.c;
        if (itVar != null) {
            itVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        a();
        acv acvVar = acv.a;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.c();
        }
    }

    public hu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public hu(Context context) {
        this(context, null);
    }
}
