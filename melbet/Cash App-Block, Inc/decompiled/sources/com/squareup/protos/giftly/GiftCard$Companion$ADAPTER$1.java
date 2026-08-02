package com.squareup.protos.giftly;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GiftCard$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj12 = obj8;
            if (nextTag == -1) {
                return new GiftCard(str, str4, str7, (LocalizableString) obj5, str9, (LocalizableString) obj7, (Color) obj12, (Image) obj9, m, arrayList, str10, (LocalizableString) obj11, str2, (LocalizableString) obj, str3, (LocalizableString) obj3, str5, str6, (LocalizableString) obj4, str8, (LocalizableString) obj6, (Image) obj10, arrayList2, str11, (LocalizableString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj8 = obj12;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj8 = obj12;
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 3:
                    obj8 = obj12;
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 4:
                    obj8 = obj12;
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 5:
                    obj8 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj12);
                    decode = str;
                    break;
                case 6:
                    obj9 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj9);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 7:
                    m.add(GiftCardDetails.ADAPTER.decode(protoReader));
                    decode = str;
                    obj8 = obj12;
                    break;
                case 8:
                    arrayList.add(GiftCard.GiftCardSender.ADAPTER.decode(protoReader));
                    decode = str;
                    obj8 = obj12;
                    break;
                case 9:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 10:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 11:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 12:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 13:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 14:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 15:
                    obj10 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj10);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 16:
                    arrayList2.add(GiftCard.Options.ADAPTER.decode(protoReader));
                    decode = str;
                    obj8 = obj12;
                    break;
                case 17:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 18:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 19:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj7);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 20:
                    obj11 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj11);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 21:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 22:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 23:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 24:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    obj8 = obj12;
                    decode = str;
                    break;
                case 25:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
                    decode = str;
                    obj8 = obj12;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    decode = str;
                    obj8 = obj12;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GiftCard giftCard = (GiftCard) obj;
        reverseProtoWriter.getClass();
        giftCard.getClass();
        reverseProtoWriter.writeBytes(giftCard.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 25, giftCard.localizable_preview_title);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 17, giftCard.preview_title);
        GiftCard.Options.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 16, giftCard.options);
        ProtoAdapter protoAdapter3 = Image.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 15, giftCard.card);
        protoAdapter.encodeWithTag(reverseProtoWriter, 24, giftCard.localizable_current_status_description_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, giftCard.current_status_description_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 23, giftCard.localizable_gift_card_type_description);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, giftCard.gift_card_type_description);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, giftCard.stored_value_balance_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 22, giftCard.localizable_current_amount_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, giftCard.current_amount_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 21, giftCard.localizable_original_amount_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, giftCard.original_amount_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, giftCard.localizable_activation_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, giftCard.activation_text);
        GiftCard.GiftCardSender.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, giftCard.senders);
        GiftCardDetails.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, giftCard.details);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, giftCard.logo);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 5, giftCard.themed_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, giftCard.localizable_subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, giftCard.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, giftCard.localizable_title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, giftCard.title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, giftCard.status);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, giftCard.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GiftCard giftCard = (GiftCard) obj;
        giftCard.getClass();
        int size$okio = giftCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, giftCard.title) + protoAdapter.encodedSizeWithTag(2, giftCard.status) + protoAdapter.encodedSizeWithTag(1, giftCard.token) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        int encodedSizeWithTag2 = Color.ADAPTER.encodedSizeWithTag(5, giftCard.themed_color) + protoAdapter2.encodedSizeWithTag(19, giftCard.localizable_subtitle) + protoAdapter.encodedSizeWithTag(4, giftCard.subtitle) + protoAdapter2.encodedSizeWithTag(18, giftCard.localizable_title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = Image.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(25, giftCard.localizable_preview_title) + protoAdapter.encodedSizeWithTag(17, giftCard.preview_title) + GiftCard.Options.ADAPTER.asRepeated().encodedSizeWithTag(16, giftCard.options) + protoAdapter3.encodedSizeWithTag(15, giftCard.card) + protoAdapter2.encodedSizeWithTag(24, giftCard.localizable_current_status_description_text) + protoAdapter.encodedSizeWithTag(14, giftCard.current_status_description_text) + protoAdapter2.encodedSizeWithTag(23, giftCard.localizable_gift_card_type_description) + protoAdapter.encodedSizeWithTag(13, giftCard.gift_card_type_description) + protoAdapter.encodedSizeWithTag(12, giftCard.stored_value_balance_token) + protoAdapter2.encodedSizeWithTag(22, giftCard.localizable_current_amount_text) + protoAdapter.encodedSizeWithTag(11, giftCard.current_amount_text) + protoAdapter2.encodedSizeWithTag(21, giftCard.localizable_original_amount_text) + protoAdapter.encodedSizeWithTag(10, giftCard.original_amount_text) + protoAdapter2.encodedSizeWithTag(20, giftCard.localizable_activation_text) + protoAdapter.encodedSizeWithTag(9, giftCard.activation_text) + GiftCard.GiftCardSender.ADAPTER.asRepeated().encodedSizeWithTag(8, giftCard.senders) + GiftCardDetails.ADAPTER.asRepeated().encodedSizeWithTag(7, giftCard.details) + protoAdapter3.encodedSizeWithTag(6, giftCard.logo) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCard giftCard = (GiftCard) obj;
        giftCard.getClass();
        LocalizableString localizableString = giftCard.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = giftCard.localizable_subtitle;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        Color color = giftCard.themed_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Image image = giftCard.logo;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(giftCard.details, GiftCardDetails.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(giftCard.senders, GiftCard.GiftCardSender.ADAPTER);
        LocalizableString localizableString5 = giftCard.localizable_activation_text;
        LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
        LocalizableString localizableString7 = giftCard.localizable_original_amount_text;
        LocalizableString localizableString8 = localizableString7 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString7) : null;
        LocalizableString localizableString9 = giftCard.localizable_current_amount_text;
        LocalizableString localizableString10 = localizableString9 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString9) : null;
        LocalizableString localizableString11 = giftCard.localizable_gift_card_type_description;
        LocalizableString localizableString12 = localizableString11 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString11) : null;
        LocalizableString localizableString13 = giftCard.localizable_current_status_description_text;
        LocalizableString localizableString14 = localizableString13 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString13) : null;
        Image image3 = giftCard.card;
        Image image4 = image3 != null ? (Image) Image.ADAPTER.redact(image3) : null;
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(giftCard.options, GiftCard.Options.ADAPTER);
        LocalizableString localizableString15 = giftCard.localizable_preview_title;
        LocalizableString localizableString16 = localizableString15 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString15) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = giftCard.token;
        String str2 = giftCard.status;
        String str3 = giftCard.title;
        String str4 = giftCard.subtitle;
        String str5 = giftCard.activation_text;
        String str6 = giftCard.original_amount_text;
        String str7 = giftCard.current_amount_text;
        String str8 = giftCard.stored_value_balance_token;
        String str9 = giftCard.gift_card_type_description;
        String str10 = giftCard.current_status_description_text;
        String str11 = giftCard.preview_title;
        byteString.getClass();
        return new GiftCard(str, str2, str3, localizableString2, str4, localizableString4, color2, image2, m1169redactElements, m1169redactElements2, str5, localizableString6, str6, localizableString8, str7, localizableString10, str8, str9, localizableString12, str10, localizableString14, image4, m1169redactElements3, str11, localizableString16, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCard giftCard = (GiftCard) obj;
        giftCard.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, giftCard.token);
        protoAdapter.encodeWithTag(protoWriter, 2, giftCard.status);
        protoAdapter.encodeWithTag(protoWriter, 3, giftCard.title);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 18, giftCard.localizable_title);
        protoAdapter.encodeWithTag(protoWriter, 4, giftCard.subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 19, giftCard.localizable_subtitle);
        Color.ADAPTER.encodeWithTag(protoWriter, 5, giftCard.themed_color);
        ProtoAdapter protoAdapter3 = Image.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 6, giftCard.logo);
        GiftCardDetails.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, giftCard.details);
        GiftCard.GiftCardSender.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, giftCard.senders);
        protoAdapter.encodeWithTag(protoWriter, 9, giftCard.activation_text);
        protoAdapter2.encodeWithTag(protoWriter, 20, giftCard.localizable_activation_text);
        protoAdapter.encodeWithTag(protoWriter, 10, giftCard.original_amount_text);
        protoAdapter2.encodeWithTag(protoWriter, 21, giftCard.localizable_original_amount_text);
        protoAdapter.encodeWithTag(protoWriter, 11, giftCard.current_amount_text);
        protoAdapter2.encodeWithTag(protoWriter, 22, giftCard.localizable_current_amount_text);
        protoAdapter.encodeWithTag(protoWriter, 12, giftCard.stored_value_balance_token);
        protoAdapter.encodeWithTag(protoWriter, 13, giftCard.gift_card_type_description);
        protoAdapter2.encodeWithTag(protoWriter, 23, giftCard.localizable_gift_card_type_description);
        protoAdapter.encodeWithTag(protoWriter, 14, giftCard.current_status_description_text);
        protoAdapter2.encodeWithTag(protoWriter, 24, giftCard.localizable_current_status_description_text);
        protoAdapter3.encodeWithTag(protoWriter, 15, giftCard.card);
        GiftCard.Options.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, giftCard.options);
        protoAdapter.encodeWithTag(protoWriter, 17, giftCard.preview_title);
        protoAdapter2.encodeWithTag(protoWriter, 25, giftCard.localizable_preview_title);
        protoWriter.writeBytes(giftCard.unknownFields());
    }
}
