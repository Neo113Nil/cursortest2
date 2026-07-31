package D4;

import D3.A;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f530n = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public int f534d;

    /* renamed from: e, reason: collision with root package name */
    public int f535e;

    /* renamed from: g, reason: collision with root package name */
    public int f537g;

    /* renamed from: h, reason: collision with root package name */
    public int f538h;

    /* renamed from: k, reason: collision with root package name */
    public final Q0.o f541k;

    /* renamed from: l, reason: collision with root package name */
    public final Q0.o f542l;

    /* renamed from: c, reason: collision with root package name */
    public int[] f533c = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f536f = new Object[16];

    /* renamed from: i, reason: collision with root package name */
    public final h f539i = new h(16);

    /* renamed from: j, reason: collision with root package name */
    public final h f540j = new h(8);

    /* renamed from: m, reason: collision with root package name */
    public Object[] f543m = new Object[16];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f531a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f532b = true;

    public i() {
        final int i7 = 0;
        this.f541k = new Q0.o(new C4.d(2), new Consumer() { // from class: D4.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        ((Map) obj).clear();
                        break;
                    default:
                        ((List) obj).clear();
                        break;
                }
            }
        });
        final int i8 = 1;
        this.f542l = new Q0.o(new C4.d(3), new Consumer() { // from class: D4.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i8) {
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
        int i7 = this.f538h;
        Object[] objArr = this.f536f;
        if (i7 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f536f = objArr2;
        }
        Object[] objArr3 = this.f536f;
        int i8 = this.f538h;
        this.f538h = i8 + 1;
        objArr3[i8] = obj;
    }

    public final int b() {
        int i7 = this.f535e;
        int[] iArr = this.f533c;
        if (i7 == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f533c = iArr2;
        }
        int i8 = this.f535e;
        this.f535e = i8 + 1;
        return i8;
    }

    public final Object c(Class cls) {
        Object[] objArr = this.f536f;
        int i7 = this.f537g;
        this.f537g = i7 + 1;
        return cls.cast(objArr[i7]);
    }

    public final Object d(A a7, Supplier supplier) {
        int i7 = a7.f384a;
        Object[] objArr = this.f543m;
        if (i7 >= objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f543m = objArr2;
        }
        Object obj = this.f543m[i7];
        if (obj != null) {
            return obj;
        }
        Object obj2 = supplier.get();
        this.f543m[i7] = obj2;
        return obj2;
    }

    public final int e() {
        int[] iArr = this.f533c;
        int i7 = this.f534d;
        this.f534d = i7 + 1;
        return iArr[i7];
    }
}
