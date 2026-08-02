package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsGoalEmoji$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsGoalEmoji((Boolean) obj4, (String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsGoalEmoji savingsGoalEmoji = (SavingsGoalEmoji) obj;
        reverseProtoWriter.getClass();
        savingsGoalEmoji.getClass();
        reverseProtoWriter.writeBytes(savingsGoalEmoji.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, savingsGoalEmoji.active);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, savingsGoalEmoji.accessibility_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, savingsGoalEmoji.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, savingsGoalEmoji.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsGoalEmoji savingsGoalEmoji = (SavingsGoalEmoji) obj;
        savingsGoalEmoji.getClass();
        int size$okio = savingsGoalEmoji.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, savingsGoalEmoji.active) + protoAdapter.encodedSizeWithTag(3, savingsGoalEmoji.accessibility_text) + protoAdapter.encodedSizeWithTag(2, savingsGoalEmoji.text) + protoAdapter.encodedSizeWithTag(1, savingsGoalEmoji.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsGoalEmoji savingsGoalEmoji = (SavingsGoalEmoji) obj;
        savingsGoalEmoji.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = savingsGoalEmoji.name;
        String str2 = savingsGoalEmoji.text;
        String str3 = savingsGoalEmoji.accessibility_text;
        Boolean bool = savingsGoalEmoji.active;
        byteString.getClass();
        return new SavingsGoalEmoji(bool, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsGoalEmoji savingsGoalEmoji = (SavingsGoalEmoji) obj;
        savingsGoalEmoji.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, savingsGoalEmoji.name);
        protoAdapter.encodeWithTag(protoWriter, 2, savingsGoalEmoji.text);
        protoAdapter.encodeWithTag(protoWriter, 3, savingsGoalEmoji.accessibility_text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, savingsGoalEmoji.active);
        protoWriter.writeBytes(savingsGoalEmoji.unknownFields());
    }
}
