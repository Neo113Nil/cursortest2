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
import defpackage.b9;
import defpackage.d50;
import defpackage.dw;
import defpackage.ej;
import defpackage.f50;
import defpackage.g;
import defpackage.h50;
import defpackage.ql;
import defpackage.rl;
import defpackage.v30;
import defpackage.w0;
import defpackage.y00;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable u = new ColorDrawable(0);
    public static final int[] v = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator w = new OvershootInterpolator(4.0f);
    public static final ql x = new ql("interpolation");
    public final Paint f;
    public final RectF g;
    public final Rect h;
    public final Path i;
    public final Path j;
    public final Matrix k;
    public final h50 l;
    public WeakReference m;
    public float n;
    public ObjectAnimator o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public rl t;

    private FocusRingDrawable(rl rlVar, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.f = paint;
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = h50.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        rl rlVar2 = new rl(rlVar);
        this.t = rlVar2;
        Drawable.ConstantState constantState = rlVar2.a;
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

    public static FocusRingDrawable e(Context context, LayerDrawable layerDrawable, dw dwVar) {
        if (!b9.L(context.getTheme(), com.moontiko.really.admiralcasino.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, u);
        if (dwVar != null) {
            focusRingDrawable.m = new WeakReference(dwVar);
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
            rectF.set(((dw) this.m.get()).getBounds());
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
        TypedValue K;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(y00.m);
        int i = this.t.d;
        if (i != Integer.MIN_VALUE && (K = b9.K(theme, i)) != null) {
            rl rlVar = this.t;
            rlVar.c = K.data != 0;
            rlVar.e = true;
        }
        rl rlVar2 = this.t;
        if (!rlVar2.e) {
            rlVar2.c = b9.L(theme, com.moontiko.really.admiralcasino.R.attr.focusRingsEnabled, rlVar2.c);
        }
        rl rlVar3 = this.t;
        if (rlVar3.c) {
            int i2 = rlVar3.f;
            int i3 = rlVar3.g;
            if (i2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue, true)) {
                        i2 = typedValue.data;
                    }
                }
                i2 = obtainStyledAttributes.getColor(5, -16777216);
            }
            rlVar3.f = i2;
            rl rlVar4 = this.t;
            int i4 = rlVar4.h;
            int i5 = rlVar4.i;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue2, true)) {
                        i4 = typedValue2.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(1, -1);
            }
            rlVar4.h = i4;
            rl rlVar5 = this.t;
            rlVar5.j = f(rlVar5.j, theme, rlVar5.k, obtainStyledAttributes, 6, com.moontiko.really.admiralcasino.R.dimen.mtrl_focus_ring_outer_stroke_width);
            rl rlVar6 = this.t;
            rlVar6.l = f(rlVar6.l, theme, rlVar6.m, obtainStyledAttributes, 3, com.moontiko.really.admiralcasino.R.dimen.mtrl_focus_ring_inner_stroke_width);
            rl rlVar7 = this.t;
            rlVar7.n = f(rlVar7.n, theme, rlVar7.o, obtainStyledAttributes, 7, 0);
            rl rlVar8 = this.t;
            rlVar8.p = f(rlVar8.p, theme, rlVar8.q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.t.p)) {
                this.t.p = 0.0f;
            }
            rl rlVar9 = this.t;
            rlVar9.r = f(rlVar9.r, theme, rlVar9.s, obtainStyledAttributes, 2, com.moontiko.really.admiralcasino.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            rl rlVar10 = this.t;
            int i6 = rlVar10.u;
            int[] iArr = y00.H;
            if (i6 != Integer.MIN_VALUE) {
                rlVar10.t = f50.h(theme.obtainStyledAttributes(i6, iArr), new g(0.0f)).a();
            } else {
                int i7 = rlVar10.v;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = com.moontiko.really.admiralcasino.R.attr.focusRingsShapeAppearance;
                }
                TypedValue K2 = b9.K(theme, i7);
                if (K2 != null) {
                    this.t.t = f50.h(theme.obtainStyledAttributes(K2.resourceId, iArr), new g(0.0f)).a();
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
        rl rlVar = this.t;
        if (rlVar.c && this.r) {
            float f2 = rlVar.p;
            float f3 = rlVar.j / 2.0f;
            float f4 = this.p;
            float f5 = (f3 * f4) + f2;
            float f6 = ((rlVar.l / 2.0f) * f4) + f2 + rlVar.r;
            Path path = this.j;
            if (path.isEmpty()) {
                WeakReference weakReference = this.m;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((dw) this.m.get()).n;
                }
                path = null;
            }
            Path path2 = path;
            rl rlVar2 = this.t;
            if (path2 != null) {
                b(canvas, path2, f6, rlVar2.l, rlVar2.h);
                rl rlVar3 = this.t;
                b(canvas, path2, f5, rlVar3.j, rlVar3.f);
                return;
            }
            if (Float.isNaN(rlVar2.n)) {
                f = this.n;
                if (f < 0.0f) {
                    WeakReference weakReference2 = this.m;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        dw dwVar = (dw) this.m.get();
                        float b = dwVar.b(dwVar.g(), dwVar.g.a.d(), dwVar.H);
                        if (b >= 0.0f) {
                            b *= dwVar.g.i;
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
            rl rlVar4 = this.t;
            float f7 = rlVar4.l;
            int i = rlVar4.h;
            RectF rectF = this.g;
            a(rectF);
            rectF.inset(f6, f6);
            float f8 = f7 * this.p;
            Paint paint = this.f;
            paint.setStrokeWidth(f8);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, max, max, paint);
            rl rlVar5 = this.t;
            float f9 = rlVar5.j;
            int i2 = rlVar5.f;
            a(rectF);
            rectF.inset(f5, f5);
            paint.setStrokeWidth(f9 * this.p);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void g(d50 d50Var) {
        RectF rectF = this.g;
        a(rectF);
        f50 b = d50Var.b(v);
        boolean j = b.j(rectF);
        Path path = this.j;
        if (!j) {
            this.l.a(b, null, 1.0f, rectF, null, path);
            this.n = -1.0f;
            return;
        }
        rl rlVar = this.t;
        float f = ((rlVar.j / 2.0f) * this.p) + rlVar.p;
        rectF.inset(f, f);
        this.n = b.e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        rl rlVar = this.t;
        if (rlVar.a == null) {
            return null;
        }
        rlVar.b = getChangingConfigurations();
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
        int[] iArr = y00.m;
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.t.d = c(obtainStyledAttributes, 0);
        if (this.t.d == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            rl rlVar = this.t;
            rlVar.c = obtainStyledAttributes.getBoolean(0, rlVar.c);
            this.t.e = true;
        }
        this.t.g = c(obtainStyledAttributes, 5);
        rl rlVar2 = this.t;
        if (rlVar2.g == Integer.MIN_VALUE) {
            rlVar2.f = obtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.t.i = c(obtainStyledAttributes, 1);
        rl rlVar3 = this.t;
        if (rlVar3.i == Integer.MIN_VALUE) {
            rlVar3.h = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.t.k = c(obtainStyledAttributes, 6);
        rl rlVar4 = this.t;
        if (rlVar4.k == Integer.MIN_VALUE) {
            rlVar4.j = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.t.m = c(obtainStyledAttributes, 3);
        rl rlVar5 = this.t;
        if (rlVar5.m == Integer.MIN_VALUE) {
            rlVar5.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.t.m = c(obtainStyledAttributes, 3);
        rl rlVar6 = this.t;
        if (rlVar6.m == Integer.MIN_VALUE) {
            rlVar6.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.t.o = c(obtainStyledAttributes, 7);
        rl rlVar7 = this.t;
        if (rlVar7.o == Integer.MIN_VALUE) {
            rlVar7.n = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.t.q = c(obtainStyledAttributes, 4);
        rl rlVar8 = this.t;
        if (rlVar8.q == Integer.MIN_VALUE) {
            rlVar8.p = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.t.s = c(obtainStyledAttributes, 2);
        rl rlVar9 = this.t;
        if (rlVar9.s == Integer.MIN_VALUE) {
            rlVar9.r = obtainStyledAttributes.getDimension(2, Float.NaN);
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
            this.t = new rl(this.t);
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
        f50 f50Var;
        super.onBoundsChange(rect);
        rl rlVar = this.t;
        if (!rlVar.c) {
            return;
        }
        d50 d50Var = rlVar.t;
        if (d50Var != null) {
            g(d50Var);
            return;
        }
        Drawable drawable = getDrawable();
        f50 f50Var2 = null;
        if (drawable instanceof ShapeDrawable) {
            Outline outline = new Outline();
            ((ShapeDrawable) drawable).getOutline(outline);
            if (outline.getRadius() > 0.0f) {
                v30 v30Var = new v30();
                v30 v30Var2 = new v30();
                v30 v30Var3 = new v30();
                v30 v30Var4 = new v30();
                ej ejVar = new ej(0);
                ej ejVar2 = new ej(0);
                ej ejVar3 = new ej(0);
                ej ejVar4 = new ej(0);
                float radius = outline.getRadius();
                g gVar = new g(radius);
                g gVar2 = new g(radius);
                g gVar3 = new g(radius);
                g gVar4 = new g(radius);
                f50Var = new f50();
                f50Var.a = v30Var;
                f50Var.b = v30Var2;
                f50Var.c = v30Var3;
                f50Var.d = v30Var4;
                f50Var.e = gVar;
                f50Var.f = gVar2;
                f50Var.g = gVar3;
                f50Var.h = gVar4;
                f50Var.i = ejVar;
                f50Var.j = ejVar2;
                f50Var.k = ejVar3;
                f50Var.l = ejVar4;
                f50Var2 = f50Var;
            }
            if (f50Var2 == null) {
                g(f50Var2);
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
                v30 v30Var5 = new v30();
                v30 v30Var6 = new v30();
                v30 v30Var7 = new v30();
                v30 v30Var8 = new v30();
                ej ejVar5 = new ej(0);
                ej ejVar6 = new ej(0);
                ej ejVar7 = new ej(0);
                ej ejVar8 = new ej(0);
                g gVar5 = new g(Math.min(fArr[0], fArr[1]));
                g gVar6 = new g(Math.min(fArr[2], fArr[3]));
                g gVar7 = new g(Math.min(fArr[4], fArr[5]));
                g gVar8 = new g(Math.min(fArr[6], fArr[7]));
                f50Var = new f50();
                f50Var.a = v30Var5;
                f50Var.b = v30Var6;
                f50Var.c = v30Var7;
                f50Var.d = v30Var8;
                f50Var.e = gVar5;
                f50Var.f = gVar6;
                f50Var.g = gVar7;
                f50Var.h = gVar8;
                f50Var.i = ejVar5;
                f50Var.j = ejVar6;
                f50Var.k = ejVar7;
                f50Var.l = ejVar8;
                f50Var2 = f50Var;
            } else {
                try {
                    f = gradientDrawable.getCornerRadius();
                } catch (NullPointerException unused2) {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    v30 v30Var9 = new v30();
                    v30 v30Var10 = new v30();
                    v30 v30Var11 = new v30();
                    v30 v30Var12 = new v30();
                    ej ejVar9 = new ej(0);
                    ej ejVar10 = new ej(0);
                    ej ejVar11 = new ej(0);
                    ej ejVar12 = new ej(0);
                    g gVar9 = new g(f);
                    g gVar10 = new g(f);
                    g gVar11 = new g(f);
                    g gVar12 = new g(f);
                    f50 f50Var3 = new f50();
                    f50Var3.a = v30Var9;
                    f50Var3.b = v30Var10;
                    f50Var3.c = v30Var11;
                    f50Var3.d = v30Var12;
                    f50Var3.e = gVar9;
                    f50Var3.f = gVar10;
                    f50Var3.g = gVar11;
                    f50Var3.h = gVar12;
                    f50Var3.i = ejVar9;
                    f50Var3.j = ejVar10;
                    f50Var3.k = ejVar11;
                    f50Var3.l = ejVar12;
                    f50Var2 = f50Var3;
                }
            }
        }
        if (f50Var2 == null) {
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        rl rlVar = this.t;
        if (!rlVar.c) {
            this.r = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(rlVar.x, iArr);
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
                ofFloat.addListener(new w0(5, this));
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
        this.l = h50.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        this.t = new rl(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = h50.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        rl rlVar = new rl(null);
        this.t = rlVar;
        if (drawable != null) {
            rlVar.a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(rl rlVar, Resources resources, ql qlVar) {
        this(rlVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
