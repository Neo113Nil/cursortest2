package io.ktor.websocket;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import io.ktor.util.InternalAPI;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.bits.DefaultAllocator;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.ByteReadPacketExtensionsKt;
import io.ktor.utils.io.core.StringsKt;
import io.ktor.websocket.Frame;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a%\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a%\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"mask", "Lio/ktor/utils/io/core/ByteReadPacket;", "maskKey", "", "readFrame", "Lio/ktor/websocket/Frame;", "Lio/ktor/utils/io/ByteReadChannel;", "maxFrameSize", "", "lastOpcode", "(Lio/ktor/utils/io/ByteReadChannel;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeFrame", "", "Lio/ktor/utils/io/ByteWriteChannel;", TypedValues.AttributesType.S_FRAME, "masking", "", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/websocket/Frame;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-websockets"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RawWebSocketCommonKt {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeFrame(ByteWriteChannel byteWriteChannel, Frame frame, boolean z, Continuation<? super Unit> continuation) {
        RawWebSocketCommonKt$writeFrame$1 rawWebSocketCommonKt$writeFrame$1;
        Frame frame2;
        int i;
        boolean z2;
        int i2;
        int i3;
        ByteWriteChannel byteWriteChannel2;
        int i4;
        Frame frame3;
        boolean z3;
        boolean z4;
        Frame frame4;
        ByteWriteChannel byteWriteChannel3;
        ByteReadPacket ByteReadPacket;
        int nextInt;
        ByteWriteChannel byteWriteChannel4;
        if (continuation instanceof RawWebSocketCommonKt$writeFrame$1) {
            rawWebSocketCommonKt$writeFrame$1 = (RawWebSocketCommonKt$writeFrame$1) continuation;
            if ((rawWebSocketCommonKt$writeFrame$1.label & Integer.MIN_VALUE) != 0) {
                rawWebSocketCommonKt$writeFrame$1.label -= Integer.MIN_VALUE;
                Object obj = rawWebSocketCommonKt$writeFrame$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (rawWebSocketCommonKt$writeFrame$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        int length = frame.getData().length;
                        byte opcode = (byte) ((frame.getFin() ? 128 : 0) | (frame.getRsv1() ? 64 : 0) | (frame.getRsv2() ? 32 : 0) | (frame.getRsv3() ? 16 : 0) | frame.getFrameType().getOpcode());
                        rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel;
                        rawWebSocketCommonKt$writeFrame$1.L$1 = frame;
                        rawWebSocketCommonKt$writeFrame$1.Z$0 = z;
                        rawWebSocketCommonKt$writeFrame$1.I$0 = length;
                        rawWebSocketCommonKt$writeFrame$1.label = 1;
                        if (byteWriteChannel.writeByte(opcode, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        frame2 = frame;
                        i = length;
                        z2 = z;
                        i2 = i >= 126 ? i : i <= 65535 ? 126 : 127;
                        i3 = z2 ? 128 : 0;
                        rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel;
                        rawWebSocketCommonKt$writeFrame$1.L$1 = frame2;
                        rawWebSocketCommonKt$writeFrame$1.Z$0 = z2;
                        rawWebSocketCommonKt$writeFrame$1.I$0 = i;
                        rawWebSocketCommonKt$writeFrame$1.I$1 = i2;
                        rawWebSocketCommonKt$writeFrame$1.label = 2;
                        if (byteWriteChannel.writeByte((byte) (i3 | i2), rawWebSocketCommonKt$writeFrame$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteWriteChannel2 = byteWriteChannel;
                        i4 = i2;
                        frame3 = frame2;
                        z3 = z2;
                        if (i4 != 126) {
                            rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel2;
                            rawWebSocketCommonKt$writeFrame$1.L$1 = frame3;
                            rawWebSocketCommonKt$writeFrame$1.Z$0 = z3;
                            rawWebSocketCommonKt$writeFrame$1.label = 3;
                            if (byteWriteChannel2.writeShort((short) i, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i4 == 127) {
                                rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel2;
                                rawWebSocketCommonKt$writeFrame$1.L$1 = frame3;
                                rawWebSocketCommonKt$writeFrame$1.Z$0 = z3;
                                rawWebSocketCommonKt$writeFrame$1.label = 4;
                                if (byteWriteChannel2.writeLong(i, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            final byte[] data = frame3.getData();
                            ByteBuffer wrap = ByteBuffer.wrap(data, 0, data.length);
                            Intrinsics.checkNotNullExpressionValue(wrap, "wrap(...)");
                            ByteReadPacket = ByteReadPacketExtensionsKt.ByteReadPacket(wrap, new Function1<ByteBuffer, Unit>() { // from class: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$$inlined$ByteReadPacket$default$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ByteBuffer it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                                    invoke2(byteBuffer);
                                    return Unit.INSTANCE;
                                }
                            });
                            if (!z3) {
                                nextInt = Random.INSTANCE.nextInt();
                                rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel2;
                                rawWebSocketCommonKt$writeFrame$1.L$1 = ByteReadPacket;
                                rawWebSocketCommonKt$writeFrame$1.I$0 = nextInt;
                                rawWebSocketCommonKt$writeFrame$1.label = 5;
                                if (byteWriteChannel2.writeInt(nextInt, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteWriteChannel4 = byteWriteChannel2;
                                ByteReadPacket = mask(ByteReadPacket, nextInt);
                                byteWriteChannel2 = byteWriteChannel4;
                                rawWebSocketCommonKt$writeFrame$1.L$0 = null;
                                rawWebSocketCommonKt$writeFrame$1.L$1 = null;
                                rawWebSocketCommonKt$writeFrame$1.label = 6;
                                if (byteWriteChannel2.writePacket(ByteReadPacket, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                            if (z3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            rawWebSocketCommonKt$writeFrame$1.L$0 = null;
                            rawWebSocketCommonKt$writeFrame$1.L$1 = null;
                            rawWebSocketCommonKt$writeFrame$1.label = 6;
                            if (byteWriteChannel2.writePacket(ByteReadPacket, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                        z4 = z3;
                        frame4 = frame3;
                        byteWriteChannel3 = byteWriteChannel2;
                        frame3 = frame4;
                        byteWriteChannel2 = byteWriteChannel3;
                        z3 = z4;
                        final byte[] data2 = frame3.getData();
                        ByteBuffer wrap2 = ByteBuffer.wrap(data2, 0, data2.length);
                        Intrinsics.checkNotNullExpressionValue(wrap2, "wrap(...)");
                        ByteReadPacket = ByteReadPacketExtensionsKt.ByteReadPacket(wrap2, new Function1<ByteBuffer, Unit>() { // from class: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$$inlined$ByteReadPacket$default$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ByteBuffer it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                                invoke2(byteBuffer);
                                return Unit.INSTANCE;
                            }
                        });
                        if (!z3) {
                        }
                    case 1:
                        int i5 = rawWebSocketCommonKt$writeFrame$1.I$0;
                        boolean z5 = rawWebSocketCommonKt$writeFrame$1.Z$0;
                        Frame frame5 = (Frame) rawWebSocketCommonKt$writeFrame$1.L$1;
                        ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        z2 = z5;
                        frame2 = frame5;
                        i = i5;
                        byteWriteChannel = byteWriteChannel5;
                        if (i >= 126) {
                        }
                        if (z2) {
                        }
                        rawWebSocketCommonKt$writeFrame$1.L$0 = byteWriteChannel;
                        rawWebSocketCommonKt$writeFrame$1.L$1 = frame2;
                        rawWebSocketCommonKt$writeFrame$1.Z$0 = z2;
                        rawWebSocketCommonKt$writeFrame$1.I$0 = i;
                        rawWebSocketCommonKt$writeFrame$1.I$1 = i2;
                        rawWebSocketCommonKt$writeFrame$1.label = 2;
                        if (byteWriteChannel.writeByte((byte) (i3 | i2), rawWebSocketCommonKt$writeFrame$1) != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        i4 = rawWebSocketCommonKt$writeFrame$1.I$1;
                        i = rawWebSocketCommonKt$writeFrame$1.I$0;
                        z3 = rawWebSocketCommonKt$writeFrame$1.Z$0;
                        frame3 = (Frame) rawWebSocketCommonKt$writeFrame$1.L$1;
                        byteWriteChannel2 = (ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (i4 != 126) {
                        }
                        z4 = z3;
                        frame4 = frame3;
                        byteWriteChannel3 = byteWriteChannel2;
                        frame3 = frame4;
                        byteWriteChannel2 = byteWriteChannel3;
                        z3 = z4;
                        final byte[] data22 = frame3.getData();
                        ByteBuffer wrap22 = ByteBuffer.wrap(data22, 0, data22.length);
                        Intrinsics.checkNotNullExpressionValue(wrap22, "wrap(...)");
                        ByteReadPacket = ByteReadPacketExtensionsKt.ByteReadPacket(wrap22, new Function1<ByteBuffer, Unit>() { // from class: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$$inlined$ByteReadPacket$default$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ByteBuffer it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                                invoke2(byteBuffer);
                                return Unit.INSTANCE;
                            }
                        });
                        if (!z3) {
                        }
                        break;
                    case 3:
                    case 4:
                        z4 = rawWebSocketCommonKt$writeFrame$1.Z$0;
                        frame4 = (Frame) rawWebSocketCommonKt$writeFrame$1.L$1;
                        byteWriteChannel3 = (ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        frame3 = frame4;
                        byteWriteChannel2 = byteWriteChannel3;
                        z3 = z4;
                        final byte[] data222 = frame3.getData();
                        ByteBuffer wrap222 = ByteBuffer.wrap(data222, 0, data222.length);
                        Intrinsics.checkNotNullExpressionValue(wrap222, "wrap(...)");
                        ByteReadPacket = ByteReadPacketExtensionsKt.ByteReadPacket(wrap222, new Function1<ByteBuffer, Unit>() { // from class: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$$inlined$ByteReadPacket$default$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ByteBuffer it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                                invoke2(byteBuffer);
                                return Unit.INSTANCE;
                            }
                        });
                        if (!z3) {
                        }
                        break;
                    case 5:
                        nextInt = rawWebSocketCommonKt$writeFrame$1.I$0;
                        ByteReadPacket = (ByteReadPacket) rawWebSocketCommonKt$writeFrame$1.L$1;
                        byteWriteChannel4 = (ByteWriteChannel) rawWebSocketCommonKt$writeFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ByteReadPacket = mask(ByteReadPacket, nextInt);
                        byteWriteChannel2 = byteWriteChannel4;
                        rawWebSocketCommonKt$writeFrame$1.L$0 = null;
                        rawWebSocketCommonKt$writeFrame$1.L$1 = null;
                        rawWebSocketCommonKt$writeFrame$1.label = 6;
                        if (byteWriteChannel2.writePacket(ByteReadPacket, rawWebSocketCommonKt$writeFrame$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        rawWebSocketCommonKt$writeFrame$1 = new RawWebSocketCommonKt$writeFrame$1(continuation);
        Object obj2 = rawWebSocketCommonKt$writeFrame$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (rawWebSocketCommonKt$writeFrame$1.label) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38 */
    @InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readFrame(ByteReadChannel byteReadChannel, long j, int i, Continuation<? super Frame> continuation) {
        RawWebSocketCommonKt$readFrame$1 rawWebSocketCommonKt$readFrame$1;
        long j2;
        int i2;
        Object readByte;
        Object readByte2;
        ByteReadChannel byteReadChannel2;
        int i3;
        long j3;
        byte b;
        byte byteValue;
        int i4;
        FrameType frameType;
        int i5;
        FrameType frameType2;
        byte b2;
        int i6;
        byte b3;
        long j4;
        long j5;
        ByteReadChannel byteReadChannel3;
        FrameType frameType3;
        long shortValue;
        boolean z;
        int i7;
        int i8;
        int i9;
        FrameType frameType4;
        ?? r0;
        boolean z2;
        ByteReadChannel byteReadChannel4 = byteReadChannel;
        if (continuation instanceof RawWebSocketCommonKt$readFrame$1) {
            rawWebSocketCommonKt$readFrame$1 = (RawWebSocketCommonKt$readFrame$1) continuation;
            if ((rawWebSocketCommonKt$readFrame$1.label & Integer.MIN_VALUE) != 0) {
                rawWebSocketCommonKt$readFrame$1.label -= Integer.MIN_VALUE;
                Object obj = rawWebSocketCommonKt$readFrame$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (rawWebSocketCommonKt$readFrame$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel4;
                        j2 = j;
                        rawWebSocketCommonKt$readFrame$1.J$0 = j2;
                        i2 = i;
                        rawWebSocketCommonKt$readFrame$1.I$0 = i2;
                        rawWebSocketCommonKt$readFrame$1.label = 1;
                        readByte = byteReadChannel4.readByte(rawWebSocketCommonKt$readFrame$1);
                        if (readByte == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byte byteValue2 = ((Number) readByte).byteValue();
                        rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel4;
                        rawWebSocketCommonKt$readFrame$1.J$0 = j2;
                        rawWebSocketCommonKt$readFrame$1.I$0 = i2;
                        rawWebSocketCommonKt$readFrame$1.B$0 = byteValue2;
                        rawWebSocketCommonKt$readFrame$1.label = 2;
                        readByte2 = byteReadChannel4.readByte(rawWebSocketCommonKt$readFrame$1);
                        if (readByte2 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel2 = byteReadChannel4;
                        i3 = i2;
                        obj = readByte2;
                        j3 = j2;
                        b = byteValue2;
                        byteValue = ((Number) obj).byteValue();
                        i4 = b & Ascii.SI;
                        if (i4 != 0 && i3 == 0) {
                            throw new ProtocolViolationException("Can't continue finished frames");
                        }
                        int i10 = i4 != 0 ? i3 : i4;
                        frameType = FrameType.INSTANCE.get(i10);
                        if (frameType != null) {
                            throw new IllegalStateException("Unsupported opcode: " + i10);
                        }
                        if (i4 != 0 && i3 != 0 && !frameType.getControlFrame()) {
                            throw new ProtocolViolationException("Can't start new data frame before finishing previous one");
                        }
                        i5 = (b & 128) != 0 ? 1 : 0;
                        if (frameType.getControlFrame() && i5 == 0) {
                            throw new ProtocolViolationException("control frames can't be fragmented");
                        }
                        int i11 = byteValue & Byte.MAX_VALUE;
                        if (i11 == 126) {
                            rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel2;
                            rawWebSocketCommonKt$readFrame$1.L$1 = frameType;
                            rawWebSocketCommonKt$readFrame$1.J$0 = j3;
                            rawWebSocketCommonKt$readFrame$1.B$0 = b;
                            rawWebSocketCommonKt$readFrame$1.B$1 = byteValue;
                            rawWebSocketCommonKt$readFrame$1.I$0 = i5;
                            rawWebSocketCommonKt$readFrame$1.label = 3;
                            Object readShort = byteReadChannel2.readShort(rawWebSocketCommonKt$readFrame$1);
                            if (readShort == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            frameType2 = frameType;
                            b2 = byteValue;
                            i6 = i5;
                            obj = readShort;
                            shortValue = ((Number) obj).shortValue() & 65535;
                            i5 = i6;
                            byteValue = b2;
                            b3 = b;
                            byteReadChannel3 = byteReadChannel2;
                            frameType3 = frameType2;
                            j4 = j3;
                            j5 = shortValue;
                            if (!frameType3.getControlFrame()) {
                            }
                            if ((byteValue & 128) != 0) {
                            }
                            if (!z) {
                            }
                        } else if (i11 == 127) {
                            rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel2;
                            rawWebSocketCommonKt$readFrame$1.L$1 = frameType;
                            rawWebSocketCommonKt$readFrame$1.J$0 = j3;
                            rawWebSocketCommonKt$readFrame$1.B$0 = b;
                            rawWebSocketCommonKt$readFrame$1.B$1 = byteValue;
                            rawWebSocketCommonKt$readFrame$1.I$0 = i5;
                            rawWebSocketCommonKt$readFrame$1.label = 4;
                            Object readLong = byteReadChannel2.readLong(rawWebSocketCommonKt$readFrame$1);
                            if (readLong == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            frameType2 = frameType;
                            b2 = byteValue;
                            i6 = i5;
                            obj = readLong;
                            shortValue = ((Number) obj).longValue();
                            i5 = i6;
                            byteValue = b2;
                            b3 = b;
                            byteReadChannel3 = byteReadChannel2;
                            frameType3 = frameType2;
                            j4 = j3;
                            j5 = shortValue;
                            if (!frameType3.getControlFrame()) {
                            }
                            if ((byteValue & 128) != 0) {
                            }
                            if (!z) {
                            }
                        } else {
                            long j6 = i11;
                            b3 = b;
                            j4 = j3;
                            j5 = j6;
                            byteReadChannel3 = byteReadChannel2;
                            frameType3 = frameType;
                            if (!frameType3.getControlFrame() && j5 > 125) {
                                throw new ProtocolViolationException("control frames can't be larger than 125 bytes");
                            }
                            z = (byteValue & 128) != 0;
                            if (!z) {
                                if (z) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i7 = -1;
                                if (j5 <= 2147483647L) {
                                }
                                throw new FrameTooBigException(j5);
                            }
                            rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel3;
                            rawWebSocketCommonKt$readFrame$1.L$1 = frameType3;
                            rawWebSocketCommonKt$readFrame$1.J$0 = j4;
                            rawWebSocketCommonKt$readFrame$1.B$0 = b3;
                            rawWebSocketCommonKt$readFrame$1.I$0 = i5;
                            rawWebSocketCommonKt$readFrame$1.J$1 = j5;
                            rawWebSocketCommonKt$readFrame$1.label = 5;
                            Object readInt = byteReadChannel3.readInt(rawWebSocketCommonKt$readFrame$1);
                            if (readInt == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            int i12 = i5;
                            obj = readInt;
                            i8 = i12;
                            int intValue = ((Number) obj).intValue();
                            i5 = i8;
                            i7 = intValue;
                            if (j5 <= 2147483647L || j5 > j4) {
                                throw new FrameTooBigException(j5);
                            }
                            rawWebSocketCommonKt$readFrame$1.L$0 = frameType3;
                            rawWebSocketCommonKt$readFrame$1.L$1 = null;
                            rawWebSocketCommonKt$readFrame$1.B$0 = b3;
                            rawWebSocketCommonKt$readFrame$1.I$0 = i5;
                            rawWebSocketCommonKt$readFrame$1.I$1 = i7;
                            rawWebSocketCommonKt$readFrame$1.label = 6;
                            Object readPacket = byteReadChannel3.readPacket((int) j5, rawWebSocketCommonKt$readFrame$1);
                            if (readPacket == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i9 = i5;
                            obj = readPacket;
                            frameType4 = frameType3;
                            ByteReadPacket byteReadPacket = (ByteReadPacket) obj;
                            if (i7 != -1) {
                                byteReadPacket = mask(byteReadPacket, i7);
                            }
                            Frame.Companion companion = Frame.INSTANCE;
                            if (i9 == 0) {
                                z2 = true;
                                r0 = 0;
                            } else {
                                r0 = 0;
                                z2 = false;
                            }
                            return companion.byType(z2, frameType4, StringsKt.readBytes$default(byteReadPacket, r0, 1, null), (b3 & 64) == 0 ? true : r0, (b3 & 32) == 0 ? true : r0, (b3 & 16) == 0 ? true : r0);
                        }
                    case 1:
                        int i13 = rawWebSocketCommonKt$readFrame$1.I$0;
                        j2 = rawWebSocketCommonKt$readFrame$1.J$0;
                        ByteReadChannel byteReadChannel5 = (ByteReadChannel) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        i2 = i13;
                        byteReadChannel4 = byteReadChannel5;
                        readByte = obj;
                        byte byteValue22 = ((Number) readByte).byteValue();
                        rawWebSocketCommonKt$readFrame$1.L$0 = byteReadChannel4;
                        rawWebSocketCommonKt$readFrame$1.J$0 = j2;
                        rawWebSocketCommonKt$readFrame$1.I$0 = i2;
                        rawWebSocketCommonKt$readFrame$1.B$0 = byteValue22;
                        rawWebSocketCommonKt$readFrame$1.label = 2;
                        readByte2 = byteReadChannel4.readByte(rawWebSocketCommonKt$readFrame$1);
                        if (readByte2 != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        byte b4 = rawWebSocketCommonKt$readFrame$1.B$0;
                        i3 = rawWebSocketCommonKt$readFrame$1.I$0;
                        long j7 = rawWebSocketCommonKt$readFrame$1.J$0;
                        ByteReadChannel byteReadChannel6 = (ByteReadChannel) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteReadChannel2 = byteReadChannel6;
                        j3 = j7;
                        b = b4;
                        byteValue = ((Number) obj).byteValue();
                        i4 = b & Ascii.SI;
                        if (i4 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        frameType = FrameType.INSTANCE.get(i10);
                        if (frameType != null) {
                        }
                        break;
                    case 3:
                        i6 = rawWebSocketCommonKt$readFrame$1.I$0;
                        b2 = rawWebSocketCommonKt$readFrame$1.B$1;
                        b = rawWebSocketCommonKt$readFrame$1.B$0;
                        j3 = rawWebSocketCommonKt$readFrame$1.J$0;
                        frameType2 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$1;
                        byteReadChannel2 = (ByteReadChannel) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        shortValue = ((Number) obj).shortValue() & 65535;
                        i5 = i6;
                        byteValue = b2;
                        b3 = b;
                        byteReadChannel3 = byteReadChannel2;
                        frameType3 = frameType2;
                        j4 = j3;
                        j5 = shortValue;
                        if (!frameType3.getControlFrame()) {
                        }
                        if ((byteValue & 128) != 0) {
                        }
                        if (!z) {
                        }
                        break;
                    case 4:
                        i6 = rawWebSocketCommonKt$readFrame$1.I$0;
                        b2 = rawWebSocketCommonKt$readFrame$1.B$1;
                        b = rawWebSocketCommonKt$readFrame$1.B$0;
                        j3 = rawWebSocketCommonKt$readFrame$1.J$0;
                        frameType2 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$1;
                        byteReadChannel2 = (ByteReadChannel) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        shortValue = ((Number) obj).longValue();
                        i5 = i6;
                        byteValue = b2;
                        b3 = b;
                        byteReadChannel3 = byteReadChannel2;
                        frameType3 = frameType2;
                        j4 = j3;
                        j5 = shortValue;
                        if (!frameType3.getControlFrame()) {
                        }
                        if ((byteValue & 128) != 0) {
                        }
                        if (!z) {
                        }
                        break;
                    case 5:
                        j5 = rawWebSocketCommonKt$readFrame$1.J$1;
                        i8 = rawWebSocketCommonKt$readFrame$1.I$0;
                        b3 = rawWebSocketCommonKt$readFrame$1.B$0;
                        j4 = rawWebSocketCommonKt$readFrame$1.J$0;
                        frameType3 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$1;
                        byteReadChannel3 = (ByteReadChannel) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        int intValue2 = ((Number) obj).intValue();
                        i5 = i8;
                        i7 = intValue2;
                        if (j5 <= 2147483647L) {
                        }
                        throw new FrameTooBigException(j5);
                    case 6:
                        i7 = rawWebSocketCommonKt$readFrame$1.I$1;
                        i9 = rawWebSocketCommonKt$readFrame$1.I$0;
                        b3 = rawWebSocketCommonKt$readFrame$1.B$0;
                        FrameType frameType5 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        frameType4 = frameType5;
                        ByteReadPacket byteReadPacket2 = (ByteReadPacket) obj;
                        if (i7 != -1) {
                        }
                        Frame.Companion companion2 = Frame.INSTANCE;
                        if (i9 == 0) {
                        }
                        return companion2.byType(z2, frameType4, StringsKt.readBytes$default(byteReadPacket2, r0, 1, null), (b3 & 64) == 0 ? true : r0, (b3 & 32) == 0 ? true : r0, (b3 & 16) == 0 ? true : r0);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        rawWebSocketCommonKt$readFrame$1 = new RawWebSocketCommonKt$readFrame$1(continuation);
        Object obj2 = rawWebSocketCommonKt$readFrame$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (rawWebSocketCommonKt$readFrame$1.label) {
        }
    }

    private static final ByteReadPacket mask(ByteReadPacket byteReadPacket, int i) {
        DefaultAllocator defaultAllocator = DefaultAllocator.INSTANCE;
        ByteBuffer mo310allocgFvZug = defaultAllocator.mo310allocgFvZug(4);
        try {
            mo310allocgFvZug.putInt(0, i);
            BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
            try {
                int remaining = (int) byteReadPacket.getRemaining();
                for (int i2 = 0; i2 < remaining; i2++) {
                    bytePacketBuilder.writeByte((byte) (byteReadPacket.readByte() ^ mo310allocgFvZug.get(i2 % 4)));
                }
                return bytePacketBuilder.build();
            } finally {
            }
        } finally {
            defaultAllocator.mo311free3GNKZMM(mo310allocgFvZug);
        }
    }
}
