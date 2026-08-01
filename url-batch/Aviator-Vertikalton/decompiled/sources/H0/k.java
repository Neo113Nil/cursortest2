package H0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import n0.AbstractC0303a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public q1.l f304a = new i();

    /* renamed from: b, reason: collision with root package name */
    public q1.l f305b = new i();

    /* renamed from: c, reason: collision with root package name */
    public q1.l f306c = new i();

    /* renamed from: d, reason: collision with root package name */
    public q1.l f307d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f308e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f309f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f310g = new a(0.0f);
    public c h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f311j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f312k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f313l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0303a.f3649v);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            c c2 = c(obtainStyledAttributes, 5, aVar);
            c c3 = c(obtainStyledAttributes, 8, c2);
            c c4 = c(obtainStyledAttributes, 9, c2);
            c c5 = c(obtainStyledAttributes, 7, c2);
            c c6 = c(obtainStyledAttributes, 6, c2);
            j jVar = new j();
            q1.l r2 = q1.d.r(i4);
            jVar.f294a = r2;
            j.b(r2);
            jVar.f298e = c3;
            q1.l r3 = q1.d.r(i5);
            jVar.f295b = r3;
            j.b(r3);
            jVar.f299f = c4;
            q1.l r4 = q1.d.r(i6);
            jVar.f296c = r4;
            j.b(r4);
            jVar.f300g = c5;
            q1.l r5 = q1.d.r(i7);
            jVar.f297d = r5;
            j.b(r5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0303a.f3643p, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z2 = this.f313l.getClass().equals(e.class) && this.f311j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f312k.getClass().equals(e.class);
        float a2 = this.f308e.a(rectF);
        return z2 && ((this.f309f.a(rectF) > a2 ? 1 : (this.f309f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f310g.a(rectF) > a2 ? 1 : (this.f310g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f305b instanceof i) && (this.f304a instanceof i) && (this.f306c instanceof i) && (this.f307d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f294a = this.f304a;
        jVar.f295b = this.f305b;
        jVar.f296c = this.f306c;
        jVar.f297d = this.f307d;
        jVar.f298e = this.f308e;
        jVar.f299f = this.f309f;
        jVar.f300g = this.f310g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f301j = this.f311j;
        jVar.f302k = this.f312k;
        jVar.f303l = this.f313l;
        return jVar;
    }
}
