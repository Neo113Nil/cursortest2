package z0;

import A1.j;
import D.k;
import F0.m;
import M.X;
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
import com.winfour.neondrop.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.r;
import n0.C0247b;
import n0.C0249d;
import n0.C0250e;
import n0.f;
import q0.AbstractC0257a;
import z1.d;
import z1.l;

/* loaded from: classes.dex */
public final class c extends r {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4327e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f4328f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4329g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4330j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4331k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4332l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4333m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4334n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f4335o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f4336p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f4337q;

    /* renamed from: r, reason: collision with root package name */
    public int f4338r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f4339s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4340t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f4341u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4342v;

    /* renamed from: w, reason: collision with root package name */
    public final f f4343w;

    /* renamed from: x, reason: collision with root package name */
    public final C0325a f4344x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4325y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4326z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f4323A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f4324B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public c(Context context, AttributeSet attributeSet) {
        super(Q0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4327e = new LinkedHashSet();
        this.f4328f = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = D.r.f146a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f3241a = a2;
        a2.setCallback(fVar.f3240f);
        new C0250e(fVar.f3241a.getConstantState());
        this.f4343w = fVar;
        this.f4344x = new C0325a(this);
        Context context3 = getContext();
        this.f4332l = S.c.a(this);
        this.f4335o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0257a.f3392p;
        m.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        m.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        j jVar = new j(context3, obtainStyledAttributes);
        this.f4333m = jVar.j(2);
        if (this.f4332l != null && l.l0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f4324B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4332l = l.F(context3, R.drawable.mtrl_checkbox_button);
                this.f4334n = true;
                if (this.f4333m == null) {
                    this.f4333m = l.F(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4336p = d.u(context3, jVar, 3);
        this.f4337q = m.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f4330j = obtainStyledAttributes.getBoolean(9, false);
        this.f4331k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        jVar.v();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f4338r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4329g == null) {
            int t2 = d.t(this, R.attr.colorControlActivated);
            int t3 = d.t(this, R.attr.colorError);
            int t4 = d.t(this, R.attr.colorSurface);
            int t5 = d.t(this, R.attr.colorOnSurface);
            this.f4329g = new ColorStateList(f4323A, new int[]{d.I(t4, t3, 1.0f), d.I(t4, t2, 1.0f), d.I(t4, t5, 0.54f), d.I(t4, t5, 0.38f), d.I(t4, t5, 0.38f)});
        }
        return this.f4329g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4335o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        X x2;
        Drawable drawable = this.f4332l;
        ColorStateList colorStateList3 = this.f4335o;
        PorterDuff.Mode b2 = S.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                F.a.i(drawable, b2);
            }
        }
        this.f4332l = drawable;
        Drawable drawable2 = this.f4333m;
        ColorStateList colorStateList4 = this.f4336p;
        PorterDuff.Mode mode = this.f4337q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                F.a.i(drawable2, mode);
            }
        }
        this.f4333m = drawable2;
        if (this.f4334n) {
            f fVar = this.f4343w;
            if (fVar != null) {
                Drawable drawable3 = fVar.f3241a;
                C0325a c0325a = this.f4344x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0325a.f4320a == null) {
                        c0325a.f4320a = new C0247b(c0325a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0325a.f4320a);
                }
                ArrayList arrayList = fVar.f3239e;
                C0249d c0249d = fVar.f3237b;
                if (arrayList != null && c0325a != null) {
                    arrayList.remove(c0325a);
                    if (fVar.f3239e.size() == 0 && (x2 = fVar.d) != null) {
                        c0249d.f3234b.removeListener(x2);
                        fVar.d = null;
                    }
                }
                Drawable drawable4 = fVar.f3241a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0325a.f4320a == null) {
                        c0325a.f4320a = new C0247b(c0325a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0325a.f4320a);
                } else if (c0325a != null) {
                    if (fVar.f3239e == null) {
                        fVar.f3239e = new ArrayList();
                    }
                    if (!fVar.f3239e.contains(c0325a)) {
                        fVar.f3239e.add(c0325a);
                        if (fVar.d == null) {
                            fVar.d = new X(4, fVar);
                        }
                        c0249d.f3234b.addListener(fVar.d);
                    }
                }
            }
            Drawable drawable5 = this.f4332l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f4332l).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f4332l;
        if (drawable6 != null && (colorStateList2 = this.f4335o) != null) {
            F.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f4333m;
        if (drawable7 != null && (colorStateList = this.f4336p) != null) {
            F.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f4332l;
        Drawable drawable9 = this.f4333m;
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
        return this.f4332l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4333m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4336p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4337q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4335o;
    }

    public int getCheckedState() {
        return this.f4338r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4331k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4338r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f4335o == null && this.f4336p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4325y);
        }
        if (this.f4330j) {
            View.mergeDrawableStates(onCreateDrawableState, f4326z);
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
        this.f4339s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = S.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (m.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a2.getBounds();
            F.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f4330j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4331k));
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
        setCheckedState(bVar.f4322a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4322a = getCheckedState();
        return bVar;
    }

    @Override // l.r, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(l.F(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4333m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(l.F(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4336p == colorStateList) {
            return;
        }
        this.f4336p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4337q == mode) {
            return;
        }
        this.f4337q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4335o == colorStateList) {
            return;
        }
        this.f4335o = colorStateList;
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
        if (this.f4338r != i) {
            this.f4338r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4341u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4340t) {
                return;
            }
            this.f4340t = true;
            LinkedHashSet linkedHashSet = this.f4328f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4338r != 2 && (onCheckedChangeListener = this.f4342v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4340t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4331k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4330j == z2) {
            return;
        }
        this.f4330j = z2;
        refreshDrawableState();
        Iterator it = this.f4327e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4342v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4341u = charSequence;
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
            S.b.c(this, getMaterialThemeColorsTintList());
        } else {
            S.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // l.r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4332l = drawable;
        this.f4334n = false;
        a();
    }
}
