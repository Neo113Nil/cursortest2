package k5;

import K6.B;
import h4.v;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f6069n = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public int f6073d;

    /* renamed from: e, reason: collision with root package name */
    public int f6074e;

    /* renamed from: g, reason: collision with root package name */
    public int f6076g;

    /* renamed from: h, reason: collision with root package name */
    public int f6077h;

    /* renamed from: k, reason: collision with root package name */
    public final p1.l f6079k;

    /* renamed from: l, reason: collision with root package name */
    public final p1.l f6080l;

    /* renamed from: c, reason: collision with root package name */
    public int[] f6072c = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f6075f = new Object[16];

    /* renamed from: i, reason: collision with root package name */
    public final B f6078i = new B(16);
    public final B j = new B(8);

    /* renamed from: m, reason: collision with root package name */
    public Object[] f6081m = new Object[16];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6070a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6071b = true;

    public g() {
        final int i2 = 0;
        this.f6079k = new p1.l(new G3.a(4), new Consumer() { // from class: k5.f
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
        final int i5 = 1;
        this.f6080l = new p1.l(new G3.a(5), new Consumer() { // from class: k5.f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i5) {
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
        int i2 = this.f6077h;
        Object[] objArr = this.f6075f;
        if (i2 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f6075f = objArr2;
        }
        Object[] objArr3 = this.f6075f;
        int i5 = this.f6077h;
        this.f6077h = i5 + 1;
        objArr3[i5] = obj;
    }

    public final int b() {
        int i2 = this.f6074e;
        int[] iArr = this.f6072c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f6072c = iArr2;
        }
        int i5 = this.f6074e;
        this.f6074e = i5 + 1;
        return i5;
    }

    public final Object c(Class cls) {
        Object[] objArr = this.f6075f;
        int i2 = this.f6076g;
        this.f6076g = i2 + 1;
        return cls.cast(objArr[i2]);
    }

    public final Object d(v vVar, Supplier supplier) {
        int i2 = vVar.f5277a;
        Object[] objArr = this.f6081m;
        if (i2 >= objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f6081m = objArr2;
        }
        Object obj = this.f6081m[i2];
        if (obj != null) {
            return obj;
        }
        Object obj2 = supplier.get();
        this.f6081m[i2] = obj2;
        return obj2;
    }

    public final int e() {
        int[] iArr = this.f6072c;
        int i2 = this.f6073d;
        this.f6073d = i2 + 1;
        return iArr[i2];
    }
}
