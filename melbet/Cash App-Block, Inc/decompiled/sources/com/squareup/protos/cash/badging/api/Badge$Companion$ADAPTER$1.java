package com.squareup.protos.cash.badging.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Badge$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
                return new Badge((String) obj, (String) obj2, (Long) obj3, (Long) obj4, (Long) obj5, (Boolean) obj6, (ItemType) obj7, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    try {
                        obj7 = ItemType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 8:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Badge badge = (Badge) obj;
        reverseProtoWriter.getClass();
        badge.getClass();
        reverseProtoWriter.writeBytes(badge.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 8, badge.count_groups);
        ItemType.ADAPTER.encodeWithTag(reverseProtoWriter, 7, badge.item_type);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, badge.is_badged);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, badge.created_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, badge.updated_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, badge.external_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, badge.customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, badge.external_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Badge badge = (Badge) obj;
        badge.getClass();
        int size$okio = badge.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, badge.customer_token) + protoAdapter.encodedSizeWithTag(1, badge.external_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter.asRepeated().encodedSizeWithTag(8, badge.count_groups) + ItemType.ADAPTER.encodedSizeWithTag(7, badge.item_type) + ProtoAdapter.BOOL.encodedSizeWithTag(6, badge.is_badged) + protoAdapter2.encodedSizeWithTag(5, badge.created_at) + protoAdapter2.encodedSizeWithTag(4, badge.updated_at) + protoAdapter2.encodedSizeWithTag(3, badge.external_version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Badge badge = (Badge) obj;
        badge.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = badge.external_token;
        String str2 = badge.customer_token;
        Long l = badge.external_version;
        Long l2 = badge.updated_at;
        Long l3 = badge.created_at;
        Boolean bool = badge.is_badged;
        ItemType itemType = badge.item_type;
        List list = badge.count_groups;
        list.getClass();
        byteString.getClass();
        return new Badge(str, str2, l, l2, l3, bool, itemType, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Badge badge = (Badge) obj;
        badge.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, badge.external_token);
        protoAdapter.encodeWithTag(protoWriter, 2, badge.customer_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, badge.external_version);
        protoAdapter2.encodeWithTag(protoWriter, 4, badge.updated_at);
        protoAdapter2.encodeWithTag(protoWriter, 5, badge.created_at);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, badge.is_badged);
        ItemType.ADAPTER.encodeWithTag(protoWriter, 7, badge.item_type);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 8, badge.count_groups);
        protoWriter.writeBytes(badge.unknownFields());
    }
}
