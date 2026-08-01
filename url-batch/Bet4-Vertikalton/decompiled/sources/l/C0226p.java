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
import g0.C0116b;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0226p extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0116b f2965a;

    /* renamed from: b, reason: collision with root package name */
    public final X f2966b;

    /* renamed from: c, reason: collision with root package name */
    public C0240w f2967c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0226p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        S0.a(context);
        R0.a(this, getContext());
        C0116b c0116b = new C0116b(this);
        this.f2965a = c0116b;
        c0116b.k(attributeSet, i);
        X x2 = new X(this);
        this.f2966b = x2;
        x2.f(attributeSet, i);
        x2.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0240w getEmojiTextViewHelper() {
        if (this.f2967c == null) {
            this.f2967c = new C0240w(this);
        }
        return this.f2967c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0116b c0116b = this.f2965a;
        if (c0116b != null) {
            c0116b.a();
        }
        X x2 = this.f2966b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (i1.f2931c) {
            return super.getAutoSizeMaxTextSize();
        }
        X x2 = this.f2966b;
        if (x2 != null) {
            return Math.round(x2.i.f2919e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (i1.f2931c) {
            return super.getAutoSizeMinTextSize();
        }
        X x2 = this.f2966b;
        if (x2 != null) {
            return Math.round(x2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (i1.f2931c) {
            return super.getAutoSizeStepGranularity();
        }
        X x2 = this.f2966b;
        if (x2 != null) {
            return Math.round(x2.i.f2918c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (i1.f2931c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        X x2 = this.f2966b;
        return x2 != null ? x2.i.f2920f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (i1.f2931c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        X x2 = this.f2966b;
        if (x2 != null) {
            return x2.i.f2916a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f743a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0116b c0116b = this.f2965a;
        if (c0116b != null) {
            return c0116b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0116b c0116b = this.f2965a;
        if (c0116b != null) {
            return c0116b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2966b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2966b.e();
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
        X x2 = this.f2966b;
        if (x2 == null || i1.f2931c) {
            return;
        }
        x2.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        X x2 = this.f2966b;
        if (x2 == null || i1.f2931c) {
            return;
        }
        C0211h0 c0211h0 = x2.i;
        if (c0211h0.f()) {
            c0211h0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (i1.f2931c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        X x2 = this.f2966b;
        if (x2 != null) {
            x2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (i1.f2931c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        X x2 = this.f2966b;
        if (x2 != null) {
            x2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (i1.f2931c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        X x2 = this.f2966b;
        if (x2 != null) {
            x2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0116b c0116b = this.f2965a;
        if (c0116b != null) {
            c0116b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0116b c0116b = this.f2965a;
        if (c0116b != null) {
            c0116b.n(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w1.d.w0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((w1.d) getEmojiTextViewHelper().f3009b.f115b).D(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        X x2 = this.f2966b;
        if (x2 != null) {
            x2.f2865a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0116b c0116b = this.f2965a;
        if (c0116b != null) {
            c0116b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0116b c0116b = this.f2965a;
        if (c0116b != null) {
            c0116b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f2966b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f2966b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f2966b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = i1.f2931c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        X x2 = this.f2966b;
        if (x2 == null || z2) {
            return;
        }
        C0211h0 c0211h0 = x2.i;
        if (c0211h0.f()) {
            return;
        }
        c0211h0.g(i, f2);
    }
}
