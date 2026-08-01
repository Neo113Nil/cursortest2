package N0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import t0.AbstractC0383a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public H1.d f929a = new i();

    /* renamed from: b, reason: collision with root package name */
    public H1.d f930b = new i();

    /* renamed from: c, reason: collision with root package name */
    public H1.d f931c = new i();

    /* renamed from: d, reason: collision with root package name */
    public H1.d f932d = new i();
    public c e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f933f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f934g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f935h = new a(0.0f);
    public e i = new e(0);
    public e j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f936k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f937l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0383a.f4165v);
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
            H1.d s2 = H1.l.s(i4);
            jVar.f920a = s2;
            j.b(s2);
            jVar.e = c3;
            H1.d s3 = H1.l.s(i5);
            jVar.f921b = s3;
            j.b(s3);
            jVar.f924f = c4;
            H1.d s4 = H1.l.s(i6);
            jVar.f922c = s4;
            j.b(s4);
            jVar.f925g = c5;
            H1.d s5 = H1.l.s(i7);
            jVar.f923d = s5;
            j.b(s5);
            jVar.f926h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0383a.f4159p, i, i2);
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
        boolean z2 = this.f937l.getClass().equals(e.class) && this.j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f936k.getClass().equals(e.class);
        float a2 = this.e.a(rectF);
        return z2 && ((this.f933f.a(rectF) > a2 ? 1 : (this.f933f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f935h.a(rectF) > a2 ? 1 : (this.f935h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f934g.a(rectF) > a2 ? 1 : (this.f934g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f930b instanceof i) && (this.f929a instanceof i) && (this.f931c instanceof i) && (this.f932d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f920a = this.f929a;
        jVar.f921b = this.f930b;
        jVar.f922c = this.f931c;
        jVar.f923d = this.f932d;
        jVar.e = this.e;
        jVar.f924f = this.f933f;
        jVar.f925g = this.f934g;
        jVar.f926h = this.f935h;
        jVar.i = this.i;
        jVar.j = this.j;
        jVar.f927k = this.f936k;
        jVar.f928l = this.f937l;
        return jVar;
    }
}
