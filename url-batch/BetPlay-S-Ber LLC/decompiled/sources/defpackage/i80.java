package defpackage;

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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class i80 extends z70 {
    public static final PorterDuff.Mode o = PorterDuff.Mode.SRC_IN;
    public g80 g;
    public PorterDuffColorFilter h;
    public ColorFilter i;
    public boolean j;
    public boolean k;
    public final float[] l;
    public final Matrix m;
    public final Rect n;

    public i80() {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        g80 g80Var = new g80();
        g80Var.c = null;
        g80Var.d = o;
        g80Var.b = new f80();
        this.g = g80Var;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.n;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.i;
        if (colorFilter == null) {
            colorFilter = this.h;
        }
        Matrix matrix = this.m;
        canvas.getMatrix(matrix);
        float[] fArr = this.l;
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
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        g80 g80Var = this.g;
        Bitmap bitmap = g80Var.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != g80Var.f.getHeight()) {
            g80Var.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            g80Var.k = true;
        }
        boolean z = this.k;
        g80 g80Var2 = this.g;
        if (!z) {
            g80Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(g80Var2.f);
            f80 f80Var = g80Var2.b;
            f80Var.a(f80Var.g, f80.p, canvas2, min, min2);
        } else if (g80Var2.k || g80Var2.g != g80Var2.c || g80Var2.h != g80Var2.d || g80Var2.j != g80Var2.e || g80Var2.i != g80Var2.b.getRootAlpha()) {
            g80 g80Var3 = this.g;
            g80Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(g80Var3.f);
            f80 f80Var2 = g80Var3.b;
            f80Var2.a(f80Var2.g, f80.p, canvas3, min, min2);
            g80 g80Var4 = this.g;
            g80Var4.g = g80Var4.c;
            g80Var4.h = g80Var4.d;
            g80Var4.i = g80Var4.b.getRootAlpha();
            g80Var4.j = g80Var4.e;
            g80Var4.k = false;
        }
        g80 g80Var5 = this.g;
        if (g80Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (g80Var5.l == null) {
                Paint paint2 = new Paint();
                g80Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            g80Var5.l.setAlpha(g80Var5.b.getRootAlpha());
            g80Var5.l.setColorFilter(colorFilter);
            paint = g80Var5.l;
        }
        canvas.drawBitmap(g80Var5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getAlpha() : this.g.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.g.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getColorFilter() : this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f != null) {
            return new h80(this.f.getConstantState());
        }
        this.g.a = getChangingConfigurations();
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.g.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.g.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        char c;
        int i2;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g80 g80Var = this.g;
        g80Var.b = new f80();
        TypedArray F = j8.F(resources, theme, attributeSet, op.a);
        g80 g80Var2 = this.g;
        f80 f80Var = g80Var2.b;
        int i3 = !j8.A(xmlPullParser, "tintMode") ? -1 : F.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
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
        g80Var2.d = mode;
        ColorStateList colorStateList = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            F.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = F.getResources();
                int resourceId = F.getResourceId(1, 0);
                ThreadLocal threadLocal = mb.a;
                try {
                    colorStateList = mb.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            g80Var2.c = colorStateList2;
        }
        boolean z = g80Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = F.getBoolean(5, z);
        }
        g80Var2.e = z;
        float f = f80Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = F.getFloat(7, f);
        }
        f80Var.j = f;
        float f2 = f80Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = F.getFloat(8, f2);
        }
        f80Var.k = f2;
        if (f80Var.j <= 0.0f) {
            throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        f80Var.h = F.getDimension(3, f80Var.h);
        float dimension = F.getDimension(2, f80Var.i);
        f80Var.i = dimension;
        if (f80Var.h <= 0.0f) {
            throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = f80Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = F.getFloat(4, alpha);
        }
        f80Var.setAlpha(alpha);
        String string = F.getString(0);
        if (string != null) {
            f80Var.m = string;
            f80Var.o.put(string, f80Var);
        }
        F.recycle();
        g80Var.a = getChangingConfigurations();
        g80Var.k = true;
        g80 g80Var3 = this.g;
        f80 f80Var2 = g80Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        c80 c80Var = f80Var2.g;
        e7 e7Var = f80Var2.o;
        arrayDeque.push(c80Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c80 c80Var2 = (c80) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    b80 b80Var = new b80();
                    b80Var.e = 0.0f;
                    b80Var.g = 1.0f;
                    b80Var.h = 1.0f;
                    b80Var.i = 0.0f;
                    b80Var.j = 1.0f;
                    b80Var.k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    b80Var.l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    b80Var.m = join;
                    b80Var.n = 4.0f;
                    TypedArray F2 = j8.F(resources, theme, attributeSet, op.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = F2.getString(0);
                        if (string2 != null) {
                            b80Var.b = string2;
                        }
                        String string3 = F2.getString(2);
                        if (string3 != null) {
                            b80Var.a = j8.i(string3);
                        }
                        b80Var.f = j8.s(F2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = b80Var.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = F2.getFloat(12, f3);
                        }
                        b80Var.h = f3;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? F2.getInt(8, -1) : -1;
                        b80Var.l = i6 != 0 ? i6 != 1 ? i6 != 2 ? b80Var.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? F2.getInt(9, -1) : -1;
                        b80Var.m = i7 != 0 ? i7 != 1 ? i7 != 2 ? b80Var.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = b80Var.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = F2.getFloat(10, f4);
                        }
                        b80Var.n = f4;
                        b80Var.d = j8.s(F2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = b80Var.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = F2.getFloat(11, f5);
                        }
                        b80Var.g = f5;
                        float f6 = b80Var.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = F2.getFloat(4, f6);
                        }
                        b80Var.e = f6;
                        float f7 = b80Var.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = F2.getFloat(6, f7);
                        }
                        b80Var.j = f7;
                        float f8 = b80Var.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = F2.getFloat(7, f8);
                        }
                        b80Var.k = f8;
                        float f9 = b80Var.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = F2.getFloat(5, f9);
                        }
                        b80Var.i = f9;
                        int i8 = b80Var.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i8 = F2.getInt(13, i8);
                        }
                        b80Var.c = i8;
                    }
                    F2.recycle();
                    c80Var2.b.add(b80Var);
                    if (b80Var.getPathName() != null) {
                        e7Var.put(b80Var.getPathName(), b80Var);
                    }
                    g80Var3.a = g80Var3.a;
                    z2 = false;
                    c = '\b';
                } else {
                    c = '\b';
                    if ("clip-path".equals(name)) {
                        a80 a80Var = new a80();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray F3 = j8.F(resources, theme, attributeSet, op.d);
                            String string4 = F3.getString(0);
                            if (string4 != null) {
                                a80Var.b = string4;
                            }
                            String string5 = F3.getString(1);
                            if (string5 != null) {
                                a80Var.a = j8.i(string5);
                            }
                            a80Var.c = !j8.A(xmlPullParser, "fillType") ? 0 : F3.getInt(2, 0);
                            F3.recycle();
                        }
                        c80Var2.b.add(a80Var);
                        if (a80Var.getPathName() != null) {
                            e7Var.put(a80Var.getPathName(), a80Var);
                        }
                        g80Var3.a = g80Var3.a;
                    } else if ("group".equals(name)) {
                        c80 c80Var3 = new c80();
                        TypedArray F4 = j8.F(resources, theme, attributeSet, op.b);
                        float f10 = c80Var3.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f10 = F4.getFloat(5, f10);
                        }
                        c80Var3.c = f10;
                        c80Var3.d = F4.getFloat(1, c80Var3.d);
                        c80Var3.e = F4.getFloat(2, c80Var3.e);
                        float f11 = c80Var3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = F4.getFloat(3, f11);
                        }
                        c80Var3.f = f11;
                        float f12 = c80Var3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = F4.getFloat(4, f12);
                        }
                        c80Var3.g = f12;
                        float f13 = c80Var3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = F4.getFloat(6, f13);
                        }
                        c80Var3.h = f13;
                        float f14 = c80Var3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = F4.getFloat(7, f14);
                        }
                        c80Var3.i = f14;
                        String string6 = F4.getString(0);
                        if (string6 != null) {
                            c80Var3.k = string6;
                        }
                        c80Var3.c();
                        F4.recycle();
                        c80Var2.b.add(c80Var3);
                        arrayDeque.push(c80Var3);
                        if (c80Var3.getGroupName() != null) {
                            e7Var.put(c80Var3.getGroupName(), c80Var3);
                        }
                        g80Var3.a = g80Var3.a;
                    }
                }
                i2 = 1;
            } else {
                i = depth;
                c = '\b';
                i2 = 1;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i4 = i2;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.h = a(g80Var.c, g80Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.isAutoMirrored() : this.g.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        g80 g80Var = this.g;
        if (g80Var == null) {
            return false;
        }
        f80 f80Var = g80Var.b;
        if (f80Var.n == null) {
            f80Var.n = Boolean.valueOf(f80Var.g.a());
        }
        if (f80Var.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.g.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.j && super.mutate() == this) {
            g80 g80Var = this.g;
            g80 g80Var2 = new g80();
            g80Var2.c = null;
            g80Var2.d = o;
            if (g80Var != null) {
                g80Var2.a = g80Var.a;
                f80 f80Var = new f80(g80Var.b);
                g80Var2.b = f80Var;
                if (g80Var.b.e != null) {
                    f80Var.e = new Paint(g80Var.b.e);
                }
                if (g80Var.b.d != null) {
                    g80Var2.b.d = new Paint(g80Var.b.d);
                }
                g80Var2.c = g80Var.c;
                g80Var2.d = g80Var.d;
                g80Var2.e = g80Var.e;
            }
            this.g = g80Var2;
            this.j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g80 g80Var = this.g;
        ColorStateList colorStateList = g80Var.c;
        if (colorStateList == null || (mode = g80Var.d) == null) {
            z = false;
        } else {
            this.h = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        f80 f80Var = g80Var.b;
        if (f80Var.n == null) {
            f80Var.n = Boolean.valueOf(f80Var.g.a());
        }
        if (f80Var.n.booleanValue()) {
            boolean b = g80Var.b.g.b(iArr);
            g80Var.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.g.b.getRootAlpha() != i) {
            this.g.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.g.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.i = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        g80 g80Var = this.g;
        if (g80Var.c != colorStateList) {
            g80Var.c = colorStateList;
            this.h = a(colorStateList, g80Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        g80 g80Var = this.g;
        if (g80Var.d != mode) {
            g80Var.d = mode;
            this.h = a(g80Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public i80(g80 g80Var) {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        this.g = g80Var;
        this.h = a(g80Var.c, g80Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
