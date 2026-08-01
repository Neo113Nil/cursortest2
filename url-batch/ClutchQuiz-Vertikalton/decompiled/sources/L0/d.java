package L0;

import B.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import u0.AbstractC0361a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f486a;

    /* renamed from: b, reason: collision with root package name */
    public final String f487b;

    /* renamed from: c, reason: collision with root package name */
    public final int f488c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f489e;

    /* renamed from: f, reason: collision with root package name */
    public final float f490f;

    /* renamed from: g, reason: collision with root package name */
    public final float f491g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f492j;

    /* renamed from: k, reason: collision with root package name */
    public float f493k;

    /* renamed from: l, reason: collision with root package name */
    public final int f494l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f495m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f496n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0361a.f3749y);
        this.f493k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f492j = A.c.H(context, obtainStyledAttributes, 3);
        A.c.H(context, obtainStyledAttributes, 4);
        A.c.H(context, obtainStyledAttributes, 5);
        this.f488c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f494l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f487b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f486a = A.c.H(context, obtainStyledAttributes, 6);
        this.f489e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f490f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f491g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0361a.f3741q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f496n;
        int i = this.f488c;
        if (typeface == null && (str = this.f487b) != null) {
            this.f496n = Typeface.create(str, i);
        }
        if (this.f496n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f496n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f496n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f496n = Typeface.DEFAULT;
            } else {
                this.f496n = Typeface.MONOSPACE;
            }
            this.f496n = Typeface.create(this.f496n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f495m) {
            return this.f496n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f494l);
                this.f496n = a2;
                if (a2 != null) {
                    this.f496n = Typeface.create(a2, this.f488c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f487b, e2);
            }
        }
        a();
        this.f495m = true;
        return this.f496n;
    }

    public final void c(Context context, A.c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f494l;
        if (i == 0) {
            this.f495m = true;
        }
        if (this.f495m) {
            cVar.n0(this.f496n, true);
            return;
        }
        try {
            b bVar = new b(this, cVar);
            ThreadLocal threadLocal = r.f69a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f495m = true;
            cVar.m0(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f487b, e2);
            this.f495m = true;
            cVar.m0(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f494l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f69a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, A.c cVar) {
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f492j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f486a;
        textPaint.setShadowLayer(this.f491g, this.f489e, this.f490f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, A.c cVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f496n);
        c(context, new c(this, context, textPaint, cVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface j02 = A.c.j0(context.getResources().getConfiguration(), typeface);
        if (j02 != null) {
            typeface = j02;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f488c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f493k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
