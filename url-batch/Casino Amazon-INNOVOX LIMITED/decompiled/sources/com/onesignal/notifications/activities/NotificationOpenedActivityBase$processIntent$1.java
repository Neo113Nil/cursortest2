package com.onesignal.notifications.activities;

import android.content.Context;
import android.content.Intent;
import com.facebook.soloader.Elf64;
import com.onesignal.OneSignal;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationOpenedActivityBase.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.activities.NotificationOpenedActivityBase$processIntent$1", f = "NotificationOpenedActivityBase.kt", i = {}, l = {Elf64.Ehdr.E_SHSTRNDX, 67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NotificationOpenedActivityBase$processIntent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NotificationOpenedActivityBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationOpenedActivityBase$processIntent$1(NotificationOpenedActivityBase notificationOpenedActivityBase, Continuation<? super NotificationOpenedActivityBase$processIntent$1> continuation) {
        super(1, continuation);
        this.this$0 = notificationOpenedActivityBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NotificationOpenedActivityBase$processIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((NotificationOpenedActivityBase$processIntent$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r6.processFromContext(r3, r1, r5) == r0) goto L25;
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
                    final NotificationOpenedActivityBase notificationOpenedActivityBase = this.this$0;
                    notificationOpenedActivityBase.runOnUiThread(new Runnable() { // from class: com.onesignal.notifications.activities.NotificationOpenedActivityBase$processIntent$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            NotificationOpenedActivityBase$processIntent$1.invokeSuspend$lambda$0(NotificationOpenedActivityBase.this);
                        }
                    });
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            INotificationOpenedProcessor iNotificationOpenedProcessor = (INotificationOpenedProcessor) OneSignal.INSTANCE.getServices().getService(INotificationOpenedProcessor.class);
            NotificationOpenedActivityBase notificationOpenedActivityBase2 = this.this$0;
            NotificationOpenedActivityBase notificationOpenedActivityBase3 = notificationOpenedActivityBase2;
            Intent intent = notificationOpenedActivityBase2.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            this.label = 2;
        } finally {
            final NotificationOpenedActivityBase notificationOpenedActivityBase4 = this.this$0;
            notificationOpenedActivityBase4.runOnUiThread(new Runnable() { // from class: com.onesignal.notifications.activities.NotificationOpenedActivityBase$processIntent$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationOpenedActivityBase$processIntent$1.invokeSuspend$lambda$0(NotificationOpenedActivityBase.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(NotificationOpenedActivityBase notificationOpenedActivityBase) {
        AndroidUtils.INSTANCE.finishSafely(notificationOpenedActivityBase);
    }
}
