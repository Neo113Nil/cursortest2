package android.support.v7.widget;

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
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.a;
import defpackage.acv;
import defpackage.add;
import defpackage.afr;
import defpackage.brn;
import defpackage.byo;
import defpackage.em;
import defpackage.eu;
import defpackage.it;
import defpackage.jl;
import defpackage.kt;
import defpackage.ma;
import defpackage.mb;
import defpackage.yq;
import defpackage.zy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property c = new ma(Float.class);
    private static final int[] d = {R.attr.state_checked};
    private float A;
    private VelocityTracker B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private boolean K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    private final it Q;
    private final Rect R;
    private afr S;
    public float a;
    ObjectAnimator b;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;
    private Drawable j;
    private ColorStateList k;
    private PorterDuff.Mode l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private CharSequence s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private boolean w;
    private int x;
    private int y;
    private float z;

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        Drawable drawable2;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = false;
        this.B = VelocityTracker.obtain();
        this.K = true;
        this.R = new Rect();
        mb.d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = em.w;
        byo u = byo.u(context, attributeSet, iArr, i, 0);
        yq.k(this, context, iArr, attributeSet, (TypedArray) u.a, i, 0);
        Drawable j = u.j(2);
        this.e = j;
        if (j != null) {
            j.setCallback(this);
        }
        Drawable j2 = u.j(11);
        this.j = j2;
        if (j2 != null) {
            j2.setCallback(this);
        }
        e(u.l(0));
        d(u.l(1));
        this.w = u.o(3, true);
        this.o = u.d(8, 0);
        this.p = u.d(5, 0);
        this.q = u.d(6, 0);
        this.r = u.o(4, false);
        ColorStateList i2 = u.i(9);
        if (i2 != null) {
            this.f = i2;
            this.h = true;
        }
        int e = u.e(10, -1);
        Rect rect = jl.a;
        PorterDuff.Mode q = a.q(e, null);
        if (this.g != q) {
            this.g = q;
            this.i = true;
        }
        boolean z = this.h;
        if ((z || this.i) && (drawable = this.e) != null && (z || this.i)) {
            Drawable mutate = drawable.mutate();
            this.e = mutate;
            if (this.h) {
                mutate.setTintList(this.f);
            }
            if (this.i) {
                this.e.setTintMode(this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(getDrawableState());
            }
        }
        ColorStateList i3 = u.i(12);
        if (i3 != null) {
            this.k = i3;
            this.m = true;
        }
        PorterDuff.Mode q2 = a.q(u.e(13, -1), null);
        if (this.l != q2) {
            this.l = q2;
            this.n = true;
        }
        boolean z2 = this.m;
        if ((z2 || this.n) && (drawable2 = this.j) != null && (z2 || this.n)) {
            Drawable mutate2 = drawable2.mutate();
            this.j = mutate2;
            if (this.m) {
                mutate2.setTintList(this.k);
            }
            if (this.n) {
                this.j.setTintMode(this.l);
            }
            if (this.j.isStateful()) {
                this.j.setState(getDrawableState());
            }
        }
        int h = u.h(7, 0);
        if (h != 0) {
            byo s = byo.s(context, h, em.x);
            ColorStateList i4 = s.i(3);
            if (i4 != null) {
                this.M = i4;
            } else {
                this.M = getTextColors();
            }
            int d2 = s.d(0, 0);
            if (d2 != 0) {
                float f = d2;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int e2 = s.e(1, -1);
            int e3 = s.e(2, -1);
            Typeface typeface = e2 != 1 ? e2 != 2 ? e2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (e3 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(e3) : Typeface.create(typeface, e3);
                c(defaultFromStyle);
                int i5 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & e3;
                textPaint.setFakeBoldText(1 == (i5 & 1));
                textPaint.setTextSkewX((2 & i5) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                c(typeface);
            }
            if (s.o(14, false)) {
                this.P = new eu(getContext());
            } else {
                this.P = null;
            }
            e(this.s);
            d(this.u);
            s.n();
        }
        it itVar = new it(this);
        this.Q = itVar;
        itVar.c(attributeSet, i);
        u.n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.y = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        m().r(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private final int g() {
        boolean v = kt.v(this);
        float f = this.a;
        if (v) {
            f = 1.0f - f;
        }
        return (int) ((f * h()) + 0.5f);
    }

    private final int h() {
        Drawable drawable = this.j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.e;
        Rect a = drawable2 != null ? jl.a(drawable2) : jl.a;
        return ((((this.D - this.F) - rect.left) - rect.right) - a.left) - a.right;
    }

    private final Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.L, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, this.L)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final CharSequence j(CharSequence charSequence) {
        Object obj = m().a;
        TransformationMethod transformationMethod = this.P;
        acv acvVar = acv.a;
        return transformationMethod != null ? transformationMethod.getTransformation(charSequence, this) : charSequence;
    }

    private final void k() {
        if (((add) ((brn) this.S.a).a).a.a) {
            acv acvVar = acv.a;
        }
    }

    private final boolean l() {
        return this.a > 0.5f;
    }

    private final afr m() {
        afr afrVar = this.S;
        if (afrVar != null) {
            return afrVar;
        }
        afr afrVar2 = new afr(this);
        this.S = afrVar2;
        return afrVar2;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.u;
            if (charSequence == null) {
                charSequence = getResources().getString(com.google.android.apps.authenticator2.R.string.abc_capital_off);
            }
            yq.o(this, charSequence);
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.s;
            if (charSequence == null) {
                charSequence = getResources().getString(com.google.android.apps.authenticator2.R.string.abc_capital_on);
            }
            yq.o(this, charSequence);
        }
    }

    public final void c(Typeface typeface) {
        TextPaint textPaint = this.L;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.u = charSequence;
        this.v = j(charSequence);
        this.O = null;
        if (this.w) {
            k();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.G;
        int i4 = this.H;
        int i5 = this.I;
        int i6 = this.J;
        int g = g() + i3;
        Drawable drawable = this.e;
        Rect a = drawable != null ? jl.a(drawable) : jl.a;
        Rect rect = this.R;
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            g += rect.left;
            if (a != null) {
                if (a.left > rect.left) {
                    i3 += a.left - rect.left;
                }
                i = a.top > rect.top ? (a.top - rect.top) + i4 : i4;
                if (a.right > rect.right) {
                    i5 -= a.right - rect.right;
                }
                if (a.bottom > rect.bottom) {
                    i2 = i6 - (a.bottom - rect.bottom);
                    this.j.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.j.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i7 = g - rect.left;
            int i8 = g + this.F + rect.right;
            this.e.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.e;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e(CharSequence charSequence) {
        this.s = charSequence;
        this.t = j(charSequence);
        this.N = null;
        if (this.w) {
            k();
        }
    }

    public final void f(float f) {
        this.a = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!kt.v(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (kt.v(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.q : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        zy.d(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.b.end();
        this.b = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.j;
        Rect rect = this.R;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.H;
        int i2 = this.J;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.e;
        if (drawable != null) {
            if (!this.r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a = jl.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
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
        Layout layout = l() ? this.N : this.O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
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
            CharSequence charSequence = isChecked() ? this.s : this.u;
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
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.e != null) {
            Rect rect = this.R;
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = jl.a(this.e);
            i5 = Math.max(0, a.left - rect.left);
            i10 = Math.max(0, a.right - rect.right);
        } else {
            i5 = 0;
        }
        if (kt.v(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.D + i6) - i5) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i6 = (width - this.D) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = (getPaddingTop() + getHeight()) - getPaddingBottom();
            i7 = this.E;
            i8 = (paddingTop / 2) - (i7 / 2);
        } else {
            if (gravity == 80) {
                i9 = getHeight() - getPaddingBottom();
                i8 = i9 - this.E;
                this.G = i6;
                this.H = i8;
                this.J = i9;
                this.I = width;
            }
            i8 = getPaddingTop();
            i7 = this.E;
        }
        i9 = i7 + i8;
        this.G = i6;
        this.H = i8;
        this.J = i9;
        this.I = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.w) {
            if (this.N == null) {
                this.N = i(this.t);
            }
            if (this.O == null) {
                this.O = i(this.v);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.e;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.e.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.e.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.w) {
            int max = Math.max(this.N.getWidth(), this.O.getWidth());
            int i7 = this.o;
            i5 = max + i7 + i7;
        } else {
            i5 = 0;
        }
        this.F = Math.max(i5, i3);
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            Rect a = jl.a(drawable3);
            i8 = Math.max(i8, a.left);
            i9 = Math.max(i9, a.right);
        }
        boolean z = this.K;
        int i10 = this.p;
        if (z) {
            int i11 = this.F;
            i10 = Math.max(i10, i11 + i11 + i8 + i9);
        }
        int max2 = Math.max(i6, i4);
        this.D = i10;
        this.E = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.s : this.u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.B.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.x;
                    if (i == 1) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (Math.abs(x - this.z) > this.y || Math.abs(y - this.A) > this.y) {
                            this.x = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.z = x;
                            this.A = y;
                            return true;
                        }
                    } else if (i == 2) {
                        float x2 = motionEvent.getX();
                        int h = h();
                        float f = x2 - this.z;
                        float f2 = h != 0 ? f / h : f > 0.0f ? 1.0f : -1.0f;
                        if (kt.v(this)) {
                            f2 = -f2;
                        }
                        float f3 = this.a;
                        float f4 = f2 + f3;
                        float f5 = f4 >= 0.0f ? f4 > 1.0f ? 1.0f : f4 : 0.0f;
                        if (f5 != f3) {
                            this.z = x2;
                            f(f5);
                        }
                        return true;
                    }
                }
            }
            if (this.x == 2) {
                this.x = 0;
                boolean z2 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z2) {
                    this.B.computeCurrentVelocity(1000);
                    float xVelocity = this.B.getXVelocity();
                    z = Math.abs(xVelocity) > ((float) this.C) ? !kt.v(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : l();
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
            this.x = 0;
            this.B.clear();
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.e != null) {
                int g = g();
                Drawable drawable = this.e;
                Rect rect = this.R;
                drawable.getPadding(rect);
                int i2 = this.H;
                int i3 = this.y;
                int i4 = i2 - i3;
                int i5 = (this.G + g) - i3;
                int i6 = this.F + i5 + rect.left + rect.right;
                int i7 = this.y;
                int i8 = i6 + i7;
                int i9 = this.J + i7;
                if (x3 > i5 && x3 < i8 && y2 > i4 && y2 < i9) {
                    this.x = 1;
                    this.z = x3;
                    this.A = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m();
        acv acvVar = acv.a;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            b();
        } else {
            a();
        }
        float f = true != isChecked ? 0.0f : 1.0f;
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            f(f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) c, f);
        this.b = ofFloat;
        ofFloat.setDuration(250L);
        this.b.setAutoCancel(true);
        this.b.start();
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        m();
        acv acvVar = acv.a;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.j;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.switchStyle);
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}
