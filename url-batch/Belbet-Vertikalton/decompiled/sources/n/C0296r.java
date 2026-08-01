package n;

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

/* renamed from: n.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0296r extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0294q f3698a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3699b;

    /* renamed from: c, reason: collision with root package name */
    public C0308x f3700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0296r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        X0.a(context);
        W0.a(this, getContext());
        C0294q c0294q = new C0294q(this);
        this.f3698a = c0294q;
        c0294q.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f3699b = y2;
        y2.f(attributeSet, i);
        y2.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private C0308x getEmojiTextViewHelper() {
        if (this.f3700c == null) {
            this.f3700c = new C0308x(this);
        }
        return this.f3700c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0294q c0294q = this.f3698a;
        if (c0294q != null) {
            c0294q.a();
        }
        Y y2 = this.f3699b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (n1.f3685c) {
            return super.getAutoSizeMaxTextSize();
        }
        Y y2 = this.f3699b;
        if (y2 != null) {
            return Math.round(y2.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (n1.f3685c) {
            return super.getAutoSizeMinTextSize();
        }
        Y y2 = this.f3699b;
        if (y2 != null) {
            return Math.round(y2.i.f3625d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (n1.f3685c) {
            return super.getAutoSizeStepGranularity();
        }
        Y y2 = this.f3699b;
        if (y2 != null) {
            return Math.round(y2.i.f3624c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (n1.f3685c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Y y2 = this.f3699b;
        return y2 != null ? y2.i.f3626f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (n1.f3685c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Y y2 = this.f3699b;
        if (y2 != null) {
            return y2.i.f3622a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return H1.l.h0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0294q c0294q = this.f3698a;
        if (c0294q != null) {
            return c0294q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0294q c0294q = this.f3698a;
        if (c0294q != null) {
            return c0294q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3699b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3699b.e();
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
        Y y2 = this.f3699b;
        if (y2 == null || n1.f3685c) {
            return;
        }
        y2.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Y y2 = this.f3699b;
        if (y2 == null || n1.f3685c) {
            return;
        }
        C0277h0 c0277h0 = y2.i;
        if (c0277h0.f()) {
            c0277h0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (n1.f3685c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Y y2 = this.f3699b;
        if (y2 != null) {
            y2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (n1.f3685c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Y y2 = this.f3699b;
        if (y2 != null) {
            y2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (n1.f3685c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Y y2 = this.f3699b;
        if (y2 != null) {
            y2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0294q c0294q = this.f3698a;
        if (c0294q != null) {
            c0294q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0294q c0294q = this.f3698a;
        if (c0294q != null) {
            c0294q.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H1.l.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        Y y2 = this.f3699b;
        if (y2 != null) {
            y2.f3579a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0294q c0294q = this.f3698a;
        if (c0294q != null) {
            c0294q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0294q c0294q = this.f3698a;
        if (c0294q != null) {
            c0294q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3699b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3699b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3699b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = n1.f3685c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Y y2 = this.f3699b;
        if (y2 == null || z2) {
            return;
        }
        C0277h0 c0277h0 = y2.i;
        if (c0277h0.f()) {
            return;
        }
        c0277h0.g(i, f2);
    }
}
