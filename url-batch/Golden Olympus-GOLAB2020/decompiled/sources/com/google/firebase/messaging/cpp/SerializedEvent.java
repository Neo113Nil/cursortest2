package com.google.firebase.messaging.cpp;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class SerializedEvent extends Table {

    public static final class Vector extends BaseVector {
        public Vector __assign(int i4, int i5, ByteBuffer byteBuffer) {
            __reset(i4, i5, byteBuffer);
            return this;
        }

        public SerializedEvent get(int i4) {
            return get(new SerializedEvent(), i4);
        }

        public SerializedEvent get(SerializedEvent serializedEvent, int i4) {
            return serializedEvent.__assign(Table.__indirect(__element(i4), this.bb), this.bb);
        }
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_1_12_0();
    }

    public static void addEvent(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(1, i4, 0);
    }

    public static void addEventType(FlatBufferBuilder flatBufferBuilder, byte b4) {
        flatBufferBuilder.addByte(0, b4, 0);
    }

    public static int createSerializedEvent(FlatBufferBuilder flatBufferBuilder, byte b4, int i4) {
        flatBufferBuilder.startTable(2);
        addEvent(flatBufferBuilder, i4);
        addEventType(flatBufferBuilder, b4);
        return endSerializedEvent(flatBufferBuilder);
    }

    public static int endSerializedEvent(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static void finishSerializedEventBuffer(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.finish(i4);
    }

    public static void finishSizePrefixedSerializedEventBuffer(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.finishSizePrefixed(i4);
    }

    public static SerializedEvent getRootAsSerializedEvent(ByteBuffer byteBuffer) {
        return getRootAsSerializedEvent(byteBuffer, new SerializedEvent());
    }

    public static void startSerializedEvent(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public SerializedEvent __assign(int i4, ByteBuffer byteBuffer) {
        __init(i4, byteBuffer);
        return this;
    }

    public void __init(int i4, ByteBuffer byteBuffer) {
        __reset(i4, byteBuffer);
    }

    public Table event(Table table) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __union(table, __offset + this.bb_pos);
        }
        return null;
    }

    public byte eventType() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.bb.get(__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static SerializedEvent getRootAsSerializedEvent(ByteBuffer byteBuffer, SerializedEvent serializedEvent) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return serializedEvent.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
}
