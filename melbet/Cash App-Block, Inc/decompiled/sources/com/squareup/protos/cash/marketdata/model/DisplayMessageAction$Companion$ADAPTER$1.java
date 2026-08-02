package com.squareup.protos.cash.marketdata.model;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DisplayMessageAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DisplayMessageAction((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        DisplayMessageAction displayMessageAction = (DisplayMessageAction) obj;
        reverseProtoWriter.getClass();
        displayMessageAction.getClass();
        reverseProtoWriter.writeBytes(displayMessageAction.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, displayMessageAction.message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, displayMessageAction.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DisplayMessageAction displayMessageAction = (DisplayMessageAction) obj;
        displayMessageAction.getClass();
        int size$okio = displayMessageAction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, displayMessageAction.message) + protoAdapter.encodedSizeWithTag(1, displayMessageAction.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DisplayMessageAction displayMessageAction = (DisplayMessageAction) obj;
        displayMessageAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = displayMessageAction.title;
        String str2 = displayMessageAction.message;
        byteString.getClass();
        return new DisplayMessageAction(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisplayMessageAction displayMessageAction = (DisplayMessageAction) obj;
        displayMessageAction.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, displayMessageAction.title);
        protoAdapter.encodeWithTag(protoWriter, 2, displayMessageAction.message);
        protoWriter.writeBytes(displayMessageAction.unknownFields());
    }
}
