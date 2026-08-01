package m;

import L.C0014l;
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
import android.os.IBinder;
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
import androidx.recyclerview.widget.RecyclerView;
import f.AbstractC0097a;
import h.AbstractC0112a;
import j.C0145a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class W0 extends CompoundButton {

    /* renamed from: R, reason: collision with root package name */
    public static final V0 f3002R = new V0(Float.class, "thumbPos", 0);

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f3003S = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f3004A;

    /* renamed from: B, reason: collision with root package name */
    public int f3005B;

    /* renamed from: C, reason: collision with root package name */
    public int f3006C;

    /* renamed from: D, reason: collision with root package name */
    public int f3007D;

    /* renamed from: E, reason: collision with root package name */
    public int f3008E;

    /* renamed from: F, reason: collision with root package name */
    public int f3009F;
    public int G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3010H;

    /* renamed from: I, reason: collision with root package name */
    public final TextPaint f3011I;

    /* renamed from: J, reason: collision with root package name */
    public final ColorStateList f3012J;

    /* renamed from: K, reason: collision with root package name */
    public StaticLayout f3013K;

    /* renamed from: L, reason: collision with root package name */
    public StaticLayout f3014L;

    /* renamed from: M, reason: collision with root package name */
    public final C0145a f3015M;

    /* renamed from: N, reason: collision with root package name */
    public ObjectAnimator f3016N;

    /* renamed from: O, reason: collision with root package name */
    public C0247x f3017O;

    /* renamed from: P, reason: collision with root package name */
    public X.h f3018P;

    /* renamed from: Q, reason: collision with root package name */
    public final Rect f3019Q;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f3020a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f3021b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f3022c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3023e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3024f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3025g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3026h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3027j;

    /* renamed from: k, reason: collision with root package name */
    public int f3028k;

    /* renamed from: l, reason: collision with root package name */
    public int f3029l;

    /* renamed from: m, reason: collision with root package name */
    public int f3030m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3031n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f3032o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3033p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3034q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3035r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3036s;

    /* renamed from: t, reason: collision with root package name */
    public int f3037t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3038u;

    /* renamed from: v, reason: collision with root package name */
    public float f3039v;

    /* renamed from: w, reason: collision with root package name */
    public float f3040w;

    /* renamed from: x, reason: collision with root package name */
    public final VelocityTracker f3041x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3042y;

    /* renamed from: z, reason: collision with root package name */
    public float f3043z;

    public W0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winfour.winrandom.R.attr.switchStyle);
        int resourceId;
        this.f3021b = null;
        this.f3022c = null;
        this.d = false;
        this.f3023e = false;
        this.f3025g = null;
        this.f3026h = null;
        this.i = false;
        this.f3027j = false;
        this.f3041x = VelocityTracker.obtain();
        this.f3010H = true;
        this.f3019Q = new Rect();
        X0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f3011I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0097a.f2155v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.winfour.winrandom.R.attr.switchStyle, 0);
        C0014l c0014l = new C0014l(context, obtainStyledAttributes);
        L.T.k(this, context, iArr, attributeSet, obtainStyledAttributes, com.winfour.winrandom.R.attr.switchStyle);
        Drawable c2 = c0014l.c(2);
        this.f3020a = c2;
        if (c2 != null) {
            c2.setCallback(this);
        }
        Drawable c3 = c0014l.c(11);
        this.f3024f = c3;
        if (c3 != null) {
            c3.setCallback(this);
        }
        setTextOnInternal(obtainStyledAttributes.getText(0));
        setTextOffInternal(obtainStyledAttributes.getText(1));
        this.f3036s = obtainStyledAttributes.getBoolean(3, true);
        this.f3028k = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f3029l = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f3030m = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f3031n = obtainStyledAttributes.getBoolean(4, false);
        ColorStateList b2 = c0014l.b(9);
        if (b2 != null) {
            this.f3021b = b2;
            this.d = true;
        }
        PorterDuff.Mode c4 = AbstractC0234q0.c(obtainStyledAttributes.getInt(10, -1), null);
        if (this.f3022c != c4) {
            this.f3022c = c4;
            this.f3023e = true;
        }
        if (this.d || this.f3023e) {
            a();
        }
        ColorStateList b3 = c0014l.b(12);
        if (b3 != null) {
            this.f3025g = b3;
            this.i = true;
        }
        PorterDuff.Mode c5 = AbstractC0234q0.c(obtainStyledAttributes.getInt(13, -1), null);
        if (this.f3026h != c5) {
            this.f3026h = c5;
            this.f3027j = true;
        }
        if (this.i || this.f3027j) {
            b();
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId2, AbstractC0097a.f2156w);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = A1.m.s(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f3012J = colorStateList;
            } else {
                this.f3012J = getTextColors();
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
            float f3 = RecyclerView.A0;
            if (i2 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(defaultFromStyle);
                int i3 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : f3);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(RecyclerView.A0);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                Context context2 = getContext();
                C0145a c0145a = new C0145a();
                c0145a.f2657a = context2.getResources().getConfiguration().locale;
                this.f3015M = c0145a;
            } else {
                this.f3015M = null;
            }
            setTextOnInternal(this.f3032o);
            setTextOffInternal(this.f3034q);
            obtainStyledAttributes2.recycle();
        }
        new Y(this).f(attributeSet, com.winfour.winrandom.R.attr.switchStyle);
        c0014l.k();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3038u = viewConfiguration.getScaledTouchSlop();
        this.f3042y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.winfour.winrandom.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0247x getEmojiTextViewHelper() {
        if (this.f3017O == null) {
            this.f3017O = new C0247x(this);
        }
        return this.f3017O;
    }

    private boolean getTargetCheckedState() {
        return this.f3043z > 0.5f;
    }

    private int getThumbOffset() {
        boolean z2 = o1.f3158a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f3043z : this.f3043z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3024f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3019Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3020a;
        Rect b2 = drawable2 != null ? AbstractC0234q0.b(drawable2) : AbstractC0234q0.f3171c;
        return ((((this.f3004A - this.f3006C) - rect.left) - rect.right) - b2.left) - b2.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3034q = charSequence;
        C0247x emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod l0 = ((A1.d) emojiTextViewHelper.f3209b.f122b).l0(this.f3015M);
        if (l0 != null) {
            charSequence = l0.getTransformation(charSequence, this);
        }
        this.f3035r = charSequence;
        this.f3014L = null;
        if (this.f3036s) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3032o = charSequence;
        C0247x emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod l0 = ((A1.d) emojiTextViewHelper.f3209b.f122b).l0(this.f3015M);
        if (l0 != null) {
            charSequence = l0.getTransformation(charSequence, this);
        }
        this.f3033p = charSequence;
        this.f3013K = null;
        if (this.f3036s) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f3020a;
        if (drawable != null) {
            if (this.d || this.f3023e) {
                Drawable mutate = drawable.mutate();
                this.f3020a = mutate;
                if (this.d) {
                    E.a.h(mutate, this.f3021b);
                }
                if (this.f3023e) {
                    E.a.i(this.f3020a, this.f3022c);
                }
                if (this.f3020a.isStateful()) {
                    this.f3020a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f3024f;
        if (drawable != null) {
            if (this.i || this.f3027j) {
                Drawable mutate = drawable.mutate();
                this.f3024f = mutate;
                if (this.i) {
                    E.a.h(mutate, this.f3025g);
                }
                if (this.f3027j) {
                    E.a.i(this.f3024f, this.f3026h);
                }
                if (this.f3024f.isStateful()) {
                    this.f3024f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f3032o);
        setTextOffInternal(this.f3034q);
        requestLayout();
    }

    public final void d() {
        if (this.f3018P == null && ((A1.d) this.f3017O.f3209b.f122b).P() && V.j.f897k != null) {
            V.j a2 = V.j.a();
            int b2 = a2.b();
            if (b2 == 3 || b2 == 0) {
                X.h hVar = new X.h(this);
                this.f3018P = hVar;
                a2.f(hVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f3007D;
        int i4 = this.f3008E;
        int i5 = this.f3009F;
        int i6 = this.G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f3020a;
        Rect b2 = drawable != null ? AbstractC0234q0.b(drawable) : AbstractC0234q0.f3171c;
        Drawable drawable2 = this.f3024f;
        Rect rect = this.f3019Q;
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
                    this.f3024f.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f3024f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f3020a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f3006C + rect.right;
            this.f3020a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                E.a.f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f3020a;
        if (drawable != null) {
            E.a.e(drawable, f2, f3);
        }
        Drawable drawable2 = this.f3024f;
        if (drawable2 != null) {
            E.a.e(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3020a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3024f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z2 = o1.f3158a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3004A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3030m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z2 = o1.f3158a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3004A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3030m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return A1.m.n0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f3036s;
    }

    public boolean getSplitTrack() {
        return this.f3031n;
    }

    public int getSwitchMinWidth() {
        return this.f3029l;
    }

    public int getSwitchPadding() {
        return this.f3030m;
    }

    public CharSequence getTextOff() {
        return this.f3034q;
    }

    public CharSequence getTextOn() {
        return this.f3032o;
    }

    public Drawable getThumbDrawable() {
        return this.f3020a;
    }

    public final float getThumbPosition() {
        return this.f3043z;
    }

    public int getThumbTextPadding() {
        return this.f3028k;
    }

    public ColorStateList getThumbTintList() {
        return this.f3021b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3022c;
    }

    public Drawable getTrackDrawable() {
        return this.f3024f;
    }

    public ColorStateList getTrackTintList() {
        return this.f3025g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3026h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3020a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3024f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3016N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3016N.end();
        this.f3016N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3003S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f3024f;
        Rect rect = this.f3019Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f3008E;
        int i2 = this.G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f3020a;
        if (drawable != null) {
            if (!this.f3031n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b2 = AbstractC0234q0.b(drawable2);
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f3013K : this.f3014L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3012J;
            TextPaint textPaint = this.f3011I;
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
            CharSequence charSequence = isChecked() ? this.f3032o : this.f3034q;
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
        if (this.f3020a != null) {
            Drawable drawable = this.f3024f;
            Rect rect = this.f3019Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b2 = AbstractC0234q0.b(this.f3020a);
            i5 = Math.max(0, b2.left - rect.left);
            i9 = Math.max(0, b2.right - rect.right);
        } else {
            i5 = 0;
        }
        boolean z3 = o1.f3158a;
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f3004A + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f3004A) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i10 = this.f3005B;
            int i11 = height - (i10 / 2);
            i7 = i10 + i11;
            i8 = i11;
        } else if (gravity != 80) {
            i8 = getPaddingTop();
            i7 = this.f3005B + i8;
        } else {
            i7 = getHeight() - getPaddingBottom();
            i8 = i7 - this.f3005B;
        }
        this.f3007D = i6;
        this.f3008E = i8;
        this.G = i7;
        this.f3009F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.f3036s) {
            StaticLayout staticLayout = this.f3013K;
            TextPaint textPaint = this.f3011I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f3033p;
                this.f3013K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, RecyclerView.A0, true);
            }
            if (this.f3014L == null) {
                CharSequence charSequence2 = this.f3035r;
                this.f3014L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, RecyclerView.A0, true);
            }
        }
        Drawable drawable = this.f3020a;
        Rect rect = this.f3019Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f3020a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f3020a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f3006C = Math.max(this.f3036s ? (this.f3028k * 2) + Math.max(this.f3013K.getWidth(), this.f3014L.getWidth()) : 0, i3);
        Drawable drawable2 = this.f3024f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f3024f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f3020a;
        if (drawable3 != null) {
            Rect b2 = AbstractC0234q0.b(drawable3);
            i6 = Math.max(i6, b2.left);
            i7 = Math.max(i7, b2.right);
        }
        int max = this.f3010H ? Math.max(this.f3029l, (this.f3006C * 2) + i6 + i7) : this.f3029l;
        int max2 = Math.max(i5, i4);
        this.f3004A = max;
        this.f3005B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3032o : this.f3034q;
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
        VelocityTracker velocityTracker = this.f3041x;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f3038u;
        if (actionMasked != 0) {
            float f2 = RecyclerView.A0;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.f3037t;
                    if (i2 == 1) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        float f3 = i;
                        if (Math.abs(x2 - this.f3039v) > f3 || Math.abs(y2 - this.f3040w) > f3) {
                            this.f3037t = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f3039v = x2;
                            this.f3040w = y2;
                            return true;
                        }
                    } else if (i2 == 2) {
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f4 = x3 - this.f3039v;
                        float f5 = thumbScrollRange != 0 ? f4 / thumbScrollRange : f4 > RecyclerView.A0 ? 1.0f : -1.0f;
                        boolean z3 = o1.f3158a;
                        if (getLayoutDirection() == 1) {
                            f5 = -f5;
                        }
                        float f6 = this.f3043z;
                        float f7 = f5 + f6;
                        if (f7 >= RecyclerView.A0) {
                            f2 = f7 > 1.0f ? 1.0f : f7;
                        }
                        if (f2 != f6) {
                            this.f3039v = x3;
                            setThumbPosition(f2);
                        }
                        return true;
                    }
                }
            }
            if (this.f3037t == 2) {
                this.f3037t = 0;
                boolean z4 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z4) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(xVelocity) > this.f3042y) {
                        boolean z5 = o1.f3158a;
                        z2 = getLayoutDirection() != 1 ? xVelocity > RecyclerView.A0 : xVelocity < RecyclerView.A0;
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
            this.f3037t = 0;
            velocityTracker.clear();
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f3020a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f3020a;
                Rect rect = this.f3019Q;
                drawable.getPadding(rect);
                int i3 = this.f3008E - i;
                int i4 = (this.f3007D + thumbOffset) - i;
                int i5 = this.f3006C + i4 + rect.left + rect.right + i;
                int i6 = this.G + i;
                if (x4 > i4 && x4 < i5 && y3 > i3 && y3 < i6) {
                    this.f3037t = 1;
                    this.f3039v = x4;
                    this.f3040w = y3;
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
                Object obj = this.f3032o;
                if (obj == null) {
                    obj = getResources().getString(com.winfour.winrandom.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = L.T.f490a;
                new L.C(com.winfour.winrandom.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f3034q;
            if (obj3 == null) {
                obj3 = getResources().getString(com.winfour.winrandom.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = L.T.f490a;
            new L.C(com.winfour.winrandom.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj4);
        }
        IBinder windowToken = getWindowToken();
        float f2 = RecyclerView.A0;
        if (windowToken == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f3016N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (isChecked) {
                f2 = 1.0f;
            }
            setThumbPosition(f2);
            return;
        }
        if (isChecked) {
            f2 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f3002R, f2);
        this.f3016N = ofFloat;
        ofFloat.setDuration(250L);
        this.f3016N.setAutoCancel(true);
        this.f3016N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A1.m.p0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
        setTextOnInternal(this.f3032o);
        setTextOffInternal(this.f3034q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.f3010H = z2;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.f3036s != z2) {
            this.f3036s = z2;
            requestLayout();
            if (z2) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f3031n = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f3029l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f3030m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f3011I;
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
        Object obj = this.f3034q;
        if (obj == null) {
            obj = getResources().getString(com.winfour.winrandom.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = L.T.f490a;
        new L.C(com.winfour.winrandom.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f3032o;
        if (obj == null) {
            obj = getResources().getString(com.winfour.winrandom.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = L.T.f490a;
        new L.C(com.winfour.winrandom.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3020a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3020a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f3043z = f2;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AbstractC0112a.l(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f3028k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3021b = colorStateList;
        this.d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3022c = mode;
        this.f3023e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3024f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3024f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AbstractC0112a.l(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3025g = colorStateList;
        this.i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3026h = mode;
        this.f3027j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3020a || drawable == this.f3024f;
    }
}
