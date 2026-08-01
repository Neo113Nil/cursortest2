package n;

import M.C0029z;
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
import g.AbstractC0122a;
import java.util.WeakHashMap;
import k.C0198a;

/* loaded from: classes.dex */
public abstract class V0 extends CompoundButton {

    /* renamed from: R, reason: collision with root package name */
    public static final U0 f3531R = new U0(Float.class, "thumbPos", 0);

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f3532S = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f3533A;

    /* renamed from: B, reason: collision with root package name */
    public int f3534B;

    /* renamed from: C, reason: collision with root package name */
    public int f3535C;

    /* renamed from: D, reason: collision with root package name */
    public int f3536D;

    /* renamed from: E, reason: collision with root package name */
    public int f3537E;

    /* renamed from: F, reason: collision with root package name */
    public int f3538F;

    /* renamed from: G, reason: collision with root package name */
    public int f3539G;
    public boolean H;

    /* renamed from: I, reason: collision with root package name */
    public final TextPaint f3540I;

    /* renamed from: J, reason: collision with root package name */
    public final ColorStateList f3541J;

    /* renamed from: K, reason: collision with root package name */
    public StaticLayout f3542K;

    /* renamed from: L, reason: collision with root package name */
    public StaticLayout f3543L;

    /* renamed from: M, reason: collision with root package name */
    public final C0198a f3544M;

    /* renamed from: N, reason: collision with root package name */
    public ObjectAnimator f3545N;

    /* renamed from: O, reason: collision with root package name */
    public C0308x f3546O;

    /* renamed from: P, reason: collision with root package name */
    public X.h f3547P;

    /* renamed from: Q, reason: collision with root package name */
    public final Rect f3548Q;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f3549a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f3550b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f3551c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3552d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3553f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3554g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3555h;
    public boolean i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f3556k;

    /* renamed from: l, reason: collision with root package name */
    public int f3557l;

    /* renamed from: m, reason: collision with root package name */
    public int f3558m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3559n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f3560o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3561p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3562q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3563r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3564s;

    /* renamed from: t, reason: collision with root package name */
    public int f3565t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3566u;

    /* renamed from: v, reason: collision with root package name */
    public float f3567v;

    /* renamed from: w, reason: collision with root package name */
    public float f3568w;

    /* renamed from: x, reason: collision with root package name */
    public final VelocityTracker f3569x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3570y;

    /* renamed from: z, reason: collision with root package name */
    public float f3571z;

