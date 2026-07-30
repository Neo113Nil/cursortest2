package com.chicken.road.kedbags.data.device;

import com.chicken.road.kedbags.data.remote.FrostCatchConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: FrostSignalCollector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/chicken/road/kedbags/data/device/FrostSignals;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.kedbags.data.device.FrostSignalCollector$collect$2", f = "FrostSignalCollector.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {24, 25, 26}, m = "invokeSuspend", n = {"$this$coroutineScope", FrostCatchConfig.KEY_AD_ID, FrostCatchConfig.KEY_INSTALL_REFERRER, FrostCatchConfig.KEY_ANDROID_ID, "$this$coroutineScope", FrostCatchConfig.KEY_AD_ID, FrostCatchConfig.KEY_INSTALL_REFERRER, FrostCatchConfig.KEY_ANDROID_ID, "$this$coroutineScope", FrostCatchConfig.KEY_AD_ID, FrostCatchConfig.KEY_INSTALL_REFERRER, FrostCatchConfig.KEY_ANDROID_ID}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes2.dex */
final class FrostSignalCollector$collect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FrostSignals>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ FrostSignalCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrostSignalCollector$collect$2(FrostSignalCollector frostSignalCollector, Continuation<? super FrostSignalCollector$collect$2> continuation) {
        super(2, continuation);
        this.this$0 = frostSignalCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FrostSignalCollector$collect$2 frostSignalCollector$collect$2 = new FrostSignalCollector$collect$2(this.this$0, continuation);
        frostSignalCollector$collect$2.L$0 = obj;
        return frostSignalCollector$collect$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FrostSignals> continuation) {
        return ((FrostSignalCollector$collect$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0105  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Deferred async$default2;
        Deferred async$default3;
        Deferred deferred;
        Deferred deferred2;
        Deferred deferred3;
        String str;
        Object await;
        String str2;
        String str3;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FrostSignalCollector$collect$2$hookRune$1(this.this$0, null), 3, null);
            async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FrostSignalCollector$collect$2$iceLantern$1(this.this$0, null), 3, null);
            async$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FrostSignalCollector$collect$2$perchWhisper$1(this.this$0, null), 3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.L$1 = SpillingKt.nullOutSpilledVariable(async$default);
            this.L$2 = async$default2;
            this.L$3 = async$default3;
            this.label = 1;
            Object await2 = async$default.await(this);
            if (await2 != coroutine_suspended) {
                deferred = async$default;
                obj = await2;
                deferred2 = async$default2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.L$5;
                str3 = (String) this.L$4;
                ResultKt.throwOnFailure(obj);
                return new FrostSignals(str3, str2, (String) obj);
            }
            str = (String) this.L$4;
            deferred3 = (Deferred) this.L$3;
            deferred2 = (Deferred) this.L$2;
            deferred = (Deferred) this.L$1;
            ResultKt.throwOnFailure(obj);
            String str4 = (String) obj;
            this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.L$1 = SpillingKt.nullOutSpilledVariable(deferred);
            this.L$2 = SpillingKt.nullOutSpilledVariable(deferred2);
            this.L$3 = SpillingKt.nullOutSpilledVariable(deferred3);
            this.L$4 = str;
            this.L$5 = str4;
            this.label = 3;
            await = deferred3.await(this);
            if (await != coroutine_suspended) {
                str2 = str4;
                str3 = str;
                obj = await;
                return new FrostSignals(str3, str2, (String) obj);
            }
            return coroutine_suspended;
        }
        async$default3 = (Deferred) this.L$3;
        Deferred deferred4 = (Deferred) this.L$2;
        Deferred deferred5 = (Deferred) this.L$1;
        ResultKt.throwOnFailure(obj);
        deferred = deferred5;
        deferred2 = deferred4;
        deferred3 = async$default3;
        String str5 = (String) obj;
        this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.L$1 = SpillingKt.nullOutSpilledVariable(deferred);
        this.L$2 = SpillingKt.nullOutSpilledVariable(deferred2);
        this.L$3 = deferred3;
        this.L$4 = str5;
        this.label = 2;
        Object await3 = deferred2.await(this);
        if (await3 != coroutine_suspended) {
            str = str5;
            obj = await3;
            String str42 = (String) obj;
            this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.L$1 = SpillingKt.nullOutSpilledVariable(deferred);
            this.L$2 = SpillingKt.nullOutSpilledVariable(deferred2);
            this.L$3 = SpillingKt.nullOutSpilledVariable(deferred3);
            this.L$4 = str;
            this.L$5 = str42;
            this.label = 3;
            await = deferred3.await(this);
            if (await != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
