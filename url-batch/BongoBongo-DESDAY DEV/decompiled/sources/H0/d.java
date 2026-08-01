package H0;

import A1.m;
import C.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import q0.AbstractC0285a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f303a;

    /* renamed from: b, reason: collision with root package name */
    public final String f304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f305c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f306e;

    /* renamed from: f, reason: collision with root package name */
    public final float f307f;

    /* renamed from: g, reason: collision with root package name */
    public final float f308g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f309h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f310j;

    /* renamed from: k, reason: collision with root package name */
    public float f311k;

    /* renamed from: l, reason: collision with root package name */
    public final int f312l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f313m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f314n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0285a.f3523z);
        this.f311k = obtainStyledAttributes.getDimension(0, RecyclerView.A0);
        this.f310j = A1.d.D(context, obtainStyledAttributes, 3);
        A1.d.D(context, obtainStyledAttributes, 4);
        A1.d.D(context, obtainStyledAttributes, 5);
        this.f305c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f312l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f304b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f303a = A1.d.D(context, obtainStyledAttributes, 6);
        this.f306e = obtainStyledAttributes.getFloat(7, RecyclerView.A0);
        this.f307f = obtainStyledAttributes.getFloat(8, RecyclerView.A0);
        this.f308g = obtainStyledAttributes.getFloat(9, RecyclerView.A0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0285a.f3514q);
        this.f309h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, RecyclerView.A0);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f314n;
        int i = this.f305c;
        if (typeface == null && (str = this.f304b) != null) {
            this.f314n = Typeface.create(str, i);
        }
        if (this.f314n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f314n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f314n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f314n = Typeface.DEFAULT;
            } else {
                this.f314n = Typeface.MONOSPACE;
            }
            this.f314n = Typeface.create(this.f314n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f313m) {
            return this.f314n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f312l);
                this.f314n = a2;
                if (a2 != null) {
                    this.f314n = Typeface.create(a2, this.f305c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f304b, e2);
            }
        }
        a();
        this.f313m = true;
        return this.f314n;
    }

    public final void c(Context context, m mVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f312l;
        if (i == 0) {
            this.f313m = true;
        }
        if (this.f313m) {
            mVar.P(this.f314n, true);
            return;
        }
        try {
            b bVar = new b(this, mVar);
            ThreadLocal threadLocal = r.f99a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f313m = true;
            mVar.O(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f304b, e2);
            this.f313m = true;
            mVar.O(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f312l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f99a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, m mVar) {
        f(context, textPaint, mVar);
        ColorStateList colorStateList = this.f310j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f303a;
        textPaint.setShadowLayer(this.f308g, this.f306e, this.f307f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, m mVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f314n);
        c(context, new c(this, context, textPaint, mVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface V2 = A1.d.V(context.getResources().getConfiguration(), typeface);
        if (V2 != null) {
            typeface = V2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f305c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : RecyclerView.A0);
        textPaint.setTextSize(this.f311k);
        if (this.f309h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
