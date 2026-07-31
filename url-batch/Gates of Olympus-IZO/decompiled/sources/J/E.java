package J;

import D1.C0014b;
import I.C0089d;
import I.C0120t;
import I.I0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class E extends I2.l {

    /* renamed from: g, reason: collision with root package name */
    public int f2530g;

    /* renamed from: i, reason: collision with root package name */
    public int f2532i;

    /* renamed from: k, reason: collision with root package name */
    public int f2534k;

    /* renamed from: l, reason: collision with root package name */
    public int f2535l;

    /* renamed from: m, reason: collision with root package name */
    public int f2536m;

    /* renamed from: f, reason: collision with root package name */
    public C[] f2529f = new C[16];

    /* renamed from: h, reason: collision with root package name */
    public int[] f2531h = new int[16];

    /* renamed from: j, reason: collision with root package name */
    public Object[] f2533j = new Object[16];

    public static final int T(E e3, int i3) {
        e3.getClass();
        if (i3 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i3);
    }

    public final void U() {
        this.f2530g = 0;
        this.f2532i = 0;
        M1.k.c0(this.f2533j, 0, this.f2534k);
        this.f2534k = 0;
    }

    public final void V(C0014b c0014b, I0 i02, C0120t c0120t) {
        E e3;
        int i3;
        if (X()) {
            D d3 = new D(this);
            do {
                e3 = (E) d3.f2528d;
                C c3 = e3.f2529f[d3.f2525a];
                Z1.i.c(c3);
                c3.a(d3, c0014b, i02, c0120t);
                int i4 = d3.f2525a;
                if (i4 >= e3.f2530g) {
                    break;
                }
                C c4 = e3.f2529f[i4];
                Z1.i.c(c4);
                d3.f2526b += c4.f2523a;
                d3.f2527c += c4.f2524b;
                i3 = d3.f2525a + 1;
                d3.f2525a = i3;
            } while (i3 < e3.f2530g);
        }
        U();
    }

    public final boolean W() {
        return this.f2530g == 0;
    }

    public final boolean X() {
        return this.f2530g != 0;
    }

    public final C Y() {
        C c3 = this.f2529f[this.f2530g - 1];
        Z1.i.c(c3);
        return c3;
    }

    public final void Z(C c3) {
        int i3 = c3.f2523a;
        int i4 = c3.f2524b;
        if (i3 == 0 && i4 == 0) {
            a0(c3);
            return;
        }
        C0089d.R("Cannot push " + c3 + " without arguments because it expects " + i3 + " ints and " + i4 + " objects.");
        throw null;
    }

    public final void a0(C c3) {
        this.f2535l = 0;
        this.f2536m = 0;
        int i3 = this.f2530g;
        C[] cArr = this.f2529f;
        if (i3 == cArr.length) {
            Object[] copyOf = Arrays.copyOf(cArr, i3 + (i3 > 1024 ? 1024 : i3));
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            this.f2529f = (C[]) copyOf;
        }
        int i4 = this.f2532i + c3.f2523a;
        int[] iArr = this.f2531h;
        int length = iArr.length;
        if (i4 > length) {
            int i5 = length + (length > 1024 ? 1024 : length);
            if (i5 >= i4) {
                i4 = i5;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i4);
            Z1.i.e(copyOf2, "copyOf(this, newSize)");
            this.f2531h = copyOf2;
        }
        int i6 = this.f2534k;
        int i7 = c3.f2524b;
        int i8 = i6 + i7;
        Object[] objArr = this.f2533j;
        int length2 = objArr.length;
        if (i8 > length2) {
            int i9 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i9 >= i8) {
                i8 = i9;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i8);
            Z1.i.e(copyOf3, "copyOf(this, newSize)");
            this.f2533j = copyOf3;
        }
        C[] cArr2 = this.f2529f;
        int i10 = this.f2530g;
        this.f2530g = i10 + 1;
        cArr2[i10] = c3;
        this.f2532i += c3.f2523a;
        this.f2534k += i7;
    }
}
