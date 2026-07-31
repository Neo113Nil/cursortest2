package androidx.compose.foundation.lazy;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyListState.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", f = "LazyListState.kt", l = {TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME}, m = "waitForFirstLayout")
/* loaded from: classes4.dex */
final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AwaitFirstLayoutModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, Continuation continuation) {
        super(continuation);
        this.this$0 = awaitFirstLayoutModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitForFirstLayout(this);
    }
}
