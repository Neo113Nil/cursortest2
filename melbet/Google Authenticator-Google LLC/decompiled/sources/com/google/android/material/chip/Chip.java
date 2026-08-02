package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.Cfor;
import defpackage.aiz;
import defpackage.fgu;
import defpackage.fgv;
import defpackage.fgw;
import defpackage.fgx;
import defpackage.fgy;
import defpackage.fgz;
import defpackage.fha;
import defpackage.fhq;
import defpackage.fjw;
import defpackage.fmo;
import defpackage.fmp;
import defpackage.fmq;
import defpackage.fny;
import defpackage.fog;
import defpackage.frj;
import defpackage.hu;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Chip extends hu implements Checkable, fgx, Cfor {
    private static final int g = 2132019728;
    public fgy c;
    public CompoundButton.OnCheckedChangeListener d;
    public boolean e;
    public final Rect f;
    private InsetDrawable j;
    private RippleDrawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private final RectF r;
    private final fmp s;
    public static final Rect b = new Rect();
    private static final int[] h = {R.attr.state_selected};
    private static final int[] i = {R.attr.state_checkable};

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet, int i2) {
        super(frj.a(context, attributeSet, i2, r4), attributeSet, i2);
        int i3 = g;
        this.f = new Rect();
        this.r = new RectF();
        this.s = new fgu(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        fgy f = fgy.f(context2, attributeSet, i2, i3);
        int[] iArr = fha.a;
        TypedArray a = fjw.a(context2, attributeSet, iArr, i2, i3, new int[0]);
        this.o = a.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue k = fny.k(theme, com.google.android.apps.authenticator2.R.attr.minTouchTargetSize);
        float f2 = Float.NaN;
        if (k != null && k.type == 5) {
            f2 = k.getDimension(theme.getResources().getDisplayMetrics());
        }
        this.q = (int) Math.ceil(a.getDimension(21, Float.isNaN(f2) ? (int) context2.getResources().getDimension(com.google.android.apps.authenticator2.R.dimen.mtrl_min_touch_target_size) : (int) f2));
        a.recycle();
        fgy fgyVar = this.c;
        if (fgyVar != f) {
            if (fgyVar != null) {
                fgyVar.m(null);
            }
            this.c = f;
            f.n = false;
            f.m(this);
            f(this.q);
        }
        f.L(getElevation());
        TypedArray a2 = fjw.a(context2, attributeSet, iArr, i2, i3, new int[0]);
        boolean hasValue = a2.hasValue(39);
        a2.recycle();
        new fgw(this, this);
        g();
        yq.l(this, null);
        if (!hasValue) {
            setOutlineProvider(new fgv(this));
        }
        setChecked(this.l);
        setText(f.d);
        setEllipsize(f.m);
        m();
        if (!this.c.n) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        l();
        if (this.o) {
            setMinHeight(this.q);
        }
        this.p = getLayoutDirection();
        super.setOnCheckedChangeListener(new aiz(this, 3));
    }

    private final void h() {
        if (this.j != null) {
            this.j = null;
            setMinWidth(0);
            fgy fgyVar = this.c;
            setMinHeight((int) (fgyVar != null ? fgyVar.b : 0.0f));
            k();
        }
    }

    private final void i(boolean z) {
        if (this.n != z) {
            this.n = z;
            refreshDrawableState();
        }
    }

    private final void j(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
        }
    }

    private final void k() {
        RippleDrawable rippleDrawable = new RippleDrawable(fmq.b(this.c.c), b(), null);
        FocusRingDrawable.a(getContext(), rippleDrawable, this.c);
        this.k = rippleDrawable;
        setBackground(rippleDrawable);
        l();
    }

    private final void l() {
        fgy fgyVar;
        if (TextUtils.isEmpty(getText()) || (fgyVar = this.c) == null) {
            return;
        }
        float b2 = fgyVar.k + fgyVar.j + fgyVar.b();
        int a = (int) (fgyVar.h + fgyVar.i + fgyVar.a());
        int i2 = (int) b2;
        if (this.j != null) {
            Rect rect = new Rect();
            this.j.getPadding(rect);
            a += rect.left;
            i2 += rect.right;
        }
        setPaddingRelative(a, getPaddingTop(), i2, getPaddingBottom());
    }

    private final void m() {
        TextPaint paint = getPaint();
        fgy fgyVar = this.c;
        if (fgyVar != null) {
            paint.drawableState = fgyVar.getState();
        }
        fgy fgyVar2 = this.c;
        fmo g2 = fgyVar2 != null ? fgyVar2.g() : null;
        if (g2 != null) {
            g2.c(getContext(), paint, this.s);
        }
    }

    public final RectF a() {
        RectF rectF = this.r;
        rectF.setEmpty();
        g();
        return rectF;
    }

    public final Drawable b() {
        InsetDrawable insetDrawable = this.j;
        return insetDrawable == null ? this.c : insetDrawable;
    }

    @Override // defpackage.Cfor
    public final void bz(fog fogVar) {
        this.c.bz(fogVar);
    }

    @Override // defpackage.fgx
    public final void c() {
        f(this.q);
        requestLayout();
        invalidateOutline();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // defpackage.hu, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        fgy fgyVar = this.c;
        if (fgyVar == null || !fgy.q(fgyVar.f)) {
            return;
        }
        fgy fgyVar2 = this.c;
        ?? isEnabled = isEnabled();
        int i2 = isEnabled;
        if (this.e) {
            i2 = isEnabled + 1;
        }
        int i3 = i2;
        if (this.n) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (this.m) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (isChecked()) {
            i5 = i4 + 1;
        }
        int[] iArr = new int[i5];
        int i6 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i6 = 1;
        }
        if (this.e) {
            iArr[i6] = 16842908;
            i6++;
        }
        if (this.n) {
            iArr[i6] = 16843623;
            i6++;
        }
        if (this.m) {
            iArr[i6] = 16842919;
            i6++;
        }
        if (isChecked()) {
            iArr[i6] = 16842913;
        }
        if (fgyVar2.r(iArr)) {
            invalidate();
        }
    }

    public final boolean e() {
        fgy fgyVar = this.c;
        return fgyVar != null && fgyVar.g;
    }

    public final void f(int i2) {
        this.q = i2;
        if (!this.o) {
            if (this.j != null) {
                h();
                return;
            } else {
                k();
                return;
            }
        }
        int max = Math.max(0, i2 - this.c.getIntrinsicHeight());
        int max2 = Math.max(0, i2 - this.c.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.j != null) {
                h();
                return;
            } else {
                k();
                return;
            }
        }
        int i3 = max2 > 0 ? max2 >> 1 : 0;
        int i4 = max > 0 ? max >> 1 : 0;
        if (this.j != null) {
            Rect rect = new Rect();
            this.j.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                k();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.j = new InsetDrawable((Drawable) this.c, i3, i4, i3, i4);
        k();
    }

    public final void g() {
        fgy fgyVar = this.c;
        if (fgyVar != null) {
            fgyVar.e();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        if (!e()) {
            return !isClickable() ? "android.view.View" : "android.widget.Button";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof fgz)) {
            return "android.widget.Button";
        }
        throw null;
    }

    @Override // android.widget.TextView
    public final TextUtils.TruncateAt getEllipsize() {
        fgy fgyVar = this.c;
        if (fgyVar != null) {
            return fgyVar.m;
        }
        return null;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        fgy fgyVar = this.c;
        if (fgyVar == null) {
            return super.getFontVariationSettings();
        }
        fmo g2 = fgyVar.g();
        if (g2 != null) {
            return g2.c;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fhq.y(this, this.c);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        if (e()) {
            mergeDrawableStates(onCreateDrawableState, i);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            i(a().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            i(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof fgz) {
            throw null;
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        PointerIcon systemIcon;
        if (!a().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i2);
        }
        systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        return systemIcon;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.p != i2) {
            this.p = i2;
            l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r0 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = a().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.m) {
                        if (!contains) {
                            j(false);
                            return true;
                        }
                    }
                }
                if (super.onTouchEvent(motionEvent)) {
                    return false;
                }
            } else if (this.m) {
                playSoundEffect(0);
                z = true;
                j(false);
            }
            z = false;
            j(false);
        } else {
            if (contains) {
                j(true);
            }
            if (super.onTouchEvent(motionEvent)) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable == b() || drawable == this.k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.hu, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable == b() || drawable == this.k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.hu, android.view.View
    public final void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        fgy fgyVar = this.c;
        if (fgyVar == null) {
            this.l = z;
        } else if (fgyVar.g) {
            super.setChecked(z);
        }
    }

    @Override // defpackage.hu, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(null, drawable2, null, drawable4);
    }

    @Override // defpackage.hu, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(null, drawable2, null, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i3, 0, i5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(0, i3, 0, i5);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        fgy fgyVar = this.c;
        if (fgyVar != null) {
            fgyVar.L(f);
        }
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.c == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        fgy fgyVar = this.c;
        if (fgyVar != null) {
            fgyVar.m = truncateAt;
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        fgy fgyVar = this.c;
        if (fgyVar == null) {
            return false;
        }
        fmo g2 = fgyVar.g();
        if (g2 != null) {
            g2.c = str;
        }
        m();
        return true;
    }

    @Override // android.widget.TextView
    public final void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i2) {
        if (this.c == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public final void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public final void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        fgy fgyVar = this.c;
        if (fgyVar != null) {
            fgyVar.o = i2;
        }
    }

    @Override // android.widget.TextView
    public final void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.d = onCheckedChangeListener;
    }

    @Override // android.widget.TextView
    public final void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(true);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        fgy fgyVar = this.c;
        if (fgyVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(true != fgyVar.n ? charSequence : null, bufferType);
        fgy fgyVar2 = this.c;
        if (fgyVar2 != null) {
            fgyVar2.n(charSequence);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        fgy fgyVar = this.c;
        if (fgyVar != null) {
            fgyVar.p(i2);
        }
        m();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        super.setTextSize(i2, f);
        fgy fgyVar = this.c;
        if (fgyVar != null) {
            float applyDimension = TypedValue.applyDimension(i2, f, getResources().getDisplayMetrics());
            fmo g2 = fgyVar.g();
            if (g2 != null) {
                g2.l = applyDimension;
                fgyVar.l.a.setTextSize(applyDimension);
                fgyVar.i();
            }
        }
        m();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        fgy fgyVar = this.c;
        if (fgyVar != null) {
            fgyVar.p(i2);
        }
        m();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.chipStyle);
    }

    public Chip(Context context) {
        this(context, null);
    }
}
