package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationDismissReceiver.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.receivers.NotificationDismissReceiver$onReceive$1", f = "NotificationDismissReceiver.kt", i = {}, l = {50, 59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NotificationDismissReceiver$onReceive$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationDismissReceiver$onReceive$1(Context context, BroadcastReceiver.PendingResult pendingResult, Intent intent, Continuation<? super NotificationDismissReceiver$onReceive$1> continuation) {
        super(1, continuation);
        this.$context = context;
        this.$pendingResult = pendingResult;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NotificationDismissReceiver$onReceive$1(this.$context, this.$pendingResult, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((NotificationDismissReceiver$onReceive$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.onesignal.notifications.receivers.NotificationDismissReceiver$onReceive$1.AnonymousClass1(r8, r7.$context, r7.$intent, null), r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context applicationContext = this.$context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.label = 1;
            obj = OneSignal.initWithContext(applicationContext, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            Logging.warn$default("NotificationOpenedReceiver skipped due to failed OneSignal init", null, 2, null);
            BroadcastReceiver.PendingResult pendingResult2 = this.$pendingResult;
            if (pendingResult2 != null) {
                pendingResult2.finish();
            }
            return Unit.INSTANCE;
        }
        INotificationOpenedProcessor iNotificationOpenedProcessor = (INotificationOpenedProcessor) OneSignal.INSTANCE.getServices().getService(INotificationOpenedProcessor.class);
        this.label = 2;
    }

    /* compiled from: NotificationDismissReceiver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.onesignal.notifications.receivers.NotificationDismissReceiver$onReceive$1$1", f = "NotificationDismissReceiver.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.onesignal.notifications.receivers.NotificationDismissReceiver$onReceive$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ INotificationOpenedProcessor $notificationOpenedProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(INotificationOpenedProcessor iNotificationOpenedProcessor, Context context, Intent intent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$notificationOpenedProcessor = iNotificationOpenedProcessor;
            this.$context = context;
            this.$intent = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$notificationOpenedProcessor, this.$context, this.$intent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$notificationOpenedProcessor.processFromContext(this.$context, this.$intent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
