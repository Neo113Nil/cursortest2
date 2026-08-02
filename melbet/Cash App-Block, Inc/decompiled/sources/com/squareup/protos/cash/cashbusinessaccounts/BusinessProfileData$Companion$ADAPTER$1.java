package com.squareup.protos.cash.cashbusinessaccounts;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BusinessProfileData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BusinessProfileData((String) obj, (String) obj2, (BusinessCategory) obj3, (LocalizedString) obj4, (String) obj5, (Image) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    try {
                        obj3 = BusinessCategory.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BusinessProfileData businessProfileData = (BusinessProfileData) obj;
        reverseProtoWriter.getClass();
        businessProfileData.getClass();
        reverseProtoWriter.writeBytes(businessProfileData.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 6, businessProfileData.instagram_logo);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, businessProfileData.banner_color_name);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, businessProfileData.category_display_text);
        BusinessCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 3, businessProfileData.category);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, businessProfileData.location_display_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, businessProfileData.instagram_handle);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BusinessProfileData businessProfileData = (BusinessProfileData) obj;
        businessProfileData.getClass();
        int size$okio = businessProfileData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Image.ADAPTER.encodedSizeWithTag(6, businessProfileData.instagram_logo) + protoAdapter.encodedSizeWithTag(5, businessProfileData.banner_color_name) + LocalizedString.ADAPTER.encodedSizeWithTag(4, businessProfileData.category_display_text) + BusinessCategory.ADAPTER.encodedSizeWithTag(3, businessProfileData.category) + protoAdapter.encodedSizeWithTag(2, businessProfileData.location_display_text) + protoAdapter.encodedSizeWithTag(1, businessProfileData.instagram_handle) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BusinessProfileData businessProfileData = (BusinessProfileData) obj;
        businessProfileData.getClass();
        Image image = businessProfileData.instagram_logo;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        BusinessCategory businessCategory = businessProfileData.category;
        String str = businessProfileData.banner_color_name;
        byteString.getClass();
        return new BusinessProfileData(null, null, businessCategory, null, str, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BusinessProfileData businessProfileData = (BusinessProfileData) obj;
        businessProfileData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, businessProfileData.instagram_handle);
        protoAdapter.encodeWithTag(protoWriter, 2, businessProfileData.location_display_text);
        BusinessCategory.ADAPTER.encodeWithTag(protoWriter, 3, businessProfileData.category);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 4, businessProfileData.category_display_text);
        protoAdapter.encodeWithTag(protoWriter, 5, businessProfileData.banner_color_name);
        Image.ADAPTER.encodeWithTag(protoWriter, 6, businessProfileData.instagram_logo);
        protoWriter.writeBytes(businessProfileData.unknownFields());
    }
}
