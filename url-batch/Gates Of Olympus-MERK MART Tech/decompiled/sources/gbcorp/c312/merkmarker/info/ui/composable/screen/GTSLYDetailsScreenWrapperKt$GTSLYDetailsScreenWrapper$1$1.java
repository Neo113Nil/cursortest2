package gbcorp.c312.merkmarker.info.ui.composable.screen;

import android.content.Context;
import gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYDetailsScreenViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GTSLYDetailsScreenWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.ui.composable.screen.GTSLYDetailsScreenWrapperKt$GTSLYDetailsScreenWrapper$1$1", f = "GTSLYDetailsScreenWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class GTSLYDetailsScreenWrapperKt$GTSLYDetailsScreenWrapper$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ GTSLYDetailsScreenViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GTSLYDetailsScreenWrapperKt$GTSLYDetailsScreenWrapper$1$1(GTSLYDetailsScreenViewModel gTSLYDetailsScreenViewModel, Context context, Continuation<? super GTSLYDetailsScreenWrapperKt$GTSLYDetailsScreenWrapper$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = gTSLYDetailsScreenViewModel;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GTSLYDetailsScreenWrapperKt$GTSLYDetailsScreenWrapper$1$1(this.$viewModel, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GTSLYDetailsScreenWrapperKt$GTSLYDetailsScreenWrapper$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$viewModel.updateGTSLYDetails(this.$context);
        return Unit.INSTANCE;
    }
}
