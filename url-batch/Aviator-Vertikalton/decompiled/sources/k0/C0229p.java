package k0;

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

/* renamed from: k0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229p extends AbstractC0220g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3195j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0227n f3196b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3197c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f3198d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3199e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3200f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3201g;
    public final Matrix h;
    public final Rect i;

    public C0229p() {
        this.f3200f = true;
        this.f3201g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        C0227n c0227n = new C0227n();
        c0227n.f3186c = null;
        c0227n.f3187d = f3195j;
        c0227n.f3185b = new C0226m();
        this.f3196b = c0227n;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3148a;
        if (drawable == null) {
            return false;
        }
        D.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3198d;
        if (colorFilter == null) {
            colorFilter = this.f3197c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3201g;
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
        C0227n c0227n = this.f3196b;
        Bitmap bitmap = c0227n.f3189f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0227n.f3189f.getHeight()) {
            c0227n.f3189f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0227n.f3192k = true;
        }
        if (this.f3200f) {
            C0227n c0227n2 = this.f3196b;
            if (c0227n2.f3192k || c0227n2.f3190g != c0227n2.f3186c || c0227n2.h != c0227n2.f3187d || c0227n2.f3191j != c0227n2.f3188e || c0227n2.i != c0227n2.f3185b.getRootAlpha()) {
                C0227n c0227n3 = this.f3196b;
                c0227n3.f3189f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0227n3.f3189f);
                C0226m c0226m = c0227n3.f3185b;
                c0226m.a(c0226m.f3177g, C0226m.f3170p, canvas2, min, min2);
                C0227n c0227n4 = this.f3196b;
                c0227n4.f3190g = c0227n4.f3186c;
                c0227n4.h = c0227n4.f3187d;
                c0227n4.i = c0227n4.f3185b.getRootAlpha();
                c0227n4.f3191j = c0227n4.f3188e;
                c0227n4.f3192k = false;
            }
        } else {
            C0227n c0227n5 = this.f3196b;
            c0227n5.f3189f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0227n5.f3189f);
            C0226m c0226m2 = c0227n5.f3185b;
            c0226m2.a(c0226m2.f3177g, C0226m.f3170p, canvas3, min, min2);
        }
        C0227n c0227n6 = this.f3196b;
        if (c0227n6.f3185b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0227n6.f3193l == null) {
                Paint paint2 = new Paint();
                c0227n6.f3193l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0227n6.f3193l.setAlpha(c0227n6.f3185b.getRootAlpha());
            c0227n6.f3193l.setColorFilter(colorFilter);
            paint = c0227n6.f3193l;
        }
        canvas.drawBitmap(c0227n6.f3189f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3148a;
        return drawable != null ? drawable.getAlpha() : this.f3196b.f3185b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3148a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3196b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3148a;
        return drawable != null ? D.a.c(drawable) : this.f3198d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3148a != null) {
            return new C0228o(this.f3148a.getConstantState());
        }
        this.f3196b.f3184a = getChangingConfigurations();
        return this.f3196b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3148a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3196b.f3185b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3148a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3196b.f3185b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3148a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3196b.f3188e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0227n c0227n = this.f3196b;
            if (c0227n != null) {
                C0226m c0226m = c0227n.f3185b;
                if (c0226m.f3182n == null) {
                    c0226m.f3182n = Boolean.valueOf(c0226m.f3177g.a());
                }
                if (c0226m.f3182n.booleanValue() || ((colorStateList = this.f3196b.f3186c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3199e && super.mutate() == this) {
            C0227n c0227n = this.f3196b;
            C0227n c0227n2 = new C0227n();
            c0227n2.f3186c = null;
            c0227n2.f3187d = f3195j;
            if (c0227n != null) {
                c0227n2.f3184a = c0227n.f3184a;
                C0226m c0226m = new C0226m(c0227n.f3185b);
                c0227n2.f3185b = c0226m;
                if (c0227n.f3185b.f3175e != null) {
                    c0226m.f3175e = new Paint(c0227n.f3185b.f3175e);
                }
                if (c0227n.f3185b.f3174d != null) {
                    c0227n2.f3185b.f3174d = new Paint(c0227n.f3185b.f3174d);
                }
                c0227n2.f3186c = c0227n.f3186c;
                c0227n2.f3187d = c0227n.f3187d;
                c0227n2.f3188e = c0227n.f3188e;
            }
            this.f3196b = c0227n2;
            this.f3199e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0227n c0227n = this.f3196b;
        ColorStateList colorStateList = c0227n.f3186c;
        if (colorStateList == null || (mode = c0227n.f3187d) == null) {
            z2 = false;
        } else {
            this.f3197c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0226m c0226m = c0227n.f3185b;
        if (c0226m.f3182n == null) {
            c0226m.f3182n = Boolean.valueOf(c0226m.f3177g.a());
        }
        if (c0226m.f3182n.booleanValue()) {
            boolean b2 = c0227n.f3185b.f3177g.b(iArr);
            c0227n.f3192k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3196b.f3185b.getRootAlpha() != i) {
            this.f3196b.f3185b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3196b.f3188e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3198d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            q1.d.X(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
            return;
        }
        C0227n c0227n = this.f3196b;
        if (c0227n.f3186c != colorStateList) {
            c0227n.f3186c = colorStateList;
            this.f3197c = a(colorStateList, c0227n.f3187d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            D.a.i(drawable, mode);
            return;
        }
        C0227n c0227n = this.f3196b;
        if (c0227n.f3187d != mode) {
            c0227n.f3187d = mode;
            this.f3197c = a(c0227n.f3186c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3148a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0226m c0226m;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f3148a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0227n c0227n = this.f3196b;
        c0227n.f3185b = new C0226m();
        TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0214a.f3130a);
        C0227n c0227n2 = this.f3196b;
        C0226m c0226m2 = c0227n2.f3185b;
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
        c0227n2.f3187d = mode;
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
                ThreadLocal threadLocal = B.c.f19a;
                try {
                    colorStateList = B.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0227n2.f3186c = colorStateList2;
        }
        boolean z5 = c0227n2.f3188e;
        if (B.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        c0227n2.f3188e = z5;
        float f3 = c0226m2.f3178j;
        if (B.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        c0226m2.f3178j = f3;
        float f4 = c0226m2.f3179k;
        if (B.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        c0226m2.f3179k = f4;
        if (c0226m2.f3178j <= 0.0f) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > 0.0f) {
            c0226m2.h = f2.getDimension(3, c0226m2.h);
            float dimension = f2.getDimension(2, c0226m2.i);
            c0226m2.i = dimension;
            if (c0226m2.h <= 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c0226m2.getAlpha();
                if (B.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                c0226m2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    c0226m2.f3181m = string;
                    c0226m2.f3183o.put(string, c0226m2);
                }
                f2.recycle();
                c0227n.f3184a = getChangingConfigurations();
                c0227n.f3192k = true;
                C0227n c0227n3 = this.f3196b;
                C0226m c0226m3 = c0227n3.f3185b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0226m3.f3177g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0223j c0223j = (C0223j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        o.b bVar = c0226m3.f3183o;
                        if (equals) {
                            C0222i c0222i = new C0222i();
                            c0222i.f3150e = 0.0f;
                            c0222i.f3152g = 1.0f;
                            c0222i.h = 1.0f;
                            c0222i.i = 0.0f;
                            c0222i.f3153j = 1.0f;
                            c0222i.f3154k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0222i.f3155l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c0222i.f3156m = join3;
                            c0226m = c0226m3;
                            c0222i.f3157n = 4.0f;
                            TypedArray f5 = B.b.f(resources, theme, attributeSet, AbstractC0214a.f3132c);
                            if (B.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    c0222i.f3168b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    c0222i.f3167a = q1.d.s(string3);
                                }
                                c0222i.f3151f = B.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = c0222i.h;
                                if (B.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                c0222i.h = f6;
                                int i8 = !B.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = c0222i.f3155l;
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
                                c0222i.f3155l = cap;
                                int i9 = !B.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = c0222i.f3156m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c0222i.f3156m = join2;
                                float f7 = c0222i.f3157n;
                                if (B.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                c0222i.f3157n = f7;
                                c0222i.f3149d = B.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = c0222i.f3152g;
                                if (B.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                c0222i.f3152g = f8;
                                float f9 = c0222i.f3150e;
                                if (B.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                c0222i.f3150e = f9;
                                float f10 = c0222i.f3153j;
                                if (B.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                c0222i.f3153j = f10;
                                float f11 = c0222i.f3154k;
                                if (B.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                c0222i.f3154k = f11;
                                float f12 = c0222i.i;
                                if (B.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                c0222i.i = f12;
                                int i10 = c0222i.f3169c;
                                if (B.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                c0222i.f3169c = i10;
                            }
                            f5.recycle();
                            c0223j.f3159b.add(c0222i);
                            if (c0222i.getPathName() != null) {
                                bVar.put(c0222i.getPathName(), c0222i);
                            }
                            c0227n3.f3184a = c0227n3.f3184a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            c0226m = c0226m3;
                            if ("clip-path".equals(name)) {
                                C0221h c0221h = new C0221h();
                                if (B.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = B.b.f(resources, theme, attributeSet, AbstractC0214a.f3133d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        c0221h.f3168b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        c0221h.f3167a = q1.d.s(string5);
                                    }
                                    c0221h.f3169c = !B.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                c0223j.f3159b.add(c0221h);
                                if (c0221h.getPathName() != null) {
                                    bVar.put(c0221h.getPathName(), c0221h);
                                }
                                c0227n3.f3184a = c0227n3.f3184a;
                            } else if ("group".equals(name)) {
                                C0223j c0223j2 = new C0223j();
                                TypedArray f14 = B.b.f(resources, theme, attributeSet, AbstractC0214a.f3131b);
                                float f15 = c0223j2.f3160c;
                                if (B.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                c0223j2.f3160c = f15;
                                i2 = 1;
                                c0223j2.f3161d = f14.getFloat(1, c0223j2.f3161d);
                                c0223j2.f3162e = f14.getFloat(2, c0223j2.f3162e);
                                float f16 = c0223j2.f3163f;
                                if (B.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                c0223j2.f3163f = f16;
                                float f17 = c0223j2.f3164g;
                                if (B.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                c0223j2.f3164g = f17;
                                float f18 = c0223j2.h;
                                if (B.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                c0223j2.h = f18;
                                float f19 = c0223j2.i;
                                if (B.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                c0223j2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    c0223j2.f3166k = string6;
                                }
                                c0223j2.c();
                                f14.recycle();
                                c0223j.f3159b.add(c0223j2);
                                arrayDeque.push(c0223j2);
                                if (c0223j2.getGroupName() != null) {
                                    bVar.put(c0223j2.getGroupName(), c0223j2);
                                }
                                c0227n3.f3184a = c0227n3.f3184a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        c0226m = c0226m3;
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
                    c0226m3 = c0226m;
                }
                if (!z6) {
                    this.f3197c = a(c0227n.f3186c, c0227n.f3187d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0229p(C0227n c0227n) {
        this.f3200f = true;
        this.f3201g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f3196b = c0227n;
        this.f3197c = a(c0227n.f3186c, c0227n.f3187d);
    }
}
