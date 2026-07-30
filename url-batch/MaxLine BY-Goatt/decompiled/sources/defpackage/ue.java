package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ue extends Button {
    public final te m;
    public final xg n;
    public wf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        vx2.a(context);
        xw2.a(this, getContext());
        te teVar = new te(this);
        this.m = teVar;
        teVar.e(attributeSet, R.attr.buttonStyle);
        xg xgVar = new xg(this);
        this.n = xgVar;
        xgVar.f(attributeSet, R.attr.buttonStyle);
        xgVar.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private wf getEmojiTextViewHelper() {
        if (this.o == null) {
            this.o = new wf(this);
        }
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        te teVar = this.m;
        if (teVar != null) {
            teVar.a();
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c63.c) {
            return super.getAutoSizeMaxTextSize();
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            return Math.round(xgVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (c63.c) {
            return super.getAutoSizeMinTextSize();
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            return Math.round(xgVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (c63.c) {
            return super.getAutoSizeStepGranularity();
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            return Math.round(xgVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (c63.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        xg xgVar = this.n;
        return xgVar != null ? xgVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (c63.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            return xgVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ti2.m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        te teVar = this.m;
        if (teVar != null) {
            return teVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        te teVar = this.m;
        if (teVar != null) {
            return teVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.n.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.n.e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        xg xgVar = this.n;
        if (xgVar == null || c63.c) {
            return;
        }
        xgVar.i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        xg xgVar = this.n;
        if (xgVar != null) {
            gh ghVar = xgVar.i;
            if (c63.c || !ghVar.f()) {
                return;
            }
            ghVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (c63.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (c63.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (c63.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        te teVar = this.m;
        if (teVar != null) {
            teVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        te teVar = this.m;
        if (teVar != null) {
            teVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ti2.n(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((tk3) getEmojiTextViewHelper().b.n).O(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        te teVar = this.m;
        if (teVar != null) {
            teVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        te teVar = this.m;
        if (teVar != null) {
            teVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        xg xgVar = this.n;
        xgVar.k(colorStateList);
        xgVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        xg xgVar = this.n;
        xgVar.l(mode);
        xgVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xg xgVar = this.n;
        if (xgVar != null) {
            xgVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = c63.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        xg xgVar = this.n;
        if (xgVar != null) {
            gh ghVar = xgVar.i;
            if (z || ghVar.f()) {
                return;
            }
            ghVar.g(i, f);
        }
    }
}
