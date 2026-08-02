package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Identifier$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Identifier((IdentifierType) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = IdentifierType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Identifier identifier = (Identifier) obj;
        reverseProtoWriter.getClass();
        identifier.getClass();
        reverseProtoWriter.writeBytes(identifier.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, identifier.token);
        IdentifierType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, identifier.f1257type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Identifier identifier = (Identifier) obj;
        identifier.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, identifier.token) + IdentifierType.ADAPTER.encodedSizeWithTag(1, identifier.f1257type) + identifier.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Identifier identifier = (Identifier) obj;
        identifier.getClass();
        ByteString byteString = ByteString.EMPTY;
        IdentifierType identifierType = identifier.f1257type;
        String str = identifier.token;
        byteString.getClass();
        return new Identifier(identifierType, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Identifier identifier = (Identifier) obj;
        identifier.getClass();
        IdentifierType.ADAPTER.encodeWithTag(protoWriter, 1, identifier.f1257type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, identifier.token);
        protoWriter.writeBytes(identifier.unknownFields());
    }
}
