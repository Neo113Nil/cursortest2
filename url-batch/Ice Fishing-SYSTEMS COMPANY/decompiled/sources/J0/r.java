package J0;

import B2.J;
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
        return this.mWorkerParams.f5474f;
    }

    public J3.a getForegroundInfoAsync() {
        U0.k kVar = new U0.k();
        kVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f5469a;
    }

    public final h getInputData() {
        return this.mWorkerParams.f5470b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f5472d.f3965w;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f5473e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f5471c;
    }

    public V0.a getTaskExecutor() {
        return this.mWorkerParams.f5475g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f5472d.f3963u;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f5472d.f3964v;
    }

    public A getWorkerFactory() {
        return this.mWorkerParams.f5476h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final J3.a setForegroundAsync(j jVar) {
        T0.r rVar = this.mWorkerParams.f5477j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        rVar.getClass();
        U0.k kVar = new U0.k();
        rVar.f3078a.i(new T0.q(rVar, kVar, id, jVar, applicationContext));
        return kVar;
    }

    public J3.a setProgressAsync(h hVar) {
        T0.s sVar = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        sVar.getClass();
        U0.k kVar = new U0.k();
        sVar.f3083b.i(new J(sVar, id, hVar, kVar, 5, false));
        return kVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract J3.a startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
