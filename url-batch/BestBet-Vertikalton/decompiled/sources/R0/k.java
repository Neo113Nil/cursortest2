package R0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public H1.d f946a = new i();

    /* renamed from: b, reason: collision with root package name */
    public H1.d f947b = new i();

    /* renamed from: c, reason: collision with root package name */
    public H1.d f948c = new i();
    public H1.d d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f949e = new a(RecyclerView.f1937A0);

    /* renamed from: f, reason: collision with root package name */
    public c f950f = new a(RecyclerView.f1937A0);

    /* renamed from: g, reason: collision with root package name */
    public c f951g = new a(RecyclerView.f1937A0);
    public c h = new a(RecyclerView.f1937A0);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f952j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f953k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f954l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0393a.f4561v);
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
            H1.d v2 = H1.l.v(i4);
            jVar.f937a = v2;
            j.b(v2);
            jVar.f940e = c3;
            H1.d v3 = H1.l.v(i5);
            jVar.f938b = v3;
            j.b(v3);
            jVar.f941f = c4;
            H1.d v4 = H1.l.v(i6);
            jVar.f939c = v4;
            j.b(v4);
            jVar.f942g = c5;
            H1.d v5 = H1.l.v(i7);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0393a.f4555p, i, i2);
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
        boolean z2 = this.f954l.getClass().equals(e.class) && this.f952j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f953k.getClass().equals(e.class);
        float a2 = this.f949e.a(rectF);
        return z2 && ((this.f950f.a(rectF) > a2 ? 1 : (this.f950f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f951g.a(rectF) > a2 ? 1 : (this.f951g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f947b instanceof i) && (this.f946a instanceof i) && (this.f948c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f937a = this.f946a;
        jVar.f938b = this.f947b;
        jVar.f939c = this.f948c;
        jVar.d = this.d;
        jVar.f940e = this.f949e;
        jVar.f941f = this.f950f;
        jVar.f942g = this.f951g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f943j = this.f952j;
        jVar.f944k = this.f953k;
        jVar.f945l = this.f954l;
        return jVar;
    }
}
