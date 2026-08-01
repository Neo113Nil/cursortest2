package F0;

import B.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import o0.AbstractC0278a;
import u1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f176a;

    /* renamed from: b, reason: collision with root package name */
    public final String f177b;

    /* renamed from: c, reason: collision with root package name */
    public final int f178c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f179e;

    /* renamed from: f, reason: collision with root package name */
    public final float f180f;

    /* renamed from: g, reason: collision with root package name */
    public final float f181g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f182j;

    /* renamed from: k, reason: collision with root package name */
    public float f183k;

    /* renamed from: l, reason: collision with root package name */
    public final int f184l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f185m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f186n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0278a.f3355y);
        this.f183k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f182j = u1.d.D(context, obtainStyledAttributes, 3);
        u1.d.D(context, obtainStyledAttributes, 4);
        u1.d.D(context, obtainStyledAttributes, 5);
        this.f178c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f184l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f177b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f176a = u1.d.D(context, obtainStyledAttributes, 6);
        this.f179e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f180f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f181g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0278a.f3347q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f186n;
        int i = this.f178c;
        if (typeface == null && (str = this.f177b) != null) {
            this.f186n = Typeface.create(str, i);
        }
        if (this.f186n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f186n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f186n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f186n = Typeface.DEFAULT;
            } else {
                this.f186n = Typeface.MONOSPACE;
            }
            this.f186n = Typeface.create(this.f186n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f185m) {
            return this.f186n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f184l);
                this.f186n = a2;
                if (a2 != null) {
                    this.f186n = Typeface.create(a2, this.f178c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f177b, e2);
            }
        }
        a();
        this.f185m = true;
        return this.f186n;
    }

    public final void c(Context context, l lVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f184l;
        if (i == 0) {
            this.f185m = true;
        }
        if (this.f185m) {
            lVar.N(this.f186n, true);
            return;
        }
        try {
            b bVar = new b(this, lVar);
            ThreadLocal threadLocal = r.f40a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f185m = true;
            lVar.M(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f177b, e2);
            this.f185m = true;
            lVar.M(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f184l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f40a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, l lVar) {
        f(context, textPaint, lVar);
        ColorStateList colorStateList = this.f182j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f176a;
        textPaint.setShadowLayer(this.f181g, this.f179e, this.f180f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, l lVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f186n);
        c(context, new c(this, context, textPaint, lVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface b02 = u1.d.b0(context.getResources().getConfiguration(), typeface);
        if (b02 != null) {
            typeface = b02;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f178c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f183k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
