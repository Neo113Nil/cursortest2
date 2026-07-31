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
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class o extends Button {

    /* renamed from: d, reason: collision with root package name */
    public final n f4359d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f4360e;

    /* renamed from: f, reason: collision with root package name */
    public v f4361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        w1.a(context);
        v1.a(this, getContext());
        n nVar = new n(this);
        this.f4359d = nVar;
        nVar.d(attributeSet, R.attr.materialButtonStyle);
        f0 f0Var = new f0(this);
        this.f4360e = f0Var;
        f0Var.d(attributeSet, R.attr.materialButtonStyle);
        f0Var.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.materialButtonStyle);
    }

    private v getEmojiTextViewHelper() {
        if (this.f4361f == null) {
            this.f4361f = new v(this);
        }
        return this.f4361f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f4359d;
        if (nVar != null) {
            nVar.a();
        }
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            f0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p2.f4378a) {
            return super.getAutoSizeMaxTextSize();
        }
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            return Math.round(f0Var.i.f4368e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p2.f4378a) {
            return super.getAutoSizeMinTextSize();
        }
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            return Math.round(f0Var.i.f4367d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p2.f4378a) {
            return super.getAutoSizeStepGranularity();
        }
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            return Math.round(f0Var.i.f4366c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p2.f4378a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        f0 f0Var = this.f4360e;
        return f0Var != null ? f0Var.i.f4369f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (p2.f4378a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            return f0Var.i.f4364a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r2.o.v0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.f4359d;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.f4359d;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        x1 x1Var = this.f4360e.f4239h;
        if (x1Var != null) {
            return x1Var.f4452a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        x1 x1Var = this.f4360e.f4239h;
        if (x1Var != null) {
            return x1Var.f4453b;
        }
        return null;
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
    public void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        super.onLayout(z3, i, i8, i9, i10);
        f0 f0Var = this.f4360e;
        if (f0Var == null || p2.f4378a) {
            return;
        }
        f0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        super.onTextChanged(charSequence, i, i8, i9);
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            o0 o0Var = f0Var.i;
            if (p2.f4378a || !o0Var.f()) {
                return;
            }
            o0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        ((s6.a) getEmojiTextViewHelper().f4423b.f1050e).E(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i8, int i9, int i10) {
        if (p2.f4378a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i8, i9, i10);
            return;
        }
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            f0Var.f(i, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (p2.f4378a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            f0Var.g(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (p2.f4378a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            f0Var.h(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f4359d;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        n nVar = this.f4359d;
        if (nVar != null) {
            nVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r2.o.y0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        ((s6.a) getEmojiTextViewHelper().f4423b.f1050e).F(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((s6.a) getEmojiTextViewHelper().f4423b.f1050e).s(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            f0Var.f4232a.setAllCaps(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f4359d;
        if (nVar != null) {
            nVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f4359d;
        if (nVar != null) {
            nVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f0 f0Var = this.f4360e;
        f0Var.i(colorStateList);
        f0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f0 f0Var = this.f4360e;
        f0Var.j(mode);
        f0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            f0Var.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f6) {
        boolean z3 = p2.f4378a;
        if (z3) {
            super.setTextSize(i, f6);
            return;
        }
        f0 f0Var = this.f4360e;
        if (f0Var != null) {
            o0 o0Var = f0Var.i;
            if (z3 || o0Var.f()) {
                return;
            }
            o0Var.g(i, f6);
        }
    }
}
