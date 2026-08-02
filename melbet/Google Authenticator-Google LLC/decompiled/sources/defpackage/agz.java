package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agz extends aha {
    public volatile agy a;
    public volatile agy b;
    public List c;
    private Executor k;

    public agz(Context context) {
        super(context.getApplicationContext());
    }

    public final void a() {
        if (this.b != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.k == null) {
            this.k = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        agy agyVar = this.a;
        Executor executor = this.k;
        if (agyVar.f == 1) {
            agyVar.f = 2;
            executor.execute(agyVar.c);
            return;
        }
        int i = agyVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void b(List list) {
        this.c = list;
        agu aguVar = this.j;
        if (aguVar != null) {
            if (agt.b(2)) {
                Objects.toString(aguVar);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                aguVar.i(list);
            } else {
                aguVar.k(list);
            }
        }
    }

    final void c(agy agyVar) {
        if (this.b == agyVar) {
            SystemClock.uptimeMillis();
            this.b = null;
            a();
        }
    }

    @Override // defpackage.aha
    public final void d() {
        if (this.a != null) {
            if (!this.f) {
                this.i = true;
            }
            agy agyVar = this.b;
            agy agyVar2 = this.a;
            if (agyVar != null) {
                boolean z = agyVar2.a;
            } else {
                boolean z2 = agyVar2.a;
                agy agyVar3 = this.a;
                agyVar3.d.set(true);
                if (agyVar3.c.cancel(false)) {
                    this.b = this.a;
                }
            }
            this.a = null;
        }
    }
}
