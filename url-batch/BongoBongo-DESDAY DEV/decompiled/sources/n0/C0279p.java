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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: n0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279p extends AbstractC0270g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3377j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0277n f3378b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3379c;
    public ColorFilter d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3380e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3381f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3382g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f3383h;
    public final Rect i;

    public C0279p() {
        this.f3381f = true;
        this.f3382g = new float[9];
        this.f3383h = new Matrix();
        this.i = new Rect();
        C0277n c0277n = new C0277n();
        c0277n.f3368c = null;
        c0277n.d = f3377j;
        c0277n.f3367b = new C0276m();
        this.f3378b = c0277n;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3330a;
        if (drawable == null) {
            return false;
        }
        E.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3330a;
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
            colorFilter = this.f3379c;
        }
        Matrix matrix = this.f3383h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3382g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != RecyclerView.A0 || abs4 != RecyclerView.A0) {
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
        if (isAutoMirrored() && E.b.a(this) == 1) {
            canvas.translate(rect.width(), RecyclerView.A0);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0277n c0277n = this.f3378b;
        Bitmap bitmap = c0277n.f3370f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0277n.f3370f.getHeight()) {
            c0277n.f3370f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0277n.f3374k = true;
        }
        if (this.f3381f) {
            C0277n c0277n2 = this.f3378b;
            if (c0277n2.f3374k || c0277n2.f3371g != c0277n2.f3368c || c0277n2.f3372h != c0277n2.d || c0277n2.f3373j != c0277n2.f3369e || c0277n2.i != c0277n2.f3367b.getRootAlpha()) {
                C0277n c0277n3 = this.f3378b;
                c0277n3.f3370f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0277n3.f3370f);
                C0276m c0276m = c0277n3.f3367b;
                c0276m.a(c0276m.f3358g, C0276m.f3352p, canvas2, min, min2);
                C0277n c0277n4 = this.f3378b;
                c0277n4.f3371g = c0277n4.f3368c;
                c0277n4.f3372h = c0277n4.d;
                c0277n4.i = c0277n4.f3367b.getRootAlpha();
                c0277n4.f3373j = c0277n4.f3369e;
                c0277n4.f3374k = false;
            }
        } else {
            C0277n c0277n5 = this.f3378b;
            c0277n5.f3370f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0277n5.f3370f);
            C0276m c0276m2 = c0277n5.f3367b;
            c0276m2.a(c0276m2.f3358g, C0276m.f3352p, canvas3, min, min2);
        }
        C0277n c0277n6 = this.f3378b;
        if (c0277n6.f3367b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0277n6.f3375l == null) {
                Paint paint2 = new Paint();
                c0277n6.f3375l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0277n6.f3375l.setAlpha(c0277n6.f3367b.getRootAlpha());
            c0277n6.f3375l.setColorFilter(colorFilter);
            paint = c0277n6.f3375l;
        }
        canvas.drawBitmap(c0277n6.f3370f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.getAlpha() : this.f3378b.f3367b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3378b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3330a;
        return drawable != null ? E.a.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3330a != null) {
            return new C0278o(this.f3330a.getConstantState());
        }
        this.f3378b.f3366a = getChangingConfigurations();
        return this.f3378b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3378b.f3367b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3378b.f3367b.f3359h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3378b.f3369e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0277n c0277n = this.f3378b;
            if (c0277n != null) {
                C0276m c0276m = c0277n.f3367b;
                if (c0276m.f3364n == null) {
                    c0276m.f3364n = Boolean.valueOf(c0276m.f3358g.a());
                }
                if (c0276m.f3364n.booleanValue() || ((colorStateList = this.f3378b.f3368c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3380e && super.mutate() == this) {
            C0277n c0277n = this.f3378b;
            C0277n c0277n2 = new C0277n();
            c0277n2.f3368c = null;
            c0277n2.d = f3377j;
            if (c0277n != null) {
                c0277n2.f3366a = c0277n.f3366a;
                C0276m c0276m = new C0276m(c0277n.f3367b);
                c0277n2.f3367b = c0276m;
                if (c0277n.f3367b.f3356e != null) {
                    c0276m.f3356e = new Paint(c0277n.f3367b.f3356e);
                }
                if (c0277n.f3367b.d != null) {
                    c0277n2.f3367b.d = new Paint(c0277n.f3367b.d);
                }
                c0277n2.f3368c = c0277n.f3368c;
                c0277n2.d = c0277n.d;
                c0277n2.f3369e = c0277n.f3369e;
            }
            this.f3378b = c0277n2;
            this.f3380e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0277n c0277n = this.f3378b;
        ColorStateList colorStateList = c0277n.f3368c;
        if (colorStateList == null || (mode = c0277n.d) == null) {
            z2 = false;
        } else {
            this.f3379c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0276m c0276m = c0277n.f3367b;
        if (c0276m.f3364n == null) {
            c0276m.f3364n = Boolean.valueOf(c0276m.f3358g.a());
        }
        if (c0276m.f3364n.booleanValue()) {
            boolean b2 = c0277n.f3367b.f3358g.b(iArr);
            c0277n.f3374k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3378b.f3367b.getRootAlpha() != i) {
            this.f3378b.f3367b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3378b.f3369e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            A1.m.i0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            E.a.h(drawable, colorStateList);
            return;
        }
        C0277n c0277n = this.f3378b;
        if (c0277n.f3368c != colorStateList) {
            c0277n.f3368c = colorStateList;
            this.f3379c = a(colorStateList, c0277n.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            E.a.i(drawable, mode);
            return;
        }
        C0277n c0277n = this.f3378b;
        if (c0277n.d != mode) {
            c0277n.d = mode;
            this.f3379c = a(c0277n.f3368c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3330a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3330a;
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
        Drawable drawable = this.f3330a;
        if (drawable != null) {
            E.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0277n c0277n = this.f3378b;
        c0277n.f3367b = new C0276m();
        TypedArray f2 = C.b.f(resources, theme, attributeSet, AbstractC0264a.f3315a);
        C0277n c0277n2 = this.f3378b;
        C0276m c0276m2 = c0277n2.f3367b;
        int i4 = !C.b.c(xmlPullParser, "tintMode") ? -1 : f2.getInt(6, -1);
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
        if (C.b.c(xmlPullParser, "tint")) {
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
                ThreadLocal threadLocal = C.c.f72a;
                try {
                    colorStateList = C.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0277n2.f3368c = colorStateList2;
        }
        boolean z5 = c0277n2.f3369e;
        if (C.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        c0277n2.f3369e = z5;
        float f3 = c0276m2.f3360j;
        if (C.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        c0276m2.f3360j = f3;
        float f4 = c0276m2.f3361k;
        if (C.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        c0276m2.f3361k = f4;
        if (c0276m2.f3360j <= RecyclerView.A0) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > RecyclerView.A0) {
            c0276m2.f3359h = f2.getDimension(3, c0276m2.f3359h);
            float dimension = f2.getDimension(2, c0276m2.i);
            c0276m2.i = dimension;
            if (c0276m2.f3359h <= RecyclerView.A0) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > RecyclerView.A0) {
                float alpha = c0276m2.getAlpha();
                if (C.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                c0276m2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    c0276m2.f3363m = string;
                    c0276m2.f3365o.put(string, c0276m2);
                }
                f2.recycle();
                c0277n.f3366a = getChangingConfigurations();
                c0277n.f3374k = true;
                C0277n c0277n3 = this.f3378b;
                C0276m c0276m3 = c0277n3.f3367b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0276m3.f3358g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0273j c0273j = (C0273j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        p.b bVar = c0276m3.f3365o;
                        if (equals) {
                            C0272i c0272i = new C0272i();
                            c0272i.f3331e = RecyclerView.A0;
                            c0272i.f3333g = 1.0f;
                            c0272i.f3334h = 1.0f;
                            c0272i.i = RecyclerView.A0;
                            c0272i.f3335j = 1.0f;
                            c0272i.f3336k = RecyclerView.A0;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0272i.f3337l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c0272i.f3338m = join3;
                            c0276m = c0276m3;
                            c0272i.f3339n = 4.0f;
                            TypedArray f5 = C.b.f(resources, theme, attributeSet, AbstractC0264a.f3317c);
                            if (C.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    c0272i.f3350b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    c0272i.f3349a = A1.d.w(string3);
                                }
                                c0272i.f3332f = C.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = c0272i.f3334h;
                                if (C.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                c0272i.f3334h = f6;
                                int i8 = !C.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = c0272i.f3337l;
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
                                c0272i.f3337l = cap;
                                int i9 = !C.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = c0272i.f3338m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c0272i.f3338m = join2;
                                float f7 = c0272i.f3339n;
                                if (C.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                c0272i.f3339n = f7;
                                c0272i.d = C.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = c0272i.f3333g;
                                if (C.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                c0272i.f3333g = f8;
                                float f9 = c0272i.f3331e;
                                if (C.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                c0272i.f3331e = f9;
                                float f10 = c0272i.f3335j;
                                if (C.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                c0272i.f3335j = f10;
                                float f11 = c0272i.f3336k;
                                if (C.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                c0272i.f3336k = f11;
                                float f12 = c0272i.i;
                                if (C.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                c0272i.i = f12;
                                int i10 = c0272i.f3351c;
                                if (C.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                c0272i.f3351c = i10;
                            }
                            f5.recycle();
                            c0273j.f3341b.add(c0272i);
                            if (c0272i.getPathName() != null) {
                                bVar.put(c0272i.getPathName(), c0272i);
                            }
                            c0277n3.f3366a = c0277n3.f3366a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            c0276m = c0276m3;
                            if ("clip-path".equals(name)) {
                                C0271h c0271h = new C0271h();
                                if (C.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = C.b.f(resources, theme, attributeSet, AbstractC0264a.d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        c0271h.f3350b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        c0271h.f3349a = A1.d.w(string5);
                                    }
                                    c0271h.f3351c = !C.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                c0273j.f3341b.add(c0271h);
                                if (c0271h.getPathName() != null) {
                                    bVar.put(c0271h.getPathName(), c0271h);
                                }
                                c0277n3.f3366a = c0277n3.f3366a;
                            } else if ("group".equals(name)) {
                                C0273j c0273j2 = new C0273j();
                                TypedArray f14 = C.b.f(resources, theme, attributeSet, AbstractC0264a.f3316b);
                                float f15 = c0273j2.f3342c;
                                if (C.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                c0273j2.f3342c = f15;
                                i2 = 1;
                                c0273j2.d = f14.getFloat(1, c0273j2.d);
                                c0273j2.f3343e = f14.getFloat(2, c0273j2.f3343e);
                                float f16 = c0273j2.f3344f;
                                if (C.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                c0273j2.f3344f = f16;
                                float f17 = c0273j2.f3345g;
                                if (C.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                c0273j2.f3345g = f17;
                                float f18 = c0273j2.f3346h;
                                if (C.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                c0273j2.f3346h = f18;
                                float f19 = c0273j2.i;
                                if (C.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                c0273j2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    c0273j2.f3348k = string6;
                                }
                                c0273j2.c();
                                f14.recycle();
                                c0273j.f3341b.add(c0273j2);
                                arrayDeque.push(c0273j2);
                                if (c0273j2.getGroupName() != null) {
                                    bVar.put(c0273j2.getGroupName(), c0273j2);
                                }
                                c0277n3.f3366a = c0277n3.f3366a;
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
                    this.f3379c = a(c0277n.f3368c, c0277n.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0279p(C0277n c0277n) {
        this.f3381f = true;
        this.f3382g = new float[9];
        this.f3383h = new Matrix();
        this.i = new Rect();
        this.f3378b = c0277n;
        this.f3379c = a(c0277n.f3368c, c0277n.d);
    }
}
