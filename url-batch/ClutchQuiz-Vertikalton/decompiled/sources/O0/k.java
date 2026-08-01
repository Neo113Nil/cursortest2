package O0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import u0.AbstractC0361a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public A.c f556a = new i();

    /* renamed from: b, reason: collision with root package name */
    public A.c f557b = new i();

    /* renamed from: c, reason: collision with root package name */
    public A.c f558c = new i();
    public A.c d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f559e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f560f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f561g = new a(0.0f);
    public c h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f562j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f563k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f564l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0361a.f3746v);
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
            A.c u2 = A.c.u(i4);
            jVar.f547a = u2;
            j.b(u2);
            jVar.f550e = c3;
            A.c u3 = A.c.u(i5);
            jVar.f548b = u3;
            j.b(u3);
            jVar.f551f = c4;
            A.c u4 = A.c.u(i6);
            jVar.f549c = u4;
            j.b(u4);
            jVar.f552g = c5;
            A.c u5 = A.c.u(i7);
            jVar.d = u5;
            j.b(u5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0361a.f3740p, i, i2);
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
        boolean z2 = this.f564l.getClass().equals(e.class) && this.f562j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f563k.getClass().equals(e.class);
        float a2 = this.f559e.a(rectF);
        return z2 && ((this.f560f.a(rectF) > a2 ? 1 : (this.f560f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f561g.a(rectF) > a2 ? 1 : (this.f561g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f557b instanceof i) && (this.f556a instanceof i) && (this.f558c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f547a = this.f556a;
        jVar.f548b = this.f557b;
        jVar.f549c = this.f558c;
        jVar.d = this.d;
        jVar.f550e = this.f559e;
        jVar.f551f = this.f560f;
        jVar.f552g = this.f561g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f553j = this.f562j;
        jVar.f554k = this.f563k;
        jVar.f555l = this.f564l;
        return jVar;
    }
}
