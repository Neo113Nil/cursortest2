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
import defpackage.b20;
import defpackage.ct;
import defpackage.d20;
import defpackage.dh;
import defpackage.f20;
import defpackage.g;
import defpackage.mj;
import defpackage.nj;
import defpackage.q00;
import defpackage.v0;
import defpackage.vx;
import defpackage.zo;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable u = new ColorDrawable(0);
    public static final int[] v = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator w = new OvershootInterpolator(4.0f);
    public static final mj x = new mj("interpolation");
    public final Paint f;
    public final RectF g;
    public final Rect h;
    public final Path i;
    public final Path j;
    public final Matrix k;
    public final f20 l;
    public WeakReference m;
    public float n;
    public ObjectAnimator o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public nj t;

    private FocusRingDrawable(nj njVar, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.f = paint;
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = f20.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        nj njVar2 = new nj(njVar);
        this.t = njVar2;
        Drawable.ConstantState constantState = njVar2.a;
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

    public static FocusRingDrawable e(Context context, LayerDrawable layerDrawable, ct ctVar) {
        if (!zo.J(context.getTheme(), com.derinko.gbini.n1casino.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, u);
        if (ctVar != null) {
            focusRingDrawable.m = new WeakReference(ctVar);
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
            rectF.set(((ct) this.m.get()).getBounds());
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
        TypedValue I;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(vx.k);
        int i = this.t.d;
        if (i != Integer.MIN_VALUE && (I = zo.I(theme, i)) != null) {
            nj njVar = this.t;
            njVar.c = I.data != 0;
            njVar.e = true;
        }
        nj njVar2 = this.t;
        if (!njVar2.e) {
            njVar2.c = zo.J(theme, com.derinko.gbini.n1casino.R.attr.focusRingsEnabled, njVar2.c);
        }
        nj njVar3 = this.t;
        if (njVar3.c) {
            int i2 = njVar3.f;
            int i3 = njVar3.g;
            if (i2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue, true)) {
                        i2 = typedValue.data;
                    }
                }
                i2 = obtainStyledAttributes.getColor(5, -16777216);
            }
            njVar3.f = i2;
            nj njVar4 = this.t;
            int i4 = njVar4.h;
            int i5 = njVar4.i;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue2, true)) {
                        i4 = typedValue2.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(1, -1);
            }
            njVar4.h = i4;
            nj njVar5 = this.t;
            njVar5.j = f(njVar5.j, theme, njVar5.k, obtainStyledAttributes, 6, com.derinko.gbini.n1casino.R.dimen.mtrl_focus_ring_outer_stroke_width);
            nj njVar6 = this.t;
            njVar6.l = f(njVar6.l, theme, njVar6.m, obtainStyledAttributes, 3, com.derinko.gbini.n1casino.R.dimen.mtrl_focus_ring_inner_stroke_width);
            nj njVar7 = this.t;
            njVar7.n = f(njVar7.n, theme, njVar7.o, obtainStyledAttributes, 7, 0);
            nj njVar8 = this.t;
            njVar8.p = f(njVar8.p, theme, njVar8.q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.t.p)) {
                this.t.p = 0.0f;
            }
            nj njVar9 = this.t;
            njVar9.r = f(njVar9.r, theme, njVar9.s, obtainStyledAttributes, 2, com.derinko.gbini.n1casino.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            nj njVar10 = this.t;
            int i6 = njVar10.u;
            int[] iArr = vx.E;
            if (i6 != Integer.MIN_VALUE) {
                njVar10.t = d20.h(theme.obtainStyledAttributes(i6, iArr), new g(0.0f)).a();
            } else {
                int i7 = njVar10.v;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = com.derinko.gbini.n1casino.R.attr.focusRingsShapeAppearance;
                }
                TypedValue I2 = zo.I(theme, i7);
                if (I2 != null) {
                    this.t.t = d20.h(theme.obtainStyledAttributes(I2.resourceId, iArr), new g(0.0f)).a();
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
        nj njVar = this.t;
        if (njVar.c && this.r) {
            float f2 = njVar.p;
            float f3 = njVar.j / 2.0f;
            float f4 = this.p;
            float f5 = (f3 * f4) + f2;
            float f6 = ((njVar.l / 2.0f) * f4) + f2 + njVar.r;
            Path path = this.j;
            if (path.isEmpty()) {
                WeakReference weakReference = this.m;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((ct) this.m.get()).n;
                }
                path = null;
            }
            Path path2 = path;
            nj njVar2 = this.t;
            if (path2 != null) {
                b(canvas, path2, f6, njVar2.l, njVar2.h);
                nj njVar3 = this.t;
                b(canvas, path2, f5, njVar3.j, njVar3.f);
                return;
            }
            if (Float.isNaN(njVar2.n)) {
                f = this.n;
                if (f < 0.0f) {
                    WeakReference weakReference2 = this.m;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        ct ctVar = (ct) this.m.get();
                        float b = ctVar.b(ctVar.g(), ctVar.g.a.d(), ctVar.H);
                        if (b >= 0.0f) {
                            b *= ctVar.g.i;
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
            nj njVar4 = this.t;
            float f7 = njVar4.l;
            int i = njVar4.h;
            RectF rectF = this.g;
            a(rectF);
            rectF.inset(f6, f6);
            float f8 = f7 * this.p;
            Paint paint = this.f;
            paint.setStrokeWidth(f8);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, max, max, paint);
            nj njVar5 = this.t;
            float f9 = njVar5.j;
            int i2 = njVar5.f;
            a(rectF);
            rectF.inset(f5, f5);
            paint.setStrokeWidth(f9 * this.p);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void g(b20 b20Var) {
        RectF rectF = this.g;
        a(rectF);
        d20 b = b20Var.b(v);
        boolean j = b.j(rectF);
        Path path = this.j;
        if (!j) {
            this.l.a(b, null, 1.0f, rectF, null, path);
            this.n = -1.0f;
            return;
        }
        nj njVar = this.t;
        float f = ((njVar.j / 2.0f) * this.p) + njVar.p;
        rectF.inset(f, f);
        this.n = b.e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        nj njVar = this.t;
        if (njVar.a == null) {
            return null;
        }
        njVar.b = getChangingConfigurations();
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
        int[] iArr = vx.k;
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.t.d = c(obtainStyledAttributes, 0);
        if (this.t.d == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            nj njVar = this.t;
            njVar.c = obtainStyledAttributes.getBoolean(0, njVar.c);
            this.t.e = true;
        }
        this.t.g = c(obtainStyledAttributes, 5);
        nj njVar2 = this.t;
        if (njVar2.g == Integer.MIN_VALUE) {
            njVar2.f = obtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.t.i = c(obtainStyledAttributes, 1);
        nj njVar3 = this.t;
        if (njVar3.i == Integer.MIN_VALUE) {
            njVar3.h = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.t.k = c(obtainStyledAttributes, 6);
        nj njVar4 = this.t;
        if (njVar4.k == Integer.MIN_VALUE) {
            njVar4.j = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.t.m = c(obtainStyledAttributes, 3);
        nj njVar5 = this.t;
        if (njVar5.m == Integer.MIN_VALUE) {
            njVar5.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.t.m = c(obtainStyledAttributes, 3);
        nj njVar6 = this.t;
        if (njVar6.m == Integer.MIN_VALUE) {
            njVar6.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.t.o = c(obtainStyledAttributes, 7);
        nj njVar7 = this.t;
        if (njVar7.o == Integer.MIN_VALUE) {
            njVar7.n = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.t.q = c(obtainStyledAttributes, 4);
        nj njVar8 = this.t;
        if (njVar8.q == Integer.MIN_VALUE) {
            njVar8.p = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.t.s = c(obtainStyledAttributes, 2);
        nj njVar9 = this.t;
        if (njVar9.s == Integer.MIN_VALUE) {
            njVar9.r = obtainStyledAttributes.getDimension(2, Float.NaN);
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
            this.t = new nj(this.t);
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
        d20 d20Var;
        super.onBoundsChange(rect);
        nj njVar = this.t;
        if (!njVar.c) {
            return;
        }
        b20 b20Var = njVar.t;
        if (b20Var != null) {
            g(b20Var);
            return;
        }
        Drawable drawable = getDrawable();
        d20 d20Var2 = null;
        if (drawable instanceof ShapeDrawable) {
            Outline outline = new Outline();
            ((ShapeDrawable) drawable).getOutline(outline);
            if (outline.getRadius() > 0.0f) {
                q00 q00Var = new q00();
                q00 q00Var2 = new q00();
                q00 q00Var3 = new q00();
                q00 q00Var4 = new q00();
                dh dhVar = new dh(0);
                dh dhVar2 = new dh(0);
                dh dhVar3 = new dh(0);
                dh dhVar4 = new dh(0);
                float radius = outline.getRadius();
                g gVar = new g(radius);
                g gVar2 = new g(radius);
                g gVar3 = new g(radius);
                g gVar4 = new g(radius);
                d20Var = new d20();
                d20Var.a = q00Var;
                d20Var.b = q00Var2;
                d20Var.c = q00Var3;
                d20Var.d = q00Var4;
                d20Var.e = gVar;
                d20Var.f = gVar2;
                d20Var.g = gVar3;
                d20Var.h = gVar4;
                d20Var.i = dhVar;
                d20Var.j = dhVar2;
                d20Var.k = dhVar3;
                d20Var.l = dhVar4;
                d20Var2 = d20Var;
            }
            if (d20Var2 == null) {
                g(d20Var2);
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
                q00 q00Var5 = new q00();
                q00 q00Var6 = new q00();
                q00 q00Var7 = new q00();
                q00 q00Var8 = new q00();
                dh dhVar5 = new dh(0);
                dh dhVar6 = new dh(0);
                dh dhVar7 = new dh(0);
                dh dhVar8 = new dh(0);
                g gVar5 = new g(Math.min(fArr[0], fArr[1]));
                g gVar6 = new g(Math.min(fArr[2], fArr[3]));
                g gVar7 = new g(Math.min(fArr[4], fArr[5]));
                g gVar8 = new g(Math.min(fArr[6], fArr[7]));
                d20Var = new d20();
                d20Var.a = q00Var5;
                d20Var.b = q00Var6;
                d20Var.c = q00Var7;
                d20Var.d = q00Var8;
                d20Var.e = gVar5;
                d20Var.f = gVar6;
                d20Var.g = gVar7;
                d20Var.h = gVar8;
                d20Var.i = dhVar5;
                d20Var.j = dhVar6;
                d20Var.k = dhVar7;
                d20Var.l = dhVar8;
                d20Var2 = d20Var;
            } else {
                try {
                    f = gradientDrawable.getCornerRadius();
                } catch (NullPointerException unused2) {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    q00 q00Var9 = new q00();
                    q00 q00Var10 = new q00();
                    q00 q00Var11 = new q00();
                    q00 q00Var12 = new q00();
                    dh dhVar9 = new dh(0);
                    dh dhVar10 = new dh(0);
                    dh dhVar11 = new dh(0);
                    dh dhVar12 = new dh(0);
                    g gVar9 = new g(f);
                    g gVar10 = new g(f);
                    g gVar11 = new g(f);
                    g gVar12 = new g(f);
                    d20 d20Var3 = new d20();
                    d20Var3.a = q00Var9;
                    d20Var3.b = q00Var10;
                    d20Var3.c = q00Var11;
                    d20Var3.d = q00Var12;
                    d20Var3.e = gVar9;
                    d20Var3.f = gVar10;
                    d20Var3.g = gVar11;
                    d20Var3.h = gVar12;
                    d20Var3.i = dhVar9;
                    d20Var3.j = dhVar10;
                    d20Var3.k = dhVar11;
                    d20Var3.l = dhVar12;
                    d20Var2 = d20Var3;
                }
            }
        }
        if (d20Var2 == null) {
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        nj njVar = this.t;
        if (!njVar.c) {
            this.r = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(njVar.x, iArr);
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
                ofFloat.addListener(new v0(6, this));
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
        this.l = f20.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        this.t = new nj(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = f20.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        nj njVar = new nj(null);
        this.t = njVar;
        if (drawable != null) {
            njVar.a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(nj njVar, Resources resources, mj mjVar) {
        this(njVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
