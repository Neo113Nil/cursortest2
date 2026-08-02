package com.squareup.cash.threedsdataonly.backend.real;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.netcetera.threeds.sdk.ThreeDS2ServiceInstance;
import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.api.configparameters.ConfigParameters;
import com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder;
import com.netcetera.threeds.sdk.api.exceptions.SDKAlreadyInitializedException;
import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;
import com.squareup.cash.threedsdataonly.backend.api.InitializationResult;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NotCompleted;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealThreeDsService$init$1 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ RealThreeDsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealThreeDsService$init$1(RealThreeDsService realThreeDsService, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realThreeDsService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealThreeDsService$init$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealThreeDsService$init$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        this.label = 1;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
        cancellableContinuationImpl.initCancellability();
        Timber.Forest forest = Timber.Forest;
        forest.tag("3DS");
        forest.d("Initializing 3DS SDK", new Object[0]);
        ThreeDS2Service threeDS2Service = ThreeDS2ServiceInstance.get();
        final RealThreeDsService realThreeDsService = this.this$0;
        realThreeDsService.threeDsService = threeDS2Service;
        threeDS2Service.getClass();
        Context context = realThreeDsService.context;
        ConfigParameters build = new ConfigurationBuilder().apiKey(realThreeDsService.threeDsConfig.symbol).build();
        build.getClass();
        threeDS2Service.initialize(context, build, ((Locale) realThreeDsService.localeManager.resolvedLocale.$$delegate_0.getValue()).toString(), MapsKt__MapsKt.mutableMapOf(new Pair(UiCustomization.UiCustomizationType.DEFAULT, new UiCustomization())), new ThreeDS2Service.InitializationCallback(realThreeDsService) { // from class: com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService$init$1$1$1
            @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service.InitializationCallback
            public final void onCompleted() {
                InitializationResult.Success success = new InitializationResult.Success(false);
                CancellableContinuationImpl cancellableContinuationImpl2 = CancellableContinuationImpl.this;
                if (cancellableContinuationImpl2.getState$kotlinx_coroutines_core() instanceof NotCompleted) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl2.resumeWith(success);
                }
                Timber.Forest forest2 = Timber.Forest;
                forest2.tag("3DS");
                forest2.d("3DS SDK initialized successfully", new Object[0]);
            }

            @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service.InitializationCallback
            public final void onError(Throwable th) {
                Object failure;
                if (th instanceof SDKAlreadyInitializedException) {
                    Timber.Forest forest2 = Timber.Forest;
                    forest2.tag("3DS");
                    forest2.d("3DS SDK was already initialized", new Object[0]);
                    failure = new InitializationResult.Success(true);
                } else {
                    Timber.Forest forest3 = Timber.Forest;
                    forest3.tag("3DS");
                    forest3.w("3DS SDK failed to initialize", new Object[0], th);
                    failure = new InitializationResult.Failure(RealThreeDsService.asCashType(th));
                }
                CancellableContinuationImpl cancellableContinuationImpl2 = CancellableContinuationImpl.this;
                if (cancellableContinuationImpl2.getState$kotlinx_coroutines_core() instanceof NotCompleted) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl2.resumeWith(failure);
                }
            }
        });
        cancellableContinuationImpl.invokeOnCancellation(new KClasses$$Lambda$2(realThreeDsService, 20));
        Object result = cancellableContinuationImpl.getResult();
        return result == coroutineSingletons ? coroutineSingletons : result;
    }
}
