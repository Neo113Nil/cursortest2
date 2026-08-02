package t0;

import T.C0097o;
import T.U;
import W.AbstractC0108a;
import W.D;
import W.J;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import v2.F;
import v2.I;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1428c extends AbstractC1429d {

    /* renamed from: g, reason: collision with root package name */
    public final u0.d f15267g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15268h;

    /* renamed from: i, reason: collision with root package name */
    public final long f15269i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15270j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15271k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15272l;

    /* renamed from: m, reason: collision with root package name */
    public final float f15273m;
    public final float n;
    public final I o;

    /* renamed from: p, reason: collision with root package name */
    public final D f15274p;

    /* renamed from: q, reason: collision with root package name */
    public float f15275q;

    /* renamed from: r, reason: collision with root package name */
    public int f15276r;

    /* renamed from: s, reason: collision with root package name */
    public int f15277s;

    /* renamed from: t, reason: collision with root package name */
    public long f15278t;

    /* renamed from: u, reason: collision with root package name */
    public r0.m f15279u;

    public C1428c(U u4, int[] iArr, u0.d dVar, long j4, long j5, long j6, I i4) {
        super(u4, iArr);
        if (j6 < j4) {
            AbstractC0108a.s("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j6 = j4;
        }
        this.f15267g = dVar;
        this.f15268h = j4 * 1000;
        this.f15269i = j5 * 1000;
        this.f15270j = j6 * 1000;
        this.f15271k = 1279;
        this.f15272l = 719;
        this.f15273m = 0.7f;
        this.n = 0.75f;
        this.o = I.k(i4);
        this.f15274p = D.f3254a;
        this.f15275q = 1.0f;
        this.f15277s = 0;
        this.f15278t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j4 = 0;
        for (long j5 : jArr) {
            j4 += j5;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            F f4 = (F) arrayList.get(i4);
            if (f4 != null) {
                f4.b(new C1426a(j4, jArr[i4]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            r0.m mVar = (r0.m) v2.r.j(list);
            long j4 = mVar.f15144g;
            if (j4 != -9223372036854775807L) {
                long j5 = mVar.f15145h;
                if (j5 != -9223372036854775807L) {
                    return j5 - j4;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // t0.t
    public final int d() {
        return this.f15276r;
    }

    @Override // t0.AbstractC1429d, t0.t
    public final void g() {
        this.f15278t = -9223372036854775807L;
        this.f15279u = null;
    }

    @Override // t0.AbstractC1429d, t0.t
    public final void i() {
        this.f15279u = null;
    }

    @Override // t0.t
    public final void j(long j4, long j5, long j6, List list, r0.n[] nVarArr) {
        long x4;
        this.f15274p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i4 = this.f15276r;
        if (i4 >= nVarArr.length || !nVarArr[i4].next()) {
            int length = nVarArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    x4 = x(list);
                    break;
                }
                r0.n nVar = nVarArr[i5];
                if (nVar.next()) {
                    x4 = nVar.e() - nVar.c();
                    break;
                }
                i5++;
            }
        } else {
            r0.n nVar2 = nVarArr[this.f15276r];
            x4 = nVar2.e() - nVar2.c();
        }
        int i6 = this.f15277s;
        if (i6 == 0) {
            this.f15277s = 1;
            this.f15276r = w(elapsedRealtime);
            return;
        }
        int i7 = this.f15276r;
        int b4 = list.isEmpty() ? -1 : b(((r0.m) v2.r.j(list)).f15141d);
        if (b4 != -1) {
            i6 = ((r0.m) v2.r.j(list)).f15142e;
            i7 = b4;
        }
        int w4 = w(elapsedRealtime);
        if (w4 != i7 && !a(i7, elapsedRealtime)) {
            C0097o[] c0097oArr = this.f15283d;
            C0097o c0097o = c0097oArr[i7];
            C0097o c0097o2 = c0097oArr[w4];
            long j7 = this.f15268h;
            if (j6 != -9223372036854775807L) {
                j7 = Math.min((long) ((x4 != -9223372036854775807L ? j6 - x4 : j6) * this.n), j7);
            }
            int i8 = c0097o2.f2865j;
            int i9 = c0097o.f2865j;
            if ((i8 > i9 && j5 < j7) || (i8 < i9 && j5 >= this.f15269i)) {
                w4 = i7;
            }
        }
        if (w4 != i7) {
            i6 = 3;
        }
        this.f15277s = i6;
        this.f15276r = w4;
    }

    @Override // t0.t
    public final int m() {
        return this.f15277s;
    }

    @Override // t0.AbstractC1429d, t0.t
    public final void p(float f4) {
        this.f15275q = f4;
    }

    @Override // t0.t
    public final Object q() {
        return null;
    }

    @Override // t0.AbstractC1429d, t0.t
    public final int t(List list, long j4) {
        int i4;
        int i5;
        this.f15274p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = this.f15278t;
        if (j5 != -9223372036854775807L && elapsedRealtime - j5 < 1000 && (list.isEmpty() || ((r0.m) v2.r.j(list)).equals(this.f15279u))) {
            return list.size();
        }
        this.f15278t = elapsedRealtime;
        this.f15279u = list.isEmpty() ? null : (r0.m) v2.r.j(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long C4 = J.C(((r0.m) list.get(size - 1)).f15144g - j4, this.f15275q);
        long j6 = this.f15270j;
        if (C4 >= j6) {
            x(list);
            C0097o c0097o = this.f15283d[w(elapsedRealtime)];
            for (int i6 = 0; i6 < size; i6++) {
                r0.m mVar = (r0.m) list.get(i6);
                C0097o c0097o2 = mVar.f15141d;
                if (J.C(mVar.f15144g - j4, this.f15275q) >= j6 && c0097o2.f2865j < c0097o.f2865j && (i4 = c0097o2.v) != -1 && i4 <= this.f15272l && (i5 = c0097o2.f2874u) != -1 && i5 <= this.f15271k && i4 < c0097o.v) {
                    return i6;
                }
            }
        }
        return size;
    }

    public final int w(long j4) {
        long j5;
        u0.g gVar = (u0.g) this.f15267g;
        synchronized (gVar) {
            j5 = gVar.f15465l;
        }
        long j6 = (long) (j5 * this.f15273m);
        this.f15267g.getClass();
        long j7 = (long) (j6 / this.f15275q);
        if (!this.o.isEmpty()) {
            int i4 = 1;
            while (i4 < this.o.size() - 1 && ((C1426a) this.o.get(i4)).f15264a < j7) {
                i4++;
            }
            C1426a c1426a = (C1426a) this.o.get(i4 - 1);
            C1426a c1426a2 = (C1426a) this.o.get(i4);
            long j8 = c1426a.f15264a;
            long j9 = c1426a.f15265b;
            j7 = j9 + ((long) (((j7 - j8) / (c1426a2.f15264a - j8)) * (c1426a2.f15265b - j9)));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f15281b; i6++) {
            if (j4 == Long.MIN_VALUE || !a(i6, j4)) {
                if (this.f15283d[i6].f2865j <= j7) {
                    return i6;
                }
                i5 = i6;
            }
        }
        return i5;
    }
}
