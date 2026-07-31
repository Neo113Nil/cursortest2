package com.onesignal.notifications.internal;

import com.onesignal.notifications.internal.permissions.INotificationPermissionController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationsManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.NotificationsManager$requestPermission$2", f = "NotificationsManager.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NotificationsManager$requestPermission$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ boolean $fallbackToSettings;
    int label;
    final /* synthetic */ NotificationsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsManager$requestPermission$2(NotificationsManager notificationsManager, boolean z, Continuation<? super NotificationsManager$requestPermission$2> continuation) {
        super(2, continuation);
        this.this$0 = notificationsManager;
        this.$fallbackToSettings = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationsManager$requestPermission$2(this.this$0, this.$fallbackToSettings, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((NotificationsManager$requestPermission$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        INotificationPermissionController iNotificationPermissionController;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        iNotificationPermissionController = this.this$0._notificationPermissionController;
        this.label = 1;
        Object prompt = iNotificationPermissionController.prompt(this.$fallbackToSettings, this);
        return prompt == coroutine_suspended ? coroutine_suspended : prompt;
    }
}
