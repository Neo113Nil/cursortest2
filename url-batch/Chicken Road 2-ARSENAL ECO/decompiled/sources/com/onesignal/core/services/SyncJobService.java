package com.onesignal.core.services;

import L1.f;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.debug.internal.logging.b;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class SyncJobService extends JobService {

    public static final class a extends g implements InterfaceC0743l {
        final /* synthetic */ JobParameters $jobParameters;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JobParameters jobParameters, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$jobParameters = jobParameters;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return SyncJobService.this.new a(this.$jobParameters, interfaceC0564d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        /* JADX WARN: Type inference failed for: r9v16, types: [android.app.job.JobService, com.onesignal.core.services.SyncJobService] */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? r12;
            int i7;
            V1.a aVar;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i8 = this.label;
            v vVar = v.f5219a;
            if (i8 == 0) {
                AbstractC0676f.w(obj);
                try {
                    SyncJobService syncJobService = SyncJobService.this;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = f.f(syncJobService, this);
                    if (obj != enumC0580a) {
                        i7 = 0;
                    }
                    return enumC0580a;
                } catch (Throwable th) {
                    th = th;
                    r12 = 0;
                    SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                    throw th;
                }
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r12 = this.I$0;
                aVar = (V1.a) this.L$0;
                try {
                    AbstractC0676f.w(obj);
                    b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + aVar.getNeedsJobReschedule(), null, 2, null);
                    r12 = aVar.getNeedsJobReschedule();
                    aVar.setNeedsJobReschedule(false);
                    SyncJobService.this.jobFinished(this.$jobParameters, r12);
                    return vVar;
                } catch (Throwable th2) {
                    th = th2;
                    SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                    throw th;
                }
            }
            i7 = this.I$0;
            try {
                AbstractC0676f.w(obj);
            } catch (Throwable th3) {
                th = th3;
                r12 = i7;
                SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                throw th;
            }
            if (!((Boolean) obj).booleanValue()) {
                SyncJobService.this.jobFinished(this.$jobParameters, i7 != 0);
                return vVar;
            }
            V1.a aVar2 = (V1.a) f.d().getService(V1.a.class);
            this.L$0 = aVar2;
            this.I$0 = i7;
            this.label = 2;
            if (aVar2.runBackgroundServices(this) != enumC0580a) {
                aVar = aVar2;
                b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + aVar.getNeedsJobReschedule(), null, 2, null);
                r12 = aVar.getNeedsJobReschedule();
                aVar.setNeedsJobReschedule(false);
                SyncJobService.this.jobFinished(this.$jobParameters, r12);
                return vVar;
            }
            return enumC0580a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        i.e(jobParameters, "jobParameters");
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new a(jobParameters, null));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        i.e(jobParameters, "jobParameters");
        try {
            boolean cancelRunBackgroundServices = ((V1.a) f.d().getService(V1.a.class)).cancelRunBackgroundServices();
            b.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + cancelRunBackgroundServices, null, 2, null);
            return cancelRunBackgroundServices;
        } catch (Exception unused) {
            b.error$default("SyncJobService onStopJob failed, omit and do not reschedule", null, 2, null);
            return false;
        }
    }
}
