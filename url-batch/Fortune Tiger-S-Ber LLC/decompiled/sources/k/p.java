package k;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class p extends Button {

    /* renamed from: f, reason: collision with root package name */
    public final b1.b f2617f;
    public final v0 g;
    public v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        p2.a(context);
        o2.a(this, getContext());
        b1.b bVar = new b1.b(this);
        this.f2617f = bVar;
        bVar.l(attributeSet, i4);
        v0 v0Var = new v0(this);
        this.g = v0Var;
        v0Var.f(attributeSet, i4);
        v0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i4);
    }

    private v getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new v(this);
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b1.b bVar = this.f2617f;
        if (bVar != null) {
            bVar.a();
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (e3.c) {
            return super.getAutoSizeMaxTextSize();
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            return Math.round(v0Var.f2676i.f2533e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (e3.c) {
            return super.getAutoSizeMinTextSize();
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            return Math.round(v0Var.f2676i.f2532d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (e3.c) {
            return super.getAutoSizeStepGranularity();
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            return Math.round(v0Var.f2676i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (e3.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v0 v0Var = this.g;
        return v0Var != null ? v0Var.f2676i.f2534f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (e3.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            return v0Var.f2676i.f2530a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof o0.h ? ((o0.h) customSelectionActionModeCallback).f2981a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        b1.b bVar = this.f2617f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b1.b bVar = this.f2617f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
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
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        v0 v0Var = this.g;
        if (v0Var == null || e3.c) {
            return;
        }
        v0Var.f2676i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        v0 v0Var = this.g;
        if (v0Var != null) {
            e1 e1Var = v0Var.f2676i;
            if (e3.c || !e1Var.f()) {
                return;
            }
            e1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (e3.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.i(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (e3.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.j(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (e3.c) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.k(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b1.b bVar = this.f2617f;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        b1.b bVar = this.f2617f;
        if (bVar != null) {
            bVar.o(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l0.g.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((m0.a) getEmojiTextViewHelper().f2670b.f3139f).k(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.f2671a.setAllCaps(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b1.b bVar = this.f2617f;
        if (bVar != null) {
            bVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b1.b bVar = this.f2617f;
        if (bVar != null) {
            bVar.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.g;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.g;
        v0Var.m(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        v0 v0Var = this.g;
        if (v0Var != null) {
            v0Var.g(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f4) {
        boolean z3 = e3.c;
        if (z3) {
            super.setTextSize(i4, f4);
            return;
        }
        v0 v0Var = this.g;
        if (v0Var != null) {
            e1 e1Var = v0Var.f2676i;
            if (z3 || e1Var.f()) {
                return;
            }
            e1Var.g(i4, f4);
        }
    }
}
