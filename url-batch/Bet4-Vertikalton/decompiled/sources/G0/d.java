package G0;

import B.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import p0.AbstractC0282a;
import w1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f241a;

    /* renamed from: b, reason: collision with root package name */
    public final String f242b;

    /* renamed from: c, reason: collision with root package name */
    public final int f243c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f244e;

    /* renamed from: f, reason: collision with root package name */
    public final float f245f;

    /* renamed from: g, reason: collision with root package name */
    public final float f246g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f247j;

    /* renamed from: k, reason: collision with root package name */
    public float f248k;

    /* renamed from: l, reason: collision with root package name */
    public final int f249l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f250m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f251n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0282a.f3451y);
        this.f248k = obtainStyledAttributes.getDimension(0, RecyclerView.f1530C0);
        this.f247j = l.v(context, obtainStyledAttributes, 3);
        l.v(context, obtainStyledAttributes, 4);
        l.v(context, obtainStyledAttributes, 5);
        this.f243c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f249l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f242b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f241a = l.v(context, obtainStyledAttributes, 6);
        this.f244e = obtainStyledAttributes.getFloat(7, RecyclerView.f1530C0);
        this.f245f = obtainStyledAttributes.getFloat(8, RecyclerView.f1530C0);
        this.f246g = obtainStyledAttributes.getFloat(9, RecyclerView.f1530C0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0282a.f3443q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, RecyclerView.f1530C0);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f251n;
        int i = this.f243c;
        if (typeface == null && (str = this.f242b) != null) {
            this.f251n = Typeface.create(str, i);
        }
        if (this.f251n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f251n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f251n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f251n = Typeface.DEFAULT;
            } else {
                this.f251n = Typeface.MONOSPACE;
            }
            this.f251n = Typeface.create(this.f251n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f250m) {
            return this.f251n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f249l);
                this.f251n = a2;
                if (a2 != null) {
                    this.f251n = Typeface.create(a2, this.f243c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f242b, e2);
            }
        }
        a();
        this.f250m = true;
        return this.f251n;
    }

    public final void c(Context context, w1.d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f249l;
        if (i == 0) {
            this.f250m = true;
        }
        if (this.f250m) {
            dVar.d0(this.f251n, true);
            return;
        }
        try {
            b bVar = new b(this, dVar);
            ThreadLocal threadLocal = r.f44a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f250m = true;
            dVar.c0(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f242b, e2);
            this.f250m = true;
            dVar.c0(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f249l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f44a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, w1.d dVar) {
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f247j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f241a;
        textPaint.setShadowLayer(this.f246g, this.f244e, this.f245f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, w1.d dVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f251n);
        c(context, new c(this, context, textPaint, dVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface G2 = l.G(context.getResources().getConfiguration(), typeface);
        if (G2 != null) {
            typeface = G2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f243c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : RecyclerView.f1530C0);
        textPaint.setTextSize(this.f248k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
