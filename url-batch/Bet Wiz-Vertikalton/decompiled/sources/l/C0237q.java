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
import com.neonpulse.gridlogic.R;

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0237q extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0235p f3031a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3032b;

    /* renamed from: c, reason: collision with root package name */
    public C0251x f3033c;

    public C0237q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C0251x getEmojiTextViewHelper() {
        if (this.f3033c == null) {
            this.f3033c = new C0251x(this);
        }
        return this.f3033c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0235p c0235p = this.f3031a;
        if (c0235p != null) {
            c0235p.a();
        }
        Y y2 = this.f3032b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (i1.f2992c) {
            return super.getAutoSizeMaxTextSize();
        }
        Y y2 = this.f3032b;
        if (y2 != null) {
            return Math.round(y2.i.f2980e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (i1.f2992c) {
            return super.getAutoSizeMinTextSize();
        }
        Y y2 = this.f3032b;
        if (y2 != null) {
            return Math.round(y2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (i1.f2992c) {
            return super.getAutoSizeStepGranularity();
        }
        Y y2 = this.f3032b;
        if (y2 != null) {
            return Math.round(y2.i.f2979c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (i1.f2992c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Y y2 = this.f3032b;
        return y2 != null ? y2.i.f2981f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (i1.f2992c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Y y2 = this.f3032b;
        if (y2 != null) {
            return y2.i.f2977a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f722a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0235p c0235p = this.f3031a;
        if (c0235p != null) {
            return c0235p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0235p c0235p = this.f3031a;
        if (c0235p != null) {
            return c0235p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3032b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3032b.e();
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
        Y y2 = this.f3032b;
        if (y2 == null || i1.f2992c) {
            return;
        }
        y2.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Y y2 = this.f3032b;
        if (y2 == null || i1.f2992c) {
            return;
        }
        C0220h0 c0220h0 = y2.i;
        if (c0220h0.f()) {
            c0220h0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (i1.f2992c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Y y2 = this.f3032b;
        if (y2 != null) {
            y2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (i1.f2992c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Y y2 = this.f3032b;
        if (y2 != null) {
            y2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (i1.f2992c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Y y2 = this.f3032b;
        if (y2 != null) {
            y2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0235p c0235p = this.f3031a;
        if (c0235p != null) {
            c0235p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0235p c0235p = this.f3031a;
        if (c0235p != null) {
            c0235p.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x1.d.n0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((x1.l) getEmojiTextViewHelper().f3075b.f67b).D(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        Y y2 = this.f3032b;
        if (y2 != null) {
            y2.f2928a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0235p c0235p = this.f3031a;
        if (c0235p != null) {
            c0235p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0235p c0235p = this.f3031a;
        if (c0235p != null) {
            c0235p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3032b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3032b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3032b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = i1.f2992c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Y y2 = this.f3032b;
        if (y2 == null || z2) {
            return;
        }
        C0220h0 c0220h0 = y2.i;
        if (c0220h0.f()) {
            return;
        }
        c0220h0.g(i, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0237q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        S0.a(context);
        R0.a(this, getContext());
        C0235p c0235p = new C0235p(this);
        this.f3031a = c0235p;
        c0235p.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f3032b = y2;
        y2.f(attributeSet, i);
        y2.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }
}
