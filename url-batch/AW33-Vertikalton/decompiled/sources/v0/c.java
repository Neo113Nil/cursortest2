package v0;

import B.k;
import B.r;
import B0.o;
import K.C0012l;
import K.Z;
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
import com.luckycalc.loanfinance.R;
import i1.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C0258s;
import l0.e;
import l0.f;
import n0.AbstractC0278a;
import q1.d;
import q1.l;

/* loaded from: classes.dex */
public final class c extends C0258s {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4037e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f4038f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4039g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4040j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4041k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4042l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4043m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4044n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f4045o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f4046p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f4047q;

    /* renamed from: r, reason: collision with root package name */
    public int f4048r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f4049s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4050t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f4051u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4052v;

    /* renamed from: w, reason: collision with root package name */
    public final f f4053w;

    /* renamed from: x, reason: collision with root package name */
    public final a f4054x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4035y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4036z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f4033A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f4034B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public c(Context context, AttributeSet attributeSet) {
        super(M0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4037e = new LinkedHashSet();
        this.f4038f = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f43a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f3118a = a2;
        a2.setCallback(fVar.f3117f);
        new e(fVar.f3118a.getConstantState());
        this.f4053w = fVar;
        this.f4054x = new a(this);
        Context context3 = getContext();
        this.f4042l = Q.c.a(this);
        this.f4045o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0278a.f3288n;
        o.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        o.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0012l c0012l = new C0012l(context3, obtainStyledAttributes);
        this.f4043m = c0012l.h(2);
        if (this.f4042l != null && l.P(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f4034B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4042l = l.v(context3, R.drawable.mtrl_checkbox_button);
                this.f4044n = true;
                if (this.f4043m == null) {
                    this.f4043m = l.v(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4046p = d.z(context3, c0012l, 3);
        this.f4047q = o.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f4040j = obtainStyledAttributes.getBoolean(9, false);
        this.f4041k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0012l.t();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f4048r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4039g == null) {
            int i = s.i(this, R.attr.colorControlActivated);
            int i2 = s.i(this, R.attr.colorError);
            int i3 = s.i(this, R.attr.colorSurface);
            int i4 = s.i(this, R.attr.colorOnSurface);
            this.f4039g = new ColorStateList(f4033A, new int[]{s.n(i3, i2, 1.0f), s.n(i3, i, 1.0f), s.n(i3, i4, 0.54f), s.n(i3, i4, 0.38f), s.n(i3, i4, 0.38f)});
        }
        return this.f4039g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4045o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Z z2;
        Drawable drawable = this.f4042l;
        ColorStateList colorStateList3 = this.f4045o;
        PorterDuff.Mode b2 = Q.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                D.a.i(drawable, b2);
            }
        }
        this.f4042l = drawable;
        Drawable drawable2 = this.f4043m;
        ColorStateList colorStateList4 = this.f4046p;
        PorterDuff.Mode mode = this.f4047q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f4043m = drawable2;
        if (this.f4044n) {
            f fVar = this.f4053w;
            if (fVar != null) {
                Drawable drawable3 = fVar.f3118a;
                a aVar = this.f4054x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f4030a == null) {
                        aVar.f4030a = new l0.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f4030a);
                }
                ArrayList arrayList = fVar.f3116e;
                l0.d dVar = fVar.f3114b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.f3116e.size() == 0 && (z2 = fVar.d) != null) {
                        dVar.f3111b.removeListener(z2);
                        fVar.d = null;
                    }
                }
                Drawable drawable4 = fVar.f3118a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f4030a == null) {
                        aVar.f4030a = new l0.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f4030a);
                } else if (aVar != null) {
                    if (fVar.f3116e == null) {
                        fVar.f3116e = new ArrayList();
                    }
                    if (!fVar.f3116e.contains(aVar)) {
                        fVar.f3116e.add(aVar);
                        if (fVar.d == null) {
                            fVar.d = new Z(4, fVar);
                        }
                        dVar.f3111b.addListener(fVar.d);
                    }
                }
            }
            Drawable drawable5 = this.f4042l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f4042l).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f4042l;
        if (drawable6 != null && (colorStateList2 = this.f4045o) != null) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f4043m;
        if (drawable7 != null && (colorStateList = this.f4046p) != null) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f4042l;
        Drawable drawable9 = this.f4043m;
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
        return this.f4042l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4043m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4046p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4047q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4045o;
    }

    public int getCheckedState() {
        return this.f4048r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4041k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4048r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f4045o == null && this.f4046p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4035y);
        }
        if (this.f4040j) {
            View.mergeDrawableStates(onCreateDrawableState, f4036z);
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
        this.f4049s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = Q.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (o.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
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
        if (accessibilityNodeInfo != null && this.f4040j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4041k));
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
        setCheckedState(bVar.f4032a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4032a = getCheckedState();
        return bVar;
    }

    @Override // l.C0258s, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(l.v(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4043m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(l.v(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4046p == colorStateList) {
            return;
        }
        this.f4046p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4047q == mode) {
            return;
        }
        this.f4047q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4045o == colorStateList) {
            return;
        }
        this.f4045o = colorStateList;
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
        if (this.f4048r != i) {
            this.f4048r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4051u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4050t) {
                return;
            }
            this.f4050t = true;
            LinkedHashSet linkedHashSet = this.f4038f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4048r != 2 && (onCheckedChangeListener = this.f4052v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4050t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4041k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4040j == z2) {
            return;
        }
        this.f4040j = z2;
        refreshDrawableState();
        Iterator it = this.f4037e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4052v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4051u = charSequence;
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

    @Override // l.C0258s, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4042l = drawable;
        this.f4044n = false;
        a();
    }
}
