package io.ktor.utils.io.nio;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.bits.MemoryJvmKt;
import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.BuffersKt;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.StringsKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Channels.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0012\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u0010\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u001a\u001c\u0010\u0011\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002\u001a3\u0010\u0014\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0007\u001a%\u0010\u001a\u001a\u0004\u0018\u00010\f*\u00020\u00152\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001f\u001a\u0012\u0010\u001a\u001a\u00020 *\u00020\u00152\u0006\u0010!\u001a\u00020\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"read", "", "Ljava/nio/channels/ReadableByteChannel;", FirebaseAnalytics.Param.DESTINATION, "Lio/ktor/utils/io/bits/Memory;", "destinationOffset", "maxLength", "read-UAd2zVI", "(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/ByteBuffer;II)I", "buffer", "Lio/ktor/utils/io/core/Buffer;", "readPacketAtLeast", "Lio/ktor/utils/io/core/ByteReadPacket;", "n", "", "readPacketAtMost", "readPacketExact", "readPacketImpl", "min", "max", "write", "Ljava/nio/channels/WritableByteChannel;", FirebaseAnalytics.Param.SOURCE, "sourceOffset", "write-UAd2zVI", "(Ljava/nio/channels/WritableByteChannel;Ljava/nio/ByteBuffer;II)I", "writePacket", "builder", "Lkotlin/Function1;", "Lio/ktor/utils/io/core/BytePacketBuilder;", "", "Lkotlin/ExtensionFunctionType;", "", "p", "ktor-io"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChannelsKt {
    public static final boolean writePacket(WritableByteChannel writableByteChannel, ByteReadPacket p) {
        int write;
        Intrinsics.checkNotNullParameter(writableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        do {
            try {
                ByteReadPacket byteReadPacket = p;
                ChunkBuffer prepareRead = byteReadPacket.prepareRead(1);
                if (prepareRead == null) {
                    StringsKt.prematureEndOfStream(1);
                    throw new KotlinNothingValueException();
                }
                int readPosition = prepareRead.getReadPosition();
                try {
                    ChunkBuffer chunkBuffer = prepareRead;
                    ByteBuffer memory = chunkBuffer.getMemory();
                    int readPosition2 = chunkBuffer.getReadPosition();
                    int writePosition = chunkBuffer.getWritePosition() - readPosition2;
                    ByteBuffer m326slice87lwejk = Memory.m326slice87lwejk(memory, readPosition2, writePosition);
                    write = writableByteChannel.write(m326slice87lwejk);
                    if (!(m326slice87lwejk.limit() == writePosition)) {
                        throw new IllegalStateException("Buffer's limit change is not allowed".toString());
                    }
                    chunkBuffer.discardExact(m326slice87lwejk.position());
                    int readPosition3 = prepareRead.getReadPosition();
                    if (readPosition3 < readPosition) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (readPosition3 == prepareRead.getWritePosition()) {
                        byteReadPacket.ensureNext(prepareRead);
                    } else {
                        byteReadPacket.setHeadPosition(readPosition3);
                    }
                    if (p.getEndOfInput()) {
                        return true;
                    }
                } catch (Throwable th) {
                    int readPosition4 = prepareRead.getReadPosition();
                    if (readPosition4 < readPosition) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (readPosition4 == prepareRead.getWritePosition()) {
                        byteReadPacket.ensureNext(prepareRead);
                    } else {
                        byteReadPacket.setHeadPosition(readPosition4);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                p.release();
                throw th2;
            }
        } while (write != 0);
        return false;
    }

    public static final ByteReadPacket readPacketExact(ReadableByteChannel readableByteChannel, long j) {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        return readPacketImpl(readableByteChannel, j, j);
    }

    public static final ByteReadPacket readPacketAtLeast(ReadableByteChannel readableByteChannel, long j) {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        return readPacketImpl(readableByteChannel, j, Long.MAX_VALUE);
    }

    public static final ByteReadPacket readPacketAtMost(ReadableByteChannel readableByteChannel, long j) {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        return readPacketImpl(readableByteChannel, 1L, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        io.ktor.utils.io.internal.jvm.ErrorsKt.wrongBufferPositionChangeError(r6, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:25:0x0045, B:33:0x0067, B:36:0x0072, B:38:0x0076, B:39:0x007a, B:43:0x008e, B:45:0x00b5, B:46:0x00bd, B:48:0x00c6, B:51:0x00d4, B:53:0x00dd, B:54:0x00e6, B:57:0x00e7, B:58:0x0109, B:60:0x010a, B:61:0x0131), top: B:24:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:25:0x0045, B:33:0x0067, B:36:0x0072, B:38:0x0076, B:39:0x007a, B:43:0x008e, B:45:0x00b5, B:46:0x00bd, B:48:0x00c6, B:51:0x00d4, B:53:0x00dd, B:54:0x00e6, B:57:0x00e7, B:58:0x0109, B:60:0x010a, B:61:0x0131), top: B:24:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:25:0x0045, B:33:0x0067, B:36:0x0072, B:38:0x0076, B:39:0x007a, B:43:0x008e, B:45:0x00b5, B:46:0x00bd, B:48:0x00c6, B:51:0x00d4, B:53:0x00dd, B:54:0x00e6, B:57:0x00e7, B:58:0x0109, B:60:0x010a, B:61:0x0131), top: B:24:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final ByteReadPacket readPacketImpl(ReadableByteChannel readableByteChannel, long j, long j2) {
        boolean z;
        ChunkBuffer chunkBuffer;
        int limit;
        long j3 = 0;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("min shouldn't be negative: " + j).toString());
        }
        if (!(j <= j2)) {
            throw new IllegalArgumentException(("min shouldn't be greater than max: " + j + " > " + j2).toString());
        }
        if (j2 == 0) {
            return ByteReadPacket.INSTANCE.getEmpty();
        }
        ObjectPool<ChunkBuffer> pool = ChunkBuffer.INSTANCE.getPool();
        ChunkBuffer empty = ChunkBuffer.INSTANCE.getEmpty();
        ChunkBuffer chunkBuffer2 = empty;
        ChunkBuffer chunkBuffer3 = chunkBuffer2;
        while (true) {
            if (j3 < j || (j3 == j && i == 0)) {
                try {
                    int coerceAtMost = (int) RangesKt.coerceAtMost(j2 - j3, 2147483647L);
                    ChunkBuffer chunkBuffer4 = chunkBuffer3;
                    int limit2 = chunkBuffer4.getLimit() - chunkBuffer4.getWritePosition();
                    if (limit2 <= 200 && limit2 < coerceAtMost) {
                        z = false;
                        chunkBuffer = !z ? chunkBuffer3 : null;
                        if (chunkBuffer == null) {
                            ChunkBuffer borrow = pool.borrow();
                            ChunkBuffer chunkBuffer5 = borrow;
                            if (chunkBuffer2 == empty) {
                                chunkBuffer2 = chunkBuffer5;
                                chunkBuffer3 = chunkBuffer2;
                            }
                            chunkBuffer = borrow;
                        }
                        if (chunkBuffer3 != chunkBuffer) {
                            chunkBuffer3.setNext(chunkBuffer);
                            chunkBuffer3 = chunkBuffer;
                        }
                        ChunkBuffer chunkBuffer6 = chunkBuffer;
                        limit = chunkBuffer6.getLimit() - chunkBuffer6.getWritePosition();
                        if (1 > limit) {
                            throw new IllegalArgumentException(("size 1 is greater than buffer's remaining capacity " + limit).toString());
                        }
                        ByteBuffer duplicate = chunkBuffer.getMemory().duplicate();
                        Intrinsics.checkNotNull(duplicate);
                        int writePosition = chunkBuffer.getWritePosition();
                        int i2 = i;
                        duplicate.limit(chunkBuffer.getLimit());
                        duplicate.position(writePosition);
                        int limit3 = duplicate.limit();
                        ChunkBuffer chunkBuffer7 = empty;
                        if (duplicate.remaining() > coerceAtMost) {
                            duplicate.limit(duplicate.position() + coerceAtMost);
                        }
                        int read = readableByteChannel.read(duplicate);
                        if (read == -1) {
                            throw new EOFException("Premature end of stream: was read " + j3 + " bytes of " + j);
                        }
                        duplicate.limit(limit3);
                        j3 += read;
                        int position = duplicate.position() - writePosition;
                        if (position < 0 || position > limit) {
                            break;
                        }
                        chunkBuffer.commitWritten(position);
                        i = i2;
                        empty = chunkBuffer7;
                    }
                    z = true;
                    if (!z) {
                    }
                    if (chunkBuffer == null) {
                    }
                    if (chunkBuffer3 != chunkBuffer) {
                    }
                    ChunkBuffer chunkBuffer62 = chunkBuffer;
                    limit = chunkBuffer62.getLimit() - chunkBuffer62.getWritePosition();
                    if (1 > limit) {
                    }
                } catch (Throwable th) {
                    BuffersKt.releaseAll(chunkBuffer2, pool);
                    throw th;
                }
            }
        }
        return new ByteReadPacket(chunkBuffer2, pool);
    }

    /* renamed from: read-UAd2zVI, reason: not valid java name */
    public static final int m583readUAd2zVI(ReadableByteChannel read, ByteBuffer destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(read, "$this$read");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return read.read(MemoryJvmKt.sliceSafe(destination, i, i2));
    }

    /* renamed from: write-UAd2zVI, reason: not valid java name */
    public static final int m585writeUAd2zVI(WritableByteChannel write, ByteBuffer source, int i, int i2) {
        Intrinsics.checkNotNullParameter(write, "$this$write");
        Intrinsics.checkNotNullParameter(source, "source");
        return write.write(MemoryJvmKt.sliceSafe(source, i, i2));
    }

    public static final ByteReadPacket writePacket(WritableByteChannel writableByteChannel, Function1<? super BytePacketBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(writableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            builder.invoke(bytePacketBuilder);
            ByteReadPacket build = bytePacketBuilder.build();
            try {
                if (writePacket(writableByteChannel, build)) {
                    return null;
                }
                return build;
            } catch (Throwable th) {
                build.release();
                throw th;
            }
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    @Deprecated(message = "Use read(Memory) instead.")
    public static final int read(ReadableByteChannel readableByteChannel, Buffer buffer) {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.getLimit() - buffer.getWritePosition() == 0) {
            return 0;
        }
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int read = readableByteChannel.read(MemoryJvmKt.sliceSafe(memory, writePosition, buffer.getLimit() - writePosition));
        if (read == -1) {
            return -1;
        }
        buffer.commitWritten(read);
        return read;
    }

    /* renamed from: read-UAd2zVI$default, reason: not valid java name */
    public static /* synthetic */ int m584readUAd2zVI$default(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteBuffer.limit() - i;
        }
        return m583readUAd2zVI(readableByteChannel, byteBuffer, i, i2);
    }

    @Deprecated(message = "Use write(Memory) instead.")
    public static final int write(WritableByteChannel writableByteChannel, Buffer buffer) {
        Intrinsics.checkNotNullParameter(writableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        int write = writableByteChannel.write(MemoryJvmKt.sliceSafe(memory, readPosition, buffer.getWritePosition() - readPosition));
        buffer.discardExact(write);
        return write;
    }

    /* renamed from: write-UAd2zVI$default, reason: not valid java name */
    public static /* synthetic */ int m586writeUAd2zVI$default(WritableByteChannel writableByteChannel, ByteBuffer byteBuffer, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteBuffer.limit() - i;
        }
        return m585writeUAd2zVI(writableByteChannel, byteBuffer, i, i2);
    }
}
