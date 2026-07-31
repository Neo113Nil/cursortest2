package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Animatable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class Animatable$stop$2 extends SuspendLambda implements Function1 {
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Animatable$stop$2(Animatable<T, V> animatable, Continuation continuation) {
        super(1, continuation);
        this.this$0 = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@NotNull Continuation continuation) {
        return new Animatable$stop$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation continuation) {
        return ((Animatable$stop$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.endAnimation();
        return Unit.INSTANCE;
    }
}
