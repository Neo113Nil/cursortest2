package com.chicken.road.kedbags.data.device;

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
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: FrostSignalCollector.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.kedbags.data.device.FrostSignalCollector$readIceLantern$2", f = "FrostSignalCollector.kt", i = {0}, l = {81}, m = "invokeSuspend", n = {"$i$f$suspendCancellableCoroutine"}, s = {"I$0"})
/* loaded from: classes2.dex */
final class FrostSignalCollector$readIceLantern$2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ FrostSignalCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrostSignalCollector$readIceLantern$2(FrostSignalCollector frostSignalCollector, Continuation<? super FrostSignalCollector$readIceLantern$2> continuation) {
        super(1, continuation);
        this.this$0 = frostSignalCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FrostSignalCollector$readIceLantern$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((FrostSignalCollector$readIceLantern$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object m6577constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        final FrostSignalCollector frostSignalCollector = this.this$0;
        this.L$0 = frostSignalCollector;
        this.I$0 = 0;
        this.label = 1;
        FrostSignalCollector$readIceLantern$2 frostSignalCollector$readIceLantern$2 = this;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(frostSignalCollector$readIceLantern$2), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        context = frostSignalCollector.context;
        final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.chicken.road.kedbags.data.device.FrostSignalCollector$readIceLantern$2$1$1
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
                    Result.m6577constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m6577constructorimpl(ResultKt.createFailure(th2));
                }
            }
        });
        try {
            Result.Companion companion = Result.INSTANCE;
            build.startConnection(new InstallReferrerStateListener() { // from class: com.chicken.road.kedbags.data.device.FrostSignalCollector$readIceLantern$2$1$2$1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int responseCode) {
                    Object m6577constructorimpl2;
                    String str = "";
                    if (responseCode == 0) {
                        InstallReferrerClient installReferrerClient = build;
                        try {
                            Result.Companion companion2 = Result.INSTANCE;
                            FrostSignalCollector$readIceLantern$2$1$2$1 frostSignalCollector$readIceLantern$2$1$2$1 = this;
                            m6577constructorimpl2 = Result.m6577constructorimpl(installReferrerClient.getInstallReferrer().getInstallReferrer());
                        } catch (Throwable th) {
                            Result.Companion companion3 = Result.INSTANCE;
                            m6577constructorimpl2 = Result.m6577constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m6583isFailureimpl(m6577constructorimpl2)) {
                            m6577constructorimpl2 = null;
                        }
                        String str2 = (String) m6577constructorimpl2;
                        if (str2 != null) {
                            str = str2;
                        }
                    }
                    InstallReferrerClient installReferrerClient2 = build;
                    try {
                        Result.Companion companion4 = Result.INSTANCE;
                        FrostSignalCollector$readIceLantern$2$1$2$1 frostSignalCollector$readIceLantern$2$1$2$12 = this;
                        installReferrerClient2.endConnection();
                        Result.m6577constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion5 = Result.INSTANCE;
                        Result.m6577constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion6 = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m6577constructorimpl(str));
                    }
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m6577constructorimpl(""));
                    }
                }
            });
            m6577constructorimpl = Result.m6577constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6577constructorimpl = Result.m6577constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m6580exceptionOrNullimpl(m6577constructorimpl) != null && cancellableContinuationImpl2.isActive()) {
            Result.Companion companion3 = Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(Result.m6577constructorimpl(""));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(frostSignalCollector$readIceLantern$2);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
