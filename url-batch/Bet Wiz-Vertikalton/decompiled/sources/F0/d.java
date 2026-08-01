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
import o0.AbstractC0277a;
import x1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f229a;

    /* renamed from: b, reason: collision with root package name */
    public final String f230b;

    /* renamed from: c, reason: collision with root package name */
    public final int f231c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f232e;

    /* renamed from: f, reason: collision with root package name */
    public final float f233f;

    /* renamed from: g, reason: collision with root package name */
    public final float f234g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f235j;

    /* renamed from: k, reason: collision with root package name */
    public float f236k;

    /* renamed from: l, reason: collision with root package name */
    public final int f237l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f239n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0277a.f3261y);
        this.f236k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f235j = l.x(context, obtainStyledAttributes, 3);
        l.x(context, obtainStyledAttributes, 4);
        l.x(context, obtainStyledAttributes, 5);
        this.f231c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f237l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f230b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f229a = l.x(context, obtainStyledAttributes, 6);
        this.f232e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f233f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f234g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0277a.f3253q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f239n;
        int i = this.f231c;
        if (typeface == null && (str = this.f230b) != null) {
            this.f239n = Typeface.create(str, i);
        }
        if (this.f239n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f239n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f239n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f239n = Typeface.DEFAULT;
            } else {
                this.f239n = Typeface.MONOSPACE;
            }
            this.f239n = Typeface.create(this.f239n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f238m) {
            return this.f239n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f237l);
                this.f239n = a2;
                if (a2 != null) {
                    this.f239n = Typeface.create(a2, this.f231c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f230b, e2);
            }
        }
        a();
        this.f238m = true;
        return this.f239n;
    }

    public final void c(Context context, x1.d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f237l;
        if (i == 0) {
            this.f238m = true;
        }
        if (this.f238m) {
            dVar.P(this.f239n, true);
            return;
        }
        try {
            b bVar = new b(this, dVar);
            ThreadLocal threadLocal = r.f38a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f238m = true;
            dVar.O(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f230b, e2);
            this.f238m = true;
            dVar.O(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f237l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f38a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, x1.d dVar) {
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f235j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f229a;
        textPaint.setShadowLayer(this.f234g, this.f232e, this.f233f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, x1.d dVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f239n);
        c(context, new c(this, context, textPaint, dVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface U2 = l.U(context.getResources().getConfiguration(), typeface);
        if (U2 != null) {
            typeface = U2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f231c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f236k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
