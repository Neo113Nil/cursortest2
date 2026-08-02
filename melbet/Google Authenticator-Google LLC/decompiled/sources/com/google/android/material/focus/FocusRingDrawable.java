package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
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
import android.util.FloatProperty;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import defpackage.fih;
import defpackage.fii;
import defpackage.fij;
import defpackage.fik;
import defpackage.fil;
import defpackage.fny;
import defpackage.fob;
import defpackage.fof;
import defpackage.fog;
import defpackage.foi;
import defpackage.gbw;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public float b;
    public fij c;
    private final Paint g;
    private final RectF h;
    private final Rect i;
    private final Path j;
    private final Path k;
    private final Matrix l;
    private final foi m;
    private WeakReference n;
    private float o;
    private ObjectAnimator p;
    private boolean q;
    private boolean r;
    private boolean s;
    private static final Drawable d = new ColorDrawable(0);
    public static final int[] a = {R.attr.state_focused, R.attr.state_window_focused};
    private static final TimeInterpolator e = new OvershootInterpolator(4.0f);
    private static final FloatProperty f = new fih();

    private FocusRingDrawable(fij fijVar, Resources resources) {
        super(null);
        this.g = new Paint(1);
        this.h = new RectF();
        this.i = new Rect();
        this.j = new Path();
        this.k = new Path();
        this.l = new Matrix();
        this.m = foi.a();
        this.o = -1.0f;
        this.b = 1.0f;
        this.r = false;
        this.s = false;
        fij fijVar2 = new fij(fijVar);
        this.c = fijVar2;
        Drawable.ConstantState constantState = fijVar2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        i();
    }

    public static FocusRingDrawable a(Context context, LayerDrawable layerDrawable, fob fobVar) {
        if (!c(context)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, d);
        if (fobVar != null) {
            focusRingDrawable.b(fobVar);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    public static boolean c(Context context) {
        return fny.n(context.getTheme(), com.google.android.apps.authenticator2.R.attr.focusRingsEnabled, false);
    }

    private final float d() {
        fij fijVar = this.c;
        return fijVar.p + ((fijVar.j / 2.0f) * this.b);
    }

    private final void e(RectF rectF) {
        Rect rect = this.c.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.n;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((fob) this.n.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.i;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    private final void f(Canvas canvas, Path path, float f2, float f3, int i) {
        RectF rectF = this.h;
        e(rectF);
        float f4 = f2 + f2;
        float width = f4 / rectF.width();
        float height = f4 / rectF.height();
        Matrix matrix = this.l;
        matrix.reset();
        matrix.postScale(1.0f - width, 1.0f - height, rectF.centerX(), rectF.centerY());
        Path path2 = this.j;
        path.transform(matrix, path2);
        float f5 = f3 * this.b;
        Paint paint = this.g;
        paint.setStrokeWidth(f5);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    private final void g(Canvas canvas, float f2, float f3, float f4, int i) {
        RectF rectF = this.h;
        e(rectF);
        rectF.inset(f3, f3);
        float f5 = f4 * this.b;
        Paint paint = this.g;
        paint.setStrokeWidth(f5);
        paint.setColor(i);
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    private final void h(Resources.Theme theme) {
        TypedValue k;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(fil.a);
        int i = this.c.d;
        if (i != Integer.MIN_VALUE && (k = fny.k(theme, i)) != null) {
            this.c.c = k.data != 0;
            this.c.e = true;
        }
        fij fijVar = this.c;
        if (!fijVar.e) {
            fijVar.c = fny.n(theme, com.google.android.apps.authenticator2.R.attr.focusRingsEnabled, fijVar.c);
        }
        fij fijVar2 = this.c;
        if (fijVar2.c) {
            fijVar2.f = n(fijVar2.f, theme, fijVar2.g, obtainStyledAttributes, 5, -16777216);
            fij fijVar3 = this.c;
            fijVar3.h = n(fijVar3.h, theme, fijVar3.i, obtainStyledAttributes, 1, -1);
            fij fijVar4 = this.c;
            fijVar4.j = o(fijVar4.j, theme, fijVar4.k, obtainStyledAttributes, 6, com.google.android.apps.authenticator2.R.dimen.mtrl_focus_ring_outer_stroke_width);
            fij fijVar5 = this.c;
            fijVar5.l = o(fijVar5.l, theme, fijVar5.m, obtainStyledAttributes, 3, com.google.android.apps.authenticator2.R.dimen.mtrl_focus_ring_inner_stroke_width);
            fij fijVar6 = this.c;
            fijVar6.n = o(fijVar6.n, theme, fijVar6.o, obtainStyledAttributes, 7, 0);
            fij fijVar7 = this.c;
            fijVar7.p = o(fijVar7.p, theme, fijVar7.q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.c.p)) {
                this.c.p = 0.0f;
            }
            fij fijVar8 = this.c;
            fijVar8.r = o(fijVar8.r, theme, fijVar8.s, obtainStyledAttributes, 2, com.google.android.apps.authenticator2.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            fij fijVar9 = this.c;
            int i2 = fijVar9.u;
            if (i2 != Integer.MIN_VALUE) {
                fijVar9.t = new fog(fog.h(theme, i2));
            } else {
                int i3 = fijVar9.v;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = com.google.android.apps.authenticator2.R.attr.focusRingsShapeAppearance;
                }
                TypedValue k2 = fny.k(theme, i3);
                if (k2 != null) {
                    this.c.t = new fog(fog.h(theme, k2.resourceId));
                }
            }
            fij fijVar10 = this.c;
            int i4 = fijVar10.y;
            if (i4 != Integer.MIN_VALUE) {
                fijVar10.x = l(theme, i4);
            } else {
                TypedValue k3 = fny.k(theme, com.google.android.apps.authenticator2.R.attr.focusRingsStateSet);
                if (k3 != null && k3.resourceId != 0) {
                    this.c.x = l(theme, k3.resourceId);
                }
            }
        }
        obtainStyledAttributes.recycle();
        i();
    }

    private final void i() {
        Paint paint = this.g;
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.c.j)) {
            return;
        }
        paint.setStrokeWidth(this.c.j);
    }

    private final void j(fof fofVar) {
        RectF rectF = this.h;
        e(rectF);
        fog b = fofVar.b(a);
        if (!b.g(rectF)) {
            this.m.c(b, null, 1.0f, rectF, null, this.k);
            this.o = -1.0f;
        } else {
            float d2 = d();
            rectF.inset(d2, d2);
            this.o = b.b.a(rectF);
            this.k.reset();
        }
    }

    private static final int k(TypedArray typedArray, int i) {
        if (typedArray.getType(i) == 1) {
            return typedArray.getResourceId(i, Integer.MIN_VALUE);
        }
        return Integer.MIN_VALUE;
    }

    private static final int[] l(Resources.Theme theme, int i) {
        TypedArray obtainTypedArray = theme.getResources().obtainTypedArray(i);
        int[] iArr = new int[obtainTypedArray.length()];
        for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
            iArr[i2] = obtainTypedArray.getResourceId(i2, 0);
        }
        obtainTypedArray.recycle();
        return iArr;
    }

    private static final int m(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    private static final int n(int i, Resources.Theme theme, int i2, TypedArray typedArray, int i3, int i4) {
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (i2 != Integer.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i2, typedValue, true)) {
                return typedValue.data;
            }
        }
        return typedArray.getColor(i3, i4);
    }

    private static final float o(float f2, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f2)) {
            return f2;
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

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        h(theme);
    }

    public final void b(fob fobVar) {
        this.n = new WeakReference(fobVar);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r3.isEmpty() != false) goto L16;
     */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f2;
        float f3;
        int radius;
        super.draw(canvas);
        if (this.c.c && this.r) {
            float d2 = d();
            fij fijVar = this.c;
            float f4 = fijVar.p + fijVar.r;
            float f5 = (fijVar.l / 2.0f) * this.b;
            Path path = this.k;
            if (path.isEmpty()) {
                WeakReference weakReference = this.n;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((fob) this.n.get()).v;
                }
                path = null;
            }
            float f6 = f4 + f5;
            fij fijVar2 = this.c;
            if (path != null) {
                f(canvas, path, f6, fijVar2.l, fijVar2.h);
                fij fijVar3 = this.c;
                f(canvas, path, d2, fijVar3.j, fijVar3.f);
                return;
            }
            if (Float.isNaN(fijVar2.n)) {
                f2 = this.o;
                if (f2 < 0.0f) {
                    WeakReference weakReference2 = this.n;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        fob fobVar = (fob) this.n.get();
                        float s = fobVar.s(fobVar.D(), fobVar.p.a.a(), fobVar.z);
                        if (s >= 0.0f) {
                            s *= fobVar.p.k;
                        }
                        if (s >= 0.0f) {
                            f2 = Math.max(0.0f, s - (this.c.j / 2.0f));
                        }
                    }
                    Drawable drawable = getDrawable();
                    if (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) {
                        f3 = 0.0f;
                        float max = Math.max(0.0f, f3 - (this.c.j / 2.0f));
                        fij fijVar4 = this.c;
                        g(canvas, max, f6, fijVar4.l, fijVar4.h);
                        fij fijVar5 = this.c;
                        g(canvas, f3, d2, fijVar5.j, fijVar5.f);
                    }
                    f2 = radius;
                }
            } else {
                f2 = this.c.n;
            }
            f3 = f2;
            float max2 = Math.max(0.0f, f3 - (this.c.j / 2.0f));
            fij fijVar42 = this.c;
            g(canvas, max2, f6, fijVar42.l, fijVar42.h);
            fij fijVar52 = this.c;
            g(canvas, f3, d2, fijVar52.j, fijVar52.f);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        fij fijVar = this.c;
        if (fijVar.a == null) {
            return null;
        }
        fijVar.b = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.c.c;
        } catch (NoSuchMethodError unused) {
            return this.c.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, fil.a, 0, 0) : resources.obtainAttributes(attributeSet, fil.a);
        this.c.d = m(obtainStyledAttributes, 0);
        if (this.c.d == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            fij fijVar = this.c;
            fijVar.c = obtainStyledAttributes.getBoolean(0, fijVar.c);
            this.c.e = true;
        }
        this.c.g = m(obtainStyledAttributes, 5);
        fij fijVar2 = this.c;
        if (fijVar2.g == Integer.MIN_VALUE) {
            fijVar2.f = obtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.c.i = m(obtainStyledAttributes, 1);
        fij fijVar3 = this.c;
        if (fijVar3.i == Integer.MIN_VALUE) {
            fijVar3.h = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.c.k = m(obtainStyledAttributes, 6);
        fij fijVar4 = this.c;
        if (fijVar4.k == Integer.MIN_VALUE) {
            fijVar4.j = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.c.m = m(obtainStyledAttributes, 3);
        fij fijVar5 = this.c;
        if (fijVar5.m == Integer.MIN_VALUE) {
            fijVar5.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.c.m = m(obtainStyledAttributes, 3);
        fij fijVar6 = this.c;
        if (fijVar6.m == Integer.MIN_VALUE) {
            fijVar6.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.c.o = m(obtainStyledAttributes, 7);
        fij fijVar7 = this.c;
        if (fijVar7.o == Integer.MIN_VALUE) {
            fijVar7.n = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.c.q = m(obtainStyledAttributes, 4);
        fij fijVar8 = this.c;
        if (fijVar8.q == Integer.MIN_VALUE) {
            fijVar8.p = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.c.s = m(obtainStyledAttributes, 2);
        fij fijVar9 = this.c;
        if (fijVar9.s == Integer.MIN_VALUE) {
            fijVar9.r = obtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.c.v = m(obtainStyledAttributes, 8);
        this.c.u = k(obtainStyledAttributes, 8);
        this.c.y = k(obtainStyledAttributes, 9);
        obtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    break;
                }
            } else if (next == 2) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            setDrawable(drawable);
            this.c.a = drawable.getConstantState();
        } else {
            Drawable drawable2 = d;
            setDrawable(drawable2);
            this.c.a = drawable2.getConstantState();
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
        return super.isStateful() || this.c.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.p = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.s && super.mutate() == this) {
            this.c = new fij(this.c);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.c.a = drawable.getConstantState();
            }
            this.s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        float[] fArr;
        float f2;
        float radius;
        float radius2;
        super.onBoundsChange(rect);
        fij fijVar = this.c;
        if (fijVar.c) {
            fof fofVar = fijVar.t;
            if (fofVar != null) {
                j(fofVar);
                return;
            }
            Drawable drawable = getDrawable();
            fog fogVar = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                radius = outline.getRadius();
                if (radius > 0.0f) {
                    gbw gbwVar = new gbw((byte[]) null);
                    radius2 = outline.getRadius();
                    gbwVar.k(radius2);
                    fogVar = new fog(gbwVar);
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    fArr = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    fArr = null;
                }
                if (fArr != null) {
                    gbw gbwVar2 = new gbw((byte[]) null);
                    gbwVar2.i(Math.min(fArr[0], fArr[1]));
                    gbwVar2.j(Math.min(fArr[2], fArr[3]));
                    gbwVar2.h(Math.min(fArr[4], fArr[5]));
                    gbwVar2.g(Math.min(fArr[6], fArr[7]));
                    fogVar = new fog(gbwVar2);
                } else {
                    try {
                        f2 = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        f2 = -1.0f;
                    }
                    if (f2 > 0.0f) {
                        gbw gbwVar3 = new gbw((byte[]) null);
                        gbwVar3.k(f2);
                        fogVar = new fog(gbwVar3);
                    }
                }
            }
            if (fogVar != null) {
                j(fogVar);
            } else {
                this.o = -1.0f;
                this.k.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        fij fijVar = this.c;
        if (!fijVar.c) {
            this.r = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(fijVar.x, iArr);
        boolean z = this.r != stateSetMatches;
        this.r = stateSetMatches;
        if (z && iArr.length > 0 && !this.q) {
            ObjectAnimator objectAnimator = this.p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.p = null;
            }
            if (stateSetMatches) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f, 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(e);
                ofFloat.addListener(new fii(this));
                this.p = ofFloat;
                ofFloat.start();
            } else {
                this.b = 1.0f;
            }
        }
        this.q = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable() {
        super(null);
        this.g = new Paint(1);
        this.h = new RectF();
        this.i = new Rect();
        this.j = new Path();
        this.k = new Path();
        this.l = new Matrix();
        this.m = foi.a();
        this.o = -1.0f;
        this.b = 1.0f;
        this.r = false;
        this.s = false;
        this.c = new fij(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.g = new Paint(1);
        this.h = new RectF();
        this.i = new Rect();
        this.j = new Path();
        this.k = new Path();
        this.l = new Matrix();
        this.m = foi.a();
        this.o = -1.0f;
        this.b = 1.0f;
        this.r = false;
        this.s = false;
        fij fijVar = new fij(null);
        this.c = fijVar;
        if (drawable != null) {
            fijVar.a = drawable.getConstantState();
        }
        h(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(fij fijVar, Resources resources, fik fikVar) {
        this(fijVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
