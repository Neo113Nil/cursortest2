package coil3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RealImageLoader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {118, 130, 134}, m = "execute", n = {"requestDelegate", "request", "eventListener", "requestDelegate", "request", "eventListener", "cachedPlaceholder", "requestDelegate", "request", "eventListener"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes3.dex */
final class RealImageLoader$execute$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader$execute$3(RealImageLoader realImageLoader, Continuation<? super RealImageLoader$execute$3> continuation) {
        super(continuation);
        this.this$0 = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object execute;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        execute = this.this$0.execute(null, 0, this);
        return execute;
    }
}
