package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ItemMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ItemMetadata((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 3:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ItemMetadata itemMetadata = (ItemMetadata) obj;
        reverseProtoWriter.getClass();
        itemMetadata.getClass();
        reverseProtoWriter.writeBytes(itemMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, itemMetadata.business_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, itemMetadata.business_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, itemMetadata.entity_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, itemMetadata.entity_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, itemMetadata.suggestion_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, itemMetadata.strategy_n_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, itemMetadata.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ItemMetadata itemMetadata = (ItemMetadata) obj;
        itemMetadata.getClass();
        int size$okio = itemMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(8, itemMetadata.business_name) + protoAdapter.encodedSizeWithTag(7, itemMetadata.business_token) + protoAdapter.encodedSizeWithTag(6, itemMetadata.entity_name) + protoAdapter.encodedSizeWithTag(5, itemMetadata.entity_type) + protoAdapter.encodedSizeWithTag(4, itemMetadata.suggestion_id) + protoAdapter.encodedSizeWithTag(3, itemMetadata.strategy_n_version) + protoAdapter.encodedSizeWithTag(1, itemMetadata.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ItemMetadata itemMetadata = (ItemMetadata) obj;
        itemMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = itemMetadata.token;
        String str2 = itemMetadata.entity_type;
        String str3 = itemMetadata.entity_name;
        String str4 = itemMetadata.business_token;
        String str5 = itemMetadata.business_name;
        byteString.getClass();
        return new ItemMetadata(str, null, null, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ItemMetadata itemMetadata = (ItemMetadata) obj;
        itemMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, itemMetadata.token);
        protoAdapter.encodeWithTag(protoWriter, 3, itemMetadata.strategy_n_version);
        protoAdapter.encodeWithTag(protoWriter, 4, itemMetadata.suggestion_id);
        protoAdapter.encodeWithTag(protoWriter, 5, itemMetadata.entity_type);
        protoAdapter.encodeWithTag(protoWriter, 6, itemMetadata.entity_name);
        protoAdapter.encodeWithTag(protoWriter, 7, itemMetadata.business_token);
        protoAdapter.encodeWithTag(protoWriter, 8, itemMetadata.business_name);
        protoWriter.writeBytes(itemMetadata.unknownFields());
    }
}
