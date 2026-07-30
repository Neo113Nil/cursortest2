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
import com.icefishing.icefish.ice.fishing.s294s.R;

/* renamed from: n.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728p extends Button {

    /* renamed from: d, reason: collision with root package name */
    public final C0726o f6861d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f6862e;

    /* renamed from: i, reason: collision with root package name */
    public C0739v f6863i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        j1.a(context);
        i1.a(this, getContext());
        C0726o c0726o = new C0726o(this);
        this.f6861d = c0726o;
        c0726o.d(attributeSet, R.attr.buttonStyle);
        Z z7 = new Z(this);
        this.f6862e = z7;
        z7.f(attributeSet, R.attr.buttonStyle);
        z7.b();
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyle);
    }

    private C0739v getEmojiTextViewHelper() {
        if (this.f6863i == null) {
            this.f6863i = new C0739v(this);
        }
        return this.f6863i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0726o c0726o = this.f6861d;
        if (c0726o != null) {
            c0726o.a();
        }
        Z z7 = this.f6862e;
        if (z7 != null) {
            z7.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (z1.f6968b) {
            return super.getAutoSizeMaxTextSize();
        }
        Z z7 = this.f6862e;
        if (z7 != null) {
            return Math.round(z7.f6733i.f6822e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (z1.f6968b) {
            return super.getAutoSizeMinTextSize();
        }
        Z z7 = this.f6862e;
        if (z7 != null) {
            return Math.round(z7.f6733i.f6821d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (z1.f6968b) {
            return super.getAutoSizeStepGranularity();
        }
        Z z7 = this.f6862e;
        if (z7 != null) {
            return Math.round(z7.f6733i.f6820c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (z1.f6968b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Z z7 = this.f6862e;
        return z7 != null ? z7.f6733i.f6823f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (z1.f6968b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Z z7 = this.f6862e;
        if (z7 != null) {
            return z7.f6733i.f6818a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return P0.f.N(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0726o c0726o = this.f6861d;
        if (c0726o != null) {
            return c0726o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0726o c0726o = this.f6861d;
        if (c0726o != null) {
            return c0726o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6862e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6862e.e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        super.onLayout(z7, i2, i5, i7, i8);
        Z z8 = this.f6862e;
        if (z8 == null || z1.f6968b) {
            return;
        }
        z8.f6733i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i7) {
        super.onTextChanged(charSequence, i2, i5, i7);
        Z z7 = this.f6862e;
        if (z7 != null) {
            C0717j0 c0717j0 = z7.f6733i;
            if (z1.f6968b || !c0717j0.f()) {
                return;
            }
            c0717j0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().c(z7);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i5, int i7, int i8) {
        if (z1.f6968b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i5, i7, i8);
            return;
        }
        Z z7 = this.f6862e;
        if (z7 != null) {
            z7.i(i2, i5, i7, i8);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (z1.f6968b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        Z z7 = this.f6862e;
        if (z7 != null) {
            z7.j(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (z1.f6968b) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        Z z7 = this.f6862e;
        if (z7 != null) {
            z7.k(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0726o c0726o = this.f6861d;
        if (c0726o != null) {
            c0726o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0726o c0726o = this.f6861d;
        if (c0726o != null) {
            c0726o.f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(P0.f.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z7) {
        Z z8 = this.f6862e;
        if (z8 != null) {
            z8.f6725a.setAllCaps(z7);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0726o c0726o = this.f6861d;
        if (c0726o != null) {
            c0726o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0726o c0726o = this.f6861d;
        if (c0726o != null) {
            c0726o.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z7 = this.f6862e;
        z7.l(colorStateList);
        z7.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z7 = this.f6862e;
        z7.m(mode);
        z7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        Z z7 = this.f6862e;
        if (z7 != null) {
            z7.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f7) {
        boolean z7 = z1.f6968b;
        if (z7) {
            super.setTextSize(i2, f7);
            return;
        }
        Z z8 = this.f6862e;
        if (z8 != null) {
            C0717j0 c0717j0 = z8.f6733i;
            if (z7 || c0717j0.f()) {
                return;
            }
            c0717j0.g(i2, f7);
        }
    }
}
