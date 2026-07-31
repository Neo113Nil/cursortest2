package com.margelo.nitro.iap;

import android.app.Activity;
import dev.hyo.openiap.LaunchExternalLinkParamsAndroid;
import dev.hyo.openiap.OpenIapError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$launchExternalLinkAndroid$1", f = "HybridRnIap.kt", i = {}, l = {1758, 1760, 1771}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$launchExternalLinkAndroid$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ NitroLaunchExternalLinkParamsAndroid $params;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$launchExternalLinkAndroid$1(NitroLaunchExternalLinkParamsAndroid nitroLaunchExternalLinkParamsAndroid, HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$launchExternalLinkAndroid$1> continuation) {
        super(1, continuation);
        this.$params = nitroLaunchExternalLinkParamsAndroid;
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$launchExternalLinkAndroid$1(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((HybridRnIap$launchExternalLinkAndroid$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f6, code lost:
    
        if (r12 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x0014, B:8:0x00f9, B:14:0x0021, B:15:0x00ab, B:17:0x00af, B:20:0x010d, B:21:0x0124, B:22:0x0026, B:23:0x0090, B:27:0x0082), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010d A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x0014, B:8:0x00f9, B:14:0x0021, B:15:0x00ab, B:17:0x00af, B:20:0x010d, B:21:0x0124, B:22:0x0026, B:23:0x0090, B:27:0x0082), top: B:2:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OpenIapError parseOpenIapError;
        Object ensureConnection;
        Activity activity;
        dev.hyo.openiap.BillingProgramAndroid mapBillingProgram;
        dev.hyo.openiap.ExternalLinkLaunchModeAndroid mapExternalLinkLaunchMode;
        dev.hyo.openiap.ExternalLinkTypeAndroid mapExternalLinkType;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RnIapLog.INSTANCE.payload("launchExternalLinkAndroid", MapsKt.mapOf(TuplesKt.to("billingProgram", this.$params.getBillingProgram().name()), TuplesKt.to("launchMode", this.$params.getLaunchMode().name()), TuplesKt.to("linkType", this.$params.getLinkType().name()), TuplesKt.to("linkUri", this.$params.getLinkUri())));
                this.label = 1;
                ensureConnection = this.this$0.ensureConnection(this);
                if (ensureConnection == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    RnIapLog.INSTANCE.result("launchExternalLinkAndroid", Boxing.boxBoolean(booleanValue));
                    return Boxing.boxBoolean(booleanValue);
                }
                ResultKt.throwOnFailure(obj);
                activity = (Activity) obj;
                if (activity == null) {
                    mapBillingProgram = this.this$0.mapBillingProgram(this.$params.getBillingProgram());
                    mapExternalLinkLaunchMode = this.this$0.mapExternalLinkLaunchMode(this.$params.getLaunchMode());
                    mapExternalLinkType = this.this$0.mapExternalLinkType(this.$params.getLinkType());
                    LaunchExternalLinkParamsAndroid launchExternalLinkParamsAndroid = new LaunchExternalLinkParamsAndroid(mapBillingProgram, mapExternalLinkLaunchMode, mapExternalLinkType, this.$params.getLinkUri());
                    this.label = 3;
                    obj = BuildersKt.withContext(Dispatchers.getMain(), new HybridRnIap$launchExternalLinkAndroid$1$result$1(this.this$0, activity, launchExternalLinkParamsAndroid, null), this);
                } else {
                    throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, OpenIapError.DeveloperError.INSTANCE, null, "Activity not available", null, 10, null));
                }
            }
            this.label = 2;
            obj = BuildersKt.withContext(Dispatchers.getMain(), new HybridRnIap$launchExternalLinkAndroid$1$activity$1(this.this$0, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            activity = (Activity) obj;
            if (activity == null) {
            }
        } catch (Throwable th) {
            RnIapLog.INSTANCE.failure("launchExternalLinkAndroid", th);
            parseOpenIapError = this.this$0.parseOpenIapError(th);
            throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, parseOpenIapError, null, th.getMessage(), null, 10, null));
        }
    }
}
