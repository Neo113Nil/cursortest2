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
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import f1.k;
import g2.f;
import g2.j;
import g2.l;
import g2.m;
import g2.o;
import g2.q;
import java.lang.ref.WeakReference;
import k3.d;
import org.xmlpull.v1.XmlPullParser;
import z1.a;
import z1.b;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* renamed from: u, reason: collision with root package name */
    public static final ColorDrawable f1345u = new ColorDrawable(0);

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f1346v = {R.attr.state_focused, R.attr.state_window_focused};

    /* renamed from: w, reason: collision with root package name */
    public static final OvershootInterpolator f1347w = new OvershootInterpolator(4.0f);

    /* renamed from: x, reason: collision with root package name */
    public static final a f1348x = new a("interpolation");

    /* renamed from: f, reason: collision with root package name */
    public final Paint f1349f;
    public final RectF g;
    public final Rect h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f1350i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f1351j;

    /* renamed from: k, reason: collision with root package name */
    public final Matrix f1352k;

    /* renamed from: l, reason: collision with root package name */
    public final q f1353l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f1354m;

    /* renamed from: n, reason: collision with root package name */
    public float f1355n;

    /* renamed from: o, reason: collision with root package name */
    public ObjectAnimator f1356o;

    /* renamed from: p, reason: collision with root package name */
    public float f1357p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1358q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1359r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1360s;

    /* renamed from: t, reason: collision with root package name */
    public b f1361t;

    public /* synthetic */ FocusRingDrawable(b bVar, Resources resources, a aVar) {
        this(bVar, resources);
    }

    public static int c(TypedArray typedArray, int i4) {
        if (typedArray.getType(i4) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i4, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static FocusRingDrawable e(Context context, RippleDrawable rippleDrawable, j jVar) {
        if (!d.Y(context.getTheme(), com.gglhk.bofio.fortunetiger.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, f1345u);
        if (jVar != null) {
            focusRingDrawable.f1354m = new WeakReference(jVar);
        }
        rippleDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(rippleDrawable);
        return focusRingDrawable;
    }

    public static float f(float f4, Resources.Theme theme, int i4, TypedArray typedArray, int i5, int i6) {
        if (!Float.isNaN(f4)) {
            return f4;
        }
        Resources resources = theme.getResources();
        if (i4 != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i4, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i5, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i6 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i6);
    }

    public final void a(RectF rectF) {
        Rect rect = this.f1361t.f3679w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.f1354m;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((j) this.f1354m.get()).getBounds());
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

    public final void b(Canvas canvas, Path path, float f4, float f5, int i4) {
        RectF rectF = this.g;
        a(rectF);
        float f6 = f4 * 2.0f;
        float width = 1.0f - (f6 / rectF.width());
        float height = 1.0f - (f6 / rectF.height());
        Matrix matrix = this.f1352k;
        matrix.reset();
        matrix.postScale(width, height, rectF.centerX(), rectF.centerY());
        Path path2 = this.f1350i;
        path.transform(matrix, path2);
        float f7 = f5 * this.f1357p;
        Paint paint = this.f1349f;
        paint.setStrokeWidth(f7);
        paint.setColor(i4);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    public final void d(Resources.Theme theme) {
        TypedValue X;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(l1.a.h);
        int i4 = this.f1361t.f3662d;
        if (i4 != Integer.MIN_VALUE && (X = d.X(theme, i4)) != null) {
            b bVar = this.f1361t;
            bVar.c = X.data != 0;
            bVar.f3663e = true;
        }
        b bVar2 = this.f1361t;
        if (!bVar2.f3663e) {
            bVar2.c = d.Y(theme, com.gglhk.bofio.fortunetiger.R.attr.focusRingsEnabled, bVar2.c);
        }
        b bVar3 = this.f1361t;
        if (bVar3.c) {
            int i5 = bVar3.f3664f;
            int i6 = bVar3.g;
            if (i5 == Integer.MIN_VALUE) {
                if (i6 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i6, typedValue, true)) {
                        i5 = typedValue.data;
                    }
                }
                i5 = obtainStyledAttributes.getColor(5, -16777216);
            }
            bVar3.f3664f = i5;
            b bVar4 = this.f1361t;
            int i7 = bVar4.h;
            int i8 = bVar4.f3665i;
            if (i7 == Integer.MIN_VALUE) {
                if (i8 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i8, typedValue2, true)) {
                        i7 = typedValue2.data;
                    }
                }
                i7 = obtainStyledAttributes.getColor(1, -1);
            }
            bVar4.h = i7;
            b bVar5 = this.f1361t;
            bVar5.f3666j = f(bVar5.f3666j, theme, bVar5.f3667k, obtainStyledAttributes, 6, com.gglhk.bofio.fortunetiger.R.dimen.mtrl_focus_ring_outer_stroke_width);
            b bVar6 = this.f1361t;
            bVar6.f3668l = f(bVar6.f3668l, theme, bVar6.f3669m, obtainStyledAttributes, 3, com.gglhk.bofio.fortunetiger.R.dimen.mtrl_focus_ring_inner_stroke_width);
            b bVar7 = this.f1361t;
            bVar7.f3670n = f(bVar7.f3670n, theme, bVar7.f3671o, obtainStyledAttributes, 7, 0);
            b bVar8 = this.f1361t;
            bVar8.f3672p = f(bVar8.f3672p, theme, bVar8.f3673q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.f1361t.f3672p)) {
                this.f1361t.f3672p = 0.0f;
            }
            b bVar9 = this.f1361t;
            bVar9.f3674r = f(bVar9.f3674r, theme, bVar9.f3675s, obtainStyledAttributes, 2, com.gglhk.bofio.fortunetiger.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            b bVar10 = this.f1361t;
            int i9 = bVar10.f3677u;
            int[] iArr = l1.a.A;
            if (i9 != Integer.MIN_VALUE) {
                bVar10.f3676t = o.g(theme.obtainStyledAttributes(i9, iArr), new g2.a(0.0f)).a();
            } else {
                int i10 = bVar10.f3678v;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = com.gglhk.bofio.fortunetiger.R.attr.focusRingsShapeAppearance;
                }
                TypedValue X2 = d.X(theme, i10);
                if (X2 != null) {
                    this.f1361t.f3676t = o.g(theme.obtainStyledAttributes(X2.resourceId, iArr), new g2.a(0.0f)).a();
                }
            }
        }
        obtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f1349f;
        paint.setStyle(style);
        if (Float.isNaN(this.f1361t.f3666j)) {
            return;
        }
        paint.setStrokeWidth(this.f1361t.f3666j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0046, code lost:
    
        if (r1.isEmpty() == false) goto L9;
     */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f4;
        int radius;
        super.draw(canvas);
        b bVar = this.f1361t;
        if (bVar.c && this.f1359r) {
            float f5 = bVar.f3672p;
            float f6 = bVar.f3666j / 2.0f;
            float f7 = this.f1357p;
            float f8 = (f6 * f7) + f5;
            float f9 = ((bVar.f3668l / 2.0f) * f7) + f5 + bVar.f3674r;
            Path path = this.f1351j;
            if (path.isEmpty()) {
                WeakReference weakReference = this.f1354m;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((j) this.f1354m.get()).f1863n;
                }
                path = null;
            }
            Path path2 = path;
            if (path2 != null) {
                b bVar2 = this.f1361t;
                b(canvas, path2, f9, bVar2.f3668l, bVar2.h);
                b bVar3 = this.f1361t;
                b(canvas, path2, f8, bVar3.f3666j, bVar3.f3664f);
                return;
            }
            if (Float.isNaN(this.f1361t.f3670n)) {
                f4 = this.f1355n;
                if (f4 < 0.0f) {
                    WeakReference weakReference2 = this.f1354m;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        j jVar = (j) this.f1354m.get();
                        float b2 = jVar.b(jVar.g(), jVar.g.f1843a.d(), jVar.G);
                        if (b2 >= 0.0f) {
                            b2 *= jVar.g.f1848i;
                        }
                        if (b2 >= 0.0f) {
                            f4 = Math.max(0.0f, b2 - (this.f1361t.f3666j / 2.0f));
                        }
                    }
                    Drawable drawable = getDrawable();
                    f4 = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                }
            } else {
                f4 = this.f1361t.f3670n;
            }
            float max = Math.max(0.0f, f4 - (this.f1361t.f3666j / 2.0f));
            b bVar4 = this.f1361t;
            float f10 = bVar4.f3668l;
            int i4 = bVar4.h;
            RectF rectF = this.g;
            a(rectF);
            rectF.inset(f9, f9);
            float f11 = f10 * this.f1357p;
            Paint paint = this.f1349f;
            paint.setStrokeWidth(f11);
            paint.setColor(i4);
            canvas.drawRoundRect(rectF, max, max, paint);
            b bVar5 = this.f1361t;
            float f12 = bVar5.f3666j;
            int i5 = bVar5.f3664f;
            a(rectF);
            rectF.inset(f8, f8);
            paint.setStrokeWidth(f12 * this.f1357p);
            paint.setColor(i5);
            canvas.drawRoundRect(rectF, f4, f4, paint);
        }
    }

    public final void g(m mVar) {
        RectF rectF = this.g;
        a(rectF);
        o c = mVar.c(f1346v);
        boolean i4 = c.i(rectF);
        Path path = this.f1351j;
        if (!i4) {
            this.f1353l.a(c, null, 1.0f, rectF, null, path);
            this.f1355n = -1.0f;
            return;
        }
        b bVar = this.f1361t;
        float f4 = ((bVar.f3666j / 2.0f) * this.f1357p) + bVar.f3672p;
        rectF.inset(f4, f4);
        this.f1355n = c.f1889e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        b bVar = this.f1361t;
        if (bVar.f3660a == null) {
            return null;
        }
        bVar.f3661b = getChangingConfigurations();
        return this.f1361t;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.f1361t.c;
        } catch (NoSuchMethodError unused) {
            return this.f1361t.c;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
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
        return super.isStateful() || this.f1361t.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.f1356o;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f1356o = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f1360s && super.mutate() == this) {
            this.f1361t = new b(this.f1361t);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f1361t.f3660a = drawable.getConstantState();
            }
            this.f1360s = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0197  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBoundsChange(Rect rect) {
        float[] fArr;
        float f4;
        o oVar;
        super.onBoundsChange(rect);
        b bVar = this.f1361t;
        if (!bVar.c) {
            return;
        }
        m mVar = bVar.f3676t;
        if (mVar != null) {
            g(mVar);
            return;
        }
        Drawable drawable = getDrawable();
        o oVar2 = null;
        if (drawable instanceof ShapeDrawable) {
            Outline outline = new Outline();
            ((ShapeDrawable) drawable).getOutline(outline);
            if (outline.getRadius() > 0.0f) {
                l lVar = new l();
                l lVar2 = new l();
                l lVar3 = new l();
                l lVar4 = new l();
                f fVar = new f(0);
                f fVar2 = new f(0);
                f fVar3 = new f(0);
                f fVar4 = new f(0);
                float radius = outline.getRadius();
                g2.a aVar = new g2.a(radius);
                g2.a aVar2 = new g2.a(radius);
                g2.a aVar3 = new g2.a(radius);
                g2.a aVar4 = new g2.a(radius);
                oVar = new o();
                oVar.f1886a = lVar;
                oVar.f1887b = lVar2;
                oVar.c = lVar3;
                oVar.f1888d = lVar4;
                oVar.f1889e = aVar;
                oVar.f1890f = aVar2;
                oVar.g = aVar3;
                oVar.h = aVar4;
                oVar.f1891i = fVar;
                oVar.f1892j = fVar2;
                oVar.f1893k = fVar3;
                oVar.f1894l = fVar4;
                oVar2 = oVar;
            }
            if (oVar2 == null) {
                g(oVar2);
                return;
            } else {
                this.f1355n = -1.0f;
                this.f1351j.reset();
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
                l lVar5 = new l();
                l lVar6 = new l();
                l lVar7 = new l();
                l lVar8 = new l();
                f fVar5 = new f(0);
                f fVar6 = new f(0);
                f fVar7 = new f(0);
                f fVar8 = new f(0);
                g2.a aVar5 = new g2.a(Math.min(fArr[0], fArr[1]));
                g2.a aVar6 = new g2.a(Math.min(fArr[2], fArr[3]));
                g2.a aVar7 = new g2.a(Math.min(fArr[4], fArr[5]));
                g2.a aVar8 = new g2.a(Math.min(fArr[6], fArr[7]));
                oVar = new o();
                oVar.f1886a = lVar5;
                oVar.f1887b = lVar6;
                oVar.c = lVar7;
                oVar.f1888d = lVar8;
                oVar.f1889e = aVar5;
                oVar.f1890f = aVar6;
                oVar.g = aVar7;
                oVar.h = aVar8;
                oVar.f1891i = fVar5;
                oVar.f1892j = fVar6;
                oVar.f1893k = fVar7;
                oVar.f1894l = fVar8;
                oVar2 = oVar;
            } else {
                try {
                    f4 = gradientDrawable.getCornerRadius();
                } catch (NullPointerException unused2) {
                    f4 = -1.0f;
                }
                if (f4 > 0.0f) {
                    l lVar9 = new l();
                    l lVar10 = new l();
                    l lVar11 = new l();
                    l lVar12 = new l();
                    f fVar9 = new f(0);
                    f fVar10 = new f(0);
                    f fVar11 = new f(0);
                    f fVar12 = new f(0);
                    g2.a aVar9 = new g2.a(f4);
                    g2.a aVar10 = new g2.a(f4);
                    g2.a aVar11 = new g2.a(f4);
                    g2.a aVar12 = new g2.a(f4);
                    o oVar3 = new o();
                    oVar3.f1886a = lVar9;
                    oVar3.f1887b = lVar10;
                    oVar3.c = lVar11;
                    oVar3.f1888d = lVar12;
                    oVar3.f1889e = aVar9;
                    oVar3.f1890f = aVar10;
                    oVar3.g = aVar11;
                    oVar3.h = aVar12;
                    oVar3.f1891i = fVar9;
                    oVar3.f1892j = fVar10;
                    oVar3.f1893k = fVar11;
                    oVar3.f1894l = fVar12;
                    oVar2 = oVar3;
                }
            }
        }
        if (oVar2 == null) {
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        b bVar = this.f1361t;
        if (!bVar.c) {
            this.f1359r = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(bVar.f3680x, iArr);
        boolean z3 = this.f1359r != stateSetMatches;
        this.f1359r = stateSetMatches;
        if (z3 && iArr.length > 0 && !this.f1358q) {
            ObjectAnimator objectAnimator = this.f1356o;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f1356o = null;
            }
            if (stateSetMatches) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1348x, 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(f1347w);
                ofFloat.addListener(new k(5, this));
                this.f1356o = ofFloat;
                ofFloat.start();
            } else {
                this.f1357p = 1.0f;
            }
        }
        this.f1358q = iArr.length == 0;
        return super.onStateChange(iArr) || z3;
    }

    public FocusRingDrawable() {
        super(null);
        this.f1349f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.f1350i = new Path();
        this.f1351j = new Path();
        this.f1352k = new Matrix();
        this.f1353l = q.b();
        this.f1355n = -1.0f;
        this.f1357p = 1.0f;
        this.f1359r = false;
        this.f1360s = false;
        this.f1361t = new b(null);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = l1.a.h;
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f1361t.f3662d = c(obtainStyledAttributes, 0);
        if (this.f1361t.f3662d == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            b bVar = this.f1361t;
            bVar.c = obtainStyledAttributes.getBoolean(0, bVar.c);
            this.f1361t.f3663e = true;
        }
        this.f1361t.g = c(obtainStyledAttributes, 5);
        b bVar2 = this.f1361t;
        if (bVar2.g == Integer.MIN_VALUE) {
            bVar2.f3664f = obtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.f1361t.f3665i = c(obtainStyledAttributes, 1);
        b bVar3 = this.f1361t;
        if (bVar3.f3665i == Integer.MIN_VALUE) {
            bVar3.h = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.f1361t.f3667k = c(obtainStyledAttributes, 6);
        b bVar4 = this.f1361t;
        if (bVar4.f3667k == Integer.MIN_VALUE) {
            bVar4.f3666j = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f1361t.f3669m = c(obtainStyledAttributes, 3);
        b bVar5 = this.f1361t;
        if (bVar5.f3669m == Integer.MIN_VALUE) {
            bVar5.f3668l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f1361t.f3669m = c(obtainStyledAttributes, 3);
        b bVar6 = this.f1361t;
        if (bVar6.f3669m == Integer.MIN_VALUE) {
            bVar6.f3668l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f1361t.f3671o = c(obtainStyledAttributes, 7);
        b bVar7 = this.f1361t;
        if (bVar7.f3671o == Integer.MIN_VALUE) {
            bVar7.f3670n = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f1361t.f3673q = c(obtainStyledAttributes, 4);
        b bVar8 = this.f1361t;
        if (bVar8.f3673q == Integer.MIN_VALUE) {
            bVar8.f3672p = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f1361t.f3675s = c(obtainStyledAttributes, 2);
        b bVar9 = this.f1361t;
        if (bVar9.f3675s == Integer.MIN_VALUE) {
            bVar9.f3674r = obtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f1361t.f3678v = c(obtainStyledAttributes, 8);
        this.f1361t.f3677u = obtainStyledAttributes.getType(8) == 1 ? obtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
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
            this.f1361t.f3660a = drawable.getConstantState();
        } else {
            ColorDrawable colorDrawable = f1345u;
            setDrawable(colorDrawable);
            this.f1361t.f3660a = colorDrawable.getConstantState();
        }
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f1349f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.f1350i = new Path();
        this.f1351j = new Path();
        this.f1352k = new Matrix();
        this.f1353l = q.b();
        this.f1355n = -1.0f;
        this.f1357p = 1.0f;
        this.f1359r = false;
        this.f1360s = false;
        b bVar = new b(null);
        this.f1361t = bVar;
        if (drawable != null) {
            bVar.f3660a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    private FocusRingDrawable(b bVar, Resources resources) {
        super(null);
        Drawable newDrawable;
        Paint paint = new Paint(1);
        this.f1349f = paint;
        this.g = new RectF();
        this.h = new Rect();
        this.f1350i = new Path();
        this.f1351j = new Path();
        this.f1352k = new Matrix();
        this.f1353l = q.b();
        this.f1355n = -1.0f;
        this.f1357p = 1.0f;
        this.f1359r = false;
        this.f1360s = false;
        b bVar2 = new b(bVar);
        this.f1361t = bVar2;
        Drawable.ConstantState constantState = bVar2.f3660a;
        if (constantState != null) {
            if (resources != null) {
                newDrawable = constantState.newDrawable(resources);
            } else {
                newDrawable = constantState.newDrawable();
            }
            setDrawable(newDrawable);
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f1361t.f3666j)) {
            return;
        }
        paint.setStrokeWidth(this.f1361t.f3666j);
    }
}
