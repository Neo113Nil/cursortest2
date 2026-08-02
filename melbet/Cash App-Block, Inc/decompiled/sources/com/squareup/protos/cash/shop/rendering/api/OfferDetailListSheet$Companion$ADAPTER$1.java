package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OfferDetailListSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        OfferType offerType = null;
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
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OfferDetailListSheet(offerType, str, str2, str4, str6, (Avatar) obj8, (LocalizedString) obj9, (FormattedDetail) obj10, m, (Button) obj11, (Button) obj12, (Button) obj13, (Button) obj4, (TapAction) obj5, (LocalizedString) obj6, l, str3, (StyledText) obj7, str5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        decode = OfferType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj4;
                        obj2 = obj5;
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    decode = offerType;
                    break;
                case 3:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = offerType;
                    break;
                case 4:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = offerType;
                    break;
                case 5:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = offerType;
                    break;
                case 6:
                    obj8 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj8);
                    decode = offerType;
                    break;
                case 7:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = offerType;
                    break;
                case 8:
                    obj10 = TransactorKt.decodeMessageOrMerge(FormattedDetail.ADAPTER, protoReader, obj10);
                    decode = offerType;
                    break;
                case 9:
                    m.add(FormattedDetail.ADAPTER.decode(protoReader));
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    decode = offerType;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
                case 10:
                    obj11 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj11);
                    decode = offerType;
                    break;
                case 11:
                    obj12 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj12);
                    decode = offerType;
                    break;
                case 12:
                    obj5 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj5);
                    decode = offerType;
                    break;
                case 13:
                    obj7 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj7);
                    decode = offerType;
                    break;
                case 14:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = offerType;
                    break;
                case 15:
                    obj13 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj13);
                    decode = offerType;
                    break;
                case 16:
                    obj4 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj4);
                    decode = offerType;
                    break;
                case 17:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = offerType;
                    break;
                case 18:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj9);
                    decode = offerType;
                    break;
                case 19:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    decode = offerType;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
                case 20:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    decode = offerType;
                    break;
            }
            offerType = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OfferDetailListSheet offerDetailListSheet = (OfferDetailListSheet) obj;
        reverseProtoWriter.getClass();
        offerDetailListSheet.getClass();
        reverseProtoWriter.writeBytes(offerDetailListSheet.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, offerDetailListSheet.activation_card_title);
        StyledText.ADAPTER.encodeWithTag(reverseProtoWriter, 13, offerDetailListSheet.terms_link);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, offerDetailListSheet.title);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 14, offerDetailListSheet.expires_at_ms);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 20, offerDetailListSheet.l_terms_link);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 12, offerDetailListSheet.learn_more_action);
        ProtoAdapter protoAdapter3 = Button.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 16, offerDetailListSheet.open_button);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 15, offerDetailListSheet.activate_button);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 11, offerDetailListSheet.order_card_button);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 10, offerDetailListSheet.shop_button);
        ProtoAdapter protoAdapter4 = FormattedDetail.ADAPTER;
        protoAdapter4.asRepeated().encodeWithTag(reverseProtoWriter, 9, offerDetailListSheet.formatted_detail_rows);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 8, offerDetailListSheet.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 18, offerDetailListSheet.l_title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 6, offerDetailListSheet.logo);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, offerDetailListSheet.sup_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, offerDetailListSheet.merchant_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, offerDetailListSheet.boost_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, offerDetailListSheet.offer_token);
        OfferType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, offerDetailListSheet.offer_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OfferDetailListSheet offerDetailListSheet = (OfferDetailListSheet) obj;
        offerDetailListSheet.getClass();
        int encodedSizeWithTag = OfferType.ADAPTER.encodedSizeWithTag(1, offerDetailListSheet.offer_type) + offerDetailListSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = Avatar.ADAPTER.encodedSizeWithTag(6, offerDetailListSheet.logo) + protoAdapter.encodedSizeWithTag(5, offerDetailListSheet.sup_token) + protoAdapter.encodedSizeWithTag(4, offerDetailListSheet.merchant_token) + protoAdapter.encodedSizeWithTag(3, offerDetailListSheet.boost_token) + protoAdapter.encodedSizeWithTag(2, offerDetailListSheet.offer_token) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(18, offerDetailListSheet.l_title) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = FormattedDetail.ADAPTER;
        int encodedSizeWithTag4 = protoAdapter3.asRepeated().encodedSizeWithTag(9, offerDetailListSheet.formatted_detail_rows) + protoAdapter3.encodedSizeWithTag(8, offerDetailListSheet.subtitle) + encodedSizeWithTag3;
        ProtoAdapter protoAdapter4 = Button.ADAPTER;
        return protoAdapter.encodedSizeWithTag(17, offerDetailListSheet.activation_card_title) + StyledText.ADAPTER.encodedSizeWithTag(13, offerDetailListSheet.terms_link) + protoAdapter.encodedSizeWithTag(7, offerDetailListSheet.title) + ProtoAdapter.INT64.encodedSizeWithTag(14, offerDetailListSheet.expires_at_ms) + protoAdapter2.encodedSizeWithTag(20, offerDetailListSheet.l_terms_link) + TapAction.ADAPTER.encodedSizeWithTag(12, offerDetailListSheet.learn_more_action) + protoAdapter4.encodedSizeWithTag(16, offerDetailListSheet.open_button) + protoAdapter4.encodedSizeWithTag(15, offerDetailListSheet.activate_button) + protoAdapter4.encodedSizeWithTag(11, offerDetailListSheet.order_card_button) + protoAdapter4.encodedSizeWithTag(10, offerDetailListSheet.shop_button) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OfferDetailListSheet offerDetailListSheet = (OfferDetailListSheet) obj;
        offerDetailListSheet.getClass();
        Avatar avatar = offerDetailListSheet.logo;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        LocalizedString localizedString = offerDetailListSheet.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        FormattedDetail formattedDetail = offerDetailListSheet.subtitle;
        FormattedDetail formattedDetail2 = formattedDetail != null ? (FormattedDetail) FormattedDetail.ADAPTER.redact(formattedDetail) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(offerDetailListSheet.formatted_detail_rows, FormattedDetail.ADAPTER);
        Button button = offerDetailListSheet.shop_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Button button3 = offerDetailListSheet.order_card_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        Button button5 = offerDetailListSheet.activate_button;
        Button button6 = button5 != null ? (Button) Button.ADAPTER.redact(button5) : null;
        Button button7 = offerDetailListSheet.open_button;
        Button button8 = button7 != null ? (Button) Button.ADAPTER.redact(button7) : null;
        TapAction tapAction = offerDetailListSheet.learn_more_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        LocalizedString localizedString3 = offerDetailListSheet.l_terms_link;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        StyledText styledText = offerDetailListSheet.terms_link;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        ByteString byteString = ByteString.EMPTY;
        OfferType offerType = offerDetailListSheet.offer_type;
        String str = offerDetailListSheet.offer_token;
        String str2 = offerDetailListSheet.boost_token;
        String str3 = offerDetailListSheet.merchant_token;
        String str4 = offerDetailListSheet.sup_token;
        Long l = offerDetailListSheet.expires_at_ms;
        String str5 = offerDetailListSheet.title;
        String str6 = offerDetailListSheet.activation_card_title;
        byteString.getClass();
        return new OfferDetailListSheet(offerType, str, str2, str3, str4, avatar2, localizedString2, formattedDetail2, m1169redactElements, button2, button4, button6, button8, tapAction2, localizedString4, l, str5, styledText2, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OfferDetailListSheet offerDetailListSheet = (OfferDetailListSheet) obj;
        offerDetailListSheet.getClass();
        OfferType.ADAPTER.encodeWithTag(protoWriter, 1, offerDetailListSheet.offer_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, offerDetailListSheet.offer_token);
        protoAdapter.encodeWithTag(protoWriter, 3, offerDetailListSheet.boost_token);
        protoAdapter.encodeWithTag(protoWriter, 4, offerDetailListSheet.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 5, offerDetailListSheet.sup_token);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 6, offerDetailListSheet.logo);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 18, offerDetailListSheet.l_title);
        ProtoAdapter protoAdapter3 = FormattedDetail.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 8, offerDetailListSheet.subtitle);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 9, offerDetailListSheet.formatted_detail_rows);
        ProtoAdapter protoAdapter4 = Button.ADAPTER;
        protoAdapter4.encodeWithTag(protoWriter, 10, offerDetailListSheet.shop_button);
        protoAdapter4.encodeWithTag(protoWriter, 11, offerDetailListSheet.order_card_button);
        protoAdapter4.encodeWithTag(protoWriter, 15, offerDetailListSheet.activate_button);
        protoAdapter4.encodeWithTag(protoWriter, 16, offerDetailListSheet.open_button);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 12, offerDetailListSheet.learn_more_action);
        protoAdapter2.encodeWithTag(protoWriter, 20, offerDetailListSheet.l_terms_link);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, offerDetailListSheet.expires_at_ms);
        protoAdapter.encodeWithTag(protoWriter, 7, offerDetailListSheet.title);
        StyledText.ADAPTER.encodeWithTag(protoWriter, 13, offerDetailListSheet.terms_link);
        protoAdapter.encodeWithTag(protoWriter, 17, offerDetailListSheet.activation_card_title);
        protoWriter.writeBytes(offerDetailListSheet.unknownFields());
    }
}
