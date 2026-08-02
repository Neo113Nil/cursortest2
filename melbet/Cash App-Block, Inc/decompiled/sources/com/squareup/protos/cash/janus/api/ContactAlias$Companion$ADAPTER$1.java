package com.squareup.protos.cash.janus.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContactAlias$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ContactAlias((String) obj, (ContactAliasType) obj2, (String) obj3, (String) obj4, (Long) obj5, (Long) obj6, (Long) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = ContactAliasType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ContactAlias contactAlias = (ContactAlias) obj;
        reverseProtoWriter.getClass();
        contactAlias.getClass();
        reverseProtoWriter.writeBytes(contactAlias.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, contactAlias.version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, contactAlias.linked_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, contactAlias.updated_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, contactAlias.hashed_alias_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, contactAlias.alias_value);
        ContactAliasType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, contactAlias.alias_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, contactAlias.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ContactAlias contactAlias = (ContactAlias) obj;
        contactAlias.getClass();
        int size$okio = contactAlias.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, contactAlias.hashed_alias_token) + protoAdapter.encodedSizeWithTag(3, contactAlias.alias_value) + ContactAliasType.ADAPTER.encodedSizeWithTag(2, contactAlias.alias_type) + protoAdapter.encodedSizeWithTag(1, contactAlias.customer_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter2.encodedSizeWithTag(7, contactAlias.version) + protoAdapter2.encodedSizeWithTag(6, contactAlias.linked_at) + protoAdapter2.encodedSizeWithTag(5, contactAlias.updated_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContactAlias contactAlias = (ContactAlias) obj;
        contactAlias.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = contactAlias.customer_token;
        ContactAliasType contactAliasType = contactAlias.alias_type;
        String str2 = contactAlias.hashed_alias_token;
        Long l = contactAlias.updated_at;
        Long l2 = contactAlias.linked_at;
        Long l3 = contactAlias.version;
        byteString.getClass();
        return new ContactAlias(str, contactAliasType, null, str2, l, l2, l3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContactAlias contactAlias = (ContactAlias) obj;
        contactAlias.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, contactAlias.customer_token);
        ContactAliasType.ADAPTER.encodeWithTag(protoWriter, 2, contactAlias.alias_type);
        protoAdapter.encodeWithTag(protoWriter, 3, contactAlias.alias_value);
        protoAdapter.encodeWithTag(protoWriter, 4, contactAlias.hashed_alias_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 5, contactAlias.updated_at);
        protoAdapter2.encodeWithTag(protoWriter, 6, contactAlias.linked_at);
        protoAdapter2.encodeWithTag(protoWriter, 7, contactAlias.version);
        protoWriter.writeBytes(contactAlias.unknownFields());
    }
}
