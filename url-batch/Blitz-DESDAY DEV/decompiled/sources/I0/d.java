package I0;

import D.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import q0.AbstractC0257a;
import z1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f342a;

    /* renamed from: b, reason: collision with root package name */
    public final String f343b;

    /* renamed from: c, reason: collision with root package name */
    public final int f344c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f345e;

    /* renamed from: f, reason: collision with root package name */
    public final float f346f;

    /* renamed from: g, reason: collision with root package name */
    public final float f347g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f348j;

    /* renamed from: k, reason: collision with root package name */
    public float f349k;

    /* renamed from: l, reason: collision with root package name */
    public final int f350l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f351m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f352n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0257a.f3376A);
        this.f349k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f348j = z1.d.v(context, obtainStyledAttributes, 3);
        z1.d.v(context, obtainStyledAttributes, 4);
        z1.d.v(context, obtainStyledAttributes, 5);
        this.f344c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f350l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f343b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f342a = z1.d.v(context, obtainStyledAttributes, 6);
        this.f345e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f346f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f347g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0257a.f3395s);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f352n;
        int i = this.f344c;
        if (typeface == null && (str = this.f343b) != null) {
            this.f352n = Typeface.create(str, i);
        }
        if (this.f352n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f352n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f352n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f352n = Typeface.DEFAULT;
            } else {
                this.f352n = Typeface.MONOSPACE;
            }
            this.f352n = Typeface.create(this.f352n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f351m) {
            return this.f352n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f350l);
                this.f352n = a2;
                if (a2 != null) {
                    this.f352n = Typeface.create(a2, this.f344c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f343b, e2);
            }
        }
        a();
        this.f351m = true;
        return this.f352n;
    }

    public final void c(Context context, l lVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f350l;
        if (i == 0) {
            this.f351m = true;
        }
        if (this.f351m) {
            lVar.e0(this.f352n, true);
            return;
        }
        try {
            b bVar = new b(this, lVar);
            ThreadLocal threadLocal = r.f146a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f351m = true;
            lVar.d0(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f343b, e2);
            this.f351m = true;
            lVar.d0(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f350l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f146a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, l lVar) {
        f(context, textPaint, lVar);
        ColorStateList colorStateList = this.f348j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f342a;
        textPaint.setShadowLayer(this.f347g, this.f345e, this.f346f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, l lVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f352n);
        c(context, new c(this, context, textPaint, lVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface K2 = z1.d.K(context.getResources().getConfiguration(), typeface);
        if (K2 != null) {
            typeface = K2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f344c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f349k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
