package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SelectBoostElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectBoostElement((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectBoostElement selectBoostElement = (SelectBoostElement) obj;
        reverseProtoWriter.getClass();
        selectBoostElement.getClass();
        reverseProtoWriter.writeBytes(selectBoostElement.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, selectBoostElement.upsell_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, selectBoostElement.upsell_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, selectBoostElement.boost_identifier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectBoostElement selectBoostElement = (SelectBoostElement) obj;
        selectBoostElement.getClass();
        int size$okio = selectBoostElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, selectBoostElement.upsell_description) + protoAdapter.encodedSizeWithTag(2, selectBoostElement.upsell_button_text) + protoAdapter.encodedSizeWithTag(1, selectBoostElement.boost_identifier) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectBoostElement selectBoostElement = (SelectBoostElement) obj;
        selectBoostElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = selectBoostElement.boost_identifier;
        String str2 = selectBoostElement.upsell_button_text;
        String str3 = selectBoostElement.upsell_description;
        byteString.getClass();
        return new SelectBoostElement(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectBoostElement selectBoostElement = (SelectBoostElement) obj;
        selectBoostElement.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, selectBoostElement.boost_identifier);
        protoAdapter.encodeWithTag(protoWriter, 2, selectBoostElement.upsell_button_text);
        protoAdapter.encodeWithTag(protoWriter, 3, selectBoostElement.upsell_description);
        protoWriter.writeBytes(selectBoostElement.unknownFields());
    }
}
