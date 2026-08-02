package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
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

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqq extends aqi {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public aqo b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public aqq(aqo aqoVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = aqoVar;
        this.d = c(aqoVar.c, aqoVar.d);
    }

    static int a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    public static aqq b(Resources resources, int i, Resources.Theme theme) {
        aqq aqqVar = new aqq();
        ThreadLocal threadLocal = uy.a;
        aqqVar.e = resources.getDrawable(i, theme);
        return aqqVar;
    }

    final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        Matrix matrix = this.i;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (rect.width() * abs));
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
        aqo aqoVar = this.b;
        Bitmap bitmap = aqoVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != aqoVar.f.getHeight()) {
            aqoVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            aqoVar.k = true;
        }
        boolean z = this.c;
        aqo aqoVar2 = this.b;
        if (!z) {
            aqoVar2.a(min, min2);
        } else if (aqoVar2.k || aqoVar2.g != aqoVar2.c || aqoVar2.h != aqoVar2.d || aqoVar2.j != aqoVar2.e || aqoVar2.i != aqoVar2.b.getRootAlpha()) {
            this.b.a(min, min2);
            aqo aqoVar3 = this.b;
            aqoVar3.g = aqoVar3.c;
            aqoVar3.h = aqoVar3.d;
            aqoVar3.i = aqoVar3.b.getRootAlpha();
            aqoVar3.j = aqoVar3.e;
            aqoVar3.k = false;
        }
        aqo aqoVar4 = this.b;
        if (aqoVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (aqoVar4.l == null) {
                aqoVar4.l = new Paint();
                aqoVar4.l.setFilterBitmap(true);
            }
            aqoVar4.l.setAlpha(aqoVar4.b.getRootAlpha());
            aqoVar4.l.setColorFilter(colorFilter);
            paint = aqoVar4.l;
        }
        canvas.drawBitmap(aqoVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return new aqp(drawable.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        int i;
        boolean z;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        aqo aqoVar = this.b;
        aqoVar.b = new aqn();
        TypedArray A = pi.A(resources, theme, attributeSet, aqa.a);
        aqo aqoVar2 = this.b;
        aqn aqnVar = aqoVar2.b;
        aqoVar2.d = a.q(pi.y(A, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        boolean z2 = false;
        int i2 = 2;
        if (pi.E(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            A.getValue(1, typedValue);
            if (typedValue.type == 2) {
                typedValue.toString();
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
            }
            if (typedValue.type < 28 || typedValue.type > 31) {
                Resources resources2 = A.getResources();
                int resourceId = A.getResourceId(1, 0);
                int i3 = ut.a;
                try {
                    colorStateList = ut.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
            if (colorStateList != null) {
                aqoVar2.c = colorStateList;
            }
            boolean z3 = aqoVar2.e;
            if (pi.E(xmlPullParser, "autoMirrored")) {
                z3 = A.getBoolean(5, z3);
            }
            aqoVar2.e = z3;
            aqnVar.g = pi.w(A, xmlPullParser, "viewportWidth", 7, aqnVar.g);
            float w = pi.w(A, xmlPullParser, "viewportHeight", 8, aqnVar.h);
            aqnVar.h = w;
            if (aqnVar.g > 0.0f) {
                throw new XmlPullParserException(String.valueOf(A.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
            }
            if (w <= 0.0f) {
                throw new XmlPullParserException(String.valueOf(A.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
            }
            int i4 = 3;
            aqnVar.e = A.getDimension(3, aqnVar.e);
            float dimension = A.getDimension(2, aqnVar.f);
            aqnVar.f = dimension;
            if (aqnVar.e <= 0.0f) {
                throw new XmlPullParserException(String.valueOf(A.getPositionDescription()).concat("<vector> tag requires width > 0"));
            }
            if (dimension <= 0.0f) {
                throw new XmlPullParserException(String.valueOf(A.getPositionDescription()).concat("<vector> tag requires height > 0"));
            }
            aqnVar.setAlpha(pi.w(A, xmlPullParser, "alpha", 4, aqnVar.getAlpha()));
            String string = A.getString(0);
            if (string != null) {
                aqnVar.j = string;
                aqnVar.l.put(string, aqnVar);
            }
            A.recycle();
            aqoVar.a = getChangingConfigurations();
            aqoVar.k = true;
            aqo aqoVar3 = this.b;
            aqn aqnVar2 = aqoVar3.b;
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(aqnVar2.d);
            int eventType = xmlPullParser.getEventType();
            int depth = xmlPullParser.getDepth() + 1;
            boolean z4 = true;
            for (int i5 = 1; eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i4); i5 = 1) {
                if (eventType == i2) {
                    String name = xmlPullParser.getName();
                    aql aqlVar = (aql) arrayDeque.peek();
                    if (aqlVar == null) {
                        i = depth;
                        z = z2;
                    } else if ("path".equals(name)) {
                        aqk aqkVar = new aqk();
                        TypedArray A2 = pi.A(resources, theme, attributeSet, aqa.c);
                        aqkVar.a = null;
                        if (pi.E(xmlPullParser, "pathData")) {
                            String string2 = A2.getString(0);
                            if (string2 != null) {
                                aqkVar.n = string2;
                            }
                            String string3 = A2.getString(2);
                            if (string3 != null) {
                                aqkVar.m = pi.t(string3);
                            }
                            aqkVar.l = pi.K(A2, xmlPullParser, theme, "fillColor", 1);
                            i = depth;
                            aqkVar.d = pi.w(A2, xmlPullParser, "fillAlpha", 12, aqkVar.d);
                            int y = pi.y(A2, xmlPullParser, "strokeLineCap", 8, -1);
                            Paint.Cap cap = aqkVar.h;
                            if (y == 0) {
                                cap = Paint.Cap.BUTT;
                            } else if (y == 1) {
                                cap = Paint.Cap.ROUND;
                            } else if (y == 2) {
                                cap = Paint.Cap.SQUARE;
                            }
                            aqkVar.h = cap;
                            int y2 = pi.y(A2, xmlPullParser, "strokeLineJoin", 9, -1);
                            Paint.Join join = aqkVar.i;
                            if (y2 == 0) {
                                join = Paint.Join.MITER;
                            } else if (y2 == 1) {
                                join = Paint.Join.ROUND;
                            } else if (y2 == 2) {
                                join = Paint.Join.BEVEL;
                            }
                            aqkVar.i = join;
                            aqkVar.j = pi.w(A2, xmlPullParser, "strokeMiterLimit", 10, aqkVar.j);
                            aqkVar.k = pi.K(A2, xmlPullParser, theme, "strokeColor", 3);
                            aqkVar.c = pi.w(A2, xmlPullParser, "strokeAlpha", 11, aqkVar.c);
                            aqkVar.b = pi.w(A2, xmlPullParser, "strokeWidth", 4, aqkVar.b);
                            aqkVar.f = pi.w(A2, xmlPullParser, "trimPathEnd", 6, aqkVar.f);
                            aqkVar.g = pi.w(A2, xmlPullParser, "trimPathOffset", 7, aqkVar.g);
                            aqkVar.e = pi.w(A2, xmlPullParser, "trimPathStart", 5, aqkVar.e);
                            aqkVar.o = pi.y(A2, xmlPullParser, "fillType", 13, aqkVar.o);
                        } else {
                            i = depth;
                        }
                        A2.recycle();
                        aqlVar.b.add(aqkVar);
                        if (aqkVar.getPathName() != null) {
                            aqnVar2.l.put(aqkVar.getPathName(), aqkVar);
                        }
                        int i6 = aqoVar3.a;
                        i4 = 3;
                        z = false;
                        z4 = false;
                    } else {
                        i = depth;
                        if ("clip-path".equals(name)) {
                            aqj aqjVar = new aqj();
                            if (pi.E(xmlPullParser, "pathData")) {
                                TypedArray A3 = pi.A(resources, theme, attributeSet, aqa.d);
                                String string4 = A3.getString(0);
                                if (string4 != null) {
                                    aqjVar.n = string4;
                                }
                                String string5 = A3.getString(1);
                                if (string5 != null) {
                                    aqjVar.m = pi.t(string5);
                                }
                                aqjVar.o = pi.y(A3, xmlPullParser, "fillType", 2, 0);
                                A3.recycle();
                            }
                            aqlVar.b.add(aqjVar);
                            if (aqjVar.getPathName() != null) {
                                aqnVar2.l.put(aqjVar.getPathName(), aqjVar);
                            }
                            int i7 = aqoVar3.a;
                            i4 = 3;
                            z = false;
                        } else if ("group".equals(name)) {
                            aql aqlVar2 = new aql();
                            TypedArray A4 = pi.A(resources, theme, attributeSet, aqa.b);
                            aqlVar2.l = null;
                            aqlVar2.c = pi.w(A4, xmlPullParser, "rotation", 5, aqlVar2.c);
                            aqlVar2.d = A4.getFloat(1, aqlVar2.d);
                            aqlVar2.e = A4.getFloat(2, aqlVar2.e);
                            aqlVar2.f = pi.w(A4, xmlPullParser, "scaleX", 3, aqlVar2.f);
                            aqlVar2.g = pi.w(A4, xmlPullParser, "scaleY", 4, aqlVar2.g);
                            aqlVar2.h = pi.w(A4, xmlPullParser, "translateX", 6, aqlVar2.h);
                            aqlVar2.i = pi.w(A4, xmlPullParser, "translateY", 7, aqlVar2.i);
                            z = false;
                            String string6 = A4.getString(0);
                            if (string6 != null) {
                                aqlVar2.m = string6;
                            }
                            aqlVar2.s();
                            A4.recycle();
                            aqlVar.b.add(aqlVar2);
                            arrayDeque.push(aqlVar2);
                            if (aqlVar2.getGroupName() != null) {
                                aqnVar2.l.put(aqlVar2.getGroupName(), aqlVar2);
                            }
                            int i8 = aqoVar3.a;
                            i4 = 3;
                        } else {
                            z = false;
                        }
                    }
                    i4 = 3;
                } else {
                    i = depth;
                    z = z2;
                    if (eventType == i4 && "group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                    }
                }
                eventType = xmlPullParser.next();
                z2 = z;
                depth = i;
                i2 = 2;
            }
            if (z4) {
                throw new XmlPullParserException("no path defined");
            }
            this.d = c(aqoVar.c, aqoVar.d);
            return;
        }
        colorStateList = null;
        if (colorStateList != null) {
        }
        boolean z32 = aqoVar2.e;
        if (pi.E(xmlPullParser, "autoMirrored")) {
        }
        aqoVar2.e = z32;
        aqnVar.g = pi.w(A, xmlPullParser, "viewportWidth", 7, aqnVar.g);
        float w2 = pi.w(A, xmlPullParser, "viewportHeight", 8, aqnVar.h);
        aqnVar.h = w2;
        if (aqnVar.g > 0.0f) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        aqo aqoVar = this.b;
        if (aqoVar == null) {
            return false;
        }
        if (aqoVar.b()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new aqo(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.aqi, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        aqo aqoVar = this.b;
        ColorStateList colorStateList = aqoVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = aqoVar.d) != null) {
            this.d = c(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (aqoVar.b()) {
            boolean q = aqoVar.b.d.q(iArr);
            aqoVar.k |= q;
            if (q) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        aqo aqoVar = this.b;
        if (aqoVar.c != colorStateList) {
            aqoVar.c = colorStateList;
            this.d = c(colorStateList, aqoVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        aqo aqoVar = this.b;
        if (aqoVar.d != mode) {
            aqoVar.d = mode;
            this.d = c(aqoVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public aqq() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new aqo();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
