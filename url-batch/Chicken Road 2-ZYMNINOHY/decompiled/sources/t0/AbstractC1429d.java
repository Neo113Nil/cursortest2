package t0;

import T.C0097o;
import T.U;
import W.J;
import a.AbstractC0124a;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1429d implements t {

    /* renamed from: a, reason: collision with root package name */
    public final U f15280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15281b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f15282c;

    /* renamed from: d, reason: collision with root package name */
    public final C0097o[] f15283d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f15284e;

    /* renamed from: f, reason: collision with root package name */
    public int f15285f;

    public AbstractC1429d(U u4, int[] iArr) {
        int i4 = 0;
        AbstractC0124a.t(iArr.length > 0);
        u4.getClass();
        this.f15280a = u4;
        int length = iArr.length;
        this.f15281b = length;
        this.f15283d = new C0097o[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f15283d[i5] = u4.f2708d[iArr[i5]];
        }
        Arrays.sort(this.f15283d, new B.c(7));
        this.f15282c = new int[this.f15281b];
        while (true) {
            int i6 = this.f15281b;
            if (i4 >= i6) {
                this.f15284e = new long[i6];
                return;
            } else {
                this.f15282c[i4] = u4.a(this.f15283d[i4]);
                i4++;
            }
        }
    }

    @Override // t0.t
    public final boolean a(int i4, long j4) {
        return this.f15284e[i4] > j4;
    }

    @Override // t0.t
    public final int b(C0097o c0097o) {
        for (int i4 = 0; i4 < this.f15281b; i4++) {
            if (this.f15283d[i4] == c0097o) {
                return i4;
            }
        }
        return -1;
    }

    @Override // t0.t
    public final U c() {
        return this.f15280a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC1429d abstractC1429d = (AbstractC1429d) obj;
            if (this.f15280a.equals(abstractC1429d.f15280a) && Arrays.equals(this.f15282c, abstractC1429d.f15282c)) {
                return true;
            }
        }
        return false;
    }

    @Override // t0.t
    public final C0097o f(int i4) {
        return this.f15283d[i4];
    }

    @Override // t0.t
    public final int h(int i4) {
        return this.f15282c[i4];
    }

    public final int hashCode() {
        if (this.f15285f == 0) {
            this.f15285f = Arrays.hashCode(this.f15282c) + (System.identityHashCode(this.f15280a) * 31);
        }
        return this.f15285f;
    }

    @Override // t0.t
    public final int k() {
        return this.f15282c[d()];
    }

    @Override // t0.t
    public final C0097o l() {
        return this.f15283d[d()];
    }

    @Override // t0.t
    public final int length() {
        return this.f15282c.length;
    }

    @Override // t0.t
    public final boolean o(int i4, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a3 = a(i4, elapsedRealtime);
        int i5 = 0;
        while (i5 < this.f15281b && !a3) {
            a3 = (i5 == i4 || a(i5, elapsedRealtime)) ? false : true;
            i5++;
        }
        if (!a3) {
            return false;
        }
        long[] jArr = this.f15284e;
        jArr[i4] = Math.max(jArr[i4], J.a(elapsedRealtime, j4));
        return true;
    }

    @Override // t0.t
    public int t(List list, long j4) {
        return list.size();
    }

    @Override // t0.t
    public final int u(int i4) {
        for (int i5 = 0; i5 < this.f15281b; i5++) {
            if (this.f15282c[i5] == i4) {
                return i5;
            }
        }
        return -1;
    }

    @Override // t0.t
    public void g() {
    }

    @Override // t0.t
    public void i() {
    }

    @Override // t0.t
    public final void e(boolean z) {
    }

    @Override // t0.t
    public void p(float f4) {
    }
}
