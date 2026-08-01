package com.google.android.material.button;

import a.e0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import e2.o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.q;
import l2.b0;
import l2.c0;
import l2.d0;
import l2.j;
import l2.m;
import l2.n;
import l2.y;
import u0.e;
import v1.a;
import v1.b;
import v1.c;
import v1.f;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class MaterialButton extends q implements Checkable, y {
    public static final int[] K = {R.attr.state_checkable};
    public static final int[] L = {R.attr.state_checked};
    public static final a M = new a();
    public LinearLayout.LayoutParams A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public d0 F;
    public int G;
    public float H;
    public float I;
    public e J;
    public final f i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f848j;

    /* renamed from: k, reason: collision with root package name */
    public b f849k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f850l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f851m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f852n;

    /* renamed from: o, reason: collision with root package name */
    public String f853o;

    /* renamed from: p, reason: collision with root package name */
    public int f854p;

    /* renamed from: q, reason: collision with root package name */
    public int f855q;

    /* renamed from: r, reason: collision with root package name */
    public int f856r;

    /* renamed from: s, reason: collision with root package name */
    public int f857s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f858t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f859u;

    /* renamed from: v, reason: collision with root package name */
    public int f860v;

    /* renamed from: w, reason: collision with root package name */
    public int f861w;

    /* renamed from: x, reason: collision with root package name */
    public float f862x;

    /* renamed from: y, reason: collision with root package name */
    public int f863y;

    /* renamed from: z, reason: collision with root package name */
    public int f864z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(q2.a.b(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.materialButtonStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Button, new int[]{com.oriondriftchasers.arordrft.R.attr.materialSizeOverlay}), attributeSet, com.oriondriftchasers.arordrft.R.attr.materialButtonStyle);
        this.f848j = new LinkedHashSet();
        this.f858t = false;
        this.f859u = false;
        this.f861w = -1;
        this.f862x = -1.0f;
        this.f863y = -1;
        this.f864z = -1;
        this.E = -1;
        Context context2 = getContext();
        TypedArray f2 = o.f(context2, attributeSet, n1.a.f2819l, com.oriondriftchasers.arordrft.R.attr.materialButtonStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f857s = f2.getDimensionPixelSize(13, 0);
        int i = f2.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f850l = o.h(i, mode);
        this.f851m = h.a.t(getContext(), f2, 15);
        this.f852n = h.a.y(getContext(), f2, 11);
        this.f860v = f2.getInteger(12, 1);
        this.f854p = f2.getDimensionPixelSize(14, 0);
        b0 b4 = b0.b(context2, f2, 19);
        n c4 = b4 != null ? b4.c() : n.c(context2, attributeSet, com.oriondriftchasers.arordrft.R.attr.materialButtonStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Button).a();
        boolean z3 = f2.getBoolean(17, false);
        f fVar = new f(this, c4);
        this.i = fVar;
        fVar.f3489f = f2.getDimensionPixelOffset(2, 0);
        fVar.f3490g = f2.getDimensionPixelOffset(3, 0);
        fVar.f3491h = f2.getDimensionPixelOffset(4, 0);
        fVar.i = f2.getDimensionPixelOffset(5, 0);
        if (f2.hasValue(9)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(9, -1);
            fVar.f3492j = dimensionPixelSize;
            float f4 = dimensionPixelSize;
            m g4 = fVar.f3486b.g();
            g4.f2621e = new l2.a(f4);
            g4.f2622f = new l2.a(f4);
            g4.f2623g = new l2.a(f4);
            g4.f2624h = new l2.a(f4);
            fVar.f3486b = g4.a();
            fVar.f3487c = null;
            fVar.d();
            fVar.f3501s = true;
        }
        fVar.f3493k = f2.getDimensionPixelSize(22, 0);
        fVar.f3494l = o.h(f2.getInt(8, -1), mode);
        fVar.f3495m = h.a.t(getContext(), f2, 7);
        fVar.f3496n = h.a.t(getContext(), f2, 21);
        fVar.f3497o = h.a.t(getContext(), f2, 18);
        fVar.f3502t = f2.getBoolean(6, false);
        fVar.f3505w = f2.getDimensionPixelSize(10, 0);
        fVar.f3503u = f2.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            fVar.f3500r = true;
            setSupportBackgroundTintList(fVar.f3495m);
            setSupportBackgroundTintMode(fVar.f3494l);
        } else {
            fVar.c();
        }
        setPaddingRelative(paddingStart + fVar.f3489f, paddingTop + fVar.f3491h, paddingEnd + fVar.f3490g, paddingBottom + fVar.i);
        setCheckedInternal(f2.getBoolean(1, false));
        if (b4 != null) {
            fVar.d = d();
            if (fVar.f3487c != null) {
                fVar.d();
            }
            fVar.f3487c = b4;
            fVar.d();
        }
        setOpticalCenterEnabled(z3);
        f2.recycle();
        setCompoundDrawablePadding(this.f857s);
        h(this.f852n != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.C = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.H;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        j a2;
        if (this.B && this.D && (a2 = this.i.a(false)) != null) {
            return (int) (a2.i() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f2 = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f2);
    }

    private void setCheckedInternal(boolean z3) {
        f fVar = this.i;
        if (fVar == null || !fVar.f3502t || this.f858t == z3) {
            return;
        }
        this.f858t = z3;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z4 = this.f858t;
            if (!materialButtonToggleGroup.f867q) {
                materialButtonToggleGroup.f(getId(), z4);
            }
        }
        if (this.f859u) {
            return;
        }
        this.f859u = true;
        Iterator it = this.f848j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f859u = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f2) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.H != f2) {
            this.H = f2;
            j();
            invalidate();
            if (getParent() instanceof v1.e) {
                v1.e eVar = (v1.e) getParent();
                int i = (int) this.H;
                int indexOfChild = eVar.indexOfChild(this);
                if (indexOfChild < 0) {
                    return;
                }
                int i4 = indexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i4 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (eVar.c(i4)) {
                            materialButton2 = (MaterialButton) eVar.getChildAt(i4);
                            break;
                        }
                        i4--;
                    }
                }
                int childCount = eVar.getChildCount();
                while (true) {
                    indexOfChild++;
                    if (indexOfChild >= childCount) {
                        break;
                    } else if (eVar.c(indexOfChild)) {
                        materialButton = (MaterialButton) eVar.getChildAt(indexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i / 2);
                materialButton.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final u0.f d() {
        Context context = getContext();
        TypedValue a02 = h.a.a0(context, com.oriondriftchasers.arordrft.R.attr.motionSpringFastSpatial);
        int[] iArr = n1.a.f2829v;
        TypedArray obtainStyledAttributes = a02 == null ? context.obtainStyledAttributes(null, iArr, 0, com.oriondriftchasers.arordrft.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(a02.resourceId, iArr);
        u0.f fVar = new u0.f();
        try {
            float f2 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f4 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f4 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f2 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            fVar.f3340a = Math.sqrt(f2);
            fVar.f3342c = false;
            if (f4 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            fVar.f3341b = f4;
            fVar.f3342c = false;
            obtainStyledAttributes.recycle();
            return fVar;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean e() {
        f fVar = this.i;
        return (fVar == null || fVar.f3500r) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r1 == 2) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z3) {
        int i;
        if (this.F == null) {
            return;
        }
        if (this.J == null) {
            e eVar = new e(this, M);
            this.J = eVar;
            eVar.f3337j = d();
        }
        if (this.D) {
            int i4 = this.G;
            d0 d0Var = this.F;
            int[] drawableState = getDrawableState();
            int[][] iArr = d0Var.f2577c;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = -1;
                if (i6 >= d0Var.f2575a) {
                    i6 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i6], drawableState)) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = d0Var.f2577c;
                int i7 = 0;
                while (true) {
                    if (i7 >= d0Var.f2575a) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr3[i7], iArr2)) {
                        i = i7;
                        break;
                    }
                    i7++;
                }
                i6 = i;
            }
            c0 c0Var = (c0) (i6 < 0 ? d0Var.f2576b : d0Var.d[i6]).f81g;
            int width = getWidth();
            float f2 = c0Var.f2574b;
            int i8 = c0Var.f2573a;
            if (i8 == 1) {
                f2 *= width;
            }
            i5 = (int) f2;
            this.J.a(Math.min(i4, i5));
            if (z3) {
                this.J.d();
            }
        }
    }

    public final void g() {
        int i = this.f860v;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f852n, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f852n, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f852n, null, null);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f853o)) {
            return this.f853o;
        }
        f fVar = this.i;
        return ((fVar == null || !fVar.f3502t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.E;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.i.f3492j;
        }
        return 0;
    }

    public u0.f getCornerSpringForce() {
        return this.i.d;
    }

    public Drawable getIcon() {
        return this.f852n;
    }

    public int getIconGravity() {
        return this.f860v;
    }

    public int getIconPadding() {
        return this.f857s;
    }

    public int getIconSize() {
        return this.f854p;
    }

    public ColorStateList getIconTint() {
        return this.f851m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f850l;
    }

    public int getInsetBottom() {
        return this.i.i;
    }

    public int getInsetTop() {
        return this.i.f3491h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.i.f3497o;
        }
        return null;
    }

    public n getShapeAppearanceModel() {
        if (e()) {
            return this.i.f3486b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public b0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.i.f3487c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.i.f3496n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.i.f3493k;
        }
        return 0;
    }

    @Override // l.q
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.i.f3495m : super.getSupportBackgroundTintList();
    }

    @Override // l.q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.i.f3494l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z3) {
        Drawable drawable = this.f852n;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f852n = mutate;
            mutate.setTintList(this.f851m);
            PorterDuff.Mode mode = this.f850l;
            if (mode != null) {
                this.f852n.setTintMode(mode);
            }
            int i = this.f854p;
            if (i == 0) {
                i = this.f852n.getIntrinsicWidth();
            }
            int i4 = this.f854p;
            if (i4 == 0) {
                i4 = this.f852n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f852n;
            int i5 = this.f855q;
            int i6 = this.f856r;
            drawable2.setBounds(i5, i6, i + i5, i4 + i6);
            this.f852n.setVisible(true, z3);
        }
        if (z3) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i7 = this.f860v;
        if (((i7 == 1 || i7 == 2) && drawable3 != this.f852n) || (((i7 == 3 || i7 == 4) && drawable5 != this.f852n) || ((i7 == 16 || i7 == 32) && drawable4 != this.f852n))) {
            g();
        }
    }

    public final void i(int i, int i4) {
        if (this.f852n == null || getLayout() == null) {
            return;
        }
        int i5 = this.f860v;
        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4) {
            if (i5 == 16 || i5 == 32) {
                this.f855q = 0;
                if (i5 == 16) {
                    this.f856r = 0;
                    h(false);
                    return;
                }
                int i6 = this.f854p;
                if (i6 == 0) {
                    i6 = this.f852n.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i4 - getTextHeight()) - getPaddingTop()) - i6) - this.f857s) - getPaddingBottom()) / 2);
                if (this.f856r != max) {
                    this.f856r = max;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f856r = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i7 = this.f860v;
        if (i7 == 1 || i7 == 3 || ((i7 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i7 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f855q = 0;
            h(false);
            return;
        }
        int i8 = this.f854p;
        if (i8 == 0) {
            i8 = this.f852n.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i8) - this.f857s) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f860v == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f855q != textLayoutWidth) {
            this.f855q = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f858t;
    }

    public final void j() {
        int i = (int) (this.H - this.I);
        int i4 = (i / 2) + this.C;
        getLayoutParams().width = (int) (this.f862x + i);
        setPaddingRelative(this.f863y + i4, getPaddingTop(), (this.f864z + i) - i4, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            h.a.k0(this, this.i.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        f fVar = this.i;
        if (fVar != null && fVar.f3502t) {
            View.mergeDrawableStates(onCreateDrawableState, K);
        }
        if (this.f858t) {
            View.mergeDrawableStates(onCreateDrawableState, L);
        }
        return onCreateDrawableState;
    }

    @Override // l.q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f858t);
    }

    @Override // l.q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        f fVar = this.i;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f3502t);
        accessibilityNodeInfo.setChecked(this.f858t);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z3, i, i4, i5, i6);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i8 = getResources().getConfiguration().orientation;
        if (this.f861w != i8) {
            this.f861w = i8;
            this.f862x = -1.0f;
        }
        if (this.f862x == -1.0f) {
            this.f862x = getMeasuredWidth();
            if (this.A == null && (getParent() instanceof v1.e) && ((v1.e) getParent()).getButtonSizeChange() != null) {
                this.A = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A);
                layoutParams.width = (int) this.f862x;
                setLayoutParams(layoutParams);
            }
        }
        boolean z4 = false;
        if (this.E == -1) {
            if (this.f852n == null) {
                i7 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i9 = this.f854p;
                if (i9 == 0) {
                    i9 = this.f852n.getIntrinsicWidth();
                }
                i7 = iconPadding + i9;
            }
            this.E = (getMeasuredWidth() - getTextLayoutWidth()) - i7;
        }
        if (this.f863y == -1) {
            this.f863y = getPaddingStart();
        }
        if (this.f864z == -1) {
            this.f864z = getPaddingEnd();
        }
        if ((getParent() instanceof v1.e) && ((v1.e) getParent()).getOrientation() == 0) {
            z4 = true;
        }
        this.D = z4;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f3175f);
        setChecked(cVar.f3474h);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f3474h = this.f858t;
        return cVar;
    }

    @Override // l.q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        super.onTextChanged(charSequence, i, i4, i5);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.i.f3503u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f852n != null) {
            if (this.f852n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f853o = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!e()) {
            super.setBackgroundColor(i);
            return;
        }
        f fVar = this.i;
        if (fVar.a(false) != null) {
            fVar.a(false).setTint(i);
        }
    }

    @Override // l.q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        f fVar = this.i;
        fVar.f3500r = true;
        MaterialButton materialButton = fVar.f3485a;
        materialButton.setSupportBackgroundTintList(fVar.f3495m);
        materialButton.setSupportBackgroundTintMode(fVar.f3494l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.q, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? h.a.x(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z3) {
        if (e()) {
            this.i.f3502t = z3;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedInternal(z3);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            f fVar = this.i;
            if (fVar.f3501s && fVar.f3492j == i) {
                return;
            }
            fVar.f3492j = i;
            fVar.f3501s = true;
            float f2 = i;
            m g4 = fVar.f3486b.g();
            g4.f2621e = new l2.a(f2);
            g4.f2622f = new l2.a(f2);
            g4.f2623g = new l2.a(f2);
            g4.f2624h = new l2.a(f2);
            fVar.f3486b = g4.a();
            fVar.f3487c = null;
            fVar.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(u0.f fVar) {
        f fVar2 = this.i;
        fVar2.d = fVar;
        if (fVar2.f3487c != null) {
            fVar2.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.I = Math.min(i, this.E);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (e()) {
            this.i.a(false).p(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f852n != drawable) {
            this.f852n = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f860v != i) {
            this.f860v = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f857s != i) {
            this.f857s = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? h.a.x(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f854p != i) {
            this.f854p = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f851m != colorStateList) {
            this.f851m = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f850l != mode) {
            this.f850l = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(a.y.B(getContext(), i));
    }

    public void setInsetBottom(int i) {
        f fVar = this.i;
        fVar.b(fVar.f3491h, i);
    }

    public void setInsetTop(int i) {
        f fVar = this.i;
        fVar.b(i, fVar.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f849k = bVar;
    }

    public void setOpticalCenterEnabled(boolean z3) {
        if (this.B != z3) {
            this.B = z3;
            f fVar = this.i;
            if (z3) {
                e0 e0Var = new e0(6, this);
                fVar.f3488e = e0Var;
                j a2 = fVar.a(false);
                if (a2 != null) {
                    a2.I = e0Var;
                }
            } else {
                fVar.f3488e = null;
                j a4 = fVar.a(false);
                if (a4 != null) {
                    a4.I = null;
                }
            }
            post(new a.j(12, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        b bVar = this.f849k;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((u2.a) bVar).f3355a).invalidate();
        }
        super.setPressed(z3);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.i;
            MaterialButton materialButton = fVar.f3485a;
            if (fVar.f3497o != colorStateList) {
                fVar.f3497o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(j2.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(a.y.B(getContext(), i));
        }
    }

    @Override // l2.y
    public void setShapeAppearanceModel(n nVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        f fVar = this.i;
        fVar.f3486b = nVar;
        fVar.f3487c = null;
        fVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (e()) {
            f fVar = this.i;
            fVar.f3499q = z3;
            fVar.e();
        }
    }

    public void setSizeChange(d0 d0Var) {
        if (this.F != d0Var) {
            this.F = d0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(b0 b0Var) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        f fVar = this.i;
        if (fVar.d == null && b0Var.d()) {
            fVar.d = d();
            if (fVar.f3487c != null) {
                fVar.d();
            }
        }
        fVar.f3487c = b0Var;
        fVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.i;
            if (fVar.f3496n != colorStateList) {
                fVar.f3496n = colorStateList;
                fVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(a.y.B(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            f fVar = this.i;
            if (fVar.f3493k != i) {
                fVar.f3493k = i;
                fVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // l.q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        f fVar = this.i;
        if (fVar.f3495m != colorStateList) {
            fVar.f3495m = colorStateList;
            if (fVar.a(false) != null) {
                fVar.a(false).setTintList(fVar.f3495m);
            }
        }
    }

    @Override // l.q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        f fVar = this.i;
        if (fVar.f3494l != mode) {
            fVar.f3494l = mode;
            if (fVar.a(false) == null || fVar.f3494l == null) {
                return;
            }
            fVar.a(false).setTintMode(fVar.f3494l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.i.f3503u = z3;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.f862x = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.G != i) {
            this.G = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f858t);
    }
}
