package I0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import o0.AbstractC0275a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public s1.l f297a = new i();

    /* renamed from: b, reason: collision with root package name */
    public s1.l f298b = new i();

    /* renamed from: c, reason: collision with root package name */
    public s1.l f299c = new i();
    public s1.l d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f300e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f301f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f302g = new a(0.0f);
    public c h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f303j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f304k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f305l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0275a.f3357v);
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
            s1.l p2 = s1.d.p(i4);
            jVar.f288a = p2;
            j.b(p2);
            jVar.f291e = c3;
            s1.l p3 = s1.d.p(i5);
            jVar.f289b = p3;
            j.b(p3);
            jVar.f292f = c4;
            s1.l p4 = s1.d.p(i6);
            jVar.f290c = p4;
            j.b(p4);
            jVar.f293g = c5;
            s1.l p5 = s1.d.p(i7);
            jVar.d = p5;
            j.b(p5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0275a.f3351p, i, i2);
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
        boolean z2 = this.f305l.getClass().equals(e.class) && this.f303j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f304k.getClass().equals(e.class);
        float a2 = this.f300e.a(rectF);
        return z2 && ((this.f301f.a(rectF) > a2 ? 1 : (this.f301f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f302g.a(rectF) > a2 ? 1 : (this.f302g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f298b instanceof i) && (this.f297a instanceof i) && (this.f299c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f288a = this.f297a;
        jVar.f289b = this.f298b;
        jVar.f290c = this.f299c;
        jVar.d = this.d;
        jVar.f291e = this.f300e;
        jVar.f292f = this.f301f;
        jVar.f293g = this.f302g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f294j = this.f303j;
        jVar.f295k = this.f304k;
        jVar.f296l = this.f305l;
        return jVar;
    }
}
