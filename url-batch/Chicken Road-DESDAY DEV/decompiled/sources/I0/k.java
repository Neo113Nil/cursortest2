package I0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import o0.AbstractC0278a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public u1.l f304a = new i();

    /* renamed from: b, reason: collision with root package name */
    public u1.l f305b = new i();

    /* renamed from: c, reason: collision with root package name */
    public u1.l f306c = new i();
    public u1.l d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f307e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f308f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f309g = new a(0.0f);
    public c h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f310j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f311k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f312l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0278a.f3352v);
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
            u1.l v2 = u1.d.v(i4);
            jVar.f295a = v2;
            j.b(v2);
            jVar.f298e = c3;
            u1.l v3 = u1.d.v(i5);
            jVar.f296b = v3;
            j.b(v3);
            jVar.f299f = c4;
            u1.l v4 = u1.d.v(i6);
            jVar.f297c = v4;
            j.b(v4);
            jVar.f300g = c5;
            u1.l v5 = u1.d.v(i7);
            jVar.d = v5;
            j.b(v5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0278a.f3346p, i, i2);
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
        boolean z2 = this.f312l.getClass().equals(e.class) && this.f310j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f311k.getClass().equals(e.class);
        float a2 = this.f307e.a(rectF);
        return z2 && ((this.f308f.a(rectF) > a2 ? 1 : (this.f308f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f309g.a(rectF) > a2 ? 1 : (this.f309g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f305b instanceof i) && (this.f304a instanceof i) && (this.f306c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f295a = this.f304a;
        jVar.f296b = this.f305b;
        jVar.f297c = this.f306c;
        jVar.d = this.d;
        jVar.f298e = this.f307e;
        jVar.f299f = this.f308f;
        jVar.f300g = this.f309g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f301j = this.f310j;
        jVar.f302k = this.f311k;
        jVar.f303l = this.f312l;
        return jVar;
    }
}
