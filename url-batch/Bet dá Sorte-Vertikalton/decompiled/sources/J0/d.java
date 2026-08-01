package J0;

import B.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import s0.AbstractC0283a;
import u1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f328a;

    /* renamed from: b, reason: collision with root package name */
    public final String f329b;

    /* renamed from: c, reason: collision with root package name */
    public final int f330c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f331e;

    /* renamed from: f, reason: collision with root package name */
    public final float f332f;

    /* renamed from: g, reason: collision with root package name */
    public final float f333g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f334j;

    /* renamed from: k, reason: collision with root package name */
    public float f335k;

    /* renamed from: l, reason: collision with root package name */
    public final int f336l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f337m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f338n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0283a.f3764y);
        this.f335k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f334j = u1.d.C(context, obtainStyledAttributes, 3);
        u1.d.C(context, obtainStyledAttributes, 4);
        u1.d.C(context, obtainStyledAttributes, 5);
        this.f330c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f336l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f329b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f328a = u1.d.C(context, obtainStyledAttributes, 6);
        this.f331e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f332f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f333g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0283a.f3756q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f338n;
        int i = this.f330c;
        if (typeface == null && (str = this.f329b) != null) {
            this.f338n = Typeface.create(str, i);
        }
        if (this.f338n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f338n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f338n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f338n = Typeface.DEFAULT;
            } else {
                this.f338n = Typeface.MONOSPACE;
            }
            this.f338n = Typeface.create(this.f338n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f337m) {
            return this.f338n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f336l);
                this.f338n = a2;
                if (a2 != null) {
                    this.f338n = Typeface.create(a2, this.f330c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f329b, e2);
            }
        }
        a();
        this.f337m = true;
        return this.f338n;
    }

    public final void c(Context context, l lVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f336l;
        if (i == 0) {
            this.f337m = true;
        }
        if (this.f337m) {
            lVar.X(this.f338n, true);
            return;
        }
        try {
            b bVar = new b(this, lVar);
            ThreadLocal threadLocal = r.f66a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f337m = true;
            lVar.W(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f329b, e2);
            this.f337m = true;
            lVar.W(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f336l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f66a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, l lVar) {
        f(context, textPaint, lVar);
        ColorStateList colorStateList = this.f334j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f328a;
        textPaint.setShadowLayer(this.f333g, this.f331e, this.f332f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, l lVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f338n);
        c(context, new c(this, context, textPaint, lVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface Q2 = u1.d.Q(context.getResources().getConfiguration(), typeface);
        if (Q2 != null) {
            typeface = Q2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f330c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f335k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
