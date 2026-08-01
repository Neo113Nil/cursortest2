package o0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281p extends AbstractC0272g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3299j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0279n f3300b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3301c;
    public ColorFilter d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3302e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3303f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3304g;
    public final Matrix h;
    public final Rect i;

    public C0281p() {
        this.f3303f = true;
        this.f3304g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        C0279n c0279n = new C0279n();
        c0279n.f3291c = null;
        c0279n.d = f3299j;
        c0279n.f3290b = new C0278m();
        this.f3300b = c0279n;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3256a;
        if (drawable == null) {
            return false;
        }
        D.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.f3301c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3304g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && D.b.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0279n c0279n = this.f3300b;
        Bitmap bitmap = c0279n.f3293f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0279n.f3293f.getHeight()) {
            c0279n.f3293f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0279n.f3296k = true;
        }
        if (this.f3303f) {
            C0279n c0279n2 = this.f3300b;
            if (c0279n2.f3296k || c0279n2.f3294g != c0279n2.f3291c || c0279n2.h != c0279n2.d || c0279n2.f3295j != c0279n2.f3292e || c0279n2.i != c0279n2.f3290b.getRootAlpha()) {
                C0279n c0279n3 = this.f3300b;
                c0279n3.f3293f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0279n3.f3293f);
                C0278m c0278m = c0279n3.f3290b;
                c0278m.a(c0278m.f3282g, C0278m.f3276p, canvas2, min, min2);
                C0279n c0279n4 = this.f3300b;
                c0279n4.f3294g = c0279n4.f3291c;
                c0279n4.h = c0279n4.d;
                c0279n4.i = c0279n4.f3290b.getRootAlpha();
                c0279n4.f3295j = c0279n4.f3292e;
                c0279n4.f3296k = false;
            }
        } else {
            C0279n c0279n5 = this.f3300b;
            c0279n5.f3293f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0279n5.f3293f);
            C0278m c0278m2 = c0279n5.f3290b;
            c0278m2.a(c0278m2.f3282g, C0278m.f3276p, canvas3, min, min2);
        }
        C0279n c0279n6 = this.f3300b;
        if (c0279n6.f3290b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0279n6.f3297l == null) {
                Paint paint2 = new Paint();
                c0279n6.f3297l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0279n6.f3297l.setAlpha(c0279n6.f3290b.getRootAlpha());
            c0279n6.f3297l.setColorFilter(colorFilter);
            paint = c0279n6.f3297l;
        }
        canvas.drawBitmap(c0279n6.f3293f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.getAlpha() : this.f3300b.f3290b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3300b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3256a;
        return drawable != null ? D.a.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3256a != null) {
            return new C0280o(this.f3256a.getConstantState());
        }
        this.f3300b.f3289a = getChangingConfigurations();
        return this.f3300b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3300b.f3290b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3300b.f3290b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3300b.f3292e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0279n c0279n = this.f3300b;
            if (c0279n != null) {
                C0278m c0278m = c0279n.f3290b;
                if (c0278m.f3287n == null) {
                    c0278m.f3287n = Boolean.valueOf(c0278m.f3282g.a());
                }
                if (c0278m.f3287n.booleanValue() || ((colorStateList = this.f3300b.f3291c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3302e && super.mutate() == this) {
            C0279n c0279n = this.f3300b;
            C0279n c0279n2 = new C0279n();
            c0279n2.f3291c = null;
            c0279n2.d = f3299j;
            if (c0279n != null) {
                c0279n2.f3289a = c0279n.f3289a;
                C0278m c0278m = new C0278m(c0279n.f3290b);
                c0279n2.f3290b = c0278m;
                if (c0279n.f3290b.f3280e != null) {
                    c0278m.f3280e = new Paint(c0279n.f3290b.f3280e);
                }
                if (c0279n.f3290b.d != null) {
                    c0279n2.f3290b.d = new Paint(c0279n.f3290b.d);
                }
                c0279n2.f3291c = c0279n.f3291c;
                c0279n2.d = c0279n.d;
                c0279n2.f3292e = c0279n.f3292e;
            }
            this.f3300b = c0279n2;
            this.f3302e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0279n c0279n = this.f3300b;
        ColorStateList colorStateList = c0279n.f3291c;
        if (colorStateList == null || (mode = c0279n.d) == null) {
            z2 = false;
        } else {
            this.f3301c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0278m c0278m = c0279n.f3290b;
        if (c0278m.f3287n == null) {
            c0278m.f3287n = Boolean.valueOf(c0278m.f3282g.a());
        }
        if (c0278m.f3287n.booleanValue()) {
            boolean b2 = c0279n.f3290b.f3282g.b(iArr);
            c0279n.f3296k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3300b.f3290b.getRootAlpha() != i) {
            this.f3300b.f3290b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3300b.f3292e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            A.c.H0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
            return;
        }
        C0279n c0279n = this.f3300b;
        if (c0279n.f3291c != colorStateList) {
            c0279n.f3291c = colorStateList;
            this.f3301c = a(colorStateList, c0279n.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            D.a.i(drawable, mode);
            return;
        }
        C0279n c0279n = this.f3300b;
        if (c0279n.d != mode) {
            c0279n.d = mode;
            this.f3301c = a(c0279n.f3291c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3256a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0278m c0278m;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f3256a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0279n c0279n = this.f3300b;
        c0279n.f3290b = new C0278m();
        TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0266a.f3241a);
        C0279n c0279n2 = this.f3300b;
        C0278m c0278m2 = c0279n2.f3290b;
        int i4 = !B.b.c(xmlPullParser, "tintMode") ? -1 : f2.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i5 = 3;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c0279n2.d = mode;
        int i6 = 1;
        ColorStateList colorStateList = null;
        boolean z4 = false;
        if (B.b.c(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            f2.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i7 >= 28 && i7 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f2.getResources();
                int resourceId = f2.getResourceId(1, 0);
                ThreadLocal threadLocal = B.c.f42a;
                try {
                    colorStateList = B.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0279n2.f3291c = colorStateList2;
        }
        boolean z5 = c0279n2.f3292e;
        if (B.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        c0279n2.f3292e = z5;
        float f3 = c0278m2.f3283j;
        if (B.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        c0278m2.f3283j = f3;
        float f4 = c0278m2.f3284k;
        if (B.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        c0278m2.f3284k = f4;
        if (c0278m2.f3283j <= 0.0f) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > 0.0f) {
            c0278m2.h = f2.getDimension(3, c0278m2.h);
            float dimension = f2.getDimension(2, c0278m2.i);
            c0278m2.i = dimension;
            if (c0278m2.h <= 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c0278m2.getAlpha();
                if (B.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                c0278m2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    c0278m2.f3286m = string;
                    c0278m2.f3288o.put(string, c0278m2);
                }
                f2.recycle();
                c0279n.f3289a = getChangingConfigurations();
                c0279n.f3296k = true;
                C0279n c0279n3 = this.f3300b;
                C0278m c0278m3 = c0279n3.f3290b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0278m3.f3282g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0275j c0275j = (C0275j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        o.b bVar = c0278m3.f3288o;
                        if (equals) {
                            C0274i c0274i = new C0274i();
                            c0274i.f3257e = 0.0f;
                            c0274i.f3259g = 1.0f;
                            c0274i.h = 1.0f;
                            c0274i.i = 0.0f;
                            c0274i.f3260j = 1.0f;
                            c0274i.f3261k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0274i.f3262l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c0274i.f3263m = join3;
                            c0278m = c0278m3;
                            c0274i.f3264n = 4.0f;
                            TypedArray f5 = B.b.f(resources, theme, attributeSet, AbstractC0266a.f3243c);
                            if (B.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    c0274i.f3274b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    c0274i.f3273a = A.c.y(string3);
                                }
                                c0274i.f3258f = B.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = c0274i.h;
                                if (B.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                c0274i.h = f6;
                                int i8 = !B.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = c0274i.f3262l;
                                if (i8 != 0) {
                                    join = join3;
                                    if (i8 != 1) {
                                        cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                c0274i.f3262l = cap;
                                int i9 = !B.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = c0274i.f3263m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c0274i.f3263m = join2;
                                float f7 = c0274i.f3264n;
                                if (B.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                c0274i.f3264n = f7;
                                c0274i.d = B.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = c0274i.f3259g;
                                if (B.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                c0274i.f3259g = f8;
                                float f9 = c0274i.f3257e;
                                if (B.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                c0274i.f3257e = f9;
                                float f10 = c0274i.f3260j;
                                if (B.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                c0274i.f3260j = f10;
                                float f11 = c0274i.f3261k;
                                if (B.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                c0274i.f3261k = f11;
                                float f12 = c0274i.i;
                                if (B.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                c0274i.i = f12;
                                int i10 = c0274i.f3275c;
                                if (B.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                c0274i.f3275c = i10;
                            }
                            f5.recycle();
                            c0275j.f3266b.add(c0274i);
                            if (c0274i.getPathName() != null) {
                                bVar.put(c0274i.getPathName(), c0274i);
                            }
                            c0279n3.f3289a = c0279n3.f3289a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            c0278m = c0278m3;
                            if ("clip-path".equals(name)) {
                                C0273h c0273h = new C0273h();
                                if (B.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = B.b.f(resources, theme, attributeSet, AbstractC0266a.d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        c0273h.f3274b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        c0273h.f3273a = A.c.y(string5);
                                    }
                                    c0273h.f3275c = !B.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                c0275j.f3266b.add(c0273h);
                                if (c0273h.getPathName() != null) {
                                    bVar.put(c0273h.getPathName(), c0273h);
                                }
                                c0279n3.f3289a = c0279n3.f3289a;
                            } else if ("group".equals(name)) {
                                C0275j c0275j2 = new C0275j();
                                TypedArray f14 = B.b.f(resources, theme, attributeSet, AbstractC0266a.f3242b);
                                float f15 = c0275j2.f3267c;
                                if (B.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                c0275j2.f3267c = f15;
                                i2 = 1;
                                c0275j2.d = f14.getFloat(1, c0275j2.d);
                                c0275j2.f3268e = f14.getFloat(2, c0275j2.f3268e);
                                float f16 = c0275j2.f3269f;
                                if (B.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                c0275j2.f3269f = f16;
                                float f17 = c0275j2.f3270g;
                                if (B.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                c0275j2.f3270g = f17;
                                float f18 = c0275j2.h;
                                if (B.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                c0275j2.h = f18;
                                float f19 = c0275j2.i;
                                if (B.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                c0275j2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    c0275j2.f3272k = string6;
                                }
                                c0275j2.c();
                                f14.recycle();
                                c0275j.f3266b.add(c0275j2);
                                arrayDeque.push(c0275j2);
                                if (c0275j2.getGroupName() != null) {
                                    bVar.put(c0275j2.getGroupName(), c0275j2);
                                }
                                c0279n3.f3289a = c0279n3.f3289a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        c0278m = c0278m3;
                        i = depth;
                        i2 = i6;
                        z2 = z4;
                        i3 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i3;
                    z4 = z2;
                    i6 = i2;
                    depth = i;
                    c0278m3 = c0278m;
                }
                if (!z6) {
                    this.f3301c = a(c0279n.f3291c, c0279n.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0281p(C0279n c0279n) {
        this.f3303f = true;
        this.f3304g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f3300b = c0279n;
        this.f3301c = a(c0279n.f3291c, c0279n.d);
    }
}
