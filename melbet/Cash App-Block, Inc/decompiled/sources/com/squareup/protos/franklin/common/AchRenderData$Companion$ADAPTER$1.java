package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.AchRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AchRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AchRenderData((AchRenderData.Type) obj4, (Money) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, (Image) obj10, (String) obj11, (String) obj12, (Boolean) obj13, (Long) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj4 = AchRenderData.Type.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj4;
                        obj2 = obj5;
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    continue;
                case 3:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 5:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 6:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 7:
                    obj10 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj10);
                    continue;
                case 8:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    break;
                case 9:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 10:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 11:
                    obj13 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 12:
                    obj14 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
            }
            obj4 = obj;
            obj6 = obj3;
            obj5 = obj2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AchRenderData achRenderData = (AchRenderData) obj;
        reverseProtoWriter.getClass();
        achRenderData.getClass();
        reverseProtoWriter.writeBytes(achRenderData.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 12, achRenderData.how_early_days);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 11, achRenderData.is_early_deposit);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, achRenderData.subcategory_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, achRenderData.category_name);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 7, achRenderData.logo_images);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, achRenderData.normalized_destination_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, achRenderData.normalized_source_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, achRenderData.raw_destination_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, achRenderData.raw_source_name);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, achRenderData.amount);
        AchRenderData.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, achRenderData.f1370type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AchRenderData achRenderData = (AchRenderData) obj;
        achRenderData.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(2, achRenderData.amount) + AchRenderData.Type.ADAPTER.encodedSizeWithTag(1, achRenderData.f1370type) + achRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(12, achRenderData.how_early_days) + ProtoAdapter.BOOL.encodedSizeWithTag(11, achRenderData.is_early_deposit) + protoAdapter.encodedSizeWithTag(10, achRenderData.subcategory_name) + protoAdapter.encodedSizeWithTag(9, achRenderData.category_name) + Image.ADAPTER.encodedSizeWithTag(7, achRenderData.logo_images) + protoAdapter.encodedSizeWithTag(6, achRenderData.normalized_destination_name) + protoAdapter.encodedSizeWithTag(5, achRenderData.normalized_source_name) + protoAdapter.encodedSizeWithTag(4, achRenderData.raw_destination_name) + protoAdapter.encodedSizeWithTag(3, achRenderData.raw_source_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AchRenderData achRenderData = (AchRenderData) obj;
        achRenderData.getClass();
        Money money = achRenderData.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Image image = achRenderData.logo_images;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        AchRenderData.Type type2 = achRenderData.f1370type;
        String str = achRenderData.raw_source_name;
        String str2 = achRenderData.raw_destination_name;
        String str3 = achRenderData.normalized_source_name;
        String str4 = achRenderData.normalized_destination_name;
        String str5 = achRenderData.category_name;
        String str6 = achRenderData.subcategory_name;
        Boolean bool = achRenderData.is_early_deposit;
        Long l = achRenderData.how_early_days;
        byteString.getClass();
        return new AchRenderData(type2, money2, str, str2, str3, str4, image2, str5, str6, bool, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AchRenderData achRenderData = (AchRenderData) obj;
        achRenderData.getClass();
        AchRenderData.Type.ADAPTER.encodeWithTag(protoWriter, 1, achRenderData.f1370type);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, achRenderData.amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, achRenderData.raw_source_name);
        protoAdapter.encodeWithTag(protoWriter, 4, achRenderData.raw_destination_name);
        protoAdapter.encodeWithTag(protoWriter, 5, achRenderData.normalized_source_name);
        protoAdapter.encodeWithTag(protoWriter, 6, achRenderData.normalized_destination_name);
        Image.ADAPTER.encodeWithTag(protoWriter, 7, achRenderData.logo_images);
        protoAdapter.encodeWithTag(protoWriter, 9, achRenderData.category_name);
        protoAdapter.encodeWithTag(protoWriter, 10, achRenderData.subcategory_name);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, achRenderData.is_early_deposit);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, achRenderData.how_early_days);
        protoWriter.writeBytes(achRenderData.unknownFields());
    }
}
