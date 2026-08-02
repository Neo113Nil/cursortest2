package com.squareup.protos.cash.genericelements.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PlaceholderContainer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PlaceholderContainer((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        PlaceholderContainer placeholderContainer = (PlaceholderContainer) obj;
        reverseProtoWriter.getClass();
        placeholderContainer.getClass();
        reverseProtoWriter.writeBytes(placeholderContainer.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, placeholderContainer.proto_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, placeholderContainer.encoded_input_proto);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PlaceholderContainer placeholderContainer = (PlaceholderContainer) obj;
        placeholderContainer.getClass();
        int size$okio = placeholderContainer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, placeholderContainer.proto_type) + protoAdapter.encodedSizeWithTag(1, placeholderContainer.encoded_input_proto) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PlaceholderContainer placeholderContainer = (PlaceholderContainer) obj;
        placeholderContainer.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = placeholderContainer.encoded_input_proto;
        String str2 = placeholderContainer.proto_type;
        byteString.getClass();
        return new PlaceholderContainer(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PlaceholderContainer placeholderContainer = (PlaceholderContainer) obj;
        placeholderContainer.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, placeholderContainer.encoded_input_proto);
        protoAdapter.encodeWithTag(protoWriter, 2, placeholderContainer.proto_type);
        protoWriter.writeBytes(placeholderContainer.unknownFields());
    }
}
