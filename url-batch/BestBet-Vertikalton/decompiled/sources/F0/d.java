package F0;

import B.j;
import B.q;
import H1.l;
import L0.k;
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
import c1.AbstractC0091d;
import com.fortunequest.neontrack.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C0256r;
import q0.e;
import q0.f;
import u0.C0372k;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public final class d extends C0256r {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f250e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f251f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f252g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f253j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f254k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f255l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f256m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f257n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f258o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f259p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f260q;

    /* renamed from: r, reason: collision with root package name */
    public int f261r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f262s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f263t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f264u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f265v;

    /* renamed from: w, reason: collision with root package name */
    public final f f266w;

    /* renamed from: x, reason: collision with root package name */
    public final a f267x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f248y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f249z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f246A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f247B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public d(Context context, AttributeSet attributeSet) {
        super(W0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f250e = new LinkedHashSet();
        this.f251f = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = q.f54a;
        Drawable a2 = j.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f3763a = a2;
        a2.setCallback(fVar.f3762f);
        new e(fVar.f3763a.getConstantState());
        this.f266w = fVar;
        this.f267x = new a(this);
        Context context3 = getContext();
        this.f255l = Q.c.a(this);
        this.f258o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0393a.f4553n;
        k.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        k.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0372k c0372k = new C0372k(context3, obtainStyledAttributes);
        this.f256m = c0372k.d(2);
        if (this.f255l != null && H1.d.e0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f247B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f255l = AbstractC0091d.j(context3, R.drawable.mtrl_checkbox_button);
                this.f257n = true;
                if (this.f256m == null) {
                    this.f256m = AbstractC0091d.j(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f259p = l.C(context3, c0372k, 3);
        this.f260q = k.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f253j = obtainStyledAttributes.getBoolean(9, false);
        this.f254k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0372k.l();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f261r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f252g == null) {
            int A2 = l.A(this, R.attr.colorControlActivated);
            int A3 = l.A(this, R.attr.colorError);
            int A4 = l.A(this, R.attr.colorSurface);
            int A5 = l.A(this, R.attr.colorOnSurface);
            this.f252g = new ColorStateList(f246A, new int[]{l.Q(1.0f, A4, A3), l.Q(1.0f, A4, A2), l.Q(0.54f, A4, A5), l.Q(0.38f, A4, A5), l.Q(0.38f, A4, A5)});
        }
        return this.f252g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f258o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        A0.a aVar;
        Drawable drawable = this.f255l;
        ColorStateList colorStateList3 = this.f258o;
        PorterDuff.Mode b2 = Q.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                D.a.i(drawable, b2);
            }
        }
        this.f255l = drawable;
        Drawable drawable2 = this.f256m;
        ColorStateList colorStateList4 = this.f259p;
        PorterDuff.Mode mode = this.f260q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f256m = drawable2;
        if (this.f257n) {
            f fVar = this.f266w;
            if (fVar != null) {
                Drawable drawable3 = fVar.f3763a;
                a aVar2 = this.f267x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar2.f242a == null) {
                        aVar2.f242a = new q0.b(aVar2);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar2.f242a);
                }
                ArrayList arrayList = fVar.f3761e;
                q0.d dVar = fVar.f3759b;
                if (arrayList != null && aVar2 != null) {
                    arrayList.remove(aVar2);
                    if (fVar.f3761e.size() == 0 && (aVar = fVar.d) != null) {
                        dVar.f3756b.removeListener(aVar);
                        fVar.d = null;
                    }
                }
                Drawable drawable4 = fVar.f3763a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar2.f242a == null) {
                        aVar2.f242a = new q0.b(aVar2);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar2.f242a);
                } else if (aVar2 != null) {
                    if (fVar.f3761e == null) {
                        fVar.f3761e = new ArrayList();
                    }
                    if (!fVar.f3761e.contains(aVar2)) {
                        fVar.f3761e.add(aVar2);
                        if (fVar.d == null) {
                            fVar.d = new A0.a(5, fVar);
                        }
                        dVar.f3756b.addListener(fVar.d);
                    }
                }
            }
            Drawable drawable5 = this.f255l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f255l).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f255l;
        if (drawable6 != null && (colorStateList2 = this.f258o) != null) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f256m;
        if (drawable7 != null && (colorStateList = this.f259p) != null) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f255l;
        Drawable drawable9 = this.f256m;
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
        return this.f255l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f256m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f259p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f260q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f258o;
    }

    public int getCheckedState() {
        return this.f261r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f254k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f261r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f258o == null && this.f259p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f248y);
        }
        if (this.f253j) {
            View.mergeDrawableStates(onCreateDrawableState, f249z);
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
        this.f262s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = Q.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (k.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, RecyclerView.f1937A0);
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
        if (accessibilityNodeInfo != null && this.f253j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f254k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setCheckedState(cVar.f245a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f245a = getCheckedState();
        return cVar;
    }

    @Override // l.C0256r, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0091d.j(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f256m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0091d.j(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f259p == colorStateList) {
            return;
        }
        this.f259p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f260q == mode) {
            return;
        }
        this.f260q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f258o == colorStateList) {
            return;
        }
        this.f258o = colorStateList;
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
        if (this.f261r != i) {
            this.f261r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f264u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f263t) {
                return;
            }
            this.f263t = true;
            LinkedHashSet linkedHashSet = this.f251f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f261r != 2 && (onCheckedChangeListener = this.f265v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f263t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f254k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f253j == z2) {
            return;
        }
        this.f253j = z2;
        refreshDrawableState();
        Iterator it = this.f250e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f265v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f264u = charSequence;
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

    @Override // l.C0256r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f255l = drawable;
        this.f257n = false;
        a();
    }
}
