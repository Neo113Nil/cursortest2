package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.objectweb.asm.Opcodes;

/* compiled from: ReadSession.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ReadSessionKt", f = "ReadSession.kt", i = {0}, l = {Opcodes.I2L}, m = "requestBufferFallback", n = {"chunk"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class ReadSessionKt$requestBufferFallback$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ReadSessionKt$requestBufferFallback$1(Continuation<? super ReadSessionKt$requestBufferFallback$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object requestBufferFallback;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        requestBufferFallback = ReadSessionKt.requestBufferFallback(null, 0, this);
        return requestBufferFallback;
    }
}
