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
public final class C0272p extends AbstractC0263g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3153j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0270n f3154b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3155c;
    public ColorFilter d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3156e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3157f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3158g;
    public final Matrix h;
    public final Rect i;

    public C0272p() {
        this.f3157f = true;
        this.f3158g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        C0270n c0270n = new C0270n();
        c0270n.f3145c = null;
        c0270n.d = f3153j;
        c0270n.f3144b = new C0269m();
        this.f3154b = c0270n;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3110a;
        if (drawable == null) {
            return false;
        }
        D.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3110a;
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
            colorFilter = this.f3155c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3158g;
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
        C0270n c0270n = this.f3154b;
        Bitmap bitmap = c0270n.f3147f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0270n.f3147f.getHeight()) {
            c0270n.f3147f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0270n.f3150k = true;
        }
        if (this.f3157f) {
            C0270n c0270n2 = this.f3154b;
            if (c0270n2.f3150k || c0270n2.f3148g != c0270n2.f3145c || c0270n2.h != c0270n2.d || c0270n2.f3149j != c0270n2.f3146e || c0270n2.i != c0270n2.f3144b.getRootAlpha()) {
                C0270n c0270n3 = this.f3154b;
                c0270n3.f3147f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0270n3.f3147f);
                C0269m c0269m = c0270n3.f3144b;
                c0269m.a(c0269m.f3136g, C0269m.f3130p, canvas2, min, min2);
                C0270n c0270n4 = this.f3154b;
                c0270n4.f3148g = c0270n4.f3145c;
                c0270n4.h = c0270n4.d;
                c0270n4.i = c0270n4.f3144b.getRootAlpha();
                c0270n4.f3149j = c0270n4.f3146e;
                c0270n4.f3150k = false;
            }
        } else {
            C0270n c0270n5 = this.f3154b;
            c0270n5.f3147f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0270n5.f3147f);
            C0269m c0269m2 = c0270n5.f3144b;
            c0269m2.a(c0269m2.f3136g, C0269m.f3130p, canvas3, min, min2);
        }
        C0270n c0270n6 = this.f3154b;
        if (c0270n6.f3144b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0270n6.f3151l == null) {
                Paint paint2 = new Paint();
                c0270n6.f3151l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0270n6.f3151l.setAlpha(c0270n6.f3144b.getRootAlpha());
            c0270n6.f3151l.setColorFilter(colorFilter);
            paint = c0270n6.f3151l;
        }
        canvas.drawBitmap(c0270n6.f3147f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.getAlpha() : this.f3154b.f3144b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3154b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3110a;
        return drawable != null ? D.a.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3110a != null) {
            return new C0271o(this.f3110a.getConstantState());
        }
        this.f3154b.f3143a = getChangingConfigurations();
        return this.f3154b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3154b.f3144b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3154b.f3144b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3154b.f3146e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0270n c0270n = this.f3154b;
            if (c0270n != null) {
                C0269m c0269m = c0270n.f3144b;
                if (c0269m.f3141n == null) {
                    c0269m.f3141n = Boolean.valueOf(c0269m.f3136g.a());
                }
                if (c0269m.f3141n.booleanValue() || ((colorStateList = this.f3154b.f3145c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3156e && super.mutate() == this) {
            C0270n c0270n = this.f3154b;
            C0270n c0270n2 = new C0270n();
            c0270n2.f3145c = null;
            c0270n2.d = f3153j;
            if (c0270n != null) {
                c0270n2.f3143a = c0270n.f3143a;
                C0269m c0269m = new C0269m(c0270n.f3144b);
                c0270n2.f3144b = c0269m;
                if (c0270n.f3144b.f3134e != null) {
                    c0269m.f3134e = new Paint(c0270n.f3144b.f3134e);
                }
                if (c0270n.f3144b.d != null) {
                    c0270n2.f3144b.d = new Paint(c0270n.f3144b.d);
                }
                c0270n2.f3145c = c0270n.f3145c;
                c0270n2.d = c0270n.d;
                c0270n2.f3146e = c0270n.f3146e;
            }
            this.f3154b = c0270n2;
            this.f3156e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0270n c0270n = this.f3154b;
        ColorStateList colorStateList = c0270n.f3145c;
        if (colorStateList == null || (mode = c0270n.d) == null) {
            z2 = false;
        } else {
            this.f3155c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0269m c0269m = c0270n.f3144b;
        if (c0269m.f3141n == null) {
            c0269m.f3141n = Boolean.valueOf(c0269m.f3136g.a());
        }
        if (c0269m.f3141n.booleanValue()) {
            boolean b2 = c0270n.f3144b.f3136g.b(iArr);
            c0270n.f3150k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3154b.f3144b.getRootAlpha() != i) {
            this.f3154b.f3144b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3154b.f3146e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            x1.l.d0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
            return;
        }
        C0270n c0270n = this.f3154b;
        if (c0270n.f3145c != colorStateList) {
            c0270n.f3145c = colorStateList;
            this.f3155c = a(colorStateList, c0270n.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            D.a.i(drawable, mode);
            return;
        }
        C0270n c0270n = this.f3154b;
        if (c0270n.d != mode) {
            c0270n.d = mode;
            this.f3155c = a(c0270n.f3145c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3110a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0269m c0269m;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f3110a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0270n c0270n = this.f3154b;
        c0270n.f3144b = new C0269m();
        TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0257a.f3095a);
        C0270n c0270n2 = this.f3154b;
        C0269m c0269m2 = c0270n2.f3144b;
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
        c0270n2.d = mode;
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
            c0270n2.f3145c = colorStateList2;
        }
        boolean z5 = c0270n2.f3146e;
        if (B.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        c0270n2.f3146e = z5;
        float f3 = c0269m2.f3137j;
        if (B.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        c0269m2.f3137j = f3;
        float f4 = c0269m2.f3138k;
        if (B.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        c0269m2.f3138k = f4;
        if (c0269m2.f3137j <= 0.0f) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > 0.0f) {
            c0269m2.h = f2.getDimension(3, c0269m2.h);
            float dimension = f2.getDimension(2, c0269m2.i);
            c0269m2.i = dimension;
            if (c0269m2.h <= 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c0269m2.getAlpha();
                if (B.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                c0269m2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    c0269m2.f3140m = string;
                    c0269m2.f3142o.put(string, c0269m2);
                }
                f2.recycle();
                c0270n.f3143a = getChangingConfigurations();
                c0270n.f3150k = true;
                C0270n c0270n3 = this.f3154b;
                C0269m c0269m3 = c0270n3.f3144b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0269m3.f3136g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0266j c0266j = (C0266j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        o.b bVar = c0269m3.f3142o;
                        if (equals) {
                            C0265i c0265i = new C0265i();
                            c0265i.f3111e = 0.0f;
                            c0265i.f3113g = 1.0f;
                            c0265i.h = 1.0f;
                            c0265i.i = 0.0f;
                            c0265i.f3114j = 1.0f;
                            c0265i.f3115k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0265i.f3116l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c0265i.f3117m = join3;
                            c0269m = c0269m3;
                            c0265i.f3118n = 4.0f;
                            TypedArray f5 = B.b.f(resources, theme, attributeSet, AbstractC0257a.f3097c);
                            if (B.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    c0265i.f3128b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    c0265i.f3127a = x1.d.t(string3);
                                }
                                c0265i.f3112f = B.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = c0265i.h;
                                if (B.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                c0265i.h = f6;
                                int i8 = !B.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = c0265i.f3116l;
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
                                c0265i.f3116l = cap;
                                int i9 = !B.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = c0265i.f3117m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c0265i.f3117m = join2;
                                float f7 = c0265i.f3118n;
                                if (B.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                c0265i.f3118n = f7;
                                c0265i.d = B.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = c0265i.f3113g;
                                if (B.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                c0265i.f3113g = f8;
                                float f9 = c0265i.f3111e;
                                if (B.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                c0265i.f3111e = f9;
                                float f10 = c0265i.f3114j;
                                if (B.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                c0265i.f3114j = f10;
                                float f11 = c0265i.f3115k;
                                if (B.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                c0265i.f3115k = f11;
                                float f12 = c0265i.i;
                                if (B.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                c0265i.i = f12;
                                int i10 = c0265i.f3129c;
                                if (B.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                c0265i.f3129c = i10;
                            }
                            f5.recycle();
                            c0266j.f3120b.add(c0265i);
                            if (c0265i.getPathName() != null) {
                                bVar.put(c0265i.getPathName(), c0265i);
                            }
                            c0270n3.f3143a = c0270n3.f3143a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            c0269m = c0269m3;
                            if ("clip-path".equals(name)) {
                                C0264h c0264h = new C0264h();
                                if (B.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = B.b.f(resources, theme, attributeSet, AbstractC0257a.d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        c0264h.f3128b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        c0264h.f3127a = x1.d.t(string5);
                                    }
                                    c0264h.f3129c = !B.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                c0266j.f3120b.add(c0264h);
                                if (c0264h.getPathName() != null) {
                                    bVar.put(c0264h.getPathName(), c0264h);
                                }
                                c0270n3.f3143a = c0270n3.f3143a;
                            } else if ("group".equals(name)) {
                                C0266j c0266j2 = new C0266j();
                                TypedArray f14 = B.b.f(resources, theme, attributeSet, AbstractC0257a.f3096b);
                                float f15 = c0266j2.f3121c;
                                if (B.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                c0266j2.f3121c = f15;
                                i2 = 1;
                                c0266j2.d = f14.getFloat(1, c0266j2.d);
                                c0266j2.f3122e = f14.getFloat(2, c0266j2.f3122e);
                                float f16 = c0266j2.f3123f;
                                if (B.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                c0266j2.f3123f = f16;
                                float f17 = c0266j2.f3124g;
                                if (B.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                c0266j2.f3124g = f17;
                                float f18 = c0266j2.h;
                                if (B.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                c0266j2.h = f18;
                                float f19 = c0266j2.i;
                                if (B.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                c0266j2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    c0266j2.f3126k = string6;
                                }
                                c0266j2.c();
                                f14.recycle();
                                c0266j.f3120b.add(c0266j2);
                                arrayDeque.push(c0266j2);
                                if (c0266j2.getGroupName() != null) {
                                    bVar.put(c0266j2.getGroupName(), c0266j2);
                                }
                                c0270n3.f3143a = c0270n3.f3143a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        c0269m = c0269m3;
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
                    c0269m3 = c0269m;
                }
                if (!z6) {
                    this.f3155c = a(c0270n.f3145c, c0270n.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0272p(C0270n c0270n) {
        this.f3157f = true;
        this.f3158g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f3154b = c0270n;
        this.f3155c = a(c0270n.f3145c, c0270n.d);
    }
}
