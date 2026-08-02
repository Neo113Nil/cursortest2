package androidx.appcompat.widget;

import A.z;
import B0.C0031i;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import c.AbstractC0165a;
import g.C0188a;
import j.A;
import j.C0244u;
import j.i0;
import j.y0;
import java.lang.reflect.Field;
import u.AbstractC0309a;
import w0.j;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: Q, reason: collision with root package name */
    public static final i0 f1469Q = new i0(Float.class, "thumbPos");

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f1470R = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public final int f1471A;

    /* renamed from: B, reason: collision with root package name */
    public float f1472B;

    /* renamed from: C, reason: collision with root package name */
    public int f1473C;

    /* renamed from: D, reason: collision with root package name */
    public int f1474D;

    /* renamed from: E, reason: collision with root package name */
    public int f1475E;

    /* renamed from: F, reason: collision with root package name */
    public int f1476F;

    /* renamed from: G, reason: collision with root package name */
    public int f1477G;

    /* renamed from: H, reason: collision with root package name */
    public int f1478H;

    /* renamed from: I, reason: collision with root package name */
    public int f1479I;
    public final TextPaint J;

    /* renamed from: K, reason: collision with root package name */
    public final ColorStateList f1480K;

    /* renamed from: L, reason: collision with root package name */
    public StaticLayout f1481L;

    /* renamed from: M, reason: collision with root package name */
    public StaticLayout f1482M;

    /* renamed from: N, reason: collision with root package name */
    public final C0188a f1483N;

    /* renamed from: O, reason: collision with root package name */
    public ObjectAnimator f1484O;

    /* renamed from: P, reason: collision with root package name */
    public final Rect f1485P;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1486e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f1487f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1488g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1489h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1490i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1491j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1492k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1493l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1494m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1495n;

    /* renamed from: o, reason: collision with root package name */
    public int f1496o;

    /* renamed from: p, reason: collision with root package name */
    public int f1497p;

    /* renamed from: q, reason: collision with root package name */
    public int f1498q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1499r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1500s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f1501t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1502u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1503w;

    /* renamed from: x, reason: collision with root package name */
    public float f1504x;

    /* renamed from: y, reason: collision with root package name */
    public float f1505y;

    /* renamed from: z, reason: collision with root package name */
    public final VelocityTracker f1506z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.neptunesoft.languesbacdz.R.attr.switchStyle);
        int resourceId;
        this.f1487f = null;
        this.f1488g = null;
        this.f1489h = false;
        this.f1490i = false;
        this.f1492k = null;
        this.f1493l = null;
        this.f1494m = false;
        this.f1495n = false;
        this.f1506z = VelocityTracker.obtain();
        this.f1485P = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C0031i J = C0031i.J(context, attributeSet, AbstractC0165a.f1980r, com.neptunesoft.languesbacdz.R.attr.switchStyle);
        Drawable A2 = J.A(2);
        this.f1486e = A2;
        if (A2 != null) {
            A2.setCallback(this);
        }
        Drawable A3 = J.A(11);
        this.f1491j = A3;
        if (A3 != null) {
            A3.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) J.f154f;
        this.f1500s = typedArray.getText(0);
        this.f1501t = typedArray.getText(1);
        this.f1502u = typedArray.getBoolean(3, true);
        this.f1496o = typedArray.getDimensionPixelSize(8, 0);
        this.f1497p = typedArray.getDimensionPixelSize(5, 0);
        this.f1498q = typedArray.getDimensionPixelSize(6, 0);
        this.f1499r = typedArray.getBoolean(4, false);
        ColorStateList z2 = J.z(9);
        if (z2 != null) {
            this.f1487f = z2;
            this.f1489h = true;
        }
        PorterDuff.Mode d2 = A.d(typedArray.getInt(10, -1), null);
        if (this.f1488g != d2) {
            this.f1488g = d2;
            this.f1490i = true;
        }
        if (this.f1489h || this.f1490i) {
            a();
        }
        ColorStateList z3 = J.z(12);
        if (z3 != null) {
            this.f1492k = z3;
            this.f1494m = true;
        }
        PorterDuff.Mode d3 = A.d(typedArray.getInt(13, -1), null);
        if (this.f1493l != d3) {
            this.f1493l = d3;
            this.f1495n = true;
        }
        if (this.f1494m || this.f1495n) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0165a.f1981s);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = d.b.b(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f1480K = colorStateList;
            } else {
                this.f1480K = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes.getInt(1, -1);
            int i3 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i3 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(defaultFromStyle);
                int i4 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0188a c0188a = new C0188a();
                c0188a.f2222a = context2.getResources().getConfiguration().locale;
                this.f1483N = c0188a;
            } else {
                this.f1483N = null;
            }
            obtainStyledAttributes.recycle();
        }
        new C0244u(this).d(attributeSet, com.neptunesoft.languesbacdz.R.attr.switchStyle);
        J.N();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1503w = viewConfiguration.getScaledTouchSlop();
        this.f1471A = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f1472B > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((y0.a(this) ? 1.0f - this.f1472B : this.f1472B) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1491j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1485P;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1486e;
        Rect c2 = drawable2 != null ? A.c(drawable2) : A.f2831c;
        return ((((this.f1473C - this.f1475E) - rect.left) - rect.right) - c2.left) - c2.right;
    }

    public final void a() {
        Drawable drawable = this.f1486e;
        if (drawable != null) {
            if (this.f1489h || this.f1490i) {
                Drawable mutate = j.c(drawable).mutate();
                this.f1486e = mutate;
                if (this.f1489h) {
                    AbstractC0309a.h(mutate, this.f1487f);
                }
                if (this.f1490i) {
                    AbstractC0309a.i(this.f1486e, this.f1488g);
                }
                if (this.f1486e.isStateful()) {
                    this.f1486e.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1491j;
        if (drawable != null) {
            if (this.f1494m || this.f1495n) {
                Drawable mutate = j.c(drawable).mutate();
                this.f1491j = mutate;
                if (this.f1494m) {
                    AbstractC0309a.h(mutate, this.f1492k);
                }
                if (this.f1495n) {
                    AbstractC0309a.i(this.f1491j, this.f1493l);
                }
                if (this.f1491j.isStateful()) {
                    this.f1491j.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        C0188a c0188a = this.f1483N;
        if (c0188a != null) {
            charSequence = c0188a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.J, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4 = this.f1476F;
        int i5 = this.f1477G;
        int i6 = this.f1478H;
        int i7 = this.f1479I;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f1486e;
        Rect c2 = drawable != null ? A.c(drawable) : A.f2831c;
        Drawable drawable2 = this.f1491j;
        Rect rect = this.f1485P;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (c2 != null) {
                int i9 = c2.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = c2.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = c2.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = c2.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.f1491j.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f1491j.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f1486e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.f1475E + rect.right;
            this.f1486e.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0309a.f(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f1486e;
        if (drawable != null) {
            AbstractC0309a.e(drawable, f2, f3);
        }
        Drawable drawable2 = this.f1491j;
        if (drawable2 != null) {
            AbstractC0309a.e(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1486e;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1491j;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!y0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1473C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1498q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (y0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1473C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1498q : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1502u;
    }

    public boolean getSplitTrack() {
        return this.f1499r;
    }

    public int getSwitchMinWidth() {
        return this.f1497p;
    }

    public int getSwitchPadding() {
        return this.f1498q;
    }

    public CharSequence getTextOff() {
        return this.f1501t;
    }

    public CharSequence getTextOn() {
        return this.f1500s;
    }

    public Drawable getThumbDrawable() {
        return this.f1486e;
    }

    public int getThumbTextPadding() {
        return this.f1496o;
    }

    public ColorStateList getThumbTintList() {
        return this.f1487f;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1488g;
    }

    public Drawable getTrackDrawable() {
        return this.f1491j;
    }

    public ColorStateList getTrackTintList() {
        return this.f1492k;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1493l;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1486e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1491j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1484O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1484O.end();
        this.f1484O = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1470R);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1491j;
        Rect rect = this.f1485P;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1477G;
        int i3 = this.f1479I;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1486e;
        if (drawable != null) {
            if (!this.f1499r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c2 = A.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c2.left;
                rect.right -= c2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1481L : this.f1482M;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1480K;
            TextPaint textPaint = this.J;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i4 + i5) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f1500s : this.f1501t;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int width;
        int i7;
        int i8;
        int i9;
        super.onLayout(z2, i2, i3, i4, i5);
        int i10 = 0;
        if (this.f1486e != null) {
            Drawable drawable = this.f1491j;
            Rect rect = this.f1485P;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c2 = A.c(this.f1486e);
            i6 = Math.max(0, c2.left - rect.left);
            i10 = Math.max(0, c2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (y0.a(this)) {
            i7 = getPaddingLeft() + i6;
            width = ((this.f1473C + i7) - i6) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i7 = (width - this.f1473C) + i6 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i11 = this.f1474D;
            int i12 = height - (i11 / 2);
            i8 = i11 + i12;
            i9 = i12;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f1474D + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1474D;
        }
        this.f1476F = i7;
        this.f1477G = i9;
        this.f1479I = i8;
        this.f1478H = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.f1502u) {
            if (this.f1481L == null) {
                this.f1481L = c(this.f1500s);
            }
            if (this.f1482M == null) {
                this.f1482M = c(this.f1501t);
            }
        }
        Drawable drawable = this.f1486e;
        int i7 = 0;
        Rect rect = this.f1485P;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1486e.getIntrinsicWidth() - rect.left) - rect.right;
            i5 = this.f1486e.getIntrinsicHeight();
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (this.f1502u) {
            i6 = (this.f1496o * 2) + Math.max(this.f1481L.getWidth(), this.f1482M.getWidth());
        } else {
            i6 = 0;
        }
        this.f1475E = Math.max(i6, i4);
        Drawable drawable2 = this.f1491j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f1491j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f1486e;
        if (drawable3 != null) {
            Rect c2 = A.c(drawable3);
            i8 = Math.max(i8, c2.left);
            i9 = Math.max(i9, c2.right);
        }
        int max = Math.max(this.f1497p, (this.f1475E * 2) + i8 + i9);
        int max2 = Math.max(i7, i5);
        this.f1473C = max;
        this.f1474D = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1500s : this.f1501t;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        VelocityTracker velocityTracker = this.f1506z;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f1503w;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i3 = this.v;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        float f2 = i2;
                        if (Math.abs(x2 - this.f1504x) > f2 || Math.abs(y2 - this.f1505y) > f2) {
                            this.v = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f1504x = x2;
                            this.f1505y = y2;
                            return true;
                        }
                    } else if (i3 == 2) {
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x3 - this.f1504x;
                        float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > 0.0f ? 1.0f : -1.0f;
                        if (y0.a(this)) {
                            f4 = -f4;
                        }
                        float f5 = this.f1472B;
                        float f6 = f4 + f5;
                        float f7 = f6 >= 0.0f ? f6 > 1.0f ? 1.0f : f6 : 0.0f;
                        if (f7 != f5) {
                            this.f1504x = x3;
                            setThumbPosition(f7);
                        }
                        return true;
                    }
                }
            }
            if (this.v == 2) {
                this.v = 0;
                boolean z3 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z3) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    z2 = Math.abs(xVelocity) > ((float) this.f1471A) ? !y0.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
                } else {
                    z2 = isChecked;
                }
                if (z2 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z2);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.v = 0;
            velocityTracker.clear();
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f1486e != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f1486e;
                Rect rect = this.f1485P;
                drawable.getPadding(rect);
                int i4 = this.f1477G - i2;
                int i5 = (this.f1476F + thumbOffset) - i2;
                int i6 = this.f1475E + i5 + rect.left + rect.right + i2;
                int i7 = this.f1479I + i2;
                if (x4 > i5 && x4 < i6 && y3 > i4 && y3 < i7) {
                    this.v = 1;
                    this.f1504x = x4;
                    this.f1505y = y3;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        if (getWindowToken() != null) {
            Field field = z.f58a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1469Q, isChecked ? 1.0f : 0.0f);
                this.f1484O = ofFloat;
                ofFloat.setDuration(250L);
                this.f1484O.setAutoCancel(true);
                this.f1484O.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1484O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i1.a.J(callback, this));
    }

    public void setShowText(boolean z2) {
        if (this.f1502u != z2) {
            this.f1502u = z2;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f1499r = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f1497p = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f1498q = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.J;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1501t = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1500s = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1486e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1486e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f1472B = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(d.b.c(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f1496o = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1487f = colorStateList;
        this.f1489h = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1488g = mode;
        this.f1490i = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1491j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1491j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(d.b.c(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1492k = colorStateList;
        this.f1494m = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1493l = mode;
        this.f1495n = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1486e || drawable == this.f1491j;
    }
}
