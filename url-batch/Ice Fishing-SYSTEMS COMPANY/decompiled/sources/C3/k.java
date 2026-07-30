package C3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import i3.AbstractC4576a;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public U2.a f432a = new i();

    /* renamed from: b, reason: collision with root package name */
    public U2.a f433b = new i();

    /* renamed from: c, reason: collision with root package name */
    public U2.a f434c = new i();

    /* renamed from: d, reason: collision with root package name */
    public U2.a f435d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f436e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f437f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f438g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f439h = new a(0.0f);
    public e i = new e();

    /* renamed from: j, reason: collision with root package name */
    public e f440j = new e();

    /* renamed from: k, reason: collision with root package name */
    public e f441k = new e();

    /* renamed from: l, reason: collision with root package name */
    public e f442l = new e();

    public static j a(Context context, int i, int i4, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i4 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i4);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC4576a.f38312v);
        try {
            int i9 = obtainStyledAttributes.getInt(0, 0);
            int i10 = obtainStyledAttributes.getInt(3, i9);
            int i11 = obtainStyledAttributes.getInt(4, i9);
            int i12 = obtainStyledAttributes.getInt(2, i9);
            int i13 = obtainStyledAttributes.getInt(1, i9);
            c c4 = c(obtainStyledAttributes, 5, aVar);
            c c9 = c(obtainStyledAttributes, 8, c4);
            c c10 = c(obtainStyledAttributes, 9, c4);
            c c11 = c(obtainStyledAttributes, 7, c4);
            c c12 = c(obtainStyledAttributes, 6, c4);
            j jVar = new j();
            U2.a b9 = W2.e.b(i10);
            jVar.f421a = b9;
            j.b(b9);
            jVar.f425e = c9;
            U2.a b10 = W2.e.b(i11);
            jVar.f422b = b10;
            j.b(b10);
            jVar.f426f = c10;
            U2.a b11 = W2.e.b(i12);
            jVar.f423c = b11;
            j.b(b11);
            jVar.f427g = c11;
            U2.a b12 = W2.e.b(i13);
            jVar.f424d = b12;
            j.b(b12);
            jVar.f428h = c12;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i4) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4576a.f38306p, i, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i4 = peekValue.type;
            if (i4 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i4 == 6) {
                return new h(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z8 = this.f442l.getClass().equals(e.class) && this.f440j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f441k.getClass().equals(e.class);
        float a9 = this.f436e.a(rectF);
        return z8 && ((this.f437f.a(rectF) > a9 ? 1 : (this.f437f.a(rectF) == a9 ? 0 : -1)) == 0 && (this.f439h.a(rectF) > a9 ? 1 : (this.f439h.a(rectF) == a9 ? 0 : -1)) == 0 && (this.f438g.a(rectF) > a9 ? 1 : (this.f438g.a(rectF) == a9 ? 0 : -1)) == 0) && ((this.f433b instanceof i) && (this.f432a instanceof i) && (this.f434c instanceof i) && (this.f435d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f421a = this.f432a;
        jVar.f422b = this.f433b;
        jVar.f423c = this.f434c;
        jVar.f424d = this.f435d;
        jVar.f425e = this.f436e;
        jVar.f426f = this.f437f;
        jVar.f427g = this.f438g;
        jVar.f428h = this.f439h;
        jVar.i = this.i;
        jVar.f429j = this.f440j;
        jVar.f430k = this.f441k;
        jVar.f431l = this.f442l;
        return jVar;
    }
}
