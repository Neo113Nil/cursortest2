package I0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import o0.AbstractC0277a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public x1.d f357a = new i();

    /* renamed from: b, reason: collision with root package name */
    public x1.d f358b = new i();

    /* renamed from: c, reason: collision with root package name */
    public x1.d f359c = new i();
    public x1.d d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f360e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f361f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f362g = new a(0.0f);
    public c h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f363j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f364k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f365l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0277a.f3258v);
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
            x1.d r2 = x1.l.r(i4);
            jVar.f348a = r2;
            j.b(r2);
            jVar.f351e = c3;
            x1.d r3 = x1.l.r(i5);
            jVar.f349b = r3;
            j.b(r3);
            jVar.f352f = c4;
            x1.d r4 = x1.l.r(i6);
            jVar.f350c = r4;
            j.b(r4);
            jVar.f353g = c5;
            x1.d r5 = x1.l.r(i7);
            jVar.d = r5;
            j.b(r5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0277a.f3252p, i, i2);
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
        boolean z2 = this.f365l.getClass().equals(e.class) && this.f363j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f364k.getClass().equals(e.class);
        float a2 = this.f360e.a(rectF);
        return z2 && ((this.f361f.a(rectF) > a2 ? 1 : (this.f361f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f362g.a(rectF) > a2 ? 1 : (this.f362g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f358b instanceof i) && (this.f357a instanceof i) && (this.f359c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f348a = this.f357a;
        jVar.f349b = this.f358b;
        jVar.f350c = this.f359c;
        jVar.d = this.d;
        jVar.f351e = this.f360e;
        jVar.f352f = this.f361f;
        jVar.f353g = this.f362g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f354j = this.f363j;
        jVar.f355k = this.f364k;
        jVar.f356l = this.f365l;
        return jVar;
    }
}
