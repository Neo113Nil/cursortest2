package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TransformableState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TransformableStateKt$zoomBy$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ float $zoomFactor;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$zoomBy$2(float f, Continuation continuation) {
        super(2, continuation);
        this.$zoomFactor = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        TransformableStateKt$zoomBy$2 transformableStateKt$zoomBy$2 = new TransformableStateKt$zoomBy$2(this.$zoomFactor, continuation);
        transformableStateKt$zoomBy$2.L$0 = obj;
        return transformableStateKt$zoomBy$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation continuation) {
        return ((TransformableStateKt$zoomBy$2) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ((TransformScope) this.L$0).mo225transformByd4ec7I(this.$zoomFactor, Offset.INSTANCE.m1308getZeroF1C5BW0(), 0.0f);
        return Unit.INSTANCE;
    }
}
