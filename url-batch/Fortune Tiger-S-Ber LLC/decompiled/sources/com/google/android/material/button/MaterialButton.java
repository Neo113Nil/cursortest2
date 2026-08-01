package com.google.android.material.button;

import a2.r;
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
import android.widget.TextView;
import androidx.activity.n;
import b0.k;
import g2.b0;
import g2.c0;
import g2.d0;
import g2.j;
import g2.o;
import g2.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.p;
import k3.d;
import k3.m;
import l2.a;
import r0.g;
import r1.b;
import r1.c;
import r1.e;
import r1.h;
import r1.i;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class MaterialButton extends p implements Checkable, z {
    public static final int[] S = {R.attr.state_checkable};
    public static final int[] T = {R.attr.state_checked};
    public static final b U = new b();
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public int F;
    public int G;
    public LinearLayout.LayoutParams H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public d0 M;
    public int N;
    public e O;
    public float P;
    public float Q;
    public g R;

    /* renamed from: i, reason: collision with root package name */
    public final i f1227i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f1228j;

    /* renamed from: k, reason: collision with root package name */
    public c f1229k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1230l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f1231m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f1232n;

    /* renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f1233o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f1234p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f1235q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1236r;

    /* renamed from: s, reason: collision with root package name */
    public String f1237s;

    /* renamed from: t, reason: collision with root package name */
    public int f1238t;

    /* renamed from: u, reason: collision with root package name */
    public int f1239u;

    /* renamed from: v, reason: collision with root package name */
    public int f1240v;

    /* renamed from: w, reason: collision with root package name */
    public int f1241w;

    /* renamed from: x, reason: collision with root package name */
    public int f1242x;

    /* renamed from: y, reason: collision with root package name */
    public int f1243y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1244z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(com.gglhk.bofio.fortunetiger.R.attr.materialButtonStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.gglhk.bofio.fortunetiger.R.attr.materialSizeOverlay}), attributeSet, com.gglhk.bofio.fortunetiger.R.attr.materialButtonStyle);
        this.f1228j = new LinkedHashSet();
        this.f1244z = false;
        this.A = false;
        this.D = Integer.MIN_VALUE;
        this.E = -2.1474836E9f;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.O = e.f3176i;
        Context context2 = getContext();
        TypedArray e4 = a2.p.e(context2, attributeSet, l1.a.f2865k, com.gglhk.bofio.fortunetiger.R.attr.materialButtonStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1241w = e4.getDimensionPixelSize(13, 0);
        int i4 = e4.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1230l = a2.p.f(i4, mode);
        this.f1231m = m.u(getContext(), e4, 15);
        this.f1232n = m.x(getContext(), e4, 11);
        this.B = e4.getInteger(12, 1);
        this.f1238t = e4.getDimensionPixelSize(14, 0);
        this.f1233o = a2.p.f(e4.getInt(22, -1), mode);
        this.f1234p = e4.hasValue(21) ? m.u(getContext(), e4, 21) : this.f1231m;
        this.C = e4.getInteger(20, 3);
        Drawable x3 = m.x(getContext(), e4, 19);
        this.f1235q = x3;
        this.f1236r = x3 == null;
        g2.m g = b0.g(context2, e4, 23);
        g = g == null ? o.f(context2, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.materialButtonStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Button).a() : g;
        boolean z3 = e4.getBoolean(17, false);
        i iVar = new i(this, g);
        this.f1227i = iVar;
        iVar.f3192e = e4.getDimensionPixelOffset(2, 0);
        iVar.f3193f = e4.getDimensionPixelOffset(3, 0);
        iVar.g = e4.getDimensionPixelOffset(4, 0);
        iVar.h = e4.getDimensionPixelOffset(5, 0);
        if (e4.hasValue(9)) {
            int dimensionPixelSize = e4.getDimensionPixelSize(9, -1);
            iVar.f3194i = dimensionPixelSize;
            iVar.f3190b = iVar.f3190b.b(dimensionPixelSize);
            iVar.d();
            iVar.f3203r = true;
        }
        iVar.f3195j = e4.getDimensionPixelSize(26, 0);
        iVar.f3196k = a2.p.f(e4.getInt(8, -1), mode);
        iVar.f3197l = m.u(getContext(), e4, 7);
        iVar.f3198m = m.u(getContext(), e4, 25);
        iVar.f3199n = m.u(getContext(), e4, 18);
        iVar.f3204s = e4.getBoolean(6, false);
        iVar.f3207v = e4.getDimensionPixelSize(10, 0);
        iVar.f3205t = e4.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (e4.hasValue(0)) {
            iVar.f3202q = true;
            setSupportBackgroundTintList(iVar.f3197l);
            setSupportBackgroundTintMode(iVar.f3196k);
        } else {
            iVar.c();
        }
        setPaddingRelative(paddingStart + iVar.f3192e, paddingTop + iVar.g, paddingEnd + iVar.f3193f, paddingBottom + iVar.h);
        setCheckedInternal(e4.getBoolean(1, false));
        if (g instanceof b0) {
            iVar.c = f();
            if (iVar.f3190b instanceof b0) {
                iVar.d();
            }
        }
        setOpticalCenterEnabled(z3);
        e4.recycle();
        setCompoundDrawablePadding(this.f1241w);
        u(this.f1232n != null);
        x(this.f1235q != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.J = materialButton.getOpticalCenterShift();
        materialButton.w();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.P;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        j a4;
        if (this.I && this.K && (a4 = this.f1227i.a(false)) != null) {
            return (int) (a4.h() * 0.11f);
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
        float f4 = 0.0f;
        for (int i4 = 0; i4 < lineCount; i4++) {
            f4 = Math.max(f4, getLayout().getLineWidth(i4));
        }
        return (int) Math.ceil(f4);
    }

    private void setCheckedInternal(boolean z3) {
        if (!k() || this.f1244z == z3) {
            return;
        }
        this.f1244z = z3;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z4 = this.f1244z;
            if (!materialButtonToggleGroup.f1247s) {
                materialButtonToggleGroup.l(getId(), z4);
            }
        }
        if (this.A) {
            return;
        }
        this.A = true;
        Iterator it = this.f1228j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.A = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f4) {
        if (this.P != f4) {
            this.P = f4;
            w();
            invalidate();
            if (getParent() instanceof h) {
                h hVar = (h) getParent();
                int i4 = (int) this.P;
                int indexOfChild = hVar.indexOfChild(this);
                if (indexOfChild < 0) {
                    return;
                }
                MaterialButton h = hVar.h(indexOfChild);
                MaterialButton g = hVar.g(indexOfChild);
                if (h == null && g == null) {
                    return;
                }
                if (h == null) {
                    g.setDisplayedWidthDecrease(i4);
                }
                if (g == null) {
                    h.setDisplayedWidthDecrease(i4);
                }
                if (h == null || g == null) {
                    return;
                }
                h.setDisplayedWidthDecrease(i4 / 2);
                g.setDisplayedWidthDecrease((i4 + 1) / 2);
            }
        }
    }

    public final boolean d() {
        if (m() && p()) {
            return true;
        }
        if (l() && o()) {
            return true;
        }
        return n() && q();
    }

    public final boolean e(int i4) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i4 == 1 || i4 == 3 || (i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final r0.h f() {
        Context context = getContext();
        TypedValue X = d.X(context.getTheme(), com.gglhk.bofio.fortunetiger.R.attr.motionSpringFastSpatial);
        int[] iArr = l1.a.f2875u;
        TypedArray obtainStyledAttributes = X == null ? context.obtainStyledAttributes(null, iArr, 0, com.gglhk.bofio.fortunetiger.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(X.resourceId, iArr);
        r0.h hVar = new r0.h();
        try {
            float f4 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f4 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f5 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f5 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f4 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            hVar.f3167a = Math.sqrt(f4);
            hVar.c = false;
            if (f5 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            hVar.f3168b = f5;
            hVar.c = false;
            obtainStyledAttributes.recycle();
            return hVar;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int g(int i4, int i5) {
        int i6;
        int i7;
        Drawable drawable = this.f1232n;
        if (drawable != null) {
            i6 = this.f1238t;
            if (i6 == 0) {
                i6 = drawable.getIntrinsicWidth();
            }
        } else {
            i6 = 0;
        }
        Drawable drawable2 = this.f1235q;
        if (drawable2 != null) {
            i7 = this.f1238t;
            if (i7 == 0) {
                i7 = drawable2.getIntrinsicWidth();
            }
        } else {
            i7 = 0;
        }
        int textLayoutWidth = (((((i4 - getTextLayoutWidth()) - getPaddingEnd()) - i6) - i7) - this.f1241w) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i5 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f1237s)) {
            return (k() ? CompoundButton.class : Button.class).getName();
        }
        return this.f1237s;
    }

    public int getAllowedWidthDecrease() {
        return this.L;
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
        if (r()) {
            return this.f1227i.f3194i;
        }
        return 0;
    }

    public r0.h getCornerSpringForce() {
        return this.f1227i.c;
    }

    public Drawable getIcon() {
        return this.f1232n;
    }

    public int getIconGravity() {
        return this.B;
    }

    public int getIconPadding() {
        return this.f1241w;
    }

    public int getIconSize() {
        return this.f1238t;
    }

    public ColorStateList getIconTint() {
        return this.f1231m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1230l;
    }

    public int getInsetBottom() {
        return this.f1227i.h;
    }

    public int getInsetLeft() {
        return this.f1227i.f3192e;
    }

    public int getInsetRight() {
        return this.f1227i.f3193f;
    }

    public int getInsetTop() {
        return this.f1227i.g;
    }

    public ColorStateList getRippleColor() {
        if (r()) {
            return this.f1227i.f3199n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.f1235q;
    }

    public int getSecondaryIconGravity() {
        return this.C;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.f1234p;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.f1233o;
    }

    public g2.m getShapeAppearance() {
        if (r()) {
            return this.f1227i.f3190b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
    }

    public o getShapeAppearanceModel() {
        if (r()) {
            return this.f1227i.f3190b.d();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (r()) {
            return this.f1227i.f3198m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (r()) {
            return this.f1227i.f3195j;
        }
        return 0;
    }

    @Override // k.p
    public ColorStateList getSupportBackgroundTintList() {
        return r() ? this.f1227i.f3197l : super.getSupportBackgroundTintList();
    }

    @Override // k.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return r() ? this.f1227i.f3196k : super.getSupportBackgroundTintMode();
    }

    public final int h(int i4, int i5) {
        return Math.max(0, (((((i4 - getTextHeight()) - getPaddingTop()) - i5) - this.f1241w) - getPaddingBottom()) / 2);
    }

    public final Drawable i(int i4) {
        if (i4 == 0) {
            if (this.f1235q == null || !p()) {
                return null;
            }
            return this.f1235q;
        }
        if (i4 == 1) {
            if (this.f1235q == null || !q()) {
                return null;
            }
            return this.f1235q;
        }
        if (i4 == 2 && this.f1235q != null && o()) {
            return this.f1235q;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1244z;
    }

    public final Drawable j(int i4) {
        if (i4 == 0) {
            if (this.f1232n == null || !m()) {
                return null;
            }
            return this.f1232n;
        }
        if (i4 == 1) {
            if (this.f1232n == null || !l()) {
                return null;
            }
            return this.f1232n;
        }
        if (i4 == 2 && this.f1232n != null && l()) {
            return this.f1232n;
        }
        return null;
    }

    public final boolean k() {
        i iVar = this.f1227i;
        return iVar != null && iVar.f3204s;
    }

    public final boolean l() {
        int i4 = this.B;
        return i4 == 3 || i4 == 4;
    }

    public final boolean m() {
        int i4 = this.B;
        return i4 == 1 || i4 == 2;
    }

    public final boolean n() {
        int i4 = this.B;
        return i4 == 16 || i4 == 32;
    }

    public final boolean o() {
        int i4 = this.C;
        return i4 == 3 || i4 == 4;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (r()) {
            m.S(this, this.f1227i.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (k()) {
            View.mergeDrawableStates(onCreateDrawableState, S);
        }
        if (this.f1244z) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        return onCreateDrawableState;
    }

    @Override // k.p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1244z);
    }

    @Override // k.p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setChecked(this.f1244z);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // k.p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8;
        super.onLayout(z3, i4, i5, i6, i7);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
        int i9 = getResources().getConfiguration().orientation;
        if (this.D != i9) {
            this.D = i9;
            this.E = -2.1474836E9f;
        }
        if (this.E == -2.1474836E9f) {
            this.E = getMeasuredWidth();
            if (this.H == null && (getParent() instanceof h) && ((h) getParent()).getButtonSizeChange() != null) {
                this.H = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.H);
                layoutParams.width = (int) this.E;
                setLayoutParams(layoutParams);
            }
        }
        boolean z4 = false;
        if (this.L == Integer.MIN_VALUE) {
            if (this.f1232n == null) {
                i8 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i10 = this.f1238t;
                if (i10 == 0) {
                    i10 = this.f1232n.getIntrinsicWidth();
                }
                i8 = iconPadding + i10;
            }
            this.L = (getMeasuredWidth() - getTextLayoutWidth()) - i8;
        }
        if (this.F == Integer.MIN_VALUE) {
            this.F = getPaddingStart();
        }
        if (this.G == Integer.MIN_VALUE) {
            this.G = getPaddingEnd();
        }
        if ((getParent() instanceof h) && ((h) getParent()).getOrientation() == 0) {
            z4 = true;
        }
        this.K = z4;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r1.d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r1.d dVar = (r1.d) parcelable;
        super.onRestoreInstanceState(dVar.f3016f);
        setChecked(dVar.h);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        r1.d dVar = new r1.d(super.onSaveInstanceState());
        dVar.h = this.f1244z;
        return dVar;
    }

    @Override // k.p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean p() {
        int i4 = this.C;
        return i4 == 1 || i4 == 2;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z3;
        if (isEnabled() && this.f1227i.f3205t) {
            toggle();
            z3 = true;
        } else {
            z3 = false;
        }
        boolean performClick = super.performClick();
        if (z3 && !performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    public final boolean q() {
        int i4 = this.C;
        return i4 == 16 || i4 == 32;
    }

    public final boolean r() {
        i iVar = this.f1227i;
        return (iVar == null || iVar.f3202q) ? false : true;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f1232n != null) {
            if (this.f1232n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
    
        if (r4 == 2) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(boolean z3) {
        int i4;
        if (this.M == null) {
            return;
        }
        if (this.R == null) {
            g gVar = new g(this, U);
            this.R = gVar;
            gVar.f3164j = f();
        }
        if (this.K) {
            int ordinal = this.O.ordinal();
            int i5 = 0;
            int i6 = (ordinal == 1 || ordinal == 2) ? this.N / 2 : ordinal != 3 ? 0 : this.N;
            d0 d0Var = this.M;
            int[] drawableState = getDrawableState();
            int[][] iArr = d0Var.c;
            int i7 = 0;
            while (true) {
                i4 = -1;
                if (i7 >= d0Var.f1838a) {
                    i7 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i7], drawableState)) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = d0Var.c;
                int i8 = 0;
                while (true) {
                    if (i8 >= d0Var.f1838a) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr3[i8], iArr2)) {
                        i4 = i8;
                        break;
                    }
                    i8++;
                }
                i7 = i4;
            }
            c0 c0Var = (c0) (i7 < 0 ? d0Var.f1839b : d0Var.f1840d[i7]).g;
            int width = getWidth();
            float f4 = c0Var.f1837b;
            int i9 = c0Var.f1836a;
            if (i9 == 1) {
                f4 *= width;
            }
            i5 = (int) f4;
            this.R.a(Math.min(i6, i5));
            if (z3) {
                this.R.d();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1237s = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        if (!r()) {
            super.setBackgroundColor(i4);
            return;
        }
        i iVar = this.f1227i;
        if (iVar.a(false) != null) {
            iVar.a(false).setTint(i4);
        }
    }

    @Override // k.p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!r()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        i iVar = this.f1227i;
        iVar.f3202q = true;
        MaterialButton materialButton = iVar.f3189a;
        materialButton.setSupportBackgroundTintList(iVar.f3197l);
        materialButton.setSupportBackgroundTintMode(iVar.f3196k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // k.p, android.view.View
    public void setBackgroundResource(int i4) {
        setBackgroundDrawable(i4 != 0 ? m.w(getContext(), i4) : null);
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
        if (r()) {
            this.f1227i.f3204s = z3;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedInternal(z3);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i4) {
        if (getCompoundDrawablePadding() != i4) {
            this.E = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i4);
    }

    public void setCornerRadius(int i4) {
        if (r()) {
            i iVar = this.f1227i;
            if (iVar.f3203r && iVar.f3194i == i4) {
                return;
            }
            iVar.f3194i = i4;
            iVar.f3203r = true;
            iVar.f3190b = iVar.f3190b.b(i4);
            iVar.d();
        }
    }

    public void setCornerRadiusResource(int i4) {
        if (r()) {
            setCornerRadius(getResources().getDimensionPixelSize(i4));
        }
    }

    public void setCornerSpringForce(r0.h hVar) {
        i iVar = this.f1227i;
        iVar.c = hVar;
        if (iVar.f3190b instanceof b0) {
            iVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i4) {
        this.Q = Math.min(i4, this.L);
        w();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        if (r()) {
            this.f1227i.a(false).p(f4);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1232n == drawable || t(new r1.a(this, drawable, 1))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.f1232n = drawable;
        u(true);
        v(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i4) {
        if (this.B != i4) {
            if (this.f1232n != null && this.f1235q != null && d()) {
                throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
            }
            this.B = i4;
            v(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i4) {
        if (this.f1241w != i4) {
            this.f1241w = i4;
            setCompoundDrawablePadding(i4);
        }
    }

    public void setIconResource(int i4) {
        setIcon(i4 != 0 ? m.w(getContext(), i4) : null);
    }

    public void setIconSize(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1238t == i4 || t(new k(i4, 2, this))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.f1238t = i4;
        u(true);
        x(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1231m != colorStateList) {
            this.f1231m = colorStateList;
            u(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1230l != mode) {
            this.f1230l = mode;
            u(false);
        }
    }

    public void setIconTintResource(int i4) {
        setIconTint(d.D(getContext(), i4));
    }

    public void setInsetBottom(int i4) {
        i iVar = this.f1227i;
        iVar.b(iVar.f3192e, iVar.g, iVar.f3193f, i4);
    }

    public void setInsetLeft(int i4) {
        i iVar = this.f1227i;
        iVar.b(i4, iVar.g, iVar.f3193f, iVar.h);
    }

    public void setInsetRight(int i4) {
        i iVar = this.f1227i;
        iVar.b(iVar.f3192e, iVar.g, i4, iVar.h);
    }

    public void setInsetTop(int i4) {
        i iVar = this.f1227i;
        iVar.b(iVar.f3192e, i4, iVar.f3193f, iVar.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(c cVar) {
        this.f1229k = cVar;
    }

    public void setOpticalCenterEnabled(boolean z3) {
        if (this.I != z3) {
            this.I = z3;
            i iVar = this.f1227i;
            if (z3) {
                j2.z zVar = new j2.z(this);
                iVar.f3191d = zVar;
                j a4 = iVar.a(false);
                if (a4 != null) {
                    a4.I = zVar;
                }
            } else {
                iVar.f3191d = null;
                j a5 = iVar.a(false);
                if (a5 != null) {
                    a5.I = null;
                }
            }
            post(new r(12, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        c cVar = this.f1229k;
        if (cVar != null) {
            ((MaterialButtonToggleGroup) ((r0.a) cVar).f3139f).invalidate();
        }
        super.setPressed(z3);
        s(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (r()) {
            i iVar = this.f1227i;
            MaterialButton materialButton = iVar.f3189a;
            if (iVar.f3199n != colorStateList) {
                iVar.f3199n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(e2.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i4) {
        if (r()) {
            setRippleColor(d.D(getContext(), i4));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.f1235q == drawable || t(new r1.a(this, drawable, 0))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.f1235q = drawable;
        this.f1236r = false;
        x(true);
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i4) {
        if (this.C != i4) {
            if (this.f1235q != null && this.f1232n != null && d()) {
                throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
            }
            this.C = i4;
            y(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setSecondaryIconResource(int i4) {
        setSecondaryIcon(i4 != 0 ? m.w(getContext(), i4) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.f1234p != colorStateList) {
            this.f1234p = colorStateList;
            x(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.f1233o != mode) {
            this.f1233o = mode;
            x(false);
        }
    }

    public void setSecondaryIconTintResource(int i4) {
        setSecondaryIconTint(d.D(getContext(), i4));
    }

    public void setShapeAppearance(g2.m mVar) {
        if (!r()) {
            throw new IllegalStateException("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
        }
        i iVar = this.f1227i;
        if (iVar.c == null && mVar.e()) {
            iVar.c = f();
            if (iVar.f3190b instanceof b0) {
                iVar.d();
            }
        }
        iVar.f3190b = mVar;
        iVar.d();
    }

    @Override // g2.z
    public void setShapeAppearanceModel(o oVar) {
        if (!r()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        i iVar = this.f1227i;
        iVar.f3190b = oVar;
        iVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (r()) {
            i iVar = this.f1227i;
            iVar.f3201p = z3;
            iVar.e();
        }
    }

    public void setSizeChange(d0 d0Var) {
        if (this.M != d0Var) {
            this.M = d0Var;
            s(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (r()) {
            i iVar = this.f1227i;
            if (iVar.f3198m != colorStateList) {
                iVar.f3198m = colorStateList;
                iVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i4) {
        if (r()) {
            setStrokeColor(d.D(getContext(), i4));
        }
    }

    public void setStrokeWidth(int i4) {
        if (r()) {
            i iVar = this.f1227i;
            if (iVar.f3195j != i4) {
                iVar.f3195j = i4;
                iVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i4) {
        if (r()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // k.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!r()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        i iVar = this.f1227i;
        if (iVar.f3197l != colorStateList) {
            iVar.f3197l = colorStateList;
            if (iVar.a(false) != null) {
                iVar.a(false).setTintList(iVar.f3197l);
            }
        }
    }

    @Override // k.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!r()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        i iVar = this.f1227i;
        if (iVar.f3196k != mode) {
            iVar.f3196k = mode;
            if (iVar.a(false) == null || iVar.f3196k == null) {
                return;
            }
            iVar.a(false).setTintMode(iVar.f3196k);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.E = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i4) {
        super.setTextAlignment(i4);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // k.p, android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        this.E = -2.1474836E9f;
        super.setTextAppearance(context, i4);
    }

    @Override // k.p, android.widget.TextView
    public final void setTextSize(int i4, float f4) {
        this.E = -2.1474836E9f;
        super.setTextSize(i4, f4);
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.f1227i.f3205t = z3;
    }

    @Override // android.widget.TextView
    public void setWidth(int i4) {
        this.E = -2.1474836E9f;
        super.setWidth(i4);
    }

    public void setWidthChangeDirection(e eVar) {
        if (this.O != eVar) {
            this.O = eVar;
            s(true);
        }
    }

    public void setWidthChangeMax(int i4) {
        if (this.N != i4) {
            this.N = i4;
            s(true);
        }
    }

    public final boolean t(Runnable runnable) {
        g gVar = this.R;
        if (gVar == null || !gVar.f3161e) {
            return false;
        }
        post(new n(this, runnable, 3));
        return true;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1244z);
    }

    public final void u(boolean z3) {
        Drawable drawable = this.f1232n;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f1232n = mutate;
            mutate.setTintList(this.f1231m);
            PorterDuff.Mode mode = this.f1230l;
            if (mode != null) {
                this.f1232n.setTintMode(mode);
            }
            int i4 = this.f1238t;
            if (i4 == 0) {
                i4 = this.f1232n.getIntrinsicWidth();
            }
            int i5 = this.f1238t;
            if (i5 == 0) {
                i5 = this.f1232n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1232n;
            int i6 = this.f1239u;
            int i7 = this.f1240v;
            drawable2.setBounds(i6, i7, i4 + i6, i5 + i7);
            this.f1232n.setVisible(true, z3);
        }
        if (this.f1232n != null && this.f1235q != null && d()) {
            throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
        }
        if (this.f1232n == null && this.f1235q != null && d()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z4 = (m() && compoundDrawablesRelative[0] != this.f1232n) || (l() && compoundDrawablesRelative[2] != this.f1232n) || (n() && compoundDrawablesRelative[1] != this.f1232n);
        if (z3 || z4) {
            if (m()) {
                setCompoundDrawablesRelative(this.f1232n, i(1), i(2), null);
            } else if (l()) {
                setCompoundDrawablesRelative(i(0), i(1), this.f1232n, null);
            } else if (n()) {
                setCompoundDrawablesRelative(i(0), this.f1232n, i(2), null);
            }
        }
    }

    public final void v(int i4, int i5) {
        if (this.f1232n == null || getLayout() == null) {
            return;
        }
        if (m() || l()) {
            this.f1240v = 0;
            if (e(this.B)) {
                this.f1239u = 0;
                u(false);
                return;
            }
            int g = g(i4, this.B);
            if (this.f1239u != g) {
                this.f1239u = g;
                u(false);
                return;
            }
            return;
        }
        if (n()) {
            this.f1239u = 0;
            if (this.B == 16) {
                this.f1240v = 0;
                u(false);
                return;
            }
            int i6 = this.f1238t;
            if (i6 == 0) {
                i6 = this.f1232n.getIntrinsicHeight();
            }
            int h = h(i5, i6);
            if (this.f1240v != h) {
                this.f1240v = h;
                u(false);
            }
        }
    }

    public final void w() {
        int i4 = (int) (this.P - this.Q);
        int i5 = (i4 / 2) + (getLayoutDirection() == 1 ? -this.J : this.J);
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.E + i4);
        }
        setPaddingRelative(this.F + i5, getPaddingTop(), (this.G + i4) - i5, getPaddingBottom());
    }

    public final void x(boolean z3) {
        Drawable drawable = this.f1235q;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f1235q = mutate;
            mutate.setTintList(this.f1234p);
            PorterDuff.Mode mode = this.f1233o;
            if (mode != null) {
                this.f1235q.setTintMode(mode);
            }
            int i4 = this.f1238t;
            if (i4 == 0) {
                i4 = this.f1235q.getIntrinsicWidth();
            }
            int i5 = this.f1238t;
            if (i5 == 0) {
                i5 = this.f1235q.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1235q;
            int i6 = this.f1242x;
            int i7 = this.f1243y;
            drawable2.setBounds(i6, i7, i4 + i6, i5 + i7);
            this.f1235q.setVisible(true, z3);
        }
        if (this.f1235q != null && this.f1232n != null && d()) {
            throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
        }
        if (this.f1235q == null) {
            if (this.f1236r) {
                return;
            }
            if (this.f1232n != null && d()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z4 = (p() && compoundDrawablesRelative[0] != this.f1235q) || (o() && compoundDrawablesRelative[2] != this.f1235q) || (q() && compoundDrawablesRelative[1] != this.f1235q);
        if (z3 || z4) {
            if (p()) {
                setCompoundDrawablesRelative(this.f1235q, j(1), j(2), null);
            } else if (o()) {
                setCompoundDrawablesRelative(j(0), j(1), this.f1235q, null);
            } else if (q()) {
                setCompoundDrawablesRelative(j(0), this.f1235q, j(2), null);
            }
        }
    }

    public final void y(int i4, int i5) {
        if (this.f1235q == null || getLayout() == null) {
            return;
        }
        if (p() || o()) {
            this.f1243y = 0;
            if (e(this.C)) {
                this.f1242x = 0;
                x(false);
                return;
            }
            int g = g(i4, this.C);
            if (this.f1242x != g) {
                this.f1242x = g;
                x(false);
                return;
            }
            return;
        }
        if (q()) {
            this.f1242x = 0;
            if (this.C == 16) {
                this.f1243y = 0;
                x(false);
                return;
            }
            int i6 = this.f1238t;
            if (i6 == 0) {
                i6 = this.f1235q.getIntrinsicHeight();
            }
            int h = h(i5, i6);
            if (this.f1243y != h) {
                this.f1243y = h;
                x(false);
            }
        }
    }
}
