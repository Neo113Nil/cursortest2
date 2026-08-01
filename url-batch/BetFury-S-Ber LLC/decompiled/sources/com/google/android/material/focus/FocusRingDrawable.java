package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import defpackage.c70;
import defpackage.ed0;
import defpackage.g;
import defpackage.g10;
import defpackage.gd0;
import defpackage.id0;
import defpackage.n9;
import defpackage.sl;
import defpackage.wo;
import defpackage.xa0;
import defpackage.xo;
import defpackage.z0;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable u = new ColorDrawable(0);
    public static final int[] v = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator w = new OvershootInterpolator(4.0f);
    public static final wo x = new wo("interpolation");
    public final Paint f;
    public final RectF g;
    public final Rect h;
    public final Path i;
    public final Path j;
    public final Matrix k;
    public final id0 l;
    public WeakReference m;
    public float n;
    public ObjectAnimator o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public xo t;

    private FocusRingDrawable(xo xoVar, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.f = paint;
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = id0.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        xo xoVar2 = new xo(xoVar);
        this.t = xoVar2;
        Drawable.ConstantState constantState = xoVar2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.t.j)) {
            return;
        }
        paint.setStrokeWidth(this.t.j);
    }

    public static int c(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static FocusRingDrawable e(Context context, LayerDrawable layerDrawable, g10 g10Var) {
        if (!n9.K(context.getTheme(), com.trembin.nirefon.betfury.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, u);
        if (g10Var != null) {
            focusRingDrawable.m = new WeakReference(g10Var);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    public static float f(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public final void a(RectF rectF) {
        Rect rect = this.t.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.m;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((g10) this.m.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.h;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        d(theme);
    }

    public final void b(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.g;
        a(rectF);
        float f3 = f * 2.0f;
        float width = 1.0f - (f3 / rectF.width());
        float height = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.k;
        matrix.reset();
        matrix.postScale(width, height, rectF.centerX(), rectF.centerY());
        Path path2 = this.i;
        path.transform(matrix, path2);
        float f4 = f2 * this.p;
        Paint paint = this.f;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    public final void d(Resources.Theme theme) {
        TypedValue J;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(c70.m);
        int i = this.t.d;
        if (i != Integer.MIN_VALUE && (J = n9.J(theme, i)) != null) {
            xo xoVar = this.t;
            xoVar.c = J.data != 0;
            xoVar.e = true;
        }
        xo xoVar2 = this.t;
        if (!xoVar2.e) {
            xoVar2.c = n9.K(theme, com.trembin.nirefon.betfury.R.attr.focusRingsEnabled, xoVar2.c);
        }
        xo xoVar3 = this.t;
        if (xoVar3.c) {
            int i2 = xoVar3.f;
            int i3 = xoVar3.g;
            if (i2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue, true)) {
                        i2 = typedValue.data;
                    }
                }
                i2 = obtainStyledAttributes.getColor(5, -16777216);
            }
            xoVar3.f = i2;
            xo xoVar4 = this.t;
            int i4 = xoVar4.h;
            int i5 = xoVar4.i;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue2, true)) {
                        i4 = typedValue2.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(1, -1);
            }
            xoVar4.h = i4;
            xo xoVar5 = this.t;
            xoVar5.j = f(xoVar5.j, theme, xoVar5.k, obtainStyledAttributes, 6, com.trembin.nirefon.betfury.R.dimen.mtrl_focus_ring_outer_stroke_width);
            xo xoVar6 = this.t;
            xoVar6.l = f(xoVar6.l, theme, xoVar6.m, obtainStyledAttributes, 3, com.trembin.nirefon.betfury.R.dimen.mtrl_focus_ring_inner_stroke_width);
            xo xoVar7 = this.t;
            xoVar7.n = f(xoVar7.n, theme, xoVar7.o, obtainStyledAttributes, 7, 0);
            xo xoVar8 = this.t;
            xoVar8.p = f(xoVar8.p, theme, xoVar8.q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.t.p)) {
                this.t.p = 0.0f;
            }
            xo xoVar9 = this.t;
            xoVar9.r = f(xoVar9.r, theme, xoVar9.s, obtainStyledAttributes, 2, com.trembin.nirefon.betfury.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            xo xoVar10 = this.t;
            int i6 = xoVar10.u;
            int[] iArr = c70.G;
            if (i6 != Integer.MIN_VALUE) {
                xoVar10.t = gd0.h(theme.obtainStyledAttributes(i6, iArr), new g(0.0f)).a();
            } else {
                int i7 = xoVar10.v;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = com.trembin.nirefon.betfury.R.attr.focusRingsShapeAppearance;
                }
                TypedValue J2 = n9.J(theme, i7);
                if (J2 != null) {
                    this.t.t = gd0.h(theme.obtainStyledAttributes(J2.resourceId, iArr), new g(0.0f)).a();
                }
            }
        }
        obtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f;
        paint.setStyle(style);
        if (Float.isNaN(this.t.j)) {
            return;
        }
        paint.setStrokeWidth(this.t.j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0046, code lost:
    
        if (r1.isEmpty() == false) goto L9;
     */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        int radius;
        super.draw(canvas);
        xo xoVar = this.t;
        if (xoVar.c && this.r) {
            float f2 = xoVar.p;
            float f3 = xoVar.j / 2.0f;
            float f4 = this.p;
            float f5 = (f3 * f4) + f2;
            float f6 = ((xoVar.l / 2.0f) * f4) + f2 + xoVar.r;
            Path path = this.j;
            if (path.isEmpty()) {
                WeakReference weakReference = this.m;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((g10) this.m.get()).n;
                }
                path = null;
            }
            Path path2 = path;
            xo xoVar2 = this.t;
            if (path2 != null) {
                b(canvas, path2, f6, xoVar2.l, xoVar2.h);
                xo xoVar3 = this.t;
                b(canvas, path2, f5, xoVar3.j, xoVar3.f);
                return;
            }
            if (Float.isNaN(xoVar2.n)) {
                f = this.n;
                if (f < 0.0f) {
                    WeakReference weakReference2 = this.m;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        g10 g10Var = (g10) this.m.get();
                        float b = g10Var.b(g10Var.g(), g10Var.g.a.d(), g10Var.H);
                        if (b >= 0.0f) {
                            b *= g10Var.g.i;
                        }
                        if (b >= 0.0f) {
                            f = Math.max(0.0f, b - (this.t.j / 2.0f));
                        }
                    }
                    Drawable drawable = getDrawable();
                    f = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                }
            } else {
                f = this.t.n;
            }
            float max = Math.max(0.0f, f - (this.t.j / 2.0f));
            xo xoVar4 = this.t;
            float f7 = xoVar4.l;
            int i = xoVar4.h;
            RectF rectF = this.g;
            a(rectF);
            rectF.inset(f6, f6);
            float f8 = f7 * this.p;
            Paint paint = this.f;
            paint.setStrokeWidth(f8);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, max, max, paint);
            xo xoVar5 = this.t;
            float f9 = xoVar5.j;
            int i2 = xoVar5.f;
            a(rectF);
            rectF.inset(f5, f5);
            paint.setStrokeWidth(f9 * this.p);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void g(ed0 ed0Var) {
        RectF rectF = this.g;
        a(rectF);
        gd0 b = ed0Var.b(v);
        boolean j = b.j(rectF);
        Path path = this.j;
        if (!j) {
            this.l.a(b, null, 1.0f, rectF, null, path);
            this.n = -1.0f;
            return;
        }
        xo xoVar = this.t;
        float f = ((xoVar.j / 2.0f) * this.p) + xoVar.p;
        rectF.inset(f, f);
        this.n = b.e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        xo xoVar = this.t;
        if (xoVar.a == null) {
            return null;
        }
        xoVar.b = getChangingConfigurations();
        return this.t;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.t.c;
        } catch (NoSuchMethodError unused) {
            return this.t.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = c70.m;
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.t.d = c(obtainStyledAttributes, 0);
        if (this.t.d == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            xo xoVar = this.t;
            xoVar.c = obtainStyledAttributes.getBoolean(0, xoVar.c);
            this.t.e = true;
        }
        this.t.g = c(obtainStyledAttributes, 5);
        xo xoVar2 = this.t;
        if (xoVar2.g == Integer.MIN_VALUE) {
            xoVar2.f = obtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.t.i = c(obtainStyledAttributes, 1);
        xo xoVar3 = this.t;
        if (xoVar3.i == Integer.MIN_VALUE) {
            xoVar3.h = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.t.k = c(obtainStyledAttributes, 6);
        xo xoVar4 = this.t;
        if (xoVar4.k == Integer.MIN_VALUE) {
            xoVar4.j = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.t.m = c(obtainStyledAttributes, 3);
        xo xoVar5 = this.t;
        if (xoVar5.m == Integer.MIN_VALUE) {
            xoVar5.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.t.m = c(obtainStyledAttributes, 3);
        xo xoVar6 = this.t;
        if (xoVar6.m == Integer.MIN_VALUE) {
            xoVar6.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.t.o = c(obtainStyledAttributes, 7);
        xo xoVar7 = this.t;
        if (xoVar7.o == Integer.MIN_VALUE) {
            xoVar7.n = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.t.q = c(obtainStyledAttributes, 4);
        xo xoVar8 = this.t;
        if (xoVar8.q == Integer.MIN_VALUE) {
            xoVar8.p = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.t.s = c(obtainStyledAttributes, 2);
        xo xoVar9 = this.t;
        if (xoVar9.s == Integer.MIN_VALUE) {
            xoVar9.r = obtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.t.v = c(obtainStyledAttributes, 8);
        this.t.u = obtainStyledAttributes.getType(8) == 1 ? obtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        obtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            setDrawable(drawable);
            this.t.a = drawable.getConstantState();
        } else {
            ColorDrawable colorDrawable = u;
            setDrawable(colorDrawable);
            this.t.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        boolean isProjected;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return false;
        }
        isProjected = drawable.isProjected();
        return isProjected;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.t.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.o = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.s && super.mutate() == this) {
            this.t = new xo(this.t);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.t.a = drawable.getConstantState();
            }
            this.s = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018c  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBoundsChange(Rect rect) {
        float[] fArr;
        float f;
        gd0 gd0Var;
        super.onBoundsChange(rect);
        xo xoVar = this.t;
        if (!xoVar.c) {
            return;
        }
        ed0 ed0Var = xoVar.t;
        if (ed0Var != null) {
            g(ed0Var);
            return;
        }
        Drawable drawable = getDrawable();
        gd0 gd0Var2 = null;
        if (drawable instanceof ShapeDrawable) {
            Outline outline = new Outline();
            ((ShapeDrawable) drawable).getOutline(outline);
            if (outline.getRadius() > 0.0f) {
                xa0 xa0Var = new xa0();
                xa0 xa0Var2 = new xa0();
                xa0 xa0Var3 = new xa0();
                xa0 xa0Var4 = new xa0();
                sl slVar = new sl();
                sl slVar2 = new sl();
                sl slVar3 = new sl();
                sl slVar4 = new sl();
                float radius = outline.getRadius();
                g gVar = new g(radius);
                g gVar2 = new g(radius);
                g gVar3 = new g(radius);
                g gVar4 = new g(radius);
                gd0Var = new gd0();
                gd0Var.a = xa0Var;
                gd0Var.b = xa0Var2;
                gd0Var.c = xa0Var3;
                gd0Var.d = xa0Var4;
                gd0Var.e = gVar;
                gd0Var.f = gVar2;
                gd0Var.g = gVar3;
                gd0Var.h = gVar4;
                gd0Var.i = slVar;
                gd0Var.j = slVar2;
                gd0Var.k = slVar3;
                gd0Var.l = slVar4;
                gd0Var2 = gd0Var;
            }
            if (gd0Var2 == null) {
                g(gd0Var2);
                return;
            } else {
                this.n = -1.0f;
                this.j.reset();
                return;
            }
        }
        if (drawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            try {
                fArr = gradientDrawable.getCornerRadii();
            } catch (NullPointerException unused) {
                fArr = null;
            }
            if (fArr != null) {
                xa0 xa0Var5 = new xa0();
                xa0 xa0Var6 = new xa0();
                xa0 xa0Var7 = new xa0();
                xa0 xa0Var8 = new xa0();
                sl slVar5 = new sl();
                sl slVar6 = new sl();
                sl slVar7 = new sl();
                sl slVar8 = new sl();
                g gVar5 = new g(Math.min(fArr[0], fArr[1]));
                g gVar6 = new g(Math.min(fArr[2], fArr[3]));
                g gVar7 = new g(Math.min(fArr[4], fArr[5]));
                g gVar8 = new g(Math.min(fArr[6], fArr[7]));
                gd0Var = new gd0();
                gd0Var.a = xa0Var5;
                gd0Var.b = xa0Var6;
                gd0Var.c = xa0Var7;
                gd0Var.d = xa0Var8;
                gd0Var.e = gVar5;
                gd0Var.f = gVar6;
                gd0Var.g = gVar7;
                gd0Var.h = gVar8;
                gd0Var.i = slVar5;
                gd0Var.j = slVar6;
                gd0Var.k = slVar7;
                gd0Var.l = slVar8;
                gd0Var2 = gd0Var;
            } else {
                try {
                    f = gradientDrawable.getCornerRadius();
                } catch (NullPointerException unused2) {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    xa0 xa0Var9 = new xa0();
                    xa0 xa0Var10 = new xa0();
                    xa0 xa0Var11 = new xa0();
                    xa0 xa0Var12 = new xa0();
                    sl slVar9 = new sl();
                    sl slVar10 = new sl();
                    sl slVar11 = new sl();
                    sl slVar12 = new sl();
                    g gVar9 = new g(f);
                    g gVar10 = new g(f);
                    g gVar11 = new g(f);
                    g gVar12 = new g(f);
                    gd0 gd0Var3 = new gd0();
                    gd0Var3.a = xa0Var9;
                    gd0Var3.b = xa0Var10;
                    gd0Var3.c = xa0Var11;
                    gd0Var3.d = xa0Var12;
                    gd0Var3.e = gVar9;
                    gd0Var3.f = gVar10;
                    gd0Var3.g = gVar11;
                    gd0Var3.h = gVar12;
                    gd0Var3.i = slVar9;
                    gd0Var3.j = slVar10;
                    gd0Var3.k = slVar11;
                    gd0Var3.l = slVar12;
                    gd0Var2 = gd0Var3;
                }
            }
        }
        if (gd0Var2 == null) {
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        xo xoVar = this.t;
        if (!xoVar.c) {
            this.r = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(xoVar.x, iArr);
        boolean z = this.r != stateSetMatches;
        this.r = stateSetMatches;
        if (z && iArr.length > 0 && !this.q) {
            ObjectAnimator objectAnimator = this.o;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.o = null;
            }
            if (stateSetMatches) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, x, 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(w);
                ofFloat.addListener(new z0(6, this));
                this.o = ofFloat;
                ofFloat.start();
            } else {
                this.p = 1.0f;
            }
        }
        this.q = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable() {
        super(null);
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = id0.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        this.t = new xo(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = id0.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        xo xoVar = new xo(null);
        this.t = xoVar;
        if (drawable != null) {
            xoVar.a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(xo xoVar, Resources resources, wo woVar) {
        this(xoVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
