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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class e3 extends Button {
    public final x1 f;
    public final n5 g;
    public k4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        w50.a(context);
        s50.a(this, getContext());
        x1 x1Var = new x1(this);
        this.f = x1Var;
        x1Var.l(attributeSet, i);
        n5 n5Var = new n5(this);
        this.g = n5Var;
        n5Var.f(attributeSet, i);
        n5Var.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private k4 getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new k4(this);
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.a();
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (v90.c) {
            return super.getAutoSizeMaxTextSize();
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            return Math.round(n5Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (v90.c) {
            return super.getAutoSizeMinTextSize();
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            return Math.round(n5Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (v90.c) {
            return super.getAutoSizeStepGranularity();
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            return Math.round(n5Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (v90.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        n5 n5Var = this.g;
        return n5Var != null ? n5Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (v90.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            return n5Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof p50 ? ((p50) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        x1 x1Var = this.f;
        if (x1Var != null) {
            return x1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x1 x1Var = this.f;
        if (x1Var != null) {
            return x1Var.i();
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
        n5 n5Var = this.g;
        if (n5Var == null || v90.c) {
            return;
        }
        n5Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        n5 n5Var = this.g;
        if (n5Var != null) {
            w5 w5Var = n5Var.i;
            if (v90.c || !w5Var.f()) {
                return;
            }
            w5Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (v90.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (v90.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (v90.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jw.f0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((e70) getEmojiTextViewHelper().b.g).A(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x1 x1Var = this.f;
        if (x1Var != null) {
            x1Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        n5 n5Var = this.g;
        n5Var.l(colorStateList);
        n5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        n5 n5Var = this.g;
        n5Var.m(mode);
        n5Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        n5 n5Var = this.g;
        if (n5Var != null) {
            n5Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = v90.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        n5 n5Var = this.g;
        if (n5Var != null) {
            w5 w5Var = n5Var.i;
            if (z || w5Var.f()) {
                return;
            }
            w5Var.g(i, f);
        }
    }
}
