package K0;

import D.q;
import H1.l;
import a.AbstractC0058a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import t0.AbstractC0383a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f679a;

    /* renamed from: b, reason: collision with root package name */
    public final String f680b;

    /* renamed from: c, reason: collision with root package name */
    public final int f681c;

    /* renamed from: d, reason: collision with root package name */
    public final int f682d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f683f;

    /* renamed from: g, reason: collision with root package name */
    public final float f684g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f685h;
    public final float i;
    public final ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public float f686k;

    /* renamed from: l, reason: collision with root package name */
    public final int f687l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f688m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f689n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0383a.f4169z);
        this.f686k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.j = H1.d.C(context, obtainStyledAttributes, 3);
        H1.d.C(context, obtainStyledAttributes, 4);
        H1.d.C(context, obtainStyledAttributes, 5);
        this.f681c = obtainStyledAttributes.getInt(2, 0);
        this.f682d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f687l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f680b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f679a = H1.d.C(context, obtainStyledAttributes, 6);
        this.e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f683f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f684g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0383a.f4160q);
        this.f685h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f689n;
        int i = this.f681c;
        if (typeface == null && (str = this.f680b) != null) {
            this.f689n = Typeface.create(str, i);
        }
        if (this.f689n == null) {
            int i2 = this.f682d;
            if (i2 == 1) {
                this.f689n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f689n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f689n = Typeface.DEFAULT;
            } else {
                this.f689n = Typeface.MONOSPACE;
            }
            this.f689n = Typeface.create(this.f689n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f688m) {
            return this.f689n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = q.a(context, this.f687l);
                this.f689n = a2;
                if (a2 != null) {
                    this.f689n = Typeface.create(a2, this.f681c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f680b, e);
            }
        }
        a();
        this.f688m = true;
        return this.f689n;
    }

    public final void c(Context context, l lVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f687l;
        if (i == 0) {
            this.f688m = true;
        }
        if (this.f688m) {
            lVar.M(this.f689n, true);
            return;
        }
        try {
            b bVar = new b(this, lVar);
            ThreadLocal threadLocal = q.f192a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                q.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f688m = true;
            lVar.L(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f680b, e);
            this.f688m = true;
            lVar.L(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f687l;
        if (i != 0) {
            ThreadLocal threadLocal = q.f192a;
            if (!context.isRestricted()) {
                typeface = q.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, l lVar) {
        f(context, textPaint, lVar);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f679a;
        textPaint.setShadowLayer(this.f684g, this.e, this.f683f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, l lVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f689n);
        c(context, new c(this, context, textPaint, lVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface L2 = AbstractC0058a.L(context.getResources().getConfiguration(), typeface);
        if (L2 != null) {
            typeface = L2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f681c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f686k);
        if (this.f685h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
