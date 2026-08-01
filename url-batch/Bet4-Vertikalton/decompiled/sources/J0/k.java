package J0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import p0.AbstractC0282a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public w1.l f364a = new i();

    /* renamed from: b, reason: collision with root package name */
    public w1.l f365b = new i();

    /* renamed from: c, reason: collision with root package name */
    public w1.l f366c = new i();
    public w1.l d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f367e = new a(RecyclerView.f1530C0);

    /* renamed from: f, reason: collision with root package name */
    public c f368f = new a(RecyclerView.f1530C0);

    /* renamed from: g, reason: collision with root package name */
    public c f369g = new a(RecyclerView.f1530C0);
    public c h = new a(RecyclerView.f1530C0);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f370j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f371k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f372l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0282a.f3448v);
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
            w1.l x2 = w1.d.x(i4);
            jVar.f355a = x2;
            j.b(x2);
            jVar.f358e = c3;
            w1.l x3 = w1.d.x(i5);
            jVar.f356b = x3;
            j.b(x3);
            jVar.f359f = c4;
            w1.l x4 = w1.d.x(i6);
            jVar.f357c = x4;
            j.b(x4);
            jVar.f360g = c5;
            w1.l x5 = w1.d.x(i7);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0282a.f3442p, i, i2);
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
        boolean z2 = this.f372l.getClass().equals(e.class) && this.f370j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f371k.getClass().equals(e.class);
        float a2 = this.f367e.a(rectF);
        return z2 && ((this.f368f.a(rectF) > a2 ? 1 : (this.f368f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f369g.a(rectF) > a2 ? 1 : (this.f369g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f365b instanceof i) && (this.f364a instanceof i) && (this.f366c instanceof i) && (this.d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f355a = this.f364a;
        jVar.f356b = this.f365b;
        jVar.f357c = this.f366c;
        jVar.d = this.d;
        jVar.f358e = this.f367e;
        jVar.f359f = this.f368f;
        jVar.f360g = this.f369g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f361j = this.f370j;
        jVar.f362k = this.f371k;
        jVar.f363l = this.f372l;
        return jVar;
    }
}
