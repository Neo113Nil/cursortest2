package com.squareup.util.coroutines;

import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class BufferCountKt$bufferSkip$1$1$emit$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public FlowCollector L$1;
    public Iterator L$2;
    public Iterator L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BufferCountKt$bufferSkip$1.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCountKt$bufferSkip$1$1$emit$1(BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
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
