package t1;

import a2.p;
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
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.emoji2.text.s;
import b0.m;
import com.gglhk.bofio.fortunetiger.R;
import f1.k;
import g1.e;
import g1.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.q;
import k3.d;
import l0.g;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends q {
    public static final int[] D = {R.attr.state_indeterminate};
    public static final int[] E = {R.attr.state_error};
    public static final int[][] F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public CompoundButton.OnCheckedChangeListener A;
    public final f B;
    public final a C;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f3380j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f3381k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3382l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3383m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3384n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3385o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3386p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f3387q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f3388r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3389s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f3390t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f3391u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f3392v;

    /* renamed from: w, reason: collision with root package name */
    public int f3393w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f3394x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3395y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f3396z;

    public c(Context context, AttributeSet attributeSet) {
        super(l2.a.b(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f3380j = new LinkedHashSet();
        this.f3381k = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = m.f716a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f1774f = drawable;
        drawable.setCallback(fVar.f1773k);
        new e(fVar.f1774f.getConstantState());
        this.B = fVar;
        this.C = new a(this);
        Context context3 = getContext();
        this.f3387q = getButtonDrawable();
        this.f3390t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        p.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = l1.a.f2871q;
        p.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        s sVar = new s(context3, obtainStyledAttributes);
        this.f3388r = sVar.i(2);
        if (this.f3387q != null && d.Y(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == G && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f3387q = k3.m.w(context3, R.drawable.mtrl_checkbox_button);
                this.f3389s = true;
                if (this.f3388r == null) {
                    this.f3388r = k3.m.w(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f3391u = k3.m.v(context3, sVar, 3);
        this.f3392v = p.f(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f3383m = obtainStyledAttributes.getBoolean(11, false);
        this.f3384n = obtainStyledAttributes.getBoolean(6, true);
        this.f3385o = obtainStyledAttributes.getBoolean(9, false);
        this.f3386p = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRippleColor(k3.m.v(context3, sVar, 10));
        }
        sVar.t();
        a();
    }

    private String getButtonStateDescription() {
        int i4 = this.f3393w;
        return i4 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i4 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3382l == null) {
            int t3 = g.t(getContext(), d.a0(this, R.attr.colorControlActivated));
            int t4 = g.t(getContext(), d.a0(this, R.attr.colorError));
            int t5 = g.t(getContext(), d.a0(this, R.attr.colorSurface));
            int t6 = g.t(getContext(), d.a0(this, R.attr.colorOnSurface));
            this.f3382l = new ColorStateList(F, new int[]{g.o(t5, t4, 1.0f), g.o(t5, t3, 1.0f), g.o(t5, t6, 0.54f), g.o(t5, t6, 0.38f), g.o(t5, t6, 0.38f)});
        }
        return this.f3382l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f3390t;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        k kVar;
        Drawable drawable = this.f3387q;
        ColorStateList colorStateList3 = this.f3390t;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.f3387q = drawable;
        Drawable drawable2 = this.f3388r;
        ColorStateList colorStateList4 = this.f3391u;
        PorterDuff.Mode mode = this.f3392v;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.f3388r = drawable2;
        if (this.f3389s) {
            f fVar = this.B;
            if (fVar != null) {
                g1.d dVar = fVar.g;
                Drawable drawable3 = fVar.f1774f;
                a aVar = this.C;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f3377a == null) {
                        aVar.f3377a = new g1.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f3377a);
                }
                ArrayList arrayList = fVar.f1772j;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.f1772j.size() == 0 && (kVar = fVar.f1771i) != null) {
                        dVar.f1768b.removeListener(kVar);
                        fVar.f1771i = null;
                    }
                }
                Drawable drawable4 = fVar.f1774f;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f3377a == null) {
                        aVar.f3377a = new g1.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f3377a);
                } else if (aVar != null) {
                    if (fVar.f1772j == null) {
                        fVar.f1772j = new ArrayList();
                    }
                    if (!fVar.f1772j.contains(aVar)) {
                        fVar.f1772j.add(aVar);
                        if (fVar.f1771i == null) {
                            fVar.f1771i = new k(1, fVar);
                        }
                        dVar.f1768b.addListener(fVar.f1771i);
                    }
                }
            }
            Drawable drawable5 = this.f3387q;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f3387q).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f3387q;
        if (drawable6 != null && (colorStateList2 = this.f3390t) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.f3388r;
        if (drawable7 != null && (colorStateList = this.f3391u) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.f3387q;
        Drawable drawable9 = this.f3388r;
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
                float f4 = intrinsicWidth / intrinsicHeight;
                if (f4 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f4);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f4 * intrinsicHeight);
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
        return this.f3387q;
    }

    public Drawable getButtonIconDrawable() {
        return this.f3388r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f3391u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f3392v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f3390t;
    }

    public int getCheckedState() {
        return this.f3393w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f3386p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f3393w == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3383m && this.f3390t == null && this.f3391u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (this.f3385o) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        int i5 = 0;
        while (true) {
            if (i5 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i6 = onCreateDrawableState[i5];
            if (i6 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i6 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i5] = 16842912;
                break;
            }
            i5++;
        }
        this.f3394x = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f3384n || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
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
        if (accessibilityNodeInfo != null && this.f3385o) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f3386p));
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
        setCheckedState(bVar.f3379f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f3379f = getCheckedState();
        return bVar;
    }

    @Override // k.q, android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(k3.m.w(getContext(), i4));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f3388r = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i4) {
        setButtonIconDrawable(k3.m.w(getContext(), i4));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f3391u == colorStateList) {
            return;
        }
        this.f3391u = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f3392v == mode) {
            return;
        }
        this.f3392v = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f3390t == colorStateList) {
            return;
        }
        this.f3390t = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z3) {
        this.f3384n = z3;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedState(z3 ? 1 : 0);
    }

    public void setCheckedState(int i4) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f3393w != i4) {
            this.f3393w = i4;
            super.setChecked(i4 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f3396z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f3395y) {
                return;
            }
            this.f3395y = true;
            LinkedHashSet linkedHashSet = this.f3381k;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f3393w != 2 && (onCheckedChangeListener = this.A) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f3395y = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f3386p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i4) {
        setErrorAccessibilityLabel(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setErrorShown(boolean z3) {
        if (this.f3385o == z3) {
            return;
        }
        this.f3385o = z3;
        refreshDrawableState();
        Iterator it = this.f3380j.iterator();
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
        this.f3396z = charSequence;
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
        this.f3383m = z3;
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

    @Override // k.q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f3387q = drawable;
        this.f3389s = false;
        a();
    }
}
