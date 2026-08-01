package io.ktor.utils.io.internal;

import io.ktor.utils.io.ByteChannelSequentialBase;
import io.ktor.utils.io.ByteWriteChannelKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.ranges.RangesKt;

/* compiled from: SequentialCopyTo.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a%\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a%\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"copyToSequentialImpl", "", "Lio/ktor/utils/io/ByteChannelSequentialBase;", "dst", "limit", "(Lio/ktor/utils/io/ByteChannelSequentialBase;Lio/ktor/utils/io/ByteChannelSequentialBase;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyToTail", "joinToImpl", "", "closeOnEnd", "", "(Lio/ktor/utils/io/ByteChannelSequentialBase;Lio/ktor/utils/io/ByteChannelSequentialBase;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SequentialCopyToKt {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object joinToImpl(ByteChannelSequentialBase byteChannelSequentialBase, ByteChannelSequentialBase byteChannelSequentialBase2, boolean z, Continuation<? super Unit> continuation) {
        SequentialCopyToKt$joinToImpl$1 sequentialCopyToKt$joinToImpl$1;
        int i;
        if (continuation instanceof SequentialCopyToKt$joinToImpl$1) {
            sequentialCopyToKt$joinToImpl$1 = (SequentialCopyToKt$joinToImpl$1) continuation;
            if ((sequentialCopyToKt$joinToImpl$1.label & Integer.MIN_VALUE) != 0) {
                sequentialCopyToKt$joinToImpl$1.label -= Integer.MIN_VALUE;
                Object obj = sequentialCopyToKt$joinToImpl$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sequentialCopyToKt$joinToImpl$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    sequentialCopyToKt$joinToImpl$1.L$0 = byteChannelSequentialBase2;
                    sequentialCopyToKt$joinToImpl$1.Z$0 = z;
                    sequentialCopyToKt$joinToImpl$1.label = 1;
                    if (copyToSequentialImpl(byteChannelSequentialBase, byteChannelSequentialBase2, Long.MAX_VALUE, sequentialCopyToKt$joinToImpl$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = sequentialCopyToKt$joinToImpl$1.Z$0;
                    byteChannelSequentialBase2 = (ByteChannelSequentialBase) sequentialCopyToKt$joinToImpl$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (z) {
                    ByteWriteChannelKt.close(byteChannelSequentialBase2);
                }
                return Unit.INSTANCE;
            }
        }
        sequentialCopyToKt$joinToImpl$1 = new SequentialCopyToKt$joinToImpl$1(continuation);
        Object obj2 = sequentialCopyToKt$joinToImpl$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sequentialCopyToKt$joinToImpl$1.label;
        if (i != 0) {
        }
        if (z) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e8 -> B:13:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ef -> B:12:0x0104). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0101 -> B:12:0x0104). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyToSequentialImpl(ByteChannelSequentialBase byteChannelSequentialBase, ByteChannelSequentialBase byteChannelSequentialBase2, long j, Continuation<? super Long> continuation) {
        SequentialCopyToKt$copyToSequentialImpl$1 sequentialCopyToKt$copyToSequentialImpl$1;
        int i;
        ByteChannelSequentialBase byteChannelSequentialBase3;
        long j2;
        SequentialCopyToKt$copyToSequentialImpl$1 sequentialCopyToKt$copyToSequentialImpl$12;
        Object obj;
        long j3;
        long j4;
        long j5;
        ByteChannelSequentialBase byteChannelSequentialBase4;
        long longValue;
        long j6;
        long j7;
        ByteChannelSequentialBase byteChannelSequentialBase5 = byteChannelSequentialBase2;
        if (continuation instanceof SequentialCopyToKt$copyToSequentialImpl$1) {
            sequentialCopyToKt$copyToSequentialImpl$1 = (SequentialCopyToKt$copyToSequentialImpl$1) continuation;
            if ((sequentialCopyToKt$copyToSequentialImpl$1.label & Integer.MIN_VALUE) != 0) {
                sequentialCopyToKt$copyToSequentialImpl$1.label -= Integer.MIN_VALUE;
                Object obj2 = sequentialCopyToKt$copyToSequentialImpl$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sequentialCopyToKt$copyToSequentialImpl$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    byteChannelSequentialBase3 = byteChannelSequentialBase;
                    if (!(byteChannelSequentialBase3 != byteChannelSequentialBase5)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (byteChannelSequentialBase.getClosedCause() != null) {
                        byteChannelSequentialBase5.close(byteChannelSequentialBase.getClosedCause());
                        return Boxing.boxLong(0L);
                    }
                    j2 = j;
                    sequentialCopyToKt$copyToSequentialImpl$12 = sequentialCopyToKt$copyToSequentialImpl$1;
                    obj = coroutine_suspended;
                    j3 = j2;
                    if (j3 > 0) {
                    }
                    return Boxing.boxLong(j2 - j3);
                }
                if (i == 1) {
                    long j8 = sequentialCopyToKt$copyToSequentialImpl$1.J$1;
                    long j9 = sequentialCopyToKt$copyToSequentialImpl$1.J$0;
                    byteChannelSequentialBase5 = (ByteChannelSequentialBase) sequentialCopyToKt$copyToSequentialImpl$1.L$1;
                    byteChannelSequentialBase4 = (ByteChannelSequentialBase) sequentialCopyToKt$copyToSequentialImpl$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    j6 = j9;
                    j7 = j8;
                    if (((Boolean) obj2).booleanValue()) {
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long transferTo$ktor_io = sequentialCopyToKt$copyToSequentialImpl$1.J$2;
                        j7 = sequentialCopyToKt$copyToSequentialImpl$1.J$1;
                        j6 = sequentialCopyToKt$copyToSequentialImpl$1.J$0;
                        byteChannelSequentialBase5 = (ByteChannelSequentialBase) sequentialCopyToKt$copyToSequentialImpl$1.L$1;
                        byteChannelSequentialBase4 = (ByteChannelSequentialBase) sequentialCopyToKt$copyToSequentialImpl$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        byteChannelSequentialBase3 = byteChannelSequentialBase4;
                        sequentialCopyToKt$copyToSequentialImpl$12 = sequentialCopyToKt$copyToSequentialImpl$1;
                        long j10 = j7;
                        j4 = j6;
                        longValue = transferTo$ktor_io;
                        j5 = j10;
                        long j11 = j5 - longValue;
                        if (longValue > 0) {
                            byteChannelSequentialBase5.flush();
                        }
                        long j12 = j4;
                        obj = coroutine_suspended;
                        j3 = j11;
                        j2 = j12;
                        if (j3 > 0) {
                            sequentialCopyToKt$copyToSequentialImpl$12.L$0 = byteChannelSequentialBase3;
                            sequentialCopyToKt$copyToSequentialImpl$12.L$1 = byteChannelSequentialBase5;
                            sequentialCopyToKt$copyToSequentialImpl$12.J$0 = j2;
                            sequentialCopyToKt$copyToSequentialImpl$12.J$1 = j3;
                            sequentialCopyToKt$copyToSequentialImpl$12.label = 1;
                            Object awaitInternalAtLeast1$ktor_io = byteChannelSequentialBase3.awaitInternalAtLeast1$ktor_io(sequentialCopyToKt$copyToSequentialImpl$12);
                            if (awaitInternalAtLeast1$ktor_io == obj) {
                                return obj;
                            }
                            j6 = j2;
                            SequentialCopyToKt$copyToSequentialImpl$1 sequentialCopyToKt$copyToSequentialImpl$13 = sequentialCopyToKt$copyToSequentialImpl$12;
                            byteChannelSequentialBase4 = byteChannelSequentialBase3;
                            obj2 = awaitInternalAtLeast1$ktor_io;
                            long j13 = j3;
                            sequentialCopyToKt$copyToSequentialImpl$1 = sequentialCopyToKt$copyToSequentialImpl$13;
                            coroutine_suspended = obj;
                            j7 = j13;
                            if (((Boolean) obj2).booleanValue()) {
                                j3 = j7;
                                j2 = j6;
                            } else {
                                transferTo$ktor_io = byteChannelSequentialBase4.transferTo$ktor_io(byteChannelSequentialBase5, j7);
                                if (transferTo$ktor_io == 0) {
                                    sequentialCopyToKt$copyToSequentialImpl$1.L$0 = byteChannelSequentialBase4;
                                    sequentialCopyToKt$copyToSequentialImpl$1.L$1 = byteChannelSequentialBase5;
                                    sequentialCopyToKt$copyToSequentialImpl$1.J$0 = j6;
                                    sequentialCopyToKt$copyToSequentialImpl$1.J$1 = j7;
                                    sequentialCopyToKt$copyToSequentialImpl$1.label = 2;
                                    obj2 = copyToTail(byteChannelSequentialBase4, byteChannelSequentialBase5, j7, sequentialCopyToKt$copyToSequentialImpl$1);
                                    if (obj2 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    j5 = j7;
                                    j4 = j6;
                                    longValue = ((Number) obj2).longValue();
                                    if (longValue != 0) {
                                        j3 = j5;
                                        j2 = j4;
                                    } else {
                                        byteChannelSequentialBase3 = byteChannelSequentialBase4;
                                        sequentialCopyToKt$copyToSequentialImpl$12 = sequentialCopyToKt$copyToSequentialImpl$1;
                                        long j112 = j5 - longValue;
                                        if (longValue > 0) {
                                        }
                                        long j122 = j4;
                                        obj = coroutine_suspended;
                                        j3 = j112;
                                        j2 = j122;
                                        if (j3 > 0) {
                                        }
                                    }
                                } else {
                                    if (byteChannelSequentialBase5.getAvailableForWrite() == 0) {
                                        sequentialCopyToKt$copyToSequentialImpl$1.L$0 = byteChannelSequentialBase4;
                                        sequentialCopyToKt$copyToSequentialImpl$1.L$1 = byteChannelSequentialBase5;
                                        sequentialCopyToKt$copyToSequentialImpl$1.J$0 = j6;
                                        sequentialCopyToKt$copyToSequentialImpl$1.J$1 = j7;
                                        sequentialCopyToKt$copyToSequentialImpl$1.J$2 = transferTo$ktor_io;
                                        sequentialCopyToKt$copyToSequentialImpl$1.label = 3;
                                        if (byteChannelSequentialBase5.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, sequentialCopyToKt$copyToSequentialImpl$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    byteChannelSequentialBase3 = byteChannelSequentialBase4;
                                    sequentialCopyToKt$copyToSequentialImpl$12 = sequentialCopyToKt$copyToSequentialImpl$1;
                                    long j102 = j7;
                                    j4 = j6;
                                    longValue = transferTo$ktor_io;
                                    j5 = j102;
                                    long j1122 = j5 - longValue;
                                    if (longValue > 0) {
                                    }
                                    long j1222 = j4;
                                    obj = coroutine_suspended;
                                    j3 = j1122;
                                    j2 = j1222;
                                    if (j3 > 0) {
                                    }
                                }
                            }
                        }
                        return Boxing.boxLong(j2 - j3);
                    }
                    j5 = sequentialCopyToKt$copyToSequentialImpl$1.J$1;
                    j4 = sequentialCopyToKt$copyToSequentialImpl$1.J$0;
                    byteChannelSequentialBase5 = (ByteChannelSequentialBase) sequentialCopyToKt$copyToSequentialImpl$1.L$1;
                    byteChannelSequentialBase4 = (ByteChannelSequentialBase) sequentialCopyToKt$copyToSequentialImpl$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    longValue = ((Number) obj2).longValue();
                    if (longValue != 0) {
                    }
                }
            }
        }
        sequentialCopyToKt$copyToSequentialImpl$1 = new SequentialCopyToKt$copyToSequentialImpl$1(continuation);
        Object obj22 = sequentialCopyToKt$copyToSequentialImpl$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sequentialCopyToKt$copyToSequentialImpl$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #0 {all -> 0x00bd, blocks: (B:24:0x0078, B:26:0x0081, B:29:0x009a, B:35:0x005e), top: B:34:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[Catch: all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00bd, blocks: (B:24:0x0078, B:26:0x0081, B:29:0x009a, B:35:0x005e), top: B:34:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v9, types: [io.ktor.utils.io.core.internal.ChunkBuffer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyToTail(ByteChannelSequentialBase byteChannelSequentialBase, ByteChannelSequentialBase byteChannelSequentialBase2, long j, Continuation<? super Long> continuation) {
        SequentialCopyToKt$copyToTail$1 sequentialCopyToKt$copyToTail$1;
        int i;
        ChunkBuffer borrow;
        Object readAvailable;
        ByteChannelSequentialBase byteChannelSequentialBase3;
        int intValue;
        try {
            if (continuation instanceof SequentialCopyToKt$copyToTail$1) {
                sequentialCopyToKt$copyToTail$1 = (SequentialCopyToKt$copyToTail$1) continuation;
                if ((sequentialCopyToKt$copyToTail$1.label & Integer.MIN_VALUE) != 0) {
                    sequentialCopyToKt$copyToTail$1.label -= Integer.MIN_VALUE;
                    Object obj = sequentialCopyToKt$copyToTail$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = sequentialCopyToKt$copyToTail$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        borrow = ChunkBuffer.INSTANCE.getPool().borrow();
                        try {
                            borrow.resetForWrite((int) RangesKt.coerceAtMost(j, borrow.getCapacity()));
                            sequentialCopyToKt$copyToTail$1.L$0 = byteChannelSequentialBase2;
                            sequentialCopyToKt$copyToTail$1.L$1 = borrow;
                            sequentialCopyToKt$copyToTail$1.label = 1;
                            readAvailable = byteChannelSequentialBase.readAvailable(borrow, sequentialCopyToKt$copyToTail$1);
                            byteChannelSequentialBase3 = byteChannelSequentialBase2;
                            if (readAvailable == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th) {
                            th = th;
                            byteChannelSequentialBase2 = borrow;
                            byteChannelSequentialBase2.release(ChunkBuffer.INSTANCE.getPool());
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            intValue = sequentialCopyToKt$copyToTail$1.I$0;
                            ChunkBuffer chunkBuffer = (ChunkBuffer) sequentialCopyToKt$copyToTail$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            byteChannelSequentialBase2 = chunkBuffer;
                            Long boxLong = Boxing.boxLong(intValue);
                            byteChannelSequentialBase2.release(ChunkBuffer.INSTANCE.getPool());
                            return boxLong;
                        }
                        ChunkBuffer chunkBuffer2 = (ChunkBuffer) sequentialCopyToKt$copyToTail$1.L$1;
                        ByteChannelSequentialBase byteChannelSequentialBase4 = (ByteChannelSequentialBase) sequentialCopyToKt$copyToTail$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteChannelSequentialBase3 = byteChannelSequentialBase4;
                        readAvailable = obj;
                        borrow = chunkBuffer2;
                    }
                    intValue = ((Number) readAvailable).intValue();
                    if (intValue != -1) {
                        borrow.release(ChunkBuffer.INSTANCE.getPool());
                        Long boxLong2 = Boxing.boxLong(0L);
                        borrow.release(ChunkBuffer.INSTANCE.getPool());
                        return boxLong2;
                    }
                    sequentialCopyToKt$copyToTail$1.L$0 = borrow;
                    sequentialCopyToKt$copyToTail$1.L$1 = null;
                    sequentialCopyToKt$copyToTail$1.I$0 = intValue;
                    sequentialCopyToKt$copyToTail$1.label = 2;
                    if (byteChannelSequentialBase3.writeFully(borrow, sequentialCopyToKt$copyToTail$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteChannelSequentialBase2 = borrow;
                    Long boxLong3 = Boxing.boxLong(intValue);
                    byteChannelSequentialBase2.release(ChunkBuffer.INSTANCE.getPool());
                    return boxLong3;
                }
            }
            if (i != 0) {
            }
            intValue = ((Number) readAvailable).intValue();
            if (intValue != -1) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        sequentialCopyToKt$copyToTail$1 = new SequentialCopyToKt$copyToTail$1(continuation);
        Object obj2 = sequentialCopyToKt$copyToTail$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sequentialCopyToKt$copyToTail$1.label;
    }
}
