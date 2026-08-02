package kotlinx.coroutines.flow.internal;

import com.squareup.util.coroutines.FlowExtensionsKt$runUntil$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CombineKt$zipImpl$1$1$second$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowExtensionsKt$runUntil$1$1.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$second$1$1$emit$1(FlowExtensionsKt$runUntil$1$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
