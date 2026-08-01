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
import b4.d;
import g2.e;
import h2.a;
import h2.b;
import java.lang.ref.WeakReference;
import o2.f;
import o2.j;
import o2.l;
import o2.m;
import o2.o;
import o2.q;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* renamed from: u, reason: collision with root package name */
    public static final ColorDrawable f1152u = new ColorDrawable(0);

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f1153v = {R.attr.state_focused, R.attr.state_window_focused};

    /* renamed from: w, reason: collision with root package name */
    public static final OvershootInterpolator f1154w = new OvershootInterpolator(4.0f);

    /* renamed from: x, reason: collision with root package name */
    public static final a f1155x = new a("interpolation");

    /* renamed from: f, reason: collision with root package name */
    public final Paint f1156f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f1157g;
    public final Rect h;
    public final Path i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f1158j;

    /* renamed from: k, reason: collision with root package name */
    public final Matrix f1159k;

    /* renamed from: l, reason: collision with root package name */
    public final q f1160l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f1161m;

    /* renamed from: n, reason: collision with root package name */
    public float f1162n;

    /* renamed from: o, reason: collision with root package name */
    public ObjectAnimator f1163o;

    /* renamed from: p, reason: collision with root package name */
    public float f1164p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1165q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1166r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1167s;

    /* renamed from: t, reason: collision with root package name */
    public b f1168t;

    public /* synthetic */ FocusRingDrawable(b bVar, Resources resources, a aVar) {
        this(bVar, resources);
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

    public static FocusRingDrawable e(Context context, LayerDrawable layerDrawable, j jVar) {
        if (!d.P(context.getTheme(), com.gdmhkmf.belbet.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, f1152u);
        if (jVar != null) {
            focusRingDrawable.f1161m = new WeakReference(jVar);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    public static float f(float f5, Resources.Theme theme, int i, TypedArray typedArray, int i4, int i5) {
        if (!Float.isNaN(f5)) {
            return f5;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i4, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i5 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i5);
    }

    public final void a(RectF rectF) {
        Rect rect = this.f1168t.f1993w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.f1161m;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((j) this.f1161m.get()).getBounds());
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

    public final void b(Canvas canvas, Path path, float f5, float f6, int i) {
        RectF rectF = this.f1157g;
        a(rectF);
        float f7 = f5 * 2.0f;
        float width = 1.0f - (f7 / rectF.width());
        float height = 1.0f - (f7 / rectF.height());
        Matrix matrix = this.f1159k;
        matrix.reset();
        matrix.postScale(width, height, rectF.centerX(), rectF.centerY());
        Path path2 = this.i;
        path.transform(matrix, path2);
        float f8 = f6 * this.f1164p;
        Paint paint = this.f1156f;
        paint.setStrokeWidth(f8);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    public final void d(Resources.Theme theme) {
        TypedValue O;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(q1.a.f3147k);
        int i = this.f1168t.d;
        if (i != Integer.MIN_VALUE && (O = d.O(theme, i)) != null) {
            b bVar = this.f1168t;
            bVar.f1976c = O.data != 0;
            bVar.f1977e = true;
        }
        b bVar2 = this.f1168t;
        if (!bVar2.f1977e) {
            bVar2.f1976c = d.P(theme, com.gdmhkmf.belbet.R.attr.focusRingsEnabled, bVar2.f1976c);
        }
        b bVar3 = this.f1168t;
        if (bVar3.f1976c) {
            int i4 = bVar3.f1978f;
            int i5 = bVar3.f1979g;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue, true)) {
                        i4 = typedValue.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(5, -16777216);
            }
            bVar3.f1978f = i4;
            b bVar4 = this.f1168t;
            int i6 = bVar4.h;
            int i7 = bVar4.i;
            if (i6 == Integer.MIN_VALUE) {
                if (i7 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i7, typedValue2, true)) {
                        i6 = typedValue2.data;
                    }
                }
                i6 = obtainStyledAttributes.getColor(1, -1);
            }
            bVar4.h = i6;
            b bVar5 = this.f1168t;
            bVar5.f1980j = f(bVar5.f1980j, theme, bVar5.f1981k, obtainStyledAttributes, 6, com.gdmhkmf.belbet.R.dimen.mtrl_focus_ring_outer_stroke_width);
            b bVar6 = this.f1168t;
            bVar6.f1982l = f(bVar6.f1982l, theme, bVar6.f1983m, obtainStyledAttributes, 3, com.gdmhkmf.belbet.R.dimen.mtrl_focus_ring_inner_stroke_width);
            b bVar7 = this.f1168t;
            bVar7.f1984n = f(bVar7.f1984n, theme, bVar7.f1985o, obtainStyledAttributes, 7, 0);
            b bVar8 = this.f1168t;
            bVar8.f1986p = f(bVar8.f1986p, theme, bVar8.f1987q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.f1168t.f1986p)) {
                this.f1168t.f1986p = 0.0f;
            }
            b bVar9 = this.f1168t;
            bVar9.f1988r = f(bVar9.f1988r, theme, bVar9.f1989s, obtainStyledAttributes, 2, com.gdmhkmf.belbet.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            b bVar10 = this.f1168t;
            int i8 = bVar10.f1991u;
            int[] iArr = q1.a.F;
            if (i8 != Integer.MIN_VALUE) {
                bVar10.f1990t = o.h(theme.obtainStyledAttributes(i8, iArr), new o2.a(0.0f)).a();
            } else {
                int i9 = bVar10.f1992v;
                if (i9 == Integer.MIN_VALUE) {
                    i9 = com.gdmhkmf.belbet.R.attr.focusRingsShapeAppearance;
                }
                TypedValue O2 = d.O(theme, i9);
                if (O2 != null) {
                    this.f1168t.f1990t = o.h(theme.obtainStyledAttributes(O2.resourceId, iArr), new o2.a(0.0f)).a();
                }
            }
        }
        obtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f1156f;
        paint.setStyle(style);
        if (Float.isNaN(this.f1168t.f1980j)) {
            return;
        }
        paint.setStrokeWidth(this.f1168t.f1980j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0046, code lost:
    
        if (r1.isEmpty() == false) goto L9;
     */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f5;
        int radius;
        super.draw(canvas);
        b bVar = this.f1168t;
        if (bVar.f1976c && this.f1166r) {
            float f6 = bVar.f1986p;
            float f7 = bVar.f1980j / 2.0f;
            float f8 = this.f1164p;
            float f9 = (f7 * f8) + f6;
            float f10 = ((bVar.f1982l / 2.0f) * f8) + f6 + bVar.f1988r;
            Path path = this.f1158j;
            if (path.isEmpty()) {
                WeakReference weakReference = this.f1161m;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((j) this.f1161m.get()).f2960n;
                }
                path = null;
            }
            Path path2 = path;
            if (path2 != null) {
                b bVar2 = this.f1168t;
                b(canvas, path2, f10, bVar2.f1982l, bVar2.h);
                b bVar3 = this.f1168t;
                b(canvas, path2, f9, bVar3.f1980j, bVar3.f1978f);
                return;
            }
            if (Float.isNaN(this.f1168t.f1984n)) {
                f5 = this.f1162n;
                if (f5 < 0.0f) {
                    WeakReference weakReference2 = this.f1161m;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        j jVar = (j) this.f1161m.get();
                        float b2 = jVar.b(jVar.g(), jVar.f2955g.f2940a.d(), jVar.G);
                        if (b2 >= 0.0f) {
                            b2 *= jVar.f2955g.i;
                        }
                        if (b2 >= 0.0f) {
                            f5 = Math.max(0.0f, b2 - (this.f1168t.f1980j / 2.0f));
                        }
                    }
                    Drawable drawable = getDrawable();
                    f5 = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                }
            } else {
                f5 = this.f1168t.f1984n;
            }
            float max = Math.max(0.0f, f5 - (this.f1168t.f1980j / 2.0f));
            b bVar4 = this.f1168t;
            float f11 = bVar4.f1982l;
            int i = bVar4.h;
            RectF rectF = this.f1157g;
            a(rectF);
            rectF.inset(f10, f10);
            float f12 = f11 * this.f1164p;
            Paint paint = this.f1156f;
            paint.setStrokeWidth(f12);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, max, max, paint);
            b bVar5 = this.f1168t;
            float f13 = bVar5.f1980j;
            int i4 = bVar5.f1978f;
            a(rectF);
            rectF.inset(f9, f9);
            paint.setStrokeWidth(f13 * this.f1164p);
            paint.setColor(i4);
            canvas.drawRoundRect(rectF, f5, f5, paint);
        }
    }

    public final void g(m mVar) {
        RectF rectF = this.f1157g;
        a(rectF);
        o b2 = mVar.b(f1153v);
        boolean j2 = b2.j(rectF);
        Path path = this.f1158j;
        if (!j2) {
            this.f1160l.a(b2, null, 1.0f, rectF, null, path);
            this.f1162n = -1.0f;
            return;
        }
        b bVar = this.f1168t;
        float f5 = ((bVar.f1980j / 2.0f) * this.f1164p) + bVar.f1986p;
        rectF.inset(f5, f5);
        this.f1162n = b2.f2987e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        b bVar = this.f1168t;
        if (bVar.f1974a == null) {
            return null;
        }
        bVar.f1975b = getChangingConfigurations();
        return this.f1168t;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.f1168t.f1976c;
        } catch (NoSuchMethodError unused) {
            return this.f1168t.f1976c;
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
        return super.isStateful() || this.f1168t.f1976c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.f1163o;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f1163o = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f1167s && super.mutate() == this) {
            this.f1168t = new b(this.f1168t);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f1168t.f1974a = drawable.getConstantState();
            }
            this.f1167s = true;
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
        float f5;
        o oVar;
        super.onBoundsChange(rect);
        b bVar = this.f1168t;
        if (!bVar.f1976c) {
            return;
        }
        m mVar = bVar.f1990t;
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
                o2.a aVar = new o2.a(radius);
                o2.a aVar2 = new o2.a(radius);
                o2.a aVar3 = new o2.a(radius);
                o2.a aVar4 = new o2.a(radius);
                oVar = new o();
                oVar.f2984a = lVar;
                oVar.f2985b = lVar2;
                oVar.f2986c = lVar3;
                oVar.d = lVar4;
                oVar.f2987e = aVar;
                oVar.f2988f = aVar2;
                oVar.f2989g = aVar3;
                oVar.h = aVar4;
                oVar.i = fVar;
                oVar.f2990j = fVar2;
                oVar.f2991k = fVar3;
                oVar.f2992l = fVar4;
                oVar2 = oVar;
            }
            if (oVar2 == null) {
                g(oVar2);
                return;
            } else {
                this.f1162n = -1.0f;
                this.f1158j.reset();
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
                o2.a aVar5 = new o2.a(Math.min(fArr[0], fArr[1]));
                o2.a aVar6 = new o2.a(Math.min(fArr[2], fArr[3]));
                o2.a aVar7 = new o2.a(Math.min(fArr[4], fArr[5]));
                o2.a aVar8 = new o2.a(Math.min(fArr[6], fArr[7]));
                oVar = new o();
                oVar.f2984a = lVar5;
                oVar.f2985b = lVar6;
                oVar.f2986c = lVar7;
                oVar.d = lVar8;
                oVar.f2987e = aVar5;
                oVar.f2988f = aVar6;
                oVar.f2989g = aVar7;
                oVar.h = aVar8;
                oVar.i = fVar5;
                oVar.f2990j = fVar6;
                oVar.f2991k = fVar7;
                oVar.f2992l = fVar8;
                oVar2 = oVar;
            } else {
                try {
                    f5 = gradientDrawable.getCornerRadius();
                } catch (NullPointerException unused2) {
                    f5 = -1.0f;
                }
                if (f5 > 0.0f) {
                    l lVar9 = new l();
                    l lVar10 = new l();
                    l lVar11 = new l();
                    l lVar12 = new l();
                    f fVar9 = new f(0);
                    f fVar10 = new f(0);
                    f fVar11 = new f(0);
                    f fVar12 = new f(0);
                    o2.a aVar9 = new o2.a(f5);
                    o2.a aVar10 = new o2.a(f5);
                    o2.a aVar11 = new o2.a(f5);
                    o2.a aVar12 = new o2.a(f5);
                    o oVar3 = new o();
                    oVar3.f2984a = lVar9;
                    oVar3.f2985b = lVar10;
                    oVar3.f2986c = lVar11;
                    oVar3.d = lVar12;
                    oVar3.f2987e = aVar9;
                    oVar3.f2988f = aVar10;
                    oVar3.f2989g = aVar11;
                    oVar3.h = aVar12;
                    oVar3.i = fVar9;
                    oVar3.f2990j = fVar10;
                    oVar3.f2991k = fVar11;
                    oVar3.f2992l = fVar12;
                    oVar2 = oVar3;
                }
            }
        }
        if (oVar2 == null) {
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        b bVar = this.f1168t;
        if (!bVar.f1976c) {
            this.f1166r = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(bVar.f1994x, iArr);
        boolean z4 = this.f1166r != stateSetMatches;
        this.f1166r = stateSetMatches;
        if (z4 && iArr.length > 0 && !this.f1165q) {
            ObjectAnimator objectAnimator = this.f1163o;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f1163o = null;
            }
            if (stateSetMatches) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1155x, 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(f1154w);
                ofFloat.addListener(new e(1, this));
                this.f1163o = ofFloat;
                ofFloat.start();
            } else {
                this.f1164p = 1.0f;
            }
        }
        this.f1165q = iArr.length == 0;
        return super.onStateChange(iArr) || z4;
    }

    public FocusRingDrawable() {
        super(null);
        this.f1156f = new Paint(1);
        this.f1157g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.f1158j = new Path();
        this.f1159k = new Matrix();
        this.f1160l = q.b();
        this.f1162n = -1.0f;
        this.f1164p = 1.0f;
        this.f1166r = false;
        this.f1167s = false;
        this.f1168t = new b(null);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = q1.a.f3147k;
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f1168t.d = c(obtainStyledAttributes, 0);
        if (this.f1168t.d == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            b bVar = this.f1168t;
            bVar.f1976c = obtainStyledAttributes.getBoolean(0, bVar.f1976c);
            this.f1168t.f1977e = true;
        }
        this.f1168t.f1979g = c(obtainStyledAttributes, 5);
        b bVar2 = this.f1168t;
        if (bVar2.f1979g == Integer.MIN_VALUE) {
            bVar2.f1978f = obtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.f1168t.i = c(obtainStyledAttributes, 1);
        b bVar3 = this.f1168t;
        if (bVar3.i == Integer.MIN_VALUE) {
            bVar3.h = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.f1168t.f1981k = c(obtainStyledAttributes, 6);
        b bVar4 = this.f1168t;
        if (bVar4.f1981k == Integer.MIN_VALUE) {
            bVar4.f1980j = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f1168t.f1983m = c(obtainStyledAttributes, 3);
        b bVar5 = this.f1168t;
        if (bVar5.f1983m == Integer.MIN_VALUE) {
            bVar5.f1982l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f1168t.f1983m = c(obtainStyledAttributes, 3);
        b bVar6 = this.f1168t;
        if (bVar6.f1983m == Integer.MIN_VALUE) {
            bVar6.f1982l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f1168t.f1985o = c(obtainStyledAttributes, 7);
        b bVar7 = this.f1168t;
        if (bVar7.f1985o == Integer.MIN_VALUE) {
            bVar7.f1984n = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f1168t.f1987q = c(obtainStyledAttributes, 4);
        b bVar8 = this.f1168t;
        if (bVar8.f1987q == Integer.MIN_VALUE) {
            bVar8.f1986p = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f1168t.f1989s = c(obtainStyledAttributes, 2);
        b bVar9 = this.f1168t;
        if (bVar9.f1989s == Integer.MIN_VALUE) {
            bVar9.f1988r = obtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f1168t.f1992v = c(obtainStyledAttributes, 8);
        this.f1168t.f1991u = obtainStyledAttributes.getType(8) == 1 ? obtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
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
            this.f1168t.f1974a = drawable.getConstantState();
        } else {
            ColorDrawable colorDrawable = f1152u;
            setDrawable(colorDrawable);
            this.f1168t.f1974a = colorDrawable.getConstantState();
        }
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f1156f = new Paint(1);
        this.f1157g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.f1158j = new Path();
        this.f1159k = new Matrix();
        this.f1160l = q.b();
        this.f1162n = -1.0f;
        this.f1164p = 1.0f;
        this.f1166r = false;
        this.f1167s = false;
        b bVar = new b(null);
        this.f1168t = bVar;
        if (drawable != null) {
            bVar.f1974a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    private FocusRingDrawable(b bVar, Resources resources) {
        super(null);
        Drawable newDrawable;
        Paint paint = new Paint(1);
        this.f1156f = paint;
        this.f1157g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.f1158j = new Path();
        this.f1159k = new Matrix();
        this.f1160l = q.b();
        this.f1162n = -1.0f;
        this.f1164p = 1.0f;
        this.f1166r = false;
        this.f1167s = false;
        b bVar2 = new b(bVar);
        this.f1168t = bVar2;
        Drawable.ConstantState constantState = bVar2.f1974a;
        if (constantState != null) {
            if (resources != null) {
                newDrawable = constantState.newDrawable(resources);
            } else {
                newDrawable = constantState.newDrawable();
            }
            setDrawable(newDrawable);
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f1168t.f1980j)) {
            return;
        }
        paint.setStrokeWidth(this.f1168t.f1980j);
    }
}
