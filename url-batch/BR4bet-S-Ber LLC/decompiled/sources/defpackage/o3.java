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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class o3 extends Button {
    public final y1 f;
    public final x5 g;
    public u4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g90.a(context);
        z80.a(this, getContext());
        y1 y1Var = new y1(this);
        this.f = y1Var;
        y1Var.l(attributeSet, i);
        x5 x5Var = new x5(this);
        this.g = x5Var;
        x5Var.f(attributeSet, i);
        x5Var.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private u4 getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new u4(this);
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.a();
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (ed0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            return Math.round(x5Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (ed0.c) {
            return super.getAutoSizeMinTextSize();
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            return Math.round(x5Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (ed0.c) {
            return super.getAutoSizeStepGranularity();
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            return Math.round(x5Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (ed0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x5 x5Var = this.g;
        return x5Var != null ? x5Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (ed0.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            return x5Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof w80 ? ((w80) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
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

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        x5 x5Var = this.g;
        if (x5Var == null || ed0.c) {
            return;
        }
        x5Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        x5 x5Var = this.g;
        if (x5Var != null) {
            g6 g6Var = x5Var.i;
            if (ed0.c || !g6Var.f()) {
                return;
            }
            g6Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (ed0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (ed0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ed0.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xf.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((kr) getEmojiTextViewHelper().b.g).z(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x5 x5Var = this.g;
        x5Var.l(colorStateList);
        x5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x5 x5Var = this.g;
        x5Var.m(mode);
        x5Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        x5 x5Var = this.g;
        if (x5Var != null) {
            x5Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = ed0.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        x5 x5Var = this.g;
        if (x5Var != null) {
            g6 g6Var = x5Var.i;
            if (z || g6Var.f()) {
                return;
            }
            g6Var.g(i, f);
        }
    }
}
