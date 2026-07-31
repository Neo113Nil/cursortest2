package dev.hyo.openiap;

import dev.hyo.openiap.store.OpenIapStore;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OpenIapViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapViewModel$initConnection$1", f = "OpenIapViewModel.kt", i = {0, 0, 0}, l = {22}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-OpenIapViewModel$initConnection$1$1"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class OpenIapViewModel$initConnection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InitConnectionConfig $config;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OpenIapViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapViewModel$initConnection$1(OpenIapViewModel openIapViewModel, InitConnectionConfig initConnectionConfig, Continuation<? super OpenIapViewModel$initConnection$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapViewModel;
        this.$config = initConnectionConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapViewModel$initConnection$1 openIapViewModel$initConnection$1 = new OpenIapViewModel$initConnection$1(this.this$0, this.$config, continuation);
        openIapViewModel$initConnection$1.L$0 = obj;
        return openIapViewModel$initConnection$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OpenIapViewModel$initConnection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenIapStore openIapStore;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OpenIapViewModel openIapViewModel = this.this$0;
                InitConnectionConfig initConnectionConfig = this.$config;
                Result.Companion companion = Result.INSTANCE;
                openIapStore = openIapViewModel.store;
                Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> initConnection = openIapStore.getInitConnection();
                this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.L$1 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.I$0 = 0;
                this.label = 1;
                obj = initConnection.invoke(initConnectionConfig, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m3984constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
