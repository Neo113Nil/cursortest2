package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmo {
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
    public Typeface m;
    private final int n;
    private boolean o = false;
    private boolean p = false;

    public fmo(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, em.x);
        this.l = obtainStyledAttributes.getDimension(0, 0.0f);
        this.k = fny.e(context, obtainStyledAttributes, 3);
        fny.e(context, obtainStyledAttributes, 4);
        fny.e(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.e = obtainStyledAttributes.getInt(1, 1);
        int d = fny.d(obtainStyledAttributes, 12, 10);
        this.n = obtainStyledAttributes.getResourceId(d, 0);
        this.b = obtainStyledAttributes.getString(d);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = fny.e(context, obtainStyledAttributes, 6);
        this.f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, fml.a);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.j = obtainStyledAttributes2.getFloat(0, 0.0f);
        this.c = obtainStyledAttributes2.getString(fny.d(obtainStyledAttributes2, 3, 1));
        obtainStyledAttributes2.recycle();
    }

    private final void g() {
        Typeface typeface;
        String str;
        Typeface typeface2 = this.m;
        if (typeface2 == null && (str = this.b) != null) {
            typeface2 = Typeface.create(str, this.d);
            this.m = typeface2;
        }
        if (typeface2 == null) {
            int i = this.e;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else {
                if (i != 3) {
                    typeface = Typeface.DEFAULT;
                    this.m = typeface;
                    this.m = Typeface.create(typeface, this.d);
                }
                typeface = Typeface.MONOSPACE;
            }
            this.m = typeface;
            this.m = Typeface.create(typeface, this.d);
        }
    }

    private final boolean h(Context context) {
        Context context2;
        Typeface a;
        String str;
        Typeface create;
        if (this.o) {
            return true;
        }
        int i = this.n;
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = uy.a;
        Typeface typeface = null;
        if (context.isRestricted()) {
            context2 = context;
            a = null;
        } else {
            context2 = context;
            a = uy.a(context2, i, new TypedValue(), 0, null, false, true);
        }
        if (a == null) {
            if (!this.p) {
                this.p = true;
                Resources resources = context2.getResources();
                if (i != 0 && resources.getResourceTypeName(i).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), ud.b);
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
            if (typeface == null) {
                return false;
            }
            a = typeface;
        }
        this.m = a;
        this.o = true;
        return true;
    }

    public final Typeface a() {
        g();
        return this.m;
    }

    public final void b(Context context, fmp fmpVar) {
        if (!h(context)) {
            g();
        }
        int i = this.n;
        if (i == 0) {
            this.o = true;
            i = 0;
        }
        int i2 = i;
        if (this.o) {
            fmpVar.b(this.m, true);
            return;
        }
        try {
            fmm fmmVar = new fmm(this, fmpVar);
            ThreadLocal threadLocal = uy.a;
            if (context.isRestricted()) {
                fmmVar.c(-4);
            } else {
                uy.a(context, i2, new TypedValue(), 0, fmmVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.o = true;
            fmpVar.a(1);
        } catch (Exception unused2) {
            this.o = true;
            fmpVar.a(-3);
        }
    }

    public final void c(Context context, TextPaint textPaint, fmp fmpVar) {
        d(context, textPaint, fmpVar);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.h;
        float f2 = this.f;
        float f3 = this.g;
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void d(Context context, TextPaint textPaint, fmp fmpVar) {
        Typeface typeface;
        if (h(context) && this.o && (typeface = this.m) != null) {
            e(context, textPaint, typeface);
        } else {
            e(context, textPaint, a());
            b(context, new fmn(this, context, textPaint, fmpVar));
        }
    }

    public final void e(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface b = fny.b(context.getResources().getConfiguration(), typeface);
        if (b != null) {
            typeface = b;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText(1 == (i & 1));
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
