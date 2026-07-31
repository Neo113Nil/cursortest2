package com.margelo.nitro.iap;

import dev.hyo.openiap.BillingProgramAvailabilityResultAndroid;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.store.OpenIapStore;
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

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/margelo/nitro/iap/NitroBillingProgramAvailabilityResultAndroid;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$isBillingProgramAvailableAndroid$1", f = "HybridRnIap.kt", i = {}, l = {1711, 1713}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$isBillingProgramAvailableAndroid$1 extends SuspendLambda implements Function1<Continuation<? super NitroBillingProgramAvailabilityResultAndroid>, Object> {
    final /* synthetic */ BillingProgramAndroid $program;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$isBillingProgramAvailableAndroid$1(BillingProgramAndroid billingProgramAndroid, HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$isBillingProgramAvailableAndroid$1> continuation) {
        super(1, continuation);
        this.$program = billingProgramAndroid;
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$isBillingProgramAvailableAndroid$1(this.$program, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super NitroBillingProgramAvailabilityResultAndroid> continuation) {
        return ((HybridRnIap$isBillingProgramAvailableAndroid$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r9 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OpenIapError parseOpenIapError;
        Object ensureConnection;
        dev.hyo.openiap.BillingProgramAndroid mapBillingProgram;
        OpenIapStore openIapStore;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RnIapLog.INSTANCE.payload("isBillingProgramAvailableAndroid", MapsKt.mapOf(TuplesKt.to("program", this.$program.name())));
                this.label = 1;
                ensureConnection = this.this$0.ensureConnection(this);
                if (ensureConnection == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    BillingProgramAvailabilityResultAndroid billingProgramAvailabilityResultAndroid = (BillingProgramAvailabilityResultAndroid) obj;
                    NitroBillingProgramAvailabilityResultAndroid nitroBillingProgramAvailabilityResultAndroid = new NitroBillingProgramAvailabilityResultAndroid(this.$program, billingProgramAvailabilityResultAndroid.isAvailable());
                    RnIapLog.INSTANCE.result("isBillingProgramAvailableAndroid", MapsKt.mapOf(TuplesKt.to("isAvailable", Boxing.boxBoolean(billingProgramAvailabilityResultAndroid.isAvailable()))));
                    return nitroBillingProgramAvailabilityResultAndroid;
                }
                ResultKt.throwOnFailure(obj);
            }
            mapBillingProgram = this.this$0.mapBillingProgram(this.$program);
            openIapStore = this.this$0.getOpenIapStore();
            this.label = 2;
            obj = openIapStore.isBillingProgramAvailable(mapBillingProgram, this);
        } catch (Throwable th) {
            RnIapLog.INSTANCE.failure("isBillingProgramAvailableAndroid", th);
            parseOpenIapError = this.this$0.parseOpenIapError(th);
            throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, parseOpenIapError, null, th.getMessage(), null, 10, null));
        }
    }
}
