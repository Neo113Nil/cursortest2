package S;

import a.AbstractC0132a;
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
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import n.C0268a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.AbstractC0291b;
import s.AbstractC0292c;
import u.AbstractC0309a;

/* loaded from: classes.dex */
public final class q extends h {

    /* renamed from: n, reason: collision with root package name */
    public static final PorterDuff.Mode f1063n = PorterDuff.Mode.SRC_IN;

    /* renamed from: f, reason: collision with root package name */
    public o f1064f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuffColorFilter f1065g;

    /* renamed from: h, reason: collision with root package name */
    public ColorFilter f1066h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1067i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1068j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f1069k;

    /* renamed from: l, reason: collision with root package name */
    public final Matrix f1070l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1071m;

    public q() {
        this.f1068j = true;
        this.f1069k = new float[9];
        this.f1070l = new Matrix();
        this.f1071m = new Rect();
        o oVar = new o();
        oVar.f1052c = null;
        oVar.f1053d = f1063n;
        oVar.f1051b = new n();
        this.f1064f = oVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1008e;
        if (drawable == null) {
            return false;
        }
        AbstractC0309a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f1071m;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1066h;
        if (colorFilter == null) {
            colorFilter = this.f1065g;
        }
        Matrix matrix = this.f1070l;
        canvas.getMatrix(matrix);
        float[] fArr = this.f1069k;
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
        if (isAutoMirrored() && w0.j.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.f1064f;
        Bitmap bitmap = oVar.f1055f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != oVar.f1055f.getHeight()) {
            oVar.f1055f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            oVar.f1060k = true;
        }
        if (this.f1068j) {
            o oVar2 = this.f1064f;
            if (oVar2.f1060k || oVar2.f1056g != oVar2.f1052c || oVar2.f1057h != oVar2.f1053d || oVar2.f1059j != oVar2.f1054e || oVar2.f1058i != oVar2.f1051b.getRootAlpha()) {
                o oVar3 = this.f1064f;
                oVar3.f1055f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f1055f);
                n nVar = oVar3.f1051b;
                nVar.a(nVar.f1041g, n.f1034p, canvas2, min, min2);
                o oVar4 = this.f1064f;
                oVar4.f1056g = oVar4.f1052c;
                oVar4.f1057h = oVar4.f1053d;
                oVar4.f1058i = oVar4.f1051b.getRootAlpha();
                oVar4.f1059j = oVar4.f1054e;
                oVar4.f1060k = false;
            }
        } else {
            o oVar5 = this.f1064f;
            oVar5.f1055f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f1055f);
            n nVar2 = oVar5.f1051b;
            nVar2.a(nVar2.f1041g, n.f1034p, canvas3, min, min2);
        }
        o oVar6 = this.f1064f;
        if (oVar6.f1051b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.f1061l == null) {
                Paint paint2 = new Paint();
                oVar6.f1061l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.f1061l.setAlpha(oVar6.f1051b.getRootAlpha());
            oVar6.f1061l.setColorFilter(colorFilter);
            paint = oVar6.f1061l;
        }
        canvas.drawBitmap(oVar6.f1055f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.getAlpha() : this.f1064f.f1051b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1064f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1008e;
        return drawable != null ? AbstractC0309a.c(drawable) : this.f1066h;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1008e != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f1008e.getConstantState());
        }
        this.f1064f.f1050a = getChangingConfigurations();
        return this.f1064f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1064f.f1051b.f1043i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1064f.f1051b.f1042h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.isAutoMirrored() : this.f1064f.f1054e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            o oVar = this.f1064f;
            if (oVar != null) {
                n nVar = oVar.f1051b;
                if (nVar.f1048n == null) {
                    nVar.f1048n = Boolean.valueOf(nVar.f1041g.a());
                }
                if (nVar.f1048n.booleanValue() || ((colorStateList = this.f1064f.f1052c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1067i && super.mutate() == this) {
            o oVar = this.f1064f;
            o oVar2 = new o();
            oVar2.f1052c = null;
            oVar2.f1053d = f1063n;
            if (oVar != null) {
                oVar2.f1050a = oVar.f1050a;
                n nVar = new n(oVar.f1051b);
                oVar2.f1051b = nVar;
                if (oVar.f1051b.f1039e != null) {
                    nVar.f1039e = new Paint(oVar.f1051b.f1039e);
                }
                if (oVar.f1051b.f1038d != null) {
                    oVar2.f1051b.f1038d = new Paint(oVar.f1051b.f1038d);
                }
                oVar2.f1052c = oVar.f1052c;
                oVar2.f1053d = oVar.f1053d;
                oVar2.f1054e = oVar.f1054e;
            }
            this.f1064f = oVar2;
            this.f1067i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f1064f;
        ColorStateList colorStateList = oVar.f1052c;
        if (colorStateList == null || (mode = oVar.f1053d) == null) {
            z2 = false;
        } else {
            this.f1065g = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        n nVar = oVar.f1051b;
        if (nVar.f1048n == null) {
            nVar.f1048n = Boolean.valueOf(nVar.f1041g.a());
        }
        if (nVar.f1048n.booleanValue()) {
            boolean b2 = oVar.f1051b.f1041g.b(iArr);
            oVar.f1060k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f1064f.f1051b.getRootAlpha() != i2) {
            this.f1064f.f1051b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f1064f.f1054e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1066h = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            w0.j.b(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            AbstractC0309a.h(drawable, colorStateList);
            return;
        }
        o oVar = this.f1064f;
        if (oVar.f1052c != colorStateList) {
            oVar.f1052c = colorStateList;
            this.f1065g = a(colorStateList, oVar.f1053d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            AbstractC0309a.i(drawable, mode);
            return;
        }
        o oVar = this.f1064f;
        if (oVar.f1053d != mode) {
            oVar.f1053d = mode;
            this.f1065g = a(oVar.f1052c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f1008e;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        n nVar;
        int i2;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f1008e;
        if (drawable != null) {
            AbstractC0309a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f1064f;
        oVar.f1051b = new n();
        TypedArray h2 = AbstractC0291b.h(resources, theme, attributeSet, a.f985a);
        o oVar2 = this.f1064f;
        n nVar2 = oVar2.f1051b;
        int i3 = !AbstractC0291b.e(xmlPullParser, "tintMode") ? -1 : h2.getInt(6, -1);
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
        oVar2.f1053d = mode;
        int i4 = 1;
        ColorStateList colorStateList = null;
        if (AbstractC0291b.e(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            h2.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = h2.getResources();
                int resourceId = h2.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0292c.f3404a;
                try {
                    colorStateList = AbstractC0292c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            oVar2.f1052c = colorStateList2;
        }
        boolean z2 = oVar2.f1054e;
        if (AbstractC0291b.e(xmlPullParser, "autoMirrored")) {
            z2 = h2.getBoolean(5, z2);
        }
        oVar2.f1054e = z2;
        float f2 = nVar2.f1044j;
        if (AbstractC0291b.e(xmlPullParser, "viewportWidth")) {
            f2 = h2.getFloat(7, f2);
        }
        nVar2.f1044j = f2;
        float f3 = nVar2.f1045k;
        if (AbstractC0291b.e(xmlPullParser, "viewportHeight")) {
            f3 = h2.getFloat(8, f3);
        }
        nVar2.f1045k = f3;
        if (nVar2.f1044j <= 0.0f) {
            throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 > 0.0f) {
            nVar2.f1042h = h2.getDimension(3, nVar2.f1042h);
            float dimension = h2.getDimension(2, nVar2.f1043i);
            nVar2.f1043i = dimension;
            if (nVar2.f1042h <= 0.0f) {
                throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = nVar2.getAlpha();
                if (AbstractC0291b.e(xmlPullParser, "alpha")) {
                    alpha = h2.getFloat(4, alpha);
                }
                nVar2.setAlpha(alpha);
                String string = h2.getString(0);
                if (string != null) {
                    nVar2.f1047m = string;
                    nVar2.f1049o.put(string, nVar2);
                }
                h2.recycle();
                oVar.f1050a = getChangingConfigurations();
                oVar.f1060k = true;
                o oVar3 = this.f1064f;
                n nVar3 = oVar3.f1051b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nVar3.f1041g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z3 = true;
                for (int i6 = 3; eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != i6); i6 = 3) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar = (k) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i2 = depth;
                        C0268a c0268a = nVar3.f1049o;
                        if (equals) {
                            j jVar = new j();
                            jVar.f1010e = 0.0f;
                            jVar.f1012g = 1.0f;
                            jVar.f1013h = 1.0f;
                            jVar.f1014i = 0.0f;
                            jVar.f1015j = 1.0f;
                            jVar.f1016k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            jVar.f1017l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            jVar.f1018m = join3;
                            nVar = nVar3;
                            jVar.f1019n = 4.0f;
                            TypedArray h3 = AbstractC0291b.h(resources, theme, attributeSet, a.f987c);
                            if (AbstractC0291b.e(xmlPullParser, "pathData")) {
                                String string2 = h3.getString(0);
                                if (string2 != null) {
                                    jVar.f1032b = string2;
                                }
                                String string3 = h3.getString(2);
                                if (string3 != null) {
                                    jVar.f1031a = AbstractC0132a.p(string3);
                                }
                                jVar.f1011f = AbstractC0291b.b(h3, xmlPullParser, theme, "fillColor", 1);
                                float f4 = jVar.f1013h;
                                if (AbstractC0291b.e(xmlPullParser, "fillAlpha")) {
                                    f4 = h3.getFloat(12, f4);
                                }
                                jVar.f1013h = f4;
                                int i7 = !AbstractC0291b.e(xmlPullParser, "strokeLineCap") ? -1 : h3.getInt(8, -1);
                                Paint.Cap cap3 = jVar.f1017l;
                                if (i7 != 0) {
                                    join = join3;
                                    if (i7 != 1) {
                                        cap = i7 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                jVar.f1017l = cap;
                                int i8 = !AbstractC0291b.e(xmlPullParser, "strokeLineJoin") ? -1 : h3.getInt(9, -1);
                                Paint.Join join4 = jVar.f1018m;
                                if (i8 == 0) {
                                    join2 = join;
                                } else if (i8 != 1) {
                                    join2 = i8 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                jVar.f1018m = join2;
                                float f5 = jVar.f1019n;
                                if (AbstractC0291b.e(xmlPullParser, "strokeMiterLimit")) {
                                    f5 = h3.getFloat(10, f5);
                                }
                                jVar.f1019n = f5;
                                jVar.f1009d = AbstractC0291b.b(h3, xmlPullParser, theme, "strokeColor", 3);
                                float f6 = jVar.f1012g;
                                if (AbstractC0291b.e(xmlPullParser, "strokeAlpha")) {
                                    f6 = h3.getFloat(11, f6);
                                }
                                jVar.f1012g = f6;
                                float f7 = jVar.f1010e;
                                if (AbstractC0291b.e(xmlPullParser, "strokeWidth")) {
                                    f7 = h3.getFloat(4, f7);
                                }
                                jVar.f1010e = f7;
                                float f8 = jVar.f1015j;
                                if (AbstractC0291b.e(xmlPullParser, "trimPathEnd")) {
                                    f8 = h3.getFloat(6, f8);
                                }
                                jVar.f1015j = f8;
                                float f9 = jVar.f1016k;
                                if (AbstractC0291b.e(xmlPullParser, "trimPathOffset")) {
                                    f9 = h3.getFloat(7, f9);
                                }
                                jVar.f1016k = f9;
                                float f10 = jVar.f1014i;
                                if (AbstractC0291b.e(xmlPullParser, "trimPathStart")) {
                                    f10 = h3.getFloat(5, f10);
                                }
                                jVar.f1014i = f10;
                                int i9 = jVar.f1033c;
                                if (AbstractC0291b.e(xmlPullParser, "fillType")) {
                                    i9 = h3.getInt(13, i9);
                                }
                                jVar.f1033c = i9;
                            }
                            h3.recycle();
                            kVar.f1021b.add(jVar);
                            if (jVar.getPathName() != null) {
                                c0268a.put(jVar.getPathName(), jVar);
                            }
                            oVar3.f1050a = oVar3.f1050a;
                            z3 = false;
                        } else {
                            nVar = nVar3;
                            if ("clip-path".equals(name)) {
                                i iVar = new i();
                                if (AbstractC0291b.e(xmlPullParser, "pathData")) {
                                    TypedArray h4 = AbstractC0291b.h(resources, theme, attributeSet, a.f988d);
                                    String string4 = h4.getString(0);
                                    if (string4 != null) {
                                        iVar.f1032b = string4;
                                    }
                                    String string5 = h4.getString(1);
                                    if (string5 != null) {
                                        iVar.f1031a = AbstractC0132a.p(string5);
                                    }
                                    iVar.f1033c = !AbstractC0291b.e(xmlPullParser, "fillType") ? 0 : h4.getInt(2, 0);
                                    h4.recycle();
                                }
                                kVar.f1021b.add(iVar);
                                if (iVar.getPathName() != null) {
                                    c0268a.put(iVar.getPathName(), iVar);
                                }
                                oVar3.f1050a = oVar3.f1050a;
                            } else if ("group".equals(name)) {
                                k kVar2 = new k();
                                TypedArray h5 = AbstractC0291b.h(resources, theme, attributeSet, a.f986b);
                                float f11 = kVar2.f1022c;
                                if (AbstractC0291b.e(xmlPullParser, "rotation")) {
                                    f11 = h5.getFloat(5, f11);
                                }
                                kVar2.f1022c = f11;
                                kVar2.f1023d = h5.getFloat(1, kVar2.f1023d);
                                kVar2.f1024e = h5.getFloat(2, kVar2.f1024e);
                                float f12 = kVar2.f1025f;
                                if (AbstractC0291b.e(xmlPullParser, "scaleX")) {
                                    f12 = h5.getFloat(3, f12);
                                }
                                kVar2.f1025f = f12;
                                float f13 = kVar2.f1026g;
                                if (AbstractC0291b.e(xmlPullParser, "scaleY")) {
                                    f13 = h5.getFloat(4, f13);
                                }
                                kVar2.f1026g = f13;
                                float f14 = kVar2.f1027h;
                                if (AbstractC0291b.e(xmlPullParser, "translateX")) {
                                    f14 = h5.getFloat(6, f14);
                                }
                                kVar2.f1027h = f14;
                                float f15 = kVar2.f1028i;
                                if (AbstractC0291b.e(xmlPullParser, "translateY")) {
                                    f15 = h5.getFloat(7, f15);
                                }
                                kVar2.f1028i = f15;
                                String string6 = h5.getString(0);
                                if (string6 != null) {
                                    kVar2.f1030k = string6;
                                }
                                kVar2.c();
                                h5.recycle();
                                kVar.f1021b.add(kVar2);
                                arrayDeque.push(kVar2);
                                if (kVar2.getGroupName() != null) {
                                    c0268a.put(kVar2.getGroupName(), kVar2);
                                }
                                oVar3.f1050a = oVar3.f1050a;
                            }
                        }
                    } else {
                        nVar = nVar3;
                        i2 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i2;
                    nVar3 = nVar;
                    i4 = 1;
                }
                if (!z3) {
                    this.f1065g = a(oVar.f1052c, oVar.f1053d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q(o oVar) {
        this.f1068j = true;
        this.f1069k = new float[9];
        this.f1070l = new Matrix();
        this.f1071m = new Rect();
        this.f1064f = oVar;
        this.f1065g = a(oVar.f1052c, oVar.f1053d);
    }
}
