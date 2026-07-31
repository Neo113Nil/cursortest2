package J;

import B.C0014o;
import I.C0143d;
import I.C0174t;
import I.H0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D extends O2.d {

    /* renamed from: c, reason: collision with root package name */
    public int f3105c;

    /* renamed from: e, reason: collision with root package name */
    public int f3107e;

    /* renamed from: g, reason: collision with root package name */
    public int f3109g;

    /* renamed from: h, reason: collision with root package name */
    public int f3110h;

    /* renamed from: i, reason: collision with root package name */
    public int f3111i;

    /* renamed from: b, reason: collision with root package name */
    public C[] f3104b = new C[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f3106d = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f3108f = new Object[16];

    public static final int h0(D d3, int i3) {
        d3.getClass();
        if (i3 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i3);
    }

    public final void i0() {
        this.f3105c = 0;
        this.f3107e = 0;
        Arrays.fill(this.f3108f, 0, this.f3109g, (Object) null);
        this.f3109g = 0;
    }

    public final void j0(G1.m mVar, H0 h02, C0174t c0174t) {
        D d3;
        int i3;
        if (l0()) {
            C0014o c0014o = new C0014o(this);
            do {
                d3 = (D) c0014o.f431e;
                C c2 = d3.f3104b[c0014o.f428b];
                f2.j.c(c2);
                c2.a(c0014o, mVar, h02, c0174t);
                int i4 = c0014o.f428b;
                if (i4 >= d3.f3105c) {
                    break;
                }
                C c3 = d3.f3104b[i4];
                f2.j.c(c3);
                c0014o.f429c += c3.f3102a;
                c0014o.f430d += c3.f3103b;
                i3 = c0014o.f428b + 1;
                c0014o.f428b = i3;
            } while (i3 < d3.f3105c);
        }
        i0();
    }

    public final boolean k0() {
        return this.f3105c == 0;
    }

    public final boolean l0() {
        return this.f3105c != 0;
    }

    public final C m0() {
        C c2 = this.f3104b[this.f3105c - 1];
        f2.j.c(c2);
        return c2;
    }

    public final void n0(C c2) {
        int i3 = c2.f3102a;
        int i4 = c2.f3103b;
        if (i3 == 0 && i4 == 0) {
            o0(c2);
            return;
        }
        C0143d.S("Cannot push " + c2 + " without arguments because it expects " + i3 + " ints and " + i4 + " objects.");
        throw null;
    }

    public final void o0(C c2) {
        this.f3110h = 0;
        this.f3111i = 0;
        int i3 = this.f3105c;
        C[] cArr = this.f3104b;
        if (i3 == cArr.length) {
            Object[] copyOf = Arrays.copyOf(cArr, i3 + (i3 > 1024 ? 1024 : i3));
            f2.j.e(copyOf, "copyOf(this, newSize)");
            this.f3104b = (C[]) copyOf;
        }
        int i4 = this.f3107e + c2.f3102a;
        int[] iArr = this.f3106d;
        int length = iArr.length;
        if (i4 > length) {
            int i5 = length + (length > 1024 ? 1024 : length);
            if (i5 >= i4) {
                i4 = i5;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i4);
            f2.j.e(copyOf2, "copyOf(this, newSize)");
            this.f3106d = copyOf2;
        }
        int i6 = this.f3109g;
        int i7 = c2.f3103b;
        int i8 = i6 + i7;
        Object[] objArr = this.f3108f;
        int length2 = objArr.length;
        if (i8 > length2) {
            int i9 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i9 >= i8) {
                i8 = i9;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i8);
            f2.j.e(copyOf3, "copyOf(this, newSize)");
            this.f3108f = copyOf3;
        }
        C[] cArr2 = this.f3104b;
        int i10 = this.f3105c;
        this.f3105c = i10 + 1;
        cArr2[i10] = c2;
        this.f3107e += c2.f3102a;
        this.f3109g += i7;
    }
}
