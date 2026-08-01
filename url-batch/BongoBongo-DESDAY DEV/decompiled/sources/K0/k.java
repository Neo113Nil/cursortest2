package K0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import q0.AbstractC0285a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public A1.d f428a = new i();

    /* renamed from: b, reason: collision with root package name */
    public A1.d f429b = new i();

    /* renamed from: c, reason: collision with root package name */
    public A1.d f430c = new i();
    public A1.d d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f431e = new a(RecyclerView.A0);

    /* renamed from: f, reason: collision with root package name */
    public c f432f = new a(RecyclerView.A0);

    /* renamed from: g, reason: collision with root package name */
    public c f433g = new a(RecyclerView.A0);

    /* renamed from: h, reason: collision with root package name */
    public c f434h = new a(RecyclerView.A0);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f435j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f436k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f437l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0285a.f3519v);
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
            A1.d m2 = A1.m.m(i4);
            jVar.f418a = m2;
            j.b(m2);
            jVar.f421e = c3;
            A1.d m3 = A1.m.m(i5);
            jVar.f419b = m3;
            j.b(m3);
            jVar.f422f = c4;
            A1.d m4 = A1.m.m(i6);
            jVar.f420c = m4;
            j.b(m4);
            jVar.f423g = c5;
            A1.d m5 = A1.m.m(i7);
            jVar.d = m5;
            j.b(m5);
            jVar.f424h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0285a.f3513p, i, i2);
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
        boolean z2 = this.f437l.getClass().equals(e.class) && this.f435j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f436k.getClass().equals(e.class);
        float a2 = this.f431e.a(rectF);
        return z2 && ((this.f432f.a(rectF) > a2 ? 1 : (this.f432f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f434h.a(rectF) > a2 ? 1 : (this.f434h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f433g.a(rectF) > a2 ? 1 : (this.f433g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f429b instanceof i) && (this.f428a instanceof i) && (this.f430c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f418a = this.f428a;
        jVar.f419b = this.f429b;
        jVar.f420c = this.f430c;
        jVar.d = this.d;
        jVar.f421e = this.f431e;
        jVar.f422f = this.f432f;
        jVar.f423g = this.f433g;
        jVar.f424h = this.f434h;
        jVar.i = this.i;
        jVar.f425j = this.f435j;
        jVar.f426k = this.f436k;
        jVar.f427l = this.f437l;
        return jVar;
    }
}
