package q0;

import a.AbstractC0058a;
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

/* renamed from: q0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347p extends AbstractC0338g {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0345n f3989b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3990c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f3991d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3992f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3993g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f3994h;
    public final Rect i;

    public C0347p() {
        this.f3992f = true;
        this.f3993g = new float[9];
        this.f3994h = new Matrix();
        this.i = new Rect();
        C0345n c0345n = new C0345n();
        c0345n.f3981c = null;
        c0345n.f3982d = j;
        c0345n.f3980b = new C0344m();
        this.f3989b = c0345n;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3946a;
        if (drawable == null) {
            return false;
        }
        F.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3991d;
        if (colorFilter == null) {
            colorFilter = this.f3990c;
        }
        Matrix matrix = this.f3994h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3993g;
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
        if (isAutoMirrored() && F.b.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0345n c0345n = this.f3989b;
        Bitmap bitmap = c0345n.f3983f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0345n.f3983f.getHeight()) {
            c0345n.f3983f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0345n.f3986k = true;
        }
        if (this.f3992f) {
            C0345n c0345n2 = this.f3989b;
            if (c0345n2.f3986k || c0345n2.f3984g != c0345n2.f3981c || c0345n2.f3985h != c0345n2.f3982d || c0345n2.j != c0345n2.e || c0345n2.i != c0345n2.f3980b.getRootAlpha()) {
                C0345n c0345n3 = this.f3989b;
                c0345n3.f3983f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0345n3.f3983f);
                C0344m c0344m = c0345n3.f3980b;
                c0344m.a(c0344m.f3972g, C0344m.f3966p, canvas2, min, min2);
                C0345n c0345n4 = this.f3989b;
                c0345n4.f3984g = c0345n4.f3981c;
                c0345n4.f3985h = c0345n4.f3982d;
                c0345n4.i = c0345n4.f3980b.getRootAlpha();
                c0345n4.j = c0345n4.e;
                c0345n4.f3986k = false;
            }
        } else {
            C0345n c0345n5 = this.f3989b;
            c0345n5.f3983f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0345n5.f3983f);
            C0344m c0344m2 = c0345n5.f3980b;
            c0344m2.a(c0344m2.f3972g, C0344m.f3966p, canvas3, min, min2);
        }
        C0345n c0345n6 = this.f3989b;
        if (c0345n6.f3980b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0345n6.f3987l == null) {
                Paint paint2 = new Paint();
                c0345n6.f3987l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0345n6.f3987l.setAlpha(c0345n6.f3980b.getRootAlpha());
            c0345n6.f3987l.setColorFilter(colorFilter);
            paint = c0345n6.f3987l;
        }
        canvas.drawBitmap(c0345n6.f3983f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.getAlpha() : this.f3989b.f3980b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3989b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3946a;
        return drawable != null ? F.a.c(drawable) : this.f3991d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3946a != null) {
            return new C0346o(this.f3946a.getConstantState());
        }
        this.f3989b.f3979a = getChangingConfigurations();
        return this.f3989b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3989b.f3980b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3989b.f3980b.f3973h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3989b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0345n c0345n = this.f3989b;
            if (c0345n != null) {
                C0344m c0344m = c0345n.f3980b;
                if (c0344m.f3977n == null) {
                    c0344m.f3977n = Boolean.valueOf(c0344m.f3972g.a());
                }
                if (c0344m.f3977n.booleanValue() || ((colorStateList = this.f3989b.f3981c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            C0345n c0345n = this.f3989b;
            C0345n c0345n2 = new C0345n();
            c0345n2.f3981c = null;
            c0345n2.f3982d = j;
            if (c0345n != null) {
                c0345n2.f3979a = c0345n.f3979a;
                C0344m c0344m = new C0344m(c0345n.f3980b);
                c0345n2.f3980b = c0344m;
                if (c0345n.f3980b.e != null) {
                    c0344m.e = new Paint(c0345n.f3980b.e);
                }
                if (c0345n.f3980b.f3970d != null) {
                    c0345n2.f3980b.f3970d = new Paint(c0345n.f3980b.f3970d);
                }
                c0345n2.f3981c = c0345n.f3981c;
                c0345n2.f3982d = c0345n.f3982d;
                c0345n2.e = c0345n.e;
            }
            this.f3989b = c0345n2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0345n c0345n = this.f3989b;
        ColorStateList colorStateList = c0345n.f3981c;
        if (colorStateList == null || (mode = c0345n.f3982d) == null) {
            z2 = false;
        } else {
            this.f3990c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0344m c0344m = c0345n.f3980b;
        if (c0344m.f3977n == null) {
            c0344m.f3977n = Boolean.valueOf(c0344m.f3972g.a());
        }
        if (c0344m.f3977n.booleanValue()) {
            boolean b2 = c0345n.f3980b.f3972g.b(iArr);
            c0345n.f3986k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3989b.f3980b.getRootAlpha() != i) {
            this.f3989b.f3980b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3989b.e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3991d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            H1.l.d0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            F.a.h(drawable, colorStateList);
            return;
        }
        C0345n c0345n = this.f3989b;
        if (c0345n.f3981c != colorStateList) {
            c0345n.f3981c = colorStateList;
            this.f3990c = a(colorStateList, c0345n.f3982d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            F.a.i(drawable, mode);
            return;
        }
        C0345n c0345n = this.f3989b;
        if (c0345n.f3982d != mode) {
            c0345n.f3982d = mode;
            this.f3990c = a(c0345n.f3981c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3946a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0344m c0344m;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f3946a;
        if (drawable != null) {
            F.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0345n c0345n = this.f3989b;
        c0345n.f3980b = new C0344m();
        TypedArray f2 = D.b.f(resources, theme, attributeSet, AbstractC0332a.f3930a);
        C0345n c0345n2 = this.f3989b;
        C0344m c0344m2 = c0345n2.f3980b;
        int i4 = !D.b.c(xmlPullParser, "tintMode") ? -1 : f2.getInt(6, -1);
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
        c0345n2.f3982d = mode;
        int i6 = 1;
        ColorStateList colorStateList = null;
        boolean z4 = false;
        if (D.b.c(xmlPullParser, "tint")) {
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
                ThreadLocal threadLocal = D.c.f166a;
                try {
                    colorStateList = D.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0345n2.f3981c = colorStateList2;
        }
        boolean z5 = c0345n2.e;
        if (D.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        c0345n2.e = z5;
        float f3 = c0344m2.j;
        if (D.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        c0344m2.j = f3;
        float f4 = c0344m2.f3974k;
        if (D.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        c0344m2.f3974k = f4;
        if (c0344m2.j <= 0.0f) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > 0.0f) {
            c0344m2.f3973h = f2.getDimension(3, c0344m2.f3973h);
            float dimension = f2.getDimension(2, c0344m2.i);
            c0344m2.i = dimension;
            if (c0344m2.f3973h <= 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c0344m2.getAlpha();
                if (D.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                c0344m2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    c0344m2.f3976m = string;
                    c0344m2.f3978o.put(string, c0344m2);
                }
                f2.recycle();
                c0345n.f3979a = getChangingConfigurations();
                c0345n.f3986k = true;
                C0345n c0345n3 = this.f3989b;
                C0344m c0344m3 = c0345n3.f3980b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0344m3.f3972g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0341j c0341j = (C0341j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        q.b bVar = c0344m3.f3978o;
                        if (equals) {
                            C0340i c0340i = new C0340i();
                            c0340i.e = 0.0f;
                            c0340i.f3949g = 1.0f;
                            c0340i.f3950h = 1.0f;
                            c0340i.i = 0.0f;
                            c0340i.j = 1.0f;
                            c0340i.f3951k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0340i.f3952l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c0340i.f3953m = join3;
                            c0344m = c0344m3;
                            c0340i.f3954n = 4.0f;
                            TypedArray f5 = D.b.f(resources, theme, attributeSet, AbstractC0332a.f3932c);
                            if (D.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    c0340i.f3964b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    c0340i.f3963a = AbstractC0058a.o(string3);
                                }
                                c0340i.f3948f = D.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = c0340i.f3950h;
                                if (D.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                c0340i.f3950h = f6;
                                int i8 = !D.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = c0340i.f3952l;
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
                                c0340i.f3952l = cap;
                                int i9 = !D.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = c0340i.f3953m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c0340i.f3953m = join2;
                                float f7 = c0340i.f3954n;
                                if (D.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                c0340i.f3954n = f7;
                                c0340i.f3947d = D.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = c0340i.f3949g;
                                if (D.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                c0340i.f3949g = f8;
                                float f9 = c0340i.e;
                                if (D.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                c0340i.e = f9;
                                float f10 = c0340i.j;
                                if (D.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                c0340i.j = f10;
                                float f11 = c0340i.f3951k;
                                if (D.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                c0340i.f3951k = f11;
                                float f12 = c0340i.i;
                                if (D.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                c0340i.i = f12;
                                int i10 = c0340i.f3965c;
                                if (D.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                c0340i.f3965c = i10;
                            }
                            f5.recycle();
                            c0341j.f3956b.add(c0340i);
                            if (c0340i.getPathName() != null) {
                                bVar.put(c0340i.getPathName(), c0340i);
                            }
                            c0345n3.f3979a = c0345n3.f3979a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            c0344m = c0344m3;
                            if ("clip-path".equals(name)) {
                                C0339h c0339h = new C0339h();
                                if (D.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = D.b.f(resources, theme, attributeSet, AbstractC0332a.f3933d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        c0339h.f3964b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        c0339h.f3963a = AbstractC0058a.o(string5);
                                    }
                                    c0339h.f3965c = !D.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                c0341j.f3956b.add(c0339h);
                                if (c0339h.getPathName() != null) {
                                    bVar.put(c0339h.getPathName(), c0339h);
                                }
                                c0345n3.f3979a = c0345n3.f3979a;
                            } else if ("group".equals(name)) {
                                C0341j c0341j2 = new C0341j();
                                TypedArray f14 = D.b.f(resources, theme, attributeSet, AbstractC0332a.f3931b);
                                float f15 = c0341j2.f3957c;
                                if (D.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                c0341j2.f3957c = f15;
                                i2 = 1;
                                c0341j2.f3958d = f14.getFloat(1, c0341j2.f3958d);
                                c0341j2.e = f14.getFloat(2, c0341j2.e);
                                float f16 = c0341j2.f3959f;
                                if (D.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                c0341j2.f3959f = f16;
                                float f17 = c0341j2.f3960g;
                                if (D.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                c0341j2.f3960g = f17;
                                float f18 = c0341j2.f3961h;
                                if (D.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                c0341j2.f3961h = f18;
                                float f19 = c0341j2.i;
                                if (D.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                c0341j2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    c0341j2.f3962k = string6;
                                }
                                c0341j2.c();
                                f14.recycle();
                                c0341j.f3956b.add(c0341j2);
                                arrayDeque.push(c0341j2);
                                if (c0341j2.getGroupName() != null) {
                                    bVar.put(c0341j2.getGroupName(), c0341j2);
                                }
                                c0345n3.f3979a = c0345n3.f3979a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        c0344m = c0344m3;
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
                    c0344m3 = c0344m;
                }
                if (!z6) {
                    this.f3990c = a(c0345n.f3981c, c0345n.f3982d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0347p(C0345n c0345n) {
        this.f3992f = true;
        this.f3993g = new float[9];
        this.f3994h = new Matrix();
        this.i = new Rect();
        this.f3989b = c0345n;
        this.f3990c = a(c0345n.f3981c, c0345n.f3982d);
    }
}
