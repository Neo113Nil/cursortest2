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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class b80 extends s70 {
    public static final PorterDuff.Mode o = PorterDuff.Mode.SRC_IN;
    public z70 g;
    public PorterDuffColorFilter h;
    public ColorFilter i;
    public boolean j;
    public boolean k;
    public final float[] l;
    public final Matrix m;
    public final Rect n;

    public b80() {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        z70 z70Var = new z70();
        z70Var.c = null;
        z70Var.d = o;
        z70Var.b = new y70();
        this.g = z70Var;
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
        z70 z70Var = this.g;
        Bitmap bitmap = z70Var.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != z70Var.f.getHeight()) {
            z70Var.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            z70Var.k = true;
        }
        boolean z = this.k;
        z70 z70Var2 = this.g;
        if (!z) {
            z70Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(z70Var2.f);
            y70 y70Var = z70Var2.b;
            y70Var.a(y70Var.g, y70.p, canvas2, min, min2);
        } else if (z70Var2.k || z70Var2.g != z70Var2.c || z70Var2.h != z70Var2.d || z70Var2.j != z70Var2.e || z70Var2.i != z70Var2.b.getRootAlpha()) {
            z70 z70Var3 = this.g;
            z70Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(z70Var3.f);
            y70 y70Var2 = z70Var3.b;
            y70Var2.a(y70Var2.g, y70.p, canvas3, min, min2);
            z70 z70Var4 = this.g;
            z70Var4.g = z70Var4.c;
            z70Var4.h = z70Var4.d;
            z70Var4.i = z70Var4.b.getRootAlpha();
            z70Var4.j = z70Var4.e;
            z70Var4.k = false;
        }
        z70 z70Var5 = this.g;
        if (z70Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (z70Var5.l == null) {
                Paint paint2 = new Paint();
                z70Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            z70Var5.l.setAlpha(z70Var5.b.getRootAlpha());
            z70Var5.l.setColorFilter(colorFilter);
            paint = z70Var5.l;
        }
        canvas.drawBitmap(z70Var5.f, (Rect) null, rect, paint);
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
            return new a80(this.f.getConstantState());
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
        z70 z70Var = this.g;
        z70Var.b = new y70();
        TypedArray K = jw.K(resources, theme, attributeSet, zo.a);
        z70 z70Var2 = this.g;
        y70 y70Var = z70Var2.b;
        int i3 = !jw.F(xmlPullParser, "tintMode") ? -1 : K.getInt(6, -1);
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
        z70Var2.d = mode;
        ColorStateList colorStateList = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            K.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = K.getResources();
                int resourceId = K.getResourceId(1, 0);
                ThreadLocal threadLocal = kb.a;
                try {
                    colorStateList = kb.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            z70Var2.c = colorStateList2;
        }
        boolean z = z70Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = K.getBoolean(5, z);
        }
        z70Var2.e = z;
        float f = y70Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = K.getFloat(7, f);
        }
        y70Var.j = f;
        float f2 = y70Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = K.getFloat(8, f2);
        }
        y70Var.k = f2;
        if (y70Var.j <= 0.0f) {
            throw new XmlPullParserException(K.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(K.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        y70Var.h = K.getDimension(3, y70Var.h);
        float dimension = K.getDimension(2, y70Var.i);
        y70Var.i = dimension;
        if (y70Var.h <= 0.0f) {
            throw new XmlPullParserException(K.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(K.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = y70Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = K.getFloat(4, alpha);
        }
        y70Var.setAlpha(alpha);
        String string = K.getString(0);
        if (string != null) {
            y70Var.m = string;
            y70Var.o.put(string, y70Var);
        }
        K.recycle();
        z70Var.a = getChangingConfigurations();
        z70Var.k = true;
        z70 z70Var3 = this.g;
        y70 y70Var2 = z70Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        v70 v70Var = y70Var2.g;
        n6 n6Var = y70Var2.o;
        arrayDeque.push(v70Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                v70 v70Var2 = (v70) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    u70 u70Var = new u70();
                    u70Var.e = 0.0f;
                    u70Var.g = 1.0f;
                    u70Var.h = 1.0f;
                    u70Var.i = 0.0f;
                    u70Var.j = 1.0f;
                    u70Var.k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    u70Var.l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    u70Var.m = join;
                    u70Var.n = 4.0f;
                    TypedArray K2 = jw.K(resources, theme, attributeSet, zo.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = K2.getString(0);
                        if (string2 != null) {
                            u70Var.b = string2;
                        }
                        String string3 = K2.getString(2);
                        if (string3 != null) {
                            u70Var.a = e70.q(string3);
                        }
                        u70Var.f = jw.x(K2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = u70Var.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = K2.getFloat(12, f3);
                        }
                        u70Var.h = f3;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? K2.getInt(8, -1) : -1;
                        u70Var.l = i6 != 0 ? i6 != 1 ? i6 != 2 ? u70Var.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? K2.getInt(9, -1) : -1;
                        u70Var.m = i7 != 0 ? i7 != 1 ? i7 != 2 ? u70Var.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = u70Var.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = K2.getFloat(10, f4);
                        }
                        u70Var.n = f4;
                        u70Var.d = jw.x(K2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = u70Var.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = K2.getFloat(11, f5);
                        }
                        u70Var.g = f5;
                        float f6 = u70Var.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = K2.getFloat(4, f6);
                        }
                        u70Var.e = f6;
                        float f7 = u70Var.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = K2.getFloat(6, f7);
                        }
                        u70Var.j = f7;
                        float f8 = u70Var.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = K2.getFloat(7, f8);
                        }
                        u70Var.k = f8;
                        float f9 = u70Var.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = K2.getFloat(5, f9);
                        }
                        u70Var.i = f9;
                        int i8 = u70Var.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i8 = K2.getInt(13, i8);
                        }
                        u70Var.c = i8;
                    }
                    K2.recycle();
                    v70Var2.b.add(u70Var);
                    if (u70Var.getPathName() != null) {
                        n6Var.put(u70Var.getPathName(), u70Var);
                    }
                    z70Var3.a = z70Var3.a;
                    z2 = false;
                    c = '\b';
                } else {
                    c = '\b';
                    if ("clip-path".equals(name)) {
                        t70 t70Var = new t70();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray K3 = jw.K(resources, theme, attributeSet, zo.d);
                            String string4 = K3.getString(0);
                            if (string4 != null) {
                                t70Var.b = string4;
                            }
                            String string5 = K3.getString(1);
                            if (string5 != null) {
                                t70Var.a = e70.q(string5);
                            }
                            t70Var.c = !jw.F(xmlPullParser, "fillType") ? 0 : K3.getInt(2, 0);
                            K3.recycle();
                        }
                        v70Var2.b.add(t70Var);
                        if (t70Var.getPathName() != null) {
                            n6Var.put(t70Var.getPathName(), t70Var);
                        }
                        z70Var3.a = z70Var3.a;
                    } else if ("group".equals(name)) {
                        v70 v70Var3 = new v70();
                        TypedArray K4 = jw.K(resources, theme, attributeSet, zo.b);
                        float f10 = v70Var3.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f10 = K4.getFloat(5, f10);
                        }
                        v70Var3.c = f10;
                        v70Var3.d = K4.getFloat(1, v70Var3.d);
                        v70Var3.e = K4.getFloat(2, v70Var3.e);
                        float f11 = v70Var3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = K4.getFloat(3, f11);
                        }
                        v70Var3.f = f11;
                        float f12 = v70Var3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = K4.getFloat(4, f12);
                        }
                        v70Var3.g = f12;
                        float f13 = v70Var3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = K4.getFloat(6, f13);
                        }
                        v70Var3.h = f13;
                        float f14 = v70Var3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = K4.getFloat(7, f14);
                        }
                        v70Var3.i = f14;
                        String string6 = K4.getString(0);
                        if (string6 != null) {
                            v70Var3.k = string6;
                        }
                        v70Var3.c();
                        K4.recycle();
                        v70Var2.b.add(v70Var3);
                        arrayDeque.push(v70Var3);
                        if (v70Var3.getGroupName() != null) {
                            n6Var.put(v70Var3.getGroupName(), v70Var3);
                        }
                        z70Var3.a = z70Var3.a;
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
        this.h = a(z70Var.c, z70Var.d);
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
        z70 z70Var = this.g;
        if (z70Var == null) {
            return false;
        }
        y70 y70Var = z70Var.b;
        if (y70Var.n == null) {
            y70Var.n = Boolean.valueOf(y70Var.g.a());
        }
        if (y70Var.n.booleanValue()) {
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
            z70 z70Var = this.g;
            z70 z70Var2 = new z70();
            z70Var2.c = null;
            z70Var2.d = o;
            if (z70Var != null) {
                z70Var2.a = z70Var.a;
                y70 y70Var = new y70(z70Var.b);
                z70Var2.b = y70Var;
                if (z70Var.b.e != null) {
                    y70Var.e = new Paint(z70Var.b.e);
                }
                if (z70Var.b.d != null) {
                    z70Var2.b.d = new Paint(z70Var.b.d);
                }
                z70Var2.c = z70Var.c;
                z70Var2.d = z70Var.d;
                z70Var2.e = z70Var.e;
            }
            this.g = z70Var2;
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
        z70 z70Var = this.g;
        ColorStateList colorStateList = z70Var.c;
        if (colorStateList == null || (mode = z70Var.d) == null) {
            z = false;
        } else {
            this.h = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        y70 y70Var = z70Var.b;
        if (y70Var.n == null) {
            y70Var.n = Boolean.valueOf(y70Var.g.a());
        }
        if (y70Var.n.booleanValue()) {
            boolean b = z70Var.b.g.b(iArr);
            z70Var.k |= b;
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
        z70 z70Var = this.g;
        if (z70Var.c != colorStateList) {
            z70Var.c = colorStateList;
            this.h = a(colorStateList, z70Var.d);
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
        z70 z70Var = this.g;
        if (z70Var.d != mode) {
            z70Var.d = mode;
            this.h = a(z70Var.c, mode);
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

    public b80(z70 z70Var) {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        this.g = z70Var;
        this.h = a(z70Var.c, z70Var.d);
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
