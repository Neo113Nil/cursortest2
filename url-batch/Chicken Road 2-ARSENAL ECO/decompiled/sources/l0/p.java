package l0;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import l1.InterfaceFutureC0490a;
import x0.InterfaceC0725a;

/* loaded from: classes.dex */
public abstract class p {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public p(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f3556f;
    }

    public InterfaceFutureC0490a getForegroundInfoAsync() {
        w0.j jVar = new w0.j();
        jVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f3551a;
    }

    public final g getInputData() {
        return this.mWorkerParams.f3552b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f3554d.f71g;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f3555e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f3553c;
    }

    public InterfaceC0725a getTaskExecutor() {
        return this.mWorkerParams.f3557g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f3554d.f72h;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f3554d.f73i;
    }

    public y getWorkerFactory() {
        return this.mWorkerParams.f3558h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final InterfaceFutureC0490a setForegroundAsync(i iVar) {
        v0.q qVar = this.mWorkerParams.f3560j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        qVar.getClass();
        w0.j jVar = new w0.j();
        qVar.f6093a.a(new v0.p(qVar, jVar, id, iVar, applicationContext));
        return jVar;
    }

    public InterfaceFutureC0490a setProgressAsync(g gVar) {
        v0.r rVar = this.mWorkerParams.f3559i;
        getApplicationContext();
        UUID id = getId();
        rVar.getClass();
        w0.j jVar = new w0.j();
        rVar.f6098b.a(new j.e(rVar, id, gVar, jVar, 1));
        return jVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract InterfaceFutureC0490a startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
