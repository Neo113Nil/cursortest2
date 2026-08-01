package d2;

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
import k3.m;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1474a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1475b;
    public String c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1476d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1477e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1478f;
    public final float g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1479i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1480j;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f1481k;

    /* renamed from: l, reason: collision with root package name */
    public float f1482l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1483m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1484n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1485o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f1486p;

    public d(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, e.a.f1513v);
        this.f1482l = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f1481k = m.u(context, obtainStyledAttributes, 3);
        m.u(context, obtainStyledAttributes, 4);
        m.u(context, obtainStyledAttributes, 5);
        this.f1476d = obtainStyledAttributes.getInt(2, 0);
        this.f1477e = obtainStyledAttributes.getInt(1, 1);
        int i5 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1483m = obtainStyledAttributes.getResourceId(i5, 0);
        this.f1475b = obtainStyledAttributes.getString(i5);
        obtainStyledAttributes.getBoolean(14, false);
        this.f1474a = m.u(context, obtainStyledAttributes, 6);
        this.f1478f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i4, l1.a.f2876v);
        this.f1479i = obtainStyledAttributes2.hasValue(0);
        this.f1480j = obtainStyledAttributes2.getFloat(0, 0.0f);
        this.c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f1486p;
        int i4 = this.f1476d;
        if (typeface == null && (str = this.f1475b) != null) {
            this.f1486p = Typeface.create(str, i4);
        }
        if (this.f1486p == null) {
            int i5 = this.f1477e;
            if (i5 == 1) {
                this.f1486p = Typeface.SANS_SERIF;
            } else if (i5 == 2) {
                this.f1486p = Typeface.SERIF;
            } else if (i5 != 3) {
                this.f1486p = Typeface.DEFAULT;
            } else {
                this.f1486p = Typeface.MONOSPACE;
            }
            this.f1486p = Typeface.create(this.f1486p, i4);
        }
    }

    public final void b(Context context, k3.d dVar) {
        if (!c(context)) {
            a();
        }
        int i4 = this.f1483m;
        if (i4 == 0) {
            this.f1484n = true;
        }
        if (this.f1484n) {
            dVar.S(this.f1486p, true);
            return;
        }
        try {
            b bVar = new b(this, dVar);
            ThreadLocal threadLocal = b0.m.f716a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                b0.m.a(context, i4, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1484n = true;
            dVar.R(1);
        } catch (Exception e4) {
            Log.d("TextAppearance", "Error loading font " + this.f1475b, e4);
            this.f1484n = true;
            dVar.R(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface a4;
        String str;
        Typeface create;
        if (this.f1484n) {
            return true;
        }
        int i4 = this.f1483m;
        if (i4 != 0) {
            ThreadLocal threadLocal = b0.m.f716a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                a4 = null;
            } else {
                context2 = context;
                a4 = b0.m.a(context2, i4, new TypedValue(), 0, null, false, true);
            }
            if (a4 != null) {
                this.f1486p = a4;
                this.f1484n = true;
                return true;
            }
            if (!this.f1485o) {
                this.f1485o = true;
                Resources resources = context2.getResources();
                int i5 = this.f1483m;
                if (i5 != 0 && resources.getResourceTypeName(i5).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i5);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), y.a.f3608b);
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
                    typeface = Typeface.create(create, this.f1476d);
                }
            }
            if (typeface != null) {
                this.f1486p = typeface;
                this.f1484n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, k3.d dVar) {
        e(context, textPaint, dVar);
        ColorStateList colorStateList = this.f1481k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f1474a;
        textPaint.setShadowLayer(this.h, this.f1478f, this.g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, k3.d dVar) {
        Typeface typeface;
        if (c(context) && this.f1484n && (typeface = this.f1486p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f1486p);
        b(context, new c(this, context, textPaint, dVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface G = m.G(context.getResources().getConfiguration(), typeface);
        if (G != null) {
            typeface = G;
        }
        textPaint.setTypeface(typeface);
        int i4 = (~typeface.getStyle()) & this.f1476d;
        textPaint.setFakeBoldText((i4 & 1) != 0);
        textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1482l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.c);
        if (this.f1479i) {
            textPaint.setLetterSpacing(this.f1480j);
        }
    }
}
