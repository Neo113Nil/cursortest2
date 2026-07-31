package androidx.compose.foundation.relocation;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BringIntoViewRequester.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "bringIntoView")
/* loaded from: classes5.dex */
final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BringIntoViewRequesterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.bringIntoView(null, this);
    }
}
