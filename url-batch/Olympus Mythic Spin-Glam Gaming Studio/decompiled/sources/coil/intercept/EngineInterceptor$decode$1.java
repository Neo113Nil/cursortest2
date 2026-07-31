package coil.intercept;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EngineInterceptor.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {199}, m = "decode")
/* loaded from: classes13.dex */
final class EngineInterceptor$decode$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$decode$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.this$0 = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object decode;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        decode = this.this$0.decode(null, null, null, null, null, null, this);
        return decode;
    }
}
