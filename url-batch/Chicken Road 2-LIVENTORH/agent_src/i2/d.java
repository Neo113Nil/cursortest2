package i2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import e0.m;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1818b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1819c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1820e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1821f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1822g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1823h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1824j;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f1825k;

    /* renamed from: l, reason: collision with root package name */
    public float f1826l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1827m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1828n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1829o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f1830p;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, f.a.f1259v);
        this.f1826l = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f1825k = h.a.t(context, obtainStyledAttributes, 3);
        h.a.t(context, obtainStyledAttributes, 4);
        h.a.t(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.f1820e = obtainStyledAttributes.getInt(1, 1);
        int i4 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1827m = obtainStyledAttributes.getResourceId(i4, 0);
        this.f1818b = obtainStyledAttributes.getString(i4);
        obtainStyledAttributes.getBoolean(14, false);
        this.f1817a = h.a.t(context, obtainStyledAttributes, 6);
        this.f1821f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f1822g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f1823h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, n1.a.f2830w);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.f1824j = obtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1819c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f1830p;
        int i = this.d;
        if (typeface == null && (str = this.f1818b) != null) {
            this.f1830p = Typeface.create(str, i);
        }
        if (this.f1830p == null) {
            int i4 = this.f1820e;
            if (i4 == 1) {
                this.f1830p = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                this.f1830p = Typeface.SERIF;
            } else if (i4 != 3) {
                this.f1830p = Typeface.DEFAULT;
            } else {
                this.f1830p = Typeface.MONOSPACE;
            }
            this.f1830p = Typeface.create(this.f1830p, i);
        }
    }

    public final void b(Context context, h.a aVar) {
        if (!c(context)) {
            a();
        }
        int i = this.f1827m;
        if (i == 0) {
            this.f1828n = true;
        }
        if (this.f1828n) {
            aVar.V(this.f1830p, true);
            return;
        }
        try {
            b bVar = new b(this, aVar);
            ThreadLocal threadLocal = m.f1158a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                m.a(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1828n = true;
            aVar.U(1);
        } catch (Exception e4) {
            Log.d("TextAppearance", "Error loading font " + this.f1818b, e4);
            this.f1828n = true;
            aVar.U(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface a2;
        String str;
        Typeface create;
        if (this.f1828n) {
            return true;
        }
        int i = this.f1827m;
        if (i != 0) {
            ThreadLocal threadLocal = m.f1158a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                a2 = null;
            } else {
                context2 = context;
                a2 = m.a(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (a2 != null) {
                this.f1830p = a2;
                this.f1828n = true;
                return true;
            }
            if (!this.f1829o) {
                this.f1829o = true;
                Resources resources = context2.getResources();
                int i4 = this.f1827m;
                if (i4 != 0 && resources.getResourceTypeName(i4).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i4);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), b0.a.f719b);
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
                this.f1830p = typeface;
                this.f1828n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, h.a aVar) {
        e(context, textPaint, aVar);
        ColorStateList colorStateList = this.f1825k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f1817a;
        textPaint.setShadowLayer(this.f1823h, this.f1821f, this.f1822g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, h.a aVar) {
        Typeface typeface;
        if (c(context) && this.f1828n && (typeface = this.f1830p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f1830p);
        b(context, new c(this, context, textPaint, aVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface S = h.a.S(context.getResources().getConfiguration(), typeface);
        if (S != null) {
            typeface = S;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1826l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f1819c);
        }
        if (this.i) {
            textPaint.setLetterSpacing(this.f1824j);
        }
    }
}
