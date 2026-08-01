package n0;

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

/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3284j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public n f3285b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3286c;
    public ColorFilter d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3287e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3288f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3289g;
    public final Matrix h;
    public final Rect i;

    public p() {
        this.f3288f = true;
        this.f3289g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        n nVar = new n();
        nVar.f3276c = null;
        nVar.d = f3284j;
        nVar.f3275b = new m();
        this.f3285b = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3241a;
        if (drawable == null) {
            return false;
        }
        F.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3241a;
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
            colorFilter = this.f3286c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3289g;
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
        n nVar = this.f3285b;
        Bitmap bitmap = nVar.f3278f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f3278f.getHeight()) {
            nVar.f3278f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.f3281k = true;
        }
        if (this.f3288f) {
            n nVar2 = this.f3285b;
            if (nVar2.f3281k || nVar2.f3279g != nVar2.f3276c || nVar2.h != nVar2.d || nVar2.f3280j != nVar2.f3277e || nVar2.i != nVar2.f3275b.getRootAlpha()) {
                n nVar3 = this.f3285b;
                nVar3.f3278f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f3278f);
                m mVar = nVar3.f3275b;
                mVar.a(mVar.f3267g, m.f3261p, canvas2, min, min2);
                n nVar4 = this.f3285b;
                nVar4.f3279g = nVar4.f3276c;
                nVar4.h = nVar4.d;
                nVar4.i = nVar4.f3275b.getRootAlpha();
                nVar4.f3280j = nVar4.f3277e;
                nVar4.f3281k = false;
            }
        } else {
            n nVar5 = this.f3285b;
            nVar5.f3278f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f3278f);
            m mVar2 = nVar5.f3275b;
            mVar2.a(mVar2.f3267g, m.f3261p, canvas3, min, min2);
        }
        n nVar6 = this.f3285b;
        if (nVar6.f3275b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f3282l == null) {
                Paint paint2 = new Paint();
                nVar6.f3282l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f3282l.setAlpha(nVar6.f3275b.getRootAlpha());
            nVar6.f3282l.setColorFilter(colorFilter);
            paint = nVar6.f3282l;
        }
        canvas.drawBitmap(nVar6.f3278f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3241a;
        return drawable != null ? drawable.getAlpha() : this.f3285b.f3275b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3241a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3285b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3241a;
        return drawable != null ? F.a.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3241a != null) {
            return new o(this.f3241a.getConstantState());
        }
        this.f3285b.f3274a = getChangingConfigurations();
        return this.f3285b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3241a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3285b.f3275b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3241a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3285b.f3275b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3241a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3285b.f3277e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f3285b;
            if (nVar != null) {
                m mVar = nVar.f3275b;
                if (mVar.f3272n == null) {
                    mVar.f3272n = Boolean.valueOf(mVar.f3267g.a());
                }
                if (mVar.f3272n.booleanValue() || ((colorStateList = this.f3285b.f3276c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3287e && super.mutate() == this) {
            n nVar = this.f3285b;
            n nVar2 = new n();
            nVar2.f3276c = null;
            nVar2.d = f3284j;
            if (nVar != null) {
                nVar2.f3274a = nVar.f3274a;
                m mVar = new m(nVar.f3275b);
                nVar2.f3275b = mVar;
                if (nVar.f3275b.f3265e != null) {
                    mVar.f3265e = new Paint(nVar.f3275b.f3265e);
                }
                if (nVar.f3275b.d != null) {
                    nVar2.f3275b.d = new Paint(nVar.f3275b.d);
                }
                nVar2.f3276c = nVar.f3276c;
                nVar2.d = nVar.d;
                nVar2.f3277e = nVar.f3277e;
            }
            this.f3285b = nVar2;
            this.f3287e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f3285b;
        ColorStateList colorStateList = nVar.f3276c;
        if (colorStateList == null || (mode = nVar.d) == null) {
            z2 = false;
        } else {
            this.f3286c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        m mVar = nVar.f3275b;
        if (mVar.f3272n == null) {
            mVar.f3272n = Boolean.valueOf(mVar.f3267g.a());
        }
        if (mVar.f3272n.booleanValue()) {
            boolean b2 = nVar.f3275b.f3267g.b(iArr);
            nVar.f3281k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3285b.f3275b.getRootAlpha() != i) {
            this.f3285b.f3275b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3285b.f3277e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            z1.d.c0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            F.a.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f3285b;
        if (nVar.f3276c != colorStateList) {
            nVar.f3276c = colorStateList;
            this.f3286c = a(colorStateList, nVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            F.a.i(drawable, mode);
            return;
        }
        n nVar = this.f3285b;
        if (nVar.d != mode) {
            nVar.d = mode;
            this.f3286c = a(nVar.f3276c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3241a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        m mVar;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f3241a;
        if (drawable != null) {
            F.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f3285b;
        nVar.f3275b = new m();
        TypedArray f2 = D.b.f(resources, theme, attributeSet, AbstractC0246a.f3226a);
        n nVar2 = this.f3285b;
        m mVar2 = nVar2.f3275b;
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
        nVar2.d = mode;
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
                ThreadLocal threadLocal = D.c.f119a;
                try {
                    colorStateList = D.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f3276c = colorStateList2;
        }
        boolean z5 = nVar2.f3277e;
        if (D.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        nVar2.f3277e = z5;
        float f3 = mVar2.f3268j;
        if (D.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        mVar2.f3268j = f3;
        float f4 = mVar2.f3269k;
        if (D.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        mVar2.f3269k = f4;
        if (mVar2.f3268j <= 0.0f) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > 0.0f) {
            mVar2.h = f2.getDimension(3, mVar2.h);
            float dimension = f2.getDimension(2, mVar2.i);
            mVar2.i = dimension;
            if (mVar2.h <= 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar2.getAlpha();
                if (D.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    mVar2.f3271m = string;
                    mVar2.f3273o.put(string, mVar2);
                }
                f2.recycle();
                nVar.f3274a = getChangingConfigurations();
                nVar.f3281k = true;
                n nVar3 = this.f3285b;
                m mVar3 = nVar3.f3275b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f3267g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        q.b bVar = mVar3.f3273o;
                        if (equals) {
                            i iVar = new i();
                            iVar.f3242e = 0.0f;
                            iVar.f3244g = 1.0f;
                            iVar.h = 1.0f;
                            iVar.i = 0.0f;
                            iVar.f3245j = 1.0f;
                            iVar.f3246k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f3247l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            iVar.f3248m = join3;
                            mVar = mVar3;
                            iVar.f3249n = 4.0f;
                            TypedArray f5 = D.b.f(resources, theme, attributeSet, AbstractC0246a.f3228c);
                            if (D.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    iVar.f3259b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    iVar.f3258a = z1.l.B(string3);
                                }
                                iVar.f3243f = D.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = iVar.h;
                                if (D.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                iVar.h = f6;
                                int i8 = !D.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = iVar.f3247l;
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
                                iVar.f3247l = cap;
                                int i9 = !D.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = iVar.f3248m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                iVar.f3248m = join2;
                                float f7 = iVar.f3249n;
                                if (D.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                iVar.f3249n = f7;
                                iVar.d = D.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = iVar.f3244g;
                                if (D.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                iVar.f3244g = f8;
                                float f9 = iVar.f3242e;
                                if (D.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                iVar.f3242e = f9;
                                float f10 = iVar.f3245j;
                                if (D.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                iVar.f3245j = f10;
                                float f11 = iVar.f3246k;
                                if (D.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                iVar.f3246k = f11;
                                float f12 = iVar.i;
                                if (D.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                iVar.i = f12;
                                int i10 = iVar.f3260c;
                                if (D.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                iVar.f3260c = i10;
                            }
                            f5.recycle();
                            jVar.f3251b.add(iVar);
                            if (iVar.getPathName() != null) {
                                bVar.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f3274a = nVar3.f3274a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            mVar = mVar3;
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (D.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = D.b.f(resources, theme, attributeSet, AbstractC0246a.d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        hVar.f3259b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        hVar.f3258a = z1.l.B(string5);
                                    }
                                    hVar.f3260c = !D.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                jVar.f3251b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    bVar.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f3274a = nVar3.f3274a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray f14 = D.b.f(resources, theme, attributeSet, AbstractC0246a.f3227b);
                                float f15 = jVar2.f3252c;
                                if (D.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                jVar2.f3252c = f15;
                                i2 = 1;
                                jVar2.d = f14.getFloat(1, jVar2.d);
                                jVar2.f3253e = f14.getFloat(2, jVar2.f3253e);
                                float f16 = jVar2.f3254f;
                                if (D.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                jVar2.f3254f = f16;
                                float f17 = jVar2.f3255g;
                                if (D.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                jVar2.f3255g = f17;
                                float f18 = jVar2.h;
                                if (D.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                jVar2.h = f18;
                                float f19 = jVar2.i;
                                if (D.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                jVar2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    jVar2.f3257k = string6;
                                }
                                jVar2.c();
                                f14.recycle();
                                jVar.f3251b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    bVar.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f3274a = nVar3.f3274a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        mVar = mVar3;
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
                    mVar3 = mVar;
                }
                if (!z6) {
                    this.f3286c = a(nVar.f3276c, nVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f3288f = true;
        this.f3289g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f3285b = nVar;
        this.f3286c = a(nVar.f3276c, nVar.d);
    }
}
