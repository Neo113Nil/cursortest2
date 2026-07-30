package com.onesignal.core.services;

import E7.l;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.bumptech.glide.f;
import com.onesignal.common.threading.c;
import com.onesignal.debug.internal.logging.b;
import l4.g;
import q7.v;
import v4.InterfaceC5126a;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class SyncJobService extends JobService {

    public static final class a extends h implements l {
        final /* synthetic */ JobParameters $jobParameters;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JobParameters jobParameters, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$jobParameters = jobParameters;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return SyncJobService.this.new a(this.$jobParameters, interfaceC5133d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        /* JADX WARN: Type inference failed for: r9v16, types: [android.app.job.JobService, com.onesignal.core.services.SyncJobService] */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? r12;
            int i;
            InterfaceC5126a interfaceC5126a;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i4 = this.label;
            v vVar = v.f40183a;
            if (i4 == 0) {
                f.r(obj);
                try {
                    SyncJobService syncJobService = SyncJobService.this;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = g.b(syncJobService, this);
                    if (obj != enumC5179a) {
                        i = 0;
                    }
                    return enumC5179a;
                } catch (Throwable th) {
                    th = th;
                    r12 = 0;
                    SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                    throw th;
                }
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r12 = this.I$0;
                interfaceC5126a = (InterfaceC5126a) this.L$0;
                try {
                    f.r(obj);
                    b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + interfaceC5126a.getNeedsJobReschedule(), null, 2, null);
                    r12 = interfaceC5126a.getNeedsJobReschedule();
                    interfaceC5126a.setNeedsJobReschedule(false);
                    SyncJobService.this.jobFinished(this.$jobParameters, r12);
                    return vVar;
                } catch (Throwable th2) {
                    th = th2;
                    SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                    throw th;
                }
            }
            i = this.I$0;
            try {
                f.r(obj);
            } catch (Throwable th3) {
                th = th3;
                r12 = i;
                SyncJobService.this.jobFinished(this.$jobParameters, r12 != 0);
                throw th;
            }
            if (!((Boolean) obj).booleanValue()) {
                SyncJobService.this.jobFinished(this.$jobParameters, i != 0);
                return vVar;
            }
            InterfaceC5126a interfaceC5126a2 = (InterfaceC5126a) g.a().getService(InterfaceC5126a.class);
            this.L$0 = interfaceC5126a2;
            this.I$0 = i;
            this.label = 2;
            if (interfaceC5126a2.runBackgroundServices(this) != enumC5179a) {
                interfaceC5126a = interfaceC5126a2;
                b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + interfaceC5126a.getNeedsJobReschedule(), null, 2, null);
                r12 = interfaceC5126a.getNeedsJobReschedule();
                interfaceC5126a.setNeedsJobReschedule(false);
                SyncJobService.this.jobFinished(this.$jobParameters, r12);
                return vVar;
            }
            return enumC5179a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        kotlin.jvm.internal.h.e(jobParameters, "jobParameters");
        com.onesignal.common.threading.b.INSTANCE.prewarm();
        c.suspendifyOnIO(new a(jobParameters, null));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        kotlin.jvm.internal.h.e(jobParameters, "jobParameters");
        try {
            boolean cancelRunBackgroundServices = ((InterfaceC5126a) g.a().getService(InterfaceC5126a.class)).cancelRunBackgroundServices();
            b.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + cancelRunBackgroundServices, null, 2, null);
            return cancelRunBackgroundServices;
        } catch (Exception unused) {
            b.error$default("SyncJobService onStopJob failed, omit and do not reschedule", null, 2, null);
            return false;
        }
    }
}
