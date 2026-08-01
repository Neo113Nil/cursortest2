package s7;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m1 extends FutureTask implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f8841d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8842e;

    /* renamed from: i, reason: collision with root package name */
    public final String f8843i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o1 f8844r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(o1 o1Var, Callable callable, boolean z10) {
        super(callable);
        this.f8844r = o1Var;
        long andIncrement = o1.f8895y.getAndIncrement();
        this.f8841d = andIncrement;
        this.f8843i = "Task exception on worker thread";
        this.f8842e = z10;
        if (andIncrement == Long.MAX_VALUE) {
            v0 v0Var = ((q1) o1Var.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9050t.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m1 m1Var = (m1) obj;
        boolean z10 = m1Var.f8842e;
        boolean z11 = this.f8842e;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j = m1Var.f8841d;
        long j3 = this.f8841d;
        if (j3 < j) {
            return -1;
        }
        if (j3 > j) {
            return 1;
        }
        v0 v0Var = ((q1) this.f8844r.f1478d).f8937t;
        q1.l(v0Var);
        v0Var.f9051u.b(Long.valueOf(j3), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        v0 v0Var = ((q1) this.f8844r.f1478d).f8937t;
        q1.l(v0Var);
        v0Var.f9050t.b(th, this.f8843i);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(o1 o1Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.f8844r = o1Var;
        long andIncrement = o1.f8895y.getAndIncrement();
        this.f8841d = andIncrement;
        this.f8843i = str;
        this.f8842e = z10;
        if (andIncrement == Long.MAX_VALUE) {
            v0 v0Var = ((q1) o1Var.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9050t.a("Tasks index overflow");
        }
    }
}
