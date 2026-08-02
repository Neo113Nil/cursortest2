package d0;

import T.C0085c;
import T.C0103v;
import T.C0107z;
import T.Q;
import T.S;
import T.T;
import W.J;
import a.AbstractC0124a;
import e0.C0391a;
import e0.C0393c;
import java.util.List;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378e extends T {

    /* renamed from: b, reason: collision with root package name */
    public final long f8118b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8119c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8120d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8121e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8122f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8123g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8124h;

    /* renamed from: i, reason: collision with root package name */
    public final C0393c f8125i;

    /* renamed from: j, reason: collision with root package name */
    public final C0107z f8126j;

    /* renamed from: k, reason: collision with root package name */
    public final C0103v f8127k;

    public C0378e(long j4, long j5, long j6, int i4, long j7, long j8, long j9, C0393c c0393c, C0107z c0107z, C0103v c0103v) {
        AbstractC0124a.t(c0393c.f8349d == (c0103v != null));
        this.f8118b = j4;
        this.f8119c = j5;
        this.f8120d = j6;
        this.f8121e = i4;
        this.f8122f = j7;
        this.f8123g = j8;
        this.f8124h = j9;
        this.f8125i = c0393c;
        this.f8126j = c0107z;
        this.f8127k = c0103v;
    }

    @Override // T.T
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f8121e) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // T.T
    public final Q f(int i4, Q q4, boolean z) {
        AbstractC0124a.m(i4, h());
        C0393c c0393c = this.f8125i;
        String str = z ? c0393c.b(i4).f8378a : null;
        Integer valueOf = z ? Integer.valueOf(this.f8121e + i4) : null;
        long d4 = c0393c.d(i4);
        long M4 = J.M(c0393c.b(i4).f8379b - c0393c.b(0).f8379b) - this.f8122f;
        q4.getClass();
        q4.h(str, valueOf, 0, d4, M4, C0085c.f2767c, false);
        return q4;
    }

    @Override // T.T
    public final int h() {
        return this.f8125i.f8358m.size();
    }

    @Override // T.T
    public final Object l(int i4) {
        AbstractC0124a.m(i4, h());
        return Integer.valueOf(this.f8121e + i4);
    }

    @Override // T.T
    public final S m(int i4, S s4, long j4) {
        boolean z;
        long j5;
        long j6;
        long j7;
        i c4;
        AbstractC0124a.m(i4, 1);
        C0393c c0393c = this.f8125i;
        boolean z4 = c0393c.f8349d;
        long j8 = this.f8124h;
        if (z4 && c0393c.f8350e != -9223372036854775807L && c0393c.f8347b == -9223372036854775807L) {
            long j9 = 0;
            if (j4 > 0) {
                j8 += j4;
                if (j8 > this.f8123g) {
                    z = true;
                    j6 = -9223372036854775807L;
                    j5 = -9223372036854775807L;
                    Object obj = S.f2688q;
                    s4.b(this.f8126j, c0393c, this.f8118b, this.f8119c, this.f8120d, true, (c0393c.f8349d || c0393c.f8350e == j5 || c0393c.f8347b != j5) ? false : z, this.f8127k, j6, this.f8123g, h() - 1, this.f8122f);
                    return s4;
                }
            }
            long j10 = this.f8122f + j8;
            long d4 = c0393c.d(0);
            int i5 = 0;
            while (i5 < c0393c.f8358m.size() - 1 && j10 >= d4) {
                j10 -= d4;
                i5++;
                d4 = c0393c.d(i5);
            }
            e0.h b4 = c0393c.b(i5);
            List list = b4.f8380c;
            z = true;
            int size = list.size();
            j5 = -9223372036854775807L;
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    j7 = j9;
                    i6 = -1;
                    break;
                }
                j7 = j9;
                if (((C0391a) list.get(i6)).f8337b == 2) {
                    break;
                }
                i6++;
                j9 = j7;
            }
            if (i6 != -1 && (c4 = ((e0.m) ((C0391a) b4.f8380c.get(i6)).f8338c.get(0)).c()) != null && c4.C(d4) != j7) {
                j8 = (c4.a(c4.p(j10, d4)) + j8) - j10;
            }
        } else {
            z = true;
            j5 = -9223372036854775807L;
        }
        j6 = j8;
        Object obj2 = S.f2688q;
        s4.b(this.f8126j, c0393c, this.f8118b, this.f8119c, this.f8120d, true, (c0393c.f8349d || c0393c.f8350e == j5 || c0393c.f8347b != j5) ? false : z, this.f8127k, j6, this.f8123g, h() - 1, this.f8122f);
        return s4;
    }

    @Override // T.T
    public final int o() {
        return 1;
    }
}
