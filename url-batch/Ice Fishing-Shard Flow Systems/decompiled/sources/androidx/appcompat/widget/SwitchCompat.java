package androidx.appcompat.widget;

import D0.j;
import I.F;
import I.T;
import O6.g;
import P0.f;
import W.h;
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
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import h.AbstractC0454a;
import java.util.WeakHashMap;
import k.C0589a;
import n.AbstractC0731q0;
import n.C0739v;
import n.Z;
import n.g1;
import n.h1;
import n.i1;
import n.z1;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: c0, reason: collision with root package name */
    public static final g1 f3263c0 = new g1(Float.class, "thumbPos");

    /* renamed from: d0, reason: collision with root package name */
    public static final int[] f3264d0 = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public boolean f3265A;

    /* renamed from: B, reason: collision with root package name */
    public int f3266B;

    /* renamed from: C, reason: collision with root package name */
    public final int f3267C;

    /* renamed from: D, reason: collision with root package name */
    public float f3268D;

    /* renamed from: E, reason: collision with root package name */
    public float f3269E;

    /* renamed from: F, reason: collision with root package name */
    public final VelocityTracker f3270F;

    /* renamed from: G, reason: collision with root package name */
    public final int f3271G;

    /* renamed from: H, reason: collision with root package name */
    public float f3272H;

    /* renamed from: I, reason: collision with root package name */
    public int f3273I;

    /* renamed from: J, reason: collision with root package name */
    public int f3274J;

    /* renamed from: K, reason: collision with root package name */
    public int f3275K;

    /* renamed from: L, reason: collision with root package name */
    public int f3276L;

    /* renamed from: M, reason: collision with root package name */
    public int f3277M;

    /* renamed from: N, reason: collision with root package name */
    public int f3278N;

    /* renamed from: O, reason: collision with root package name */
    public int f3279O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f3280P;
    public final TextPaint Q;

    /* renamed from: R, reason: collision with root package name */
    public final ColorStateList f3281R;

    /* renamed from: S, reason: collision with root package name */
    public StaticLayout f3282S;

    /* renamed from: T, reason: collision with root package name */
    public StaticLayout f3283T;

    /* renamed from: U, reason: collision with root package name */
    public final C0589a f3284U;

    /* renamed from: V, reason: collision with root package name */
    public ObjectAnimator f3285V;

    /* renamed from: W, reason: collision with root package name */
    public C0739v f3286W;

    /* renamed from: a0, reason: collision with root package name */
    public h f3287a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Rect f3288b0;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f3289d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f3290e;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f3291i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3292l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3293m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f3294n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f3295o;

    /* renamed from: p, reason: collision with root package name */
    public PorterDuff.Mode f3296p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3297q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3298r;

    /* renamed from: s, reason: collision with root package name */
    public int f3299s;

    /* renamed from: t, reason: collision with root package name */
    public int f3300t;

    /* renamed from: u, reason: collision with root package name */
    public int f3301u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3302v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f3303w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f3304x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f3305y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f3306z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.icefishing.icefish.ice.fishing.s294s.R.attr.switchStyle);
        int resourceId;
        this.f3290e = null;
        this.f3291i = null;
        this.f3292l = false;
        this.f3293m = false;
        this.f3295o = null;
        this.f3296p = null;
        this.f3297q = false;
        this.f3298r = false;
        this.f3270F = VelocityTracker.obtain();
        this.f3280P = true;
        this.f3288b0 = new Rect();
        i1.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.Q = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0454a.f5058w;
        j R4 = j.R(context, attributeSet, iArr, com.icefishing.icefish.ice.fishing.s294s.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) R4.f331i;
        T.h(this, context, iArr, attributeSet, typedArray, com.icefishing.icefish.ice.fishing.s294s.R.attr.switchStyle);
        Drawable J7 = R4.J(2);
        this.f3289d = J7;
        if (J7 != null) {
            J7.setCallback(this);
        }
        Drawable J8 = R4.J(11);
        this.f3294n = J8;
        if (J8 != null) {
            J8.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f3265A = typedArray.getBoolean(3, true);
        this.f3299s = typedArray.getDimensionPixelSize(8, 0);
        this.f3300t = typedArray.getDimensionPixelSize(5, 0);
        this.f3301u = typedArray.getDimensionPixelSize(6, 0);
        this.f3302v = typedArray.getBoolean(4, false);
        ColorStateList I7 = R4.I(9);
        if (I7 != null) {
            this.f3290e = I7;
            this.f3292l = true;
        }
        PorterDuff.Mode c7 = AbstractC0731q0.c(typedArray.getInt(10, -1), null);
        if (this.f3291i != c7) {
            this.f3291i = c7;
            this.f3293m = true;
        }
        if (this.f3292l || this.f3293m) {
            a();
        }
        ColorStateList I8 = R4.I(12);
        if (I8 != null) {
            this.f3295o = I8;
            this.f3297q = true;
        }
        PorterDuff.Mode c8 = AbstractC0731q0.c(typedArray.getInt(13, -1), null);
        if (this.f3296p != c8) {
            this.f3296p = c8;
            this.f3298r = true;
        }
        if (this.f3297q || this.f3298r) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0454a.f5059x);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = g.K(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f3281R = colorStateList;
            } else {
                this.f3281R = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f7 = dimensionPixelSize;
                if (f7 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f7);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes.getInt(1, -1);
            int i5 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i5 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i5) : Typeface.create(typeface, i5);
                setSwitchTypeface(defaultFromStyle);
                int i7 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i5;
                textPaint.setFakeBoldText((i7 & 1) != 0);
                textPaint.setTextSkewX((2 & i7) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0589a c0589a = new C0589a();
                c0589a.f6019d = context2.getResources().getConfiguration().locale;
                this.f3284U = c0589a;
            } else {
                this.f3284U = null;
            }
            setTextOnInternal(this.f3303w);
            setTextOffInternal(this.f3305y);
            obtainStyledAttributes.recycle();
        }
        new Z(this).f(attributeSet, com.icefishing.icefish.ice.fishing.s294s.R.attr.switchStyle);
        R4.W();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3267C = viewConfiguration.getScaledTouchSlop();
        this.f3271G = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.icefishing.icefish.ice.fishing.s294s.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0739v getEmojiTextViewHelper() {
        if (this.f3286W == null) {
            this.f3286W = new C0739v(this);
        }
        return this.f3286W;
    }

    private boolean getTargetCheckedState() {
        return this.f3272H > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((z1.a(this) ? 1.0f - this.f3272H : this.f3272H) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3294n;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3288b0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3289d;
        Rect b7 = drawable2 != null ? AbstractC0731q0.b(drawable2) : AbstractC0731q0.f6870c;
        return ((((this.f3273I - this.f3275K) - rect.left) - rect.right) - b7.left) - b7.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3305y = charSequence;
        TransformationMethod Q = ((f) getEmojiTextViewHelper().f6912b.f6269d).Q(this.f3284U);
        if (Q != null) {
            charSequence = Q.getTransformation(charSequence, this);
        }
        this.f3306z = charSequence;
        this.f3283T = null;
        if (this.f3265A) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3303w = charSequence;
        TransformationMethod Q = ((f) getEmojiTextViewHelper().f6912b.f6269d).Q(this.f3284U);
        if (Q != null) {
            charSequence = Q.getTransformation(charSequence, this);
        }
        this.f3304x = charSequence;
        this.f3282S = null;
        if (this.f3265A) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f3289d;
        if (drawable != null) {
            if (this.f3292l || this.f3293m) {
                Drawable mutate = drawable.mutate();
                this.f3289d = mutate;
                if (this.f3292l) {
                    mutate.setTintList(this.f3290e);
                }
                if (this.f3293m) {
                    this.f3289d.setTintMode(this.f3291i);
                }
                if (this.f3289d.isStateful()) {
                    this.f3289d.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f3294n;
        if (drawable != null) {
            if (this.f3297q || this.f3298r) {
                Drawable mutate = drawable.mutate();
                this.f3294n = mutate;
                if (this.f3297q) {
                    mutate.setTintList(this.f3295o);
                }
                if (this.f3298r) {
                    this.f3294n.setTintMode(this.f3296p);
                }
                if (this.f3294n.isStateful()) {
                    this.f3294n.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f3303w);
        setTextOffInternal(this.f3305y);
        requestLayout();
    }

    public final void d() {
        if (this.f3287a0 == null && ((f) this.f3286W.f6912b.f6269d).x() && U.j.j != null) {
            U.j a7 = U.j.a();
            int b7 = a7.b();
            if (b7 == 3 || b7 == 0) {
                h hVar = new h(this);
                this.f3287a0 = hVar;
                a7.f(hVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int i5;
        int i7 = this.f3276L;
        int i8 = this.f3277M;
        int i9 = this.f3278N;
        int i10 = this.f3279O;
        int thumbOffset = getThumbOffset() + i7;
        Drawable drawable = this.f3289d;
        Rect b7 = drawable != null ? AbstractC0731q0.b(drawable) : AbstractC0731q0.f6870c;
        Drawable drawable2 = this.f3294n;
        Rect rect = this.f3288b0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i11 = rect.left;
            thumbOffset += i11;
            if (b7 != null) {
                int i12 = b7.left;
                if (i12 > i11) {
                    i7 += i12 - i11;
                }
                int i13 = b7.top;
                int i14 = rect.top;
                i2 = i13 > i14 ? (i13 - i14) + i8 : i8;
                int i15 = b7.right;
                int i16 = rect.right;
                if (i15 > i16) {
                    i9 -= i15 - i16;
                }
                int i17 = b7.bottom;
                int i18 = rect.bottom;
                if (i17 > i18) {
                    i5 = i10 - (i17 - i18);
                    this.f3294n.setBounds(i7, i2, i9, i5);
                }
            } else {
                i2 = i8;
            }
            i5 = i10;
            this.f3294n.setBounds(i7, i2, i9, i5);
        }
        Drawable drawable3 = this.f3289d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i19 = thumbOffset - rect.left;
            int i20 = thumbOffset + this.f3275K + rect.right;
            this.f3289d.setBounds(i19, i8, i20, i10);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i19, i8, i20, i10);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f7, float f8) {
        super.drawableHotspotChanged(f7, f8);
        Drawable drawable = this.f3289d;
        if (drawable != null) {
            drawable.setHotspot(f7, f8);
        }
        Drawable drawable2 = this.f3294n;
        if (drawable2 != null) {
            drawable2.setHotspot(f7, f8);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3289d;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3294n;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!z1.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3273I;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3301u : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (z1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3273I;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3301u : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return f.N(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f3265A;
    }

    public boolean getSplitTrack() {
        return this.f3302v;
    }

    public int getSwitchMinWidth() {
        return this.f3300t;
    }

    public int getSwitchPadding() {
        return this.f3301u;
    }

    public CharSequence getTextOff() {
        return this.f3305y;
    }

    public CharSequence getTextOn() {
        return this.f3303w;
    }

    public Drawable getThumbDrawable() {
        return this.f3289d;
    }

    public final float getThumbPosition() {
        return this.f3272H;
    }

    public int getThumbTextPadding() {
        return this.f3299s;
    }

    public ColorStateList getThumbTintList() {
        return this.f3290e;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3291i;
    }

    public Drawable getTrackDrawable() {
        return this.f3294n;
    }

    public ColorStateList getTrackTintList() {
        return this.f3295o;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3296p;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3289d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3294n;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3285V;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3285V.end();
        this.f3285V = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3264d0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f3294n;
        Rect rect = this.f3288b0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f3277M;
        int i5 = this.f3279O;
        int i7 = i2 + rect.top;
        int i8 = i5 - rect.bottom;
        Drawable drawable2 = this.f3289d;
        if (drawable != null) {
            if (!this.f3302v || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b7 = AbstractC0731q0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b7.left;
                rect.right -= b7.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f3282S : this.f3283T;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.Q;
            ColorStateList colorStateList = this.f3281R;
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
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i7 + i8) / 2) - (staticLayout.getHeight() / 2));
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
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f3303w : this.f3305y;
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
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        int i9;
        int width;
        int i10;
        int i11;
        int i12;
        super.onLayout(z7, i2, i5, i7, i8);
        int i13 = 0;
        if (this.f3289d != null) {
            Drawable drawable = this.f3294n;
            Rect rect = this.f3288b0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b7 = AbstractC0731q0.b(this.f3289d);
            i9 = Math.max(0, b7.left - rect.left);
            i13 = Math.max(0, b7.right - rect.right);
        } else {
            i9 = 0;
        }
        if (z1.a(this)) {
            i10 = getPaddingLeft() + i9;
            width = ((this.f3273I + i10) - i9) - i13;
        } else {
            width = (getWidth() - getPaddingRight()) - i13;
            i10 = (width - this.f3273I) + i9 + i13;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.f3274J;
            int i15 = height - (i14 / 2);
            i11 = i14 + i15;
            i12 = i15;
        } else if (gravity != 80) {
            i12 = getPaddingTop();
            i11 = this.f3274J + i12;
        } else {
            i11 = getHeight() - getPaddingBottom();
            i12 = i11 - this.f3274J;
        }
        this.f3276L = i10;
        this.f3277M = i12;
        this.f3279O = i11;
        this.f3278N = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i5) {
        int i7;
        int i8;
        int i9 = 0;
        if (this.f3265A) {
            StaticLayout staticLayout = this.f3282S;
            TextPaint textPaint = this.Q;
            if (staticLayout == null) {
                CharSequence charSequence = this.f3304x;
                this.f3282S = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f3283T == null) {
                CharSequence charSequence2 = this.f3306z;
                this.f3283T = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f3289d;
        Rect rect = this.f3288b0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i7 = (this.f3289d.getIntrinsicWidth() - rect.left) - rect.right;
            i8 = this.f3289d.getIntrinsicHeight();
        } else {
            i7 = 0;
            i8 = 0;
        }
        this.f3275K = Math.max(this.f3265A ? (this.f3299s * 2) + Math.max(this.f3282S.getWidth(), this.f3283T.getWidth()) : 0, i7);
        Drawable drawable2 = this.f3294n;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i9 = this.f3294n.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i10 = rect.left;
        int i11 = rect.right;
        Drawable drawable3 = this.f3289d;
        if (drawable3 != null) {
            Rect b7 = AbstractC0731q0.b(drawable3);
            i10 = Math.max(i10, b7.left);
            i11 = Math.max(i11, b7.right);
        }
        int max = this.f3280P ? Math.max(this.f3300t, (this.f3275K * 2) + i10 + i11) : this.f3300t;
        int max2 = Math.max(i9, i8);
        this.f3273I = max;
        this.f3274J = max2;
        super.onMeasure(i2, i5);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3303w : this.f3305y;
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
        boolean z7;
        VelocityTracker velocityTracker = this.f3270F;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f3267C;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i5 = this.f3266B;
                    if (i5 == 1) {
                        float x7 = motionEvent.getX();
                        float y7 = motionEvent.getY();
                        float f7 = i2;
                        if (Math.abs(x7 - this.f3268D) > f7 || Math.abs(y7 - this.f3269E) > f7) {
                            this.f3266B = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f3268D = x7;
                            this.f3269E = y7;
                            return true;
                        }
                    } else if (i5 == 2) {
                        float x8 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f8 = x8 - this.f3268D;
                        float f9 = thumbScrollRange != 0 ? f8 / thumbScrollRange : f8 > 0.0f ? 1.0f : -1.0f;
                        if (z1.a(this)) {
                            f9 = -f9;
                        }
                        float f10 = this.f3272H;
                        float f11 = f9 + f10;
                        float f12 = f11 >= 0.0f ? f11 > 1.0f ? 1.0f : f11 : 0.0f;
                        if (f12 != f10) {
                            this.f3268D = x8;
                            setThumbPosition(f12);
                        }
                        return true;
                    }
                }
            }
            if (this.f3266B == 2) {
                this.f3266B = 0;
                boolean z8 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z8) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    z7 = Math.abs(xVelocity) > ((float) this.f3271G) ? !z1.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
                } else {
                    z7 = isChecked;
                }
                if (z7 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z7);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f3266B = 0;
            velocityTracker.clear();
        } else {
            float x9 = motionEvent.getX();
            float y8 = motionEvent.getY();
            if (isEnabled() && this.f3289d != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f3289d;
                Rect rect = this.f3288b0;
                drawable.getPadding(rect);
                int i7 = this.f3277M - i2;
                int i8 = (this.f3276L + thumbOffset) - i2;
                int i9 = this.f3275K + i8 + rect.left + rect.right + i2;
                int i10 = this.f3279O + i2;
                if (x9 > i8 && x9 < i9 && y8 > i7 && y8 < i10) {
                    this.f3266B = 1;
                    this.f3268D = x9;
                    this.f3269E = y8;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().c(z7);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        super.setChecked(z7);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f3303w;
                if (obj == null) {
                    obj = getResources().getString(com.icefishing.icefish.ice.fishing.s294s.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = T.f1153a;
                new F(com.icefishing.icefish.ice.fishing.s294s.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f3305y;
            if (obj3 == null) {
                obj3 = getResources().getString(com.icefishing.icefish.ice.fishing.s294s.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = T.f1153a;
            new F(com.icefishing.icefish.ice.fishing.s294s.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj4);
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap3 = T.f1153a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f3263c0, isChecked ? 1.0f : 0.0f);
                this.f3285V = ofFloat;
                ofFloat.setDuration(250L);
                h1.a(this.f3285V, true);
                this.f3285V.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f3285V;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(f.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().d(z7);
        setTextOnInternal(this.f3303w);
        setTextOffInternal(this.f3305y);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z7) {
        this.f3280P = z7;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z7) {
        if (this.f3265A != z7) {
            this.f3265A = z7;
            requestLayout();
            if (z7) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z7) {
        this.f3302v = z7;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f3300t = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f3301u = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.Q;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f3305y;
        if (obj == null) {
            obj = getResources().getString(com.icefishing.icefish.ice.fishing.s294s.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = T.f1153a;
        new F(com.icefishing.icefish.ice.fishing.s294s.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f3303w;
        if (obj == null) {
            obj = getResources().getString(com.icefishing.icefish.ice.fishing.s294s.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = T.f1153a;
        new F(com.icefishing.icefish.ice.fishing.s294s.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3289d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3289d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f7) {
        this.f3272H = f7;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(g.M(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f3299s = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3290e = colorStateList;
        this.f3292l = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3291i = mode;
        this.f3293m = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3294n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3294n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(g.M(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3295o = colorStateList;
        this.f3297q = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3296p = mode;
        this.f3298r = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3289d || drawable == this.f3294n;
    }
}
