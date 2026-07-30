package com.onesignal.core.services;

import V5.b;
import X5.j;
import android.app.job.JobParameters;
import android.app.job.JobService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n2.AbstractC0755f;
import x2.InterfaceC1004a;

@Metadata
/* loaded from: classes.dex */
public final class SyncJobService extends JobService {

    public static final class a extends j implements Function1 {
        final /* synthetic */ JobParameters $jobParameters;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JobParameters jobParameters, b bVar) {
            super(1, bVar);
            this.$jobParameters = jobParameters;
        }

        @Override // X5.a
        public final b create(b bVar) {
            return SyncJobService.this.new a(this.$jobParameters, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(b bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [int] */
        /* JADX WARN: Type inference failed for: r8v15, types: [android.app.job.JobService, com.onesignal.core.services.SyncJobService] */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? r12;
            int i2;
            InterfaceC1004a interfaceC1004a;
            W5.a aVar = W5.a.f2787d;
            int i5 = this.label;
            if (i5 == 0) {
                V6.b.P(obj);
                try {
                    SyncJobService syncJobService = SyncJobService.this;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = AbstractC0755f.f(syncJobService, this);
                    if (obj != aVar) {
                        i2 = 0;
                    }
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    r12 = 0;
                    SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                    throw th;
                }
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r12 = this.I$0;
                interfaceC1004a = (InterfaceC1004a) this.L$0;
                try {
                    V6.b.P(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + interfaceC1004a.getNeedsJobReschedule(), null, 2, null);
                    r12 = interfaceC1004a.getNeedsJobReschedule();
                    interfaceC1004a.setNeedsJobReschedule(false);
                    SyncJobService.this.jobFinished(this.$jobParameters, r12);
                    return Unit.f6114a;
                } catch (Throwable th2) {
                    th = th2;
                    SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                    throw th;
                }
            }
            i2 = this.I$0;
            try {
                V6.b.P(obj);
            } catch (Throwable th3) {
                th = th3;
                r12 = i2;
                SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                throw th;
            }
            if (!((Boolean) obj).booleanValue()) {
                Unit unit = Unit.f6114a;
                SyncJobService.this.jobFinished(this.$jobParameters, i2 != 0);
                return unit;
            }
            InterfaceC1004a interfaceC1004a2 = (InterfaceC1004a) AbstractC0755f.d().getService(InterfaceC1004a.class);
            this.L$0 = interfaceC1004a2;
            this.I$0 = i2;
            this.label = 2;
            if (interfaceC1004a2.runBackgroundServices(this) != aVar) {
                interfaceC1004a = interfaceC1004a2;
                com.onesignal.debug.internal.logging.b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + interfaceC1004a.getNeedsJobReschedule(), null, 2, null);
                r12 = interfaceC1004a.getNeedsJobReschedule();
                interfaceC1004a.setNeedsJobReschedule(false);
                SyncJobService.this.jobFinished(this.$jobParameters, r12);
                return Unit.f6114a;
            }
            return aVar;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        Intrinsics.checkNotNullParameter(jobParameters, "jobParameters");
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new a(jobParameters, null));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        Intrinsics.checkNotNullParameter(jobParameters, "jobParameters");
        try {
            boolean cancelRunBackgroundServices = ((InterfaceC1004a) AbstractC0755f.d().getService(InterfaceC1004a.class)).cancelRunBackgroundServices();
            com.onesignal.debug.internal.logging.b.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + cancelRunBackgroundServices, null, 2, null);
            return cancelRunBackgroundServices;
        } catch (Exception unused) {
            com.onesignal.debug.internal.logging.b.error$default("SyncJobService onStopJob failed, omit and do not reschedule", null, 2, null);
            return false;
        }
    }
}
