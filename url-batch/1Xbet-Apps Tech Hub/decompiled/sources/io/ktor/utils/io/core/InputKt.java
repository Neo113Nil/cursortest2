package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.MalformedUTF8InputException;
import io.ktor.utils.io.core.internal.UTF8Kt;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Input.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001\u001a$\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0080\bø\u0001\u0000\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0002\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001a$\u0010\u000f\u001a\u00020\u0004*\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\tH\u0086\bø\u0001\u0000\u001a.\u0010\u0012\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\tH\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"discard", "", "Lio/ktor/utils/io/core/Input;", "discardExact", "", "n", "", "forEach", "block", "Lkotlin/Function1;", "", "peekCharUtf8", "", "peekCharUtf8Impl", "first", "takeWhile", "Lio/ktor/utils/io/core/Buffer;", "", "takeWhileSize", "initialSize", "ktor-io"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputKt {
    public static final long discard(Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return input.discard(Long.MAX_VALUE);
    }

    public static final void discardExact(Input input, long j) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        long discard = input.discard(j);
        if (discard != j) {
            throw new IllegalStateException("Only " + discard + " bytes were discarded of " + j + " requested");
        }
    }

    public static final void discardExact(Input input, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        discardExact(input, i);
    }

    public static final void takeWhile(Input input, Function1<? super Buffer, Boolean> block) {
        boolean z;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead == null) {
            return;
        }
        while (true) {
            try {
                if (!block.invoke(prepareReadFirstHead).booleanValue()) {
                    z = true;
                    break;
                }
                z = false;
                try {
                    ChunkBuffer prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                    if (prepareReadNextHead == null) {
                        break;
                    } else {
                        prepareReadFirstHead = prepareReadNextHead;
                    }
                } catch (Throwable th) {
                    th = th;
                    InlineMarker.finallyStart(1);
                    if (z) {
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                    }
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                z = true;
            }
        }
        InlineMarker.finallyStart(1);
        if (z) {
            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
        }
        InlineMarker.finallyEnd(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void takeWhileSize$default(Input input, int i, Function1 block, int i2, Object obj) {
        boolean z;
        ChunkBuffer prepareReadNextHead;
        if ((i2 & 1) != 0) {
            i = 1;
        }
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, i);
        if (prepareReadFirstHead == null) {
            return;
        }
        while (true) {
            try {
                ChunkBuffer chunkBuffer = prepareReadFirstHead;
                int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                if (writePosition >= i) {
                    try {
                        i = ((Number) block.invoke(prepareReadFirstHead)).intValue();
                        InlineMarker.finallyStart(1);
                        ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                        writePosition = chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition();
                        InlineMarker.finallyEnd(1);
                    } finally {
                    }
                }
                z = false;
                if (writePosition == 0) {
                    try {
                        prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                    } catch (Throwable th) {
                        th = th;
                        InlineMarker.finallyStart(1);
                        if (z) {
                            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        }
                        InlineMarker.finallyEnd(1);
                        throw th;
                    }
                } else {
                    if (writePosition >= i) {
                        ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                        if (chunkBuffer3.getCapacity() - chunkBuffer3.getLimit() >= 8) {
                            prepareReadNextHead = prepareReadFirstHead;
                        }
                    }
                    UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                    prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i);
                }
                if (prepareReadNextHead == null) {
                    break;
                }
                if (i <= 0) {
                    z = true;
                    prepareReadFirstHead = prepareReadNextHead;
                    break;
                }
                prepareReadFirstHead = prepareReadNextHead;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                InlineMarker.finallyStart(1);
                if (z) {
                }
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyStart(1);
        if (z) {
            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
        }
        InlineMarker.finallyEnd(1);
    }

    public static final void takeWhileSize(Input input, int i, Function1<? super Buffer, Integer> block) {
        boolean z;
        ChunkBuffer prepareReadNextHead;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, i);
        if (prepareReadFirstHead == null) {
            return;
        }
        while (true) {
            try {
                ChunkBuffer chunkBuffer = prepareReadFirstHead;
                int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                if (writePosition >= i) {
                    try {
                        i = block.invoke(prepareReadFirstHead).intValue();
                        InlineMarker.finallyStart(1);
                        ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                        writePosition = chunkBuffer2.getWritePosition() - chunkBuffer2.getReadPosition();
                        InlineMarker.finallyEnd(1);
                    } finally {
                    }
                }
                z = false;
                if (writePosition == 0) {
                    try {
                        prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                    } catch (Throwable th) {
                        th = th;
                        InlineMarker.finallyStart(1);
                        if (z) {
                            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        }
                        InlineMarker.finallyEnd(1);
                        throw th;
                    }
                } else {
                    if (writePosition >= i) {
                        ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                        if (chunkBuffer3.getCapacity() - chunkBuffer3.getLimit() >= 8) {
                            prepareReadNextHead = prepareReadFirstHead;
                        }
                    }
                    UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                    prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i);
                }
                if (prepareReadNextHead == null) {
                    break;
                }
                if (i <= 0) {
                    z = true;
                    prepareReadFirstHead = prepareReadNextHead;
                    break;
                }
                prepareReadFirstHead = prepareReadNextHead;
            } catch (Throwable th2) {
                th = th2;
                z = true;
            }
        }
        InlineMarker.finallyStart(1);
        if (z) {
            UnsafeKt.completeReadHead(input, prepareReadFirstHead);
        }
        InlineMarker.finallyEnd(1);
    }

    public static final char peekCharUtf8(Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        int tryPeek = input.tryPeek();
        if ((tryPeek & 128) == 0) {
            return (char) tryPeek;
        }
        if (tryPeek == -1) {
            throw new EOFException("Failed to peek a char: end of input");
        }
        return peekCharUtf8Impl(input, tryPeek);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0049, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final char peekCharUtf8Impl(Input input, int i) {
        ChunkBuffer chunkBuffer;
        int i2;
        ChunkBuffer prepareReadNextHead;
        int byteCountUtf8 = UTF8Kt.byteCountUtf8(i);
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, byteCountUtf8);
        char c = '?';
        boolean z = false;
        if (prepareReadFirstHead != null) {
            boolean z2 = false;
            while (true) {
                try {
                    int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                    if (writePosition >= byteCountUtf8) {
                        try {
                            ChunkBuffer chunkBuffer2 = prepareReadFirstHead;
                            ByteBuffer memory = chunkBuffer2.getMemory();
                            int readPosition = chunkBuffer2.getReadPosition();
                            int writePosition2 = chunkBuffer2.getWritePosition();
                            int i3 = 0;
                            int i4 = 0;
                            int i5 = 0;
                            int i6 = readPosition;
                            while (true) {
                                if (i6 < writePosition2) {
                                    int i7 = memory.get(i6) & 255;
                                    i2 = -1;
                                    if ((i7 & 128) != 0) {
                                        if (i3 == 0) {
                                            int i8 = 128;
                                            for (int i9 = 1; i9 < 7 && (i7 & i8) != 0; i9++) {
                                                i7 &= ~i8;
                                                i8 >>= 1;
                                                i3++;
                                            }
                                            int i10 = i3 - 1;
                                            if (i3 > writePosition2 - i6) {
                                                chunkBuffer2.discardExact(i6 - readPosition);
                                                i2 = i3;
                                                break;
                                            }
                                            i5 = i3;
                                            i3 = i10;
                                            i4 = i7;
                                        } else {
                                            i4 = (i4 << 6) | (i7 & 127);
                                            i3--;
                                            if (i3 == 0) {
                                                if (UTF8Kt.isBmpCodePoint(i4)) {
                                                    c = (char) i4;
                                                    chunkBuffer2.discardExact(((i6 - readPosition) - i5) + 1);
                                                } else {
                                                    if (!UTF8Kt.isValidCodePoint(i4)) {
                                                        UTF8Kt.malformedCodePoint(i4);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    c = (char) UTF8Kt.highSurrogate(i4);
                                                    chunkBuffer2.discardExact(((i6 - readPosition) - i5) + 1);
                                                }
                                            }
                                        }
                                        i6++;
                                    } else {
                                        if (i3 != 0) {
                                            UTF8Kt.malformedByteCount(i3);
                                            throw new KotlinNothingValueException();
                                        }
                                        c = (char) i7;
                                        chunkBuffer2.discardExact(i6 - readPosition);
                                    }
                                } else {
                                    chunkBuffer2.discardExact(writePosition2 - readPosition);
                                    i2 = 0;
                                    break;
                                }
                            }
                            ChunkBuffer chunkBuffer3 = prepareReadFirstHead;
                            writePosition = chunkBuffer3.getWritePosition() - chunkBuffer3.getReadPosition();
                            byteCountUtf8 = i2;
                        } finally {
                            chunkBuffer = prepareReadFirstHead;
                            chunkBuffer.getWritePosition();
                            chunkBuffer.getReadPosition();
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            prepareReadNextHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        if (writePosition >= byteCountUtf8) {
                            ChunkBuffer chunkBuffer4 = prepareReadFirstHead;
                            if (chunkBuffer4.getCapacity() - chunkBuffer4.getLimit() >= 8) {
                                prepareReadNextHead = prepareReadFirstHead;
                            }
                        }
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                        prepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, byteCountUtf8);
                    }
                    if (prepareReadNextHead == null) {
                        break;
                    }
                    if (byteCountUtf8 <= 0) {
                        z = true;
                        prepareReadFirstHead = prepareReadNextHead;
                        break;
                    }
                    prepareReadFirstHead = prepareReadNextHead;
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                }
            }
            if (z) {
                UnsafeKt.completeReadHead(input, prepareReadFirstHead);
            }
            z = z2;
        }
        if (z) {
            return c;
        }
        throw new MalformedUTF8InputException("No UTF-8 character found");
    }

    public static final void forEach(Input input, Function1<? super Byte, Unit> block) {
        boolean z;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer prepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (prepareReadFirstHead == null) {
            return;
        }
        do {
            try {
                ChunkBuffer chunkBuffer = prepareReadFirstHead;
                ByteBuffer memory = chunkBuffer.getMemory();
                int readPosition = chunkBuffer.getReadPosition();
                int writePosition = chunkBuffer.getWritePosition();
                for (int i = readPosition; i < writePosition; i++) {
                    block.invoke(Byte.valueOf(memory.get(i)));
                }
                chunkBuffer.discardExact(writePosition - readPosition);
                try {
                    prepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, prepareReadFirstHead);
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    InlineMarker.finallyStart(1);
                    if (z) {
                        UnsafeKt.completeReadHead(input, prepareReadFirstHead);
                    }
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                z = true;
            }
        } while (prepareReadFirstHead != null);
        InlineMarker.finallyStart(1);
        InlineMarker.finallyEnd(1);
    }
}
