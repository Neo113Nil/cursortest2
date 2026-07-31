package androidx.compose.foundation.gestures;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Draggable.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 324, 333, 335}, m = "awaitDownAndSlop")
/* loaded from: classes.dex */
final class DraggableKt$awaitDownAndSlop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    DraggableKt$awaitDownAndSlop$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object awaitDownAndSlop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitDownAndSlop = DraggableKt.awaitDownAndSlop(null, null, null, null, null, this);
        return awaitDownAndSlop;
    }
}