    public V0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winpower.neonfit.R.attr.switchStyle);
        int resourceId;
        this.f3550b = null;
        this.f3551c = null;
        this.f3552d = false;
        this.e = false;
        this.f3554g = null;
        this.f3555h = null;
        this.i = false;
        this.j = false;
        this.f3569x = VelocityTracker.obtain();
        this.H = true;
        this.f3548Q = new Rect();
        W0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f3540I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0122a.f2713v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.winpower.neonfit.R.attr.switchStyle, 0);
        I0.h hVar = new I0.h(context, obtainStyledAttributes);
        M.P.k(this, context, iArr, attributeSet, obtainStyledAttributes, com.winpower.neonfit.R.attr.switchStyle);
        Drawable h2 = hVar.h(2);
        this.f3549a = h2;
        if (h2 != null) {
            h2.setCallback(this);
        }
        Drawable h3 = hVar.h(11);
        this.f3553f = h3;
        if (h3 != null) {
            h3.setCallback(this);
        }
        setTextOnInternal(obtainStyledAttributes.getText(0));
        setTextOffInternal(obtainStyledAttributes.getText(1));
        this.f3564s = obtainStyledAttributes.getBoolean(3, true);
        this.f3556k = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f3557l = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f3558m = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f3559n = obtainStyledAttributes.getBoolean(4, false);
        ColorStateList g2 = hVar.g(9);
        if (g2 != null) {
            this.f3550b = g2;
            this.f3552d = true;
        }
        PorterDuff.Mode c2 = AbstractC0293p0.c(obtainStyledAttributes.getInt(10, -1), null);
        if (this.f3551c != c2) {
            this.f3551c = c2;
            this.e = true;
        }
        if (this.f3552d || this.e) {
            a();
        }
        ColorStateList g3 = hVar.g(12);
        if (g3 != null) {
            this.f3554g = g3;
            this.i = true;
        }
        PorterDuff.Mode c3 = AbstractC0293p0.c(obtainStyledAttributes.getInt(13, -1), null);
        if (this.f3555h != c3) {
            this.f3555h = c3;
            this.j = true;
        }
        if (this.i || this.j) {
            b();
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId2, AbstractC0122a.f2714w);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = H1.l.v(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f3541J = colorStateList;
            } else {
                this.f3541J = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i = obtainStyledAttributes2.getInt(1, -1);
            int i2 = obtainStyledAttributes2.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i2 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(defaultFromStyle);
                int i3 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                Context context2 = getContext();
                C0198a c0198a = new C0198a();
                c0198a.f3187a = context2.getResources().getConfiguration().locale;
                this.f3544M = c0198a;
            } else {
                this.f3544M = null;
            }
            setTextOnInternal(this.f3560o);
            setTextOffInternal(this.f3562q);
            obtainStyledAttributes2.recycle();
        }
        new Y(this).f(attributeSet, com.winpower.neonfit.R.attr.switchStyle);
        hVar.t();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3566u = viewConfiguration.getScaledTouchSlop();
        this.f3570y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.winpower.neonfit.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0308x getEmojiTextViewHelper() {
        if (this.f3546O == null) {
            this.f3546O = new C0308x(this);
        }
        return this.f3546O;
    }

    private boolean getTargetCheckedState() {
        return this.f3571z > 0.5f;
    }

    private int getThumbOffset() {
        boolean z2 = n1.f3683a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f3571z : this.f3571z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3553f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3548Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3549a;
        Rect b2 = drawable2 != null ? AbstractC0293p0.b(drawable2) : AbstractC0293p0.f3692c;
        return ((((this.f3533A - this.f3535C) - rect.left) - rect.right) - b2.left) - b2.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3562q = charSequence;
        C0308x emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod j02 = ((H1.l) emojiTextViewHelper.f3735b.f145b).j0(this.f3544M);
        if (j02 != null) {
            charSequence = j02.getTransformation(charSequence, this);
        }
        this.f3563r = charSequence;
        this.f3543L = null;
        if (this.f3564s) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3560o = charSequence;
        C0308x emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod j02 = ((H1.l) emojiTextViewHelper.f3735b.f145b).j0(this.f3544M);
        if (j02 != null) {
            charSequence = j02.getTransformation(charSequence, this);
        }
        this.f3561p = charSequence;
        this.f3542K = null;
        if (this.f3564s) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f3549a;
        if (drawable != null) {
            if (this.f3552d || this.e) {
                Drawable mutate = drawable.mutate();
                this.f3549a = mutate;
                if (this.f3552d) {
                    F.a.h(mutate, this.f3550b);
                }
                if (this.e) {
                    F.a.i(this.f3549a, this.f3551c);
                }
                if (this.f3549a.isStateful()) {
                    this.f3549a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f3553f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f3553f = mutate;
                if (this.i) {
                    F.a.h(mutate, this.f3554g);
                }
                if (this.j) {
                    F.a.i(this.f3553f, this.f3555h);
                }
                if (this.f3553f.isStateful()) {
                    this.f3553f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f3560o);
        setTextOffInternal(this.f3562q);
        requestLayout();
    }

    public final void d() {
        if (this.f3547P == null && ((H1.l) this.f3546O.f3735b.f145b).E() && V.j.f1274k != null) {
            V.j a2 = V.j.a();
            int b2 = a2.b();
            if (b2 == 3 || b2 == 0) {
                X.h hVar = new X.h(this);
                this.f3547P = hVar;
                a2.f(hVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f3536D;
        int i4 = this.f3537E;
        int i5 = this.f3538F;
        int i6 = this.f3539G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f3549a;
        Rect b2 = drawable != null ? AbstractC0293p0.b(drawable) : AbstractC0293p0.f3692c;
        Drawable drawable2 = this.f3553f;
        Rect rect = this.f3548Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (b2 != null) {
                int i8 = b2.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = b2.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = b2.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = b2.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f3553f.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f3553f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f3549a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f3535C + rect.right;
            this.f3549a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                F.a.f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f3549a;
        if (drawable != null) {
            F.a.e(drawable, f2, f3);
        }
        Drawable drawable2 = this.f3553f;
        if (drawable2 != null) {
            F.a.e(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3549a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3553f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z2 = n1.f3683a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3533A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3558m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z2 = n1.f3683a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3533A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3558m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return H1.l.h0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f3564s;
    }

    public boolean getSplitTrack() {
        return this.f3559n;
    }

    public int getSwitchMinWidth() {
        return this.f3557l;
    }

    public int getSwitchPadding() {
        return this.f3558m;
    }

    public CharSequence getTextOff() {
        return this.f3562q;
    }

    public CharSequence getTextOn() {
        return this.f3560o;
    }

    public Drawable getThumbDrawable() {
        return this.f3549a;
    }

    public final float getThumbPosition() {
        return this.f3571z;
    }

    public int getThumbTextPadding() {
        return this.f3556k;
    }

    public ColorStateList getThumbTintList() {
        return this.f3550b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3551c;
    }

    public Drawable getTrackDrawable() {
        return this.f3553f;
    }

    public ColorStateList getTrackTintList() {
        return this.f3554g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3555h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3549a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3553f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3545N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3545N.end();
        this.f3545N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3532S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f3553f;
        Rect rect = this.f3548Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f3537E;
        int i2 = this.f3539G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f3549a;
        if (drawable != null) {
            if (!this.f3559n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b2 = AbstractC0293p0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b2.left;
                rect.right -= b2.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f3542K : this.f3543L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3541J;
            TextPaint textPaint = this.f3540I;
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
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
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
            CharSequence charSequence = isChecked() ? this.f3560o : this.f3562q;
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
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z2, i, i2, i3, i4);
        int i9 = 0;
        if (this.f3549a != null) {
            Drawable drawable = this.f3553f;
            Rect rect = this.f3548Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b2 = AbstractC0293p0.b(this.f3549a);
            i5 = Math.max(0, b2.left - rect.left);
            i9 = Math.max(0, b2.right - rect.right);
        } else {
            i5 = 0;
        }
        boolean z3 = n1.f3683a;
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f3533A + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f3533A) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i10 = this.f3534B;
            int i11 = height - (i10 / 2);
            i7 = i10 + i11;
            i8 = i11;
        } else if (gravity != 80) {
            i8 = getPaddingTop();
            i7 = this.f3534B + i8;
        } else {
            i7 = getHeight() - getPaddingBottom();
            i8 = i7 - this.f3534B;
        }
        this.f3536D = i6;
        this.f3537E = i8;
        this.f3539G = i7;
        this.f3538F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.f3564s) {
            StaticLayout staticLayout = this.f3542K;
            TextPaint textPaint = this.f3540I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f3561p;
                this.f3542K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f3543L == null) {
                CharSequence charSequence2 = this.f3563r;
                this.f3543L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f3549a;
        Rect rect = this.f3548Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f3549a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f3549a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f3535C = Math.max(this.f3564s ? (this.f3556k * 2) + Math.max(this.f3542K.getWidth(), this.f3543L.getWidth()) : 0, i3);
        Drawable drawable2 = this.f3553f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f3553f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f3549a;
        if (drawable3 != null) {
            Rect b2 = AbstractC0293p0.b(drawable3);
            i6 = Math.max(i6, b2.left);
            i7 = Math.max(i7, b2.right);
        }
        int max = this.H ? Math.max(this.f3557l, (this.f3535C * 2) + i6 + i7) : this.f3557l;
        int max2 = Math.max(i5, i4);
        this.f3533A = max;
        this.f3534B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3560o : this.f3562q;
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
        VelocityTracker velocityTracker = this.f3569x;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f3566u;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.f3565t;
                    if (i2 == 1) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        float f2 = i;
                        if (Math.abs(x2 - this.f3567v) > f2 || Math.abs(y2 - this.f3568w) > f2) {
                            this.f3565t = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f3567v = x2;
                            this.f3568w = y2;
                            return true;
                        }
                    } else if (i2 == 2) {
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x3 - this.f3567v;
                        float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > 0.0f ? 1.0f : -1.0f;
                        boolean z3 = n1.f3683a;
                        if (getLayoutDirection() == 1) {
                            f4 = -f4;
                        }
                        float f5 = this.f3571z;
                        float f6 = f4 + f5;
                        float f7 = f6 >= 0.0f ? f6 > 1.0f ? 1.0f : f6 : 0.0f;
                        if (f7 != f5) {
                            this.f3567v = x3;
                            setThumbPosition(f7);
                        }
                        return true;
                    }
                }
            }
            if (this.f3565t == 2) {
                this.f3565t = 0;
                boolean z4 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z4) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(xVelocity) > this.f3570y) {
                        boolean z5 = n1.f3683a;
                        z2 = getLayoutDirection() != 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                    } else {
                        z2 = getTargetCheckedState();
                    }
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
            this.f3565t = 0;
            velocityTracker.clear();
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f3549a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f3549a;
                Rect rect = this.f3548Q;
                drawable.getPadding(rect);
                int i3 = this.f3537E - i;
                int i4 = (this.f3536D + thumbOffset) - i;
                int i5 = this.f3535C + i4 + rect.left + rect.right + i;
                int i6 = this.f3539G + i;
                if (x4 > i4 && x4 < i5 && y3 > i3 && y3 < i6) {
                    this.f3565t = 1;
                    this.f3567v = x4;
                    this.f3568w = y3;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f3560o;
                if (obj == null) {
                    obj = getResources().getString(com.winpower.neonfit.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = M.P.f711a;
                new C0029z(com.winpower.neonfit.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f3562q;
            if (obj3 == null) {
                obj3 = getResources().getString(com.winpower.neonfit.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = M.P.f711a;
            new C0029z(com.winpower.neonfit.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj4);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f3545N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f3531R, isChecked ? 1.0f : 0.0f);
        this.f3545N = ofFloat;
        ofFloat.setDuration(250L);
        this.f3545N.setAutoCancel(true);
        this.f3545N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H1.l.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
        setTextOnInternal(this.f3560o);
        setTextOffInternal(this.f3562q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.H = z2;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.f3564s != z2) {
            this.f3564s = z2;
            requestLayout();
            if (z2) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f3559n = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f3557l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f3558m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f3540I;
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
        Object obj = this.f3562q;
        if (obj == null) {
            obj = getResources().getString(com.winpower.neonfit.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = M.P.f711a;
        new C0029z(com.winpower.neonfit.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f3560o;
        if (obj == null) {
            obj = getResources().getString(com.winpower.neonfit.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = M.P.f711a;
        new C0029z(com.winpower.neonfit.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3549a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3549a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f3571z = f2;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(H1.d.F(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f3556k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3550b = colorStateList;
        this.f3552d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3551c = mode;
        this.e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3553f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3553f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(H1.d.F(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3554g = colorStateList;
        this.i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3555h = mode;
        this.j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3549a || drawable == this.f3553f;
    }
}
