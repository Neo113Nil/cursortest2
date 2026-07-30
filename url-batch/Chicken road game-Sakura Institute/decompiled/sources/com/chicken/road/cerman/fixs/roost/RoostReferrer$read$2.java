package com.chicken.road.cerman.fixs.roost;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RoostReferrer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.cerman.fixs.roost.RoostReferrer$read$2", f = "RoostReferrer.kt", i = {0}, l = {36}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class RoostReferrer$read$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RoostReferrer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoostReferrer$read$2(RoostReferrer roostReferrer, Continuation<? super RoostReferrer$read$2> continuation) {
        super(2, continuation);
        this.this$0 = roostReferrer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoostReferrer$read$2 roostReferrer$read$2 = new RoostReferrer$read$2(this.this$0, continuation);
        roostReferrer$read$2.L$0 = obj;
        return roostReferrer$read$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((RoostReferrer$read$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            RoostReferrer roostReferrer = this.this$0;
            this.L$0 = coroutineScope;
            this.L$1 = roostReferrer;
            this.label = 1;
            RoostReferrer$read$2 roostReferrer$read$2 = this;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(roostReferrer$read$2), 1);
            cancellableContinuationImpl.initCancellability();
            final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            context = roostReferrer.appContext;
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.chicken.road.cerman.fixs.roost.RoostReferrer$read$2$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    InstallReferrerClient installReferrerClient = build;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        installReferrerClient.endConnection();
                        Result.m6819constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m6819constructorimpl(ResultKt.createFailure(th2));
                    }
                }
            });
            build.startConnection(new InstallReferrerStateListener() { // from class: com.chicken.road.cerman.fixs.roost.RoostReferrer$read$2$1$2
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int responseCode) {
                    Object obj2;
                    String str;
                    InstallReferrerClient installReferrerClient = build;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        RoostReferrer$read$2$1$2 roostReferrer$read$2$1$2 = this;
                        if (responseCode != 0 || (str = installReferrerClient.getInstallReferrer().getInstallReferrer()) == null) {
                            str = "";
                        }
                        obj2 = Result.m6819constructorimpl(str);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        obj2 = Result.m6819constructorimpl(ResultKt.createFailure(th));
                    }
                    String str2 = (String) (Result.m6825isFailureimpl(obj2) ? "" : obj2);
                    InstallReferrerClient installReferrerClient2 = build;
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        RoostReferrer$read$2$1$2 roostReferrer$read$2$1$22 = this;
                        installReferrerClient2.endConnection();
                        Result.m6819constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        Result.m6819constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion5 = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m6819constructorimpl(str2));
                    }
                }
            });
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(roostReferrer$read$2);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
