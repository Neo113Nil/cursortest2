package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BoostMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BoostMessage((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BoostMessage boostMessage = (BoostMessage) obj;
        reverseProtoWriter.getClass();
        boostMessage.getClass();
        reverseProtoWriter.writeBytes(boostMessage.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, boostMessage.ml_boost_identifier);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, boostMessage.boost_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BoostMessage boostMessage = (BoostMessage) obj;
        boostMessage.getClass();
        int size$okio = boostMessage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, boostMessage.ml_boost_identifier) + protoAdapter.encodedSizeWithTag(1, boostMessage.boost_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BoostMessage boostMessage = (BoostMessage) obj;
        boostMessage.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = boostMessage.boost_token;
        String str2 = boostMessage.ml_boost_identifier;
        byteString.getClass();
        return new BoostMessage(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BoostMessage boostMessage = (BoostMessage) obj;
        boostMessage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, boostMessage.boost_token);
        protoAdapter.encodeWithTag(protoWriter, 2, boostMessage.ml_boost_identifier);
        protoWriter.writeBytes(boostMessage.unknownFields());
    }
}
