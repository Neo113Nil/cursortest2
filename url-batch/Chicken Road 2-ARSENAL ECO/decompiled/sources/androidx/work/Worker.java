package androidx.work;

import A.a;
import A.b;
import android.content.Context;
import l0.n;
import l0.p;
import l1.InterfaceFutureC0490a;
import w0.j;

/* loaded from: classes.dex */
public abstract class Worker extends p {

    /* renamed from: f, reason: collision with root package name */
    public j f3550f;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract n a();

    @Override // l0.p
    public final InterfaceFutureC0490a getForegroundInfoAsync() {
        j jVar = new j();
        getBackgroundExecutor().execute(new a(this, jVar, 21, false));
        return jVar;
    }

    @Override // l0.p
    public final InterfaceFutureC0490a startWork() {
        this.f3550f = new j();
        getBackgroundExecutor().execute(new b(18, this));
        return this.f3550f;
    }
}
