package androidx.work.impl.workers;

import a4.j;
import android.content.Context;
import androidx.lifecycle.d0;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import g6.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import t5.n;
import t5.o;
import y5.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Lt5/n;", "Ly5/b;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, j.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends n implements b {

    /* renamed from: d, reason: collision with root package name */
    public final WorkerParameters f789d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f790e;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f791i;

    /* renamed from: r, reason: collision with root package name */
    public final e6.j f792r;

    /* renamed from: s, reason: collision with root package name */
    public n f793s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f789d = workerParameters;
        this.f790e = new Object();
        this.f792r = new e6.j();
    }

    @Override // y5.b
    public final void b(ArrayList arrayList) {
        arrayList.getClass();
        o.d().a(a.f4274a, "Constraints changed for " + arrayList);
        synchronized (this.f790e) {
            this.f791i = true;
        }
    }

    @Override // t5.n
    public final void onStopped() {
        n nVar = this.f793s;
        if (nVar == null || nVar.isStopped()) {
            return;
        }
        nVar.stop();
    }

    @Override // t5.n
    public final ListenableFuture startWork() {
        getBackgroundExecutor().execute(new d0(14, this));
        e6.j jVar = this.f792r;
        jVar.getClass();
        return jVar;
    }

    @Override // y5.b
    public final void c(List list) {
    }
}
