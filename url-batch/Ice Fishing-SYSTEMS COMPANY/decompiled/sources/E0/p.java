package E0;

import a.AbstractC0415a;
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

    /* renamed from: C, reason: collision with root package name */
    public static final PorterDuff.Mode f801C = PorterDuff.Mode.SRC_IN;

    /* renamed from: A, reason: collision with root package name */
    public final Matrix f802A;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f803B;

    /* renamed from: u, reason: collision with root package name */
    public n f804u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuffColorFilter f805v;

    /* renamed from: w, reason: collision with root package name */
    public ColorFilter f806w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f807x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f808y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f809z;

    public p() {
        this.f808y = true;
        this.f809z = new float[9];
        this.f802A = new Matrix();
        this.f803B = new Rect();
        n nVar = new n();
        nVar.f791c = null;
        nVar.f792d = f801C;
        nVar.f790b = new m();
        this.f804u = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f750n;
        if (drawable == null) {
            return false;
        }
        H.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f803B;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f806w;
        if (colorFilter == null) {
            colorFilter = this.f805v;
        }
        Matrix matrix = this.f802A;
        canvas.getMatrix(matrix);
        float[] fArr = this.f809z;
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
        if (isAutoMirrored() && H.b.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f804u;
        Bitmap bitmap = nVar.f794f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f794f.getHeight()) {
            nVar.f794f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.f798k = true;
        }
        if (this.f808y) {
            n nVar2 = this.f804u;
            if (nVar2.f798k || nVar2.f795g != nVar2.f791c || nVar2.f796h != nVar2.f792d || nVar2.f797j != nVar2.f793e || nVar2.i != nVar2.f790b.getRootAlpha()) {
                n nVar3 = this.f804u;
                nVar3.f794f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f794f);
                m mVar = nVar3.f790b;
                mVar.a(mVar.f781g, m.f774p, canvas2, min, min2);
                n nVar4 = this.f804u;
                nVar4.f795g = nVar4.f791c;
                nVar4.f796h = nVar4.f792d;
                nVar4.i = nVar4.f790b.getRootAlpha();
                nVar4.f797j = nVar4.f793e;
                nVar4.f798k = false;
            }
        } else {
            n nVar5 = this.f804u;
            nVar5.f794f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f794f);
            m mVar2 = nVar5.f790b;
            mVar2.a(mVar2.f781g, m.f774p, canvas3, min, min2);
        }
        n nVar6 = this.f804u;
        if (nVar6.f790b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f799l == null) {
                Paint paint2 = new Paint();
                nVar6.f799l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f799l.setAlpha(nVar6.f790b.getRootAlpha());
            nVar6.f799l.setColorFilter(colorFilter);
            paint = nVar6.f799l;
        }
        canvas.drawBitmap(nVar6.f794f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.getAlpha() : this.f804u.f790b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f804u.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f750n;
        return drawable != null ? H.a.c(drawable) : this.f806w;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f750n != null) {
            return new o(this.f750n.getConstantState());
        }
        this.f804u.f789a = getChangingConfigurations();
        return this.f804u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f804u.f790b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f804u.f790b.f782h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.isAutoMirrored() : this.f804u.f793e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.f804u;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f790b;
        if (mVar.f787n == null) {
            mVar.f787n = Boolean.valueOf(mVar.f781g.a());
        }
        if (mVar.f787n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f804u.f791c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f807x && super.mutate() == this) {
            n nVar = this.f804u;
            n nVar2 = new n();
            nVar2.f791c = null;
            nVar2.f792d = f801C;
            if (nVar != null) {
                nVar2.f789a = nVar.f789a;
                m mVar = new m(nVar.f790b);
                nVar2.f790b = mVar;
                if (nVar.f790b.f779e != null) {
                    mVar.f779e = new Paint(nVar.f790b.f779e);
                }
                if (nVar.f790b.f778d != null) {
                    nVar2.f790b.f778d = new Paint(nVar.f790b.f778d);
                }
                nVar2.f791c = nVar.f791c;
                nVar2.f792d = nVar.f792d;
                nVar2.f793e = nVar.f793e;
            }
            this.f804u = nVar2;
            this.f807x = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z8;
        PorterDuff.Mode mode;
        Drawable drawable = this.f750n;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f804u;
        ColorStateList colorStateList = nVar.f791c;
        if (colorStateList == null || (mode = nVar.f792d) == null) {
            z8 = false;
        } else {
            this.f805v = a(colorStateList, mode);
            invalidateSelf();
            z8 = true;
        }
        m mVar = nVar.f790b;
        if (mVar.f787n == null) {
            mVar.f787n = Boolean.valueOf(mVar.f781g.a());
        }
        if (mVar.f787n.booleanValue()) {
            boolean b9 = nVar.f790b.f781g.b(iArr);
            nVar.f798k |= b9;
            if (b9) {
                invalidateSelf();
                return true;
            }
        }
        return z8;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j9) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j9);
        } else {
            super.scheduleSelf(runnable, j9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f804u.f790b.getRootAlpha() != i) {
            this.f804u.f790b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z8) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.setAutoMirrored(z8);
        } else {
            this.f804u.f793e = z8;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f806w = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            com.bumptech.glide.g.S(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            H.a.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f804u;
        if (nVar.f791c != colorStateList) {
            nVar.f791c = colorStateList;
            this.f805v = a(colorStateList, nVar.f792d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f750n;
        if (drawable != null) {
            H.a.i(drawable, mode);
            return;
        }
        n nVar = this.f804u;
        if (nVar.f792d != mode) {
            nVar.f792d = mode;
            this.f805v = a(nVar.f791c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        Drawable drawable = this.f750n;
        return drawable != null ? drawable.setVisible(z8, z9) : super.setVisible(z8, z9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f750n;
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
        boolean z8;
        char c4;
        int i4;
        int i9;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f750n;
        if (drawable != null) {
            H.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f804u;
        nVar.f790b = new m();
        TypedArray f6 = F.b.f(resources, theme, attributeSet, a.f731a);
        n nVar2 = this.f804u;
        m mVar2 = nVar2.f790b;
        int i10 = !F.b.c(xmlPullParser, "tintMode") ? -1 : f6.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i10 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i10 != 5) {
            if (i10 != 9) {
                switch (i10) {
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
        nVar2.f792d = mode;
        int i11 = 1;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f6.getValue(1, typedValue);
            int i12 = typedValue.type;
            if (i12 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i12 >= 28 && i12 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f6.getResources();
                int resourceId = f6.getResourceId(1, 0);
                ThreadLocal threadLocal = F.c.f906a;
                try {
                    colorStateList = F.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e6) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e6);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f791c = colorStateList2;
        }
        boolean z9 = nVar2.f793e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z9 = f6.getBoolean(5, z9);
        }
        nVar2.f793e = z9;
        float f9 = mVar2.f783j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f9 = f6.getFloat(7, f9);
        }
        mVar2.f783j = f9;
        float f10 = mVar2.f784k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f10 = f6.getFloat(8, f10);
        }
        mVar2.f784k = f10;
        boolean z10 = false;
        if (mVar2.f783j <= 0.0f) {
            throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 > 0.0f) {
            mVar2.f782h = f6.getDimension(3, mVar2.f782h);
            float dimension = f6.getDimension(2, mVar2.i);
            mVar2.i = dimension;
            if (mVar2.f782h <= 0.0f) {
                throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f6.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = f6.getString(0);
                if (string != null) {
                    mVar2.f786m = string;
                    mVar2.f788o.put(string, mVar2);
                }
                f6.recycle();
                nVar.f789a = getChangingConfigurations();
                nVar.f798k = true;
                n nVar3 = this.f804u;
                m mVar3 = nVar3.f790b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f781g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i11 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = com.anythink.expressad.a.f17761K.equals(name);
                        s.b bVar = mVar3.f788o;
                        mVar = mVar3;
                        if (equals) {
                            i iVar = new i();
                            iVar.f752e = 0.0f;
                            iVar.f754g = 1.0f;
                            iVar.f755h = 1.0f;
                            i = depth;
                            iVar.i = 0.0f;
                            iVar.f756j = 1.0f;
                            iVar.f757k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f758l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            iVar.f759m = join2;
                            iVar.f760n = 4.0f;
                            TypedArray f11 = F.b.f(resources, theme, attributeSet, a.f733c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f11.getString(0);
                                if (string2 != null) {
                                    iVar.f772b = string2;
                                }
                                String string3 = f11.getString(2);
                                if (string3 != null) {
                                    iVar.f771a = AbstractC0415a.k(string3);
                                }
                                iVar.f753f = F.b.b(f11, xmlPullParser, theme, "fillColor", 1);
                                float f12 = iVar.f755h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = f11.getFloat(12, f12);
                                }
                                iVar.f755h = f12;
                                int i13 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f11.getInt(8, -1) : -1;
                                Paint.Cap cap3 = iVar.f758l;
                                if (i13 == 0) {
                                    cap = cap2;
                                } else if (i13 != 1) {
                                    cap = i13 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                iVar.f758l = cap;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f11.getInt(9, -1) : -1;
                                Paint.Join join3 = iVar.f759m;
                                if (i14 == 0) {
                                    join = join2;
                                } else if (i14 != 1) {
                                    join = i14 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                iVar.f759m = join;
                                float f13 = iVar.f760n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = f11.getFloat(10, f13);
                                }
                                iVar.f760n = f13;
                                iVar.f751d = F.b.b(f11, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = iVar.f754g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = f11.getFloat(11, f14);
                                }
                                iVar.f754g = f14;
                                float f15 = iVar.f752e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = f11.getFloat(4, f15);
                                }
                                iVar.f752e = f15;
                                float f16 = iVar.f756j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = f11.getFloat(6, f16);
                                }
                                iVar.f756j = f16;
                                float f17 = iVar.f757k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = f11.getFloat(7, f17);
                                }
                                iVar.f757k = f17;
                                float f18 = iVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = f11.getFloat(5, f18);
                                }
                                iVar.i = f18;
                                int i15 = iVar.f773c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i15 = f11.getInt(13, i15);
                                }
                                iVar.f773c = i15;
                            }
                            f11.recycle();
                            jVar.f762b.add(iVar);
                            if (iVar.getPathName() != null) {
                                bVar.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f789a = nVar3.f789a;
                            i9 = 1;
                            z11 = false;
                            c4 = '\b';
                            z8 = false;
                        } else {
                            i = depth;
                            c4 = '\b';
                            z8 = false;
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f19 = F.b.f(resources, theme, attributeSet, a.f734d);
                                    String string4 = f19.getString(0);
                                    if (string4 != null) {
                                        hVar.f772b = string4;
                                    }
                                    String string5 = f19.getString(1);
                                    if (string5 != null) {
                                        hVar.f771a = AbstractC0415a.k(string5);
                                    }
                                    hVar.f773c = !F.b.c(xmlPullParser, "fillType") ? 0 : f19.getInt(2, 0);
                                    f19.recycle();
                                }
                                jVar.f762b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    bVar.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f789a = nVar3.f789a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray f20 = F.b.f(resources, theme, attributeSet, a.f732b);
                                float f21 = jVar2.f763c;
                                if (F.b.c(xmlPullParser, "rotation")) {
                                    f21 = f20.getFloat(5, f21);
                                }
                                jVar2.f763c = f21;
                                i9 = 1;
                                jVar2.f764d = f20.getFloat(1, jVar2.f764d);
                                jVar2.f765e = f20.getFloat(2, jVar2.f765e);
                                float f22 = jVar2.f766f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f22 = f20.getFloat(3, f22);
                                }
                                jVar2.f766f = f22;
                                float f23 = jVar2.f767g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f23 = f20.getFloat(4, f23);
                                }
                                jVar2.f767g = f23;
                                float f24 = jVar2.f768h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f24 = f20.getFloat(6, f24);
                                }
                                jVar2.f768h = f24;
                                float f25 = jVar2.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f25 = f20.getFloat(7, f25);
                                }
                                jVar2.i = f25;
                                String string6 = f20.getString(0);
                                if (string6 != null) {
                                    jVar2.f770k = string6;
                                }
                                jVar2.c();
                                f20.recycle();
                                jVar.f762b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    bVar.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f789a = nVar3.f789a;
                            }
                            i9 = 1;
                        }
                        i4 = i9;
                    } else {
                        mVar = mVar3;
                        i = depth;
                        z8 = z10;
                        c4 = '\b';
                        i4 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i11 = i4;
                    z10 = z8;
                    mVar3 = mVar;
                    depth = i;
                }
                if (!z11) {
                    this.f805v = a(nVar.f791c, nVar.f792d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f808y = true;
        this.f809z = new float[9];
        this.f802A = new Matrix();
        this.f803B = new Rect();
        this.f804u = nVar;
        this.f805v = a(nVar.f791c, nVar.f792d);
    }
}
