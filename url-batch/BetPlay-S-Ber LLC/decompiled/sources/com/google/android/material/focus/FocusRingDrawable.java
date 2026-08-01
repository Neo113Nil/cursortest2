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
import defpackage.g;
import defpackage.g10;
import defpackage.hj;
import defpackage.ij;
import defpackage.l20;
import defpackage.l70;
import defpackage.ly;
import defpackage.n20;
import defpackage.p20;
import defpackage.rt;
import defpackage.vg;
import defpackage.x0;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable u = new ColorDrawable(0);
    public static final int[] v = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator w = new OvershootInterpolator(4.0f);
    public static final hj x = new hj("interpolation");
    public final Paint f;
    public final RectF g;
    public final Rect h;
    public final Path i;
    public final Path j;
    public final Matrix k;
    public final p20 l;
    public WeakReference m;
    public float n;
    public ObjectAnimator o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ij t;

    private FocusRingDrawable(ij ijVar, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.f = paint;
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = p20.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        ij ijVar2 = new ij(ijVar);
        this.t = ijVar2;
        Drawable.ConstantState constantState = ijVar2.a;
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

    public static FocusRingDrawable e(Context context, LayerDrawable layerDrawable, rt rtVar) {
        if (!l70.Q(context.getTheme(), com.awerser.monnit.betplay.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, u);
        if (rtVar != null) {
            focusRingDrawable.m = new WeakReference(rtVar);
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
            rectF.set(((rt) this.m.get()).getBounds());
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
        TypedValue P;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(ly.k);
        int i = this.t.d;
        if (i != Integer.MIN_VALUE && (P = l70.P(theme, i)) != null) {
            ij ijVar = this.t;
            ijVar.c = P.data != 0;
            ijVar.e = true;
        }
        ij ijVar2 = this.t;
        if (!ijVar2.e) {
            ijVar2.c = l70.Q(theme, com.awerser.monnit.betplay.R.attr.focusRingsEnabled, ijVar2.c);
        }
        ij ijVar3 = this.t;
        if (ijVar3.c) {
            int i2 = ijVar3.f;
            int i3 = ijVar3.g;
            if (i2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue, true)) {
                        i2 = typedValue.data;
                    }
                }
                i2 = obtainStyledAttributes.getColor(5, -16777216);
            }
            ijVar3.f = i2;
            ij ijVar4 = this.t;
            int i4 = ijVar4.h;
            int i5 = ijVar4.i;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue2, true)) {
                        i4 = typedValue2.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(1, -1);
            }
            ijVar4.h = i4;
            ij ijVar5 = this.t;
            ijVar5.j = f(ijVar5.j, theme, ijVar5.k, obtainStyledAttributes, 6, com.awerser.monnit.betplay.R.dimen.mtrl_focus_ring_outer_stroke_width);
            ij ijVar6 = this.t;
            ijVar6.l = f(ijVar6.l, theme, ijVar6.m, obtainStyledAttributes, 3, com.awerser.monnit.betplay.R.dimen.mtrl_focus_ring_inner_stroke_width);
            ij ijVar7 = this.t;
            ijVar7.n = f(ijVar7.n, theme, ijVar7.o, obtainStyledAttributes, 7, 0);
            ij ijVar8 = this.t;
            ijVar8.p = f(ijVar8.p, theme, ijVar8.q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.t.p)) {
                this.t.p = 0.0f;
            }
            ij ijVar9 = this.t;
            ijVar9.r = f(ijVar9.r, theme, ijVar9.s, obtainStyledAttributes, 2, com.awerser.monnit.betplay.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            ij ijVar10 = this.t;
            int i6 = ijVar10.u;
            int[] iArr = ly.F;
            if (i6 != Integer.MIN_VALUE) {
                ijVar10.t = n20.h(theme.obtainStyledAttributes(i6, iArr), new g(0.0f)).a();
            } else {
                int i7 = ijVar10.v;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = com.awerser.monnit.betplay.R.attr.focusRingsShapeAppearance;
                }
                TypedValue P2 = l70.P(theme, i7);
                if (P2 != null) {
                    this.t.t = n20.h(theme.obtainStyledAttributes(P2.resourceId, iArr), new g(0.0f)).a();
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
        ij ijVar = this.t;
        if (ijVar.c && this.r) {
            float f2 = ijVar.p;
            float f3 = ijVar.j / 2.0f;
            float f4 = this.p;
            float f5 = (f3 * f4) + f2;
            float f6 = ((ijVar.l / 2.0f) * f4) + f2 + ijVar.r;
            Path path = this.j;
            if (path.isEmpty()) {
                WeakReference weakReference = this.m;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((rt) this.m.get()).n;
                }
                path = null;
            }
            Path path2 = path;
            ij ijVar2 = this.t;
            if (path2 != null) {
                b(canvas, path2, f6, ijVar2.l, ijVar2.h);
                ij ijVar3 = this.t;
                b(canvas, path2, f5, ijVar3.j, ijVar3.f);
                return;
            }
            if (Float.isNaN(ijVar2.n)) {
                f = this.n;
                if (f < 0.0f) {
                    WeakReference weakReference2 = this.m;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        rt rtVar = (rt) this.m.get();
                        float b = rtVar.b(rtVar.g(), rtVar.g.a.d(), rtVar.G);
                        if (b >= 0.0f) {
                            b *= rtVar.g.i;
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
            ij ijVar4 = this.t;
            float f7 = ijVar4.l;
            int i = ijVar4.h;
            RectF rectF = this.g;
            a(rectF);
            rectF.inset(f6, f6);
            float f8 = f7 * this.p;
            Paint paint = this.f;
            paint.setStrokeWidth(f8);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, max, max, paint);
            ij ijVar5 = this.t;
            float f9 = ijVar5.j;
            int i2 = ijVar5.f;
            a(rectF);
            rectF.inset(f5, f5);
            paint.setStrokeWidth(f9 * this.p);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void g(l20 l20Var) {
        RectF rectF = this.g;
        a(rectF);
        n20 b = l20Var.b(v);
        boolean j = b.j(rectF);
        Path path = this.j;
        if (!j) {
            this.l.a(b, null, 1.0f, rectF, null, path);
            this.n = -1.0f;
            return;
        }
        ij ijVar = this.t;
        float f = ((ijVar.j / 2.0f) * this.p) + ijVar.p;
        rectF.inset(f, f);
        this.n = b.e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        ij ijVar = this.t;
        if (ijVar.a == null) {
            return null;
        }
        ijVar.b = getChangingConfigurations();
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
        int[] iArr = ly.k;
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.t.d = c(obtainStyledAttributes, 0);
        if (this.t.d == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            ij ijVar = this.t;
            ijVar.c = obtainStyledAttributes.getBoolean(0, ijVar.c);
            this.t.e = true;
        }
        this.t.g = c(obtainStyledAttributes, 5);
        ij ijVar2 = this.t;
        if (ijVar2.g == Integer.MIN_VALUE) {
            ijVar2.f = obtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.t.i = c(obtainStyledAttributes, 1);
        ij ijVar3 = this.t;
        if (ijVar3.i == Integer.MIN_VALUE) {
            ijVar3.h = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.t.k = c(obtainStyledAttributes, 6);
        ij ijVar4 = this.t;
        if (ijVar4.k == Integer.MIN_VALUE) {
            ijVar4.j = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.t.m = c(obtainStyledAttributes, 3);
        ij ijVar5 = this.t;
        if (ijVar5.m == Integer.MIN_VALUE) {
            ijVar5.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.t.m = c(obtainStyledAttributes, 3);
        ij ijVar6 = this.t;
        if (ijVar6.m == Integer.MIN_VALUE) {
            ijVar6.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.t.o = c(obtainStyledAttributes, 7);
        ij ijVar7 = this.t;
        if (ijVar7.o == Integer.MIN_VALUE) {
            ijVar7.n = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.t.q = c(obtainStyledAttributes, 4);
        ij ijVar8 = this.t;
        if (ijVar8.q == Integer.MIN_VALUE) {
            ijVar8.p = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.t.s = c(obtainStyledAttributes, 2);
        ij ijVar9 = this.t;
        if (ijVar9.s == Integer.MIN_VALUE) {
            ijVar9.r = obtainStyledAttributes.getDimension(2, Float.NaN);
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
            this.t = new ij(this.t);
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
        n20 n20Var;
        super.onBoundsChange(rect);
        ij ijVar = this.t;
        if (!ijVar.c) {
            return;
        }
        l20 l20Var = ijVar.t;
        if (l20Var != null) {
            g(l20Var);
            return;
        }
        Drawable drawable = getDrawable();
        int i = 0;
        n20 n20Var2 = null;
        if (drawable instanceof ShapeDrawable) {
            Outline outline = new Outline();
            ((ShapeDrawable) drawable).getOutline(outline);
            if (outline.getRadius() > 0.0f) {
                g10 g10Var = new g10();
                g10 g10Var2 = new g10();
                g10 g10Var3 = new g10();
                g10 g10Var4 = new g10();
                vg vgVar = new vg(i);
                vg vgVar2 = new vg(i);
                vg vgVar3 = new vg(i);
                vg vgVar4 = new vg(i);
                float radius = outline.getRadius();
                g gVar = new g(radius);
                g gVar2 = new g(radius);
                g gVar3 = new g(radius);
                g gVar4 = new g(radius);
                n20Var = new n20();
                n20Var.a = g10Var;
                n20Var.b = g10Var2;
                n20Var.c = g10Var3;
                n20Var.d = g10Var4;
                n20Var.e = gVar;
                n20Var.f = gVar2;
                n20Var.g = gVar3;
                n20Var.h = gVar4;
                n20Var.i = vgVar;
                n20Var.j = vgVar2;
                n20Var.k = vgVar3;
                n20Var.l = vgVar4;
                n20Var2 = n20Var;
            }
            if (n20Var2 == null) {
                g(n20Var2);
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
                g10 g10Var5 = new g10();
                g10 g10Var6 = new g10();
                g10 g10Var7 = new g10();
                g10 g10Var8 = new g10();
                vg vgVar5 = new vg(i);
                vg vgVar6 = new vg(i);
                vg vgVar7 = new vg(i);
                vg vgVar8 = new vg(i);
                g gVar5 = new g(Math.min(fArr[0], fArr[1]));
                g gVar6 = new g(Math.min(fArr[2], fArr[3]));
                g gVar7 = new g(Math.min(fArr[4], fArr[5]));
                g gVar8 = new g(Math.min(fArr[6], fArr[7]));
                n20Var = new n20();
                n20Var.a = g10Var5;
                n20Var.b = g10Var6;
                n20Var.c = g10Var7;
                n20Var.d = g10Var8;
                n20Var.e = gVar5;
                n20Var.f = gVar6;
                n20Var.g = gVar7;
                n20Var.h = gVar8;
                n20Var.i = vgVar5;
                n20Var.j = vgVar6;
                n20Var.k = vgVar7;
                n20Var.l = vgVar8;
                n20Var2 = n20Var;
            } else {
                try {
                    f = gradientDrawable.getCornerRadius();
                } catch (NullPointerException unused2) {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    g10 g10Var9 = new g10();
                    g10 g10Var10 = new g10();
                    g10 g10Var11 = new g10();
                    g10 g10Var12 = new g10();
                    vg vgVar9 = new vg(i);
                    vg vgVar10 = new vg(i);
                    vg vgVar11 = new vg(i);
                    vg vgVar12 = new vg(i);
                    g gVar9 = new g(f);
                    g gVar10 = new g(f);
                    g gVar11 = new g(f);
                    g gVar12 = new g(f);
                    n20 n20Var3 = new n20();
                    n20Var3.a = g10Var9;
                    n20Var3.b = g10Var10;
                    n20Var3.c = g10Var11;
                    n20Var3.d = g10Var12;
                    n20Var3.e = gVar9;
                    n20Var3.f = gVar10;
                    n20Var3.g = gVar11;
                    n20Var3.h = gVar12;
                    n20Var3.i = vgVar9;
                    n20Var3.j = vgVar10;
                    n20Var3.k = vgVar11;
                    n20Var3.l = vgVar12;
                    n20Var2 = n20Var3;
                }
            }
        }
        if (n20Var2 == null) {
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ij ijVar = this.t;
        if (!ijVar.c) {
            this.r = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(ijVar.x, iArr);
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
                ofFloat.addListener(new x0(5, this));
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
        this.l = p20.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        this.t = new ij(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = p20.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        ij ijVar = new ij(null);
        this.t = ijVar;
        if (drawable != null) {
            ijVar.a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(ij ijVar, Resources resources, hj hjVar) {
        this(ijVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
