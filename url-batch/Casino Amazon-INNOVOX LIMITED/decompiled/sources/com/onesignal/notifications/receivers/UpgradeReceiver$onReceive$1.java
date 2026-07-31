package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.restoration.INotificationRestoreWorkManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpgradeReceiver.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.receivers.UpgradeReceiver$onReceive$1", f = "UpgradeReceiver.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class UpgradeReceiver$onReceive$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpgradeReceiver$onReceive$1(Context context, BroadcastReceiver.PendingResult pendingResult, Continuation<? super UpgradeReceiver$onReceive$1> continuation) {
        super(1, continuation);
        this.$context = context;
        this.$pendingResult = pendingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UpgradeReceiver$onReceive$1(this.$context, this.$pendingResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((UpgradeReceiver$onReceive$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            Logging.warn$default("UpgradeReceiver skipped due to failed OneSignal init", null, 2, null);
            BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
            if (pendingResult != null) {
                pendingResult.finish();
            }
            return Unit.INSTANCE;
        }
        ((INotificationRestoreWorkManager) OneSignal.INSTANCE.getServices().getService(INotificationRestoreWorkManager.class)).beginEnqueueingWork(this.$context, true);
        BroadcastReceiver.PendingResult pendingResult2 = this.$pendingResult;
        if (pendingResult2 != null) {
            pendingResult2.finish();
        }
        return Unit.INSTANCE;
    }
}
