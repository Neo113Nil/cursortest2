package androidx.work.impl.workers;

import B2.b;
import D0.k;
import F0.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import s0.r;
import s0.s;
import x0.InterfaceC1536b;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends r implements InterfaceC1536b {

    /* renamed from: a, reason: collision with root package name */
    public final WorkerParameters f4752a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4753b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f4754c;

    /* renamed from: d, reason: collision with root package name */
    public final k f4755d;

    /* renamed from: e, reason: collision with root package name */
    public r f4756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        i.e(appContext, "appContext");
        i.e(workerParameters, "workerParameters");
        this.f4752a = workerParameters;
        this.f4753b = new Object();
        this.f4755d = new k();
    }

    @Override // x0.InterfaceC1536b
    public final void b(ArrayList workSpecs) {
        i.e(workSpecs, "workSpecs");
        s.d().a(a.f672a, "Constraints changed for " + workSpecs);
        synchronized (this.f4753b) {
            this.f4754c = true;
        }
    }

    @Override // x0.InterfaceC1536b
    public final void c(List list) {
    }

    @Override // s0.r
    public final void onStopped() {
        r rVar = this.f4756e;
        if (rVar == null || rVar.isStopped()) {
            return;
        }
        rVar.stop();
    }

    @Override // s0.r
    public final J1.a startWork() {
        getBackgroundExecutor().execute(new b(1, this));
        k future = this.f4755d;
        i.d(future, "future");
        return future;
    }
}
