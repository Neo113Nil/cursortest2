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
public final class C0276p extends AbstractC0267g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3182j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0274n f3183b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3184c;
    public ColorFilter d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3185e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3186f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3187g;
    public final Matrix h;
    public final Rect i;

    public C0276p() {
        this.f3186f = true;
        this.f3187g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        C0274n c0274n = new C0274n();
        c0274n.f3174c = null;
        c0274n.d = f3182j;
        c0274n.f3173b = new C0273m();
        this.f3183b = c0274n;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3139a;
        if (drawable == null) {
            return false;
        }
        D.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3139a;
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
            colorFilter = this.f3184c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3187g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != RecyclerView.f1530C0 || abs4 != RecyclerView.f1530C0) {
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
            canvas.translate(rect.width(), RecyclerView.f1530C0);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0274n c0274n = this.f3183b;
        Bitmap bitmap = c0274n.f3176f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0274n.f3176f.getHeight()) {
            c0274n.f3176f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0274n.f3179k = true;
        }
        if (this.f3186f) {
            C0274n c0274n2 = this.f3183b;
            if (c0274n2.f3179k || c0274n2.f3177g != c0274n2.f3174c || c0274n2.h != c0274n2.d || c0274n2.f3178j != c0274n2.f3175e || c0274n2.i != c0274n2.f3173b.getRootAlpha()) {
                C0274n c0274n3 = this.f3183b;
                c0274n3.f3176f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0274n3.f3176f);
                C0273m c0273m = c0274n3.f3173b;
                c0273m.a(c0273m.f3165g, C0273m.f3159p, canvas2, min, min2);
                C0274n c0274n4 = this.f3183b;
                c0274n4.f3177g = c0274n4.f3174c;
                c0274n4.h = c0274n4.d;
                c0274n4.i = c0274n4.f3173b.getRootAlpha();
                c0274n4.f3178j = c0274n4.f3175e;
                c0274n4.f3179k = false;
            }
        } else {
            C0274n c0274n5 = this.f3183b;
            c0274n5.f3176f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0274n5.f3176f);
            C0273m c0273m2 = c0274n5.f3173b;
            c0273m2.a(c0273m2.f3165g, C0273m.f3159p, canvas3, min, min2);
        }
        C0274n c0274n6 = this.f3183b;
        if (c0274n6.f3173b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0274n6.f3180l == null) {
                Paint paint2 = new Paint();
                c0274n6.f3180l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0274n6.f3180l.setAlpha(c0274n6.f3173b.getRootAlpha());
            c0274n6.f3180l.setColorFilter(colorFilter);
            paint = c0274n6.f3180l;
        }
        canvas.drawBitmap(c0274n6.f3176f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.getAlpha() : this.f3183b.f3173b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3183b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3139a;
        return drawable != null ? D.a.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3139a != null) {
            return new C0275o(this.f3139a.getConstantState());
        }
        this.f3183b.f3172a = getChangingConfigurations();
        return this.f3183b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3183b.f3173b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3183b.f3173b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3183b.f3175e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0274n c0274n = this.f3183b;
            if (c0274n != null) {
                C0273m c0273m = c0274n.f3173b;
                if (c0273m.f3170n == null) {
                    c0273m.f3170n = Boolean.valueOf(c0273m.f3165g.a());
                }
                if (c0273m.f3170n.booleanValue() || ((colorStateList = this.f3183b.f3174c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3185e && super.mutate() == this) {
            C0274n c0274n = this.f3183b;
            C0274n c0274n2 = new C0274n();
            c0274n2.f3174c = null;
            c0274n2.d = f3182j;
            if (c0274n != null) {
                c0274n2.f3172a = c0274n.f3172a;
                C0273m c0273m = new C0273m(c0274n.f3173b);
                c0274n2.f3173b = c0273m;
                if (c0274n.f3173b.f3163e != null) {
                    c0273m.f3163e = new Paint(c0274n.f3173b.f3163e);
                }
                if (c0274n.f3173b.d != null) {
                    c0274n2.f3173b.d = new Paint(c0274n.f3173b.d);
                }
                c0274n2.f3174c = c0274n.f3174c;
                c0274n2.d = c0274n.d;
                c0274n2.f3175e = c0274n.f3175e;
            }
            this.f3183b = c0274n2;
            this.f3185e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0274n c0274n = this.f3183b;
        ColorStateList colorStateList = c0274n.f3174c;
        if (colorStateList == null || (mode = c0274n.d) == null) {
            z2 = false;
        } else {
            this.f3184c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0273m c0273m = c0274n.f3173b;
        if (c0273m.f3170n == null) {
            c0273m.f3170n = Boolean.valueOf(c0273m.f3165g.a());
        }
        if (c0273m.f3170n.booleanValue()) {
            boolean b2 = c0274n.f3173b.f3165g.b(iArr);
            c0274n.f3179k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3183b.f3173b.getRootAlpha() != i) {
            this.f3183b.f3173b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3183b.f3175e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            w1.l.Y(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            D.a.h(drawable, colorStateList);
            return;
        }
        C0274n c0274n = this.f3183b;
        if (c0274n.f3174c != colorStateList) {
            c0274n.f3174c = colorStateList;
            this.f3184c = a(colorStateList, c0274n.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            D.a.i(drawable, mode);
            return;
        }
        C0274n c0274n = this.f3183b;
        if (c0274n.d != mode) {
            c0274n.d = mode;
            this.f3184c = a(c0274n.f3174c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3139a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0273m c0273m;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f3139a;
        if (drawable != null) {
            D.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0274n c0274n = this.f3183b;
        c0274n.f3173b = new C0273m();
        TypedArray f2 = B.b.f(resources, theme, attributeSet, AbstractC0261a.f3124a);
        C0274n c0274n2 = this.f3183b;
        C0273m c0273m2 = c0274n2.f3173b;
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
        c0274n2.d = mode;
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
                ThreadLocal threadLocal = B.c.f17a;
                try {
                    colorStateList = B.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0274n2.f3174c = colorStateList2;
        }
        boolean z5 = c0274n2.f3175e;
        if (B.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        c0274n2.f3175e = z5;
        float f3 = c0273m2.f3166j;
        if (B.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        c0273m2.f3166j = f3;
        float f4 = c0273m2.f3167k;
        if (B.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        c0273m2.f3167k = f4;
        if (c0273m2.f3166j <= RecyclerView.f1530C0) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > RecyclerView.f1530C0) {
            c0273m2.h = f2.getDimension(3, c0273m2.h);
            float dimension = f2.getDimension(2, c0273m2.i);
            c0273m2.i = dimension;
            if (c0273m2.h <= RecyclerView.f1530C0) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > RecyclerView.f1530C0) {
                float alpha = c0273m2.getAlpha();
                if (B.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                c0273m2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    c0273m2.f3169m = string;
                    c0273m2.f3171o.put(string, c0273m2);
                }
                f2.recycle();
                c0274n.f3172a = getChangingConfigurations();
                c0274n.f3179k = true;
                C0274n c0274n3 = this.f3183b;
                C0273m c0273m3 = c0274n3.f3173b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0273m3.f3165g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0270j c0270j = (C0270j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        o.b bVar = c0273m3.f3171o;
                        if (equals) {
                            C0269i c0269i = new C0269i();
                            c0269i.f3140e = RecyclerView.f1530C0;
                            c0269i.f3142g = 1.0f;
                            c0269i.h = 1.0f;
                            c0269i.i = RecyclerView.f1530C0;
                            c0269i.f3143j = 1.0f;
                            c0269i.f3144k = RecyclerView.f1530C0;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0269i.f3145l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c0269i.f3146m = join3;
                            c0273m = c0273m3;
                            c0269i.f3147n = 4.0f;
                            TypedArray f5 = B.b.f(resources, theme, attributeSet, AbstractC0261a.f3126c);
                            if (B.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    c0269i.f3157b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    c0269i.f3156a = w1.d.y(string3);
                                }
                                c0269i.f3141f = B.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = c0269i.h;
                                if (B.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                c0269i.h = f6;
                                int i8 = !B.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = c0269i.f3145l;
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
                                c0269i.f3145l = cap;
                                int i9 = !B.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = c0269i.f3146m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c0269i.f3146m = join2;
                                float f7 = c0269i.f3147n;
                                if (B.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                c0269i.f3147n = f7;
                                c0269i.d = B.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = c0269i.f3142g;
                                if (B.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                c0269i.f3142g = f8;
                                float f9 = c0269i.f3140e;
                                if (B.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                c0269i.f3140e = f9;
                                float f10 = c0269i.f3143j;
                                if (B.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                c0269i.f3143j = f10;
                                float f11 = c0269i.f3144k;
                                if (B.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                c0269i.f3144k = f11;
                                float f12 = c0269i.i;
                                if (B.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                c0269i.i = f12;
                                int i10 = c0269i.f3158c;
                                if (B.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                c0269i.f3158c = i10;
                            }
                            f5.recycle();
                            c0270j.f3149b.add(c0269i);
                            if (c0269i.getPathName() != null) {
                                bVar.put(c0269i.getPathName(), c0269i);
                            }
                            c0274n3.f3172a = c0274n3.f3172a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            c0273m = c0273m3;
                            if ("clip-path".equals(name)) {
                                C0268h c0268h = new C0268h();
                                if (B.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = B.b.f(resources, theme, attributeSet, AbstractC0261a.d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        c0268h.f3157b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        c0268h.f3156a = w1.d.y(string5);
                                    }
                                    c0268h.f3158c = !B.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                c0270j.f3149b.add(c0268h);
                                if (c0268h.getPathName() != null) {
                                    bVar.put(c0268h.getPathName(), c0268h);
                                }
                                c0274n3.f3172a = c0274n3.f3172a;
                            } else if ("group".equals(name)) {
                                C0270j c0270j2 = new C0270j();
                                TypedArray f14 = B.b.f(resources, theme, attributeSet, AbstractC0261a.f3125b);
                                float f15 = c0270j2.f3150c;
                                if (B.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                c0270j2.f3150c = f15;
                                i2 = 1;
                                c0270j2.d = f14.getFloat(1, c0270j2.d);
                                c0270j2.f3151e = f14.getFloat(2, c0270j2.f3151e);
                                float f16 = c0270j2.f3152f;
                                if (B.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                c0270j2.f3152f = f16;
                                float f17 = c0270j2.f3153g;
                                if (B.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                c0270j2.f3153g = f17;
                                float f18 = c0270j2.h;
                                if (B.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                c0270j2.h = f18;
                                float f19 = c0270j2.i;
                                if (B.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                c0270j2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    c0270j2.f3155k = string6;
                                }
                                c0270j2.c();
                                f14.recycle();
                                c0270j.f3149b.add(c0270j2);
                                arrayDeque.push(c0270j2);
                                if (c0270j2.getGroupName() != null) {
                                    bVar.put(c0270j2.getGroupName(), c0270j2);
                                }
                                c0274n3.f3172a = c0274n3.f3172a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        c0273m = c0273m3;
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
                    c0273m3 = c0273m;
                }
                if (!z6) {
                    this.f3184c = a(c0274n.f3174c, c0274n.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0276p(C0274n c0274n) {
        this.f3186f = true;
        this.f3187g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f3183b = c0274n;
        this.f3184c = a(c0274n.f3174c, c0274n.d);
    }
}
