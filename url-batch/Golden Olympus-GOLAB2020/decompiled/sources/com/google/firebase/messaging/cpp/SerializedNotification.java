package com.google.firebase.messaging.cpp;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class SerializedNotification extends Table {

    public static final class Vector extends BaseVector {
        public Vector __assign(int i4, int i5, ByteBuffer byteBuffer) {
            __reset(i4, i5, byteBuffer);
            return this;
        }

        public SerializedNotification get(int i4) {
            return get(new SerializedNotification(), i4);
        }

        public SerializedNotification get(SerializedNotification serializedNotification, int i4) {
            return serializedNotification.__assign(Table.__indirect(__element(i4), this.bb), this.bb);
        }
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_1_12_0();
    }

    public static void addAndroidChannelId(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(12, i4, 0);
    }

    public static void addBadge(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(4, i4, 0);
    }

    public static void addBody(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(1, i4, 0);
    }

    public static void addBodyLocArgs(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(9, i4, 0);
    }

    public static void addBodyLocKey(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(8, i4, 0);
    }

    public static void addClickAction(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(7, i4, 0);
    }

    public static void addColor(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(6, i4, 0);
    }

    public static void addIcon(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(2, i4, 0);
    }

    public static void addSound(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(3, i4, 0);
    }

    public static void addTag(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(5, i4, 0);
    }

    public static void addTitle(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(0, i4, 0);
    }

    public static void addTitleLocArgs(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(11, i4, 0);
    }

    public static void addTitleLocKey(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.addOffset(10, i4, 0);
    }

    public static int createBodyLocArgsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSerializedNotification(FlatBufferBuilder flatBufferBuilder, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        flatBufferBuilder.startTable(13);
        addAndroidChannelId(flatBufferBuilder, i16);
        addTitleLocArgs(flatBufferBuilder, i15);
        addTitleLocKey(flatBufferBuilder, i14);
        addBodyLocArgs(flatBufferBuilder, i13);
        addBodyLocKey(flatBufferBuilder, i12);
        addClickAction(flatBufferBuilder, i11);
        addColor(flatBufferBuilder, i10);
        addTag(flatBufferBuilder, i9);
        addBadge(flatBufferBuilder, i8);
        addSound(flatBufferBuilder, i7);
        addIcon(flatBufferBuilder, i6);
        addBody(flatBufferBuilder, i5);
        addTitle(flatBufferBuilder, i4);
        return endSerializedNotification(flatBufferBuilder);
    }

    public static int createTitleLocArgsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int endSerializedNotification(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static SerializedNotification getRootAsSerializedNotification(ByteBuffer byteBuffer) {
        return getRootAsSerializedNotification(byteBuffer, new SerializedNotification());
    }

    public static void startBodyLocArgsVector(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.startVector(4, i4, 4);
    }

    public static void startSerializedNotification(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(13);
    }

    public static void startTitleLocArgsVector(FlatBufferBuilder flatBufferBuilder, int i4) {
        flatBufferBuilder.startVector(4, i4, 4);
    }

    public SerializedNotification __assign(int i4, ByteBuffer byteBuffer) {
        __init(i4, byteBuffer);
        return this;
    }

    public void __init(int i4, ByteBuffer byteBuffer) {
        __reset(i4, byteBuffer);
    }

    public String androidChannelId() {
        int __offset = __offset(28);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer androidChannelIdAsByteBuffer() {
        return __vector_as_bytebuffer(28, 1);
    }

    public ByteBuffer androidChannelIdInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 28, 1);
    }

    public String badge() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer badgeAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public ByteBuffer badgeInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 12, 1);
    }

    public String body() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer bodyAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer bodyInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public String bodyLocArgs(int i4) {
        int __offset = __offset(22);
        if (__offset != 0) {
            return __string(__vector(__offset) + (i4 * 4));
        }
        return null;
    }

    public int bodyLocArgsLength() {
        int __offset = __offset(22);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public StringVector bodyLocArgsVector() {
        return bodyLocArgsVector(new StringVector());
    }

    public String bodyLocKey() {
        int __offset = __offset(20);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer bodyLocKeyAsByteBuffer() {
        return __vector_as_bytebuffer(20, 1);
    }

    public ByteBuffer bodyLocKeyInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 20, 1);
    }

    public String clickAction() {
        int __offset = __offset(18);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer clickActionAsByteBuffer() {
        return __vector_as_bytebuffer(18, 1);
    }

    public ByteBuffer clickActionInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 18, 1);
    }

    public String color() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer colorAsByteBuffer() {
        return __vector_as_bytebuffer(16, 1);
    }

    public ByteBuffer colorInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 1);
    }

    public String icon() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer iconAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer iconInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public String sound() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer soundAsByteBuffer() {
        return __vector_as_bytebuffer(10, 1);
    }

    public ByteBuffer soundInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 10, 1);
    }

    public String tag() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer tagAsByteBuffer() {
        return __vector_as_bytebuffer(14, 1);
    }

    public ByteBuffer tagInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 14, 1);
    }

    public String title() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer titleAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer titleInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public String titleLocArgs(int i4) {
        int __offset = __offset(26);
        if (__offset != 0) {
            return __string(__vector(__offset) + (i4 * 4));
        }
        return null;
    }

    public int titleLocArgsLength() {
        int __offset = __offset(26);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public StringVector titleLocArgsVector() {
        return titleLocArgsVector(new StringVector());
    }

    public String titleLocKey() {
        int __offset = __offset(24);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer titleLocKeyAsByteBuffer() {
        return __vector_as_bytebuffer(24, 1);
    }

    public ByteBuffer titleLocKeyInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 24, 1);
    }

    public static SerializedNotification getRootAsSerializedNotification(ByteBuffer byteBuffer, SerializedNotification serializedNotification) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return serializedNotification.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public StringVector bodyLocArgsVector(StringVector stringVector) {
        int __offset = __offset(22);
        if (__offset != 0) {
            return stringVector.__assign(__vector(__offset), 4, this.bb);
        }
        return null;
    }

    public StringVector titleLocArgsVector(StringVector stringVector) {
        int __offset = __offset(26);
        if (__offset != 0) {
            return stringVector.__assign(__vector(__offset), 4, this.bb);
        }
        return null;
    }
}
