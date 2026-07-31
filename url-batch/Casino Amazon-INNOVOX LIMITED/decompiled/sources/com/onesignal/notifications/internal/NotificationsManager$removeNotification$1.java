package com.onesignal.notifications.internal;

import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: NotificationsManager.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.NotificationsManager$removeNotification$1", f = "NotificationsManager.kt", i = {}, l = {112, 113}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NotificationsManager$removeNotification$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ int $id;
    int label;
    final /* synthetic */ NotificationsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsManager$removeNotification$1(NotificationsManager notificationsManager, int i, Continuation<? super NotificationsManager$removeNotification$1> continuation) {
        super(1, continuation);
        this.this$0 = notificationsManager;
        this.$id = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NotificationsManager$removeNotification$1(this.this$0, this.$id, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((NotificationsManager$removeNotification$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r6.updatePossibleDependentSummaryOnDismiss(r5.$id, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        INotificationSummaryManager iNotificationSummaryManager;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0._notificationDataController.markAsDismissed(this.$id, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            iNotificationSummaryManager = this.this$0._summaryManager;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
