package L0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import q0.AbstractC0257a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public z1.d f462a = new i();

    /* renamed from: b, reason: collision with root package name */
    public z1.d f463b = new i();

    /* renamed from: c, reason: collision with root package name */
    public z1.d f464c = new i();
    public z1.d d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f465e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f466f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f467g = new a(0.0f);
    public c h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f468j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f469k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f470l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0257a.f3400x);
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
            z1.d A2 = z1.l.A(i4);
            jVar.f453a = A2;
            j.b(A2);
            jVar.f456e = c3;
            z1.d A3 = z1.l.A(i5);
            jVar.f454b = A3;
            j.b(A3);
            jVar.f457f = c4;
            z1.d A4 = z1.l.A(i6);
            jVar.f455c = A4;
            j.b(A4);
            jVar.f458g = c5;
            z1.d A5 = z1.l.A(i7);
            jVar.d = A5;
            j.b(A5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0257a.f3394r, i, i2);
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
        boolean z2 = this.f470l.getClass().equals(e.class) && this.f468j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f469k.getClass().equals(e.class);
        float a2 = this.f465e.a(rectF);
        return z2 && ((this.f466f.a(rectF) > a2 ? 1 : (this.f466f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f467g.a(rectF) > a2 ? 1 : (this.f467g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f463b instanceof i) && (this.f462a instanceof i) && (this.f464c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f453a = this.f462a;
        jVar.f454b = this.f463b;
        jVar.f455c = this.f464c;
        jVar.d = this.d;
        jVar.f456e = this.f465e;
        jVar.f457f = this.f466f;
        jVar.f458g = this.f467g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f459j = this.f468j;
        jVar.f460k = this.f469k;
        jVar.f461l = this.f470l;
        return jVar;
    }
}
