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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class o extends Button {

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.datepicker.c f2512f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f2513g;
    public u h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        p2.a(context);
        o2.a(this, getContext());
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(this);
        this.f2512f = cVar;
        cVar.m(attributeSet, i);
        v0 v0Var = new v0(this);
        this.f2513g = v0Var;
        v0Var.f(attributeSet, i);
        v0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private u getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new u(this);
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f2512f;
        if (cVar != null) {
            cVar.a();
        }
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f3.f2450c) {
            return super.getAutoSizeMaxTextSize();
        }
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            return Math.round(v0Var.i.f2437e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f3.f2450c) {
            return super.getAutoSizeMinTextSize();
        }
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            return Math.round(v0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f3.f2450c) {
            return super.getAutoSizeStepGranularity();
        }
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            return Math.round(v0Var.i.f2436c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f3.f2450c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v0 v0Var = this.f2513g;
        return v0Var != null ? v0Var.i.f2438f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (f3.f2450c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            return v0Var.i.f2434a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof r0.g ? ((r0.g) customSelectionActionModeCallback).f3200a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f2512f;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f2512f;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2513g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2513g.e();
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
    public void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        super.onLayout(z4, i, i4, i5, i6);
        v0 v0Var = this.f2513g;
        if (v0Var == null || f3.f2450c) {
            return;
        }
        v0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        super.onTextChanged(charSequence, i, i4, i5);
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            e1 e1Var = v0Var.i;
            if (f3.f2450c || !e1Var.f()) {
                return;
            }
            e1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i4, int i5, int i6) {
        if (f3.f2450c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i5, i6);
            return;
        }
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            v0Var.i(i, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f3.f2450c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            v0Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f3.f2450c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            v0Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f2512f;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        com.google.android.material.datepicker.c cVar = this.f2512f;
        if (cVar != null) {
            cVar.p(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b4.l.k0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((r1.b) getEmojiTextViewHelper().f2571b.f3172a).l(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z4) {
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            v0Var.f2587a.setAllCaps(z4);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f2512f;
        if (cVar != null) {
            cVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f2512f;
        if (cVar != null) {
            cVar.v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f2513g;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f2513g;
        v0Var.m(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            v0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f5) {
        boolean z4 = f3.f2450c;
        if (z4) {
            super.setTextSize(i, f5);
            return;
        }
        v0 v0Var = this.f2513g;
        if (v0Var != null) {
            e1 e1Var = v0Var.i;
            if (z4 || e1Var.f()) {
                return;
            }
            e1Var.g(i, f5);
        }
    }
}
