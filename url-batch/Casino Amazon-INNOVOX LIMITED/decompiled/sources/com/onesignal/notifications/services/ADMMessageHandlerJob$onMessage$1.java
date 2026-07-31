package com.onesignal.notifications.services;

import android.content.Context;
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

/* compiled from: ADMMessageHandlerJob.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.services.ADMMessageHandlerJob$onMessage$1", f = "ADMMessageHandlerJob.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ADMMessageHandlerJob$onMessage$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ Context $safeContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ADMMessageHandlerJob$onMessage$1(Context context, Bundle bundle, Continuation<? super ADMMessageHandlerJob$onMessage$1> continuation) {
        super(1, continuation);
        this.$safeContext = context;
        this.$bundle = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ADMMessageHandlerJob$onMessage$1(this.$safeContext, this.$bundle, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((ADMMessageHandlerJob$onMessage$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context safeContext = this.$safeContext;
            Intrinsics.checkNotNullExpressionValue(safeContext, "$safeContext");
            this.label = 1;
            obj = OneSignal.initWithContext(safeContext, this);
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
            Logging.warn$default("onMessage skipped due to failed OneSignal init", null, 2, null);
            return Unit.INSTANCE;
        }
        INotificationBundleProcessor iNotificationBundleProcessor = (INotificationBundleProcessor) OneSignal.INSTANCE.getServices().getService(INotificationBundleProcessor.class);
        Context safeContext2 = this.$safeContext;
        Intrinsics.checkNotNullExpressionValue(safeContext2, "$safeContext");
        iNotificationBundleProcessor.processBundleFromReceiver(safeContext2, this.$bundle);
        return Unit.INSTANCE;
    }
}
