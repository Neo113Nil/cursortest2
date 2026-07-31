package com.onesignal;

import android.content.Context;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessorHMS;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationOpenedActivityHMS.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.NotificationOpenedActivityHMS$processIntent$1", f = "NotificationOpenedActivityHMS.kt", i = {}, l = {84, 89}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class NotificationOpenedActivityHMS$processIntent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NotificationOpenedActivityHMS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationOpenedActivityHMS$processIntent$1(NotificationOpenedActivityHMS notificationOpenedActivityHMS, Continuation<? super NotificationOpenedActivityHMS$processIntent$1> continuation) {
        super(1, continuation);
        this.this$0 = notificationOpenedActivityHMS;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NotificationOpenedActivityHMS$processIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((NotificationOpenedActivityHMS$processIntent$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r6.handleHMSNotificationOpenIntent(r1, r1.getIntent(), r5) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Context applicationContext = this.this$0.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = OneSignal.initWithContext(applicationContext, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final NotificationOpenedActivityHMS notificationOpenedActivityHMS = this.this$0;
                    notificationOpenedActivityHMS.runOnUiThread(new Runnable() { // from class: com.onesignal.NotificationOpenedActivityHMS$processIntent$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            NotificationOpenedActivityHMS$processIntent$1.invokeSuspend$lambda$0(NotificationOpenedActivityHMS.this);
                        }
                    });
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            INotificationOpenedProcessorHMS iNotificationOpenedProcessorHMS = (INotificationOpenedProcessorHMS) OneSignal.INSTANCE.getServices().getService(INotificationOpenedProcessorHMS.class);
            NotificationOpenedActivityHMS notificationOpenedActivityHMS2 = this.this$0;
            this.label = 2;
        } finally {
            final NotificationOpenedActivityHMS notificationOpenedActivityHMS3 = this.this$0;
            notificationOpenedActivityHMS3.runOnUiThread(new Runnable() { // from class: com.onesignal.NotificationOpenedActivityHMS$processIntent$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationOpenedActivityHMS$processIntent$1.invokeSuspend$lambda$0(NotificationOpenedActivityHMS.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(NotificationOpenedActivityHMS notificationOpenedActivityHMS) {
        AndroidUtils.INSTANCE.finishSafely(notificationOpenedActivityHMS);
    }
}
