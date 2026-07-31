package com.onesignal.notifications.internal.lifecycle.impl;

import android.app.Activity;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* compiled from: NotificationLifecycleService.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleCallback;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$canOpenNotification$2", f = "NotificationLifecycleService.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NotificationLifecycleService$canOpenNotification$2 extends SuspendLambda implements Function2<INotificationLifecycleCallback, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Ref.BooleanRef $canOpen;
    final /* synthetic */ JSONObject $data;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationLifecycleService$canOpenNotification$2(Ref.BooleanRef booleanRef, Activity activity, JSONObject jSONObject, Continuation<? super NotificationLifecycleService$canOpenNotification$2> continuation) {
        super(2, continuation);
        this.$canOpen = booleanRef;
        this.$activity = activity;
        this.$data = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationLifecycleService$canOpenNotification$2 notificationLifecycleService$canOpenNotification$2 = new NotificationLifecycleService$canOpenNotification$2(this.$canOpen, this.$activity, this.$data, continuation);
        notificationLifecycleService$canOpenNotification$2.L$0 = obj;
        return notificationLifecycleService$canOpenNotification$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(INotificationLifecycleCallback iNotificationLifecycleCallback, Continuation<? super Unit> continuation) {
        return ((NotificationLifecycleService$canOpenNotification$2) create(iNotificationLifecycleCallback, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.BooleanRef booleanRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            INotificationLifecycleCallback iNotificationLifecycleCallback = (INotificationLifecycleCallback) this.L$0;
            Ref.BooleanRef booleanRef2 = this.$canOpen;
            this.L$0 = booleanRef2;
            this.label = 1;
            obj = iNotificationLifecycleCallback.canOpenNotification(this.$activity, this.$data, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            booleanRef = booleanRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (Ref.BooleanRef) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        booleanRef.element = ((Boolean) obj).booleanValue();
        return Unit.INSTANCE;
    }
}
