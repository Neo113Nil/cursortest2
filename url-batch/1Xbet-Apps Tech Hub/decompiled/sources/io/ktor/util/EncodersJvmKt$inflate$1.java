package io.ktor.util;

import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.InputKt;
import io.ktor.utils.io.core.InputLittleEndianKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.objectweb.asm.Opcodes;

/* compiled from: EncodersJvm.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6}, l = {68, 85, Opcodes.IF_ICMPLT, Opcodes.IF_ICMPLE, 103, 109, 121}, m = "invokeSuspend", n = {"$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "extraLen", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "n$iv", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes3.dex */
final class EncodersJvmKt$inflate$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $gzip;
    final /* synthetic */ ByteReadChannel $source;
    byte B$0;
    byte B$1;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    short S$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EncodersJvmKt$inflate$1(boolean z, ByteReadChannel byteReadChannel, Continuation<? super EncodersJvmKt$inflate$1> continuation) {
        super(2, continuation);
        this.$gzip = z;
        this.$source = byteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EncodersJvmKt$inflate$1 encodersJvmKt$inflate$1 = new EncodersJvmKt$inflate$1(this.$gzip, this.$source, continuation);
        encodersJvmKt$inflate$1.L$0 = obj;
        return encodersJvmKt$inflate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super Unit> continuation) {
        return ((EncodersJvmKt$inflate$1) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0370 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:8:0x0037, B:10:0x039a, B:11:0x036a, B:13:0x0370, B:17:0x03b3, B:19:0x03b7, B:23:0x03c4, B:27:0x03e7, B:34:0x03f1, B:35:0x0419, B:37:0x041a, B:38:0x0425, B:40:0x0426, B:41:0x044c, B:43:0x044d, B:46:0x0469, B:47:0x0474, B:49:0x005d, B:51:0x033a, B:52:0x0302, B:54:0x0308, B:56:0x030e, B:60:0x0354, B:61:0x02c2, B:63:0x02ca, B:66:0x02e8, B:68:0x02f0, B:69:0x0359, B:71:0x0361, B:72:0x0475, B:74:0x0080), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03b3 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:8:0x0037, B:10:0x039a, B:11:0x036a, B:13:0x0370, B:17:0x03b3, B:19:0x03b7, B:23:0x03c4, B:27:0x03e7, B:34:0x03f1, B:35:0x0419, B:37:0x041a, B:38:0x0425, B:40:0x0426, B:41:0x044c, B:43:0x044d, B:46:0x0469, B:47:0x0474, B:49:0x005d, B:51:0x033a, B:52:0x0302, B:54:0x0308, B:56:0x030e, B:60:0x0354, B:61:0x02c2, B:63:0x02ca, B:66:0x02e8, B:68:0x02f0, B:69:0x0359, B:71:0x0361, B:72:0x0475, B:74:0x0080), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0308 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:8:0x0037, B:10:0x039a, B:11:0x036a, B:13:0x0370, B:17:0x03b3, B:19:0x03b7, B:23:0x03c4, B:27:0x03e7, B:34:0x03f1, B:35:0x0419, B:37:0x041a, B:38:0x0425, B:40:0x0426, B:41:0x044c, B:43:0x044d, B:46:0x0469, B:47:0x0474, B:49:0x005d, B:51:0x033a, B:52:0x0302, B:54:0x0308, B:56:0x030e, B:60:0x0354, B:61:0x02c2, B:63:0x02ca, B:66:0x02e8, B:68:0x02f0, B:69:0x0359, B:71:0x0361, B:72:0x0475, B:74:0x0080), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ca A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:8:0x0037, B:10:0x039a, B:11:0x036a, B:13:0x0370, B:17:0x03b3, B:19:0x03b7, B:23:0x03c4, B:27:0x03e7, B:34:0x03f1, B:35:0x0419, B:37:0x041a, B:38:0x0425, B:40:0x0426, B:41:0x044c, B:43:0x044d, B:46:0x0469, B:47:0x0474, B:49:0x005d, B:51:0x033a, B:52:0x0302, B:54:0x0308, B:56:0x030e, B:60:0x0354, B:61:0x02c2, B:63:0x02ca, B:66:0x02e8, B:68:0x02f0, B:69:0x0359, B:71:0x0361, B:72:0x0475, B:74:0x0080), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f0 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:8:0x0037, B:10:0x039a, B:11:0x036a, B:13:0x0370, B:17:0x03b3, B:19:0x03b7, B:23:0x03c4, B:27:0x03e7, B:34:0x03f1, B:35:0x0419, B:37:0x041a, B:38:0x0425, B:40:0x0426, B:41:0x044c, B:43:0x044d, B:46:0x0469, B:47:0x0474, B:49:0x005d, B:51:0x033a, B:52:0x0302, B:54:0x0308, B:56:0x030e, B:60:0x0354, B:61:0x02c2, B:63:0x02ca, B:66:0x02e8, B:68:0x02f0, B:69:0x0359, B:71:0x0361, B:72:0x0475, B:74:0x0080), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0359 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:8:0x0037, B:10:0x039a, B:11:0x036a, B:13:0x0370, B:17:0x03b3, B:19:0x03b7, B:23:0x03c4, B:27:0x03e7, B:34:0x03f1, B:35:0x0419, B:37:0x041a, B:38:0x0425, B:40:0x0426, B:41:0x044c, B:43:0x044d, B:46:0x0469, B:47:0x0474, B:49:0x005d, B:51:0x033a, B:52:0x0302, B:54:0x0308, B:56:0x030e, B:60:0x0354, B:61:0x02c2, B:63:0x02ca, B:66:0x02e8, B:68:0x02f0, B:69:0x0359, B:71:0x0361, B:72:0x0475, B:74:0x0080), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0396 -> B:10:0x039a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0334 -> B:51:0x033a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x02ee -> B:61:0x02c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x02f0 -> B:52:0x0302). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WriterScope writerScope;
        ByteBuffer borrow;
        ByteBuffer borrow2;
        Inflater inflater;
        CRC32 crc32;
        Inflater inflater2;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        Object readPacket;
        short readShortLittleEndian;
        byte readByte;
        byte readByte2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        WriterScope writerScope2;
        Object readShort;
        Inflater inflater3;
        CRC32 crc322;
        byte b;
        ByteBuffer byteBuffer5;
        Object discard;
        byte b2;
        CRC32 crc323;
        long j;
        byte b3;
        boolean has;
        boolean has2;
        boolean has3;
        long j2;
        Object discard2;
        WriterScope writerScope3;
        ByteBuffer byteBuffer6;
        WriterScope writerScope4;
        Inflater inflater4;
        EncodersJvmKt$inflate$1 encodersJvmKt$inflate$1;
        CRC32 crc324;
        Ref.IntRef intRef;
        Object obj2;
        WriterScope writerScope5;
        Ref.IntRef intRef2;
        CRC32 crc325;
        Object inflateTo;
        WriterScope writerScope6;
        Ref.IntRef intRef3;
        int i;
        EncodersJvmKt$inflate$1 encodersJvmKt$inflate$12;
        CRC32 crc326;
        Ref.IntRef intRef4;
        Object inflateTo2;
        EncodersJvmKt$inflate$1 encodersJvmKt$inflate$13;
        CRC32 crc327;
        int i2;
        Ref.IntRef intRef5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    writerScope = (WriterScope) this.L$0;
                    borrow = ByteBufferPoolKt.getKtorDefaultPool().borrow();
                    borrow2 = ByteBufferPoolKt.getKtorDefaultPool().borrow();
                    inflater = new Inflater(true);
                    crc32 = new CRC32();
                    if (this.$gzip) {
                        this.L$0 = writerScope;
                        this.L$1 = borrow;
                        this.L$2 = borrow2;
                        this.L$3 = inflater;
                        this.L$4 = crc32;
                        this.label = 1;
                        readPacket = this.$source.readPacket(10, this);
                        if (readPacket == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ByteReadPacket byteReadPacket = (ByteReadPacket) readPacket;
                        ByteReadPacket byteReadPacket2 = byteReadPacket;
                        readShortLittleEndian = InputLittleEndianKt.readShortLittleEndian(byteReadPacket2);
                        readByte = byteReadPacket.readByte();
                        readByte2 = byteReadPacket.readByte();
                        InputKt.discard(byteReadPacket2);
                        if ((readByte2 & 4) == 0) {
                            this.L$0 = writerScope;
                            this.L$1 = borrow;
                            this.L$2 = borrow2;
                            this.L$3 = inflater;
                            this.L$4 = crc32;
                            this.S$0 = readShortLittleEndian;
                            this.B$0 = readByte;
                            this.B$1 = readByte2;
                            this.label = 2;
                            readShort = this.$source.readShort(this);
                            if (readShort == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            inflater3 = inflater;
                            writerScope2 = writerScope;
                            crc322 = crc32;
                            b = readByte2;
                            ByteBuffer byteBuffer7 = borrow;
                            byteBuffer5 = borrow2;
                            byteBuffer4 = byteBuffer7;
                            long shortValue = ((Number) readShort).shortValue();
                            this.L$0 = writerScope2;
                            this.L$1 = byteBuffer4;
                            this.L$2 = byteBuffer5;
                            this.L$3 = inflater3;
                            this.L$4 = crc322;
                            this.S$0 = readShortLittleEndian;
                            this.B$0 = readByte;
                            this.B$1 = b;
                            this.J$0 = shortValue;
                            byte b4 = b;
                            this.label = 3;
                            discard = this.$source.discard(shortValue, this);
                            if (discard != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            b2 = b4;
                            byte b5 = readByte;
                            crc323 = crc322;
                            j = shortValue;
                            b3 = b5;
                            if (((Number) discard).longValue() == j) {
                                throw new EOFException("Unable to discard " + j + " bytes");
                            }
                            readByte2 = b2;
                            crc32 = crc323;
                            inflater2 = inflater3;
                            readByte = b3;
                            byteBuffer3 = byteBuffer5;
                            if (readShortLittleEndian != -29921) {
                                throw new IllegalStateException(("GZIP magic invalid: " + ((int) readShortLittleEndian)).toString());
                            }
                            if (readByte == 8) {
                                has = EncodersJvmKt.has(readByte2, 8);
                                if (!has) {
                                    has2 = EncodersJvmKt.has(readByte2, 16);
                                    if (!has2) {
                                        has3 = EncodersJvmKt.has(readByte2, 2);
                                        if (!has3) {
                                            writerScope = writerScope2;
                                            byteBuffer = byteBuffer3;
                                            byteBuffer2 = byteBuffer4;
                                            writerScope4 = writerScope;
                                            inflater4 = inflater2;
                                            encodersJvmKt$inflate$1 = this;
                                            crc324 = crc32;
                                            intRef = new Ref.IntRef();
                                            if (encodersJvmKt$inflate$1.$source.isClosedForRead()) {
                                            }
                                        } else {
                                            this.L$0 = writerScope2;
                                            this.L$1 = byteBuffer4;
                                            this.L$2 = byteBuffer3;
                                            this.L$3 = inflater2;
                                            this.L$4 = crc32;
                                            j2 = 2;
                                            this.J$0 = 2L;
                                            this.label = 4;
                                            discard2 = this.$source.discard(2L, this);
                                            if (discard2 == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            writerScope3 = writerScope2;
                                            byteBuffer6 = byteBuffer4;
                                            if (((Number) discard2).longValue() == j2) {
                                                throw new EOFException("Unable to discard " + j2 + " bytes");
                                            }
                                            byteBuffer = byteBuffer3;
                                            byteBuffer2 = byteBuffer6;
                                            writerScope = writerScope3;
                                            try {
                                                writerScope4 = writerScope;
                                                inflater4 = inflater2;
                                                encodersJvmKt$inflate$1 = this;
                                                crc324 = crc32;
                                                intRef = new Ref.IntRef();
                                                if (encodersJvmKt$inflate$1.$source.isClosedForRead()) {
                                                    encodersJvmKt$inflate$1.L$0 = writerScope4;
                                                    encodersJvmKt$inflate$1.L$1 = byteBuffer2;
                                                    encodersJvmKt$inflate$1.L$2 = byteBuffer;
                                                    encodersJvmKt$inflate$1.L$3 = inflater4;
                                                    encodersJvmKt$inflate$1.L$4 = crc324;
                                                    encodersJvmKt$inflate$1.L$5 = intRef;
                                                    encodersJvmKt$inflate$1.L$6 = null;
                                                    encodersJvmKt$inflate$1.label = 5;
                                                    obj2 = encodersJvmKt$inflate$1.$source.readAvailable(byteBuffer2, encodersJvmKt$inflate$1);
                                                    if (obj2 == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    if (((Number) obj2).intValue() > 0) {
                                                        byteBuffer2.flip();
                                                        inflater4.setInput(byteBuffer2.array(), byteBuffer2.position(), byteBuffer2.remaining());
                                                        if (inflater4.needsInput() && !inflater4.finished()) {
                                                            int i3 = intRef.element;
                                                            encodersJvmKt$inflate$1.L$0 = writerScope4;
                                                            encodersJvmKt$inflate$1.L$1 = byteBuffer2;
                                                            encodersJvmKt$inflate$1.L$2 = byteBuffer;
                                                            encodersJvmKt$inflate$1.L$3 = inflater4;
                                                            encodersJvmKt$inflate$1.L$4 = crc324;
                                                            encodersJvmKt$inflate$1.L$5 = intRef;
                                                            encodersJvmKt$inflate$1.L$6 = intRef;
                                                            encodersJvmKt$inflate$1.I$0 = i3;
                                                            encodersJvmKt$inflate$1.label = 6;
                                                            inflateTo = EncodersJvmKt.inflateTo(inflater4, writerScope4.getChannel(), byteBuffer, crc324, encodersJvmKt$inflate$1);
                                                            if (inflateTo == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            writerScope6 = writerScope4;
                                                            intRef3 = intRef;
                                                            i = i3;
                                                            encodersJvmKt$inflate$12 = encodersJvmKt$inflate$1;
                                                            crc326 = crc324;
                                                            intRef4 = intRef3;
                                                            intRef4.element = i + ((Number) inflateTo).intValue();
                                                            byteBuffer2.position(byteBuffer2.limit() - inflater4.getRemaining());
                                                            intRef = intRef3;
                                                            crc324 = crc326;
                                                            encodersJvmKt$inflate$1 = encodersJvmKt$inflate$12;
                                                            writerScope4 = writerScope6;
                                                            if (inflater4.needsInput()) {
                                                            }
                                                            byteBuffer2.compact();
                                                        } else {
                                                            byteBuffer2.compact();
                                                        }
                                                    }
                                                    if (encodersJvmKt$inflate$1.$source.isClosedForRead()) {
                                                        Throwable closedCause = encodersJvmKt$inflate$1.$source.getClosedCause();
                                                        if (closedCause != null) {
                                                            throw closedCause;
                                                        }
                                                        byteBuffer2.flip();
                                                        writerScope5 = writerScope4;
                                                        CRC32 crc328 = crc324;
                                                        intRef2 = intRef;
                                                        crc325 = crc328;
                                                        if (!inflater4.finished()) {
                                                            int i4 = intRef2.element;
                                                            encodersJvmKt$inflate$1.L$0 = writerScope5;
                                                            encodersJvmKt$inflate$1.L$1 = byteBuffer2;
                                                            encodersJvmKt$inflate$1.L$2 = byteBuffer;
                                                            encodersJvmKt$inflate$1.L$3 = inflater4;
                                                            encodersJvmKt$inflate$1.L$4 = crc325;
                                                            encodersJvmKt$inflate$1.L$5 = intRef2;
                                                            encodersJvmKt$inflate$1.L$6 = intRef2;
                                                            encodersJvmKt$inflate$1.I$0 = i4;
                                                            encodersJvmKt$inflate$1.label = 7;
                                                            inflateTo2 = EncodersJvmKt.inflateTo(inflater4, writerScope5.getChannel(), byteBuffer, crc325, encodersJvmKt$inflate$1);
                                                            if (inflateTo2 == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            encodersJvmKt$inflate$13 = encodersJvmKt$inflate$1;
                                                            crc327 = crc325;
                                                            i2 = i4;
                                                            intRef5 = intRef2;
                                                            intRef2.element = i2 + ((Number) inflateTo2).intValue();
                                                            byteBuffer2.position(byteBuffer2.limit() - inflater4.getRemaining());
                                                            intRef2 = intRef5;
                                                            crc325 = crc327;
                                                            encodersJvmKt$inflate$1 = encodersJvmKt$inflate$13;
                                                            if (!inflater4.finished()) {
                                                                if (encodersJvmKt$inflate$1.$gzip) {
                                                                    if (!(byteBuffer2.remaining() == 8)) {
                                                                        throw new IllegalStateException(("Expected 8 bytes in the trailer. Actual: " + byteBuffer2.remaining() + " $").toString());
                                                                    }
                                                                    byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
                                                                    int i5 = byteBuffer2.getInt(byteBuffer2.position());
                                                                    int i6 = byteBuffer2.getInt(byteBuffer2.position() + 4);
                                                                    if (!(((int) crc325.getValue()) == i5)) {
                                                                        throw new IllegalStateException("Gzip checksum invalid.".toString());
                                                                    }
                                                                    if (!(intRef2.element == i6)) {
                                                                        throw new IllegalStateException(("Gzip size invalid. Expected " + i6 + ", actual " + intRef2.element).toString());
                                                                    }
                                                                } else if (!(!byteBuffer2.hasRemaining())) {
                                                                    throw new IllegalStateException("Check failed.".toString());
                                                                }
                                                                inflater4.end();
                                                                ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer2);
                                                                ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer);
                                                                return Unit.INSTANCE;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                Inflater inflater5 = inflater2;
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    inflater5.end();
                                                    ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer2);
                                                    ByteBufferPoolKt.getKtorDefaultPool().recycle(byteBuffer);
                                                    throw th2;
                                                }
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Gzip file comment not supported".toString());
                                    }
                                } else {
                                    throw new IllegalStateException("Gzip file name not supported".toString());
                                }
                            } else {
                                throw new IllegalStateException(("Deflater method unsupported: " + ((int) readByte) + '.').toString());
                            }
                        } else {
                            inflater2 = inflater;
                            byteBuffer3 = borrow2;
                            byteBuffer4 = borrow;
                            writerScope2 = writerScope;
                            if (readShortLittleEndian != -29921) {
                            }
                        }
                    } else {
                        inflater2 = inflater;
                        byteBuffer = borrow2;
                        byteBuffer2 = borrow;
                        writerScope4 = writerScope;
                        inflater4 = inflater2;
                        encodersJvmKt$inflate$1 = this;
                        crc324 = crc32;
                        intRef = new Ref.IntRef();
                        if (encodersJvmKt$inflate$1.$source.isClosedForRead()) {
                        }
                    }
                case 1:
                    crc32 = (CRC32) this.L$4;
                    inflater = (Inflater) this.L$3;
                    borrow2 = (ByteBuffer) this.L$2;
                    borrow = (ByteBuffer) this.L$1;
                    writerScope = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    readPacket = obj;
                    ByteReadPacket byteReadPacket3 = (ByteReadPacket) readPacket;
                    ByteReadPacket byteReadPacket22 = byteReadPacket3;
                    readShortLittleEndian = InputLittleEndianKt.readShortLittleEndian(byteReadPacket22);
                    readByte = byteReadPacket3.readByte();
                    readByte2 = byteReadPacket3.readByte();
                    InputKt.discard(byteReadPacket22);
                    if ((readByte2 & 4) == 0) {
                    }
                    break;
                case 2:
                    b = this.B$1;
                    byte b6 = this.B$0;
                    short s = this.S$0;
                    CRC32 crc329 = (CRC32) this.L$4;
                    Inflater inflater6 = (Inflater) this.L$3;
                    ByteBuffer byteBuffer8 = (ByteBuffer) this.L$2;
                    ByteBuffer byteBuffer9 = (ByteBuffer) this.L$1;
                    WriterScope writerScope7 = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    readByte = b6;
                    inflater3 = inflater6;
                    writerScope2 = writerScope7;
                    readShortLittleEndian = s;
                    crc322 = crc329;
                    byteBuffer5 = byteBuffer8;
                    byteBuffer4 = byteBuffer9;
                    readShort = obj;
                    long shortValue2 = ((Number) readShort).shortValue();
                    this.L$0 = writerScope2;
                    this.L$1 = byteBuffer4;
                    this.L$2 = byteBuffer5;
                    this.L$3 = inflater3;
                    this.L$4 = crc322;
                    this.S$0 = readShortLittleEndian;
                    this.B$0 = readByte;
                    this.B$1 = b;
                    this.J$0 = shortValue2;
                    byte b42 = b;
                    this.label = 3;
                    discard = this.$source.discard(shortValue2, this);
                    if (discard != coroutine_suspended) {
                    }
                    break;
                case 3:
                    j = this.J$0;
                    byte b7 = this.B$1;
                    b3 = this.B$0;
                    readShortLittleEndian = this.S$0;
                    crc323 = (CRC32) this.L$4;
                    inflater3 = (Inflater) this.L$3;
                    byteBuffer5 = (ByteBuffer) this.L$2;
                    byteBuffer4 = (ByteBuffer) this.L$1;
                    writerScope2 = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    b2 = b7;
                    discard = obj;
                    if (((Number) discard).longValue() == j) {
                    }
                    break;
                case 4:
                    j2 = this.J$0;
                    crc32 = (CRC32) this.L$4;
                    inflater2 = (Inflater) this.L$3;
                    byteBuffer3 = (ByteBuffer) this.L$2;
                    byteBuffer6 = (ByteBuffer) this.L$1;
                    writerScope3 = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    discard2 = obj;
                    if (((Number) discard2).longValue() == j2) {
                    }
                    break;
                case 5:
                    intRef = (Ref.IntRef) this.L$5;
                    crc324 = (CRC32) this.L$4;
                    inflater4 = (Inflater) this.L$3;
                    byteBuffer = (ByteBuffer) this.L$2;
                    byteBuffer2 = (ByteBuffer) this.L$1;
                    writerScope4 = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    encodersJvmKt$inflate$1 = this;
                    if (((Number) obj2).intValue() > 0) {
                    }
                    if (encodersJvmKt$inflate$1.$source.isClosedForRead()) {
                    }
                    break;
                case 6:
                    i = this.I$0;
                    intRef4 = (Ref.IntRef) this.L$6;
                    intRef3 = (Ref.IntRef) this.L$5;
                    crc326 = (CRC32) this.L$4;
                    inflater4 = (Inflater) this.L$3;
                    byteBuffer = (ByteBuffer) this.L$2;
                    byteBuffer2 = (ByteBuffer) this.L$1;
                    writerScope6 = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    inflateTo = obj;
                    encodersJvmKt$inflate$12 = this;
                    intRef4.element = i + ((Number) inflateTo).intValue();
                    byteBuffer2.position(byteBuffer2.limit() - inflater4.getRemaining());
                    intRef = intRef3;
                    crc324 = crc326;
                    encodersJvmKt$inflate$1 = encodersJvmKt$inflate$12;
                    writerScope4 = writerScope6;
                    if (inflater4.needsInput()) {
                    }
                    byteBuffer2.compact();
                    if (encodersJvmKt$inflate$1.$source.isClosedForRead()) {
                    }
                    break;
                case 7:
                    i2 = this.I$0;
                    intRef2 = (Ref.IntRef) this.L$6;
                    intRef5 = (Ref.IntRef) this.L$5;
                    crc327 = (CRC32) this.L$4;
                    inflater4 = (Inflater) this.L$3;
                    byteBuffer = (ByteBuffer) this.L$2;
                    byteBuffer2 = (ByteBuffer) this.L$1;
                    writerScope5 = (WriterScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    inflateTo2 = obj;
                    encodersJvmKt$inflate$13 = this;
                    intRef2.element = i2 + ((Number) inflateTo2).intValue();
                    byteBuffer2.position(byteBuffer2.limit() - inflater4.getRemaining());
                    intRef2 = intRef5;
                    crc325 = crc327;
                    encodersJvmKt$inflate$1 = encodersJvmKt$inflate$13;
                    if (!inflater4.finished()) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
