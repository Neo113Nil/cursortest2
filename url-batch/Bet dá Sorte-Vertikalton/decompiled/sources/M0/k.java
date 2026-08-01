package M0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import s0.AbstractC0283a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public u1.l f524a = new i();

    /* renamed from: b, reason: collision with root package name */
    public u1.l f525b = new i();

    /* renamed from: c, reason: collision with root package name */
    public u1.l f526c = new i();
    public u1.l d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f527e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f528f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f529g = new a(0.0f);
    public c h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f530j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f531k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f532l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0283a.f3761v);
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
            u1.l w2 = u1.d.w(i4);
            jVar.f515a = w2;
            j.b(w2);
            jVar.f518e = c3;
            u1.l w3 = u1.d.w(i5);
            jVar.f516b = w3;
            j.b(w3);
            jVar.f519f = c4;
            u1.l w4 = u1.d.w(i6);
            jVar.f517c = w4;
            j.b(w4);
            jVar.f520g = c5;
            u1.l w5 = u1.d.w(i7);
            jVar.d = w5;
            j.b(w5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0283a.f3755p, i, i2);
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
        boolean z2 = this.f532l.getClass().equals(e.class) && this.f530j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f531k.getClass().equals(e.class);
        float a2 = this.f527e.a(rectF);
        return z2 && ((this.f528f.a(rectF) > a2 ? 1 : (this.f528f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f529g.a(rectF) > a2 ? 1 : (this.f529g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f525b instanceof i) && (this.f524a instanceof i) && (this.f526c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f515a = this.f524a;
        jVar.f516b = this.f525b;
        jVar.f517c = this.f526c;
        jVar.d = this.d;
        jVar.f518e = this.f527e;
        jVar.f519f = this.f528f;
        jVar.f520g = this.f529g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f521j = this.f530j;
        jVar.f522k = this.f531k;
        jVar.f523l = this.f532l;
        return jVar;
    }
}
