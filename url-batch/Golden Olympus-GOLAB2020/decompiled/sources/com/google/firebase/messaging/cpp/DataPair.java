package com.google.firebase.messaging.cpp;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class DataPair extends Table {

    public static final class Vector extends BaseVector {
        public Vector __assign(int i4, int i5, ByteBuffer byteBuffer) {
            __reset(i4, i5, byteBuffer);
            return this;
        }

        public DataPair get(int i4) {
            return get(new DataPair(), i4);
        }

        public DataPair get(DataPair dataPair, int i4) {
            return dataPair.__assign(Table.__indirect(__element(i4), this.bb), this.bb);
        }
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_1_12_0();
    }

    public static void addKey(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(0, i4, 0);
    }

    public static void addValue(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(1, i4, 0);
    }

    public static int createDataPair(FlatBufferBuilder flatBufferBuilder, int i4, int i5) {
        flatBufferBuilder.startTable(2);
        addValue(flatBufferBuilder, i5);
        addKey(flatBufferBuilder, i4);
        return endDataPair(flatBufferBuilder);
    }

    public static int endDataPair(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static DataPair getRootAsDataPair(ByteBuffer byteBuffer) {
        return getRootAsDataPair(byteBuffer, new DataPair());
    }

    public static void startDataPair(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public DataPair __assign(int i4, ByteBuffer byteBuffer) {
        __init(i4, byteBuffer);
        return this;
    }

    public void __init(int i4, ByteBuffer byteBuffer) {
        __reset(i4, byteBuffer);
    }

    public String key() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer keyAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer keyInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public String value() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer valueAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer valueInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public static DataPair getRootAsDataPair(ByteBuffer byteBuffer, DataPair dataPair) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return dataPair.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
}
