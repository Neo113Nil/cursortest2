package x0;

import B.k;
import B.r;
import D0.n;
import K.C0003b0;
import K.C0014l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.playbag.tripgear.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C0228q;
import m.C0260a;
import m0.C0262b;
import m0.C0264d;
import m0.C0265e;
import m0.C0266f;
import p0.AbstractC0282a;
import w1.d;
import w1.l;

/* loaded from: classes.dex */
public final class c extends C0228q {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4216e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f4217f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4218g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4219j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4220k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4221l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4222m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4223n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f4224o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f4225p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f4226q;

    /* renamed from: r, reason: collision with root package name */
    public int f4227r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f4228s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4229t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f4230u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4231v;

    /* renamed from: w, reason: collision with root package name */
    public final C0266f f4232w;

    /* renamed from: x, reason: collision with root package name */
    public final C0314a f4233x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4214y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4215z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f4212A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f4213B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public c(Context context, AttributeSet attributeSet) {
        super(O0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4216e = new LinkedHashSet();
        this.f4217f = new LinkedHashSet();
        Context context2 = getContext();
        C0266f c0266f = new C0266f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f44a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0266f.f3139a = a2;
        a2.setCallback(c0266f.f3138f);
        new C0265e(c0266f.f3139a.getConstantState());
        this.f4232w = c0266f;
        this.f4233x = new C0314a(this);
        Context context3 = getContext();
        this.f4221l = Q.c.a(this);
        this.f4224o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0282a.f3440n;
        n.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        n.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0014l c0014l = new C0014l(context3, obtainStyledAttributes);
        this.f4222m = c0014l.c(2);
        if (this.f4221l != null && d.f0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f4213B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4221l = l.z(context3, R.drawable.mtrl_checkbox_button);
                this.f4223n = true;
                if (this.f4222m == null) {
                    this.f4222m = l.z(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4225p = l.u(context3, c0014l, 3);
        this.f4226q = n.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f4219j = obtainStyledAttributes.getBoolean(9, false);
        this.f4220k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0014l.k();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f4227r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4218g == null) {
            int j2 = C0260a.j(this, R.attr.colorControlActivated);
            int j3 = C0260a.j(this, R.attr.colorError);
            int j4 = C0260a.j(this, R.attr.colorSurface);
            int j5 = C0260a.j(this, R.attr.colorOnSurface);
            this.f4218g = new ColorStateList(f4212A, new int[]{C0260a.m(j4, j3, 1.0f), C0260a.m(j4, j2, 1.0f), C0260a.m(j4, j5, 0.54f), C0260a.m(j4, j5, 0.38f), C0260a.m(j4, j5, 0.38f)});
        }
        return this.f4218g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4224o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0003b0 c0003b0;
        Drawable drawable = this.f4221l;
        ColorStateList colorStateList3 = this.f4224o;
        PorterDuff.Mode b2 = Q.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                D.a.i(drawable, b2);
            }
        }
        this.f4221l = drawable;
        Drawable drawable2 = this.f4222m;
        ColorStateList colorStateList4 = this.f4225p;
        PorterDuff.Mode mode = this.f4226q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f4222m = drawable2;
        if (this.f4223n) {
            C0266f c0266f = this.f4232w;
            if (c0266f != null) {
                Drawable drawable3 = c0266f.f3139a;
                C0314a c0314a = this.f4233x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0314a.f4209a == null) {
                        c0314a.f4209a = new C0262b(c0314a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0314a.f4209a);
                }
                ArrayList arrayList = c0266f.f3137e;
                C0264d c0264d = c0266f.f3135b;
                if (arrayList != null && c0314a != null) {
                    arrayList.remove(c0314a);
                    if (c0266f.f3137e.size() == 0 && (c0003b0 = c0266f.d) != null) {
                        c0264d.f3132b.removeListener(c0003b0);
                        c0266f.d = null;
                    }
                }
                Drawable drawable4 = c0266f.f3139a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0314a.f4209a == null) {
                        c0314a.f4209a = new C0262b(c0314a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0314a.f4209a);
                } else if (c0314a != null) {
                    if (c0266f.f3137e == null) {
                        c0266f.f3137e = new ArrayList();
                    }
                    if (!c0266f.f3137e.contains(c0314a)) {
                        c0266f.f3137e.add(c0314a);
                        if (c0266f.d == null) {
                            c0266f.d = new C0003b0(4, c0266f);
                        }
                        c0264d.f3132b.addListener(c0266f.d);
                    }
                }
            }
            Drawable drawable5 = this.f4221l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0266f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0266f, false);
                ((AnimatedStateListDrawable) this.f4221l).addTransition(R.id.indeterminate, R.id.unchecked, c0266f, false);
            }
        }
        Drawable drawable6 = this.f4221l;
        if (drawable6 != null && (colorStateList2 = this.f4224o) != null) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f4222m;
        if (drawable7 != null && (colorStateList = this.f4225p) != null) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f4221l;
        Drawable drawable9 = this.f4222m;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f4221l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4222m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4225p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4226q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4224o;
    }

    public int getCheckedState() {
        return this.f4227r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4220k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4227r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f4224o == null && this.f4225p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4214y);
        }
        if (this.f4219j) {
            View.mergeDrawableStates(onCreateDrawableState, f4215z);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f4228s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = Q.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (n.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, RecyclerView.f1530C0);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a2.getBounds();
            D.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f4219j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4220k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f4211a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4211a = getCheckedState();
        return bVar;
    }

    @Override // l.C0228q, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(l.z(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4222m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(l.z(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4225p == colorStateList) {
            return;
        }
        this.f4225p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4226q == mode) {
            return;
        }
        this.f4226q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4224o == colorStateList) {
            return;
        }
        this.f4224o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f4227r != i) {
            this.f4227r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4230u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4229t) {
                return;
            }
            this.f4229t = true;
            LinkedHashSet linkedHashSet = this.f4217f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4227r != 2 && (onCheckedChangeListener = this.f4231v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4229t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4220k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4219j == z2) {
            return;
        }
        this.f4219j = z2;
        refreshDrawableState();
        Iterator it = this.f4216e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4231v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4230u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.h = z2;
        if (z2) {
            Q.b.c(this, getMaterialThemeColorsTintList());
        } else {
            Q.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // l.C0228q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4221l = drawable;
        this.f4223n = false;
        a();
    }
}
