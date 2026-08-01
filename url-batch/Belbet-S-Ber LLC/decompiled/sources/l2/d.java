package l2;

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
import b4.l;
import e0.m;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f2706a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2707b;

    /* renamed from: c, reason: collision with root package name */
    public String f2708c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2709e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2710f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2711g;
    public final float h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final float f2712j;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f2713k;

    /* renamed from: l, reason: collision with root package name */
    public float f2714l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2715m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2716n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2717o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f2718p;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, f.a.f1408v);
        this.f2714l = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f2713k = l.r(context, obtainStyledAttributes, 3);
        l.r(context, obtainStyledAttributes, 4);
        l.r(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.f2709e = obtainStyledAttributes.getInt(1, 1);
        int i4 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f2715m = obtainStyledAttributes.getResourceId(i4, 0);
        this.f2707b = obtainStyledAttributes.getString(i4);
        obtainStyledAttributes.getBoolean(14, false);
        this.f2706a = l.r(context, obtainStyledAttributes, 6);
        this.f2710f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f2711g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, q1.a.A);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.f2712j = obtainStyledAttributes2.getFloat(0, 0.0f);
        this.f2708c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f2718p;
        int i = this.d;
        if (typeface == null && (str = this.f2707b) != null) {
            this.f2718p = Typeface.create(str, i);
        }
        if (this.f2718p == null) {
            int i4 = this.f2709e;
            if (i4 == 1) {
                this.f2718p = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                this.f2718p = Typeface.SERIF;
            } else if (i4 != 3) {
                this.f2718p = Typeface.DEFAULT;
            } else {
                this.f2718p = Typeface.MONOSPACE;
            }
            this.f2718p = Typeface.create(this.f2718p, i);
        }
    }

    public final void b(Context context, b4.d dVar) {
        if (!c(context)) {
            a();
        }
        int i = this.f2715m;
        if (i == 0) {
            this.f2716n = true;
        }
        if (this.f2716n) {
            dVar.I(this.f2718p, true);
            return;
        }
        try {
            b bVar = new b(this, dVar);
            ThreadLocal threadLocal = m.f1339a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                m.a(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f2716n = true;
            dVar.H(1);
        } catch (Exception e4) {
            Log.d("TextAppearance", "Error loading font " + this.f2707b, e4);
            this.f2716n = true;
            dVar.H(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface a5;
        String str;
        Typeface create;
        if (this.f2716n) {
            return true;
        }
        int i = this.f2715m;
        if (i != 0) {
            ThreadLocal threadLocal = m.f1339a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                a5 = null;
            } else {
                context2 = context;
                a5 = m.a(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (a5 != null) {
                this.f2718p = a5;
                this.f2716n = true;
                return true;
            }
            if (!this.f2717o) {
                this.f2717o = true;
                Resources resources = context2.getResources();
                int i4 = this.f2715m;
                if (i4 != 0 && resources.getResourceTypeName(i4).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i4);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), b0.a.f820b);
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
                this.f2718p = typeface;
                this.f2716n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, b4.d dVar) {
        e(context, textPaint, dVar);
        ColorStateList colorStateList = this.f2713k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f2706a;
        textPaint.setShadowLayer(this.h, this.f2710f, this.f2711g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, b4.d dVar) {
        Typeface typeface;
        if (c(context) && this.f2716n && (typeface = this.f2718p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f2718p);
        b(context, new c(this, context, textPaint, dVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface Q = l.Q(context.getResources().getConfiguration(), typeface);
        if (Q != null) {
            typeface = Q;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2714l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.f2708c);
        if (this.i) {
            textPaint.setLetterSpacing(this.f2712j);
        }
    }
}
