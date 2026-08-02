package com.squareup.protos.person;

import com.squareup.protos.person.Alias;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Alias$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Alias((Alias.AliasType) obj, (String) obj2, (String) obj3, (Long) obj4, (Long) obj5, (Long) obj6, (Long) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = Alias.AliasType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
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
        Alias alias = (Alias) obj;
        reverseProtoWriter.getClass();
        alias.getClass();
        reverseProtoWriter.writeBytes(alias.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, alias.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, alias.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, alias.last_verified_at_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, alias.first_verified_at_ms);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, alias.value);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, alias.scope);
        Alias.AliasType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, alias.f1406type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Alias alias = (Alias) obj;
        alias.getClass();
        int encodedSizeWithTag = Alias.AliasType.ADAPTER.encodedSizeWithTag(1, alias.f1406type) + alias.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, alias.value) + protoAdapter.encodedSizeWithTag(2, alias.scope) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter2.encodedSizeWithTag(7, alias.updated_at) + protoAdapter2.encodedSizeWithTag(6, alias.created_at) + protoAdapter2.encodedSizeWithTag(5, alias.last_verified_at_ms) + protoAdapter2.encodedSizeWithTag(4, alias.first_verified_at_ms) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Alias alias = (Alias) obj;
        alias.getClass();
        ByteString byteString = ByteString.EMPTY;
        Alias.AliasType aliasType = alias.f1406type;
        String str = alias.scope;
        Long l = alias.first_verified_at_ms;
        Long l2 = alias.last_verified_at_ms;
        Long l3 = alias.created_at;
        Long l4 = alias.updated_at;
        byteString.getClass();
        return new Alias(aliasType, str, null, l, l2, l3, l4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Alias alias = (Alias) obj;
        alias.getClass();
        Alias.AliasType.ADAPTER.encodeWithTag(protoWriter, 1, alias.f1406type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, alias.scope);
        protoAdapter.encodeWithTag(protoWriter, 3, alias.value);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 4, alias.first_verified_at_ms);
        protoAdapter2.encodeWithTag(protoWriter, 5, alias.last_verified_at_ms);
        protoAdapter2.encodeWithTag(protoWriter, 6, alias.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 7, alias.updated_at);
        protoWriter.writeBytes(alias.unknownFields());
    }
}
