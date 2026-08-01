package io.ktor.client.utils;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ByteArrayPoolKt;
import io.ktor.utils.io.pool.ObjectPool;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: ByteChannelUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3}, l = {23, 24, 26, 31}, m = "invokeSuspend", n = {"$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "read", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "I$0", "L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class ByteChannelUtilsKt$observable$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $contentLength;
    final /* synthetic */ Function3<Long, Long, Continuation<? super Unit>, Object> $listener;
    final /* synthetic */ ByteReadChannel $this_observable;
    int I$0;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ByteChannelUtilsKt$observable$1(Long l, ByteReadChannel byteReadChannel, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super ByteChannelUtilsKt$observable$1> continuation) {
        super(2, continuation);
        this.$contentLength = l;
        this.$this_observable = byteReadChannel;
        this.$listener = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ByteChannelUtilsKt$observable$1 byteChannelUtilsKt$observable$1 = new ByteChannelUtilsKt$observable$1(this.$contentLength, this.$this_observable, this.$listener, continuation);
        byteChannelUtilsKt$observable$1.L$0 = obj;
        return byteChannelUtilsKt$observable$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super Unit> continuation) {
        return ((ByteChannelUtilsKt$observable$1) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:9:0x001d, B:10:0x01a0, B:22:0x00e5, B:24:0x00eb, B:27:0x0104, B:42:0x016e, B:46:0x0181), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016e A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #1 {all -> 0x0022, blocks: (B:9:0x001d, B:10:0x01a0, B:22:0x00e5, B:24:0x00eb, B:27:0x0104, B:42:0x016e, B:46:0x0181), top: B:2:0x000c }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015a -> B:21:0x0164). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ObjectPool objectPool;
        WriterScope writerScope;
        Object obj2;
        long j;
        ByteChannelUtilsKt$observable$1 byteChannelUtilsKt$observable$1;
        ByteReadChannel byteReadChannel;
        long longValue;
        Function3<Long, Long, Continuation<? super Unit>, Object> function3;
        byte[] bArr;
        ByteReadChannel byteReadChannel2;
        Function3<Long, Long, Continuation<? super Unit>, Object> function32;
        Object obj3;
        long j2;
        ObjectPool objectPool2;
        byte[] bArr2;
        long j3;
        int i;
        long j4;
        Long boxLong;
        Long boxLong2;
        Object obj4;
        Object obj5;
        int intValue;
        ByteWriteChannel channel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = this.label;
        int i2 = 1;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(obj);
                WriterScope writerScope2 = (WriterScope) this.L$0;
                objectPool = ByteArrayPoolKt.getByteArrayPool();
                Long l = this.$contentLength;
                ByteReadChannel byteReadChannel3 = this.$this_observable;
                Function3<Long, Long, Continuation<? super Unit>, Object> function33 = this.$listener;
                Object borrow = objectPool.borrow();
                try {
                    byte[] bArr3 = (byte[]) borrow;
                    writerScope = writerScope2;
                    obj2 = borrow;
                    j = 0;
                    byteChannelUtilsKt$observable$1 = this;
                    byteReadChannel = byteReadChannel3;
                    longValue = l != null ? l.longValue() : -1L;
                    function3 = function33;
                    bArr = bArr3;
                    if (!byteReadChannel.isClosedForRead()) {
                    }
                } catch (Throwable th) {
                    th = th;
                    r2 = borrow;
                }
            } else if (r2 == 1) {
                long j5 = this.J$1;
                longValue = this.J$0;
                bArr = (byte[]) this.L$5;
                Object obj6 = this.L$4;
                function3 = (Function3) this.L$3;
                byteReadChannel = (ByteReadChannel) this.L$2;
                ObjectPool objectPool3 = (ObjectPool) this.L$1;
                writerScope = (WriterScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    j = j5;
                    obj5 = obj6;
                    objectPool = objectPool3;
                    byteChannelUtilsKt$observable$1 = this;
                    intValue = ((Number) obj4).intValue();
                    channel = writerScope.getChannel();
                    byteChannelUtilsKt$observable$1.L$0 = writerScope;
                    byteChannelUtilsKt$observable$1.L$1 = objectPool;
                    byteChannelUtilsKt$observable$1.L$2 = byteReadChannel;
                    byteChannelUtilsKt$observable$1.L$3 = function3;
                    byteChannelUtilsKt$observable$1.L$4 = obj5;
                    byteChannelUtilsKt$observable$1.L$5 = bArr;
                    byteChannelUtilsKt$observable$1.J$0 = longValue;
                    byteChannelUtilsKt$observable$1.J$1 = j;
                    byteChannelUtilsKt$observable$1.I$0 = intValue;
                    byteChannelUtilsKt$observable$1.label = 2;
                    if (channel.writeFully(bArr, 0, intValue, byteChannelUtilsKt$observable$1) != coroutine_suspended) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r2 = obj6;
                    objectPool = objectPool3;
                }
            } else if (r2 == 2) {
                i = this.I$0;
                j3 = this.J$1;
                long j6 = this.J$0;
                bArr2 = (byte[]) this.L$5;
                obj3 = this.L$4;
                function32 = (Function3) this.L$3;
                ByteReadChannel byteReadChannel4 = (ByteReadChannel) this.L$2;
                ObjectPool objectPool4 = (ObjectPool) this.L$1;
                WriterScope writerScope3 = (WriterScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    j2 = j6;
                    objectPool2 = objectPool4;
                    writerScope = writerScope3;
                    byteChannelUtilsKt$observable$1 = this;
                    byteReadChannel2 = byteReadChannel4;
                    j4 = i + j3;
                    boxLong = Boxing.boxLong(j4);
                    boxLong2 = Boxing.boxLong(j2);
                    byteChannelUtilsKt$observable$1.L$0 = writerScope;
                    byteChannelUtilsKt$observable$1.L$1 = objectPool2;
                    byteChannelUtilsKt$observable$1.L$2 = byteReadChannel2;
                    byteChannelUtilsKt$observable$1.L$3 = function32;
                    byteChannelUtilsKt$observable$1.L$4 = obj3;
                    byteChannelUtilsKt$observable$1.L$5 = bArr2;
                    byteChannelUtilsKt$observable$1.J$0 = j2;
                    byteChannelUtilsKt$observable$1.J$1 = j4;
                    byteChannelUtilsKt$observable$1.label = 3;
                    if (function32.invoke(boxLong, boxLong2, byteChannelUtilsKt$observable$1) != coroutine_suspended) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r2 = obj3;
                    objectPool = objectPool4;
                }
            } else {
                if (r2 != 3) {
                    if (r2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj7 = this.L$1;
                    objectPool = (ObjectPool) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r2 = obj7;
                    Unit unit = Unit.INSTANCE;
                    objectPool.recycle(r2);
                    return Unit.INSTANCE;
                }
                long j7 = this.J$1;
                long j8 = this.J$0;
                byte[] bArr4 = (byte[]) this.L$5;
                Object obj8 = this.L$4;
                Function3<Long, Long, Continuation<? super Unit>, Object> function34 = (Function3) this.L$3;
                ByteReadChannel byteReadChannel5 = (ByteReadChannel) this.L$2;
                ObjectPool objectPool5 = (ObjectPool) this.L$1;
                WriterScope writerScope4 = (WriterScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    byteChannelUtilsKt$observable$1 = this;
                    byte[] bArr5 = bArr4;
                    j = j7;
                    Object obj9 = obj8;
                    writerScope = writerScope4;
                    objectPool = objectPool5;
                    longValue = j8;
                    function3 = function34;
                    byteReadChannel = byteReadChannel5;
                    bArr = bArr5;
                    i2 = 1;
                    obj2 = obj9;
                    if (!byteReadChannel.isClosedForRead()) {
                        byteChannelUtilsKt$observable$1.L$0 = writerScope;
                        byteChannelUtilsKt$observable$1.L$1 = objectPool;
                        byteChannelUtilsKt$observable$1.L$2 = byteReadChannel;
                        byteChannelUtilsKt$observable$1.L$3 = function3;
                        byteChannelUtilsKt$observable$1.L$4 = obj2;
                        byteChannelUtilsKt$observable$1.L$5 = bArr;
                        byteChannelUtilsKt$observable$1.J$0 = longValue;
                        byteChannelUtilsKt$observable$1.J$1 = j;
                        byteChannelUtilsKt$observable$1.label = i2;
                        obj4 = ByteReadChannelKt.readAvailable(byteReadChannel, bArr, byteChannelUtilsKt$observable$1);
                        obj5 = obj2;
                        if (obj4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        intValue = ((Number) obj4).intValue();
                        channel = writerScope.getChannel();
                        byteChannelUtilsKt$observable$1.L$0 = writerScope;
                        byteChannelUtilsKt$observable$1.L$1 = objectPool;
                        byteChannelUtilsKt$observable$1.L$2 = byteReadChannel;
                        byteChannelUtilsKt$observable$1.L$3 = function3;
                        byteChannelUtilsKt$observable$1.L$4 = obj5;
                        byteChannelUtilsKt$observable$1.L$5 = bArr;
                        byteChannelUtilsKt$observable$1.J$0 = longValue;
                        byteChannelUtilsKt$observable$1.J$1 = j;
                        byteChannelUtilsKt$observable$1.I$0 = intValue;
                        byteChannelUtilsKt$observable$1.label = 2;
                        if (channel.writeFully(bArr, 0, intValue, byteChannelUtilsKt$observable$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        try {
                            byteReadChannel2 = byteReadChannel;
                            function32 = function3;
                            obj3 = obj5;
                            i = intValue;
                            long j9 = j;
                            objectPool2 = objectPool;
                            j2 = longValue;
                            j3 = j9;
                            bArr2 = bArr;
                            boxLong = Boxing.boxLong(j4);
                            boxLong2 = Boxing.boxLong(j2);
                            byteChannelUtilsKt$observable$1.L$0 = writerScope;
                            byteChannelUtilsKt$observable$1.L$1 = objectPool2;
                            byteChannelUtilsKt$observable$1.L$2 = byteReadChannel2;
                            byteChannelUtilsKt$observable$1.L$3 = function32;
                            byteChannelUtilsKt$observable$1.L$4 = obj3;
                            byteChannelUtilsKt$observable$1.L$5 = bArr2;
                            byteChannelUtilsKt$observable$1.J$0 = j2;
                            byteChannelUtilsKt$observable$1.J$1 = j4;
                            byteChannelUtilsKt$observable$1.label = 3;
                            if (function32.invoke(boxLong, boxLong2, byteChannelUtilsKt$observable$1) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectPool = objectPool2;
                            bArr5 = bArr2;
                            longValue = j2;
                            obj9 = obj3;
                            function3 = function32;
                            byteReadChannel = byteReadChannel2;
                            j = j4;
                            bArr = bArr5;
                            i2 = 1;
                            obj2 = obj9;
                            if (!byteReadChannel.isClosedForRead()) {
                                Throwable closedCause = byteReadChannel.getClosedCause();
                                writerScope.getChannel().close(closedCause);
                                r2 = obj2;
                                if (closedCause == null) {
                                    r2 = obj2;
                                    if (j == 0) {
                                        Long boxLong3 = Boxing.boxLong(j);
                                        Long boxLong4 = Boxing.boxLong(longValue);
                                        byteChannelUtilsKt$observable$1.L$0 = objectPool;
                                        byteChannelUtilsKt$observable$1.L$1 = obj2;
                                        byteChannelUtilsKt$observable$1.L$2 = null;
                                        byteChannelUtilsKt$observable$1.L$3 = null;
                                        byteChannelUtilsKt$observable$1.L$4 = null;
                                        byteChannelUtilsKt$observable$1.L$5 = null;
                                        byteChannelUtilsKt$observable$1.label = 4;
                                        r2 = obj2;
                                        if (function3.invoke(boxLong3, boxLong4, byteChannelUtilsKt$observable$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                                objectPool.recycle(r2);
                                return Unit.INSTANCE;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            objectPool = objectPool2;
                            r2 = obj3;
                        }
                        j4 = i + j3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    objectPool = objectPool5;
                    r2 = obj8;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
        objectPool.recycle(r2);
        throw th;
    }
}
