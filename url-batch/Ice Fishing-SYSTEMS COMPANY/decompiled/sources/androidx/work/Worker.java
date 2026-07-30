package androidx.work;

import B2.RunnableC0272f;
import F3.C;
import J0.j;
import J0.q;
import J0.r;
import J3.a;
import U0.k;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class Worker extends r {

    /* renamed from: n, reason: collision with root package name */
    public k f5468n;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract q doWork();

    public j getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // J0.r
    public a getForegroundInfoAsync() {
        k kVar = new k();
        getBackgroundExecutor().execute(new RunnableC0272f(this, kVar, 6, false));
        return kVar;
    }

    @Override // J0.r
    public final a startWork() {
        this.f5468n = new k();
        getBackgroundExecutor().execute(new C(2, this));
        return this.f5468n;
    }
}
