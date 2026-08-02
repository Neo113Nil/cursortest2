package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCashActivity$Row$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalCashActivity.Row((LocalImage) obj4, (String) obj5, (String) obj6, (Long) obj7, (Long) obj8, (LocalText) obj9, (LocalColor) obj10, (String) obj11, (String) obj12, (String) obj13, (LocalCashActivity.Row.Source) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj4);
                    continue;
                case 2:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 5:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalText.ADAPTER, protoReader, obj9);
                    continue;
                case 6:
                    obj10 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj10);
                    continue;
                case 7:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 8:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 9:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 10:
                    obj13 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 11:
                    try {
                        obj14 = LocalCashActivity.Row.Source.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj5;
                        obj2 = obj6;
                        obj3 = obj7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj5;
                    obj2 = obj6;
                    obj3 = obj7;
                    break;
            }
            obj5 = obj;
            obj6 = obj2;
            obj7 = obj3;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCashActivity.Row row = (LocalCashActivity.Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        LocalCashActivity.Row.Source.ADAPTER.encodeWithTag(reverseProtoWriter, 11, row.source);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, row.location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, row.brand_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, row.client_route);
        LocalColor.ADAPTER.encodeWithTag(reverseProtoWriter, 6, row.background_color);
        LocalText.ADAPTER.encodeWithTag(reverseProtoWriter, 5, row.value);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, row.expires_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, row.transacted_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, row.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, row.label);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, row.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCashActivity.Row row = (LocalCashActivity.Row) obj;
        row.getClass();
        int encodedSizeWithTag = LocalImage.ADAPTER.encodedSizeWithTag(1, row.image) + row.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, row.description) + protoAdapter.encodedSizeWithTag(2, row.label) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return LocalCashActivity.Row.Source.ADAPTER.encodedSizeWithTag(11, row.source) + protoAdapter.encodedSizeWithTag(10, row.location_token) + protoAdapter.encodedSizeWithTag(9, row.brand_token) + protoAdapter.encodedSizeWithTag(7, row.client_route) + LocalColor.ADAPTER.encodedSizeWithTag(6, row.background_color) + LocalText.ADAPTER.encodedSizeWithTag(5, row.value) + protoAdapter2.encodedSizeWithTag(8, row.expires_at) + protoAdapter2.encodedSizeWithTag(4, row.transacted_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCashActivity.Row row = (LocalCashActivity.Row) obj;
        row.getClass();
        LocalImage localImage = row.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalText localText = row.value;
        LocalText localText2 = localText != null ? (LocalText) LocalText.ADAPTER.redact(localText) : null;
        LocalColor localColor = row.background_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = row.label;
        String str2 = row.description;
        Long l = row.transacted_at;
        Long l2 = row.expires_at;
        String str3 = row.client_route;
        String str4 = row.brand_token;
        String str5 = row.location_token;
        LocalCashActivity.Row.Source source = row.source;
        byteString.getClass();
        return new LocalCashActivity.Row(localImage2, str, str2, l, l2, localText2, localColor2, str3, str4, str5, source, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCashActivity.Row row = (LocalCashActivity.Row) obj;
        row.getClass();
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 1, row.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, row.label);
        protoAdapter.encodeWithTag(protoWriter, 3, row.description);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 4, row.transacted_at);
        protoAdapter2.encodeWithTag(protoWriter, 8, row.expires_at);
        LocalText.ADAPTER.encodeWithTag(protoWriter, 5, row.value);
        LocalColor.ADAPTER.encodeWithTag(protoWriter, 6, row.background_color);
        protoAdapter.encodeWithTag(protoWriter, 7, row.client_route);
        protoAdapter.encodeWithTag(protoWriter, 9, row.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 10, row.location_token);
        LocalCashActivity.Row.Source.ADAPTER.encodeWithTag(protoWriter, 11, row.source);
        protoWriter.writeBytes(row.unknownFields());
    }
}
