package l0;

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

/* renamed from: l0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270p extends AbstractC0261g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3244j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0268n f3245b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3246c;
    public ColorFilter d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3247e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3248f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3249g;
    public final Matrix h;
    public final Rect i;

    public C0270p() {
        this.f3248f = true;
        this.f3249g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        C0268n c0268n = new C0268n();
        c0268n.f3236c = null;
        c0268n.d = f3244j;
        c0268n.f3235b = new C0267m();
        this.f3245b = c0268n;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3201a;
        if (drawable == null) {
            return false;
        }
        D.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3201a;
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
            colorFilter = this.f3246c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3249g;
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
        C0268n c0268n = this.f3245b;
        Bitmap bitmap = c0268n.f3238f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0268n.f3238f.getHeight()) {
            c0268n.f3238f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0268n.f3241k = true;
        }
        if (this.f3248f) {
            C0268n c0268n2 = this.f3245b;
            if (c0268n2.f3241k || c0268n2.f3239g != c0268n2.f3236c || c0268n2.h != c0268n2.d || c0268n2.f3240j != c0268n2.f3237e || c0268n2.i != c0268n2.f3235b.getRootAlpha()) {
                C0268n c0268n3 = this.f3245b;
                c0268n3.f3238f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0268n3.f3238f);
                C0267m c0267m = c0268n3.f3235b;
                c0267m.a(c0267m.f3227g, C0267m.f3221p, canvas2, min, min2);
                C0268n c0268n4 = this.f3245b;
                c0268n4.f3239g = c0268n4.f3236c;
                c0268n4.h = c0268n4.d;
                c0268n4.i = c0268n4.f3235b.getRootAlpha();
                c0268n4.f3240j = c0268n4.f3237e;
                c0268n4.f3241k = false;
            }
        } else {
            C0268n c0268n5 = this.f3245b;
            c0268n5.f3238f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0268n5.f3238f);
            C0267m c0267m2 = c0268n5.f3235b;
            c0267m2.a(c0267m2.f3227g, C0267m.f3221p, canvas3, min, min2);
        }
        C0268n c0268n6 = this.f3245b;
        if (c0268n6.f3235b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0268n6.f3242l == null) {
                Paint paint2 = new Paint();
                c0268n6.f3242l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0268n6.f3242l.setAlpha(c0268n6.f3235b.getRootAlpha());
            c0268n6.f3242l.setColorFilter(colorFilter);
            paint = c0268n6.f3242l;
        }
        canvas.drawBitmap(c0268n6.f3238f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.getAlpha() : this.f3245b.f3235b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3245b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3201a;
        return drawable != null ? D.a.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3201a != null) {
            return new C0269o(this.f3201a.getConstantState());
        }
        this.f3245b.f3234a = getChangingConfigurations();
        return this.f3245b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3245b.f3235b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3245b.f3235b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3245b.f3237e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0268n c0268n = this.f3245b;
            if (c0268n != null) {
                C0267m c0267m = c0268n.f3235b;
                if (c0267m.f3232n == null) {
                    c0267m.f3232n = Boolean.valueOf(c0267m.f3227g.a());
                }
                if (c0267m.f3232n.booleanValue() || ((colorStateList = this.f3245b.f3236c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3247e && super.mutate() == this) {
            C0268n c0268n = this.f3245b;
            C0268n c0268n2 = new C0268n();
            c0268n2.f3236c = null;
            c0268n2.d = f3244j;
            if (c0268n != null) {
                c0268n2.f3234a = c0268n.f3234a;
                C0267m c0267m = new C0267m(c0268n.f3235b);
                c0268n2.f3235b = c0267m;
                if (c0268n.f3235b.f3225e != null) {
                    c0267m.f3225e = new Paint(c0268n.f3235b.f3225e);
                }
                if (c0268n.f3235b.d != null) {
                    c0268n2.f3235b.d = new Paint(c0268n.f3235b.d);
                }
                c0268n2.f3236c = c0268n.f3236c;
                c0268n2.d = c0268n.d;
                c0268n2.f3237e = c0268n.f3237e;
            }
            this.f3245b = c0268n2;
            this.f3247e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0268n c0268n = this.f3245b;
        ColorStateList colorStateList = c0268n.f3236c;
        if (colorStateList == null || (mode = c0268n.d) == null) {
            z2 = false;
        } else {
            this.f3246c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0267m c0267m = c0268n.f3235b;
        if (c0267m.f3232n == null) {
            c0267m.f3232n = Boolean.valueOf(c0267m.f3227g.a());
        }
        if (c0267m.f3232n.booleanValue()) {
            boolean b2 = c0268n.f3235b.f3227g.b(iArr);
            c0268n.f3241k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3245b.f3235b.getRootAlpha() != i) {
            this.f3245b.f3235b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3245b.f3237e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            s1.d.i0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
            return;
        }
        C0268n c0268n = this.f3245b;
        if (c0268n.f3236c != colorStateList) {
            c0268n.f3236c = colorStateList;
            this.f3246c = a(colorStateList, c0268n.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            D.a.i(drawable, mode);
            return;
        }
        C0268n c0268n = this.f3245b;
        if (c0268n.d != mode) {
            c0268n.d = mode;
            this.f3246c = a(c0268n.f3236c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3201a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0267m c0267m;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f3201a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0268n c0268n = this.f3245b;
        c0268n.f3235b = new C0267m();
        TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0255a.f3186a);
        C0268n c0268n2 = this.f3245b;
        C0267m c0267m2 = c0268n2.f3235b;
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
        c0268n2.d = mode;
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
                ThreadLocal threadLocal = B.c.f11a;
                try {
                    colorStateList = B.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0268n2.f3236c = colorStateList2;
        }
        boolean z5 = c0268n2.f3237e;
        if (B.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        c0268n2.f3237e = z5;
        float f3 = c0267m2.f3228j;
        if (B.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        c0267m2.f3228j = f3;
        float f4 = c0267m2.f3229k;
        if (B.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        c0267m2.f3229k = f4;
        if (c0267m2.f3228j <= 0.0f) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > 0.0f) {
            c0267m2.h = f2.getDimension(3, c0267m2.h);
            float dimension = f2.getDimension(2, c0267m2.i);
            c0267m2.i = dimension;
            if (c0267m2.h <= 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c0267m2.getAlpha();
                if (B.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                c0267m2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    c0267m2.f3231m = string;
                    c0267m2.f3233o.put(string, c0267m2);
                }
                f2.recycle();
                c0268n.f3234a = getChangingConfigurations();
                c0268n.f3241k = true;
                C0268n c0268n3 = this.f3245b;
                C0267m c0267m3 = c0268n3.f3235b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0267m3.f3227g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0264j c0264j = (C0264j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        o.b bVar = c0267m3.f3233o;
                        if (equals) {
                            C0263i c0263i = new C0263i();
                            c0263i.f3202e = 0.0f;
                            c0263i.f3204g = 1.0f;
                            c0263i.h = 1.0f;
                            c0263i.i = 0.0f;
                            c0263i.f3205j = 1.0f;
                            c0263i.f3206k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0263i.f3207l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c0263i.f3208m = join3;
                            c0267m = c0267m3;
                            c0263i.f3209n = 4.0f;
                            TypedArray f5 = B.b.f(resources, theme, attributeSet, AbstractC0255a.f3188c);
                            if (B.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    c0263i.f3219b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    c0263i.f3218a = s1.l.t(string3);
                                }
                                c0263i.f3203f = B.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = c0263i.h;
                                if (B.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                c0263i.h = f6;
                                int i8 = !B.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = c0263i.f3207l;
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
                                c0263i.f3207l = cap;
                                int i9 = !B.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = c0263i.f3208m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c0263i.f3208m = join2;
                                float f7 = c0263i.f3209n;
                                if (B.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                c0263i.f3209n = f7;
                                c0263i.d = B.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = c0263i.f3204g;
                                if (B.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                c0263i.f3204g = f8;
                                float f9 = c0263i.f3202e;
                                if (B.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                c0263i.f3202e = f9;
                                float f10 = c0263i.f3205j;
                                if (B.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                c0263i.f3205j = f10;
                                float f11 = c0263i.f3206k;
                                if (B.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                c0263i.f3206k = f11;
                                float f12 = c0263i.i;
                                if (B.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                c0263i.i = f12;
                                int i10 = c0263i.f3220c;
                                if (B.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                c0263i.f3220c = i10;
                            }
                            f5.recycle();
                            c0264j.f3211b.add(c0263i);
                            if (c0263i.getPathName() != null) {
                                bVar.put(c0263i.getPathName(), c0263i);
                            }
                            c0268n3.f3234a = c0268n3.f3234a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            c0267m = c0267m3;
                            if ("clip-path".equals(name)) {
                                C0262h c0262h = new C0262h();
                                if (B.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = B.b.f(resources, theme, attributeSet, AbstractC0255a.d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        c0262h.f3219b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        c0262h.f3218a = s1.l.t(string5);
                                    }
                                    c0262h.f3220c = !B.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                c0264j.f3211b.add(c0262h);
                                if (c0262h.getPathName() != null) {
                                    bVar.put(c0262h.getPathName(), c0262h);
                                }
                                c0268n3.f3234a = c0268n3.f3234a;
                            } else if ("group".equals(name)) {
                                C0264j c0264j2 = new C0264j();
                                TypedArray f14 = B.b.f(resources, theme, attributeSet, AbstractC0255a.f3187b);
                                float f15 = c0264j2.f3212c;
                                if (B.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                c0264j2.f3212c = f15;
                                i2 = 1;
                                c0264j2.d = f14.getFloat(1, c0264j2.d);
                                c0264j2.f3213e = f14.getFloat(2, c0264j2.f3213e);
                                float f16 = c0264j2.f3214f;
                                if (B.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                c0264j2.f3214f = f16;
                                float f17 = c0264j2.f3215g;
                                if (B.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                c0264j2.f3215g = f17;
                                float f18 = c0264j2.h;
                                if (B.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                c0264j2.h = f18;
                                float f19 = c0264j2.i;
                                if (B.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                c0264j2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    c0264j2.f3217k = string6;
                                }
                                c0264j2.c();
                                f14.recycle();
                                c0264j.f3211b.add(c0264j2);
                                arrayDeque.push(c0264j2);
                                if (c0264j2.getGroupName() != null) {
                                    bVar.put(c0264j2.getGroupName(), c0264j2);
                                }
                                c0268n3.f3234a = c0268n3.f3234a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        c0267m = c0267m3;
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
                    c0267m3 = c0267m;
                }
                if (!z6) {
                    this.f3246c = a(c0268n.f3236c, c0268n.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0270p(C0268n c0268n) {
        this.f3248f = true;
        this.f3249g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f3245b = c0268n;
        this.f3246c = a(c0268n.f3236c, c0268n.d);
    }
}
