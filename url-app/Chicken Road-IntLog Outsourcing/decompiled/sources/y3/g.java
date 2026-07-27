package y3;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f12395n = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public int f12399d;

    /* renamed from: e, reason: collision with root package name */
    public int f12400e;

    /* renamed from: g, reason: collision with root package name */
    public int f12402g;

    /* renamed from: h, reason: collision with root package name */
    public int f12403h;

    /* renamed from: k, reason: collision with root package name */
    public final k1.n f12406k;

    /* renamed from: l, reason: collision with root package name */
    public final k1.n f12407l;

    /* renamed from: c, reason: collision with root package name */
    public int[] f12398c = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f12401f = new Object[16];

    /* renamed from: i, reason: collision with root package name */
    public final G2.f f12404i = new G2.f(16);

    /* renamed from: j, reason: collision with root package name */
    public final G2.f f12405j = new G2.f(8);

    /* renamed from: m, reason: collision with root package name */
    public Object[] f12408m = new Object[16];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12396a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12397b = true;

    public g() {
        final int i2 = 0;
        this.f12406k = new k1.n(new D3.h(6), new Consumer() { // from class: y3.f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        ((Map) obj).clear();
                        break;
                    default:
                        ((List) obj).clear();
                        break;
                }
            }
        });
        final int i3 = 1;
        this.f12407l = new k1.n(new D3.h(7), new Consumer() { // from class: y3.f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        ((Map) obj).clear();
                        break;
                    default:
                        ((List) obj).clear();
                        break;
                }
            }
        });
    }

    public final void a(Object obj) {
        int i2 = this.f12403h;
        Object[] objArr = this.f12401f;
        if (i2 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f12401f = objArr2;
        }
        Object[] objArr3 = this.f12401f;
        int i3 = this.f12403h;
        this.f12403h = i3 + 1;
        objArr3[i3] = obj;
    }

    public final int b() {
        int i2 = this.f12400e;
        int[] iArr = this.f12398c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f12398c = iArr2;
        }
        int i3 = this.f12400e;
        this.f12400e = i3 + 1;
        return i3;
    }

    public final Object c(Class cls) {
        Object[] objArr = this.f12401f;
        int i2 = this.f12402g;
        this.f12402g = i2 + 1;
        return cls.cast(objArr[i2]);
    }

    public final Object d(K4.i iVar, Supplier supplier) {
        int i2 = iVar.f1443a;
        Object[] objArr = this.f12408m;
        if (i2 >= objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f12408m = objArr2;
        }
        Object[] objArr3 = this.f12408m;
        int i3 = iVar.f1443a;
        Object obj = objArr3[i3];
        if (obj != null) {
            return obj;
        }
        Object obj2 = supplier.get();
        this.f12408m[i3] = obj2;
        return obj2;
    }

    public final int e() {
        int[] iArr = this.f12398c;
        int i2 = this.f12399d;
        this.f12399d = i2 + 1;
        return iArr[i2];
    }
}
