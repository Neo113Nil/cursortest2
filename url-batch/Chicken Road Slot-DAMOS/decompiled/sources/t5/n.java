package t5;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class n {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public n(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            a1.e("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            a1.e("WorkerParameters is null");
            throw null;
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f763f;
    }

    public ListenableFuture getForegroundInfoAsync() {
        e6.j jVar = new e6.j();
        jVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f758a;
    }

    public final e getInputData() {
        return this.mWorkerParams.f759b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f761d.f7590r;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f762e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f760c;
    }

    public f6.a getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f761d.f7588e;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f761d.f7589i;
    }

    public w getWorkerFactory() {
        return this.mWorkerParams.f764h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final ListenableFuture setForegroundAsync(g gVar) {
        d6.s sVar = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        sVar.getClass();
        e6.j jVar = new e6.j();
        sVar.f3667a.a(new d6.r(sVar, jVar, id2, gVar, applicationContext, 0));
        return jVar;
    }

    public ListenableFuture setProgressAsync(e eVar) {
        d6.u uVar = this.mWorkerParams.f765i;
        getApplicationContext();
        UUID id2 = getId();
        uVar.getClass();
        e6.j jVar = new e6.j();
        uVar.f3677b.a(new d6.t(uVar, id2, eVar, jVar, 0));
        return jVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
