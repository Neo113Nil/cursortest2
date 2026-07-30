package G0;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class r {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public r(Context context, WorkerParameters workerParameters) {
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
        return this.mWorkerParams.f4087f;
    }

    public O1.a getForegroundInfoAsync() {
        R0.k kVar = new R0.k();
        kVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f4082a;
    }

    public final h getInputData() {
        return this.mWorkerParams.f4083b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f4085d.f332l;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f4086e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f4084c;
    }

    public S0.a getTaskExecutor() {
        return this.mWorkerParams.f4088g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f4085d.f330e;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f4085d.f331i;
    }

    public D getWorkerFactory() {
        return this.mWorkerParams.f4089h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final O1.a setForegroundAsync(j jVar) {
        Q0.s sVar = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        sVar.getClass();
        R0.k kVar = new R0.k();
        sVar.f2334a.r(new Q0.r(sVar, kVar, id, jVar, applicationContext));
        return kVar;
    }

    public O1.a setProgressAsync(h hVar) {
        Q0.u uVar = this.mWorkerParams.f4090i;
        getApplicationContext();
        UUID id = getId();
        uVar.getClass();
        R0.k kVar = new R0.k();
        uVar.f2344b.r(new Q0.t(uVar, id, hVar, kVar, 0));
        return kVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract O1.a startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
