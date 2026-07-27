package com.onesignal.core.services;

import android.app.job.JobParameters;
import com.onesignal.OneSignal;
import com.onesignal.core.internal.background.IBackgroundManager;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.core.services.SyncJobService$onStartJob$1", f = "SyncJobService.kt", l = {53, 58}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SyncJobService$onStartJob$1 extends h implements InterfaceC1441l {
    final /* synthetic */ JobParameters $jobParameters;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ SyncJobService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncJobService$onStartJob$1(SyncJobService syncJobService, JobParameters jobParameters, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = syncJobService;
        this.$jobParameters = jobParameters;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new SyncJobService$onStartJob$1(this.this$0, this.$jobParameters, interfaceC1218d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v17, types: [android.app.job.JobService, com.onesignal.core.services.SyncJobService] */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r12;
        int i2;
        IBackgroundManager iBackgroundManager;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i3 = this.label;
        v vVar = v.f5689a;
        if (i3 == 0) {
            g.y(obj);
            try {
                SyncJobService syncJobService = this.this$0;
                this.I$0 = 0;
                this.label = 1;
                obj = OneSignal.initWithContext(syncJobService, this);
                if (obj == enumC1260a) {
                    return enumC1260a;
                }
                i2 = 0;
            } catch (Throwable th) {
                th = th;
                r12 = 0;
                this.this$0.jobFinished(this.$jobParameters, r12 != 0);
                throw th;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r12 = this.I$0;
                iBackgroundManager = (IBackgroundManager) this.L$0;
                try {
                    g.y(obj);
                    Logging.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + iBackgroundManager.getNeedsJobReschedule(), null, 2, null);
                    r12 = iBackgroundManager.getNeedsJobReschedule();
                    iBackgroundManager.setNeedsJobReschedule(false);
                    this.this$0.jobFinished(this.$jobParameters, r12);
                    return vVar;
                } catch (Throwable th2) {
                    th = th2;
                    this.this$0.jobFinished(this.$jobParameters, r12 != 0);
                    throw th;
                }
            }
            i2 = this.I$0;
            try {
                g.y(obj);
            } catch (Throwable th3) {
                th = th3;
                r12 = i2;
                this.this$0.jobFinished(this.$jobParameters, r12 != 0);
                throw th;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            this.this$0.jobFinished(this.$jobParameters, i2 != 0);
            return vVar;
        }
        IBackgroundManager iBackgroundManager2 = (IBackgroundManager) OneSignal.INSTANCE.getServices().getService(IBackgroundManager.class);
        this.L$0 = iBackgroundManager2;
        this.I$0 = i2;
        this.label = 2;
        if (iBackgroundManager2.runBackgroundServices(this) == enumC1260a) {
            return enumC1260a;
        }
        iBackgroundManager = iBackgroundManager2;
        Logging.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + iBackgroundManager.getNeedsJobReschedule(), null, 2, null);
        r12 = iBackgroundManager.getNeedsJobReschedule();
        iBackgroundManager.setNeedsJobReschedule(false);
        this.this$0.jobFinished(this.$jobParameters, r12);
        return vVar;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((SyncJobService$onStartJob$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
