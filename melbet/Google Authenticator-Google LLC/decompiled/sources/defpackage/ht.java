package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ht extends Button {
    public final hs a;
    private final it b;
    private is c;
    private afr d;

    public ht(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mb.d(this, getContext());
        hs hsVar = new hs(this);
        this.a = hsVar;
        hsVar.b(attributeSet, i);
        it itVar = new it(this);
        this.b = itVar;
        itVar.c(attributeSet, i);
        itVar.a();
        c().r(attributeSet, i);
    }

    private final afr c() {
        afr afrVar = this.d;
        if (afrVar != null) {
            return afrVar;
        }
        afr afrVar2 = new afr(this);
        this.d = afrVar2;
        return afrVar2;
    }

    final is bG() {
        is isVar = this.c;
        if (isVar != null) {
            return isVar;
        }
        is isVar2 = new is(this, new be(this, 6));
        this.c = isVar2;
        return isVar2;
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
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        zy.d(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return bG().b;
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return bG().a;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        acv acvVar = acv.a;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hs hsVar = this.a;
        if (hsVar != null) {
            hsVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        c();
        acv acvVar = acv.a;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return bG().b(str);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        it itVar = this.b;
        if (itVar != null) {
            itVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        bG().a(typeface);
    }

    public ht(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public ht(Context context) {
        this(context, null);
    }
}
