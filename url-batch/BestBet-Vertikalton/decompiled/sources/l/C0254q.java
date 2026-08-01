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
public class C0254q extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0252p f3448a;

    /* renamed from: b, reason: collision with root package name */
    public final W f3449b;

    /* renamed from: c, reason: collision with root package name */
    public C0266w f3450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0254q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        Q0.a(this, getContext());
        C0252p c0252p = new C0252p(this);
        this.f3448a = c0252p;
        c0252p.d(attributeSet, i);
        W w2 = new W(this);
        this.f3449b = w2;
        w2.f(attributeSet, i);
        w2.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0266w getEmojiTextViewHelper() {
        if (this.f3450c == null) {
            this.f3450c = new C0266w(this);
        }
        return this.f3450c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0252p c0252p = this.f3448a;
        if (c0252p != null) {
            c0252p.a();
        }
        W w2 = this.f3449b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (h1.f3405c) {
            return super.getAutoSizeMaxTextSize();
        }
        W w2 = this.f3449b;
        if (w2 != null) {
            return Math.round(w2.i.f3394e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (h1.f3405c) {
            return super.getAutoSizeMinTextSize();
        }
        W w2 = this.f3449b;
        if (w2 != null) {
            return Math.round(w2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (h1.f3405c) {
            return super.getAutoSizeStepGranularity();
        }
        W w2 = this.f3449b;
        if (w2 != null) {
            return Math.round(w2.i.f3393c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (h1.f3405c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        W w2 = this.f3449b;
        return w2 != null ? w2.i.f3395f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (h1.f3405c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        W w2 = this.f3449b;
        if (w2 != null) {
            return w2.i.f3391a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.q ? ((Q.q) customSelectionActionModeCallback).f883a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0252p c0252p = this.f3448a;
        if (c0252p != null) {
            return c0252p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0252p c0252p = this.f3448a;
        if (c0252p != null) {
            return c0252p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3449b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3449b.e();
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
        W w2 = this.f3449b;
        if (w2 == null || h1.f3405c) {
            return;
        }
        w2.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        W w2 = this.f3449b;
        if (w2 == null || h1.f3405c) {
            return;
        }
        C0235g0 c0235g0 = w2.i;
        if (c0235g0.f()) {
            c0235g0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (h1.f3405c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        W w2 = this.f3449b;
        if (w2 != null) {
            w2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (h1.f3405c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        W w2 = this.f3449b;
        if (w2 != null) {
            w2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (h1.f3405c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        W w2 = this.f3449b;
        if (w2 != null) {
            w2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0252p c0252p = this.f3448a;
        if (c0252p != null) {
            c0252p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0252p c0252p = this.f3448a;
        if (c0252p != null) {
            c0252p.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H1.d.x0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((H1.l) getEmojiTextViewHelper().f3485b.f6b).H(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        W w2 = this.f3449b;
        if (w2 != null) {
            w2.f3342a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0252p c0252p = this.f3448a;
        if (c0252p != null) {
            c0252p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0252p c0252p = this.f3448a;
        if (c0252p != null) {
            c0252p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w2 = this.f3449b;
        w2.l(colorStateList);
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w2 = this.f3449b;
        w2.m(mode);
        w2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        W w2 = this.f3449b;
        if (w2 != null) {
            w2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = h1.f3405c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        W w2 = this.f3449b;
        if (w2 == null || z2) {
            return;
        }
        C0235g0 c0235g0 = w2.i;
        if (c0235g0.f()) {
            return;
        }
        c0235g0.g(i, f2);
    }
}
