package androidx.work;

import F.b;
import G0.p;
import G0.r;
import O1.a;
import R0.k;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class Worker extends r {

    /* renamed from: d, reason: collision with root package name */
    public k f4081d;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract p a();

    @Override // G0.r
    public final a getForegroundInfoAsync() {
        k kVar = new k();
        getBackgroundExecutor().execute(new F.a(3, this, kVar, false));
        return kVar;
    }

    @Override // G0.r
    public final a startWork() {
        this.f4081d = new k();
        getBackgroundExecutor().execute(new b(1, this));
        return this.f4081d;
    }
}
