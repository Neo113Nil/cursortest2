package androidx.work.impl.workers;

import G0.r;
import G0.s;
import L0.b;
import R0.k;
import T0.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends r implements b {

    /* renamed from: d, reason: collision with root package name */
    public final WorkerParameters f4123d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4124e;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f4125i;

    /* renamed from: l, reason: collision with root package name */
    public final k f4126l;

    /* renamed from: m, reason: collision with root package name */
    public r f4127m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f4123d = workerParameters;
        this.f4124e = new Object();
        this.f4126l = new k();
    }

    @Override // L0.b
    public final void b(ArrayList workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        s.d().a(a.f2561a, "Constraints changed for " + workSpecs);
        synchronized (this.f4124e) {
            this.f4125i = true;
            Unit unit = Unit.f6114a;
        }
    }

    @Override // L0.b
    public final void d(List workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
    }

    @Override // G0.r
    public final void onStopped() {
        r rVar = this.f4127m;
        if (rVar == null || rVar.isStopped()) {
            return;
        }
        rVar.stop();
    }

    @Override // G0.r
    public final O1.a startWork() {
        getBackgroundExecutor().execute(new A.k(3, this));
        k future = this.f4126l;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }
}
