package g2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    public k3.d f1886a = new l();

    /* renamed from: b, reason: collision with root package name */
    public k3.d f1887b = new l();
    public k3.d c = new l();

    /* renamed from: d, reason: collision with root package name */
    public k3.d f1888d = new l();

    /* renamed from: e, reason: collision with root package name */
    public d f1889e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f1890f = new a(0.0f);
    public d g = new a(0.0f);
    public d h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public f f1891i;

    /* renamed from: j, reason: collision with root package name */
    public f f1892j;

    /* renamed from: k, reason: collision with root package name */
    public f f1893k;

    /* renamed from: l, reason: collision with root package name */
    public f f1894l;

    public o() {
        int i4 = 0;
        this.f1891i = new f(i4);
        this.f1892j = new f(i4);
        this.f1893k = new f(i4);
        this.f1894l = new f(i4);
    }

    public static n f(Context context, AttributeSet attributeSet, int i4, int i5) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l1.a.f2874t, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return g(contextThemeWrapper.obtainStyledAttributes(l1.a.A), aVar);
    }

    public static n g(TypedArray typedArray, a aVar) {
        try {
            int i4 = typedArray.getInt(0, 0);
            int i5 = typedArray.getInt(3, i4);
            int i6 = typedArray.getInt(4, i4);
            int i7 = typedArray.getInt(2, i4);
            int i8 = typedArray.getInt(1, i4);
            d h = h(typedArray, 5, aVar);
            d h4 = h(typedArray, 8, h);
            d h5 = h(typedArray, 9, h);
            d h6 = h(typedArray, 7, h);
            d h7 = h(typedArray, 6, h);
            n nVar = new n();
            nVar.f1877a = k3.m.o(i5);
            nVar.f1880e = h4;
            nVar.f1878b = k3.m.o(i6);
            nVar.f1881f = h5;
            nVar.c = k3.m.o(i7);
            nVar.g = h6;
            nVar.f1879d = k3.m.o(i8);
            nVar.h = h7;
            return nVar;
        } finally {
            typedArray.recycle();
        }
    }

    public static d h(TypedArray typedArray, int i4, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i4);
        if (peekValue != null) {
            int i5 = peekValue.type;
            if (i5 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i5 == 6) {
                return new k(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    @Override // g2.m
    public final o a(k kVar) {
        n j4 = j();
        j4.f1880e = kVar;
        j4.f1881f = kVar;
        j4.g = kVar;
        j4.h = kVar;
        return j4.a();
    }

    @Override // g2.m
    public final o b(float f4) {
        n j4 = j();
        j4.getClass();
        j4.f1880e = new a(f4);
        j4.f1881f = new a(f4);
        j4.g = new a(f4);
        j4.h = new a(f4);
        return j4.a();
    }

    @Override // g2.m
    public final boolean e() {
        return false;
    }

    public final boolean i(RectF rectF) {
        boolean z3 = this.f1894l.getClass().equals(f.class) && this.f1892j.getClass().equals(f.class) && this.f1891i.getClass().equals(f.class) && this.f1893k.getClass().equals(f.class);
        float a4 = this.f1889e.a(rectF);
        return z3 && ((this.f1890f.a(rectF) > a4 ? 1 : (this.f1890f.a(rectF) == a4 ? 0 : -1)) == 0 && (this.h.a(rectF) > a4 ? 1 : (this.h.a(rectF) == a4 ? 0 : -1)) == 0 && (this.g.a(rectF) > a4 ? 1 : (this.g.a(rectF) == a4 ? 0 : -1)) == 0) && (this.f1887b instanceof l) && (this.f1886a instanceof l) && (this.c instanceof l) && (this.f1888d instanceof l);
    }

    public final n j() {
        n nVar = new n();
        nVar.f1877a = this.f1886a;
        nVar.f1878b = this.f1887b;
        nVar.c = this.c;
        nVar.f1879d = this.f1888d;
        nVar.f1880e = this.f1889e;
        nVar.f1881f = this.f1890f;
        nVar.g = this.g;
        nVar.h = this.h;
        nVar.f1882i = this.f1891i;
        nVar.f1883j = this.f1892j;
        nVar.f1884k = this.f1893k;
        nVar.f1885l = this.f1894l;
        return nVar;
    }

    public final String toString() {
        return "[" + this.f1889e + ", " + this.f1890f + ", " + this.g + ", " + this.h + "]";
    }

    @Override // g2.m
    public final o c(int[] iArr) {
        return this;
    }

    @Override // g2.m
    public final o d() {
        return this;
    }
}
