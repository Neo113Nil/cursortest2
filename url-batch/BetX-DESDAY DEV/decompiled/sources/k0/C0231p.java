package k0;

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

/* renamed from: k0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231p extends AbstractC0222g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3199j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0229n f3200b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3201c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f3202d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3203e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3204f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3205g;
    public final Matrix h;
    public final Rect i;

    public C0231p() {
        this.f3204f = true;
        this.f3205g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        C0229n c0229n = new C0229n();
        c0229n.f3190c = null;
        c0229n.f3191d = f3199j;
        c0229n.f3189b = new C0228m();
        this.f3200b = c0229n;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3152a;
        if (drawable == null) {
            return false;
        }
        D.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3202d;
        if (colorFilter == null) {
            colorFilter = this.f3201c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3205g;
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
        C0229n c0229n = this.f3200b;
        Bitmap bitmap = c0229n.f3193f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0229n.f3193f.getHeight()) {
            c0229n.f3193f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0229n.f3196k = true;
        }
        if (this.f3204f) {
            C0229n c0229n2 = this.f3200b;
            if (c0229n2.f3196k || c0229n2.f3194g != c0229n2.f3190c || c0229n2.h != c0229n2.f3191d || c0229n2.f3195j != c0229n2.f3192e || c0229n2.i != c0229n2.f3189b.getRootAlpha()) {
                C0229n c0229n3 = this.f3200b;
                c0229n3.f3193f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0229n3.f3193f);
                C0228m c0228m = c0229n3.f3189b;
                c0228m.a(c0228m.f3181g, C0228m.f3174p, canvas2, min, min2);
                C0229n c0229n4 = this.f3200b;
                c0229n4.f3194g = c0229n4.f3190c;
                c0229n4.h = c0229n4.f3191d;
                c0229n4.i = c0229n4.f3189b.getRootAlpha();
                c0229n4.f3195j = c0229n4.f3192e;
                c0229n4.f3196k = false;
            }
        } else {
            C0229n c0229n5 = this.f3200b;
            c0229n5.f3193f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0229n5.f3193f);
            C0228m c0228m2 = c0229n5.f3189b;
            c0228m2.a(c0228m2.f3181g, C0228m.f3174p, canvas3, min, min2);
        }
        C0229n c0229n6 = this.f3200b;
        if (c0229n6.f3189b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0229n6.f3197l == null) {
                Paint paint2 = new Paint();
                c0229n6.f3197l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0229n6.f3197l.setAlpha(c0229n6.f3189b.getRootAlpha());
            c0229n6.f3197l.setColorFilter(colorFilter);
            paint = c0229n6.f3197l;
        }
        canvas.drawBitmap(c0229n6.f3193f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.getAlpha() : this.f3200b.f3189b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3200b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3152a;
        return drawable != null ? D.a.c(drawable) : this.f3202d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3152a != null) {
            return new C0230o(this.f3152a.getConstantState());
        }
        this.f3200b.f3188a = getChangingConfigurations();
        return this.f3200b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3200b.f3189b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3200b.f3189b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3200b.f3192e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0229n c0229n = this.f3200b;
            if (c0229n != null) {
                C0228m c0228m = c0229n.f3189b;
                if (c0228m.f3186n == null) {
                    c0228m.f3186n = Boolean.valueOf(c0228m.f3181g.a());
                }
                if (c0228m.f3186n.booleanValue() || ((colorStateList = this.f3200b.f3190c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3203e && super.mutate() == this) {
            C0229n c0229n = this.f3200b;
            C0229n c0229n2 = new C0229n();
            c0229n2.f3190c = null;
            c0229n2.f3191d = f3199j;
            if (c0229n != null) {
                c0229n2.f3188a = c0229n.f3188a;
                C0228m c0228m = new C0228m(c0229n.f3189b);
                c0229n2.f3189b = c0228m;
                if (c0229n.f3189b.f3179e != null) {
                    c0228m.f3179e = new Paint(c0229n.f3189b.f3179e);
                }
                if (c0229n.f3189b.f3178d != null) {
                    c0229n2.f3189b.f3178d = new Paint(c0229n.f3189b.f3178d);
                }
                c0229n2.f3190c = c0229n.f3190c;
                c0229n2.f3191d = c0229n.f3191d;
                c0229n2.f3192e = c0229n.f3192e;
            }
            this.f3200b = c0229n2;
            this.f3203e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0229n c0229n = this.f3200b;
        ColorStateList colorStateList = c0229n.f3190c;
        if (colorStateList == null || (mode = c0229n.f3191d) == null) {
            z2 = false;
        } else {
            this.f3201c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0228m c0228m = c0229n.f3189b;
        if (c0228m.f3186n == null) {
            c0228m.f3186n = Boolean.valueOf(c0228m.f3181g.a());
        }
        if (c0228m.f3186n.booleanValue()) {
            boolean b2 = c0229n.f3189b.f3181g.b(iArr);
            c0229n.f3196k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3200b.f3189b.getRootAlpha() != i) {
            this.f3200b.f3189b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3200b.f3192e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3202d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            q1.d.X(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
            return;
        }
        C0229n c0229n = this.f3200b;
        if (c0229n.f3190c != colorStateList) {
            c0229n.f3190c = colorStateList;
            this.f3201c = a(colorStateList, c0229n.f3191d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            D.a.i(drawable, mode);
            return;
        }
        C0229n c0229n = this.f3200b;
        if (c0229n.f3191d != mode) {
            c0229n.f3191d = mode;
            this.f3201c = a(c0229n.f3190c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3152a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0228m c0228m;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f3152a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0229n c0229n = this.f3200b;
        c0229n.f3189b = new C0228m();
        TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0216a.f3134a);
        C0229n c0229n2 = this.f3200b;
        C0228m c0228m2 = c0229n2.f3189b;
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
        c0229n2.f3191d = mode;
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
                ThreadLocal threadLocal = B.c.f19a;
                try {
                    colorStateList = B.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0229n2.f3190c = colorStateList2;
        }
        boolean z5 = c0229n2.f3192e;
        if (B.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        c0229n2.f3192e = z5;
        float f3 = c0228m2.f3182j;
        if (B.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        c0228m2.f3182j = f3;
        float f4 = c0228m2.f3183k;
        if (B.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        c0228m2.f3183k = f4;
        if (c0228m2.f3182j <= 0.0f) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > 0.0f) {
            c0228m2.h = f2.getDimension(3, c0228m2.h);
            float dimension = f2.getDimension(2, c0228m2.i);
            c0228m2.i = dimension;
            if (c0228m2.h <= 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c0228m2.getAlpha();
                if (B.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                c0228m2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    c0228m2.f3185m = string;
                    c0228m2.f3187o.put(string, c0228m2);
                }
                f2.recycle();
                c0229n.f3188a = getChangingConfigurations();
                c0229n.f3196k = true;
                C0229n c0229n3 = this.f3200b;
                C0228m c0228m3 = c0229n3.f3189b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0228m3.f3181g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0225j c0225j = (C0225j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        o.b bVar = c0228m3.f3187o;
                        if (equals) {
                            C0224i c0224i = new C0224i();
                            c0224i.f3154e = 0.0f;
                            c0224i.f3156g = 1.0f;
                            c0224i.h = 1.0f;
                            c0224i.i = 0.0f;
                            c0224i.f3157j = 1.0f;
                            c0224i.f3158k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0224i.f3159l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c0224i.f3160m = join3;
                            c0228m = c0228m3;
                            c0224i.f3161n = 4.0f;
                            TypedArray f5 = B.b.f(resources, theme, attributeSet, AbstractC0216a.f3136c);
                            if (B.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    c0224i.f3172b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    c0224i.f3171a = q1.d.s(string3);
                                }
                                c0224i.f3155f = B.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = c0224i.h;
                                if (B.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                c0224i.h = f6;
                                int i8 = !B.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = c0224i.f3159l;
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
                                c0224i.f3159l = cap;
                                int i9 = !B.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = c0224i.f3160m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c0224i.f3160m = join2;
                                float f7 = c0224i.f3161n;
                                if (B.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                c0224i.f3161n = f7;
                                c0224i.f3153d = B.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = c0224i.f3156g;
                                if (B.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                c0224i.f3156g = f8;
                                float f9 = c0224i.f3154e;
                                if (B.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                c0224i.f3154e = f9;
                                float f10 = c0224i.f3157j;
                                if (B.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                c0224i.f3157j = f10;
                                float f11 = c0224i.f3158k;
                                if (B.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                c0224i.f3158k = f11;
                                float f12 = c0224i.i;
                                if (B.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                c0224i.i = f12;
                                int i10 = c0224i.f3173c;
                                if (B.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                c0224i.f3173c = i10;
                            }
                            f5.recycle();
                            c0225j.f3163b.add(c0224i);
                            if (c0224i.getPathName() != null) {
                                bVar.put(c0224i.getPathName(), c0224i);
                            }
                            c0229n3.f3188a = c0229n3.f3188a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            c0228m = c0228m3;
                            if ("clip-path".equals(name)) {
                                C0223h c0223h = new C0223h();
                                if (B.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = B.b.f(resources, theme, attributeSet, AbstractC0216a.f3137d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        c0223h.f3172b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        c0223h.f3171a = q1.d.s(string5);
                                    }
                                    c0223h.f3173c = !B.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                c0225j.f3163b.add(c0223h);
                                if (c0223h.getPathName() != null) {
                                    bVar.put(c0223h.getPathName(), c0223h);
                                }
                                c0229n3.f3188a = c0229n3.f3188a;
                            } else if ("group".equals(name)) {
                                C0225j c0225j2 = new C0225j();
                                TypedArray f14 = B.b.f(resources, theme, attributeSet, AbstractC0216a.f3135b);
                                float f15 = c0225j2.f3164c;
                                if (B.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                c0225j2.f3164c = f15;
                                i2 = 1;
                                c0225j2.f3165d = f14.getFloat(1, c0225j2.f3165d);
                                c0225j2.f3166e = f14.getFloat(2, c0225j2.f3166e);
                                float f16 = c0225j2.f3167f;
                                if (B.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                c0225j2.f3167f = f16;
                                float f17 = c0225j2.f3168g;
                                if (B.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                c0225j2.f3168g = f17;
                                float f18 = c0225j2.h;
                                if (B.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                c0225j2.h = f18;
                                float f19 = c0225j2.i;
                                if (B.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                c0225j2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    c0225j2.f3170k = string6;
                                }
                                c0225j2.c();
                                f14.recycle();
                                c0225j.f3163b.add(c0225j2);
                                arrayDeque.push(c0225j2);
                                if (c0225j2.getGroupName() != null) {
                                    bVar.put(c0225j2.getGroupName(), c0225j2);
                                }
                                c0229n3.f3188a = c0229n3.f3188a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        c0228m = c0228m3;
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
                    c0228m3 = c0228m;
                }
                if (!z6) {
                    this.f3201c = a(c0229n.f3190c, c0229n.f3191d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0231p(C0229n c0229n) {
        this.f3204f = true;
        this.f3205g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f3200b = c0229n;
        this.f3201c = a(c0229n.f3190c, c0229n.f3191d);
    }
}
