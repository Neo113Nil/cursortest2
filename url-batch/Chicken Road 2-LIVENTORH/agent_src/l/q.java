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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class q extends Button {

    /* renamed from: f, reason: collision with root package name */
    public final f1.b f2416f;

    /* renamed from: g, reason: collision with root package name */
    public final y0 f2417g;

    /* renamed from: h, reason: collision with root package name */
    public x f2418h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s2.a(context);
        r2.a(this, getContext());
        f1.b bVar = new f1.b(this);
        this.f2416f = bVar;
        bVar.k(attributeSet, i);
        y0 y0Var = new y0(this);
        this.f2417g = y0Var;
        y0Var.f(attributeSet, i);
        y0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private x getEmojiTextViewHelper() {
        if (this.f2418h == null) {
            this.f2418h = new x(this);
        }
        return this.f2418h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f1.b bVar = this.f2416f;
        if (bVar != null) {
            bVar.a();
        }
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (l3.f2383c) {
            return super.getAutoSizeMaxTextSize();
        }
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            return Math.round(y0Var.i.f2331e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (l3.f2383c) {
            return super.getAutoSizeMinTextSize();
        }
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            return Math.round(y0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (l3.f2383c) {
            return super.getAutoSizeStepGranularity();
        }
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            return Math.round(y0Var.i.f2330c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (l3.f2383c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y0 y0Var = this.f2417g;
        return y0Var != null ? y0Var.i.f2332f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (l3.f2383c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            return y0Var.i.f2328a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.a.q0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f1.b bVar = this.f2416f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f1.b bVar = this.f2416f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2417g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2417g.e();
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
    public void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        y0 y0Var = this.f2417g;
        if (y0Var == null || l3.f2383c) {
            return;
        }
        y0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        super.onTextChanged(charSequence, i, i4, i5);
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            h1 h1Var = y0Var.i;
            if (l3.f2383c || !h1Var.f()) {
                return;
            }
            h1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i4, int i5, int i6) {
        if (l3.f2383c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i5, i6);
            return;
        }
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            y0Var.i(i, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (l3.f2383c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            y0Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (l3.f2383c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            y0Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f1.b bVar = this.f2416f;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f1.b bVar = this.f2416f;
        if (bVar != null) {
            bVar.n(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.a.s0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((t0.d) getEmojiTextViewHelper().f2491b.f3355a).g(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            y0Var.f2509a.setAllCaps(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f1.b bVar = this.f2416f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f1.b bVar = this.f2416f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f2417g;
        y0Var.l(colorStateList);
        y0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f2417g;
        y0Var.m(mode);
        y0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            y0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z3 = l3.f2383c;
        if (z3) {
            super.setTextSize(i, f2);
            return;
        }
        y0 y0Var = this.f2417g;
        if (y0Var != null) {
            h1 h1Var = y0Var.i;
            if (z3 || h1Var.f()) {
                return;
            }
            h1Var.g(i, f2);
        }
    }
}
