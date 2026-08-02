package q0;

import a.AbstractC0124a;
import java.util.List;

/* renamed from: q0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1372n implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final v2.a0 f15047a;

    /* renamed from: b, reason: collision with root package name */
    public long f15048b;

    public C1372n(List list, List list2) {
        v2.F j4 = v2.I.j();
        AbstractC0124a.h(list.size() == list2.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            j4.b(new C1371m((d0) list.get(i4), (List) list2.get(i4)));
        }
        this.f15047a = j4.f();
        this.f15048b = -9223372036854775807L;
    }

    @Override // q0.d0
    public final long e() {
        int i4 = 0;
        long j4 = Long.MAX_VALUE;
        while (true) {
            v2.a0 a0Var = this.f15047a;
            if (i4 >= a0Var.f15607d) {
                break;
            }
            long e4 = ((C1371m) a0Var.get(i4)).f15045a.e();
            if (e4 != Long.MIN_VALUE) {
                j4 = Math.min(j4, e4);
            }
            i4++;
        }
        if (j4 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // q0.d0
    public final boolean l() {
        int i4 = 0;
        while (true) {
            v2.a0 a0Var = this.f15047a;
            if (i4 >= a0Var.f15607d) {
                return false;
            }
            if (((C1371m) a0Var.get(i4)).f15045a.l()) {
                return true;
            }
            i4++;
        }
    }

    @Override // q0.d0
    public final long u() {
        int i4 = 0;
        long j4 = Long.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        while (true) {
            v2.a0 a0Var = this.f15047a;
            if (i4 >= a0Var.f15607d) {
                break;
            }
            C1371m c1371m = (C1371m) a0Var.get(i4);
            long u4 = c1371m.f15045a.u();
            v2.I i5 = c1371m.f15046b;
            if ((i5.contains(1) || i5.contains(2) || i5.contains(4)) && u4 != Long.MIN_VALUE) {
                j4 = Math.min(j4, u4);
            }
            if (u4 != Long.MIN_VALUE) {
                j5 = Math.min(j5, u4);
            }
            i4++;
        }
        if (j4 != Long.MAX_VALUE) {
            this.f15048b = j4;
            return j4;
        }
        if (j5 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j6 = this.f15048b;
        return j6 != -9223372036854775807L ? j6 : j5;
    }

    @Override // q0.d0
    public final boolean v(a0.Q q4) {
        boolean z;
        boolean z4 = false;
        do {
            long e4 = e();
            if (e4 == Long.MIN_VALUE) {
                return z4;
            }
            int i4 = 0;
            z = false;
            while (true) {
                v2.a0 a0Var = this.f15047a;
                if (i4 >= a0Var.f15607d) {
                    break;
                }
                long e5 = ((C1371m) a0Var.get(i4)).f15045a.e();
                boolean z5 = e5 != Long.MIN_VALUE && e5 <= q4.f3985a;
                if (e5 == e4 || z5) {
                    z |= ((C1371m) a0Var.get(i4)).f15045a.v(q4);
                }
                i4++;
            }
            z4 |= z;
        } while (z);
        return z4;
    }

    @Override // q0.d0
    public final void w(long j4) {
        int i4 = 0;
        while (true) {
            v2.a0 a0Var = this.f15047a;
            if (i4 >= a0Var.f15607d) {
                return;
            }
            ((C1371m) a0Var.get(i4)).w(j4);
            i4++;
        }
    }
}
