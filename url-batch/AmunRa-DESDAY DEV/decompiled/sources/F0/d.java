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
import o0.AbstractC0275a;
import s1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f169a;

    /* renamed from: b, reason: collision with root package name */
    public final String f170b;

    /* renamed from: c, reason: collision with root package name */
    public final int f171c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f172e;

    /* renamed from: f, reason: collision with root package name */
    public final float f173f;

    /* renamed from: g, reason: collision with root package name */
    public final float f174g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f175j;

    /* renamed from: k, reason: collision with root package name */
    public float f176k;

    /* renamed from: l, reason: collision with root package name */
    public final int f177l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f178m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f179n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0275a.f3360y);
        this.f176k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f175j = s1.d.w(context, obtainStyledAttributes, 3);
        s1.d.w(context, obtainStyledAttributes, 4);
        s1.d.w(context, obtainStyledAttributes, 5);
        this.f171c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f177l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f170b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f169a = s1.d.w(context, obtainStyledAttributes, 6);
        this.f172e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f173f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f174g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0275a.f3352q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f179n;
        int i = this.f171c;
        if (typeface == null && (str = this.f170b) != null) {
            this.f179n = Typeface.create(str, i);
        }
        if (this.f179n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f179n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f179n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f179n = Typeface.DEFAULT;
            } else {
                this.f179n = Typeface.MONOSPACE;
            }
            this.f179n = Typeface.create(this.f179n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f178m) {
            return this.f179n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f177l);
                this.f179n = a2;
                if (a2 != null) {
                    this.f179n = Typeface.create(a2, this.f171c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f170b, e2);
            }
        }
        a();
        this.f178m = true;
        return this.f179n;
    }

    public final void c(Context context, l lVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f177l;
        if (i == 0) {
            this.f178m = true;
        }
        if (this.f178m) {
            lVar.Q(this.f179n, true);
            return;
        }
        try {
            b bVar = new b(this, lVar);
            ThreadLocal threadLocal = r.f38a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f178m = true;
            lVar.P(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f170b, e2);
            this.f178m = true;
            lVar.P(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f177l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f38a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, l lVar) {
        f(context, textPaint, lVar);
        ColorStateList colorStateList = this.f175j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f169a;
        textPaint.setShadowLayer(this.f174g, this.f172e, this.f173f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, l lVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f179n);
        c(context, new c(this, context, textPaint, lVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface S2 = s1.d.S(context.getResources().getConfiguration(), typeface);
        if (S2 != null) {
            typeface = S2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f171c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f176k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
