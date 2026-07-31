package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FCMBroadcastReceiver.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.receivers.FCMBroadcastReceiver$onReceive$1", f = "FCMBroadcastReceiver.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class FCMBroadcastReceiver$onReceive$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    int label;
    final /* synthetic */ FCMBroadcastReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FCMBroadcastReceiver$onReceive$1(Context context, BroadcastReceiver.PendingResult pendingResult, Intent intent, FCMBroadcastReceiver fCMBroadcastReceiver, Bundle bundle, Continuation<? super FCMBroadcastReceiver$onReceive$1> continuation) {
        super(1, continuation);
        this.$context = context;
        this.$pendingResult = pendingResult;
        this.$intent = intent;
        this.this$0 = fCMBroadcastReceiver;
        this.$bundle = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FCMBroadcastReceiver$onReceive$1(this.$context, this.$pendingResult, this.$intent, this.this$0, this.$bundle, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((FCMBroadcastReceiver$onReceive$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean isFCMMessage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context applicationContext = this.$context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.label = 1;
            obj = OneSignal.initWithContext(applicationContext, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            Logging.warn$default("FCMBroadcastReceiver skipped due to failed OneSignal init", null, 2, null);
            BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
            if (pendingResult != null) {
                pendingResult.finish();
            }
            return Unit.INSTANCE;
        }
        INotificationBundleProcessor iNotificationBundleProcessor = (INotificationBundleProcessor) OneSignal.INSTANCE.getServices().getService(INotificationBundleProcessor.class);
        isFCMMessage = FCMBroadcastReceiver.INSTANCE.isFCMMessage(this.$intent);
        if (!isFCMMessage) {
            this.this$0.setSuccessfulResultCode();
            BroadcastReceiver.PendingResult pendingResult2 = this.$pendingResult;
            if (pendingResult2 != null) {
                pendingResult2.finish();
            }
            return Unit.INSTANCE;
        }
        INotificationBundleProcessor.ProcessedBundleResult processBundleFromReceiver = iNotificationBundleProcessor.processBundleFromReceiver(this.$context, this.$bundle);
        if (processBundleFromReceiver == null || !processBundleFromReceiver.getIsWorkManagerProcessing()) {
            this.this$0.setSuccessfulResultCode();
            BroadcastReceiver.PendingResult pendingResult3 = this.$pendingResult;
            if (pendingResult3 != null) {
                pendingResult3.finish();
            }
            return Unit.INSTANCE;
        }
        this.this$0.setAbort();
        BroadcastReceiver.PendingResult pendingResult4 = this.$pendingResult;
        if (pendingResult4 != null) {
            pendingResult4.finish();
        }
        return Unit.INSTANCE;
    }
}
