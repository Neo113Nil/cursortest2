package l1;

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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o extends f {

    /* renamed from: o, reason: collision with root package name */
    public static final PorterDuff.Mode f2692o = PorterDuff.Mode.SRC_IN;

    /* renamed from: g, reason: collision with root package name */
    public m f2693g;
    public PorterDuffColorFilter h;
    public ColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2694j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2695k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f2696l;

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f2697m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f2698n;

    public o() {
        this.f2695k = true;
        this.f2696l = new float[9];
        this.f2697m = new Matrix();
        this.f2698n = new Rect();
        m mVar = new m();
        mVar.f2684c = null;
        mVar.d = f2692o;
        mVar.f2683b = new l();
        this.f2693g = mVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2649f;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f2698n;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.i;
        if (colorFilter == null) {
            colorFilter = this.h;
        }
        Matrix matrix = this.f2697m;
        canvas.getMatrix(matrix);
        float[] fArr = this.f2696l;
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
        m mVar = this.f2693g;
        Bitmap bitmap = mVar.f2686f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != mVar.f2686f.getHeight()) {
            mVar.f2686f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            mVar.f2689k = true;
        }
        if (this.f2695k) {
            m mVar2 = this.f2693g;
            if (mVar2.f2689k || mVar2.f2687g != mVar2.f2684c || mVar2.h != mVar2.d || mVar2.f2688j != mVar2.f2685e || mVar2.i != mVar2.f2683b.getRootAlpha()) {
                m mVar3 = this.f2693g;
                mVar3.f2686f.eraseColor(0);
                Canvas canvas2 = new Canvas(mVar3.f2686f);
                l lVar = mVar3.f2683b;
                lVar.a(lVar.f2675g, l.f2669p, canvas2, min, min2);
                m mVar4 = this.f2693g;
                mVar4.f2687g = mVar4.f2684c;
                mVar4.h = mVar4.d;
                mVar4.i = mVar4.f2683b.getRootAlpha();
                mVar4.f2688j = mVar4.f2685e;
                mVar4.f2689k = false;
            }
        } else {
            m mVar5 = this.f2693g;
            mVar5.f2686f.eraseColor(0);
            Canvas canvas3 = new Canvas(mVar5.f2686f);
            l lVar2 = mVar5.f2683b;
            lVar2.a(lVar2.f2675g, l.f2669p, canvas3, min, min2);
        }
        m mVar6 = this.f2693g;
        if (mVar6.f2683b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (mVar6.f2690l == null) {
                Paint paint2 = new Paint();
                mVar6.f2690l = paint2;
                paint2.setFilterBitmap(true);
            }
            mVar6.f2690l.setAlpha(mVar6.f2683b.getRootAlpha());
            mVar6.f2690l.setColorFilter(colorFilter);
            paint = mVar6.f2690l;
        }
        canvas.drawBitmap(mVar6.f2686f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.getAlpha() : this.f2693g.f2683b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2693g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.getColorFilter() : this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2649f != null) {
            return new n(this.f2649f.getConstantState());
        }
        this.f2693g.f2682a = getChangingConfigurations();
        return this.f2693g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2693g.f2683b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2693g.f2683b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.isAutoMirrored() : this.f2693g.f2685e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        m mVar = this.f2693g;
        if (mVar == null) {
            return false;
        }
        l lVar = mVar.f2683b;
        if (lVar.f2680n == null) {
            lVar.f2680n = Boolean.valueOf(lVar.f2675g.a());
        }
        if (lVar.f2680n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f2693g.f2684c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2694j && super.mutate() == this) {
            m mVar = this.f2693g;
            m mVar2 = new m();
            mVar2.f2684c = null;
            mVar2.d = f2692o;
            if (mVar != null) {
                mVar2.f2682a = mVar.f2682a;
                l lVar = new l(mVar.f2683b);
                mVar2.f2683b = lVar;
                if (mVar.f2683b.f2673e != null) {
                    lVar.f2673e = new Paint(mVar.f2683b.f2673e);
                }
                if (mVar.f2683b.d != null) {
                    mVar2.f2683b.d = new Paint(mVar.f2683b.d);
                }
                mVar2.f2684c = mVar.f2684c;
                mVar2.d = mVar.d;
                mVar2.f2685e = mVar.f2685e;
            }
            this.f2693g = mVar2;
            this.f2694j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z4;
        PorterDuff.Mode mode;
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.f2693g;
        ColorStateList colorStateList = mVar.f2684c;
        if (colorStateList == null || (mode = mVar.d) == null) {
            z4 = false;
        } else {
            this.h = a(colorStateList, mode);
            invalidateSelf();
            z4 = true;
        }
        l lVar = mVar.f2683b;
        if (lVar.f2680n == null) {
            lVar.f2680n = Boolean.valueOf(lVar.f2675g.a());
        }
        if (lVar.f2680n.booleanValue()) {
            boolean b2 = mVar.f2683b.f2675g.b(iArr);
            mVar.f2689k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f2693g.f2683b.getRootAlpha() != i) {
            this.f2693g.f2683b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f2693g.f2685e = z4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.i = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        m mVar = this.f2693g;
        if (mVar.f2684c != colorStateList) {
            mVar.f2684c = colorStateList;
            this.h = a(colorStateList, mVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        m mVar = this.f2693g;
        if (mVar.d != mode) {
            mVar.d = mode;
            this.h = a(mVar.f2684c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f2649f;
        return drawable != null ? drawable.setVisible(z4, z5) : super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        char c5;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f2649f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.f2693g;
        mVar.f2683b = new l();
        TypedArray f5 = e0.b.f(resources, theme, attributeSet, a.f2636a);
        m mVar2 = this.f2693g;
        l lVar = mVar2.f2683b;
        int i5 = !e0.b.c(xmlPullParser, "tintMode") ? -1 : f5.getInt(6, -1);
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
        mVar2.d = mode;
        ColorStateList colorStateList = null;
        int i6 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f5.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i7 >= 28 && i7 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f5.getResources();
                int resourceId = f5.getResourceId(1, 0);
                ThreadLocal threadLocal = e0.c.f1319a;
                try {
                    colorStateList = e0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e4) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            mVar2.f2684c = colorStateList2;
        }
        boolean z4 = mVar2.f2685e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z4 = f5.getBoolean(5, z4);
        }
        mVar2.f2685e = z4;
        float f6 = lVar.f2676j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f6 = f5.getFloat(7, f6);
        }
        lVar.f2676j = f6;
        float f7 = lVar.f2677k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f7 = f5.getFloat(8, f7);
        }
        lVar.f2677k = f7;
        if (lVar.f2676j <= 0.0f) {
            throw new XmlPullParserException(f5.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f7 > 0.0f) {
            lVar.h = f5.getDimension(3, lVar.h);
            float dimension = f5.getDimension(2, lVar.i);
            lVar.i = dimension;
            if (lVar.h <= 0.0f) {
                throw new XmlPullParserException(f5.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = lVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f5.getFloat(4, alpha);
                }
                lVar.setAlpha(alpha);
                String string = f5.getString(0);
                if (string != null) {
                    lVar.f2679m = string;
                    lVar.f2681o.put(string, lVar);
                }
                f5.recycle();
                mVar.f2682a = getChangingConfigurations();
                mVar.f2689k = true;
                m mVar3 = this.f2693g;
                l lVar2 = mVar3.f2683b;
                ArrayDeque arrayDeque = new ArrayDeque();
                i iVar = lVar2.f2675g;
                q.f fVar = lVar2.f2681o;
                arrayDeque.push(iVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z5 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        i iVar2 = (i) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            h hVar = new h();
                            hVar.f2650e = 0.0f;
                            hVar.f2652g = 1.0f;
                            hVar.h = 1.0f;
                            hVar.i = 0.0f;
                            hVar.f2653j = 1.0f;
                            hVar.f2654k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            hVar.f2655l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            hVar.f2656m = join2;
                            hVar.f2657n = 4.0f;
                            TypedArray f8 = e0.b.f(resources, theme, attributeSet, a.f2638c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f8.getString(0);
                                if (string2 != null) {
                                    hVar.f2667b = string2;
                                }
                                String string3 = f8.getString(2);
                                if (string3 != null) {
                                    hVar.f2666a = b4.l.o(string3);
                                }
                                hVar.f2651f = e0.b.b(f8, xmlPullParser, theme, "fillColor", 1);
                                float f9 = hVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f9 = f8.getFloat(12, f9);
                                }
                                hVar.h = f9;
                                int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f8.getInt(8, -1) : -1;
                                Paint.Cap cap3 = hVar.f2655l;
                                if (i8 == 0) {
                                    cap = cap2;
                                } else if (i8 != 1) {
                                    cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                hVar.f2655l = cap;
                                int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f8.getInt(9, -1) : -1;
                                Paint.Join join3 = hVar.f2656m;
                                if (i9 == 0) {
                                    join = join2;
                                } else if (i9 != 1) {
                                    join = i9 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                hVar.f2656m = join;
                                float f10 = hVar.f2657n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f10 = f8.getFloat(10, f10);
                                }
                                hVar.f2657n = f10;
                                hVar.d = e0.b.b(f8, xmlPullParser, theme, "strokeColor", 3);
                                float f11 = hVar.f2652g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f11 = f8.getFloat(11, f11);
                                }
                                hVar.f2652g = f11;
                                float f12 = hVar.f2650e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f12 = f8.getFloat(4, f12);
                                }
                                hVar.f2650e = f12;
                                float f13 = hVar.f2653j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f13 = f8.getFloat(6, f13);
                                }
                                hVar.f2653j = f13;
                                float f14 = hVar.f2654k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f14 = f8.getFloat(7, f14);
                                }
                                hVar.f2654k = f14;
                                float f15 = hVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f15 = f8.getFloat(5, f15);
                                }
                                hVar.i = f15;
                                int i10 = hVar.f2668c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i10 = f8.getInt(13, i10);
                                }
                                hVar.f2668c = i10;
                            }
                            f8.recycle();
                            iVar2.f2659b.add(hVar);
                            if (hVar.getPathName() != null) {
                                fVar.put(hVar.getPathName(), hVar);
                            }
                            mVar3.f2682a = mVar3.f2682a;
                            z5 = false;
                            c5 = '\b';
                        } else {
                            c5 = '\b';
                            if ("clip-path".equals(name)) {
                                g gVar = new g();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f16 = e0.b.f(resources, theme, attributeSet, a.d);
                                    String string4 = f16.getString(0);
                                    if (string4 != null) {
                                        gVar.f2667b = string4;
                                    }
                                    String string5 = f16.getString(1);
                                    if (string5 != null) {
                                        gVar.f2666a = b4.l.o(string5);
                                    }
                                    gVar.f2668c = !e0.b.c(xmlPullParser, "fillType") ? 0 : f16.getInt(2, 0);
                                    f16.recycle();
                                }
                                iVar2.f2659b.add(gVar);
                                if (gVar.getPathName() != null) {
                                    fVar.put(gVar.getPathName(), gVar);
                                }
                                mVar3.f2682a = mVar3.f2682a;
                            } else if ("group".equals(name)) {
                                i iVar3 = new i();
                                TypedArray f17 = e0.b.f(resources, theme, attributeSet, a.f2637b);
                                float f18 = iVar3.f2660c;
                                if (e0.b.c(xmlPullParser, "rotation")) {
                                    f18 = f17.getFloat(5, f18);
                                }
                                iVar3.f2660c = f18;
                                iVar3.d = f17.getFloat(1, iVar3.d);
                                iVar3.f2661e = f17.getFloat(2, iVar3.f2661e);
                                float f19 = iVar3.f2662f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f19 = f17.getFloat(3, f19);
                                }
                                iVar3.f2662f = f19;
                                float f20 = iVar3.f2663g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f20 = f17.getFloat(4, f20);
                                }
                                iVar3.f2663g = f20;
                                float f21 = iVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f21 = f17.getFloat(6, f21);
                                }
                                iVar3.h = f21;
                                float f22 = iVar3.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f22 = f17.getFloat(7, f22);
                                }
                                iVar3.i = f22;
                                String string6 = f17.getString(0);
                                if (string6 != null) {
                                    iVar3.f2665k = string6;
                                }
                                iVar3.c();
                                f17.recycle();
                                iVar2.f2659b.add(iVar3);
                                arrayDeque.push(iVar3);
                                if (iVar3.getGroupName() != null) {
                                    fVar.put(iVar3.getGroupName(), iVar3);
                                }
                                mVar3.f2682a = mVar3.f2682a;
                            }
                        }
                        i4 = 1;
                    } else {
                        i = depth;
                        c5 = '\b';
                        i4 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i6 = i4;
                    depth = i;
                }
                if (!z5) {
                    this.h = a(mVar.f2684c, mVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f5.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f5.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public o(m mVar) {
        this.f2695k = true;
        this.f2696l = new float[9];
        this.f2697m = new Matrix();
        this.f2698n = new Rect();
        this.f2693g = mVar;
        this.h = a(mVar.f2684c, mVar.d);
    }
}
