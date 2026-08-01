package E0;

import B.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import n0.AbstractC0303a;
import q1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f183a;

    /* renamed from: b, reason: collision with root package name */
    public final String f184b;

    /* renamed from: c, reason: collision with root package name */
    public final int f185c;

    /* renamed from: d, reason: collision with root package name */
    public final int f186d;

    /* renamed from: e, reason: collision with root package name */
    public final float f187e;

    /* renamed from: f, reason: collision with root package name */
    public final float f188f;

    /* renamed from: g, reason: collision with root package name */
    public final float f189g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f190j;

    /* renamed from: k, reason: collision with root package name */
    public float f191k;

    /* renamed from: l, reason: collision with root package name */
    public final int f192l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f193m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f194n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0303a.f3652y);
        this.f191k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f190j = q1.d.y(context, obtainStyledAttributes, 3);
        q1.d.y(context, obtainStyledAttributes, 4);
        q1.d.y(context, obtainStyledAttributes, 5);
        this.f185c = obtainStyledAttributes.getInt(2, 0);
        this.f186d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f192l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f184b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f183a = q1.d.y(context, obtainStyledAttributes, 6);
        this.f187e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f188f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f189g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0303a.f3644q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f194n;
        int i = this.f185c;
        if (typeface == null && (str = this.f184b) != null) {
            this.f194n = Typeface.create(str, i);
        }
        if (this.f194n == null) {
            int i2 = this.f186d;
            if (i2 == 1) {
                this.f194n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f194n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f194n = Typeface.DEFAULT;
            } else {
                this.f194n = Typeface.MONOSPACE;
            }
            this.f194n = Typeface.create(this.f194n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f193m) {
            return this.f194n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f192l);
                this.f194n = a2;
                if (a2 != null) {
                    this.f194n = Typeface.create(a2, this.f185c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f184b, e2);
            }
        }
        a();
        this.f193m = true;
        return this.f194n;
    }

    public final void c(Context context, l lVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f192l;
        if (i == 0) {
            this.f193m = true;
        }
        if (this.f193m) {
            lVar.S(this.f194n, true);
            return;
        }
        try {
            b bVar = new b(this, lVar);
            ThreadLocal threadLocal = r.f49a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f193m = true;
            lVar.R(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f184b, e2);
            this.f193m = true;
            lVar.R(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f192l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f49a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, l lVar) {
        f(context, textPaint, lVar);
        ColorStateList colorStateList = this.f190j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f183a;
        textPaint.setShadowLayer(this.f189g, this.f187e, this.f188f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, l lVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f194n);
        c(context, new c(this, context, textPaint, lVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface O2 = q1.d.O(context.getResources().getConfiguration(), typeface);
        if (O2 != null) {
            typeface = O2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f185c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f191k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
