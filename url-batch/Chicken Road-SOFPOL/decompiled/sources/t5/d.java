package t5;

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
import h3.k;
import r2.o;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f6907a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6908b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6909c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6910d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6911e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6912f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6913g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6914h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final float f6915j;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f6916k;

    /* renamed from: l, reason: collision with root package name */
    public float f6917l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6918m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6919n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6920o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f6921p;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, h.a.f3065r);
        this.f6917l = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f6916k = o.C(context, obtainStyledAttributes, 3);
        o.C(context, obtainStyledAttributes, 4);
        o.C(context, obtainStyledAttributes, 5);
        this.f6910d = obtainStyledAttributes.getInt(2, 0);
        this.f6911e = obtainStyledAttributes.getInt(1, 1);
        int i8 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f6918m = obtainStyledAttributes.getResourceId(i8, 0);
        this.f6908b = obtainStyledAttributes.getString(i8);
        obtainStyledAttributes.getBoolean(14, false);
        this.f6907a = o.C(context, obtainStyledAttributes, 6);
        this.f6912f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f6913g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f6914h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, f5.a.f2749o);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.f6915j = obtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6909c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f6921p;
        int i = this.f6910d;
        if (typeface == null && (str = this.f6908b) != null) {
            this.f6921p = Typeface.create(str, i);
        }
        if (this.f6921p == null) {
            int i8 = this.f6911e;
            if (i8 == 1) {
                this.f6921p = Typeface.SANS_SERIF;
            } else if (i8 == 2) {
                this.f6921p = Typeface.SERIF;
            } else if (i8 != 3) {
                this.f6921p = Typeface.DEFAULT;
            } else {
                this.f6921p = Typeface.MONOSPACE;
            }
            this.f6921p = Typeface.create(this.f6921p, i);
        }
    }

    public final void b(Context context, r rVar) {
        if (!c(context)) {
            a();
        }
        int i = this.f6918m;
        if (i == 0) {
            this.f6919n = true;
        }
        if (this.f6919n) {
            rVar.H(this.f6921p, true);
            return;
        }
        try {
            b bVar = new b(this, rVar);
            ThreadLocal threadLocal = k.f3150a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                k.a(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f6919n = true;
            rVar.G(1);
        } catch (Exception e8) {
            Log.d("TextAppearance", "Error loading font " + this.f6908b, e8);
            this.f6919n = true;
            rVar.G(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface a8;
        String str;
        Typeface create;
        if (this.f6919n) {
            return true;
        }
        int i = this.f6918m;
        if (i != 0) {
            ThreadLocal threadLocal = k.f3150a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                a8 = null;
            } else {
                context2 = context;
                a8 = k.a(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (a8 != null) {
                this.f6921p = a8;
                this.f6919n = true;
                return true;
            }
            if (!this.f6920o) {
                this.f6920o = true;
                Resources resources = context2.getResources();
                int i8 = this.f6918m;
                if (i8 != 0 && resources.getResourceTypeName(i8).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i8);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), e3.a.f2485b);
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
                    typeface = Typeface.create(create, this.f6910d);
                }
            }
            if (typeface != null) {
                this.f6921p = typeface;
                this.f6919n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, r rVar) {
        e(context, textPaint, rVar);
        ColorStateList colorStateList = this.f6916k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f6907a;
        textPaint.setShadowLayer(this.f6914h, this.f6912f, this.f6913g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, r rVar) {
        Typeface typeface;
        if (c(context) && this.f6919n && (typeface = this.f6921p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f6921p);
        b(context, new c(this, context, textPaint, rVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface b02 = o.b0(context.getResources().getConfiguration(), typeface);
        if (b02 != null) {
            typeface = b02;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f6910d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f6917l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f6909c);
        }
        if (this.i) {
            textPaint.setLetterSpacing(this.f6915j);
        }
    }
}
