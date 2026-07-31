package com.google.firebase.messaging.cpp;

import com.google.firebase.messaging.cpp.DataPair;
import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class SerializedMessage extends Table {

    public static final class Vector extends BaseVector {
        public Vector __assign(int i4, int i5, ByteBuffer byteBuffer) {
            __reset(i4, i5, byteBuffer);
            return this;
        }

        public SerializedMessage get(int i4) {
            return get(new SerializedMessage(), i4);
        }

        public SerializedMessage get(SerializedMessage serializedMessage, int i4) {
            return serializedMessage.__assign(Table.__indirect(__element(i4), this.bb), this.bb);
        }
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_1_12_0();
    }

    public static void addCollapseKey(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(2, i4, 0);
    }

    public static void addData(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(3, i4, 0);
    }

    public static void addError(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(9, i4, 0);
    }

    public static void addErrorDescription(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(10, i4, 0);
    }

    public static void addFrom(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(0, i4, 0);
    }

    public static void addLink(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(13, i4, 0);
    }

    public static void addMessageId(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(5, i4, 0);
    }

    public static void addMessageType(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(6, i4, 0);
    }

    public static void addNotification(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(11, i4, 0);
    }

    public static void addNotificationOpened(FlatBufferBuilder flatBufferBuilder, boolean z4) {
        flatBufferBuilder.addBoolean(12, z4, false);
    }

    public static void addOriginalPriority(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(15, i4, 0);
    }

    public static void addPriority(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(7, i4, 0);
    }

    public static void addRawData(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(4, i4, 0);
    }

    public static void addSentTime(FlatBufferBuilder flatBufferBuilder, long j4) {
        flatBufferBuilder.addLong(14, j4, 0L);
    }

    public static void addTimeToLive(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addInt(8, i4, 0);
    }

    public static void addTo(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(1, i4, 0);
    }

    public static int createDataVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createRawDataVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        return flatBufferBuilder.createByteVector(bArr);
    }

    public static int createSerializedMessage(FlatBufferBuilder flatBufferBuilder, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z4, int i16, long j4, int i17) {
        flatBufferBuilder.startTable(16);
        addSentTime(flatBufferBuilder, j4);
        addOriginalPriority(flatBufferBuilder, i17);
        addLink(flatBufferBuilder, i16);
        addNotification(flatBufferBuilder, i15);
        addErrorDescription(flatBufferBuilder, i14);
        addError(flatBufferBuilder, i13);
        addTimeToLive(flatBufferBuilder, i12);
        addPriority(flatBufferBuilder, i11);
        addMessageType(flatBufferBuilder, i10);
        addMessageId(flatBufferBuilder, i9);
        addRawData(flatBufferBuilder, i8);
        addData(flatBufferBuilder, i7);
        addCollapseKey(flatBufferBuilder, i6);
        addTo(flatBufferBuilder, i5);
        addFrom(flatBufferBuilder, i4);
        addNotificationOpened(flatBufferBuilder, z4);
        return endSerializedMessage(flatBufferBuilder);
    }

    public static int endSerializedMessage(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static SerializedMessage getRootAsSerializedMessage(ByteBuffer byteBuffer) {
        return getRootAsSerializedMessage(byteBuffer, new SerializedMessage());
    }

    public static void startDataVector(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.startVector(4, i4, 4);
    }

    public static void startRawDataVector(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.startVector(1, i4, 1);
    }

    public static void startSerializedMessage(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(16);
    }

    public SerializedMessage __assign(int i4, ByteBuffer byteBuffer) {
        __init(i4, byteBuffer);
        return this;
    }

    public void __init(int i4, ByteBuffer byteBuffer) {
        __reset(i4, byteBuffer);
    }

    public String collapseKey() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer collapseKeyAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer collapseKeyInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public DataPair data(int i4) {
        return data(new DataPair(), i4);
    }

    public int dataLength() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public DataPair.Vector dataVector() {
        return dataVector(new DataPair.Vector());
    }

    public String error() {
        int __offset = __offset(22);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer errorAsByteBuffer() {
        return __vector_as_bytebuffer(22, 1);
    }

    public String errorDescription() {
        int __offset = __offset(24);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer errorDescriptionAsByteBuffer() {
        return __vector_as_bytebuffer(24, 1);
    }

    public ByteBuffer errorDescriptionInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 24, 1);
    }

    public ByteBuffer errorInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 22, 1);
    }

    public String from() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer fromAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer fromInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public String link() {
        int __offset = __offset(30);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer linkAsByteBuffer() {
        return __vector_as_bytebuffer(30, 1);
    }

    public ByteBuffer linkInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 30, 1);
    }

    public String messageId() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer messageIdAsByteBuffer() {
        return __vector_as_bytebuffer(14, 1);
    }

    public ByteBuffer messageIdInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 14, 1);
    }

    public String messageType() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer messageTypeAsByteBuffer() {
        return __vector_as_bytebuffer(16, 1);
    }

    public ByteBuffer messageTypeInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 1);
    }

    public SerializedNotification notification() {
        return notification(new SerializedNotification());
    }

    public boolean notificationOpened() {
        int __offset = __offset(28);
        return (__offset == 0 || this.bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    public String originalPriority() {
        int __offset = __offset(34);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer originalPriorityAsByteBuffer() {
        return __vector_as_bytebuffer(34, 1);
    }

    public ByteBuffer originalPriorityInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 34, 1);
    }

    public String priority() {
        int __offset = __offset(18);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer priorityAsByteBuffer() {
        return __vector_as_bytebuffer(18, 1);
    }

    public ByteBuffer priorityInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 18, 1);
    }

    public int rawData(int i4) {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.bb.get(__vector(__offset) + i4) & 255;
        }
        return 0;
    }

    public ByteBuffer rawDataAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public ByteBuffer rawDataInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 12, 1);
    }

    public int rawDataLength() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public ByteVector rawDataVector() {
        return rawDataVector(new ByteVector());
    }

    public long sentTime() {
        int __offset = __offset(32);
        if (__offset != 0) {
            return this.bb.getLong(__offset + this.bb_pos);
        }
        return 0L;
    }

    public int timeToLive() {
        int __offset = __offset(20);
        if (__offset != 0) {
            return this.bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public String to() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer toAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer toInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public static int createRawDataVector(FlatBufferBuilder flatBufferBuilder, ByteBuffer byteBuffer) {
        return flatBufferBuilder.createByteVector(byteBuffer);
    }

    public static SerializedMessage getRootAsSerializedMessage(ByteBuffer byteBuffer, SerializedMessage serializedMessage) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return serializedMessage.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public DataPair data(DataPair dataPair, int i4) {
        int __offset = __offset(10);
        if (__offset != 0) {
            return dataPair.__assign(__indirect(__vector(__offset) + (i4 * 4)), this.bb);
        }
        return null;
    }

    public DataPair.Vector dataVector(DataPair.Vector vector) {
        int __offset = __offset(10);
        if (__offset != 0) {
            return vector.__assign(__vector(__offset), 4, this.bb);
        }
        return null;
    }

    public SerializedNotification notification(SerializedNotification serializedNotification) {
        int __offset = __offset(26);
        if (__offset != 0) {
            return serializedNotification.__assign(__indirect(__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public ByteVector rawDataVector(ByteVector byteVector) {
        int __offset = __offset(12);
        if (__offset != 0) {
            return byteVector.__assign(__vector(__offset), this.bb);
        }
        return null;
    }
}
