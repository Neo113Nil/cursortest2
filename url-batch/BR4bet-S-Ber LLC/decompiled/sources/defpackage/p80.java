package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class p80 {
    public final ColorStateList a;
    public final String b;
    public String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public final ColorStateList k;
    public float l;
    public final int m;
    public boolean n = false;
    public boolean o = false;
    public Typeface p;

    public p80(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, z00.v);
        this.l = obtainStyledAttributes.getDimension(0, 0.0f);
        this.k = kr.w(context, obtainStyledAttributes, 3);
        kr.w(context, obtainStyledAttributes, 4);
        kr.w(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.e = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.m = obtainStyledAttributes.getResourceId(i2, 0);
        this.b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = kr.w(context, obtainStyledAttributes, 6);
        this.f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, y00.C);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.j = obtainStyledAttributes2.getFloat(0, 0.0f);
        this.c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.p;
        int i = this.d;
        if (typeface == null && (str = this.b) != null) {
            this.p = Typeface.create(str, i);
        }
        if (this.p == null) {
            int i2 = this.e;
            if (i2 == 1) {
                this.p = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.p = Typeface.SERIF;
            } else if (i2 != 3) {
                this.p = Typeface.DEFAULT;
            } else {
                this.p = Typeface.MONOSPACE;
            }
            this.p = Typeface.create(this.p, i);
        }
    }

    public final void b(Context context, b9 b9Var) {
        if (!c(context)) {
            a();
        }
        int i = this.m;
        if (i == 0) {
            this.n = true;
        }
        if (this.n) {
            b9Var.B(this.p, true);
            return;
        }
        try {
            n80 n80Var = new n80(this, b9Var);
            ThreadLocal threadLocal = k30.a;
            if (context.isRestricted()) {
                n80Var.c(-4);
            } else {
                k30.a(context, i, new TypedValue(), 0, n80Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.n = true;
            b9Var.z(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.b, e);
            this.n = true;
            b9Var.z(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface a;
        String str;
        Typeface create;
        if (this.n) {
            return true;
        }
        int i = this.m;
        if (i != 0) {
            ThreadLocal threadLocal = k30.a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                a = null;
            } else {
                context2 = context;
                a = k30.a(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (a != null) {
                this.p = a;
                this.n = true;
                return true;
            }
            if (!this.o) {
                this.o = true;
                Resources resources = context2.getResources();
                int i2 = this.m;
                if (i2 != 0 && resources.getResourceTypeName(i2).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i2);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), v00.b);
                                str = obtainAttributes.getString(7);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.d);
                }
            }
            if (typeface != null) {
                this.p = typeface;
                this.n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, b9 b9Var) {
        e(context, textPaint, b9Var);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.h, this.f, this.g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, b9 b9Var) {
        Typeface typeface;
        if (c(context) && this.n && (typeface = this.p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.p);
        b(context, new o80(this, context, textPaint, b9Var));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface A = mz.A(context.getResources().getConfiguration(), typeface);
        if (A != null) {
            typeface = A;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
