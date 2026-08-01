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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class mb0 extends db0 {
    public static final PorterDuff.Mode o = PorterDuff.Mode.SRC_IN;
    public kb0 g;
    public PorterDuffColorFilter h;
    public ColorFilter i;
    public boolean j;
    public boolean k;
    public final float[] l;
    public final Matrix m;
    public final Rect n;

    public mb0() {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        kb0 kb0Var = new kb0();
        kb0Var.c = null;
        kb0Var.d = o;
        kb0Var.b = new jb0();
        this.g = kb0Var;
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
        kb0 kb0Var = this.g;
        Bitmap bitmap = kb0Var.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != kb0Var.f.getHeight()) {
            kb0Var.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            kb0Var.k = true;
        }
        boolean z = this.k;
        kb0 kb0Var2 = this.g;
        if (!z) {
            kb0Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(kb0Var2.f);
            jb0 jb0Var = kb0Var2.b;
            jb0Var.a(jb0Var.g, jb0.p, canvas2, min, min2);
        } else if (kb0Var2.k || kb0Var2.g != kb0Var2.c || kb0Var2.h != kb0Var2.d || kb0Var2.j != kb0Var2.e || kb0Var2.i != kb0Var2.b.getRootAlpha()) {
            kb0 kb0Var3 = this.g;
            kb0Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(kb0Var3.f);
            jb0 jb0Var2 = kb0Var3.b;
            jb0Var2.a(jb0Var2.g, jb0.p, canvas3, min, min2);
            kb0 kb0Var4 = this.g;
            kb0Var4.g = kb0Var4.c;
            kb0Var4.h = kb0Var4.d;
            kb0Var4.i = kb0Var4.b.getRootAlpha();
            kb0Var4.j = kb0Var4.e;
            kb0Var4.k = false;
        }
        kb0 kb0Var5 = this.g;
        if (kb0Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (kb0Var5.l == null) {
                Paint paint2 = new Paint();
                kb0Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            kb0Var5.l.setAlpha(kb0Var5.b.getRootAlpha());
            kb0Var5.l.setColorFilter(colorFilter);
            paint = kb0Var5.l;
        }
        canvas.drawBitmap(kb0Var5.f, (Rect) null, rect, paint);
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
            return new lb0(this.f.getConstantState());
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
        kb0 kb0Var = this.g;
        kb0Var.b = new jb0();
        TypedArray x = b9.x(resources, theme, attributeSet, xf.a);
        kb0 kb0Var2 = this.g;
        jb0 jb0Var = kb0Var2.b;
        int i3 = !b9.v(xmlPullParser, "tintMode") ? -1 : x.getInt(6, -1);
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
        kb0Var2.d = mode;
        ColorStateList colorStateList = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            x.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = x.getResources();
                int resourceId = x.getResourceId(1, 0);
                ThreadLocal threadLocal = fc.a;
                try {
                    colorStateList = fc.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            kb0Var2.c = colorStateList2;
        }
        boolean z = kb0Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = x.getBoolean(5, z);
        }
        kb0Var2.e = z;
        float f = jb0Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = x.getFloat(7, f);
        }
        jb0Var.j = f;
        float f2 = jb0Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = x.getFloat(8, f2);
        }
        jb0Var.k = f2;
        if (jb0Var.j <= 0.0f) {
            throw new XmlPullParserException(x.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(x.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        jb0Var.h = x.getDimension(3, jb0Var.h);
        float dimension = x.getDimension(2, jb0Var.i);
        jb0Var.i = dimension;
        if (jb0Var.h <= 0.0f) {
            throw new XmlPullParserException(x.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(x.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = jb0Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = x.getFloat(4, alpha);
        }
        jb0Var.setAlpha(alpha);
        String string = x.getString(0);
        if (string != null) {
            jb0Var.m = string;
            jb0Var.o.put(string, jb0Var);
        }
        x.recycle();
        kb0Var.a = getChangingConfigurations();
        kb0Var.k = true;
        kb0 kb0Var3 = this.g;
        jb0 jb0Var2 = kb0Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        gb0 gb0Var = jb0Var2.g;
        x6 x6Var = jb0Var2.o;
        arrayDeque.push(gb0Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                gb0 gb0Var2 = (gb0) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    fb0 fb0Var = new fb0();
                    fb0Var.e = 0.0f;
                    fb0Var.g = 1.0f;
                    fb0Var.h = 1.0f;
                    fb0Var.i = 0.0f;
                    fb0Var.j = 1.0f;
                    fb0Var.k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    fb0Var.l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    fb0Var.m = join;
                    fb0Var.n = 4.0f;
                    TypedArray x2 = b9.x(resources, theme, attributeSet, xf.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = x2.getString(0);
                        if (string2 != null) {
                            fb0Var.b = string2;
                        }
                        String string3 = x2.getString(2);
                        if (string3 != null) {
                            fb0Var.a = mz.k(string3);
                        }
                        fb0Var.f = b9.p(x2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = fb0Var.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = x2.getFloat(12, f3);
                        }
                        fb0Var.h = f3;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? x2.getInt(8, -1) : -1;
                        fb0Var.l = i6 != 0 ? i6 != 1 ? i6 != 2 ? fb0Var.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? x2.getInt(9, -1) : -1;
                        fb0Var.m = i7 != 0 ? i7 != 1 ? i7 != 2 ? fb0Var.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = fb0Var.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = x2.getFloat(10, f4);
                        }
                        fb0Var.n = f4;
                        fb0Var.d = b9.p(x2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = fb0Var.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = x2.getFloat(11, f5);
                        }
                        fb0Var.g = f5;
                        float f6 = fb0Var.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = x2.getFloat(4, f6);
                        }
                        fb0Var.e = f6;
                        float f7 = fb0Var.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = x2.getFloat(6, f7);
                        }
                        fb0Var.j = f7;
                        float f8 = fb0Var.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = x2.getFloat(7, f8);
                        }
                        fb0Var.k = f8;
                        float f9 = fb0Var.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = x2.getFloat(5, f9);
                        }
                        fb0Var.i = f9;
                        int i8 = fb0Var.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i8 = x2.getInt(13, i8);
                        }
                        fb0Var.c = i8;
                    }
                    x2.recycle();
                    gb0Var2.b.add(fb0Var);
                    if (fb0Var.getPathName() != null) {
                        x6Var.put(fb0Var.getPathName(), fb0Var);
                    }
                    kb0Var3.a = kb0Var3.a;
                    z2 = false;
                    c = '\b';
                } else {
                    c = '\b';
                    if ("clip-path".equals(name)) {
                        eb0 eb0Var = new eb0();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray x3 = b9.x(resources, theme, attributeSet, xf.d);
                            String string4 = x3.getString(0);
                            if (string4 != null) {
                                eb0Var.b = string4;
                            }
                            String string5 = x3.getString(1);
                            if (string5 != null) {
                                eb0Var.a = mz.k(string5);
                            }
                            eb0Var.c = !b9.v(xmlPullParser, "fillType") ? 0 : x3.getInt(2, 0);
                            x3.recycle();
                        }
                        gb0Var2.b.add(eb0Var);
                        if (eb0Var.getPathName() != null) {
                            x6Var.put(eb0Var.getPathName(), eb0Var);
                        }
                        kb0Var3.a = kb0Var3.a;
                    } else if ("group".equals(name)) {
                        gb0 gb0Var3 = new gb0();
                        TypedArray x4 = b9.x(resources, theme, attributeSet, xf.b);
                        float f10 = gb0Var3.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f10 = x4.getFloat(5, f10);
                        }
                        gb0Var3.c = f10;
                        gb0Var3.d = x4.getFloat(1, gb0Var3.d);
                        gb0Var3.e = x4.getFloat(2, gb0Var3.e);
                        float f11 = gb0Var3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = x4.getFloat(3, f11);
                        }
                        gb0Var3.f = f11;
                        float f12 = gb0Var3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = x4.getFloat(4, f12);
                        }
                        gb0Var3.g = f12;
                        float f13 = gb0Var3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = x4.getFloat(6, f13);
                        }
                        gb0Var3.h = f13;
                        float f14 = gb0Var3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = x4.getFloat(7, f14);
                        }
                        gb0Var3.i = f14;
                        String string6 = x4.getString(0);
                        if (string6 != null) {
                            gb0Var3.k = string6;
                        }
                        gb0Var3.c();
                        x4.recycle();
                        gb0Var2.b.add(gb0Var3);
                        arrayDeque.push(gb0Var3);
                        if (gb0Var3.getGroupName() != null) {
                            x6Var.put(gb0Var3.getGroupName(), gb0Var3);
                        }
                        kb0Var3.a = kb0Var3.a;
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
        this.h = a(kb0Var.c, kb0Var.d);
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
        kb0 kb0Var = this.g;
        if (kb0Var == null) {
            return false;
        }
        jb0 jb0Var = kb0Var.b;
        if (jb0Var.n == null) {
            jb0Var.n = Boolean.valueOf(jb0Var.g.a());
        }
        if (jb0Var.n.booleanValue()) {
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
            kb0 kb0Var = this.g;
            kb0 kb0Var2 = new kb0();
            kb0Var2.c = null;
            kb0Var2.d = o;
            if (kb0Var != null) {
                kb0Var2.a = kb0Var.a;
                jb0 jb0Var = new jb0(kb0Var.b);
                kb0Var2.b = jb0Var;
                if (kb0Var.b.e != null) {
                    jb0Var.e = new Paint(kb0Var.b.e);
                }
                if (kb0Var.b.d != null) {
                    kb0Var2.b.d = new Paint(kb0Var.b.d);
                }
                kb0Var2.c = kb0Var.c;
                kb0Var2.d = kb0Var.d;
                kb0Var2.e = kb0Var.e;
            }
            this.g = kb0Var2;
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
        kb0 kb0Var = this.g;
        ColorStateList colorStateList = kb0Var.c;
        if (colorStateList == null || (mode = kb0Var.d) == null) {
            z = false;
        } else {
            this.h = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        jb0 jb0Var = kb0Var.b;
        if (jb0Var.n == null) {
            jb0Var.n = Boolean.valueOf(jb0Var.g.a());
        }
        if (jb0Var.n.booleanValue()) {
            boolean b = kb0Var.b.g.b(iArr);
            kb0Var.k |= b;
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
        kb0 kb0Var = this.g;
        if (kb0Var.c != colorStateList) {
            kb0Var.c = colorStateList;
            this.h = a(colorStateList, kb0Var.d);
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
        kb0 kb0Var = this.g;
        if (kb0Var.d != mode) {
            kb0Var.d = mode;
            this.h = a(kb0Var.c, mode);
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

    public mb0(kb0 kb0Var) {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        this.g = kb0Var;
        this.h = a(kb0Var.c, kb0Var.d);
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
