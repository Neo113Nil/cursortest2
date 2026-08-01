package o2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: m, reason: collision with root package name */
    public static final k f2983m = new k(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public b4.d f2984a = new l();

    /* renamed from: b, reason: collision with root package name */
    public b4.d f2985b = new l();

    /* renamed from: c, reason: collision with root package name */
    public b4.d f2986c = new l();
    public b4.d d = new l();

    /* renamed from: e, reason: collision with root package name */
    public d f2987e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f2988f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public d f2989g = new a(0.0f);
    public d h = new a(0.0f);
    public f i;

    /* renamed from: j, reason: collision with root package name */
    public f f2990j;

    /* renamed from: k, reason: collision with root package name */
    public f f2991k;

    /* renamed from: l, reason: collision with root package name */
    public f f2992l;

    public o() {
        int i = 0;
        this.i = new f(i);
        this.f2990j = new f(i);
        this.f2991k = new f(i);
        this.f2992l = new f(i);
    }

    public static n g(Context context, AttributeSet attributeSet, int i, int i4) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q1.a.f3161y, i, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(q1.a.F), aVar);
    }

    public static n h(TypedArray typedArray, d dVar) {
        try {
            int i = typedArray.getInt(0, 0);
            int i4 = typedArray.getInt(3, i);
            int i5 = typedArray.getInt(4, i);
            int i6 = typedArray.getInt(2, i);
            int i7 = typedArray.getInt(1, i);
            d i8 = i(typedArray, 5, dVar);
            d i9 = i(typedArray, 8, i8);
            d i10 = i(typedArray, 9, i8);
            d i11 = i(typedArray, 7, i8);
            d i12 = i(typedArray, 6, i8);
            n nVar = new n();
            nVar.f2974a = b4.l.n(i4);
            nVar.f2977e = i9;
            nVar.f2975b = b4.l.n(i5);
            nVar.f2978f = i10;
            nVar.f2976c = b4.l.n(i6);
            nVar.f2979g = i11;
            nVar.d = b4.l.n(i7);
            nVar.h = i12;
            return nVar;
        } finally {
            typedArray.recycle();
        }
    }

    public static d i(TypedArray typedArray, int i, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i4 = peekValue.type;
            if (i4 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i4 == 6) {
                return new k(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    @Override // o2.m
    public final o a(float f5) {
        n k4 = k();
        k4.b(f5);
        return k4.a();
    }

    @Override // o2.m
    public final o[] c() {
        return new o[]{this};
    }

    @Override // o2.m
    public final o e(k kVar) {
        n k4 = k();
        k4.f2977e = kVar;
        k4.f2978f = kVar;
        k4.f2979g = kVar;
        k4.h = kVar;
        return k4.a();
    }

    @Override // o2.m
    public final boolean f() {
        return false;
    }

    public final boolean j(RectF rectF) {
        boolean z4 = this.f2992l.getClass().equals(f.class) && this.f2990j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.f2991k.getClass().equals(f.class);
        float a5 = this.f2987e.a(rectF);
        return z4 && ((this.f2988f.a(rectF) > a5 ? 1 : (this.f2988f.a(rectF) == a5 ? 0 : -1)) == 0 && (this.h.a(rectF) > a5 ? 1 : (this.h.a(rectF) == a5 ? 0 : -1)) == 0 && (this.f2989g.a(rectF) > a5 ? 1 : (this.f2989g.a(rectF) == a5 ? 0 : -1)) == 0) && (this.f2985b instanceof l) && (this.f2984a instanceof l) && (this.f2986c instanceof l) && (this.d instanceof l);
    }

    public final n k() {
        n nVar = new n();
        nVar.f2974a = this.f2984a;
        nVar.f2975b = this.f2985b;
        nVar.f2976c = this.f2986c;
        nVar.d = this.d;
        nVar.f2977e = this.f2987e;
        nVar.f2978f = this.f2988f;
        nVar.f2979g = this.f2989g;
        nVar.h = this.h;
        nVar.i = this.i;
        nVar.f2980j = this.f2990j;
        nVar.f2981k = this.f2991k;
        nVar.f2982l = this.f2992l;
        return nVar;
    }

    public final String toString() {
        return "[" + this.f2987e + ", " + this.f2988f + ", " + this.f2989g + ", " + this.h + "]";
    }

    @Override // o2.m
    public final o b(int[] iArr) {
        return this;
    }

    @Override // o2.m
    public final o d() {
        return this;
    }
}
