package m2;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import o2.m0;
import r0.s1;
import t1.x0;

/* loaded from: classes.dex */
public abstract class c implements t {

    /* renamed from: a, reason: collision with root package name */
    protected final x0 f18978a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f18979b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f18980c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18981d;

    /* renamed from: e, reason: collision with root package name */
    private final s1[] f18982e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f18983f;

    /* renamed from: g, reason: collision with root package name */
    private int f18984g;

    public c(x0 x0Var, int... iArr) {
        this(x0Var, iArr, 0);
    }

    public c(x0 x0Var, int[] iArr, int i7) {
        int i8 = 0;
        o2.a.f(iArr.length > 0);
        this.f18981d = i7;
        this.f18978a = (x0) o2.a.e(x0Var);
        int length = iArr.length;
        this.f18979b = length;
        this.f18982e = new s1[length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.f18982e[i9] = x0Var.b(iArr[i9]);
        }
        Arrays.sort(this.f18982e, new Comparator() { // from class: m2.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w6;
                w6 = c.w((s1) obj, (s1) obj2);
                return w6;
            }
        });
        this.f18980c = new int[this.f18979b];
        while (true) {
            int i10 = this.f18979b;
            if (i8 >= i10) {
                this.f18983f = new long[i10];
                return;
            } else {
                this.f18980c[i8] = x0Var.c(this.f18982e[i8]);
                i8++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int w(s1 s1Var, s1 s1Var2) {
        return s1Var2.f20952m - s1Var.f20952m;
    }

    @Override // m2.w
    public final s1 a(int i7) {
        return this.f18982e[i7];
    }

    @Override // m2.w
    public final int b(int i7) {
        return this.f18980c[i7];
    }

    @Override // m2.w
    public final x0 c() {
        return this.f18978a;
    }

    @Override // m2.w
    public final int d(s1 s1Var) {
        for (int i7 = 0; i7 < this.f18979b; i7++) {
            if (this.f18982e[i7] == s1Var) {
                return i7;
            }
        }
        return -1;
    }

    @Override // m2.w
    public final int e(int i7) {
        for (int i8 = 0; i8 < this.f18979b; i8++) {
            if (this.f18980c[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f18978a == cVar.f18978a && Arrays.equals(this.f18980c, cVar.f18980c);
    }

    @Override // m2.t
    public void g() {
    }

    @Override // m2.t
    public boolean h(int i7, long j7) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean i8 = i(i7, elapsedRealtime);
        int i9 = 0;
        while (i9 < this.f18979b && !i8) {
            i8 = (i9 == i7 || i(i9, elapsedRealtime)) ? false : true;
            i9++;
        }
        if (!i8) {
            return false;
        }
        long[] jArr = this.f18983f;
        jArr[i7] = Math.max(jArr[i7], m0.b(elapsedRealtime, j7, Long.MAX_VALUE));
        return true;
    }

    public int hashCode() {
        if (this.f18984g == 0) {
            this.f18984g = (System.identityHashCode(this.f18978a) * 31) + Arrays.hashCode(this.f18980c);
        }
        return this.f18984g;
    }

    @Override // m2.t
    public boolean i(int i7, long j7) {
        return this.f18983f[i7] > j7;
    }

    @Override // m2.t
    public /* synthetic */ void j(boolean z6) {
        s.b(this, z6);
    }

    @Override // m2.t
    public void k() {
    }

    @Override // m2.t
    public int l(long j7, List<? extends v1.n> list) {
        return list.size();
    }

    @Override // m2.w
    public final int length() {
        return this.f18980c.length;
    }

    @Override // m2.t
    public /* synthetic */ boolean n(long j7, v1.f fVar, List list) {
        return s.d(this, j7, fVar, list);
    }

    @Override // m2.t
    public final int o() {
        return this.f18980c[r()];
    }

    @Override // m2.t
    public final s1 p() {
        return this.f18982e[r()];
    }

    @Override // m2.t
    public void s(float f7) {
    }

    @Override // m2.t
    public /* synthetic */ void u() {
        s.a(this);
    }

    @Override // m2.t
    public /* synthetic */ void v() {
        s.c(this);
    }
}
