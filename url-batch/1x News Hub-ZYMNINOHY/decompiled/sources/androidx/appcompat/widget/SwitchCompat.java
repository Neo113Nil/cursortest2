package androidx.appcompat.widget;

import A0.f;
import E.A;
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
import g.AbstractC0328a;
import h.AbstractC0337a;
import i.C0340a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.lang.reflect.Field;
import l.AbstractC1103z;
import l.C1097t;
import l.g0;
import l.w0;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: M, reason: collision with root package name */
    public static final g0 f2091M = new g0(Float.class, "thumbPos");

    /* renamed from: N, reason: collision with root package name */
    public static final int[] f2092N = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f2093A;

    /* renamed from: B, reason: collision with root package name */
    public int f2094B;

    /* renamed from: C, reason: collision with root package name */
    public int f2095C;

    /* renamed from: D, reason: collision with root package name */
    public int f2096D;

    /* renamed from: E, reason: collision with root package name */
    public int f2097E;

    /* renamed from: F, reason: collision with root package name */
    public final TextPaint f2098F;

    /* renamed from: G, reason: collision with root package name */
    public final ColorStateList f2099G;

    /* renamed from: H, reason: collision with root package name */
    public StaticLayout f2100H;

    /* renamed from: I, reason: collision with root package name */
    public StaticLayout f2101I;

    /* renamed from: J, reason: collision with root package name */
    public final C0340a f2102J;

    /* renamed from: K, reason: collision with root package name */
    public ObjectAnimator f2103K;
    public final Rect L;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f2104a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f2105b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f2106c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2107d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2108e;
    public Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2109g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2110h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2111i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2112j;

    /* renamed from: k, reason: collision with root package name */
    public int f2113k;

    /* renamed from: l, reason: collision with root package name */
    public int f2114l;

    /* renamed from: m, reason: collision with root package name */
    public int f2115m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2116n;
    public CharSequence o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f2117p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2118q;

    /* renamed from: r, reason: collision with root package name */
    public int f2119r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2120s;

    /* renamed from: t, reason: collision with root package name */
    public float f2121t;

    /* renamed from: u, reason: collision with root package name */
    public float f2122u;
    public final VelocityTracker v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2123w;

    /* renamed from: x, reason: collision with root package name */
    public float f2124x;

    /* renamed from: y, reason: collision with root package name */
    public int f2125y;
    public int z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
    
        if (r9 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.fc.barca.football.R.attr.switchStyle);
        ColorStateList colorStateList;
        int resourceId;
        this.f2105b = null;
        this.f2106c = null;
        this.f2107d = false;
        this.f2108e = false;
        this.f2109g = null;
        this.f2110h = null;
        this.f2111i = false;
        this.f2112j = false;
        this.v = VelocityTracker.obtain();
        this.L = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f2098F = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        f K2 = f.K(context, attributeSet, AbstractC0328a.f5004r, com.fc.barca.football.R.attr.switchStyle);
        Drawable C3 = K2.C(2);
        this.f2104a = C3;
        if (C3 != null) {
            C3.setCallback(this);
        }
        Drawable C4 = K2.C(11);
        this.f = C4;
        if (C4 != null) {
            C4.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) K2.f24c;
        this.o = typedArray.getText(0);
        this.f2117p = typedArray.getText(1);
        this.f2118q = typedArray.getBoolean(3, true);
        this.f2113k = typedArray.getDimensionPixelSize(8, 0);
        this.f2114l = typedArray.getDimensionPixelSize(5, 0);
        this.f2115m = typedArray.getDimensionPixelSize(6, 0);
        this.f2116n = typedArray.getBoolean(4, false);
        ColorStateList B3 = K2.B(9);
        if (B3 != null) {
            this.f2105b = B3;
            this.f2107d = true;
        }
        PorterDuff.Mode c3 = AbstractC1103z.c(typedArray.getInt(10, -1), null);
        if (this.f2106c != c3) {
            this.f2106c = c3;
            this.f2108e = true;
        }
        if (this.f2107d || this.f2108e) {
            a();
        }
        ColorStateList B4 = K2.B(12);
        if (B4 != null) {
            this.f2109g = B4;
            this.f2111i = true;
        }
        PorterDuff.Mode c4 = AbstractC1103z.c(typedArray.getInt(13, -1), null);
        if (this.f2110h != c4) {
            this.f2110h = c4;
            this.f2112j = true;
        }
        if (this.f2111i || this.f2112j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0328a.f5005s);
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) != 0) {
                Object obj = AbstractC0337a.f5053a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList != null) {
                this.f2099G = colorStateList;
            } else {
                this.f2099G = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i3 = obtainStyledAttributes.getInt(1, -1);
            int i4 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i3 != 1 ? i3 != 2 ? i3 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i4 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
                setSwitchTypeface(defaultFromStyle);
                int i5 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i4;
                textPaint.setFakeBoldText((i5 & 1) != 0);
                textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0340a c0340a = new C0340a();
                c0340a.f5072a = context2.getResources().getConfiguration().locale;
                this.f2102J = c0340a;
            } else {
                this.f2102J = null;
            }
            obtainStyledAttributes.recycle();
        }
        new C1097t(this).d(attributeSet, com.fc.barca.football.R.attr.switchStyle);
        K2.O();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2120s = viewConfiguration.getScaledTouchSlop();
        this.f2123w = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f2124x > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((w0.a(this) ? 1.0f - this.f2124x : this.f2124x) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.L;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f2104a;
        Rect b3 = drawable2 != null ? AbstractC1103z.b(drawable2) : AbstractC1103z.f9932a;
        return ((((this.f2125y - this.f2093A) - rect.left) - rect.right) - b3.left) - b3.right;
    }

    public final void a() {
        Drawable drawable = this.f2104a;
        if (drawable != null) {
            if (this.f2107d || this.f2108e) {
                Drawable mutate = drawable.mutate();
                this.f2104a = mutate;
                if (this.f2107d) {
                    mutate.setTintList(this.f2105b);
                }
                if (this.f2108e) {
                    this.f2104a.setTintMode(this.f2106c);
                }
                if (this.f2104a.isStateful()) {
                    this.f2104a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.f2111i || this.f2112j) {
                Drawable mutate = drawable.mutate();
                this.f = mutate;
                if (this.f2111i) {
                    mutate.setTintList(this.f2109g);
                }
                if (this.f2112j) {
                    this.f.setTintMode(this.f2110h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        C0340a c0340a = this.f2102J;
        if (c0340a != null) {
            charSequence = c0340a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f2098F, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        int i4;
        int i5 = this.f2094B;
        int i6 = this.f2095C;
        int i7 = this.f2096D;
        int i8 = this.f2097E;
        int thumbOffset = getThumbOffset() + i5;
        Drawable drawable = this.f2104a;
        Rect b3 = drawable != null ? AbstractC1103z.b(drawable) : AbstractC1103z.f9932a;
        Drawable drawable2 = this.f;
        Rect rect = this.L;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i9 = rect.left;
            thumbOffset += i9;
            if (b3 != null) {
                int i10 = b3.left;
                if (i10 > i9) {
                    i5 += i10 - i9;
                }
                int i11 = b3.top;
                int i12 = rect.top;
                i3 = i11 > i12 ? (i11 - i12) + i6 : i6;
                int i13 = b3.right;
                int i14 = rect.right;
                if (i13 > i14) {
                    i7 -= i13 - i14;
                }
                int i15 = b3.bottom;
                int i16 = rect.bottom;
                if (i15 > i16) {
                    i4 = i8 - (i15 - i16);
                    this.f.setBounds(i5, i3, i7, i4);
                }
            } else {
                i3 = i6;
            }
            i4 = i8;
            this.f.setBounds(i5, i3, i7, i4);
        }
        Drawable drawable3 = this.f2104a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i17 = thumbOffset - rect.left;
            int i18 = thumbOffset + this.f2093A + rect.right;
            this.f2104a.setBounds(i17, i6, i18, i8);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i17, i6, i18, i8);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f3) {
        super.drawableHotspotChanged(f, f3);
        Drawable drawable = this.f2104a;
        if (drawable != null) {
            drawable.setHotspot(f, f3);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2104a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!w0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2125y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f2115m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (w0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2125y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f2115m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f2118q;
    }

    public boolean getSplitTrack() {
        return this.f2116n;
    }

    public int getSwitchMinWidth() {
        return this.f2114l;
    }

    public int getSwitchPadding() {
        return this.f2115m;
    }

    public CharSequence getTextOff() {
        return this.f2117p;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.f2104a;
    }

    public int getThumbTextPadding() {
        return this.f2113k;
    }

    public ColorStateList getThumbTintList() {
        return this.f2105b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f2106c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.f2109g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f2110h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2104a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f2103K;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f2103K.end();
        this.f2103K = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2092N);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f;
        Rect rect = this.L;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.f2095C;
        int i4 = this.f2097E;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f2104a;
        if (drawable != null) {
            if (!this.f2116n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b3 = AbstractC1103z.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b3.left;
                rect.right -= b3.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f2100H : this.f2101I;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f2099G;
            TextPaint textPaint = this.f2098F;
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
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i5 + i6) / 2) - (staticLayout.getHeight() / 2));
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
        CharSequence charSequence = isChecked() ? this.o : this.f2117p;
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
    public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int width;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i3, i4, i5, i6);
        int i11 = 0;
        if (this.f2104a != null) {
            Drawable drawable = this.f;
            Rect rect = this.L;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b3 = AbstractC1103z.b(this.f2104a);
            i7 = Math.max(0, b3.left - rect.left);
            i11 = Math.max(0, b3.right - rect.right);
        } else {
            i7 = 0;
        }
        if (w0.a(this)) {
            i8 = getPaddingLeft() + i7;
            width = ((this.f2125y + i8) - i7) - i11;
        } else {
            width = (getWidth() - getPaddingRight()) - i11;
            i8 = (width - this.f2125y) + i7 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i12 = this.z;
            int i13 = height - (i12 / 2);
            i9 = i12 + i13;
            i10 = i13;
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i9 = this.z + i10;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.z;
        }
        this.f2094B = i8;
        this.f2095C = i10;
        this.f2097E = i9;
        this.f2096D = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (this.f2118q) {
            if (this.f2100H == null) {
                this.f2100H = c(this.o);
            }
            if (this.f2101I == null) {
                this.f2101I = c(this.f2117p);
            }
        }
        Drawable drawable = this.f2104a;
        int i8 = 0;
        Rect rect = this.L;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.f2104a.getIntrinsicWidth() - rect.left) - rect.right;
            i6 = this.f2104a.getIntrinsicHeight();
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (this.f2118q) {
            i7 = (this.f2113k * 2) + Math.max(this.f2100H.getWidth(), this.f2101I.getWidth());
        } else {
            i7 = 0;
        }
        this.f2093A = Math.max(i7, i5);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i8 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.f2104a;
        if (drawable3 != null) {
            Rect b3 = AbstractC1103z.b(drawable3);
            i9 = Math.max(i9, b3.left);
            i10 = Math.max(i10, b3.right);
        }
        int max = Math.max(this.f2114l, (this.f2093A * 2) + i9 + i10);
        int max2 = Math.max(i8, i6);
        this.f2125y = max;
        this.z = max2;
        super.onMeasure(i3, i4);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.o : this.f2117p;
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
        boolean z;
        VelocityTracker velocityTracker = this.v;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.f2120s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i4 = this.f2119r;
                    if (i4 == 1) {
                        float x3 = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        float f = i3;
                        if (Math.abs(x3 - this.f2121t) > f || Math.abs(y3 - this.f2122u) > f) {
                            this.f2119r = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f2121t = x3;
                            this.f2122u = y3;
                            return true;
                        }
                    } else if (i4 == 2) {
                        float x4 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x4 - this.f2121t;
                        float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > 0.0f ? 1.0f : -1.0f;
                        if (w0.a(this)) {
                            f4 = -f4;
                        }
                        float f5 = this.f2124x;
                        float f6 = f4 + f5;
                        float f7 = f6 >= 0.0f ? f6 > 1.0f ? 1.0f : f6 : 0.0f;
                        if (f7 != f5) {
                            this.f2121t = x4;
                            setThumbPosition(f7);
                        }
                        return true;
                    }
                }
            }
            if (this.f2119r == 2) {
                this.f2119r = 0;
                boolean z2 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z2) {
                    velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                    float xVelocity = velocityTracker.getXVelocity();
                    z = Math.abs(xVelocity) > ((float) this.f2123w) ? !w0.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
                } else {
                    z = isChecked;
                }
                if (z != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f2119r = 0;
            velocityTracker.clear();
        } else {
            float x5 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (isEnabled() && this.f2104a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f2104a;
                Rect rect = this.L;
                drawable.getPadding(rect);
                int i5 = this.f2095C - i3;
                int i6 = (this.f2094B + thumbOffset) - i3;
                int i7 = this.f2093A + i6 + rect.left + rect.right + i3;
                int i8 = this.f2097E + i3;
                if (x5 > i6 && x5 < i7 && y4 > i5 && y4 < i8) {
                    this.f2119r = 1;
                    this.f2121t = x5;
                    this.f2122u = y4;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() != null) {
            Field field = A.f243a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f2091M, isChecked ? 1.0f : 0.0f);
                this.f2103K = ofFloat;
                ofFloat.setDuration(250L);
                this.f2103K.setAutoCancel(true);
                this.f2103K.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f2103K;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.W(callback, this));
    }

    public void setShowText(boolean z) {
        if (this.f2118q != z) {
            this.f2118q = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f2116n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i3) {
        this.f2114l = i3;
        requestLayout();
    }

    public void setSwitchPadding(int i3) {
        this.f2115m = i3;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f2098F;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f2117p = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.o = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2104a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2104a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f2124x = f;
        invalidate();
    }

    public void setThumbResource(int i3) {
        setThumbDrawable(AbstractC0337a.a(getContext(), i3));
    }

    public void setThumbTextPadding(int i3) {
        this.f2113k = i3;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2105b = colorStateList;
        this.f2107d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f2106c = mode;
        this.f2108e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i3) {
        setTrackDrawable(AbstractC0337a.a(getContext(), i3));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2109g = colorStateList;
        this.f2111i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f2110h = mode;
        this.f2112j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2104a || drawable == this.f;
    }
}
