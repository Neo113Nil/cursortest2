package androidx.work.impl.workers;

import H1.RunnableC0139m;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import l0.p;
import l0.q;
import l1.InterfaceFutureC0490a;
import q0.InterfaceC0594b;
import w0.j;
import y0.AbstractC0755a;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends p implements InterfaceC0594b {

    /* renamed from: f, reason: collision with root package name */
    public final WorkerParameters f3594f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3595g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f3596h;

    /* renamed from: i, reason: collision with root package name */
    public final j f3597i;

    /* renamed from: j, reason: collision with root package name */
    public p f3598j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        i.e(appContext, "appContext");
        i.e(workerParameters, "workerParameters");
        this.f3594f = workerParameters;
        this.f3595g = new Object();
        this.f3597i = new j();
    }

    @Override // q0.InterfaceC0594b
    public final void c(ArrayList workSpecs) {
        i.e(workSpecs, "workSpecs");
        q.d().a(AbstractC0755a.f6223a, "Constraints changed for " + workSpecs);
        synchronized (this.f3595g) {
            this.f3596h = true;
        }
    }

    @Override // q0.InterfaceC0594b
    public final void d(List list) {
    }

    @Override // l0.p
    public final void onStopped() {
        p pVar = this.f3598j;
        if (pVar == null || pVar.isStopped()) {
            return;
        }
        pVar.stop();
    }

    @Override // l0.p
    public final InterfaceFutureC0490a startWork() {
        getBackgroundExecutor().execute(new RunnableC0139m(17, this));
        j future = this.f3597i;
        i.d(future, "future");
        return future;
    }
}
