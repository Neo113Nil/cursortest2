package w5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public r2.r f8138a = new l();

    /* renamed from: b, reason: collision with root package name */
    public r2.r f8139b = new l();

    /* renamed from: c, reason: collision with root package name */
    public r2.r f8140c = new l();

    /* renamed from: d, reason: collision with root package name */
    public r2.r f8141d = new l();

    /* renamed from: e, reason: collision with root package name */
    public d f8142e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f8143f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public d f8144g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public d f8145h = new a(0.0f);
    public f i;

    /* renamed from: j, reason: collision with root package name */
    public f f8146j;

    /* renamed from: k, reason: collision with root package name */
    public f f8147k;

    /* renamed from: l, reason: collision with root package name */
    public f f8148l;

    public n() {
        int i = 0;
        this.i = new f(i);
        this.f8146j = new f(i);
        this.f8147k = new f(i);
        this.f8148l = new f(i);
    }

    public static m a(Context context, int i, int i8, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i8 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i8, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(f5.a.f2753s);
        try {
            int i9 = obtainStyledAttributes.getInt(0, 0);
            int i10 = obtainStyledAttributes.getInt(3, i9);
            int i11 = obtainStyledAttributes.getInt(4, i9);
            int i12 = obtainStyledAttributes.getInt(2, i9);
            int i13 = obtainStyledAttributes.getInt(1, i9);
            d c8 = c(obtainStyledAttributes, 5, aVar);
            d c9 = c(obtainStyledAttributes, 8, c8);
            d c10 = c(obtainStyledAttributes, 9, c8);
            d c11 = c(obtainStyledAttributes, 7, c8);
            d c12 = c(obtainStyledAttributes, 6, c8);
            m mVar = new m();
            mVar.f8127a = r2.o.y(i10);
            mVar.f8131e = c9;
            mVar.f8128b = r2.o.y(i11);
            mVar.f8132f = c10;
            mVar.f8129c = r2.o.y(i12);
            mVar.f8133g = c11;
            mVar.f8130d = r2.o.y(i13);
            mVar.f8134h = c12;
            return mVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static m b(Context context, AttributeSet attributeSet, int i, int i8) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5.a.f2747m, i, i8);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static d c(TypedArray typedArray, int i, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i8 = peekValue.type;
            if (i8 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i8 == 6) {
                return new k(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean d() {
        return (this.f8139b instanceof l) && (this.f8138a instanceof l) && (this.f8140c instanceof l) && (this.f8141d instanceof l);
    }

    public final boolean e(RectF rectF) {
        boolean z3 = this.f8148l.getClass().equals(f.class) && this.f8146j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.f8147k.getClass().equals(f.class);
        float a8 = this.f8142e.a(rectF);
        return z3 && ((this.f8143f.a(rectF) > a8 ? 1 : (this.f8143f.a(rectF) == a8 ? 0 : -1)) == 0 && (this.f8145h.a(rectF) > a8 ? 1 : (this.f8145h.a(rectF) == a8 ? 0 : -1)) == 0 && (this.f8144g.a(rectF) > a8 ? 1 : (this.f8144g.a(rectF) == a8 ? 0 : -1)) == 0) && d();
    }

    public final m f() {
        m mVar = new m();
        mVar.f8127a = this.f8138a;
        mVar.f8128b = this.f8139b;
        mVar.f8129c = this.f8140c;
        mVar.f8130d = this.f8141d;
        mVar.f8131e = this.f8142e;
        mVar.f8132f = this.f8143f;
        mVar.f8133g = this.f8144g;
        mVar.f8134h = this.f8145h;
        mVar.i = this.i;
        mVar.f8135j = this.f8146j;
        mVar.f8136k = this.f8147k;
        mVar.f8137l = this.f8148l;
        return mVar;
    }

    public final String toString() {
        return "[" + this.f8142e + ", " + this.f8143f + ", " + this.f8144g + ", " + this.f8145h + "]";
    }
}
