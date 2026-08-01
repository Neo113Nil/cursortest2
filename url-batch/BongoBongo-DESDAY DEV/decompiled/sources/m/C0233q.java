package m;

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

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0233q extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f3166a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3167b;

    /* renamed from: c, reason: collision with root package name */
    public C0247x f3168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0233q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Y0.a(context);
        X0.a(this, getContext());
        C0231p c0231p = new C0231p(this);
        this.f3166a = c0231p;
        c0231p.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f3167b = y2;
        y2.f(attributeSet, i);
        y2.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private C0247x getEmojiTextViewHelper() {
        if (this.f3168c == null) {
            this.f3168c = new C0247x(this);
        }
        return this.f3168c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f3166a;
        if (c0231p != null) {
            c0231p.a();
        }
        Y y2 = this.f3167b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (o1.f3160c) {
            return super.getAutoSizeMaxTextSize();
        }
        Y y2 = this.f3167b;
        if (y2 != null) {
            return Math.round(y2.i.f3099e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (o1.f3160c) {
            return super.getAutoSizeMinTextSize();
        }
        Y y2 = this.f3167b;
        if (y2 != null) {
            return Math.round(y2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (o1.f3160c) {
            return super.getAutoSizeStepGranularity();
        }
        Y y2 = this.f3167b;
        if (y2 != null) {
            return Math.round(y2.i.f3098c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (o1.f3160c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Y y2 = this.f3167b;
        return y2 != null ? y2.i.f3100f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (o1.f3160c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Y y2 = this.f3167b;
        if (y2 != null) {
            return y2.i.f3096a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return A1.m.n0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f3166a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f3166a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3167b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3167b.e();
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
        Y y2 = this.f3167b;
        if (y2 == null || o1.f3160c) {
            return;
        }
        y2.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Y y2 = this.f3167b;
        if (y2 == null || o1.f3160c) {
            return;
        }
        C0218i0 c0218i0 = y2.i;
        if (c0218i0.f()) {
            c0218i0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (o1.f3160c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Y y2 = this.f3167b;
        if (y2 != null) {
            y2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (o1.f3160c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Y y2 = this.f3167b;
        if (y2 != null) {
            y2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (o1.f3160c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Y y2 = this.f3167b;
        if (y2 != null) {
            y2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f3166a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f3166a;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A1.m.p0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        Y y2 = this.f3167b;
        if (y2 != null) {
            y2.f3050a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f3166a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f3166a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3167b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3167b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3167b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = o1.f3160c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Y y2 = this.f3167b;
        if (y2 == null || z2) {
            return;
        }
        C0218i0 c0218i0 = y2.i;
        if (c0218i0.f()) {
            return;
        }
        c0218i0.g(i, f2);
    }
}
