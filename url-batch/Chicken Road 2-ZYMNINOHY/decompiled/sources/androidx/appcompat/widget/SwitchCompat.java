package androidx.appcompat.widget;

import B1.j;
import E.H;
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
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import f.AbstractC0410a;
import g.AbstractC0432a;
import h.C0444a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.lang.reflect.Field;
import k.AbstractC1237x;
import k.C1211e0;
import k.C1232s;
import k.t0;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: M, reason: collision with root package name */
    public static final C1211e0 f4424M = new C1211e0(Float.class, "thumbPos", 0);

    /* renamed from: N, reason: collision with root package name */
    public static final int[] f4425N = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f4426A;

    /* renamed from: B, reason: collision with root package name */
    public int f4427B;

    /* renamed from: C, reason: collision with root package name */
    public int f4428C;

    /* renamed from: D, reason: collision with root package name */
    public int f4429D;

    /* renamed from: E, reason: collision with root package name */
    public int f4430E;

    /* renamed from: F, reason: collision with root package name */
    public final TextPaint f4431F;

    /* renamed from: G, reason: collision with root package name */
    public final ColorStateList f4432G;

    /* renamed from: H, reason: collision with root package name */
    public StaticLayout f4433H;

    /* renamed from: I, reason: collision with root package name */
    public StaticLayout f4434I;

    /* renamed from: J, reason: collision with root package name */
    public final C0444a f4435J;

    /* renamed from: K, reason: collision with root package name */
    public ObjectAnimator f4436K;
    public final Rect L;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f4437a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f4438b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f4439c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4440d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4441e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4442f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4443g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4444h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4445i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4446j;

    /* renamed from: k, reason: collision with root package name */
    public int f4447k;

    /* renamed from: l, reason: collision with root package name */
    public int f4448l;

    /* renamed from: m, reason: collision with root package name */
    public int f4449m;
    public boolean n;
    public CharSequence o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f4450p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4451q;

    /* renamed from: r, reason: collision with root package name */
    public int f4452r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4453s;

    /* renamed from: t, reason: collision with root package name */
    public float f4454t;

    /* renamed from: u, reason: collision with root package name */
    public float f4455u;
    public final VelocityTracker v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4456w;

    /* renamed from: x, reason: collision with root package name */
    public float f4457x;

    /* renamed from: y, reason: collision with root package name */
    public int f4458y;
    public int z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
    
        if (r9 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.rockchicken.pump.up.road.R.attr.switchStyle);
        ColorStateList colorStateList;
        int resourceId;
        this.f4438b = null;
        this.f4439c = null;
        this.f4440d = false;
        this.f4441e = false;
        this.f4443g = null;
        this.f4444h = null;
        this.f4445i = false;
        this.f4446j = false;
        this.v = VelocityTracker.obtain();
        this.L = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f4431F = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        j v = j.v(context, attributeSet, AbstractC0410a.f8485r, com.rockchicken.pump.up.road.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) v.f202c;
        Drawable o = v.o(2);
        this.f4437a = o;
        if (o != null) {
            o.setCallback(this);
        }
        Drawable o4 = v.o(11);
        this.f4442f = o4;
        if (o4 != null) {
            o4.setCallback(this);
        }
        this.o = typedArray.getText(0);
        this.f4450p = typedArray.getText(1);
        this.f4451q = typedArray.getBoolean(3, true);
        this.f4447k = typedArray.getDimensionPixelSize(8, 0);
        this.f4448l = typedArray.getDimensionPixelSize(5, 0);
        this.f4449m = typedArray.getDimensionPixelSize(6, 0);
        this.n = typedArray.getBoolean(4, false);
        ColorStateList m4 = v.m(9);
        if (m4 != null) {
            this.f4438b = m4;
            this.f4440d = true;
        }
        PorterDuff.Mode c4 = AbstractC1237x.c(typedArray.getInt(10, -1), null);
        if (this.f4439c != c4) {
            this.f4439c = c4;
            this.f4441e = true;
        }
        if (this.f4440d || this.f4441e) {
            a();
        }
        ColorStateList m5 = v.m(12);
        if (m5 != null) {
            this.f4443g = m5;
            this.f4445i = true;
        }
        PorterDuff.Mode c5 = AbstractC1237x.c(typedArray.getInt(13, -1), null);
        if (this.f4444h != c5) {
            this.f4444h = c5;
            this.f4446j = true;
        }
        if (this.f4445i || this.f4446j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0410a.f8486s);
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) != 0) {
                Object obj = AbstractC0432a.f8818a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList != null) {
                this.f4432G = colorStateList;
            } else {
                this.f4432G = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f4 = dimensionPixelSize;
                if (f4 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f4);
                    requestLayout();
                }
            }
            int i4 = obtainStyledAttributes.getInt(1, -1);
            int i5 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i4 != 1 ? i4 != 2 ? i4 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i5 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i5) : Typeface.create(typeface, i5);
                setSwitchTypeface(defaultFromStyle);
                int i6 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i5;
                textPaint.setFakeBoldText((i6 & 1) != 0);
                textPaint.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0444a c0444a = new C0444a();
                c0444a.f9040a = context2.getResources().getConfiguration().locale;
                this.f4435J = c0444a;
            } else {
                this.f4435J = null;
            }
            obtainStyledAttributes.recycle();
        }
        new C1232s(this).d(attributeSet, com.rockchicken.pump.up.road.R.attr.switchStyle);
        v.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4453s = viewConfiguration.getScaledTouchSlop();
        this.f4456w = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f4457x > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((t0.a(this) ? 1.0f - this.f4457x : this.f4457x) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f4442f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.L;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f4437a;
        Rect b4 = drawable2 != null ? AbstractC1237x.b(drawable2) : AbstractC1237x.f14120a;
        return ((((this.f4458y - this.f4426A) - rect.left) - rect.right) - b4.left) - b4.right;
    }

    public final void a() {
        Drawable drawable = this.f4437a;
        if (drawable != null) {
            if (this.f4440d || this.f4441e) {
                Drawable mutate = drawable.mutate();
                this.f4437a = mutate;
                if (this.f4440d) {
                    mutate.setTintList(this.f4438b);
                }
                if (this.f4441e) {
                    this.f4437a.setTintMode(this.f4439c);
                }
                if (this.f4437a.isStateful()) {
                    this.f4437a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f4442f;
        if (drawable != null) {
            if (this.f4445i || this.f4446j) {
                Drawable mutate = drawable.mutate();
                this.f4442f = mutate;
                if (this.f4445i) {
                    mutate.setTintList(this.f4443g);
                }
                if (this.f4446j) {
                    this.f4442f.setTintMode(this.f4444h);
                }
                if (this.f4442f.isStateful()) {
                    this.f4442f.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        C0444a c0444a = this.f4435J;
        if (c0444a != null) {
            charSequence = c0444a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f4431F, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        int i5;
        int i6 = this.f4427B;
        int i7 = this.f4428C;
        int i8 = this.f4429D;
        int i9 = this.f4430E;
        int thumbOffset = getThumbOffset() + i6;
        Drawable drawable = this.f4437a;
        Rect b4 = drawable != null ? AbstractC1237x.b(drawable) : AbstractC1237x.f14120a;
        Drawable drawable2 = this.f4442f;
        Rect rect = this.L;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i10 = rect.left;
            thumbOffset += i10;
            if (b4 != null) {
                int i11 = b4.left;
                if (i11 > i10) {
                    i6 += i11 - i10;
                }
                int i12 = b4.top;
                int i13 = rect.top;
                i4 = i12 > i13 ? (i12 - i13) + i7 : i7;
                int i14 = b4.right;
                int i15 = rect.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = b4.bottom;
                int i17 = rect.bottom;
                if (i16 > i17) {
                    i5 = i9 - (i16 - i17);
                    this.f4442f.setBounds(i6, i4, i8, i5);
                }
            } else {
                i4 = i7;
            }
            i5 = i9;
            this.f4442f.setBounds(i6, i4, i8, i5);
        }
        Drawable drawable3 = this.f4437a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i18 = thumbOffset - rect.left;
            int i19 = thumbOffset + this.f4426A + rect.right;
            this.f4437a.setBounds(i18, i7, i19, i9);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.f4437a;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
        Drawable drawable2 = this.f4442f;
        if (drawable2 != null) {
            drawable2.setHotspot(f4, f5);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4437a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f4442f;
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
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f4458y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f4449m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (t0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f4458y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f4449m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f4451q;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.f4448l;
    }

    public int getSwitchPadding() {
        return this.f4449m;
    }

    public CharSequence getTextOff() {
        return this.f4450p;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.f4437a;
    }

    public int getThumbTextPadding() {
        return this.f4447k;
    }

    public ColorStateList getThumbTintList() {
        return this.f4438b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f4439c;
    }

    public Drawable getTrackDrawable() {
        return this.f4442f;
    }

    public ColorStateList getTrackTintList() {
        return this.f4443g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f4444h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4437a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4442f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f4436K;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f4436K.end();
        this.f4436K = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f4425N);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f4442f;
        Rect rect = this.L;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i4 = this.f4428C;
        int i5 = this.f4430E;
        int i6 = i4 + rect.top;
        int i7 = i5 - rect.bottom;
        Drawable drawable2 = this.f4437a;
        if (drawable != null) {
            if (!this.n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b4 = AbstractC1237x.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b4.left;
                rect.right -= b4.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f4433H : this.f4434I;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f4431F;
            ColorStateList colorStateList = this.f4432G;
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
        CharSequence charSequence = isChecked() ? this.o : this.f4450p;
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
    public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        int i8;
        int width;
        int i9;
        int i10;
        int i11;
        super.onLayout(z, i4, i5, i6, i7);
        int i12 = 0;
        if (this.f4437a != null) {
            Drawable drawable = this.f4442f;
            Rect rect = this.L;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b4 = AbstractC1237x.b(this.f4437a);
            i8 = Math.max(0, b4.left - rect.left);
            i12 = Math.max(0, b4.right - rect.right);
        } else {
            i8 = 0;
        }
        if (t0.a(this)) {
            i9 = getPaddingLeft() + i8;
            width = ((this.f4458y + i9) - i8) - i12;
        } else {
            width = (getWidth() - getPaddingRight()) - i12;
            i9 = (width - this.f4458y) + i8 + i12;
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
        this.f4427B = i9;
        this.f4428C = i11;
        this.f4430E = i10;
        this.f4429D = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (this.f4451q) {
            if (this.f4433H == null) {
                this.f4433H = c(this.o);
            }
            if (this.f4434I == null) {
                this.f4434I = c(this.f4450p);
            }
        }
        Drawable drawable = this.f4437a;
        int i9 = 0;
        Rect rect = this.L;
        if (drawable != null) {
            drawable.getPadding(rect);
            i6 = (this.f4437a.getIntrinsicWidth() - rect.left) - rect.right;
            i7 = this.f4437a.getIntrinsicHeight();
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (this.f4451q) {
            i8 = (this.f4447k * 2) + Math.max(this.f4433H.getWidth(), this.f4434I.getWidth());
        } else {
            i8 = 0;
        }
        this.f4426A = Math.max(i8, i6);
        Drawable drawable2 = this.f4442f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i9 = this.f4442f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i10 = rect.left;
        int i11 = rect.right;
        Drawable drawable3 = this.f4437a;
        if (drawable3 != null) {
            Rect b4 = AbstractC1237x.b(drawable3);
            i10 = Math.max(i10, b4.left);
            i11 = Math.max(i11, b4.right);
        }
        int max = Math.max(this.f4448l, (this.f4426A * 2) + i10 + i11);
        int max2 = Math.max(i9, i7);
        this.f4458y = max;
        this.z = max2;
        super.onMeasure(i4, i5);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.o : this.f4450p;
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
        int i4 = this.f4453s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i5 = this.f4452r;
                    if (i5 == 1) {
                        float x4 = motionEvent.getX();
                        float y4 = motionEvent.getY();
                        float f4 = i4;
                        if (Math.abs(x4 - this.f4454t) > f4 || Math.abs(y4 - this.f4455u) > f4) {
                            this.f4452r = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f4454t = x4;
                            this.f4455u = y4;
                            return true;
                        }
                    } else if (i5 == 2) {
                        float x5 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f5 = x5 - this.f4454t;
                        float f6 = thumbScrollRange != 0 ? f5 / thumbScrollRange : f5 > 0.0f ? 1.0f : -1.0f;
                        if (t0.a(this)) {
                            f6 = -f6;
                        }
                        float f7 = this.f4457x;
                        float f8 = f6 + f7;
                        float f9 = f8 >= 0.0f ? f8 > 1.0f ? 1.0f : f8 : 0.0f;
                        if (f9 != f7) {
                            this.f4454t = x5;
                            setThumbPosition(f9);
                        }
                        return true;
                    }
                }
            }
            if (this.f4452r == 2) {
                this.f4452r = 0;
                boolean z4 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z4) {
                    velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                    float xVelocity = velocityTracker.getXVelocity();
                    z = Math.abs(xVelocity) > ((float) this.f4456w) ? !t0.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
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
            this.f4452r = 0;
            velocityTracker.clear();
        } else {
            float x6 = motionEvent.getX();
            float y5 = motionEvent.getY();
            if (isEnabled() && this.f4437a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f4437a;
                Rect rect = this.L;
                drawable.getPadding(rect);
                int i6 = this.f4428C - i4;
                int i7 = (this.f4427B + thumbOffset) - i4;
                int i8 = this.f4426A + i7 + rect.left + rect.right + i4;
                int i9 = this.f4430E + i4;
                if (x6 > i7 && x6 < i8 && y5 > i6 && y5 < i9) {
                    this.f4452r = 1;
                    this.f4454t = x6;
                    this.f4455u = y5;
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
            Field field = H.f375a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f4424M, isChecked ? 1.0f : 0.0f);
                this.f4436K = ofFloat;
                ofFloat.setDuration(250L);
                this.f4436K.setAutoCancel(true);
                this.f4436K.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f4436K;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0347t0.u(callback, this));
    }

    public void setShowText(boolean z) {
        if (this.f4451q != z) {
            this.f4451q = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i4) {
        this.f4448l = i4;
        requestLayout();
    }

    public void setSwitchPadding(int i4) {
        this.f4449m = i4;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f4431F;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f4450p = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.o = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4437a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4437a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f4) {
        this.f4457x = f4;
        invalidate();
    }

    public void setThumbResource(int i4) {
        setThumbDrawable(AbstractC0432a.a(getContext(), i4));
    }

    public void setThumbTextPadding(int i4) {
        this.f4447k = i4;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f4438b = colorStateList;
        this.f4440d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f4439c = mode;
        this.f4441e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4442f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4442f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i4) {
        setTrackDrawable(AbstractC0432a.a(getContext(), i4));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f4443g = colorStateList;
        this.f4445i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f4444h = mode;
        this.f4446j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4437a || drawable == this.f4442f;
    }
}
