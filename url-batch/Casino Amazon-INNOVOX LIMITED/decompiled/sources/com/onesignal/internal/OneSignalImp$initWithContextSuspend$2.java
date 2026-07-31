package com.onesignal.internal;

import android.content.Context;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OneSignalImp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.internal.OneSignalImp$initWithContextSuspend$2", f = "OneSignalImp.kt", i = {}, l = {744}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OneSignalImp$initWithContextSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $appId;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalImp$initWithContextSuspend$2(OneSignalImp oneSignalImp, Context context, String str, Continuation<? super OneSignalImp$initWithContextSuspend$2> continuation) {
        super(2, continuation);
        this.this$0 = oneSignalImp;
        this.$context = context;
        this.$appId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneSignalImp$initWithContextSuspend$2(this.this$0, this.$context, this.$appId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((OneSignalImp$initWithContextSuspend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, kotlinx.coroutines.CompletableDeferred] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InitState initState;
        boolean internalInit;
        ?? r5;
        InitState initState2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            obj2 = this.this$0.initLock;
            OneSignalImp oneSignalImp = this.this$0;
            synchronized (obj2) {
                initState = oneSignalImp.initState;
                if (initState.isSDKAccessible()) {
                    booleanRef.element = false;
                    r5 = oneSignalImp.suspendCompletion;
                    objectRef.element = r5;
                } else {
                    booleanRef.element = true;
                    objectRef.element = null;
                    oneSignalImp.initState = InitState.IN_PROGRESS;
                    oneSignalImp.suspendCompletion = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    oneSignalImp.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
                }
                Unit unit = Unit.INSTANCE;
            }
            if (booleanRef.element) {
                internalInit = this.this$0.internalInit(this.$context, this.$appId);
                return Boxing.boxBoolean(internalInit);
            }
            Logging.log(LogLevel.DEBUG, "initWithContext: init already in progress or completed, awaiting completion");
            T t = objectRef.element;
            Intrinsics.checkNotNull(t);
            this.label = 1;
            if (((CompletableDeferred) t).await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        initState2 = this.this$0.initState;
        return Boxing.boxBoolean(initState2 == InitState.SUCCESS);
    }
}
