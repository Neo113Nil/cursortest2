package androidx.lifecycle;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineLiveData.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m = "emitSource$lifecycle_livedata", v = 1)
/* loaded from: classes11.dex */
final class CoroutineLiveData$emitSource$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutineLiveData<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineLiveData$emitSource$1(CoroutineLiveData<T> coroutineLiveData, Continuation continuation) {
        super(continuation);
        this.this$0 = coroutineLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emitSource$lifecycle_livedata(null, this);
    }
}
