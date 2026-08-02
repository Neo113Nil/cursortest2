package kotlinx.coroutines.flow;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FinishSetupTileBadgeCounter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1(FinishSetupTileBadgeCounter finishSetupTileBadgeCounter, Continuation continuation) {
        super(continuation);
        this.this$0 = finishSetupTileBadgeCounter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.collect(null, this);
    }
}
