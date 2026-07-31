package com.onesignal.notifications.internal.lifecycle.impl;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationLifecycleService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$openDestinationActivity$2", f = "NotificationLifecycleService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NotificationLifecycleService$openDestinationActivity$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationLifecycleService$openDestinationActivity$2(Activity activity, Intent intent, Continuation<? super NotificationLifecycleService$openDestinationActivity$2> continuation) {
        super(2, continuation);
        this.$activity = activity;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationLifecycleService$openDestinationActivity$2(this.$activity, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationLifecycleService$openDestinationActivity$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$activity.startActivity(this.$intent);
        return Unit.INSTANCE;
    }
}
