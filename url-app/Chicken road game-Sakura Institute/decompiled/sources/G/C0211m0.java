package G;

import java.util.ArrayList;
import y2.C1336k;
import y2.InterfaceC1335j;

/* renamed from: G.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211m0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2830a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2831b;

    /* renamed from: c, reason: collision with root package name */
    public int f2832c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2833d;

    /* renamed from: e, reason: collision with root package name */
    public final i.q f2834e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1335j f2835f;

    public C0211m0(int i2, ArrayList arrayList) {
        this.f2830a = arrayList;
        this.f2831b = i2;
        if (!(i2 >= 0)) {
            C0192d.S("Invalid start index");
            throw null;
        }
        this.f2833d = new ArrayList();
        i.q qVar = new i.q();
        int size = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Q q2 = (Q) this.f2830a.get(i5);
            int i6 = q2.f2742c;
            int i7 = q2.f2743d;
            qVar.i(i6, new K(i5, i4, i7));
            i4 += i7;
        }
        this.f2834e = qVar;
        this.f2835f = C1336k.a(new A3.e(3, this));
    }

    public final boolean a(int i2, int i4) {
        int i5;
        i.q qVar = this.f2834e;
        K k4 = (K) qVar.f(i2);
        if (k4 == null) {
            return false;
        }
        int i6 = k4.f2713b;
        int i7 = i4 - k4.f2714c;
        k4.f2714c = i4;
        if (i7 == 0) {
            return true;
        }
        Object[] objArr = qVar.f6942c;
        long[] jArr = qVar.f6940a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i8 = 0;
        while (true) {
            long j4 = jArr[i8];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j4) < 128) {
                        K k5 = (K) objArr[(i8 << 3) + i10];
                        if (k5.f2713b >= i6 && !k5.equals(k4) && (i5 = k5.f2713b + i7) >= 0) {
                            k5.f2713b = i5;
                        }
                    }
                    j4 >>= 8;
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
