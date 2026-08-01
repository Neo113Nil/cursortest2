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

/* renamed from: l.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0282r extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0280q f3433a;

    /* renamed from: b, reason: collision with root package name */
    public final C0249a0 f3434b;

    /* renamed from: c, reason: collision with root package name */
    public C0298z f3435c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0282r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        U0.a(context);
        T0.a(this, getContext());
        C0280q c0280q = new C0280q(this);
        this.f3433a = c0280q;
        c0280q.d(attributeSet, i);
        C0249a0 c0249a0 = new C0249a0(this);
        this.f3434b = c0249a0;
        c0249a0.f(attributeSet, i);
        c0249a0.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0298z getEmojiTextViewHelper() {
        if (this.f3435c == null) {
            this.f3435c = new C0298z(this);
        }
        return this.f3435c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0280q c0280q = this.f3433a;
        if (c0280q != null) {
            c0280q.a();
        }
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 != null) {
            c0249a0.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (j1.f3385c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 != null) {
            return Math.round(c0249a0.i.f3378e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (j1.f3385c) {
            return super.getAutoSizeMinTextSize();
        }
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 != null) {
            return Math.round(c0249a0.i.f3377d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (j1.f3385c) {
            return super.getAutoSizeStepGranularity();
        }
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 != null) {
            return Math.round(c0249a0.i.f3376c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (j1.f3385c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0249a0 c0249a0 = this.f3434b;
        return c0249a0 != null ? c0249a0.i.f3379f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (j1.f3385c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 != null) {
            return c0249a0.i.f3374a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f727a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0280q c0280q = this.f3433a;
        if (c0280q != null) {
            return c0280q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0280q c0280q = this.f3433a;
        if (c0280q != null) {
            return c0280q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3434b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3434b.e();
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
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 == null || j1.f3385c) {
            return;
        }
        c0249a0.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 == null || j1.f3385c) {
            return;
        }
        C0267j0 c0267j0 = c0249a0.i;
        if (c0267j0.f()) {
            c0267j0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (j1.f3385c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 != null) {
            c0249a0.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (j1.f3385c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 != null) {
            c0249a0.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (j1.f3385c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 != null) {
            c0249a0.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0280q c0280q = this.f3433a;
        if (c0280q != null) {
            c0280q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0280q c0280q = this.f3433a;
        if (c0280q != null) {
            c0280q.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q1.d.b0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q1.l) getEmojiTextViewHelper().f3489b.f67b).y(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 != null) {
            c0249a0.f3323a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0280q c0280q = this.f3433a;
        if (c0280q != null) {
            c0280q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0280q c0280q = this.f3433a;
        if (c0280q != null) {
            c0280q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0249a0 c0249a0 = this.f3434b;
        c0249a0.l(colorStateList);
        c0249a0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0249a0 c0249a0 = this.f3434b;
        c0249a0.m(mode);
        c0249a0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 != null) {
            c0249a0.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = j1.f3385c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        C0249a0 c0249a0 = this.f3434b;
        if (c0249a0 == null || z2) {
            return;
        }
        C0267j0 c0267j0 = c0249a0.i;
        if (c0267j0.f()) {
            return;
        }
        c0267j0.g(i, f2);
    }
}
