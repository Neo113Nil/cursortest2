package g1;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: o, reason: collision with root package name */
    public static final PorterDuff.Mode f1817o = PorterDuff.Mode.SRC_IN;
    public n g;
    public PorterDuffColorFilter h;

    /* renamed from: i, reason: collision with root package name */
    public ColorFilter f1818i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1819j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1820k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f1821l;

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f1822m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1823n;

    public p() {
        this.f1820k = true;
        this.f1821l = new float[9];
        this.f1822m = new Matrix();
        this.f1823n = new Rect();
        n nVar = new n();
        nVar.c = null;
        nVar.f1809d = f1817o;
        nVar.f1808b = new m();
        this.g = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1774f;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f1823n;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1818i;
        if (colorFilter == null) {
            colorFilter = this.h;
        }
        Matrix matrix = this.f1822m;
        canvas.getMatrix(matrix);
        float[] fArr = this.f1821l;
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
        n nVar = this.g;
        Bitmap bitmap = nVar.f1811f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f1811f.getHeight()) {
            nVar.f1811f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.f1814k = true;
        }
        if (this.f1820k) {
            n nVar2 = this.g;
            if (nVar2.f1814k || nVar2.g != nVar2.c || nVar2.h != nVar2.f1809d || nVar2.f1813j != nVar2.f1810e || nVar2.f1812i != nVar2.f1808b.getRootAlpha()) {
                n nVar3 = this.g;
                nVar3.f1811f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f1811f);
                m mVar = nVar3.f1808b;
                mVar.a(mVar.g, m.f1794p, canvas2, min, min2);
                n nVar4 = this.g;
                nVar4.g = nVar4.c;
                nVar4.h = nVar4.f1809d;
                nVar4.f1812i = nVar4.f1808b.getRootAlpha();
                nVar4.f1813j = nVar4.f1810e;
                nVar4.f1814k = false;
            }
        } else {
            n nVar5 = this.g;
            nVar5.f1811f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f1811f);
            m mVar2 = nVar5.f1808b;
            mVar2.a(mVar2.g, m.f1794p, canvas3, min, min2);
        }
        n nVar6 = this.g;
        if (nVar6.f1808b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f1815l == null) {
                Paint paint2 = new Paint();
                nVar6.f1815l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f1815l.setAlpha(nVar6.f1808b.getRootAlpha());
            nVar6.f1815l.setColorFilter(colorFilter);
            paint = nVar6.f1815l;
        }
        canvas.drawBitmap(nVar6.f1811f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.getAlpha() : this.g.f1808b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.getColorFilter() : this.f1818i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1774f != null) {
            return new o(this.f1774f.getConstantState());
        }
        this.g.f1807a = getChangingConfigurations();
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.g.f1808b.f1800i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.g.f1808b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.isAutoMirrored() : this.g.f1810e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.g;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f1808b;
        if (mVar.f1805n == null) {
            mVar.f1805n = Boolean.valueOf(mVar.g.a());
        }
        if (mVar.f1805n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.g.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1819j && super.mutate() == this) {
            n nVar = this.g;
            n nVar2 = new n();
            nVar2.c = null;
            nVar2.f1809d = f1817o;
            if (nVar != null) {
                nVar2.f1807a = nVar.f1807a;
                m mVar = new m(nVar.f1808b);
                nVar2.f1808b = mVar;
                if (nVar.f1808b.f1798e != null) {
                    mVar.f1798e = new Paint(nVar.f1808b.f1798e);
                }
                if (nVar.f1808b.f1797d != null) {
                    nVar2.f1808b.f1797d = new Paint(nVar.f1808b.f1797d);
                }
                nVar2.c = nVar.c;
                nVar2.f1809d = nVar.f1809d;
                nVar2.f1810e = nVar.f1810e;
            }
            this.g = nVar2;
            this.f1819j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.g;
        ColorStateList colorStateList = nVar.c;
        if (colorStateList == null || (mode = nVar.f1809d) == null) {
            z3 = false;
        } else {
            this.h = a(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        m mVar = nVar.f1808b;
        if (mVar.f1805n == null) {
            mVar.f1805n = Boolean.valueOf(mVar.g.a());
        }
        if (mVar.f1805n.booleanValue()) {
            boolean b2 = nVar.f1808b.g.b(iArr);
            nVar.f1814k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.g.f1808b.getRootAlpha() != i4) {
            this.g.f1808b.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.g.f1810e = z3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1818i = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            k3.m.T(drawable, i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.g;
        if (nVar.c != colorStateList) {
            nVar.c = colorStateList;
            this.h = a(colorStateList, nVar.f1809d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.g;
        if (nVar.f1809d != mode) {
            nVar.f1809d = mode;
            this.h = a(nVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f1774f;
        return drawable != null ? drawable.setVisible(z3, z4) : super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i4;
        char c;
        int i5;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f1774f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.g;
        nVar.f1808b = new m();
        TypedArray f4 = b0.b.f(resources, theme, attributeSet, a.f1760a);
        n nVar2 = this.g;
        m mVar = nVar2.f1808b;
        int i6 = !b0.b.c(xmlPullParser, "tintMode") ? -1 : f4.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i6 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i6 != 5) {
            if (i6 != 9) {
                switch (i6) {
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
        nVar2.f1809d = mode;
        ColorStateList colorStateList = null;
        int i7 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f4.getValue(1, typedValue);
            int i8 = typedValue.type;
            if (i8 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i8 >= 28 && i8 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f4.getResources();
                int resourceId = f4.getResourceId(1, 0);
                ThreadLocal threadLocal = b0.c.f697a;
                try {
                    colorStateList = b0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e4) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.c = colorStateList2;
        }
        boolean z3 = nVar2.f1810e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z3 = f4.getBoolean(5, z3);
        }
        nVar2.f1810e = z3;
        float f5 = mVar.f1801j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f5 = f4.getFloat(7, f5);
        }
        mVar.f1801j = f5;
        float f6 = mVar.f1802k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f6 = f4.getFloat(8, f6);
        }
        mVar.f1802k = f6;
        if (mVar.f1801j <= 0.0f) {
            throw new XmlPullParserException(f4.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f6 > 0.0f) {
            mVar.h = f4.getDimension(3, mVar.h);
            float dimension = f4.getDimension(2, mVar.f1800i);
            mVar.f1800i = dimension;
            if (mVar.h <= 0.0f) {
                throw new XmlPullParserException(f4.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f4.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = f4.getString(0);
                if (string != null) {
                    mVar.f1804m = string;
                    mVar.f1806o.put(string, mVar);
                }
                f4.recycle();
                nVar.f1807a = getChangingConfigurations();
                nVar.f1814k = true;
                n nVar3 = this.g;
                m mVar2 = nVar3.f1808b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.g;
                n.f fVar = mVar2.f1806o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i4 = depth;
                        if ("path".equals(name)) {
                            i iVar = new i();
                            iVar.f1776e = 0.0f;
                            iVar.g = 1.0f;
                            iVar.h = 1.0f;
                            iVar.f1778i = 0.0f;
                            iVar.f1779j = 1.0f;
                            iVar.f1780k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f1781l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            iVar.f1782m = join2;
                            iVar.f1783n = 4.0f;
                            TypedArray f7 = b0.b.f(resources, theme, attributeSet, a.c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f7.getString(0);
                                if (string2 != null) {
                                    iVar.f1793b = string2;
                                }
                                String string3 = f7.getString(2);
                                if (string3 != null) {
                                    iVar.f1792a = k3.m.p(string3);
                                }
                                iVar.f1777f = b0.b.b(f7, xmlPullParser, theme, "fillColor", 1);
                                float f8 = iVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f8 = f7.getFloat(12, f8);
                                }
                                iVar.h = f8;
                                int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f7.getInt(8, -1) : -1;
                                Paint.Cap cap3 = iVar.f1781l;
                                if (i9 == 0) {
                                    cap = cap2;
                                } else if (i9 != 1) {
                                    cap = i9 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                iVar.f1781l = cap;
                                int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f7.getInt(9, -1) : -1;
                                Paint.Join join3 = iVar.f1782m;
                                if (i10 == 0) {
                                    join = join2;
                                } else if (i10 != 1) {
                                    join = i10 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                iVar.f1782m = join;
                                float f9 = iVar.f1783n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f9 = f7.getFloat(10, f9);
                                }
                                iVar.f1783n = f9;
                                iVar.f1775d = b0.b.b(f7, xmlPullParser, theme, "strokeColor", 3);
                                float f10 = iVar.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f10 = f7.getFloat(11, f10);
                                }
                                iVar.g = f10;
                                float f11 = iVar.f1776e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f11 = f7.getFloat(4, f11);
                                }
                                iVar.f1776e = f11;
                                float f12 = iVar.f1779j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f12 = f7.getFloat(6, f12);
                                }
                                iVar.f1779j = f12;
                                float f13 = iVar.f1780k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f13 = f7.getFloat(7, f13);
                                }
                                iVar.f1780k = f13;
                                float f14 = iVar.f1778i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f14 = f7.getFloat(5, f14);
                                }
                                iVar.f1778i = f14;
                                int i11 = iVar.c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i11 = f7.getInt(13, i11);
                                }
                                iVar.c = i11;
                            }
                            f7.recycle();
                            jVar2.f1785b.add(iVar);
                            if (iVar.getPathName() != null) {
                                fVar.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f1807a = nVar3.f1807a;
                            z4 = false;
                            c = '\b';
                        } else {
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f15 = b0.b.f(resources, theme, attributeSet, a.f1762d);
                                    String string4 = f15.getString(0);
                                    if (string4 != null) {
                                        hVar.f1793b = string4;
                                    }
                                    String string5 = f15.getString(1);
                                    if (string5 != null) {
                                        hVar.f1792a = k3.m.p(string5);
                                    }
                                    hVar.c = !b0.b.c(xmlPullParser, "fillType") ? 0 : f15.getInt(2, 0);
                                    f15.recycle();
                                }
                                jVar2.f1785b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    fVar.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f1807a = nVar3.f1807a;
                            } else if ("group".equals(name)) {
                                j jVar3 = new j();
                                TypedArray f16 = b0.b.f(resources, theme, attributeSet, a.f1761b);
                                float f17 = jVar3.c;
                                if (b0.b.c(xmlPullParser, "rotation")) {
                                    f17 = f16.getFloat(5, f17);
                                }
                                jVar3.c = f17;
                                jVar3.f1786d = f16.getFloat(1, jVar3.f1786d);
                                jVar3.f1787e = f16.getFloat(2, jVar3.f1787e);
                                float f18 = jVar3.f1788f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f18 = f16.getFloat(3, f18);
                                }
                                jVar3.f1788f = f18;
                                float f19 = jVar3.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f19 = f16.getFloat(4, f19);
                                }
                                jVar3.g = f19;
                                float f20 = jVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f20 = f16.getFloat(6, f20);
                                }
                                jVar3.h = f20;
                                float f21 = jVar3.f1789i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f21 = f16.getFloat(7, f21);
                                }
                                jVar3.f1789i = f21;
                                String string6 = f16.getString(0);
                                if (string6 != null) {
                                    jVar3.f1791k = string6;
                                }
                                jVar3.c();
                                f16.recycle();
                                jVar2.f1785b.add(jVar3);
                                arrayDeque.push(jVar3);
                                if (jVar3.getGroupName() != null) {
                                    fVar.put(jVar3.getGroupName(), jVar3);
                                }
                                nVar3.f1807a = nVar3.f1807a;
                            }
                        }
                        i5 = 1;
                    } else {
                        i4 = depth;
                        c = '\b';
                        i5 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i7 = i5;
                    depth = i4;
                }
                if (!z4) {
                    this.h = a(nVar.c, nVar.f1809d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f4.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f4.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f1820k = true;
        this.f1821l = new float[9];
        this.f1822m = new Matrix();
        this.f1823n = new Rect();
        this.g = nVar;
        this.h = a(nVar.c, nVar.f1809d);
    }
}
