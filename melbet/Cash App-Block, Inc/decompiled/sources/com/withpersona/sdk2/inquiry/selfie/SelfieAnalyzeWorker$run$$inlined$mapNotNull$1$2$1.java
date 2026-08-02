package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    public FlowCollector L$0;
    public SelfieFrameInfo L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1(FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
