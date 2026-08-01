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

/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3143j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public n f3144b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3145c;
    public ColorFilter d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3146e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3147f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3148g;
    public final Matrix h;
    public final Rect i;

    public p() {
        this.f3147f = true;
        this.f3148g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        n nVar = new n();
        nVar.f3135c = null;
        nVar.d = f3143j;
        nVar.f3134b = new m();
        this.f3144b = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3100a;
        if (drawable == null) {
            return false;
        }
        D.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3100a;
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
            colorFilter = this.f3145c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3148g;
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
        n nVar = this.f3144b;
        Bitmap bitmap = nVar.f3137f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f3137f.getHeight()) {
            nVar.f3137f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.f3140k = true;
        }
        if (this.f3147f) {
            n nVar2 = this.f3144b;
            if (nVar2.f3140k || nVar2.f3138g != nVar2.f3135c || nVar2.h != nVar2.d || nVar2.f3139j != nVar2.f3136e || nVar2.i != nVar2.f3134b.getRootAlpha()) {
                n nVar3 = this.f3144b;
                nVar3.f3137f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f3137f);
                m mVar = nVar3.f3134b;
                mVar.a(mVar.f3126g, m.f3120p, canvas2, min, min2);
                n nVar4 = this.f3144b;
                nVar4.f3138g = nVar4.f3135c;
                nVar4.h = nVar4.d;
                nVar4.i = nVar4.f3134b.getRootAlpha();
                nVar4.f3139j = nVar4.f3136e;
                nVar4.f3140k = false;
            }
        } else {
            n nVar5 = this.f3144b;
            nVar5.f3137f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f3137f);
            m mVar2 = nVar5.f3134b;
            mVar2.a(mVar2.f3126g, m.f3120p, canvas3, min, min2);
        }
        n nVar6 = this.f3144b;
        if (nVar6.f3134b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f3141l == null) {
                Paint paint2 = new Paint();
                nVar6.f3141l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f3141l.setAlpha(nVar6.f3134b.getRootAlpha());
            nVar6.f3141l.setColorFilter(colorFilter);
            paint = nVar6.f3141l;
        }
        canvas.drawBitmap(nVar6.f3137f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3100a;
        return drawable != null ? drawable.getAlpha() : this.f3144b.f3134b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3100a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3144b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3100a;
        return drawable != null ? D.a.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3100a != null) {
            return new o(this.f3100a.getConstantState());
        }
        this.f3144b.f3133a = getChangingConfigurations();
        return this.f3144b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3100a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3144b.f3134b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3100a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3144b.f3134b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3100a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3144b.f3136e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f3144b;
            if (nVar != null) {
                m mVar = nVar.f3134b;
                if (mVar.f3131n == null) {
                    mVar.f3131n = Boolean.valueOf(mVar.f3126g.a());
                }
                if (mVar.f3131n.booleanValue() || ((colorStateList = this.f3144b.f3135c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3146e && super.mutate() == this) {
            n nVar = this.f3144b;
            n nVar2 = new n();
            nVar2.f3135c = null;
            nVar2.d = f3143j;
            if (nVar != null) {
                nVar2.f3133a = nVar.f3133a;
                m mVar = new m(nVar.f3134b);
                nVar2.f3134b = mVar;
                if (nVar.f3134b.f3124e != null) {
                    mVar.f3124e = new Paint(nVar.f3134b.f3124e);
                }
                if (nVar.f3134b.d != null) {
                    nVar2.f3134b.d = new Paint(nVar.f3134b.d);
                }
                nVar2.f3135c = nVar.f3135c;
                nVar2.d = nVar.d;
                nVar2.f3136e = nVar.f3136e;
            }
            this.f3144b = nVar2;
            this.f3146e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f3144b;
        ColorStateList colorStateList = nVar.f3135c;
        if (colorStateList == null || (mode = nVar.d) == null) {
            z2 = false;
        } else {
            this.f3145c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        m mVar = nVar.f3134b;
        if (mVar.f3131n == null) {
            mVar.f3131n = Boolean.valueOf(mVar.f3126g.a());
        }
        if (mVar.f3131n.booleanValue()) {
            boolean b2 = nVar.f3134b.f3126g.b(iArr);
            nVar.f3140k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3144b.f3134b.getRootAlpha() != i) {
            this.f3144b.f3134b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3144b.f3136e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            q1.d.q0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f3144b;
        if (nVar.f3135c != colorStateList) {
            nVar.f3135c = colorStateList;
            this.f3145c = a(colorStateList, nVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            D.a.i(drawable, mode);
            return;
        }
        n nVar = this.f3144b;
        if (nVar.d != mode) {
            nVar.d = mode;
            this.f3145c = a(nVar.f3135c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3100a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3100a;
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
        Drawable drawable = this.f3100a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f3144b;
        nVar.f3134b = new m();
        TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0274a.f3085a);
        n nVar2 = this.f3144b;
        m mVar2 = nVar2.f3134b;
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
        nVar2.d = mode;
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
                ThreadLocal threadLocal = B.c.f16a;
                try {
                    colorStateList = B.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f3135c = colorStateList2;
        }
        boolean z5 = nVar2.f3136e;
        if (B.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        nVar2.f3136e = z5;
        float f3 = mVar2.f3127j;
        if (B.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        mVar2.f3127j = f3;
        float f4 = mVar2.f3128k;
        if (B.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        mVar2.f3128k = f4;
        if (mVar2.f3127j <= 0.0f) {
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
                if (B.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    mVar2.f3130m = string;
                    mVar2.f3132o.put(string, mVar2);
                }
                f2.recycle();
                nVar.f3133a = getChangingConfigurations();
                nVar.f3140k = true;
                n nVar3 = this.f3144b;
                m mVar3 = nVar3.f3134b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f3126g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        o.b bVar = mVar3.f3132o;
                        if (equals) {
                            i iVar = new i();
                            iVar.f3101e = 0.0f;
                            iVar.f3103g = 1.0f;
                            iVar.h = 1.0f;
                            iVar.i = 0.0f;
                            iVar.f3104j = 1.0f;
                            iVar.f3105k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f3106l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            iVar.f3107m = join3;
                            mVar = mVar3;
                            iVar.f3108n = 4.0f;
                            TypedArray f5 = B.b.f(resources, theme, attributeSet, AbstractC0274a.f3087c);
                            if (B.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    iVar.f3118b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    iVar.f3117a = q1.d.s(string3);
                                }
                                iVar.f3102f = B.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = iVar.h;
                                if (B.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                iVar.h = f6;
                                int i8 = !B.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = iVar.f3106l;
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
                                iVar.f3106l = cap;
                                int i9 = !B.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = iVar.f3107m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                iVar.f3107m = join2;
                                float f7 = iVar.f3108n;
                                if (B.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                iVar.f3108n = f7;
                                iVar.d = B.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = iVar.f3103g;
                                if (B.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                iVar.f3103g = f8;
                                float f9 = iVar.f3101e;
                                if (B.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                iVar.f3101e = f9;
                                float f10 = iVar.f3104j;
                                if (B.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                iVar.f3104j = f10;
                                float f11 = iVar.f3105k;
                                if (B.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                iVar.f3105k = f11;
                                float f12 = iVar.i;
                                if (B.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                iVar.i = f12;
                                int i10 = iVar.f3119c;
                                if (B.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                iVar.f3119c = i10;
                            }
                            f5.recycle();
                            jVar.f3110b.add(iVar);
                            if (iVar.getPathName() != null) {
                                bVar.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f3133a = nVar3.f3133a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            mVar = mVar3;
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (B.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = B.b.f(resources, theme, attributeSet, AbstractC0274a.d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        hVar.f3118b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        hVar.f3117a = q1.d.s(string5);
                                    }
                                    hVar.f3119c = !B.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                jVar.f3110b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    bVar.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f3133a = nVar3.f3133a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray f14 = B.b.f(resources, theme, attributeSet, AbstractC0274a.f3086b);
                                float f15 = jVar2.f3111c;
                                if (B.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                jVar2.f3111c = f15;
                                i2 = 1;
                                jVar2.d = f14.getFloat(1, jVar2.d);
                                jVar2.f3112e = f14.getFloat(2, jVar2.f3112e);
                                float f16 = jVar2.f3113f;
                                if (B.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                jVar2.f3113f = f16;
                                float f17 = jVar2.f3114g;
                                if (B.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                jVar2.f3114g = f17;
                                float f18 = jVar2.h;
                                if (B.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                jVar2.h = f18;
                                float f19 = jVar2.i;
                                if (B.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                jVar2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    jVar2.f3116k = string6;
                                }
                                jVar2.c();
                                f14.recycle();
                                jVar.f3110b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    bVar.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f3133a = nVar3.f3133a;
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
                    this.f3145c = a(nVar.f3135c, nVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f3147f = true;
        this.f3148g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f3144b = nVar;
        this.f3145c = a(nVar.f3135c, nVar.d);
    }
}
