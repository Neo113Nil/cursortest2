package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Hoverable.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {70}, m = "invoke$emitExit")
/* loaded from: classes9.dex */
final class HoverableKt$hoverable$2$invoke$emitExit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    HoverableKt$hoverable$2$invoke$emitExit$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HoverableKt$hoverable$2.invoke$emitExit(null, null, this);
    }
}
