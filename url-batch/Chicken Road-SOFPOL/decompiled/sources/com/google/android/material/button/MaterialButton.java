package com.google.android.material.button;

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
import b.q;
import c4.f;
import c4.g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.o;
import l5.a;
import l5.b;
import l5.c;
import l5.d;
import l5.e;
import r2.r;
import r5.k;
import w5.b0;
import w5.c0;
import w5.d0;
import w5.j;
import w5.m;
import w5.n;
import w5.y;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class MaterialButton extends o implements Checkable, y {
    public static final int[] I = {R.attr.state_checkable};
    public static final int[] J = {R.attr.state_checked};
    public static final a K = new a();
    public int A;
    public boolean B;
    public int C;
    public d0 D;
    public int E;
    public float F;
    public float G;
    public f H;

    /* renamed from: g, reason: collision with root package name */
    public final e f1871g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f1872h;
    public b i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f1873j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1874k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f1875l;

    /* renamed from: m, reason: collision with root package name */
    public String f1876m;

    /* renamed from: n, reason: collision with root package name */
    public int f1877n;

    /* renamed from: o, reason: collision with root package name */
    public int f1878o;

    /* renamed from: p, reason: collision with root package name */
    public int f1879p;

    /* renamed from: q, reason: collision with root package name */
    public int f1880q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1881r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1882s;

    /* renamed from: t, reason: collision with root package name */
    public int f1883t;

    /* renamed from: u, reason: collision with root package name */
    public int f1884u;

    /* renamed from: v, reason: collision with root package name */
    public float f1885v;

    /* renamed from: w, reason: collision with root package name */
    public int f1886w;

    /* renamed from: x, reason: collision with root package name */
    public int f1887x;

    /* renamed from: y, reason: collision with root package name */
    public LinearLayout.LayoutParams f1888y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1889z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a6.a.b(context, attributeSet, com.snovikpovik.vuevnxsj.R.attr.materialButtonStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Button, new int[]{com.snovikpovik.vuevnxsj.R.attr.materialSizeOverlay}), attributeSet);
        this.f1872h = new LinkedHashSet();
        this.f1881r = false;
        this.f1882s = false;
        this.f1884u = -1;
        this.f1885v = -1.0f;
        this.f1886w = -1;
        this.f1887x = -1;
        this.C = -1;
        Context context2 = getContext();
        TypedArray e8 = k.e(context2, attributeSet, f5.a.i, com.snovikpovik.vuevnxsj.R.attr.materialButtonStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1880q = e8.getDimensionPixelSize(13, 0);
        int i = e8.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1873j = k.f(i, mode);
        this.f1874k = r2.o.C(getContext(), e8, 15);
        this.f1875l = r2.o.E(getContext(), e8, 11);
        this.f1883t = e8.getInteger(12, 1);
        this.f1877n = e8.getDimensionPixelSize(14, 0);
        b0 b8 = b0.b(context2, e8, 19);
        n c8 = b8 != null ? b8.c() : n.b(context2, attributeSet, com.snovikpovik.vuevnxsj.R.attr.materialButtonStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Button).a();
        boolean z3 = e8.getBoolean(17, false);
        e eVar = new e(this, c8);
        this.f1871g = eVar;
        eVar.f4849f = e8.getDimensionPixelOffset(2, 0);
        eVar.f4850g = e8.getDimensionPixelOffset(3, 0);
        eVar.f4851h = e8.getDimensionPixelOffset(4, 0);
        eVar.i = e8.getDimensionPixelOffset(5, 0);
        if (e8.hasValue(9)) {
            int dimensionPixelSize = e8.getDimensionPixelSize(9, -1);
            eVar.f4852j = dimensionPixelSize;
            float f6 = dimensionPixelSize;
            m f8 = eVar.f4845b.f();
            f8.f8131e = new w5.a(f6);
            f8.f8132f = new w5.a(f6);
            f8.f8133g = new w5.a(f6);
            f8.f8134h = new w5.a(f6);
            eVar.f4845b = f8.a();
            eVar.f4846c = null;
            eVar.d();
            eVar.f4861s = true;
        }
        eVar.f4853k = e8.getDimensionPixelSize(22, 0);
        eVar.f4854l = k.f(e8.getInt(8, -1), mode);
        eVar.f4855m = r2.o.C(getContext(), e8, 7);
        eVar.f4856n = r2.o.C(getContext(), e8, 21);
        eVar.f4857o = r2.o.C(getContext(), e8, 18);
        eVar.f4862t = e8.getBoolean(6, false);
        eVar.f4865w = e8.getDimensionPixelSize(10, 0);
        eVar.f4863u = e8.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (e8.hasValue(0)) {
            eVar.f4860r = true;
            setSupportBackgroundTintList(eVar.f4855m);
            setSupportBackgroundTintMode(eVar.f4854l);
        } else {
            eVar.c();
        }
        setPaddingRelative(paddingStart + eVar.f4849f, paddingTop + eVar.f4851h, paddingEnd + eVar.f4850g, paddingBottom + eVar.i);
        setCheckedInternal(e8.getBoolean(1, false));
        if (b8 != null) {
            eVar.f4847d = d();
            if (eVar.f4846c != null) {
                eVar.d();
            }
            eVar.f4846c = b8;
            eVar.d();
        }
        setOpticalCenterEnabled(z3);
        e8.recycle();
        setCompoundDrawablePadding(this.f1880q);
        h(this.f1875l != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.A = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.F;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        j a8;
        if (this.f1889z && this.B && (a8 = this.f1871g.a(false)) != null) {
            return (int) (a8.h() * 0.11f);
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
        float f6 = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f6 = Math.max(f6, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f6);
    }

    private void setCheckedInternal(boolean z3) {
        e eVar = this.f1871g;
        if (eVar == null || !eVar.f4862t || this.f1881r == z3) {
            return;
        }
        this.f1881r = z3;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z7 = this.f1881r;
            if (!materialButtonToggleGroup.f1892o) {
                materialButtonToggleGroup.f(getId(), z7);
            }
        }
        if (this.f1882s) {
            return;
        }
        this.f1882s = true;
        Iterator it = this.f1872h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f1882s = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f6) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.F != f6) {
            this.F = f6;
            j();
            invalidate();
            if (getParent() instanceof d) {
                d dVar = (d) getParent();
                int i = (int) this.F;
                int indexOfChild = dVar.indexOfChild(this);
                if (indexOfChild < 0) {
                    return;
                }
                int i8 = indexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i8 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (dVar.c(i8)) {
                            materialButton2 = (MaterialButton) dVar.getChildAt(i8);
                            break;
                        }
                        i8--;
                    }
                }
                int childCount = dVar.getChildCount();
                while (true) {
                    indexOfChild++;
                    if (indexOfChild >= childCount) {
                        break;
                    } else if (dVar.c(indexOfChild)) {
                        materialButton = (MaterialButton) dVar.getChildAt(indexOfChild);
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

    public final g d() {
        Context context = getContext();
        TypedValue P = r.P(context, com.snovikpovik.vuevnxsj.R.attr.motionSpringFastSpatial);
        int[] iArr = f5.a.f2748n;
        TypedArray obtainStyledAttributes = P == null ? context.obtainStyledAttributes(null, iArr, 0, com.snovikpovik.vuevnxsj.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(P.resourceId, iArr);
        g gVar = new g();
        try {
            float f6 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f6 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f8 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f8 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f6 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            gVar.f1643a = Math.sqrt(f6);
            gVar.f1645c = false;
            if (f8 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            gVar.f1644b = f8;
            gVar.f1645c = false;
            obtainStyledAttributes.recycle();
            return gVar;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean e() {
        e eVar = this.f1871g;
        return (eVar == null || eVar.f4860r) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r1 == 2) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z3) {
        int i;
        if (this.D == null) {
            return;
        }
        if (this.H == null) {
            f fVar = new f(this, K);
            this.H = fVar;
            fVar.f1640j = d();
        }
        if (this.B) {
            int i8 = this.E;
            d0 d0Var = this.D;
            int[] drawableState = getDrawableState();
            int[][] iArr = d0Var.f8082c;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                i = -1;
                if (i10 >= d0Var.f8080a) {
                    i10 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i10], drawableState)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = d0Var.f8082c;
                int i11 = 0;
                while (true) {
                    if (i11 >= d0Var.f8080a) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr3[i11], iArr2)) {
                        i = i11;
                        break;
                    }
                    i11++;
                }
                i10 = i;
            }
            c0 c0Var = (c0) (i10 < 0 ? d0Var.f8081b : d0Var.f8083d[i10]).f6119e;
            int width = getWidth();
            float f6 = c0Var.f8079b;
            int i12 = c0Var.f8078a;
            if (i12 == 1) {
                f6 *= width;
            }
            i9 = (int) f6;
            this.H.a(Math.min(i8, i9));
            if (z3) {
                this.H.d();
            }
        }
    }

    public final void g() {
        int i = this.f1883t;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f1875l, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f1875l, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f1875l, null, null);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f1876m)) {
            return this.f1876m;
        }
        e eVar = this.f1871g;
        return ((eVar == null || !eVar.f4862t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.C;
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
            return this.f1871g.f4852j;
        }
        return 0;
    }

    public g getCornerSpringForce() {
        return this.f1871g.f4847d;
    }

    public Drawable getIcon() {
        return this.f1875l;
    }

    public int getIconGravity() {
        return this.f1883t;
    }

    public int getIconPadding() {
        return this.f1880q;
    }

    public int getIconSize() {
        return this.f1877n;
    }

    public ColorStateList getIconTint() {
        return this.f1874k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1873j;
    }

    public int getInsetBottom() {
        return this.f1871g.i;
    }

    public int getInsetTop() {
        return this.f1871g.f4851h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f1871g.f4857o;
        }
        return null;
    }

    public n getShapeAppearanceModel() {
        if (e()) {
            return this.f1871g.f4845b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public b0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.f1871g.f4846c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f1871g.f4856n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f1871g.f4853k;
        }
        return 0;
    }

    @Override // l.o
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f1871g.f4855m : super.getSupportBackgroundTintList();
    }

    @Override // l.o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f1871g.f4854l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z3) {
        Drawable drawable = this.f1875l;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f1875l = mutate;
            mutate.setTintList(this.f1874k);
            PorterDuff.Mode mode = this.f1873j;
            if (mode != null) {
                this.f1875l.setTintMode(mode);
            }
            int i = this.f1877n;
            if (i == 0) {
                i = this.f1875l.getIntrinsicWidth();
            }
            int i8 = this.f1877n;
            if (i8 == 0) {
                i8 = this.f1875l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1875l;
            int i9 = this.f1878o;
            int i10 = this.f1879p;
            drawable2.setBounds(i9, i10, i + i9, i8 + i10);
            this.f1875l.setVisible(true, z3);
        }
        if (z3) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i11 = this.f1883t;
        if (((i11 == 1 || i11 == 2) && drawable3 != this.f1875l) || (((i11 == 3 || i11 == 4) && drawable5 != this.f1875l) || ((i11 == 16 || i11 == 32) && drawable4 != this.f1875l))) {
            g();
        }
    }

    public final void i(int i, int i8) {
        if (this.f1875l == null || getLayout() == null) {
            return;
        }
        int i9 = this.f1883t;
        if (i9 != 1 && i9 != 2 && i9 != 3 && i9 != 4) {
            if (i9 == 16 || i9 == 32) {
                this.f1878o = 0;
                if (i9 == 16) {
                    this.f1879p = 0;
                    h(false);
                    return;
                }
                int i10 = this.f1877n;
                if (i10 == 0) {
                    i10 = this.f1875l.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i8 - getTextHeight()) - getPaddingTop()) - i10) - this.f1880q) - getPaddingBottom()) / 2);
                if (this.f1879p != max) {
                    this.f1879p = max;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1879p = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i11 = this.f1883t;
        if (i11 == 1 || i11 == 3 || ((i11 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i11 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f1878o = 0;
            h(false);
            return;
        }
        int i12 = this.f1877n;
        if (i12 == 0) {
            i12 = this.f1875l.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i12) - this.f1880q) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f1883t == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f1878o != textLayoutWidth) {
            this.f1878o = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1881r;
    }

    public final void j() {
        int i = (int) (this.F - this.G);
        int i8 = (i / 2) + this.A;
        getLayoutParams().width = (int) (this.f1885v + i);
        setPaddingRelative(this.f1886w + i8, getPaddingTop(), (this.f1887x + i) - i8, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            r2.o.n0(this, this.f1871g.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        e eVar = this.f1871g;
        if (eVar != null && eVar.f4862t) {
            View.mergeDrawableStates(onCreateDrawableState, I);
        }
        if (this.f1881r) {
            View.mergeDrawableStates(onCreateDrawableState, J);
        }
        return onCreateDrawableState;
    }

    @Override // l.o, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1881r);
    }

    @Override // l.o, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        e eVar = this.f1871g;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f4862t);
        accessibilityNodeInfo.setChecked(this.f1881r);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.o, android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        int i11;
        super.onLayout(z3, i, i8, i9, i10);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i12 = getResources().getConfiguration().orientation;
        if (this.f1884u != i12) {
            this.f1884u = i12;
            this.f1885v = -1.0f;
        }
        if (this.f1885v == -1.0f) {
            this.f1885v = getMeasuredWidth();
            if (this.f1888y == null && (getParent() instanceof d) && ((d) getParent()).getButtonSizeChange() != null) {
                this.f1888y = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f1888y);
                layoutParams.width = (int) this.f1885v;
                setLayoutParams(layoutParams);
            }
        }
        boolean z7 = false;
        if (this.C == -1) {
            if (this.f1875l == null) {
                i11 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i13 = this.f1877n;
                if (i13 == 0) {
                    i13 = this.f1875l.getIntrinsicWidth();
                }
                i11 = iconPadding + i13;
            }
            this.C = (getMeasuredWidth() - getTextLayoutWidth()) - i11;
        }
        if (this.f1886w == -1) {
            this.f1886w = getPaddingStart();
        }
        if (this.f1887x == -1) {
            this.f1887x = getPaddingEnd();
        }
        if ((getParent() instanceof d) && ((d) getParent()).getOrientation() == 0) {
            z7 = true;
        }
        this.B = z7;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f7877d);
        setChecked(cVar.f4834f);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f4834f = this.f1881r;
        return cVar;
    }

    @Override // l.o, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        super.onTextChanged(charSequence, i, i8, i9);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f1871g.f4863u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f1875l != null) {
            if (this.f1875l.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1876m = str;
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
        e eVar = this.f1871g;
        if (eVar.a(false) != null) {
            eVar.a(false).setTint(i);
        }
    }

    @Override // l.o, android.view.View
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
        e eVar = this.f1871g;
        eVar.f4860r = true;
        MaterialButton materialButton = eVar.f4844a;
        materialButton.setSupportBackgroundTintList(eVar.f4855m);
        materialButton.setSupportBackgroundTintMode(eVar.f4854l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.o, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? h0.a.D(getContext(), i) : null);
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
            this.f1871g.f4862t = z3;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedInternal(z3);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            e eVar = this.f1871g;
            if (eVar.f4861s && eVar.f4852j == i) {
                return;
            }
            eVar.f4852j = i;
            eVar.f4861s = true;
            float f6 = i;
            m f8 = eVar.f4845b.f();
            f8.f8131e = new w5.a(f6);
            f8.f8132f = new w5.a(f6);
            f8.f8133g = new w5.a(f6);
            f8.f8134h = new w5.a(f6);
            eVar.f4845b = f8.a();
            eVar.f4846c = null;
            eVar.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(g gVar) {
        e eVar = this.f1871g;
        eVar.f4847d = gVar;
        if (eVar.f4846c != null) {
            eVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.G = Math.min(i, this.C);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        if (e()) {
            this.f1871g.a(false).m(f6);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1875l != drawable) {
            this.f1875l = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f1883t != i) {
            this.f1883t = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f1880q != i) {
            this.f1880q = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? h0.a.D(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1877n != i) {
            this.f1877n = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1874k != colorStateList) {
            this.f1874k = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1873j != mode) {
            this.f1873j = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(s6.a.q(getContext(), i));
    }

    public void setInsetBottom(int i) {
        e eVar = this.f1871g;
        eVar.b(eVar.f4851h, i);
    }

    public void setInsetTop(int i) {
        e eVar = this.f1871g;
        eVar.b(i, eVar.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.i = bVar;
    }

    public void setOpticalCenterEnabled(boolean z3) {
        if (this.f1889z != z3) {
            this.f1889z = z3;
            e eVar = this.f1871g;
            if (z3) {
                q qVar = new q(this);
                eVar.f4848e = qVar;
                j a8 = eVar.a(false);
                if (a8 != null) {
                    a8.G = qVar;
                }
            } else {
                eVar.f4848e = null;
                j a9 = eVar.a(false);
                if (a9 != null) {
                    a9.G = null;
                }
            }
            post(new a1.a(7, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        b bVar = this.i;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((b1.b) bVar).f1050e).invalidate();
        }
        super.setPressed(z3);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            e eVar = this.f1871g;
            MaterialButton materialButton = eVar.f4844a;
            if (eVar.f4857o != colorStateList) {
                eVar.f4857o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(u5.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(s6.a.q(getContext(), i));
        }
    }

    @Override // w5.y
    public void setShapeAppearanceModel(n nVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        e eVar = this.f1871g;
        eVar.f4845b = nVar;
        eVar.f4846c = null;
        eVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (e()) {
            e eVar = this.f1871g;
            eVar.f4859q = z3;
            eVar.e();
        }
    }

    public void setSizeChange(d0 d0Var) {
        if (this.D != d0Var) {
            this.D = d0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(b0 b0Var) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        e eVar = this.f1871g;
        if (eVar.f4847d == null && b0Var.d()) {
            eVar.f4847d = d();
            if (eVar.f4846c != null) {
                eVar.d();
            }
        }
        eVar.f4846c = b0Var;
        eVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            e eVar = this.f1871g;
            if (eVar.f4856n != colorStateList) {
                eVar.f4856n = colorStateList;
                eVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(s6.a.q(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            e eVar = this.f1871g;
            if (eVar.f4853k != i) {
                eVar.f4853k = i;
                eVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // l.o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        e eVar = this.f1871g;
        if (eVar.f4855m != colorStateList) {
            eVar.f4855m = colorStateList;
            if (eVar.a(false) != null) {
                eVar.a(false).setTintList(eVar.f4855m);
            }
        }
    }

    @Override // l.o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        e eVar = this.f1871g;
        if (eVar.f4854l != mode) {
            eVar.f4854l = mode;
            if (eVar.a(false) == null || eVar.f4854l == null) {
                return;
            }
            eVar.a(false).setTintMode(eVar.f4854l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.f1871g.f4863u = z3;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.f1885v = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.E != i) {
            this.E = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1881r);
    }
}
