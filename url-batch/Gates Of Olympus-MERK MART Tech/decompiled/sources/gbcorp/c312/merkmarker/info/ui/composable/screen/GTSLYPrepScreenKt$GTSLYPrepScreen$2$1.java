package gbcorp.c312.merkmarker.info.ui.composable.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GTSLYPrepScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.composable.screen.GTSLYPrepScreenKt$GTSLYPrepScreen$2$1", f = "GTSLYPrepScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class GTSLYPrepScreenKt$GTSLYPrepScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onFallbackNavigation;
    final /* synthetic */ MutableState<Boolean> $permissionResolvedState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GTSLYPrepScreenKt$GTSLYPrepScreen$2$1(Function0<Unit> function0, MutableState<Boolean> mutableState, Continuation<? super GTSLYPrepScreenKt$GTSLYPrepScreen$2$1> continuation) {
        super(2, continuation);
        this.$onFallbackNavigation = function0;
        this.$permissionResolvedState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GTSLYPrepScreenKt$GTSLYPrepScreen$2$1(this.$onFallbackNavigation, this.$permissionResolvedState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GTSLYPrepScreenKt$GTSLYPrepScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean GTSLYPrepScreen$lambda$2;
        boolean emulatorCheck;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GTSLYPrepScreen$lambda$2 = GTSLYPrepScreenKt.GTSLYPrepScreen$lambda$2(this.$permissionResolvedState$delegate);
            if (!GTSLYPrepScreen$lambda$2) {
                return Unit.INSTANCE;
            }
            emulatorCheck = GTSLYPrepScreenKt.emulatorCheck();
            if (emulatorCheck) {
                this.$onFallbackNavigation.invoke();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
