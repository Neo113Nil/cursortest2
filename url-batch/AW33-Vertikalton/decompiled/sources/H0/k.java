package H0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import n0.AbstractC0278a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public q1.d f285a = new i();

    /* renamed from: b, reason: collision with root package name */
    public q1.d f286b = new i();

    /* renamed from: c, reason: collision with root package name */
    public q1.d f287c = new i();
    public q1.d d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f288e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f289f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f290g = new a(0.0f);
    public c h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f291j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f292k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f293l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0278a.f3296v);
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
            q1.d p2 = q1.l.p(i4);
            jVar.f276a = p2;
            j.b(p2);
            jVar.f279e = c3;
            q1.d p3 = q1.l.p(i5);
            jVar.f277b = p3;
            j.b(p3);
            jVar.f280f = c4;
            q1.d p4 = q1.l.p(i6);
            jVar.f278c = p4;
            j.b(p4);
            jVar.f281g = c5;
            q1.d p5 = q1.l.p(i7);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0278a.f3290p, i, i2);
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
        boolean z2 = this.f293l.getClass().equals(e.class) && this.f291j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f292k.getClass().equals(e.class);
        float a2 = this.f288e.a(rectF);
        return z2 && ((this.f289f.a(rectF) > a2 ? 1 : (this.f289f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f290g.a(rectF) > a2 ? 1 : (this.f290g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f286b instanceof i) && (this.f285a instanceof i) && (this.f287c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f276a = this.f285a;
        jVar.f277b = this.f286b;
        jVar.f278c = this.f287c;
        jVar.d = this.d;
        jVar.f279e = this.f288e;
        jVar.f280f = this.f289f;
        jVar.f281g = this.f290g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f282j = this.f291j;
        jVar.f283k = this.f292k;
        jVar.f284l = this.f293l;
        return jVar;
    }
}
