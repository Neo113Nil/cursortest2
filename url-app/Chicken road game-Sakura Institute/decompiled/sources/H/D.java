package H;

import A.C0020p;
import B1.C0097d;
import G.C0192d;
import G.C0223t;
import G.H0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class D extends u3.d {

    /* renamed from: h, reason: collision with root package name */
    public C[] f3174h;

    /* renamed from: i, reason: collision with root package name */
    public int f3175i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3176j;

    /* renamed from: k, reason: collision with root package name */
    public int f3177k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f3178l;

    /* renamed from: m, reason: collision with root package name */
    public int f3179m;

    /* renamed from: n, reason: collision with root package name */
    public int f3180n;

    /* renamed from: o, reason: collision with root package name */
    public int f3181o;

    public D() {
        super(10);
        this.f3174h = new C[16];
        this.f3176j = new int[16];
        this.f3178l = new Object[16];
    }

    public static final int W(D d4, int i2) {
        d4.getClass();
        if (i2 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i2);
    }

    public final void X() {
        this.f3175i = 0;
        this.f3177k = 0;
        C1436t.k(this.f3178l, 0, this.f3179m);
        this.f3179m = 0;
    }

    public final void Y(C0097d c0097d, H0 h02, C0223t c0223t) {
        D d4;
        int i2;
        if (a0()) {
            C0020p c0020p = new C0020p(this);
            do {
                d4 = (D) c0020p.f175e;
                C c4 = d4.f3174h[c0020p.f172b];
                Intrinsics.c(c4);
                c4.a(c0020p, c0097d, h02, c0223t);
                int i4 = c0020p.f172b;
                if (i4 >= d4.f3175i) {
                    break;
                }
                C c5 = d4.f3174h[i4];
                Intrinsics.c(c5);
                c0020p.f173c += c5.f3172a;
                c0020p.f174d += c5.f3173b;
                i2 = c0020p.f172b + 1;
                c0020p.f172b = i2;
            } while (i2 < d4.f3175i);
        }
        X();
    }

    public final boolean Z() {
        return this.f3175i == 0;
    }

    public final boolean a0() {
        return this.f3175i != 0;
    }

    public final C b0() {
        C c4 = this.f3174h[this.f3175i - 1];
        Intrinsics.c(c4);
        return c4;
    }

    public final void c0(C c4) {
        int i2 = c4.f3172a;
        int i4 = c4.f3173b;
        if (i2 == 0 && i4 == 0) {
            d0(c4);
            return;
        }
        C0192d.S("Cannot push " + c4 + " without arguments because it expects " + i2 + " ints and " + i4 + " objects.");
        throw null;
    }

    public final void d0(C c4) {
        this.f3180n = 0;
        this.f3181o = 0;
        int i2 = this.f3175i;
        C[] cArr = this.f3174h;
        if (i2 == cArr.length) {
            Object[] copyOf = Arrays.copyOf(cArr, i2 + (i2 > 1024 ? 1024 : i2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f3174h = (C[]) copyOf;
        }
        int i4 = this.f3177k + c4.f3172a;
        int[] iArr = this.f3176j;
        int length = iArr.length;
        if (i4 > length) {
            int i5 = length + (length > 1024 ? 1024 : length);
            if (i5 >= i4) {
                i4 = i5;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i4);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f3176j = copyOf2;
        }
        int i6 = this.f3179m;
        int i7 = c4.f3173b;
        int i8 = i6 + i7;
        Object[] objArr = this.f3178l;
        int length2 = objArr.length;
        if (i8 > length2) {
            int i9 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i9 >= i8) {
                i8 = i9;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i8);
            Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, newSize)");
            this.f3178l = copyOf3;
        }
        C[] cArr2 = this.f3174h;
        int i10 = this.f3175i;
        this.f3175i = i10 + 1;
        cArr2[i10] = c4;
        this.f3177k += c4.f3172a;
        this.f3179m += i7;
    }
}
