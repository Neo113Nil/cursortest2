package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashAppCard$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        String str2;
        String str3;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str8 = null;
        String str9 = null;
        CashAppCard.CardType cardType = null;
        CashAppCard.PhysicalCardOrderState physicalCardOrderState = null;
        Boolean bool3 = null;
        String str10 = null;
        CashAppCard.ExternalIssuingAccountState externalIssuingAccountState = null;
        Boolean bool4 = null;
        CashAppCard.PaymentMethod paymentMethod = null;
        String str11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppCard(str4, str5, str6, str7, bool, bool2, str8, str9, cardType, physicalCardOrderState, bool3, str10, externalIssuingAccountState, bool4, paymentMethod, str11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 3:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 4:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 5:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str4;
                    break;
                case 6:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str4;
                    break;
                case 7:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 8:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 9:
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    try {
                        cardType = CashAppCard.CardType.ADAPTER.decode(protoReader);
                        str5 = str;
                        str6 = str2;
                        str7 = str3;
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 10:
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    try {
                        physicalCardOrderState = CashAppCard.PhysicalCardOrderState.ADAPTER.decode(protoReader);
                        str5 = str;
                        str6 = str2;
                        str7 = str3;
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 11:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str4;
                    break;
                case 12:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 13:
                case 14:
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    decode = str4;
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    break;
                case 15:
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    try {
                        externalIssuingAccountState = CashAppCard.ExternalIssuingAccountState.ADAPTER.decode(protoReader);
                        str5 = str;
                        str6 = str2;
                        str7 = str3;
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 16:
                    bool4 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str4;
                    break;
                case 17:
                    try {
                        paymentMethod = CashAppCard.PaymentMethod.ADAPTER.decode(protoReader);
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 18:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
            }
            str4 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppCard cashAppCard = (CashAppCard) obj;
        reverseProtoWriter.getClass();
        cashAppCard.getClass();
        reverseProtoWriter.writeBytes(cashAppCard.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, cashAppCard.customization_image_path);
        CashAppCard.PaymentMethod.ADAPTER.encodeWithTag(reverseProtoWriter, 17, cashAppCard.payment_method);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 16, cashAppCard.isCardExpired);
        CashAppCard.ExternalIssuingAccountState.ADAPTER.encodeWithTag(reverseProtoWriter, 15, cashAppCard.externalIssuingAccountState);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, cashAppCard.card_theme_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, cashAppCard.activated);
        CashAppCard.PhysicalCardOrderState.ADAPTER.encodeWithTag(reverseProtoWriter, 10, cashAppCard.physical_card_order_state);
        CashAppCard.CardType.ADAPTER.encodeWithTag(reverseProtoWriter, 9, cashAppCard.card_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, cashAppCard.apple_pay_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, cashAppCard.apple_pay_identifier);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, cashAppCard.sponsor_locked);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, cashAppCard.enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cashAppCard.cardholder_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cashAppCard.last_four);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashAppCard.version_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppCard.card_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppCard cashAppCard = (CashAppCard) obj;
        cashAppCard.getClass();
        int size$okio = cashAppCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, cashAppCard.cardholder_name) + protoAdapter.encodedSizeWithTag(3, cashAppCard.last_four) + protoAdapter.encodedSizeWithTag(2, cashAppCard.version_token) + protoAdapter.encodedSizeWithTag(1, cashAppCard.card_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(18, cashAppCard.customization_image_path) + CashAppCard.PaymentMethod.ADAPTER.encodedSizeWithTag(17, cashAppCard.payment_method) + protoAdapter2.encodedSizeWithTag(16, cashAppCard.isCardExpired) + CashAppCard.ExternalIssuingAccountState.ADAPTER.encodedSizeWithTag(15, cashAppCard.externalIssuingAccountState) + protoAdapter.encodedSizeWithTag(12, cashAppCard.card_theme_token) + protoAdapter2.encodedSizeWithTag(11, cashAppCard.activated) + CashAppCard.PhysicalCardOrderState.ADAPTER.encodedSizeWithTag(10, cashAppCard.physical_card_order_state) + CashAppCard.CardType.ADAPTER.encodedSizeWithTag(9, cashAppCard.card_type) + protoAdapter.encodedSizeWithTag(8, cashAppCard.apple_pay_description) + protoAdapter.encodedSizeWithTag(7, cashAppCard.apple_pay_identifier) + protoAdapter2.encodedSizeWithTag(6, cashAppCard.sponsor_locked) + protoAdapter2.encodedSizeWithTag(5, cashAppCard.enabled) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppCard cashAppCard = (CashAppCard) obj;
        cashAppCard.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppCard.card_token;
        String str2 = cashAppCard.version_token;
        Boolean bool = cashAppCard.enabled;
        Boolean bool2 = cashAppCard.sponsor_locked;
        String str3 = cashAppCard.apple_pay_identifier;
        String str4 = cashAppCard.apple_pay_description;
        CashAppCard.CardType cardType = cashAppCard.card_type;
        CashAppCard.PhysicalCardOrderState physicalCardOrderState = cashAppCard.physical_card_order_state;
        Boolean bool3 = cashAppCard.activated;
        String str5 = cashAppCard.card_theme_token;
        CashAppCard.ExternalIssuingAccountState externalIssuingAccountState = cashAppCard.externalIssuingAccountState;
        Boolean bool4 = cashAppCard.isCardExpired;
        CashAppCard.PaymentMethod paymentMethod = cashAppCard.payment_method;
        String str6 = cashAppCard.customization_image_path;
        byteString.getClass();
        return new CashAppCard(str, str2, null, null, bool, bool2, str3, str4, cardType, physicalCardOrderState, bool3, str5, externalIssuingAccountState, bool4, paymentMethod, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppCard cashAppCard = (CashAppCard) obj;
        cashAppCard.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppCard.card_token);
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppCard.version_token);
        protoAdapter.encodeWithTag(protoWriter, 3, cashAppCard.last_four);
        protoAdapter.encodeWithTag(protoWriter, 4, cashAppCard.cardholder_name);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, cashAppCard.enabled);
        protoAdapter2.encodeWithTag(protoWriter, 6, cashAppCard.sponsor_locked);
        protoAdapter.encodeWithTag(protoWriter, 7, cashAppCard.apple_pay_identifier);
        protoAdapter.encodeWithTag(protoWriter, 8, cashAppCard.apple_pay_description);
        CashAppCard.CardType.ADAPTER.encodeWithTag(protoWriter, 9, cashAppCard.card_type);
        CashAppCard.PhysicalCardOrderState.ADAPTER.encodeWithTag(protoWriter, 10, cashAppCard.physical_card_order_state);
        protoAdapter2.encodeWithTag(protoWriter, 11, cashAppCard.activated);
        protoAdapter.encodeWithTag(protoWriter, 12, cashAppCard.card_theme_token);
        CashAppCard.ExternalIssuingAccountState.ADAPTER.encodeWithTag(protoWriter, 15, cashAppCard.externalIssuingAccountState);
        protoAdapter2.encodeWithTag(protoWriter, 16, cashAppCard.isCardExpired);
        CashAppCard.PaymentMethod.ADAPTER.encodeWithTag(protoWriter, 17, cashAppCard.payment_method);
        protoAdapter.encodeWithTag(protoWriter, 18, cashAppCard.customization_image_path);
        protoWriter.writeBytes(cashAppCard.unknownFields());
    }
}
