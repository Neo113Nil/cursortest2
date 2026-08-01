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
public class C0237r extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0235q f3125a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f3126b;

    /* renamed from: c, reason: collision with root package name */
    public C0251y f3127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0237r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        S0.a(this, getContext());
        C0235q c0235q = new C0235q(this);
        this.f3125a = c0235q;
        c0235q.d(attributeSet, i);
        Z z2 = new Z(this);
        this.f3126b = z2;
        z2.f(attributeSet, i);
        z2.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0251y getEmojiTextViewHelper() {
        if (this.f3127c == null) {
            this.f3127c = new C0251y(this);
        }
        return this.f3127c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0235q c0235q = this.f3125a;
        if (c0235q != null) {
            c0235q.a();
        }
        Z z2 = this.f3126b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (i1.f3082c) {
            return super.getAutoSizeMaxTextSize();
        }
        Z z2 = this.f3126b;
        if (z2 != null) {
            return Math.round(z2.i.f3075e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (i1.f3082c) {
            return super.getAutoSizeMinTextSize();
        }
        Z z2 = this.f3126b;
        if (z2 != null) {
            return Math.round(z2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (i1.f3082c) {
            return super.getAutoSizeStepGranularity();
        }
        Z z2 = this.f3126b;
        if (z2 != null) {
            return Math.round(z2.i.f3074c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (i1.f3082c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Z z2 = this.f3126b;
        return z2 != null ? z2.i.f3076f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (i1.f3082c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Z z2 = this.f3126b;
        if (z2 != null) {
            return z2.i.f3072a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f683a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0235q c0235q = this.f3125a;
        if (c0235q != null) {
            return c0235q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0235q c0235q = this.f3125a;
        if (c0235q != null) {
            return c0235q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3126b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3126b.e();
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
        Z z3 = this.f3126b;
        if (z3 == null || i1.f3082c) {
            return;
        }
        z3.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Z z2 = this.f3126b;
        if (z2 == null || i1.f3082c) {
            return;
        }
        C0220i0 c0220i0 = z2.i;
        if (c0220i0.f()) {
            c0220i0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (i1.f3082c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Z z2 = this.f3126b;
        if (z2 != null) {
            z2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (i1.f3082c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Z z2 = this.f3126b;
        if (z2 != null) {
            z2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (i1.f3082c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Z z2 = this.f3126b;
        if (z2 != null) {
            z2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0235q c0235q = this.f3125a;
        if (c0235q != null) {
            c0235q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0235q c0235q = this.f3125a;
        if (c0235q != null) {
            c0235q.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(s1.l.j0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((s1.d) getEmojiTextViewHelper().f3169b.f64b).B(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        Z z3 = this.f3126b;
        if (z3 != null) {
            z3.f3023a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0235q c0235q = this.f3125a;
        if (c0235q != null) {
            c0235q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0235q c0235q = this.f3125a;
        if (c0235q != null) {
            c0235q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f3126b;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f3126b;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Z z2 = this.f3126b;
        if (z2 != null) {
            z2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = i1.f3082c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Z z3 = this.f3126b;
        if (z3 == null || z2) {
            return;
        }
        C0220i0 c0220i0 = z3.i;
        if (c0220i0.f()) {
            return;
        }
        c0220i0.g(i, f2);
    }
}
