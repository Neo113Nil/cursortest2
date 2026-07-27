package androidx.appcompat.widget;

import B4.i;
import E.G;
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
import g.AbstractC0444a;
import h.AbstractC0477a;
import i.C0492a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.lang.reflect.Field;
import l.AbstractC1250w;
import l.e0;
import l.r;
import l.t0;
import u1.AbstractC1477a;
import y.AbstractC1550a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: T, reason: collision with root package name */
    public static final e0 f4217T = new e0(Float.class, "thumbPos");

    /* renamed from: U, reason: collision with root package name */
    public static final int[] f4218U = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f4219A;

    /* renamed from: B, reason: collision with root package name */
    public int f4220B;

    /* renamed from: C, reason: collision with root package name */
    public int f4221C;

    /* renamed from: D, reason: collision with root package name */
    public int f4222D;

    /* renamed from: E, reason: collision with root package name */
    public int f4223E;

    /* renamed from: F, reason: collision with root package name */
    public final TextPaint f4224F;

    /* renamed from: G, reason: collision with root package name */
    public final ColorStateList f4225G;

    /* renamed from: H, reason: collision with root package name */
    public StaticLayout f4226H;

    /* renamed from: I, reason: collision with root package name */
    public StaticLayout f4227I;

    /* renamed from: J, reason: collision with root package name */
    public final C0492a f4228J;

    /* renamed from: K, reason: collision with root package name */
    public ObjectAnimator f4229K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f4230L;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f4231a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f4232b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f4233c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4234d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4235e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4236f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4237g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4238h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4239i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4240j;

    /* renamed from: k, reason: collision with root package name */
    public int f4241k;

    /* renamed from: l, reason: collision with root package name */
    public int f4242l;

    /* renamed from: m, reason: collision with root package name */
    public int f4243m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4244n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f4245o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f4246p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4247q;

    /* renamed from: r, reason: collision with root package name */
    public int f4248r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4249s;

    /* renamed from: t, reason: collision with root package name */
    public float f4250t;

    /* renamed from: u, reason: collision with root package name */
    public float f4251u;

    /* renamed from: v, reason: collision with root package name */
    public final VelocityTracker f4252v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4253w;

    /* renamed from: x, reason: collision with root package name */
    public float f4254x;

    /* renamed from: y, reason: collision with root package name */
    public int f4255y;
    public int z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
    
        if (r9 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.chickyneer.roadway.R.attr.switchStyle);
        ColorStateList colorStateList;
        int resourceId;
        this.f4232b = null;
        this.f4233c = null;
        this.f4234d = false;
        this.f4235e = false;
        this.f4237g = null;
        this.f4238h = null;
        this.f4239i = false;
        this.f4240j = false;
        this.f4252v = VelocityTracker.obtain();
        this.f4230L = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f4224F = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        i M5 = i.M(context, attributeSet, AbstractC0444a.f5710r, com.chickyneer.roadway.R.attr.switchStyle);
        Drawable F2 = M5.F(2);
        this.f4231a = F2;
        if (F2 != null) {
            F2.setCallback(this);
        }
        Drawable F5 = M5.F(11);
        this.f4236f = F5;
        if (F5 != null) {
            F5.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) M5.f312c;
        this.f4245o = typedArray.getText(0);
        this.f4246p = typedArray.getText(1);
        this.f4247q = typedArray.getBoolean(3, true);
        this.f4241k = typedArray.getDimensionPixelSize(8, 0);
        this.f4242l = typedArray.getDimensionPixelSize(5, 0);
        this.f4243m = typedArray.getDimensionPixelSize(6, 0);
        this.f4244n = typedArray.getBoolean(4, false);
        ColorStateList E5 = M5.E(9);
        if (E5 != null) {
            this.f4232b = E5;
            this.f4234d = true;
        }
        PorterDuff.Mode c2 = AbstractC1250w.c(typedArray.getInt(10, -1), null);
        if (this.f4233c != c2) {
            this.f4233c = c2;
            this.f4235e = true;
        }
        if (this.f4234d || this.f4235e) {
            a();
        }
        ColorStateList E6 = M5.E(12);
        if (E6 != null) {
            this.f4237g = E6;
            this.f4239i = true;
        }
        PorterDuff.Mode c6 = AbstractC1250w.c(typedArray.getInt(13, -1), null);
        if (this.f4238h != c6) {
            this.f4238h = c6;
            this.f4240j = true;
        }
        if (this.f4239i || this.f4240j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0444a.f5711s);
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) != 0) {
                Object obj = AbstractC0477a.f5759a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList != null) {
                this.f4225G = colorStateList;
            } else {
                this.f4225G = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f3 = dimensionPixelSize;
                if (f3 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f3);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes.getInt(1, -1);
            int i3 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i3 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(defaultFromStyle);
                int i6 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i6 & 1) != 0);
                textPaint.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0492a c0492a = new C0492a();
                c0492a.f5828a = context2.getResources().getConfiguration().locale;
                this.f4228J = c0492a;
            } else {
                this.f4228J = null;
            }
            obtainStyledAttributes.recycle();
        }
        new r(this).d(attributeSet, com.chickyneer.roadway.R.attr.switchStyle);
        M5.P();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4249s = viewConfiguration.getScaledTouchSlop();
        this.f4253w = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f4254x > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((t0.a(this) ? 1.0f - this.f4254x : this.f4254x) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f4236f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f4230L;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f4231a;
        Rect b6 = drawable2 != null ? AbstractC1250w.b(drawable2) : AbstractC1250w.f10979a;
        return ((((this.f4255y - this.f4219A) - rect.left) - rect.right) - b6.left) - b6.right;
    }

    public final void a() {
        Drawable drawable = this.f4231a;
        if (drawable != null) {
            if (this.f4234d || this.f4235e) {
                Drawable mutate = drawable.mutate();
                this.f4231a = mutate;
                if (this.f4234d) {
                    AbstractC1550a.h(mutate, this.f4232b);
                }
                if (this.f4235e) {
                    AbstractC1550a.i(this.f4231a, this.f4233c);
                }
                if (this.f4231a.isStateful()) {
                    this.f4231a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f4236f;
        if (drawable != null) {
            if (this.f4239i || this.f4240j) {
                Drawable mutate = drawable.mutate();
                this.f4236f = mutate;
                if (this.f4239i) {
                    AbstractC1550a.h(mutate, this.f4237g);
                }
                if (this.f4240j) {
                    AbstractC1550a.i(this.f4236f, this.f4238h);
                }
                if (this.f4236f.isStateful()) {
                    this.f4236f.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        C0492a c0492a = this.f4228J;
        if (c0492a != null) {
            charSequence = c0492a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f4224F, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        int i6 = this.f4220B;
        int i7 = this.f4221C;
        int i8 = this.f4222D;
        int i9 = this.f4223E;
        int thumbOffset = getThumbOffset() + i6;
        Drawable drawable = this.f4231a;
        Rect b6 = drawable != null ? AbstractC1250w.b(drawable) : AbstractC1250w.f10979a;
        Drawable drawable2 = this.f4236f;
        Rect rect = this.f4230L;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i10 = rect.left;
            thumbOffset += i10;
            if (b6 != null) {
                int i11 = b6.left;
                if (i11 > i10) {
                    i6 += i11 - i10;
                }
                int i12 = b6.top;
                int i13 = rect.top;
                i2 = i12 > i13 ? (i12 - i13) + i7 : i7;
                int i14 = b6.right;
                int i15 = rect.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = b6.bottom;
                int i17 = rect.bottom;
                if (i16 > i17) {
                    i3 = i9 - (i16 - i17);
                    this.f4236f.setBounds(i6, i2, i8, i3);
                }
            } else {
                i2 = i7;
            }
            i3 = i9;
            this.f4236f.setBounds(i6, i2, i8, i3);
        }
        Drawable drawable3 = this.f4231a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i18 = thumbOffset - rect.left;
            int i19 = thumbOffset + this.f4219A + rect.right;
            this.f4231a.setBounds(i18, i7, i19, i9);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC1550a.f(background, i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f3, float f6) {
        super.drawableHotspotChanged(f3, f6);
        Drawable drawable = this.f4231a;
        if (drawable != null) {
            AbstractC1550a.e(drawable, f3, f6);
        }
        Drawable drawable2 = this.f4236f;
        if (drawable2 != null) {
            AbstractC1550a.e(drawable2, f3, f6);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4231a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f4236f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!t0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f4255y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f4243m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (t0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f4255y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f4243m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f4247q;
    }

    public boolean getSplitTrack() {
        return this.f4244n;
    }

    public int getSwitchMinWidth() {
        return this.f4242l;
    }

    public int getSwitchPadding() {
        return this.f4243m;
    }

    public CharSequence getTextOff() {
        return this.f4246p;
    }

    public CharSequence getTextOn() {
        return this.f4245o;
    }

    public Drawable getThumbDrawable() {
        return this.f4231a;
    }

    public int getThumbTextPadding() {
        return this.f4241k;
    }

    public ColorStateList getThumbTintList() {
        return this.f4232b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f4233c;
    }

    public Drawable getTrackDrawable() {
        return this.f4236f;
    }

    public ColorStateList getTrackTintList() {
        return this.f4237g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f4238h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4231a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4236f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f4229K;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f4229K.end();
        this.f4229K = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f4218U);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f4236f;
        Rect rect = this.f4230L;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f4221C;
        int i3 = this.f4223E;
        int i6 = i2 + rect.top;
        int i7 = i3 - rect.bottom;
        Drawable drawable2 = this.f4231a;
        if (drawable != null) {
            if (!this.f4244n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b6 = AbstractC1250w.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b6.left;
                rect.right -= b6.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f4226H : this.f4227I;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f4225G;
            TextPaint textPaint = this.f4224F;
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
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i6 + i7) / 2) - (staticLayout.getHeight() / 2));
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
        CharSequence charSequence = isChecked() ? this.f4245o : this.f4246p;
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
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        int i8;
        int width;
        int i9;
        int i10;
        int i11;
        super.onLayout(z, i2, i3, i6, i7);
        int i12 = 0;
        if (this.f4231a != null) {
            Drawable drawable = this.f4236f;
            Rect rect = this.f4230L;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b6 = AbstractC1250w.b(this.f4231a);
            i8 = Math.max(0, b6.left - rect.left);
            i12 = Math.max(0, b6.right - rect.right);
        } else {
            i8 = 0;
        }
        if (t0.a(this)) {
            i9 = getPaddingLeft() + i8;
            width = ((this.f4255y + i9) - i8) - i12;
        } else {
            width = (getWidth() - getPaddingRight()) - i12;
            i9 = (width - this.f4255y) + i8 + i12;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i13 = this.z;
            int i14 = height - (i13 / 2);
            i10 = i13 + i14;
            i11 = i14;
        } else if (gravity != 80) {
            i11 = getPaddingTop();
            i10 = this.z + i11;
        } else {
            i10 = getHeight() - getPaddingBottom();
            i11 = i10 - this.z;
        }
        this.f4220B = i9;
        this.f4221C = i11;
        this.f4223E = i10;
        this.f4222D = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i6;
        int i7;
        int i8;
        if (this.f4247q) {
            if (this.f4226H == null) {
                this.f4226H = c(this.f4245o);
            }
            if (this.f4227I == null) {
                this.f4227I = c(this.f4246p);
            }
        }
        Drawable drawable = this.f4231a;
        int i9 = 0;
        Rect rect = this.f4230L;
        if (drawable != null) {
            drawable.getPadding(rect);
            i6 = (this.f4231a.getIntrinsicWidth() - rect.left) - rect.right;
            i7 = this.f4231a.getIntrinsicHeight();
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (this.f4247q) {
            i8 = (this.f4241k * 2) + Math.max(this.f4226H.getWidth(), this.f4227I.getWidth());
        } else {
            i8 = 0;
        }
        this.f4219A = Math.max(i8, i6);
        Drawable drawable2 = this.f4236f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i9 = this.f4236f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i10 = rect.left;
        int i11 = rect.right;
        Drawable drawable3 = this.f4231a;
        if (drawable3 != null) {
            Rect b6 = AbstractC1250w.b(drawable3);
            i10 = Math.max(i10, b6.left);
            i11 = Math.max(i11, b6.right);
        }
        int max = Math.max(this.f4242l, (this.f4219A * 2) + i10 + i11);
        int max2 = Math.max(i9, i7);
        this.f4255y = max;
        this.z = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f4245o : this.f4246p;
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
        VelocityTracker velocityTracker = this.f4252v;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f4249s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i3 = this.f4248r;
                    if (i3 == 1) {
                        float x5 = motionEvent.getX();
                        float y5 = motionEvent.getY();
                        float f3 = i2;
                        if (Math.abs(x5 - this.f4250t) > f3 || Math.abs(y5 - this.f4251u) > f3) {
                            this.f4248r = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f4250t = x5;
                            this.f4251u = y5;
                            return true;
                        }
                    } else if (i3 == 2) {
                        float x6 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f6 = x6 - this.f4250t;
                        float f7 = thumbScrollRange != 0 ? f6 / thumbScrollRange : f6 > 0.0f ? 1.0f : -1.0f;
                        if (t0.a(this)) {
                            f7 = -f7;
                        }
                        float f8 = this.f4254x;
                        float f9 = f7 + f8;
                        float f10 = f9 >= 0.0f ? f9 > 1.0f ? 1.0f : f9 : 0.0f;
                        if (f10 != f8) {
                            this.f4250t = x6;
                            setThumbPosition(f10);
                        }
                        return true;
                    }
                }
            }
            if (this.f4248r == 2) {
                this.f4248r = 0;
                boolean z5 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z5) {
                    velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                    float xVelocity = velocityTracker.getXVelocity();
                    z = Math.abs(xVelocity) > ((float) this.f4253w) ? !t0.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
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
            this.f4248r = 0;
            velocityTracker.clear();
        } else {
            float x7 = motionEvent.getX();
            float y6 = motionEvent.getY();
            if (isEnabled() && this.f4231a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f4231a;
                Rect rect = this.f4230L;
                drawable.getPadding(rect);
                int i6 = this.f4221C - i2;
                int i7 = (this.f4220B + thumbOffset) - i2;
                int i8 = this.f4219A + i7 + rect.left + rect.right + i2;
                int i9 = this.f4223E + i2;
                if (x7 > i7 && x7 < i8 && y6 > i6 && y6 < i9) {
                    this.f4248r = 1;
                    this.f4250t = x7;
                    this.f4251u = y6;
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
            Field field = G.f566a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f4217T, isChecked ? 1.0f : 0.0f);
                this.f4229K = ofFloat;
                ofFloat.setDuration(250L);
                this.f4229K.setAutoCancel(true);
                this.f4229K.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f4229K;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1477a.C(callback, this));
    }

    public void setShowText(boolean z) {
        if (this.f4247q != z) {
            this.f4247q = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f4244n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f4242l = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f4243m = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f4224F;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f4246p = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f4245o = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4231a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4231a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f3) {
        this.f4254x = f3;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(AbstractC0477a.a(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f4241k = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f4232b = colorStateList;
        this.f4234d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f4233c = mode;
        this.f4235e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4236f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4236f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(AbstractC0477a.a(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f4237g = colorStateList;
        this.f4239i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f4238h = mode;
        this.f4240j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4231a || drawable == this.f4236f;
    }
}
