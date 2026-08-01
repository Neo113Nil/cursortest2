package androidx.work;

import android.content.Context;
import b7.k;
import com.google.common.util.concurrent.ListenableFuture;
import e6.j;
import t5.l;
import t5.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class Worker extends n {

    /* renamed from: d, reason: collision with root package name */
    public j f757d;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract l a();

    @Override // t5.n
    public final ListenableFuture getForegroundInfoAsync() {
        j jVar = new j();
        getBackgroundExecutor().execute(new k(this, jVar));
        return jVar;
    }

    @Override // t5.n
    public final ListenableFuture startWork() {
        this.f757d = new j();
        getBackgroundExecutor().execute(new k(20, this));
        return this.f757d;
    }
}
