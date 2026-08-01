package y1;

import a.y;
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
import androidx.emoji2.text.t;
import com.oriondriftchasers.arordrft.R;
import e0.m;
import e2.o;
import j1.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k1.d;
import k1.e;
import k1.f;
import l.r;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends r {
    public static final int[] D = {R.attr.state_indeterminate};
    public static final int[] E = {R.attr.state_error};
    public static final int[][] F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public CompoundButton.OnCheckedChangeListener A;
    public final f B;
    public final a C;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f3783j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f3784k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3785l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3786m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3787n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3788o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3789p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f3790q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f3791r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3792s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f3793t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f3794u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f3795v;

    /* renamed from: w, reason: collision with root package name */
    public int f3796w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f3797x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3798y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f3799z;

    public c(Context context, AttributeSet attributeSet) {
        super(q2.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f3783j = new LinkedHashSet();
        this.f3784k = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = m.f1158a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f2175f = drawable;
        drawable.setCallback(fVar.f2174k);
        new e(fVar.f2175f.getConstantState());
        this.B = fVar;
        this.C = new a(this);
        Context context3 = getContext();
        this.f3790q = getButtonDrawable();
        this.f3793t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        t g4 = o.g(context3, attributeSet, n1.a.f2825r, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) g4.f356c;
        this.f3791r = g4.n(2);
        if (this.f3790q != null && h.a.b0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == G && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f3790q = h.a.x(context3, R.drawable.mtrl_checkbox_button);
                this.f3792s = true;
                if (this.f3791r == null) {
                    this.f3791r = h.a.x(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f3794u = h.a.u(context3, g4, 3);
        this.f3795v = o.h(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f3786m = typedArray.getBoolean(10, false);
        this.f3787n = typedArray.getBoolean(6, true);
        this.f3788o = typedArray.getBoolean(9, false);
        this.f3789p = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        g4.y();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f3796w;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3785l == null) {
            int A = y.A(this, R.attr.colorControlActivated);
            int A2 = y.A(this, R.attr.colorError);
            int A3 = y.A(this, R.attr.colorSurface);
            int A4 = y.A(this, R.attr.colorOnSurface);
            this.f3785l = new ColorStateList(F, new int[]{y.J(A3, A2, 1.0f), y.J(A3, A, 1.0f), y.J(A3, A4, 0.54f), y.J(A3, A4, 0.38f), y.J(A3, A4, 0.38f)});
        }
        return this.f3785l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f3793t;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        k kVar;
        Drawable drawable = this.f3790q;
        ColorStateList colorStateList3 = this.f3793t;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.f3790q = drawable;
        Drawable drawable2 = this.f3791r;
        ColorStateList colorStateList4 = this.f3794u;
        PorterDuff.Mode mode = this.f3795v;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.f3791r = drawable2;
        if (this.f3792s) {
            f fVar = this.B;
            if (fVar != null) {
                d dVar = fVar.f2171g;
                Drawable drawable3 = fVar.f2175f;
                a aVar = this.C;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f3780a == null) {
                        aVar.f3780a = new k1.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f3780a);
                }
                ArrayList arrayList = fVar.f2173j;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.f2173j.size() == 0 && (kVar = fVar.i) != null) {
                        dVar.f2168b.removeListener(kVar);
                        fVar.i = null;
                    }
                }
                Drawable drawable4 = fVar.f2175f;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f3780a == null) {
                        aVar.f3780a = new k1.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f3780a);
                } else if (aVar != null) {
                    if (fVar.f2173j == null) {
                        fVar.f2173j = new ArrayList();
                    }
                    if (!fVar.f2173j.contains(aVar)) {
                        fVar.f2173j.add(aVar);
                        if (fVar.i == null) {
                            fVar.i = new k(1, fVar);
                        }
                        dVar.f2168b.addListener(fVar.i);
                    }
                }
            }
            Drawable drawable5 = this.f3790q;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f3790q).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f3790q;
        if (drawable6 != null && (colorStateList2 = this.f3793t) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.f3791r;
        if (drawable7 != null && (colorStateList = this.f3794u) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.f3790q;
        Drawable drawable9 = this.f3791r;
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
        return this.f3790q;
    }

    public Drawable getButtonIconDrawable() {
        return this.f3791r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f3794u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f3795v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f3793t;
    }

    public int getCheckedState() {
        return this.f3796w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f3789p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f3796w == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3786m && this.f3793t == null && this.f3794u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (this.f3788o) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i5 = onCreateDrawableState[i4];
            if (i5 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i5 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i4] = 16842912;
                break;
            }
            i4++;
        }
        this.f3797x = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f3787n || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f3788o) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f3789p));
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
        setCheckedState(bVar.f3782f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f3782f = getCheckedState();
        return bVar;
    }

    @Override // l.r, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(h.a.x(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f3791r = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(h.a.x(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f3794u == colorStateList) {
            return;
        }
        this.f3794u = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f3795v == mode) {
            return;
        }
        this.f3795v = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f3793t == colorStateList) {
            return;
        }
        this.f3793t = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z3) {
        this.f3787n = z3;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedState(z3 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f3796w != i) {
            this.f3796w = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && this.f3799z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f3798y) {
                return;
            }
            this.f3798y = true;
            LinkedHashSet linkedHashSet = this.f3784k;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f3796w != 2 && (onCheckedChangeListener = this.A) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i4 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f3798y = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f3789p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z3) {
        if (this.f3788o == z3) {
            return;
        }
        this.f3788o = z3;
        refreshDrawableState();
        Iterator it = this.f3783j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f3799z = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f3786m = z3;
        if (z3) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // l.r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f3790q = drawable;
        this.f3792s = false;
        a();
    }
}
