package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ij3 extends FutureTask implements Comparable {
    public final long m;
    public final boolean n;
    public final String o;
    public final /* synthetic */ lj3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij3(lj3 lj3Var, Callable callable, boolean z) {
        super(callable);
        this.p = lj3Var;
        long andIncrement = lj3.w.getAndIncrement();
        this.m = andIncrement;
        this.o = "Task exception on worker thread";
        this.n = z;
        if (andIncrement == Long.MAX_VALUE) {
            vh3 vh3Var = ((pj3) lj3Var.m).r;
            pj3.m(vh3Var);
            vh3Var.r.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ij3 ij3Var = (ij3) obj;
        boolean z = ij3Var.n;
        boolean z2 = this.n;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = ij3Var.m;
        long j2 = this.m;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        vh3 vh3Var = ((pj3) this.p.m).r;
        pj3.m(vh3Var);
        vh3Var.s.c(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        vh3 vh3Var = ((pj3) this.p.m).r;
        pj3.m(vh3Var);
        vh3Var.r.c(th, this.o);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij3(lj3 lj3Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.p = lj3Var;
        long andIncrement = lj3.w.getAndIncrement();
        this.m = andIncrement;
        this.o = str;
        this.n = z;
        if (andIncrement == Long.MAX_VALUE) {
            vh3 vh3Var = ((pj3) lj3Var.m).r;
            pj3.m(vh3Var);
            vh3Var.r.b("Tasks index overflow");
        }
    }
}
