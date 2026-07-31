package I;

import j.C0498p;
import java.util.ArrayList;

/* renamed from: I.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108m0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2277a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2278b;

    /* renamed from: c, reason: collision with root package name */
    public int f2279c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2280d;

    /* renamed from: e, reason: collision with root package name */
    public final C0498p f2281e;

    /* renamed from: f, reason: collision with root package name */
    public final L1.o f2282f;

    public C0108m0(int i3, ArrayList arrayList) {
        this.f2277a = arrayList;
        this.f2278b = i3;
        if (!(i3 >= 0)) {
            C0089d.R("Invalid start index");
            throw null;
        }
        this.f2280d = new ArrayList();
        C0498p c0498p = new C0498p();
        int size = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            S s3 = (S) this.f2277a.get(i5);
            int i6 = s3.f2193c;
            int i7 = s3.f2194d;
            c0498p.i(i6, new L(i5, i4, i7));
            i4 += i7;
        }
        this.f2281e = c0498p;
        this.f2282f = I2.d.F(new A2.l(8, this));
    }

    public final boolean a(int i3, int i4) {
        int i5;
        C0498p c0498p = this.f2281e;
        L l3 = (L) c0498p.f(i3);
        if (l3 == null) {
            return false;
        }
        int i6 = l3.f2160b;
        int i7 = i4 - l3.f2161c;
        l3.f2161c = i4;
        if (i7 == 0) {
            return true;
        }
        Object[] objArr = c0498p.f5186c;
        long[] jArr = c0498p.f5184a;
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
                        L l4 = (L) objArr[(i8 << 3) + i10];
                        if (l4.f2160b >= i6 && !l4.equals(l3) && (i5 = l4.f2160b + i7) >= 0) {
                            l4.f2160b = i5;
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
