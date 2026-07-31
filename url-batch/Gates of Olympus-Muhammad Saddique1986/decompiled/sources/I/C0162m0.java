package I;

import j.C0542p;
import java.util.ArrayList;

/* renamed from: I.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162m0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2834a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2835b;

    /* renamed from: c, reason: collision with root package name */
    public int f2836c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2837d;

    /* renamed from: e, reason: collision with root package name */
    public final C0542p f2838e;

    /* renamed from: f, reason: collision with root package name */
    public final R1.n f2839f;

    public C0162m0(int i3, ArrayList arrayList) {
        this.f2834a = arrayList;
        this.f2835b = i3;
        if (!(i3 >= 0)) {
            C0143d.S("Invalid start index");
            throw null;
        }
        this.f2837d = new ArrayList();
        C0542p c0542p = new C0542p();
        int size = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Q q3 = (Q) this.f2834a.get(i5);
            int i6 = q3.f2744c;
            int i7 = q3.f2745d;
            c0542p.i(i6, new K(i5, i4, i7));
            i4 += i7;
        }
        this.f2838e = c0542p;
        this.f2839f = R1.a.d(new A.h(7, this));
    }

    public final boolean a(int i3, int i4) {
        int i5;
        C0542p c0542p = this.f2838e;
        K k3 = (K) c0542p.f(i3);
        if (k3 == null) {
            return false;
        }
        int i6 = k3.f2715b;
        int i7 = i4 - k3.f2716c;
        k3.f2716c = i4;
        if (i7 == 0) {
            return true;
        }
        Object[] objArr = c0542p.f6304c;
        long[] jArr = c0542p.f6302a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i8 = 0;
        while (true) {
            long j3 = jArr[i8];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j3) < 128) {
                        K k4 = (K) objArr[(i8 << 3) + i10];
                        if (k4.f2715b >= i6 && !k4.equals(k3) && (i5 = k4.f2715b + i7) >= 0) {
                            k4.f2715b = i5;
                        }
                    }
                    j3 >>= 8;
                }
                if (i9 != 8) {
                    return true;
                }
            }
            if (i8 == length) {
                return true;
            }
            i8++;
        }
    }
}
