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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class w3 extends Button {
    public final f2 f;
    public final f6 g;
    public d5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ji0.a(context);
        yh0.a(this, getContext());
        f2 f2Var = new f2(this);
        this.f = f2Var;
        f2Var.l(attributeSet, i);
        f6 f6Var = new f6(this);
        this.g = f6Var;
        f6Var.f(attributeSet, i);
        f6Var.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private d5 getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new d5(this);
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.a();
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (dn0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            return Math.round(f6Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (dn0.c) {
            return super.getAutoSizeMinTextSize();
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            return Math.round(f6Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (dn0.c) {
            return super.getAutoSizeStepGranularity();
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            return Math.round(f6Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (dn0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        f6 f6Var = this.g;
        return f6Var != null ? f6Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (dn0.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            return f6Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof vh0 ? ((vh0) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            return f2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            return f2Var.i();
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
        f6 f6Var = this.g;
        if (f6Var == null || dn0.c) {
            return;
        }
        f6Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        f6 f6Var = this.g;
        if (f6Var != null) {
            o6 o6Var = f6Var.i;
            if (dn0.c || !o6Var.f()) {
                return;
            }
            o6Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (dn0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (dn0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (dn0.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xc0.i(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((d50) getEmojiTextViewHelper().b.g).w(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f6 f6Var = this.g;
        f6Var.l(colorStateList);
        f6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f6 f6Var = this.g;
        f6Var.m(mode);
        f6Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f6 f6Var = this.g;
        if (f6Var != null) {
            f6Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = dn0.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        f6 f6Var = this.g;
        if (f6Var != null) {
            o6 o6Var = f6Var.i;
            if (z || o6Var.f()) {
                return;
            }
            o6Var.g(i, f);
        }
    }
}
