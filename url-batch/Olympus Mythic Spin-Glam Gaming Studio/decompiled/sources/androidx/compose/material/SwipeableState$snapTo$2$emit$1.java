package androidx.compose.material;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Swipeable.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", l = {Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE}, m = "emit")
/* loaded from: classes14.dex */
final class SwipeableState$snapTo$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState$snapTo$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$snapTo$2$emit$1(SwipeableState$snapTo$2 swipeableState$snapTo$2, Continuation continuation) {
        super(continuation);
        this.this$0 = swipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (Continuation) this);
    }
}
