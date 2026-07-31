package com.onesignal.notifications.internal.permissions.impl;

import com.onesignal.common.threading.Waiter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationPermissionController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$pollForPermission$3", f = "NotificationPermissionController.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NotificationPermissionController$pollForPermission$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    int label;
    final /* synthetic */ NotificationPermissionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationPermissionController$pollForPermission$3(NotificationPermissionController notificationPermissionController, Continuation<? super NotificationPermissionController$pollForPermission$3> continuation) {
        super(2, continuation);
        this.this$0 = notificationPermissionController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationPermissionController$pollForPermission$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((NotificationPermissionController$pollForPermission$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Waiter waiter;
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
        waiter = this.this$0.pollingWaiter;
        this.label = 1;
        Object waitForWake = waiter.waitForWake(this);
        return waitForWake == coroutine_suspended ? coroutine_suspended : waitForWake;
    }
}
