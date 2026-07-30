package com.chicken.road.cerman.fixs.roost;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RoostBeacon.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.cerman.fixs.roost.RoostBeacon$activate$2", f = "RoostBeacon.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RoostBeacon$activate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $key;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoostBeacon$activate$2(Context context, String str, Continuation<? super RoostBeacon$activate$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoostBeacon$activate$2 roostBeacon$activate$2 = new RoostBeacon$activate$2(this.$context, this.$key, continuation);
        roostBeacon$activate$2.L$0 = obj;
        return roostBeacon$activate$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((RoostBeacon$activate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m6819constructorimpl;
        boolean z;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Context applicationContext = this.$context.getApplicationContext();
        String str = this.$key;
        try {
            Result.Companion companion = Result.INSTANCE;
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            z = RoostBeacon.initialized;
            if (!z) {
                appsFlyerLib.init(str, null, applicationContext);
                appsFlyerLib.start(applicationContext);
                RoostBeacon roostBeacon = RoostBeacon.INSTANCE;
                RoostBeacon.initialized = true;
            }
            m6819constructorimpl = Result.m6819constructorimpl(appsFlyerLib.getAppsFlyerUID(applicationContext));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m6825isFailureimpl(m6819constructorimpl)) {
            return null;
        }
        return m6819constructorimpl;
    }
}
