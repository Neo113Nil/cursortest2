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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class u3 extends Button {
    public final t3 f;
    public final e6 g;
    public b5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e60.a(context);
        a60.a(this, getContext());
        t3 t3Var = new t3(this);
        this.f = t3Var;
        t3Var.d(attributeSet, i);
        e6 e6Var = new e6(this);
        this.g = e6Var;
        e6Var.f(attributeSet, i);
        e6Var.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private b5 getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new b5(this);
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.a();
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (ca0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            return Math.round(e6Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (ca0.c) {
            return super.getAutoSizeMinTextSize();
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            return Math.round(e6Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (ca0.c) {
            return super.getAutoSizeStepGranularity();
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            return Math.round(e6Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (ca0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        e6 e6Var = this.g;
        return e6Var != null ? e6Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (ca0.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            return e6Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof x50 ? ((x50) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        t3 t3Var = this.f;
        if (t3Var != null) {
            return t3Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t3 t3Var = this.f;
        if (t3Var != null) {
            return t3Var.c();
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
        e6 e6Var = this.g;
        if (e6Var == null || ca0.c) {
            return;
        }
        e6Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e6 e6Var = this.g;
        if (e6Var != null) {
            n6 n6Var = e6Var.i;
            if (ca0.c || !n6Var.f()) {
                return;
            }
            n6Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (ca0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (ca0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ca0.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j8.X(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((vw) getEmojiTextViewHelper().b.g).B(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t3 t3Var = this.f;
        if (t3Var != null) {
            t3Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e6 e6Var = this.g;
        e6Var.l(colorStateList);
        e6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e6 e6Var = this.g;
        e6Var.m(mode);
        e6Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e6 e6Var = this.g;
        if (e6Var != null) {
            e6Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = ca0.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        e6 e6Var = this.g;
        if (e6Var != null) {
            n6 n6Var = e6Var.i;
            if (z || n6Var.f()) {
                return;
            }
            n6Var.g(i, f);
        }
    }
}
