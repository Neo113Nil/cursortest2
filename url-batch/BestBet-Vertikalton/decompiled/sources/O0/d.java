package O0;

import B.q;
import H1.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f846a;

    /* renamed from: b, reason: collision with root package name */
    public final String f847b;

    /* renamed from: c, reason: collision with root package name */
    public final int f848c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f849e;

    /* renamed from: f, reason: collision with root package name */
    public final float f850f;

    /* renamed from: g, reason: collision with root package name */
    public final float f851g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f852j;

    /* renamed from: k, reason: collision with root package name */
    public float f853k;

    /* renamed from: l, reason: collision with root package name */
    public final int f854l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f855m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f856n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0393a.f4564y);
        this.f853k = obtainStyledAttributes.getDimension(0, RecyclerView.f1937A0);
        this.f852j = l.B(context, obtainStyledAttributes, 3);
        l.B(context, obtainStyledAttributes, 4);
        l.B(context, obtainStyledAttributes, 5);
        this.f848c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f854l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f847b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f846a = l.B(context, obtainStyledAttributes, 6);
        this.f849e = obtainStyledAttributes.getFloat(7, RecyclerView.f1937A0);
        this.f850f = obtainStyledAttributes.getFloat(8, RecyclerView.f1937A0);
        this.f851g = obtainStyledAttributes.getFloat(9, RecyclerView.f1937A0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0393a.f4556q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, RecyclerView.f1937A0);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f856n;
        int i = this.f848c;
        if (typeface == null && (str = this.f847b) != null) {
            this.f856n = Typeface.create(str, i);
        }
        if (this.f856n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f856n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f856n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f856n = Typeface.DEFAULT;
            } else {
                this.f856n = Typeface.MONOSPACE;
            }
            this.f856n = Typeface.create(this.f856n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f855m) {
            return this.f856n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = q.a(context, this.f854l);
                this.f856n = a2;
                if (a2 != null) {
                    this.f856n = Typeface.create(a2, this.f848c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f847b, e2);
            }
        }
        a();
        this.f855m = true;
        return this.f856n;
    }

    public final void c(Context context, H1.d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f854l;
        if (i == 0) {
            this.f855m = true;
        }
        if (this.f855m) {
            dVar.U(this.f856n, true);
            return;
        }
        try {
            b bVar = new b(this, dVar);
            ThreadLocal threadLocal = q.f54a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                q.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f855m = true;
            dVar.T(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f847b, e2);
            this.f855m = true;
            dVar.T(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f854l;
        if (i != 0) {
            ThreadLocal threadLocal = q.f54a;
            if (!context.isRestricted()) {
                typeface = q.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, H1.d dVar) {
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f852j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f846a;
        textPaint.setShadowLayer(this.f851g, this.f849e, this.f850f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, H1.d dVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f856n);
        c(context, new c(this, context, textPaint, dVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface S2 = l.S(context.getResources().getConfiguration(), typeface);
        if (S2 != null) {
            typeface = S2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f848c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : RecyclerView.f1937A0);
        textPaint.setTextSize(this.f853k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
