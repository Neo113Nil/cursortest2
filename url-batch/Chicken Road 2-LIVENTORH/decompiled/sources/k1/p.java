package k1;

import a.y;
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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: o, reason: collision with root package name */
    public static final PorterDuff.Mode f2222o = PorterDuff.Mode.SRC_IN;

    /* renamed from: g, reason: collision with root package name */
    public n f2223g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuffColorFilter f2224h;
    public ColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2225j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2226k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f2227l;

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f2228m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f2229n;

    public p() {
        this.f2226k = true;
        this.f2227l = new float[9];
        this.f2228m = new Matrix();
        this.f2229n = new Rect();
        n nVar = new n();
        nVar.f2213c = null;
        nVar.d = f2222o;
        nVar.f2212b = new m();
        this.f2223g = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2175f;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f2229n;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.i;
        if (colorFilter == null) {
            colorFilter = this.f2224h;
        }
        Matrix matrix = this.f2228m;
        canvas.getMatrix(matrix);
        float[] fArr = this.f2227l;
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
        n nVar = this.f2223g;
        Bitmap bitmap = nVar.f2215f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f2215f.getHeight()) {
            nVar.f2215f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.f2219k = true;
        }
        if (this.f2226k) {
            n nVar2 = this.f2223g;
            if (nVar2.f2219k || nVar2.f2216g != nVar2.f2213c || nVar2.f2217h != nVar2.d || nVar2.f2218j != nVar2.f2214e || nVar2.i != nVar2.f2212b.getRootAlpha()) {
                n nVar3 = this.f2223g;
                nVar3.f2215f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f2215f);
                m mVar = nVar3.f2212b;
                mVar.a(mVar.f2203g, m.f2197p, canvas2, min, min2);
                n nVar4 = this.f2223g;
                nVar4.f2216g = nVar4.f2213c;
                nVar4.f2217h = nVar4.d;
                nVar4.i = nVar4.f2212b.getRootAlpha();
                nVar4.f2218j = nVar4.f2214e;
                nVar4.f2219k = false;
            }
        } else {
            n nVar5 = this.f2223g;
            nVar5.f2215f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f2215f);
            m mVar2 = nVar5.f2212b;
            mVar2.a(mVar2.f2203g, m.f2197p, canvas3, min, min2);
        }
        n nVar6 = this.f2223g;
        if (nVar6.f2212b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f2220l == null) {
                Paint paint2 = new Paint();
                nVar6.f2220l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f2220l.setAlpha(nVar6.f2212b.getRootAlpha());
            nVar6.f2220l.setColorFilter(colorFilter);
            paint = nVar6.f2220l;
        }
        canvas.drawBitmap(nVar6.f2215f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.getAlpha() : this.f2223g.f2212b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2223g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.getColorFilter() : this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2175f != null) {
            return new o(this.f2175f.getConstantState());
        }
        this.f2223g.f2211a = getChangingConfigurations();
        return this.f2223g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2223g.f2212b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2223g.f2212b.f2204h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.isAutoMirrored() : this.f2223g.f2214e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.f2223g;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f2212b;
        if (mVar.f2209n == null) {
            mVar.f2209n = Boolean.valueOf(mVar.f2203g.a());
        }
        if (mVar.f2209n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f2223g.f2213c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2225j && super.mutate() == this) {
            n nVar = this.f2223g;
            n nVar2 = new n();
            nVar2.f2213c = null;
            nVar2.d = f2222o;
            if (nVar != null) {
                nVar2.f2211a = nVar.f2211a;
                m mVar = new m(nVar.f2212b);
                nVar2.f2212b = mVar;
                if (nVar.f2212b.f2201e != null) {
                    mVar.f2201e = new Paint(nVar.f2212b.f2201e);
                }
                if (nVar.f2212b.d != null) {
                    nVar2.f2212b.d = new Paint(nVar.f2212b.d);
                }
                nVar2.f2213c = nVar.f2213c;
                nVar2.d = nVar.d;
                nVar2.f2214e = nVar.f2214e;
            }
            this.f2223g = nVar2;
            this.f2225j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f2223g;
        ColorStateList colorStateList = nVar.f2213c;
        if (colorStateList == null || (mode = nVar.d) == null) {
            z3 = false;
        } else {
            this.f2224h = a(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        m mVar = nVar.f2212b;
        if (mVar.f2209n == null) {
            mVar.f2209n = Boolean.valueOf(mVar.f2203g.a());
        }
        if (mVar.f2209n.booleanValue()) {
            boolean b4 = nVar.f2212b.f2203g.b(iArr);
            nVar.f2219k |= b4;
            if (b4) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f2223g.f2212b.getRootAlpha() != i) {
            this.f2223g.f2212b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f2223g.f2214e = z3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.i = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            y.T(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f2223g;
        if (nVar.f2213c != colorStateList) {
            nVar.f2213c = colorStateList;
            this.f2224h = a(colorStateList, nVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f2223g;
        if (nVar.d != mode) {
            nVar.d = mode;
            this.f2224h = a(nVar.f2213c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f2175f;
        return drawable != null ? drawable.setVisible(z3, z4) : super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        char c4;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f2175f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f2223g;
        nVar.f2212b = new m();
        TypedArray f2 = e0.b.f(resources, theme, attributeSet, a.f2160a);
        n nVar2 = this.f2223g;
        m mVar = nVar2.f2212b;
        int i5 = !e0.b.c(xmlPullParser, "tintMode") ? -1 : f2.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
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
        nVar2.d = mode;
        ColorStateList colorStateList = null;
        int i6 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
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
                ThreadLocal threadLocal = e0.c.f1137a;
                try {
                    colorStateList = e0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e4) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f2213c = colorStateList2;
        }
        boolean z3 = nVar2.f2214e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z3 = f2.getBoolean(5, z3);
        }
        nVar2.f2214e = z3;
        float f4 = mVar.f2205j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f4 = f2.getFloat(7, f4);
        }
        mVar.f2205j = f4;
        float f5 = mVar.f2206k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f5 = f2.getFloat(8, f5);
        }
        mVar.f2206k = f5;
        if (mVar.f2205j <= 0.0f) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f5 > 0.0f) {
            mVar.f2204h = f2.getDimension(3, mVar.f2204h);
            float dimension = f2.getDimension(2, mVar.i);
            mVar.i = dimension;
            if (mVar.f2204h <= 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f2.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    mVar.f2208m = string;
                    mVar.f2210o.put(string, mVar);
                }
                f2.recycle();
                nVar.f2211a = getChangingConfigurations();
                nVar.f2219k = true;
                n nVar3 = this.f2223g;
                m mVar2 = nVar3.f2212b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f2203g;
                q.f fVar = mVar2.f2210o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            i iVar = new i();
                            iVar.f2176e = 0.0f;
                            iVar.f2178g = 1.0f;
                            iVar.f2179h = 1.0f;
                            iVar.i = 0.0f;
                            iVar.f2180j = 1.0f;
                            iVar.f2181k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f2182l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            iVar.f2183m = join2;
                            iVar.f2184n = 4.0f;
                            TypedArray f6 = e0.b.f(resources, theme, attributeSet, a.f2162c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f6.getString(0);
                                if (string2 != null) {
                                    iVar.f2195b = string2;
                                }
                                String string3 = f6.getString(2);
                                if (string3 != null) {
                                    iVar.f2194a = y.w(string3);
                                }
                                iVar.f2177f = e0.b.b(f6, xmlPullParser, theme, "fillColor", 1);
                                float f7 = iVar.f2179h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f7 = f6.getFloat(12, f7);
                                }
                                iVar.f2179h = f7;
                                int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f6.getInt(8, -1) : -1;
                                Paint.Cap cap3 = iVar.f2182l;
                                if (i8 == 0) {
                                    cap = cap2;
                                } else if (i8 != 1) {
                                    cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                iVar.f2182l = cap;
                                int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f6.getInt(9, -1) : -1;
                                Paint.Join join3 = iVar.f2183m;
                                if (i9 == 0) {
                                    join = join2;
                                } else if (i9 != 1) {
                                    join = i9 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                iVar.f2183m = join;
                                float f8 = iVar.f2184n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f8 = f6.getFloat(10, f8);
                                }
                                iVar.f2184n = f8;
                                iVar.d = e0.b.b(f6, xmlPullParser, theme, "strokeColor", 3);
                                float f9 = iVar.f2178g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f9 = f6.getFloat(11, f9);
                                }
                                iVar.f2178g = f9;
                                float f10 = iVar.f2176e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f10 = f6.getFloat(4, f10);
                                }
                                iVar.f2176e = f10;
                                float f11 = iVar.f2180j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f11 = f6.getFloat(6, f11);
                                }
                                iVar.f2180j = f11;
                                float f12 = iVar.f2181k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f12 = f6.getFloat(7, f12);
                                }
                                iVar.f2181k = f12;
                                float f13 = iVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f13 = f6.getFloat(5, f13);
                                }
                                iVar.i = f13;
                                int i10 = iVar.f2196c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i10 = f6.getInt(13, i10);
                                }
                                iVar.f2196c = i10;
                            }
                            f6.recycle();
                            jVar2.f2186b.add(iVar);
                            if (iVar.getPathName() != null) {
                                fVar.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f2211a = nVar3.f2211a;
                            z4 = false;
                            c4 = '\b';
                        } else {
                            c4 = '\b';
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f14 = e0.b.f(resources, theme, attributeSet, a.d);
                                    String string4 = f14.getString(0);
                                    if (string4 != null) {
                                        hVar.f2195b = string4;
                                    }
                                    String string5 = f14.getString(1);
                                    if (string5 != null) {
                                        hVar.f2194a = y.w(string5);
                                    }
                                    hVar.f2196c = !e0.b.c(xmlPullParser, "fillType") ? 0 : f14.getInt(2, 0);
                                    f14.recycle();
                                }
                                jVar2.f2186b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    fVar.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f2211a = nVar3.f2211a;
                            } else if ("group".equals(name)) {
                                j jVar3 = new j();
                                TypedArray f15 = e0.b.f(resources, theme, attributeSet, a.f2161b);
                                float f16 = jVar3.f2187c;
                                if (e0.b.c(xmlPullParser, "rotation")) {
                                    f16 = f15.getFloat(5, f16);
                                }
                                jVar3.f2187c = f16;
                                jVar3.d = f15.getFloat(1, jVar3.d);
                                jVar3.f2188e = f15.getFloat(2, jVar3.f2188e);
                                float f17 = jVar3.f2189f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f17 = f15.getFloat(3, f17);
                                }
                                jVar3.f2189f = f17;
                                float f18 = jVar3.f2190g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f18 = f15.getFloat(4, f18);
                                }
                                jVar3.f2190g = f18;
                                float f19 = jVar3.f2191h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f19 = f15.getFloat(6, f19);
                                }
                                jVar3.f2191h = f19;
                                float f20 = jVar3.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f20 = f15.getFloat(7, f20);
                                }
                                jVar3.i = f20;
                                String string6 = f15.getString(0);
                                if (string6 != null) {
                                    jVar3.f2193k = string6;
                                }
                                jVar3.c();
                                f15.recycle();
                                jVar2.f2186b.add(jVar3);
                                arrayDeque.push(jVar3);
                                if (jVar3.getGroupName() != null) {
                                    fVar.put(jVar3.getGroupName(), jVar3);
                                }
                                nVar3.f2211a = nVar3.f2211a;
                            }
                        }
                        i4 = 1;
                    } else {
                        i = depth;
                        c4 = '\b';
                        i4 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i6 = i4;
                    depth = i;
                }
                if (!z4) {
                    this.f2224h = a(nVar.f2213c, nVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f2226k = true;
        this.f2227l = new float[9];
        this.f2228m = new Matrix();
        this.f2229n = new Rect();
        this.f2223g = nVar;
        this.f2224h = a(nVar.f2213c, nVar.d);
    }
}
