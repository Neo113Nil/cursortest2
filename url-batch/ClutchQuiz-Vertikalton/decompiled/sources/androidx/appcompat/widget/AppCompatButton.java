package androidx.appcompat.widget;

import A.c;
import Q.r;
import T.d;
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
import com.clutchquizarena.app.R;
import l.C0214g0;
import l.C0231p;
import l.C0245w;
import l.Q0;
import l.R0;
import l.X;
import l.h1;

/* loaded from: classes.dex */
public class AppCompatButton extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0231p f1335a;

    /* renamed from: b, reason: collision with root package name */
    public final X f1336b;

    /* renamed from: c, reason: collision with root package name */
    public C0245w f1337c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C0245w getEmojiTextViewHelper() {
        if (this.f1337c == null) {
            this.f1337c = new C0245w(this);
        }
        return this.f1337c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0231p c0231p = this.f1335a;
        if (c0231p != null) {
            c0231p.a();
        }
        X x2 = this.f1336b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (h1.f2984c) {
            return super.getAutoSizeMaxTextSize();
        }
        X x2 = this.f1336b;
        if (x2 != null) {
            return Math.round(x2.i.f2973e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (h1.f2984c) {
            return super.getAutoSizeMinTextSize();
        }
        X x2 = this.f1336b;
        if (x2 != null) {
            return Math.round(x2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (h1.f2984c) {
            return super.getAutoSizeStepGranularity();
        }
        X x2 = this.f1336b;
        if (x2 != null) {
            return Math.round(x2.i.f2972c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (h1.f2984c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        X x2 = this.f1336b;
        return x2 != null ? x2.i.f2974f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (h1.f2984c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        X x2 = this.f1336b;
        if (x2 != null) {
            return x2.i.f2970a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof r ? ((r) customSelectionActionModeCallback).f632a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231p c0231p = this.f1335a;
        if (c0231p != null) {
            return c0231p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231p c0231p = this.f1335a;
        if (c0231p != null) {
            return c0231p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1336b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1336b.e();
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
        X x2 = this.f1336b;
        if (x2 == null || h1.f2984c) {
            return;
        }
        x2.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        X x2 = this.f1336b;
        if (x2 == null || h1.f2984c) {
            return;
        }
        C0214g0 c0214g0 = x2.i;
        if (c0214g0.f()) {
            c0214g0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (h1.f2984c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        X x2 = this.f1336b;
        if (x2 != null) {
            x2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (h1.f2984c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        X x2 = this.f1336b;
        if (x2 != null) {
            x2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (h1.f2984c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        X x2 = this.f1336b;
        if (x2 != null) {
            x2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231p c0231p = this.f1335a;
        if (c0231p != null) {
            c0231p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231p c0231p = this.f1335a;
        if (c0231p != null) {
            c0231p.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c.L0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((d) getEmojiTextViewHelper().f3066b.f30b).v(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        X x2 = this.f1336b;
        if (x2 != null) {
            x2.f2922a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231p c0231p = this.f1335a;
        if (c0231p != null) {
            c0231p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231p c0231p = this.f1335a;
        if (c0231p != null) {
            c0231p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f1336b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f1336b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f1336b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = h1.f2984c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        X x2 = this.f1336b;
        if (x2 == null || z2) {
            return;
        }
        C0214g0 c0214g0 = x2.i;
        if (c0214g0.f()) {
            return;
        }
        c0214g0.g(i, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        Q0.a(this, getContext());
        C0231p c0231p = new C0231p(this);
        this.f1335a = c0231p;
        c0231p.d(attributeSet, i);
        X x2 = new X(this);
        this.f1336b = x2;
        x2.f(attributeSet, i);
        x2.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }
}
