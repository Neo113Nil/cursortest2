package com.onesignal.core.services;

import android.app.job.JobParameters;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.soloader.Elf64;
import com.onesignal.OneSignal;
import com.onesignal.core.internal.background.IBackgroundManager;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: SyncJobService.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.services.SyncJobService$onStartJob$1", f = "SyncJobService.kt", i = {0, 1, 1}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF, Elf64.Ehdr.E_SHENTSIZE}, m = "invokeSuspend", n = {"reschedule", "backgroundService", "reschedule"}, s = {"I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class SyncJobService$onStartJob$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ JobParameters $jobParameters;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ SyncJobService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SyncJobService$onStartJob$1(SyncJobService syncJobService, JobParameters jobParameters, Continuation<? super SyncJobService$onStartJob$1> continuation) {
        super(1, continuation);
        this.this$0 = syncJobService;
        this.$jobParameters = jobParameters;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SyncJobService$onStartJob$1(this.this$0, this.$jobParameters, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((SyncJobService$onStartJob$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r8v18, types: [com.onesignal.core.services.SyncJobService] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r1;
        int i;
        IBackgroundManager iBackgroundManager;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                this.I$0 = 0;
                this.label = 1;
                obj = OneSignal.initWithContext(this.this$0, this);
                if (obj != coroutine_suspended) {
                    i = 0;
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                th = th;
                r1 = 0;
                this.this$0.jobFinished(this.$jobParameters, r1 != 0);
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r1 = this.I$0;
            iBackgroundManager = (IBackgroundManager) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                Logging.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + iBackgroundManager.getNeedsJobReschedule(), null, 2, null);
                r1 = iBackgroundManager.getNeedsJobReschedule();
                iBackgroundManager.setNeedsJobReschedule(false);
                this.this$0.jobFinished(this.$jobParameters, r1);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                this.this$0.jobFinished(this.$jobParameters, r1 != 0);
                throw th;
            }
        }
        i = this.I$0;
        try {
            ResultKt.throwOnFailure(obj);
        } catch (Throwable th3) {
            th = th3;
            r1 = i;
            this.this$0.jobFinished(this.$jobParameters, r1 != 0);
            throw th;
        }
        if (!((Boolean) obj).booleanValue()) {
            Unit unit = Unit.INSTANCE;
            this.this$0.jobFinished(this.$jobParameters, i != 0);
            return unit;
        }
        IBackgroundManager iBackgroundManager2 = (IBackgroundManager) OneSignal.INSTANCE.getServices().getService(IBackgroundManager.class);
        this.L$0 = iBackgroundManager2;
        this.I$0 = i;
        this.label = 2;
        if (iBackgroundManager2.runBackgroundServices(this) != coroutine_suspended) {
            iBackgroundManager = iBackgroundManager2;
            Logging.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + iBackgroundManager.getNeedsJobReschedule(), null, 2, null);
            r1 = iBackgroundManager.getNeedsJobReschedule();
            iBackgroundManager.setNeedsJobReschedule(false);
            this.this$0.jobFinished(this.$jobParameters, r1);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
