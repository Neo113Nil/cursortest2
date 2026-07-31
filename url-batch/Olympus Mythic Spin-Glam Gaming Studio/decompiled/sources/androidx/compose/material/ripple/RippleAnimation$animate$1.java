package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RippleAnimation.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {80, 82, 83}, m = "animate")
/* loaded from: classes11.dex */
final class RippleAnimation$animate$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RippleAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RippleAnimation$animate$1(RippleAnimation rippleAnimation, Continuation continuation) {
        super(continuation);
        this.this$0 = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animate(this);
    }
}
