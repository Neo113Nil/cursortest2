package androidx.appcompat.widget;

import B0.C0008i;
import a.AbstractC0086a;
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
import d.AbstractC0119a;
import e.AbstractC0121a;
import f.C0129a;
import i.AbstractC0178z;
import i.C0173u;
import i.g0;
import i.w0;
import java.lang.reflect.Field;
import s.AbstractC0226a;
import y.x;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: Q, reason: collision with root package name */
    public static final g0 f1308Q = new g0(Float.class, "thumbPos");

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f1309R = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public final int f1310A;

    /* renamed from: B, reason: collision with root package name */
    public float f1311B;

    /* renamed from: C, reason: collision with root package name */
    public int f1312C;

    /* renamed from: D, reason: collision with root package name */
    public int f1313D;

    /* renamed from: E, reason: collision with root package name */
    public int f1314E;

    /* renamed from: F, reason: collision with root package name */
    public int f1315F;
    public int G;

    /* renamed from: H, reason: collision with root package name */
    public int f1316H;

    /* renamed from: I, reason: collision with root package name */
    public int f1317I;

    /* renamed from: J, reason: collision with root package name */
    public final TextPaint f1318J;

    /* renamed from: K, reason: collision with root package name */
    public final ColorStateList f1319K;

    /* renamed from: L, reason: collision with root package name */
    public StaticLayout f1320L;

    /* renamed from: M, reason: collision with root package name */
    public StaticLayout f1321M;

    /* renamed from: N, reason: collision with root package name */
    public final C0129a f1322N;

    /* renamed from: O, reason: collision with root package name */
    public ObjectAnimator f1323O;

    /* renamed from: P, reason: collision with root package name */
    public final Rect f1324P;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1325e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f1326f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1327g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1328h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1329i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1330j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1331k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1332l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1333m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1334n;

    /* renamed from: o, reason: collision with root package name */
    public int f1335o;

    /* renamed from: p, reason: collision with root package name */
    public int f1336p;

    /* renamed from: q, reason: collision with root package name */
    public int f1337q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1338r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1339s;
    public CharSequence t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1340u;

    /* renamed from: v, reason: collision with root package name */
    public int f1341v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1342w;

    /* renamed from: x, reason: collision with root package name */
    public float f1343x;

    /* renamed from: y, reason: collision with root package name */
    public float f1344y;

    /* renamed from: z, reason: collision with root package name */
    public final VelocityTracker f1345z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
    
        if (r9 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.crane.slab.beam.R.attr.switchStyle);
        ColorStateList colorStateList;
        int resourceId;
        this.f1326f = null;
        this.f1327g = null;
        this.f1328h = false;
        this.f1329i = false;
        this.f1331k = null;
        this.f1332l = null;
        this.f1333m = false;
        this.f1334n = false;
        this.f1345z = VelocityTracker.obtain();
        this.f1324P = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f1318J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C0008i D2 = C0008i.D(context, attributeSet, AbstractC0119a.f1804r, com.crane.slab.beam.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) D2.f84f;
        Drawable v2 = D2.v(2);
        this.f1325e = v2;
        if (v2 != null) {
            v2.setCallback(this);
        }
        Drawable v3 = D2.v(11);
        this.f1330j = v3;
        if (v3 != null) {
            v3.setCallback(this);
        }
        this.f1339s = typedArray.getText(0);
        this.t = typedArray.getText(1);
        this.f1340u = typedArray.getBoolean(3, true);
        this.f1335o = typedArray.getDimensionPixelSize(8, 0);
        this.f1336p = typedArray.getDimensionPixelSize(5, 0);
        this.f1337q = typedArray.getDimensionPixelSize(6, 0);
        this.f1338r = typedArray.getBoolean(4, false);
        ColorStateList u2 = D2.u(9);
        if (u2 != null) {
            this.f1326f = u2;
            this.f1328h = true;
        }
        PorterDuff.Mode c2 = AbstractC0178z.c(typedArray.getInt(10, -1), null);
        if (this.f1327g != c2) {
            this.f1327g = c2;
            this.f1329i = true;
        }
        if (this.f1328h || this.f1329i) {
            a();
        }
        ColorStateList u3 = D2.u(12);
        if (u3 != null) {
            this.f1331k = u3;
            this.f1333m = true;
        }
        PorterDuff.Mode c3 = AbstractC0178z.c(typedArray.getInt(13, -1), null);
        if (this.f1332l != c3) {
            this.f1332l = c3;
            this.f1334n = true;
        }
        if (this.f1333m || this.f1334n) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0119a.f1805s);
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) != 0) {
                Object obj = AbstractC0121a.f1852a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList != null) {
                this.f1319K = colorStateList;
            } else {
                this.f1319K = getTextColors();
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
                C0129a c0129a = new C0129a();
                c0129a.f1888e = context2.getResources().getConfiguration().locale;
                this.f1322N = c0129a;
            } else {
                this.f1322N = null;
            }
            obtainStyledAttributes.recycle();
        }
        new C0173u(this).d(attributeSet, com.crane.slab.beam.R.attr.switchStyle);
        D2.G();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1342w = viewConfiguration.getScaledTouchSlop();
        this.f1310A = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f1311B > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((w0.a(this) ? 1.0f - this.f1311B : this.f1311B) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1330j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1324P;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1325e;
        Rect b2 = drawable2 != null ? AbstractC0178z.b(drawable2) : AbstractC0178z.f2351a;
        return ((((this.f1312C - this.f1314E) - rect.left) - rect.right) - b2.left) - b2.right;
    }

    public final void a() {
        Drawable drawable = this.f1325e;
        if (drawable != null) {
            if (this.f1328h || this.f1329i) {
                Drawable mutate = drawable.mutate();
                this.f1325e = mutate;
                if (this.f1328h) {
                    AbstractC0226a.h(mutate, this.f1326f);
                }
                if (this.f1329i) {
                    AbstractC0226a.i(this.f1325e, this.f1327g);
                }
                if (this.f1325e.isStateful()) {
                    this.f1325e.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1330j;
        if (drawable != null) {
            if (this.f1333m || this.f1334n) {
                Drawable mutate = drawable.mutate();
                this.f1330j = mutate;
                if (this.f1333m) {
                    AbstractC0226a.h(mutate, this.f1331k);
                }
                if (this.f1334n) {
                    AbstractC0226a.i(this.f1330j, this.f1332l);
                }
                if (this.f1330j.isStateful()) {
                    this.f1330j.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        C0129a c0129a = this.f1322N;
        if (c0129a != null) {
            charSequence = c0129a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f1318J, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4 = this.f1315F;
        int i5 = this.G;
        int i6 = this.f1316H;
        int i7 = this.f1317I;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f1325e;
        Rect b2 = drawable != null ? AbstractC0178z.b(drawable) : AbstractC0178z.f2351a;
        Drawable drawable2 = this.f1330j;
        Rect rect = this.f1324P;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (b2 != null) {
                int i9 = b2.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = b2.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = b2.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = b2.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.f1330j.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f1330j.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f1325e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.f1314E + rect.right;
            this.f1325e.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0226a.f(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f1325e;
        if (drawable != null) {
            AbstractC0226a.e(drawable, f2, f3);
        }
        Drawable drawable2 = this.f1330j;
        if (drawable2 != null) {
            AbstractC0226a.e(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1325e;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1330j;
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
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1312C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1337q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (w0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1312C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1337q : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1340u;
    }

    public boolean getSplitTrack() {
        return this.f1338r;
    }

    public int getSwitchMinWidth() {
        return this.f1336p;
    }

    public int getSwitchPadding() {
        return this.f1337q;
    }

    public CharSequence getTextOff() {
        return this.t;
    }

    public CharSequence getTextOn() {
        return this.f1339s;
    }

    public Drawable getThumbDrawable() {
        return this.f1325e;
    }

    public int getThumbTextPadding() {
        return this.f1335o;
    }

    public ColorStateList getThumbTintList() {
        return this.f1326f;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1327g;
    }

    public Drawable getTrackDrawable() {
        return this.f1330j;
    }

    public ColorStateList getTrackTintList() {
        return this.f1331k;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1332l;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1325e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1330j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1323O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1323O.end();
        this.f1323O = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1309R);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1330j;
        Rect rect = this.f1324P;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.G;
        int i3 = this.f1317I;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1325e;
        if (drawable != null) {
            if (!this.f1338r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b2 = AbstractC0178z.b(drawable2);
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1320L : this.f1321M;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f1318J;
            ColorStateList colorStateList = this.f1319K;
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
        CharSequence charSequence = isChecked() ? this.f1339s : this.t;
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
        if (this.f1325e != null) {
            Drawable drawable = this.f1330j;
            Rect rect = this.f1324P;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b2 = AbstractC0178z.b(this.f1325e);
            i6 = Math.max(0, b2.left - rect.left);
            i10 = Math.max(0, b2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (w0.a(this)) {
            i7 = getPaddingLeft() + i6;
            width = ((this.f1312C + i7) - i6) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i7 = (width - this.f1312C) + i6 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i11 = this.f1313D;
            int i12 = height - (i11 / 2);
            i8 = i11 + i12;
            i9 = i12;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f1313D + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1313D;
        }
        this.f1315F = i7;
        this.G = i9;
        this.f1317I = i8;
        this.f1316H = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.f1340u) {
            if (this.f1320L == null) {
                this.f1320L = c(this.f1339s);
            }
            if (this.f1321M == null) {
                this.f1321M = c(this.t);
            }
        }
        Drawable drawable = this.f1325e;
        int i7 = 0;
        Rect rect = this.f1324P;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1325e.getIntrinsicWidth() - rect.left) - rect.right;
            i5 = this.f1325e.getIntrinsicHeight();
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (this.f1340u) {
            i6 = (this.f1335o * 2) + Math.max(this.f1320L.getWidth(), this.f1321M.getWidth());
        } else {
            i6 = 0;
        }
        this.f1314E = Math.max(i6, i4);
        Drawable drawable2 = this.f1330j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f1330j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f1325e;
        if (drawable3 != null) {
            Rect b2 = AbstractC0178z.b(drawable3);
            i8 = Math.max(i8, b2.left);
            i9 = Math.max(i9, b2.right);
        }
        int max = Math.max(this.f1336p, (this.f1314E * 2) + i8 + i9);
        int max2 = Math.max(i7, i5);
        this.f1312C = max;
        this.f1313D = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1339s : this.t;
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
        VelocityTracker velocityTracker = this.f1345z;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f1342w;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i3 = this.f1341v;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        float f2 = i2;
                        if (Math.abs(x2 - this.f1343x) > f2 || Math.abs(y2 - this.f1344y) > f2) {
                            this.f1341v = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f1343x = x2;
                            this.f1344y = y2;
                            return true;
                        }
                    } else if (i3 == 2) {
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x3 - this.f1343x;
                        float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > 0.0f ? 1.0f : -1.0f;
                        if (w0.a(this)) {
                            f4 = -f4;
                        }
                        float f5 = this.f1311B;
                        float f6 = f4 + f5;
                        float f7 = f6 >= 0.0f ? f6 > 1.0f ? 1.0f : f6 : 0.0f;
                        if (f7 != f5) {
                            this.f1343x = x3;
                            setThumbPosition(f7);
                        }
                        return true;
                    }
                }
            }
            if (this.f1341v == 2) {
                this.f1341v = 0;
                boolean z3 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z3) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    z2 = Math.abs(xVelocity) > ((float) this.f1310A) ? !w0.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
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
            this.f1341v = 0;
            velocityTracker.clear();
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f1325e != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f1325e;
                Rect rect = this.f1324P;
                drawable.getPadding(rect);
                int i4 = this.G - i2;
                int i5 = (this.f1315F + thumbOffset) - i2;
                int i6 = this.f1314E + i5 + rect.left + rect.right + i2;
                int i7 = this.f1317I + i2;
                if (x4 > i5 && x4 < i6 && y3 > i4 && y3 < i7) {
                    this.f1341v = 1;
                    this.f1343x = x4;
                    this.f1344y = y3;
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
            Field field = x.f3160a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1308Q, isChecked ? 1.0f : 0.0f);
                this.f1323O = ofFloat;
                ofFloat.setDuration(250L);
                this.f1323O.setAutoCancel(true);
                this.f1323O.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1323O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0086a.K(callback, this));
    }

    public void setShowText(boolean z2) {
        if (this.f1340u != z2) {
            this.f1340u = z2;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f1338r = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f1336p = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f1337q = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1318J;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.t = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1339s = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1325e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1325e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f1311B = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(AbstractC0121a.a(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f1335o = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1326f = colorStateList;
        this.f1328h = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1327g = mode;
        this.f1329i = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1330j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1330j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(AbstractC0121a.a(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1331k = colorStateList;
        this.f1333m = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1332l = mode;
        this.f1334n = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1325e || drawable == this.f1330j;
    }
}
