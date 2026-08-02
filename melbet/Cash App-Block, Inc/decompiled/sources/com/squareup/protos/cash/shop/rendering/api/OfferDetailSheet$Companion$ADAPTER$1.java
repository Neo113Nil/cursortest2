package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OfferDetailSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        String str;
        Object obj2;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        OfferType offerType = null;
        Object obj3 = null;
        String str2 = null;
        Object obj4 = null;
        Object obj5 = null;
        String str3 = null;
        String str4 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        String str5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OfferDetailSheet(offerType, str5, str2, (TapAction) obj4, (Avatar) obj5, str3, str4, (Button) obj6, (Button) obj7, (CountdownCaption) obj8, (Button) obj9, (SheetStyledDetails) obj10, (FormattedDetail) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 2:
                    try {
                        decode = OfferType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        str = str2;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = offerType;
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj4);
                    decode = offerType;
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj5);
                    decode = offerType;
                    break;
                case 6:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = offerType;
                    break;
                case 7:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = offerType;
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj6);
                    decode = offerType;
                    break;
                case 9:
                    obj7 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj7);
                    decode = offerType;
                    break;
                case 10:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = offerType;
                    break;
                case 11:
                    obj8 = TransactorKt.decodeMessageOrMerge(CountdownCaption.ADAPTER, protoReader, obj8);
                    decode = offerType;
                    break;
                case 12:
                    obj9 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj9);
                    decode = offerType;
                    break;
                case 13:
                    obj10 = TransactorKt.decodeMessageOrMerge(SheetStyledDetails.ADAPTER, protoReader, obj10);
                    decode = offerType;
                    break;
                case 14:
                    obj3 = TransactorKt.decodeMessageOrMerge(FormattedDetail.ADAPTER, protoReader, obj3);
                    decode = offerType;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    str = str2;
                    obj2 = obj4;
                    decode = offerType;
                    obj3 = obj;
                    str2 = str;
                    obj4 = obj2;
                    break;
            }
            offerType = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OfferDetailSheet offerDetailSheet = (OfferDetailSheet) obj;
        reverseProtoWriter.getClass();
        offerDetailSheet.getClass();
        reverseProtoWriter.writeBytes(offerDetailSheet.unknownFields());
        FormattedDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 14, offerDetailSheet.formatted_subtitle);
        SheetStyledDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 13, offerDetailSheet.merchant_sale_details);
        ProtoAdapter protoAdapter = Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, offerDetailSheet.order_card_button);
        CountdownCaption.ADAPTER.encodeWithTag(reverseProtoWriter, 11, offerDetailSheet.countdown_caption);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, offerDetailSheet.shop_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, offerDetailSheet.sharing_button);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, offerDetailSheet.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, offerDetailSheet.title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 5, offerDetailSheet.business_logo);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, offerDetailSheet.learn_more_action);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, offerDetailSheet.boost_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, offerDetailSheet.offer_token);
        OfferType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, offerDetailSheet.offer_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OfferDetailSheet offerDetailSheet = (OfferDetailSheet) obj;
        offerDetailSheet.getClass();
        int encodedSizeWithTag = OfferType.ADAPTER.encodedSizeWithTag(2, offerDetailSheet.offer_type) + offerDetailSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(7, offerDetailSheet.subtitle) + protoAdapter.encodedSizeWithTag(6, offerDetailSheet.title) + Avatar.ADAPTER.encodedSizeWithTag(5, offerDetailSheet.business_logo) + TapAction.ADAPTER.encodedSizeWithTag(4, offerDetailSheet.learn_more_action) + protoAdapter.encodedSizeWithTag(10, offerDetailSheet.boost_token) + protoAdapter.encodedSizeWithTag(3, offerDetailSheet.offer_token) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        return FormattedDetail.ADAPTER.encodedSizeWithTag(14, offerDetailSheet.formatted_subtitle) + SheetStyledDetails.ADAPTER.encodedSizeWithTag(13, offerDetailSheet.merchant_sale_details) + protoAdapter2.encodedSizeWithTag(12, offerDetailSheet.order_card_button) + CountdownCaption.ADAPTER.encodedSizeWithTag(11, offerDetailSheet.countdown_caption) + protoAdapter2.encodedSizeWithTag(9, offerDetailSheet.shop_button) + protoAdapter2.encodedSizeWithTag(8, offerDetailSheet.sharing_button) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OfferDetailSheet offerDetailSheet = (OfferDetailSheet) obj;
        offerDetailSheet.getClass();
        TapAction tapAction = offerDetailSheet.learn_more_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        Avatar avatar = offerDetailSheet.business_logo;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        Button button = offerDetailSheet.sharing_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Button button3 = offerDetailSheet.shop_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        CountdownCaption countdownCaption = offerDetailSheet.countdown_caption;
        CountdownCaption countdownCaption2 = countdownCaption != null ? (CountdownCaption) CountdownCaption.ADAPTER.redact(countdownCaption) : null;
        Button button5 = offerDetailSheet.order_card_button;
        Button button6 = button5 != null ? (Button) Button.ADAPTER.redact(button5) : null;
        SheetStyledDetails sheetStyledDetails = offerDetailSheet.merchant_sale_details;
        SheetStyledDetails sheetStyledDetails2 = sheetStyledDetails != null ? (SheetStyledDetails) SheetStyledDetails.ADAPTER.redact(sheetStyledDetails) : null;
        FormattedDetail formattedDetail = offerDetailSheet.formatted_subtitle;
        FormattedDetail formattedDetail2 = formattedDetail != null ? (FormattedDetail) FormattedDetail.ADAPTER.redact(formattedDetail) : null;
        ByteString byteString = ByteString.EMPTY;
        OfferType offerType = offerDetailSheet.offer_type;
        String str = offerDetailSheet.offer_token;
        String str2 = offerDetailSheet.boost_token;
        String str3 = offerDetailSheet.title;
        String str4 = offerDetailSheet.subtitle;
        byteString.getClass();
        return new OfferDetailSheet(offerType, str, str2, tapAction2, avatar2, str3, str4, button2, button4, countdownCaption2, button6, sheetStyledDetails2, formattedDetail2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OfferDetailSheet offerDetailSheet = (OfferDetailSheet) obj;
        offerDetailSheet.getClass();
        OfferType.ADAPTER.encodeWithTag(protoWriter, 2, offerDetailSheet.offer_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, offerDetailSheet.offer_token);
        protoAdapter.encodeWithTag(protoWriter, 10, offerDetailSheet.boost_token);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 4, offerDetailSheet.learn_more_action);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 5, offerDetailSheet.business_logo);
        protoAdapter.encodeWithTag(protoWriter, 6, offerDetailSheet.title);
        protoAdapter.encodeWithTag(protoWriter, 7, offerDetailSheet.subtitle);
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 8, offerDetailSheet.sharing_button);
        protoAdapter2.encodeWithTag(protoWriter, 9, offerDetailSheet.shop_button);
        CountdownCaption.ADAPTER.encodeWithTag(protoWriter, 11, offerDetailSheet.countdown_caption);
        protoAdapter2.encodeWithTag(protoWriter, 12, offerDetailSheet.order_card_button);
        SheetStyledDetails.ADAPTER.encodeWithTag(protoWriter, 13, offerDetailSheet.merchant_sale_details);
        FormattedDetail.ADAPTER.encodeWithTag(protoWriter, 14, offerDetailSheet.formatted_subtitle);
        protoWriter.writeBytes(offerDetailSheet.unknownFields());
    }
}
