package m0;

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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: m0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279p extends AbstractC0270g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3206j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0277n f3207b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3208c;
    public ColorFilter d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3209e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3210f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3211g;
    public final Matrix h;
    public final Rect i;

    public C0279p() {
        this.f3210f = true;
        this.f3211g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        C0277n c0277n = new C0277n();
        c0277n.f3198c = null;
        c0277n.d = f3206j;
        c0277n.f3197b = new C0276m();
        this.f3207b = c0277n;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3163a;
        if (drawable == null) {
            return false;
        }
        D.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3163a;
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
            colorFilter = this.f3208c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3211g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != RecyclerView.f1559A0 || abs4 != RecyclerView.f1559A0) {
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
            canvas.translate(rect.width(), RecyclerView.f1559A0);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0277n c0277n = this.f3207b;
        Bitmap bitmap = c0277n.f3200f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0277n.f3200f.getHeight()) {
            c0277n.f3200f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0277n.f3203k = true;
        }
        if (this.f3210f) {
            C0277n c0277n2 = this.f3207b;
            if (c0277n2.f3203k || c0277n2.f3201g != c0277n2.f3198c || c0277n2.h != c0277n2.d || c0277n2.f3202j != c0277n2.f3199e || c0277n2.i != c0277n2.f3197b.getRootAlpha()) {
                C0277n c0277n3 = this.f3207b;
                c0277n3.f3200f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0277n3.f3200f);
                C0276m c0276m = c0277n3.f3197b;
                c0276m.a(c0276m.f3189g, C0276m.f3183p, canvas2, min, min2);
                C0277n c0277n4 = this.f3207b;
                c0277n4.f3201g = c0277n4.f3198c;
                c0277n4.h = c0277n4.d;
                c0277n4.i = c0277n4.f3197b.getRootAlpha();
                c0277n4.f3202j = c0277n4.f3199e;
                c0277n4.f3203k = false;
            }
        } else {
            C0277n c0277n5 = this.f3207b;
            c0277n5.f3200f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0277n5.f3200f);
            C0276m c0276m2 = c0277n5.f3197b;
            c0276m2.a(c0276m2.f3189g, C0276m.f3183p, canvas3, min, min2);
        }
        C0277n c0277n6 = this.f3207b;
        if (c0277n6.f3197b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0277n6.f3204l == null) {
                Paint paint2 = new Paint();
                c0277n6.f3204l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0277n6.f3204l.setAlpha(c0277n6.f3197b.getRootAlpha());
            c0277n6.f3204l.setColorFilter(colorFilter);
            paint = c0277n6.f3204l;
        }
        canvas.drawBitmap(c0277n6.f3200f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.getAlpha() : this.f3207b.f3197b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3207b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3163a;
        return drawable != null ? D.a.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3163a != null) {
            return new C0278o(this.f3163a.getConstantState());
        }
        this.f3207b.f3196a = getChangingConfigurations();
        return this.f3207b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3207b.f3197b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3207b.f3197b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3207b.f3199e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0277n c0277n = this.f3207b;
            if (c0277n != null) {
                C0276m c0276m = c0277n.f3197b;
                if (c0276m.f3194n == null) {
                    c0276m.f3194n = Boolean.valueOf(c0276m.f3189g.a());
                }
                if (c0276m.f3194n.booleanValue() || ((colorStateList = this.f3207b.f3198c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3209e && super.mutate() == this) {
            C0277n c0277n = this.f3207b;
            C0277n c0277n2 = new C0277n();
            c0277n2.f3198c = null;
            c0277n2.d = f3206j;
            if (c0277n != null) {
                c0277n2.f3196a = c0277n.f3196a;
                C0276m c0276m = new C0276m(c0277n.f3197b);
                c0277n2.f3197b = c0276m;
                if (c0277n.f3197b.f3187e != null) {
                    c0276m.f3187e = new Paint(c0277n.f3197b.f3187e);
                }
                if (c0277n.f3197b.d != null) {
                    c0277n2.f3197b.d = new Paint(c0277n.f3197b.d);
                }
                c0277n2.f3198c = c0277n.f3198c;
                c0277n2.d = c0277n.d;
                c0277n2.f3199e = c0277n.f3199e;
            }
            this.f3207b = c0277n2;
            this.f3209e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0277n c0277n = this.f3207b;
        ColorStateList colorStateList = c0277n.f3198c;
        if (colorStateList == null || (mode = c0277n.d) == null) {
            z2 = false;
        } else {
            this.f3208c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0276m c0276m = c0277n.f3197b;
        if (c0276m.f3194n == null) {
            c0276m.f3194n = Boolean.valueOf(c0276m.f3189g.a());
        }
        if (c0276m.f3194n.booleanValue()) {
            boolean b2 = c0277n.f3197b.f3189g.b(iArr);
            c0277n.f3203k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3207b.f3197b.getRootAlpha() != i) {
            this.f3207b.f3197b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3207b.f3199e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            z1.d.r0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
            return;
        }
        C0277n c0277n = this.f3207b;
        if (c0277n.f3198c != colorStateList) {
            c0277n.f3198c = colorStateList;
            this.f3208c = a(colorStateList, c0277n.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            D.a.i(drawable, mode);
            return;
        }
        C0277n c0277n = this.f3207b;
        if (c0277n.d != mode) {
            c0277n.d = mode;
            this.f3208c = a(c0277n.f3198c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3163a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0276m c0276m;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f3163a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0277n c0277n = this.f3207b;
        c0277n.f3197b = new C0276m();
        TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0264a.f3148a);
        C0277n c0277n2 = this.f3207b;
        C0276m c0276m2 = c0277n2.f3197b;
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
        c0277n2.d = mode;
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
                ThreadLocal threadLocal = B.c.f31a;
                try {
                    colorStateList = B.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0277n2.f3198c = colorStateList2;
        }
        boolean z5 = c0277n2.f3199e;
        if (B.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        c0277n2.f3199e = z5;
        float f3 = c0276m2.f3190j;
        if (B.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        c0276m2.f3190j = f3;
        float f4 = c0276m2.f3191k;
        if (B.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        c0276m2.f3191k = f4;
        if (c0276m2.f3190j <= RecyclerView.f1559A0) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > RecyclerView.f1559A0) {
            c0276m2.h = f2.getDimension(3, c0276m2.h);
            float dimension = f2.getDimension(2, c0276m2.i);
            c0276m2.i = dimension;
            if (c0276m2.h <= RecyclerView.f1559A0) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > RecyclerView.f1559A0) {
                float alpha = c0276m2.getAlpha();
                if (B.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                c0276m2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    c0276m2.f3193m = string;
                    c0276m2.f3195o.put(string, c0276m2);
                }
                f2.recycle();
                c0277n.f3196a = getChangingConfigurations();
                c0277n.f3203k = true;
                C0277n c0277n3 = this.f3207b;
                C0276m c0276m3 = c0277n3.f3197b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0276m3.f3189g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0273j c0273j = (C0273j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        o.b bVar = c0276m3.f3195o;
                        if (equals) {
                            C0272i c0272i = new C0272i();
                            c0272i.f3164e = RecyclerView.f1559A0;
                            c0272i.f3166g = 1.0f;
                            c0272i.h = 1.0f;
                            c0272i.i = RecyclerView.f1559A0;
                            c0272i.f3167j = 1.0f;
                            c0272i.f3168k = RecyclerView.f1559A0;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0272i.f3169l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c0272i.f3170m = join3;
                            c0276m = c0276m3;
                            c0272i.f3171n = 4.0f;
                            TypedArray f5 = B.b.f(resources, theme, attributeSet, AbstractC0264a.f3150c);
                            if (B.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    c0272i.f3181b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    c0272i.f3180a = z1.l.o(string3);
                                }
                                c0272i.f3165f = B.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = c0272i.h;
                                if (B.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                c0272i.h = f6;
                                int i8 = !B.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = c0272i.f3169l;
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
                                c0272i.f3169l = cap;
                                int i9 = !B.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = c0272i.f3170m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c0272i.f3170m = join2;
                                float f7 = c0272i.f3171n;
                                if (B.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                c0272i.f3171n = f7;
                                c0272i.d = B.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = c0272i.f3166g;
                                if (B.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                c0272i.f3166g = f8;
                                float f9 = c0272i.f3164e;
                                if (B.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                c0272i.f3164e = f9;
                                float f10 = c0272i.f3167j;
                                if (B.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                c0272i.f3167j = f10;
                                float f11 = c0272i.f3168k;
                                if (B.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                c0272i.f3168k = f11;
                                float f12 = c0272i.i;
                                if (B.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                c0272i.i = f12;
                                int i10 = c0272i.f3182c;
                                if (B.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                c0272i.f3182c = i10;
                            }
                            f5.recycle();
                            c0273j.f3173b.add(c0272i);
                            if (c0272i.getPathName() != null) {
                                bVar.put(c0272i.getPathName(), c0272i);
                            }
                            c0277n3.f3196a = c0277n3.f3196a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            c0276m = c0276m3;
                            if ("clip-path".equals(name)) {
                                C0271h c0271h = new C0271h();
                                if (B.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = B.b.f(resources, theme, attributeSet, AbstractC0264a.d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        c0271h.f3181b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        c0271h.f3180a = z1.l.o(string5);
                                    }
                                    c0271h.f3182c = !B.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                c0273j.f3173b.add(c0271h);
                                if (c0271h.getPathName() != null) {
                                    bVar.put(c0271h.getPathName(), c0271h);
                                }
                                c0277n3.f3196a = c0277n3.f3196a;
                            } else if ("group".equals(name)) {
                                C0273j c0273j2 = new C0273j();
                                TypedArray f14 = B.b.f(resources, theme, attributeSet, AbstractC0264a.f3149b);
                                float f15 = c0273j2.f3174c;
                                if (B.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                c0273j2.f3174c = f15;
                                i2 = 1;
                                c0273j2.d = f14.getFloat(1, c0273j2.d);
                                c0273j2.f3175e = f14.getFloat(2, c0273j2.f3175e);
                                float f16 = c0273j2.f3176f;
                                if (B.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                c0273j2.f3176f = f16;
                                float f17 = c0273j2.f3177g;
                                if (B.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                c0273j2.f3177g = f17;
                                float f18 = c0273j2.h;
                                if (B.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                c0273j2.h = f18;
                                float f19 = c0273j2.i;
                                if (B.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                c0273j2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    c0273j2.f3179k = string6;
                                }
                                c0273j2.c();
                                f14.recycle();
                                c0273j.f3173b.add(c0273j2);
                                arrayDeque.push(c0273j2);
                                if (c0273j2.getGroupName() != null) {
                                    bVar.put(c0273j2.getGroupName(), c0273j2);
                                }
                                c0277n3.f3196a = c0277n3.f3196a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        c0276m = c0276m3;
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
                    c0276m3 = c0276m;
                }
                if (!z6) {
                    this.f3208c = a(c0277n.f3198c, c0277n.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0279p(C0277n c0277n) {
        this.f3210f = true;
        this.f3211g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f3207b = c0277n;
        this.f3208c = a(c0277n.f3198c, c0277n.d);
    }
}
