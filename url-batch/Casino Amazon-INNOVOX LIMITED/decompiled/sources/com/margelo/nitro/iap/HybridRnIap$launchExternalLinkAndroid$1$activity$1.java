package com.margelo.nitro.iap;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
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

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/app/Activity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$launchExternalLinkAndroid$1$activity$1", f = "HybridRnIap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$launchExternalLinkAndroid$1$activity$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Activity>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$launchExternalLinkAndroid$1$activity$1(HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$launchExternalLinkAndroid$1$activity$1> continuation) {
        super(2, continuation);
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HybridRnIap$launchExternalLinkAndroid$1$activity$1 hybridRnIap$launchExternalLinkAndroid$1$activity$1 = new HybridRnIap$launchExternalLinkAndroid$1$activity$1(this.this$0, continuation);
        hybridRnIap$launchExternalLinkAndroid$1$activity$1.L$0 = obj;
        return hybridRnIap$launchExternalLinkAndroid$1$activity$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Activity> continuation) {
        return ((HybridRnIap$launchExternalLinkAndroid$1$activity$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m3984constructorimpl;
        ReactApplicationContext context;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HybridRnIap hybridRnIap = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            context = hybridRnIap.getContext();
            m3984constructorimpl = Result.m3984constructorimpl(context.getCurrentActivity());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl)) {
            return null;
        }
        return m3984constructorimpl;
    }
}
