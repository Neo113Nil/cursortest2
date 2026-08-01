package l2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public h.a f2628a = new l();

    /* renamed from: b, reason: collision with root package name */
    public h.a f2629b = new l();

    /* renamed from: c, reason: collision with root package name */
    public h.a f2630c = new l();
    public h.a d = new l();

    /* renamed from: e, reason: collision with root package name */
    public d f2631e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f2632f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public d f2633g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public d f2634h = new a(0.0f);
    public f i;

    /* renamed from: j, reason: collision with root package name */
    public f f2635j;

    /* renamed from: k, reason: collision with root package name */
    public f f2636k;

    /* renamed from: l, reason: collision with root package name */
    public f f2637l;

    public n() {
        int i = 0;
        this.i = new f(i);
        this.f2635j = new f(i);
        this.f2636k = new f(i);
        this.f2637l = new f(i);
    }

    public static m a(Context context, int i, int i4) {
        return b(context, i, i4, new a(0));
    }

    public static m b(Context context, int i, int i4, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i4 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i4, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(n1.a.D);
        try {
            int i5 = obtainStyledAttributes.getInt(0, 0);
            int i6 = obtainStyledAttributes.getInt(3, i5);
            int i7 = obtainStyledAttributes.getInt(4, i5);
            int i8 = obtainStyledAttributes.getInt(2, i5);
            int i9 = obtainStyledAttributes.getInt(1, i5);
            d d = d(obtainStyledAttributes, 5, aVar);
            d d3 = d(obtainStyledAttributes, 8, d);
            d d4 = d(obtainStyledAttributes, 9, d);
            d d5 = d(obtainStyledAttributes, 7, d);
            d d6 = d(obtainStyledAttributes, 6, d);
            m mVar = new m();
            mVar.f2618a = h.a.p(i6);
            mVar.f2621e = d3;
            mVar.f2619b = h.a.p(i7);
            mVar.f2622f = d4;
            mVar.f2620c = h.a.p(i8);
            mVar.f2623g = d5;
            mVar.d = h.a.p(i9);
            mVar.f2624h = d6;
            return mVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static m c(Context context, AttributeSet attributeSet, int i, int i4) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f2828u, i, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    public static d d(TypedArray typedArray, int i, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i4 = peekValue.type;
            if (i4 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i4 == 6) {
                return new k(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean e() {
        return (this.f2629b instanceof l) && (this.f2628a instanceof l) && (this.f2630c instanceof l) && (this.d instanceof l);
    }

    public final boolean f(RectF rectF) {
        boolean z3 = this.f2637l.getClass().equals(f.class) && this.f2635j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.f2636k.getClass().equals(f.class);
        float a2 = this.f2631e.a(rectF);
        return z3 && ((this.f2632f.a(rectF) > a2 ? 1 : (this.f2632f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f2634h.a(rectF) > a2 ? 1 : (this.f2634h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f2633g.a(rectF) > a2 ? 1 : (this.f2633g.a(rectF) == a2 ? 0 : -1)) == 0) && e();
    }

    public final m g() {
        m mVar = new m();
        mVar.f2618a = this.f2628a;
        mVar.f2619b = this.f2629b;
        mVar.f2620c = this.f2630c;
        mVar.d = this.d;
        mVar.f2621e = this.f2631e;
        mVar.f2622f = this.f2632f;
        mVar.f2623g = this.f2633g;
        mVar.f2624h = this.f2634h;
        mVar.i = this.i;
        mVar.f2625j = this.f2635j;
        mVar.f2626k = this.f2636k;
        mVar.f2627l = this.f2637l;
        return mVar;
    }

    public final String toString() {
        return "[" + this.f2631e + ", " + this.f2632f + ", " + this.f2633g + ", " + this.f2634h + "]";
    }
}
