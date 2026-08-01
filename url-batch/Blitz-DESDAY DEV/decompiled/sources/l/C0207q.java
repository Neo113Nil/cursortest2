package l;

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

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0207q extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0205p f3051a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3052b;

    /* renamed from: c, reason: collision with root package name */
    public C0220x f3053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0207q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        S0.a(this, getContext());
        C0205p c0205p = new C0205p(this);
        this.f3051a = c0205p;
        c0205p.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f3052b = y2;
        y2.f(attributeSet, i);
        y2.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0220x getEmojiTextViewHelper() {
        if (this.f3053c == null) {
            this.f3053c = new C0220x(this);
        }
        return this.f3053c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0205p c0205p = this.f3051a;
        if (c0205p != null) {
            c0205p.a();
        }
        Y y2 = this.f3052b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (j1.f3012c) {
            return super.getAutoSizeMaxTextSize();
        }
        Y y2 = this.f3052b;
        if (y2 != null) {
            return Math.round(y2.i.f3002e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (j1.f3012c) {
            return super.getAutoSizeMinTextSize();
        }
        Y y2 = this.f3052b;
        if (y2 != null) {
            return Math.round(y2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (j1.f3012c) {
            return super.getAutoSizeStepGranularity();
        }
        Y y2 = this.f3052b;
        if (y2 != null) {
            return Math.round(y2.i.f3001c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (j1.f3012c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Y y2 = this.f3052b;
        return y2 != null ? y2.i.f3003f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (j1.f3012c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Y y2 = this.f3052b;
        if (y2 != null) {
            return y2.i.f2999a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof S.r ? ((S.r) customSelectionActionModeCallback).f795a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0205p c0205p = this.f3051a;
        if (c0205p != null) {
            return c0205p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0205p c0205p = this.f3051a;
        if (c0205p != null) {
            return c0205p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3052b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3052b.e();
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
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        Y y2 = this.f3052b;
        if (y2 == null || j1.f3012c) {
            return;
        }
        y2.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Y y2 = this.f3052b;
        if (y2 == null || j1.f3012c) {
            return;
        }
        C0192i0 c0192i0 = y2.i;
        if (c0192i0.f()) {
            c0192i0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (j1.f3012c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Y y2 = this.f3052b;
        if (y2 != null) {
            y2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (j1.f3012c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Y y2 = this.f3052b;
        if (y2 != null) {
            y2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (j1.f3012c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Y y2 = this.f3052b;
        if (y2 != null) {
            y2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0205p c0205p = this.f3051a;
        if (c0205p != null) {
            c0205p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0205p c0205p = this.f3051a;
        if (c0205p != null) {
            c0205p.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(z1.l.x0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((z1.d) getEmojiTextViewHelper().f3095b.f170b).z(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        Y y2 = this.f3052b;
        if (y2 != null) {
            y2.f2946a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0205p c0205p = this.f3051a;
        if (c0205p != null) {
            c0205p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0205p c0205p = this.f3051a;
        if (c0205p != null) {
            c0205p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3052b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3052b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3052b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = j1.f3012c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Y y2 = this.f3052b;
        if (y2 == null || z2) {
            return;
        }
        C0192i0 c0192i0 = y2.i;
        if (c0192i0.f()) {
            return;
        }
        c0192i0.g(i, f2);
    }
}
