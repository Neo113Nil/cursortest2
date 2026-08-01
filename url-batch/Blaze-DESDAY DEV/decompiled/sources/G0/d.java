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
import p0.AbstractC0285a;
import z1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f258a;

    /* renamed from: b, reason: collision with root package name */
    public final String f259b;

    /* renamed from: c, reason: collision with root package name */
    public final int f260c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f261e;

    /* renamed from: f, reason: collision with root package name */
    public final float f262f;

    /* renamed from: g, reason: collision with root package name */
    public final float f263g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f264j;

    /* renamed from: k, reason: collision with root package name */
    public float f265k;

    /* renamed from: l, reason: collision with root package name */
    public final int f266l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f267m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f268n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0285a.f3344y);
        this.f265k = obtainStyledAttributes.getDimension(0, RecyclerView.f1559A0);
        this.f264j = l.t(context, obtainStyledAttributes, 3);
        l.t(context, obtainStyledAttributes, 4);
        l.t(context, obtainStyledAttributes, 5);
        this.f260c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f266l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f259b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f258a = l.t(context, obtainStyledAttributes, 6);
        this.f261e = obtainStyledAttributes.getFloat(7, RecyclerView.f1559A0);
        this.f262f = obtainStyledAttributes.getFloat(8, RecyclerView.f1559A0);
        this.f263g = obtainStyledAttributes.getFloat(9, RecyclerView.f1559A0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0285a.f3336q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, RecyclerView.f1559A0);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f268n;
        int i = this.f260c;
        if (typeface == null && (str = this.f259b) != null) {
            this.f268n = Typeface.create(str, i);
        }
        if (this.f268n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f268n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f268n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f268n = Typeface.DEFAULT;
            } else {
                this.f268n = Typeface.MONOSPACE;
            }
            this.f268n = Typeface.create(this.f268n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f267m) {
            return this.f268n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f266l);
                this.f268n = a2;
                if (a2 != null) {
                    this.f268n = Typeface.create(a2, this.f260c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f259b, e2);
            }
        }
        a();
        this.f267m = true;
        return this.f268n;
    }

    public final void c(Context context, z1.d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f266l;
        if (i == 0) {
            this.f267m = true;
        }
        if (this.f267m) {
            dVar.d0(this.f268n, true);
            return;
        }
        try {
            b bVar = new b(this, dVar);
            ThreadLocal threadLocal = r.f58a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f267m = true;
            dVar.c0(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f259b, e2);
            this.f267m = true;
            dVar.c0(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f266l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f58a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, z1.d dVar) {
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f264j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f258a;
        textPaint.setShadowLayer(this.f263g, this.f261e, this.f262f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, z1.d dVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f268n);
        c(context, new c(this, context, textPaint, dVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface G2 = l.G(context.getResources().getConfiguration(), typeface);
        if (G2 != null) {
            typeface = G2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f260c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : RecyclerView.f1559A0);
        textPaint.setTextSize(this.f265k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
