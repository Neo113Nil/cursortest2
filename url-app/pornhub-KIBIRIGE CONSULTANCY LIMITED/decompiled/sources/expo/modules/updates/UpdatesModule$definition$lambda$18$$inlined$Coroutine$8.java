package expo.modules.updates;

import expo.modules.updates.logging.UpdatesLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AsyncFunctionBuilder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$Coroutine$8", f = "UpdatesModule.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class UpdatesModule$definition$lambda$18$$inlined$Coroutine$8 extends SuspendLambda implements Function3<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UpdatesModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatesModule$definition$lambda$18$$inlined$Coroutine$8(Continuation continuation, UpdatesModule updatesModule) {
        super(3, continuation);
        this.this$0 = updatesModule;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        UpdatesModule$definition$lambda$18$$inlined$Coroutine$8 updatesModule$definition$lambda$18$$inlined$Coroutine$8 = new UpdatesModule$definition$lambda$18$$inlined$Coroutine$8(continuation, this.this$0);
        updatesModule$definition$lambda$18$$inlined$Coroutine$8.L$0 = objArr;
        return updatesModule$definition$lambda$18$$inlined$Coroutine$8.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UpdatesLogger logger;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) obj2;
            logger = this.this$0.getLogger();
            UpdatesLogger.debug$default(logger, "Called setExtraParamAsync with key = " + str2 + ", value = " + str, null, 2, null);
            IUpdatesController updatesController = UpdatesController.getInstance();
            this.label = 1;
            if (updatesController.setExtraParam(str2, str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
