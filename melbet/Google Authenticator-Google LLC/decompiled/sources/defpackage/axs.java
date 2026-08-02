package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axs {
    public final String a;
    public final atb b;
    public final asa c;
    public final long d;
    public final long e;
    public final long f;
    public final ary g;
    public final int h;
    public final art i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final String q;
    public final List r;

    public axs(String str, atb atbVar, asa asaVar, long j, long j2, long j3, ary aryVar, int i, art artVar, long j4, long j5, int i2, int i3, long j6, int i4, List list, String str2, List list2) {
        atbVar.getClass();
        asaVar.getClass();
        artVar.getClass();
        this.a = str;
        this.b = atbVar;
        this.c = asaVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = aryVar;
        this.h = i;
        this.i = artVar;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = str2;
        this.r = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axs)) {
            return false;
        }
        axs axsVar = (axs) obj;
        return ksp.b(this.a, axsVar.a) && this.b == axsVar.b && ksp.b(this.c, axsVar.c) && this.d == axsVar.d && this.e == axsVar.e && this.f == axsVar.f && ksp.b(this.g, axsVar.g) && this.h == axsVar.h && this.i == axsVar.i && this.j == axsVar.j && this.k == axsVar.k && this.l == axsVar.l && this.m == axsVar.m && this.n == axsVar.n && this.o == axsVar.o && ksp.b(this.p, axsVar.p) && ksp.b(this.q, axsVar.q) && ksp.b(this.r, axsVar.r);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ary aryVar = this.g;
        long j = this.f;
        int k = (((((((((((hashCode * 31) + aei.k(this.d)) * 31) + aei.k(this.e)) * 31) + aei.k(j)) * 31) + aryVar.hashCode()) * 31) + this.h) * 31) + this.i.hashCode();
        List list = this.p;
        long j2 = this.n;
        return (((((((((((((((((k * 31) + aei.k(this.j)) * 31) + aei.k(this.k)) * 31) + this.l) * 31) + this.m) * 31) + aei.k(j2)) * 31) + this.o) * 31) + list.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", workerClassName=" + this.q + ", progress=" + this.r + ")";
    }
}
