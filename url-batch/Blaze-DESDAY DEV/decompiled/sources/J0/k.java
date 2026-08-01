package J0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import p0.AbstractC0285a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public z1.l f381a = new i();

    /* renamed from: b, reason: collision with root package name */
    public z1.l f382b = new i();

    /* renamed from: c, reason: collision with root package name */
    public z1.l f383c = new i();
    public z1.l d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f384e = new a(RecyclerView.f1559A0);

    /* renamed from: f, reason: collision with root package name */
    public c f385f = new a(RecyclerView.f1559A0);

    /* renamed from: g, reason: collision with root package name */
    public c f386g = new a(RecyclerView.f1559A0);
    public c h = new a(RecyclerView.f1559A0);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f387j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f388k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f389l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0285a.f3341v);
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
            z1.l x2 = z1.d.x(i4);
            jVar.f372a = x2;
            j.b(x2);
            jVar.f375e = c3;
            z1.l x3 = z1.d.x(i5);
            jVar.f373b = x3;
            j.b(x3);
            jVar.f376f = c4;
            z1.l x4 = z1.d.x(i6);
            jVar.f374c = x4;
            j.b(x4);
            jVar.f377g = c5;
            z1.l x5 = z1.d.x(i7);
            jVar.d = x5;
            j.b(x5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0285a.f3335p, i, i2);
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
        boolean z2 = this.f389l.getClass().equals(e.class) && this.f387j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f388k.getClass().equals(e.class);
        float a2 = this.f384e.a(rectF);
        return z2 && ((this.f385f.a(rectF) > a2 ? 1 : (this.f385f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f386g.a(rectF) > a2 ? 1 : (this.f386g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f382b instanceof i) && (this.f381a instanceof i) && (this.f383c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f372a = this.f381a;
        jVar.f373b = this.f382b;
        jVar.f374c = this.f383c;
        jVar.d = this.d;
        jVar.f375e = this.f384e;
        jVar.f376f = this.f385f;
        jVar.f377g = this.f386g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f378j = this.f387j;
        jVar.f379k = this.f388k;
        jVar.f380l = this.f389l;
        return jVar;
    }
}
