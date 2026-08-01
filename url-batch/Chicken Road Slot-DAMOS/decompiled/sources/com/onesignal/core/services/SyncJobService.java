package com.onesignal.core.services;

import android.app.job.JobParameters;
import android.app.job.JobService;
import cf.c;
import com.onesignal.debug.internal.logging.b;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import nd.i;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class SyncJobService extends JobService {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends i implements Function1 {
        final /* synthetic */ b0 $backgroundService;
        final /* synthetic */ JobParameters $jobParameters;
        int label;
        final /* synthetic */ SyncJobService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, SyncJobService syncJobService, JobParameters jobParameters, ld.a aVar) {
            super(1, aVar);
            this.$backgroundService = b0Var;
            this.this$0 = syncJobService;
            this.$jobParameters = jobParameters;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return new a(this.$backgroundService, this.this$0, this.$jobParameters, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                c.M(obj);
                ga.a aVar2 = (ga.a) this.$backgroundService.f10141d;
                this.label = 1;
                if (aVar2.runBackgroundServices(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c.M(obj);
            }
            b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + ((ga.a) this.$backgroundService.f10141d).getNeedsJobReschedule(), null, 2, null);
            boolean needsJobReschedule = ((ga.a) this.$backgroundService.f10141d).getNeedsJobReschedule();
            ((ga.a) this.$backgroundService.f10141d).setNeedsJobReschedule(false);
            this.this$0.jobFinished(this.$jobParameters, needsJobReschedule);
            return Unit.f5554a;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        jobParameters.getClass();
        if (!v9.c.b(this)) {
            return false;
        }
        b0 b0Var = new b0();
        b0Var.f10141d = v9.c.a().getService(ga.a.class);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(b0Var, this, jobParameters, null), 1, null);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        jobParameters.getClass();
        boolean cancelRunBackgroundServices = ((ga.a) v9.c.a().getService(ga.a.class)).cancelRunBackgroundServices();
        b.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + cancelRunBackgroundServices, null, 2, null);
        return cancelRunBackgroundServices;
    }
}
