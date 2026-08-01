package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: Delimited.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/LookAheadSuspendSession;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$copied$1", f = "Delimited.kt", i = {0, 0, 1, 1}, l = {85, 95}, m = "invokeSuspend", n = {"$this$lookAheadSuspend", "copied", "$this$lookAheadSuspend", "copied"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class DelimitedKt$readUntilDelimiterSuspend$copied$1 extends SuspendLambda implements Function2<LookAheadSuspendSession, Continuation<? super Integer>, Object> {
    final /* synthetic */ int $copied0;
    final /* synthetic */ ByteBuffer $delimiter;
    final /* synthetic */ ByteBuffer $dst;
    final /* synthetic */ Ref.BooleanRef $endFound;
    final /* synthetic */ ByteReadChannel $this_readUntilDelimiterSuspend;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DelimitedKt$readUntilDelimiterSuspend$copied$1(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, Ref.BooleanRef booleanRef, ByteReadChannel byteReadChannel, Continuation<? super DelimitedKt$readUntilDelimiterSuspend$copied$1> continuation) {
        super(2, continuation);
        this.$copied0 = i;
        this.$delimiter = byteBuffer;
        this.$dst = byteBuffer2;
        this.$endFound = booleanRef;
        this.$this_readUntilDelimiterSuspend = byteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DelimitedKt$readUntilDelimiterSuspend$copied$1 delimitedKt$readUntilDelimiterSuspend$copied$1 = new DelimitedKt$readUntilDelimiterSuspend$copied$1(this.$copied0, this.$delimiter, this.$dst, this.$endFound, this.$this_readUntilDelimiterSuspend, continuation);
        delimitedKt$readUntilDelimiterSuspend$copied$1.L$0 = obj;
        return delimitedKt$readUntilDelimiterSuspend$copied$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LookAheadSuspendSession lookAheadSuspendSession, Continuation<? super Integer> continuation) {
        return ((DelimitedKt$readUntilDelimiterSuspend$copied$1) create(lookAheadSuspendSession, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a2, code lost:
    
        if (r4.$endFound.element == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r1 = r1 + r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0086 -> B:6:0x0089). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LookAheadSuspendSession lookAheadSuspendSession;
        int i;
        DelimitedKt$readUntilDelimiterSuspend$copied$1 delimitedKt$readUntilDelimiterSuspend$copied$1;
        DelimitedKt$readUntilDelimiterSuspend$copied$1 delimitedKt$readUntilDelimiterSuspend$copied$12;
        LookAheadSuspendSession lookAheadSuspendSession2;
        int tryCopyUntilDelimiter;
        int startsWithDelimiter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            lookAheadSuspendSession = (LookAheadSuspendSession) this.L$0;
            i = this.$copied0;
            delimitedKt$readUntilDelimiterSuspend$copied$1 = this;
            delimitedKt$readUntilDelimiterSuspend$copied$1.L$0 = lookAheadSuspendSession;
            delimitedKt$readUntilDelimiterSuspend$copied$1.I$0 = i;
            delimitedKt$readUntilDelimiterSuspend$copied$1.label = 1;
            if (lookAheadSuspendSession.awaitAtLeast(1, delimitedKt$readUntilDelimiterSuspend$copied$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            DelimitedKt$readUntilDelimiterSuspend$copied$1 delimitedKt$readUntilDelimiterSuspend$copied$13 = delimitedKt$readUntilDelimiterSuspend$copied$1;
            lookAheadSuspendSession2 = lookAheadSuspendSession;
            delimitedKt$readUntilDelimiterSuspend$copied$12 = delimitedKt$readUntilDelimiterSuspend$copied$13;
            LookAheadSuspendSession lookAheadSuspendSession3 = lookAheadSuspendSession2;
            tryCopyUntilDelimiter = DelimitedKt.tryCopyUntilDelimiter(lookAheadSuspendSession3, delimitedKt$readUntilDelimiterSuspend$copied$12.$delimiter, delimitedKt$readUntilDelimiterSuspend$copied$12.$dst);
            if (tryCopyUntilDelimiter == 0) {
            }
            LookAheadSuspendSession lookAheadSuspendSession4 = lookAheadSuspendSession2;
            delimitedKt$readUntilDelimiterSuspend$copied$1 = delimitedKt$readUntilDelimiterSuspend$copied$12;
            lookAheadSuspendSession = lookAheadSuspendSession4;
            if (delimitedKt$readUntilDelimiterSuspend$copied$1.$dst.hasRemaining()) {
            }
            return Boxing.boxInt(i);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            lookAheadSuspendSession2 = (LookAheadSuspendSession) this.L$0;
            ResultKt.throwOnFailure(obj);
            delimitedKt$readUntilDelimiterSuspend$copied$12 = this;
            LookAheadSuspendSession lookAheadSuspendSession42 = lookAheadSuspendSession2;
            delimitedKt$readUntilDelimiterSuspend$copied$1 = delimitedKt$readUntilDelimiterSuspend$copied$12;
            lookAheadSuspendSession = lookAheadSuspendSession42;
            if (delimitedKt$readUntilDelimiterSuspend$copied$1.$dst.hasRemaining()) {
            }
            return Boxing.boxInt(i);
        }
        i = this.I$0;
        lookAheadSuspendSession2 = (LookAheadSuspendSession) this.L$0;
        ResultKt.throwOnFailure(obj);
        delimitedKt$readUntilDelimiterSuspend$copied$12 = this;
        LookAheadSuspendSession lookAheadSuspendSession32 = lookAheadSuspendSession2;
        tryCopyUntilDelimiter = DelimitedKt.tryCopyUntilDelimiter(lookAheadSuspendSession32, delimitedKt$readUntilDelimiterSuspend$copied$12.$delimiter, delimitedKt$readUntilDelimiterSuspend$copied$12.$dst);
        if (tryCopyUntilDelimiter == 0) {
            startsWithDelimiter = DelimitedKt.startsWithDelimiter(lookAheadSuspendSession32, delimitedKt$readUntilDelimiterSuspend$copied$12.$delimiter);
            if (startsWithDelimiter == delimitedKt$readUntilDelimiterSuspend$copied$12.$delimiter.remaining()) {
                delimitedKt$readUntilDelimiterSuspend$copied$12.$endFound.element = true;
            } else if (!delimitedKt$readUntilDelimiterSuspend$copied$12.$this_readUntilDelimiterSuspend.isClosedForWrite()) {
                delimitedKt$readUntilDelimiterSuspend$copied$12.L$0 = lookAheadSuspendSession2;
                delimitedKt$readUntilDelimiterSuspend$copied$12.I$0 = i;
                delimitedKt$readUntilDelimiterSuspend$copied$12.label = 2;
                if (lookAheadSuspendSession2.awaitAtLeast(delimitedKt$readUntilDelimiterSuspend$copied$12.$delimiter.remaining(), delimitedKt$readUntilDelimiterSuspend$copied$12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxInt(i);
        }
        if (tryCopyUntilDelimiter <= 0) {
            delimitedKt$readUntilDelimiterSuspend$copied$12.$endFound.element = true;
        }
        i += -tryCopyUntilDelimiter;
        LookAheadSuspendSession lookAheadSuspendSession422 = lookAheadSuspendSession2;
        delimitedKt$readUntilDelimiterSuspend$copied$1 = delimitedKt$readUntilDelimiterSuspend$copied$12;
        lookAheadSuspendSession = lookAheadSuspendSession422;
        if (delimitedKt$readUntilDelimiterSuspend$copied$1.$dst.hasRemaining()) {
        }
        return Boxing.boxInt(i);
    }
}
