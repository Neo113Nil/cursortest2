package com.chicken.road.kedbags.ui.splash;

import com.chicken.road.kedbags.data.device.FrostSignalCollector;
import com.chicken.road.kedbags.data.device.FrostSignals;
import com.chicken.road.kedbags.data.model.FrostCatchSnapshot;
import com.chicken.road.kedbags.data.repository.SplashRepository;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SplashController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.kedbags.ui.splash.SplashController$launchBootstrap$1", f = "SplashController.kt", i = {0, 0, 2, 3, 3}, l = {66, 71, 72, 73}, m = "invokeSuspend", n = {"cached", "$i$a$-let-SplashController$launchBootstrap$1$1", "signals", "signals", "snapshot"}, s = {"L$0", "I$0", "L$0", "L$0", "L$1"})
/* loaded from: classes2.dex */
final class SplashController$launchBootstrap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SplashController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SplashController$launchBootstrap$1(SplashController splashController, Continuation<? super SplashController$launchBootstrap$1> continuation) {
        super(2, continuation);
        this.this$0 = splashController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashController$launchBootstrap$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SplashController$launchBootstrap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
    
        if (r10 == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        MutableStateFlow mutableStateFlow;
        boolean z2;
        FrostSignalCollector frostSignalCollector;
        SplashRepository splashRepository;
        Object route;
        FrostSignals frostSignals;
        SplashRepository splashRepository2;
        Object route2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                z = this.this$0.isRouted;
                if (!z) {
                    mutableStateFlow = this.this$0._state;
                    mutableStateFlow.setValue(new SplashUiState(false, true));
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                z2 = this.this$0.bypassCache;
                if (!z2) {
                    splashRepository = this.this$0.repository;
                    FrostCatchSnapshot readCachedSnapshot = splashRepository.readCachedSnapshot();
                    if (readCachedSnapshot != null) {
                        SplashController splashController = this.this$0;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(readCachedSnapshot);
                        this.I$0 = 0;
                        this.label = 1;
                        route = splashController.route(readCachedSnapshot, this);
                        if (route == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
                frostSignalCollector = this.this$0.signalCollector;
                this.label = 2;
                obj = frostSignalCollector.collect(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                frostSignals = (FrostSignals) obj;
                splashRepository2 = this.this$0.repository;
                this.L$0 = SpillingKt.nullOutSpilledVariable(frostSignals);
                this.label = 3;
                obj = splashRepository2.fetchSnapshot(frostSignals, this);
                if (obj == coroutine_suspended) {
                }
                FrostCatchSnapshot frostCatchSnapshot = (FrostCatchSnapshot) obj;
                this.L$0 = SpillingKt.nullOutSpilledVariable(frostSignals);
                this.L$1 = SpillingKt.nullOutSpilledVariable(frostCatchSnapshot);
                this.label = 4;
                route2 = this.this$0.route(frostCatchSnapshot, this);
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    frostSignals = (FrostSignals) obj;
                    splashRepository2 = this.this$0.repository;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(frostSignals);
                    this.label = 3;
                    obj = splashRepository2.fetchSnapshot(frostSignals, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    FrostCatchSnapshot frostCatchSnapshot2 = (FrostCatchSnapshot) obj;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(frostSignals);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(frostCatchSnapshot2);
                    this.label = 4;
                    route2 = this.this$0.route(frostCatchSnapshot2, this);
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    frostSignals = (FrostSignals) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    FrostCatchSnapshot frostCatchSnapshot22 = (FrostCatchSnapshot) obj;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(frostSignals);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(frostCatchSnapshot22);
                    this.label = 4;
                    route2 = this.this$0.route(frostCatchSnapshot22, this);
                }
            }
        } finally {
            this.this$0.bootstrapJob = null;
        }
    }
}
