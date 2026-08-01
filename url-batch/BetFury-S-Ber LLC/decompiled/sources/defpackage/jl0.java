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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jl0 extends al0 {
    public static final PorterDuff.Mode o = PorterDuff.Mode.SRC_IN;
    public hl0 g;
    public PorterDuffColorFilter h;
    public ColorFilter i;
    public boolean j;
    public boolean k;
    public final float[] l;
    public final Matrix m;
    public final Rect n;

    public jl0() {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        hl0 hl0Var = new hl0();
        hl0Var.c = null;
        hl0Var.d = o;
        hl0Var.b = new gl0();
        this.g = hl0Var;
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
        hl0 hl0Var = this.g;
        Bitmap bitmap = hl0Var.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != hl0Var.f.getHeight()) {
            hl0Var.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            hl0Var.k = true;
        }
        boolean z = this.k;
        hl0 hl0Var2 = this.g;
        if (!z) {
            hl0Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(hl0Var2.f);
            gl0 gl0Var = hl0Var2.b;
            gl0Var.a(gl0Var.g, gl0.p, canvas2, min, min2);
        } else if (hl0Var2.k || hl0Var2.g != hl0Var2.c || hl0Var2.h != hl0Var2.d || hl0Var2.j != hl0Var2.e || hl0Var2.i != hl0Var2.b.getRootAlpha()) {
            hl0 hl0Var3 = this.g;
            hl0Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(hl0Var3.f);
            gl0 gl0Var2 = hl0Var3.b;
            gl0Var2.a(gl0Var2.g, gl0.p, canvas3, min, min2);
            hl0 hl0Var4 = this.g;
            hl0Var4.g = hl0Var4.c;
            hl0Var4.h = hl0Var4.d;
            hl0Var4.i = hl0Var4.b.getRootAlpha();
            hl0Var4.j = hl0Var4.e;
            hl0Var4.k = false;
        }
        hl0 hl0Var5 = this.g;
        if (hl0Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (hl0Var5.l == null) {
                Paint paint2 = new Paint();
                hl0Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            hl0Var5.l.setAlpha(hl0Var5.b.getRootAlpha());
            hl0Var5.l.setColorFilter(colorFilter);
            paint = hl0Var5.l;
        }
        canvas.drawBitmap(hl0Var5.f, (Rect) null, rect, paint);
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
            return new il0(this.f.getConstantState());
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
        hl0 hl0Var = this.g;
        hl0Var.b = new gl0();
        TypedArray i3 = bd0.i(resources, theme, attributeSet, mv.a);
        hl0 hl0Var2 = this.g;
        gl0 gl0Var = hl0Var2.b;
        int i4 = !bd0.h(xmlPullParser, "tintMode") ? -1 : i3.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
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
        hl0Var2.d = mode;
        ColorStateList colorStateList = null;
        int i5 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            i3.getValue(1, typedValue);
            int i6 = typedValue.type;
            if (i6 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i6 < 28 || i6 > 31) {
                Resources resources2 = i3.getResources();
                int resourceId = i3.getResourceId(1, 0);
                ThreadLocal threadLocal = ed.a;
                try {
                    colorStateList = ed.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            hl0Var2.c = colorStateList2;
        }
        boolean z = hl0Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = i3.getBoolean(5, z);
        }
        hl0Var2.e = z;
        float f = gl0Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = i3.getFloat(7, f);
        }
        gl0Var.j = f;
        float f2 = gl0Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = i3.getFloat(8, f2);
        }
        gl0Var.k = f2;
        if (gl0Var.j <= 0.0f) {
            throw new XmlPullParserException(i3.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(i3.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gl0Var.h = i3.getDimension(3, gl0Var.h);
        float dimension = i3.getDimension(2, gl0Var.i);
        gl0Var.i = dimension;
        if (gl0Var.h <= 0.0f) {
            throw new XmlPullParserException(i3.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(i3.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = gl0Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = i3.getFloat(4, alpha);
        }
        gl0Var.setAlpha(alpha);
        String string = i3.getString(0);
        if (string != null) {
            gl0Var.m = string;
            gl0Var.o.put(string, gl0Var);
        }
        i3.recycle();
        hl0Var.a = getChangingConfigurations();
        hl0Var.k = true;
        hl0 hl0Var3 = this.g;
        gl0 gl0Var2 = hl0Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        dl0 dl0Var = gl0Var2.g;
        g7 g7Var = gl0Var2.o;
        arrayDeque.push(dl0Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                dl0 dl0Var2 = (dl0) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    cl0 cl0Var = new cl0();
                    cl0Var.e = 0.0f;
                    cl0Var.g = 1.0f;
                    cl0Var.h = 1.0f;
                    cl0Var.i = 0.0f;
                    cl0Var.j = 1.0f;
                    cl0Var.k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    cl0Var.l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    cl0Var.m = join;
                    cl0Var.n = 4.0f;
                    TypedArray i7 = bd0.i(resources, theme, attributeSet, mv.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = i7.getString(0);
                        if (string2 != null) {
                            cl0Var.b = string2;
                        }
                        String string3 = i7.getString(2);
                        if (string3 != null) {
                            cl0Var.a = gk0.l(string3);
                        }
                        cl0Var.f = bd0.f(i7, xmlPullParser, theme, "fillColor", 1);
                        float f3 = cl0Var.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = i7.getFloat(12, f3);
                        }
                        cl0Var.h = f3;
                        int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? i7.getInt(8, -1) : -1;
                        cl0Var.l = i8 != 0 ? i8 != 1 ? i8 != 2 ? cl0Var.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? i7.getInt(9, -1) : -1;
                        cl0Var.m = i9 != 0 ? i9 != 1 ? i9 != 2 ? cl0Var.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = cl0Var.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = i7.getFloat(10, f4);
                        }
                        cl0Var.n = f4;
                        cl0Var.d = bd0.f(i7, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = cl0Var.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = i7.getFloat(11, f5);
                        }
                        cl0Var.g = f5;
                        float f6 = cl0Var.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = i7.getFloat(4, f6);
                        }
                        cl0Var.e = f6;
                        float f7 = cl0Var.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = i7.getFloat(6, f7);
                        }
                        cl0Var.j = f7;
                        float f8 = cl0Var.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = i7.getFloat(7, f8);
                        }
                        cl0Var.k = f8;
                        float f9 = cl0Var.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = i7.getFloat(5, f9);
                        }
                        cl0Var.i = f9;
                        int i10 = cl0Var.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i10 = i7.getInt(13, i10);
                        }
                        cl0Var.c = i10;
                    }
                    i7.recycle();
                    dl0Var2.b.add(cl0Var);
                    if (cl0Var.getPathName() != null) {
                        g7Var.put(cl0Var.getPathName(), cl0Var);
                    }
                    hl0Var3.a = hl0Var3.a;
                    z2 = false;
                    c = '\b';
                } else {
                    c = '\b';
                    if ("clip-path".equals(name)) {
                        bl0 bl0Var = new bl0();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray i11 = bd0.i(resources, theme, attributeSet, mv.d);
                            String string4 = i11.getString(0);
                            if (string4 != null) {
                                bl0Var.b = string4;
                            }
                            String string5 = i11.getString(1);
                            if (string5 != null) {
                                bl0Var.a = gk0.l(string5);
                            }
                            bl0Var.c = !bd0.h(xmlPullParser, "fillType") ? 0 : i11.getInt(2, 0);
                            i11.recycle();
                        }
                        dl0Var2.b.add(bl0Var);
                        if (bl0Var.getPathName() != null) {
                            g7Var.put(bl0Var.getPathName(), bl0Var);
                        }
                        hl0Var3.a = hl0Var3.a;
                    } else if ("group".equals(name)) {
                        dl0 dl0Var3 = new dl0();
                        TypedArray i12 = bd0.i(resources, theme, attributeSet, mv.b);
                        float f10 = dl0Var3.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f10 = i12.getFloat(5, f10);
                        }
                        dl0Var3.c = f10;
                        dl0Var3.d = i12.getFloat(1, dl0Var3.d);
                        dl0Var3.e = i12.getFloat(2, dl0Var3.e);
                        float f11 = dl0Var3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = i12.getFloat(3, f11);
                        }
                        dl0Var3.f = f11;
                        float f12 = dl0Var3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = i12.getFloat(4, f12);
                        }
                        dl0Var3.g = f12;
                        float f13 = dl0Var3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = i12.getFloat(6, f13);
                        }
                        dl0Var3.h = f13;
                        float f14 = dl0Var3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = i12.getFloat(7, f14);
                        }
                        dl0Var3.i = f14;
                        String string6 = i12.getString(0);
                        if (string6 != null) {
                            dl0Var3.k = string6;
                        }
                        dl0Var3.c();
                        i12.recycle();
                        dl0Var2.b.add(dl0Var3);
                        arrayDeque.push(dl0Var3);
                        if (dl0Var3.getGroupName() != null) {
                            g7Var.put(dl0Var3.getGroupName(), dl0Var3);
                        }
                        hl0Var3.a = hl0Var3.a;
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
            i5 = i2;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.h = a(hl0Var.c, hl0Var.d);
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
        hl0 hl0Var = this.g;
        if (hl0Var == null) {
            return false;
        }
        gl0 gl0Var = hl0Var.b;
        if (gl0Var.n == null) {
            gl0Var.n = Boolean.valueOf(gl0Var.g.a());
        }
        if (gl0Var.n.booleanValue()) {
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
            hl0 hl0Var = this.g;
            hl0 hl0Var2 = new hl0();
            hl0Var2.c = null;
            hl0Var2.d = o;
            if (hl0Var != null) {
                hl0Var2.a = hl0Var.a;
                gl0 gl0Var = new gl0(hl0Var.b);
                hl0Var2.b = gl0Var;
                if (hl0Var.b.e != null) {
                    gl0Var.e = new Paint(hl0Var.b.e);
                }
                if (hl0Var.b.d != null) {
                    hl0Var2.b.d = new Paint(hl0Var.b.d);
                }
                hl0Var2.c = hl0Var.c;
                hl0Var2.d = hl0Var.d;
                hl0Var2.e = hl0Var.e;
            }
            this.g = hl0Var2;
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
        hl0 hl0Var = this.g;
        ColorStateList colorStateList = hl0Var.c;
        if (colorStateList == null || (mode = hl0Var.d) == null) {
            z = false;
        } else {
            this.h = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        gl0 gl0Var = hl0Var.b;
        if (gl0Var.n == null) {
            gl0Var.n = Boolean.valueOf(gl0Var.g.a());
        }
        if (gl0Var.n.booleanValue()) {
            boolean b = hl0Var.b.g.b(iArr);
            hl0Var.k |= b;
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
        hl0 hl0Var = this.g;
        if (hl0Var.c != colorStateList) {
            hl0Var.c = colorStateList;
            this.h = a(colorStateList, hl0Var.d);
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
        hl0 hl0Var = this.g;
        if (hl0Var.d != mode) {
            hl0Var.d = mode;
            this.h = a(hl0Var.c, mode);
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

    public jl0(hl0 hl0Var) {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        this.g = hl0Var;
        this.h = a(hl0Var.c, hl0Var.d);
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
