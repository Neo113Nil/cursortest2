package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.CardScheme;
import com.squareup.protos.franklin.common.CashDrawerData;
import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.protos.franklin.common.RoundUpsData;
import com.squareup.protos.franklin.ui.UiIssuedCard;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiIssuedCard$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiIssuedCard((IssuedCard) obj, (CashDrawerData) obj2, (UiIssuedCard.Mode) obj3, (CardScheme) obj4, (RoundUpsData) obj5, (InitialBlockerData) obj6, (CardOrderData) obj7, (CustomerData) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(IssuedCard.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(CashDrawerData.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    try {
                        obj3 = UiIssuedCard.Mode.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(CardScheme.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(RoundUpsData.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(InitialBlockerData.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(CardOrderData.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(CustomerData.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiIssuedCard uiIssuedCard = (UiIssuedCard) obj;
        reverseProtoWriter.getClass();
        uiIssuedCard.getClass();
        reverseProtoWriter.writeBytes(uiIssuedCard.unknownFields());
        CustomerData.ADAPTER.encodeWithTag(reverseProtoWriter, 8, uiIssuedCard.customer_data);
        CardOrderData.ADAPTER.encodeWithTag(reverseProtoWriter, 7, uiIssuedCard.card_order_data);
        InitialBlockerData.ADAPTER.encodeWithTag(reverseProtoWriter, 6, uiIssuedCard.initial_blocker_data);
        RoundUpsData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, uiIssuedCard.round_ups_data);
        CardScheme.ADAPTER.encodeWithTag(reverseProtoWriter, 4, uiIssuedCard.card_scheme);
        UiIssuedCard.Mode.ADAPTER.encodeWithTag(reverseProtoWriter, 3, uiIssuedCard.mode);
        CashDrawerData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, uiIssuedCard.cash_drawer_data);
        IssuedCard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiIssuedCard.issued_card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiIssuedCard uiIssuedCard = (UiIssuedCard) obj;
        uiIssuedCard.getClass();
        return CustomerData.ADAPTER.encodedSizeWithTag(8, uiIssuedCard.customer_data) + CardOrderData.ADAPTER.encodedSizeWithTag(7, uiIssuedCard.card_order_data) + InitialBlockerData.ADAPTER.encodedSizeWithTag(6, uiIssuedCard.initial_blocker_data) + RoundUpsData.ADAPTER.encodedSizeWithTag(5, uiIssuedCard.round_ups_data) + CardScheme.ADAPTER.encodedSizeWithTag(4, uiIssuedCard.card_scheme) + UiIssuedCard.Mode.ADAPTER.encodedSizeWithTag(3, uiIssuedCard.mode) + CashDrawerData.ADAPTER.encodedSizeWithTag(2, uiIssuedCard.cash_drawer_data) + IssuedCard.ADAPTER.encodedSizeWithTag(1, uiIssuedCard.issued_card) + uiIssuedCard.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiIssuedCard uiIssuedCard = (UiIssuedCard) obj;
        uiIssuedCard.getClass();
        IssuedCard issuedCard = uiIssuedCard.issued_card;
        IssuedCard issuedCard2 = issuedCard != null ? (IssuedCard) IssuedCard.ADAPTER.redact(issuedCard) : null;
        CashDrawerData cashDrawerData = uiIssuedCard.cash_drawer_data;
        CashDrawerData cashDrawerData2 = cashDrawerData != null ? (CashDrawerData) CashDrawerData.ADAPTER.redact(cashDrawerData) : null;
        CardScheme cardScheme = uiIssuedCard.card_scheme;
        CardScheme cardScheme2 = cardScheme != null ? (CardScheme) CardScheme.ADAPTER.redact(cardScheme) : null;
        RoundUpsData roundUpsData = uiIssuedCard.round_ups_data;
        RoundUpsData roundUpsData2 = roundUpsData != null ? (RoundUpsData) RoundUpsData.ADAPTER.redact(roundUpsData) : null;
        InitialBlockerData initialBlockerData = uiIssuedCard.initial_blocker_data;
        InitialBlockerData initialBlockerData2 = initialBlockerData != null ? (InitialBlockerData) InitialBlockerData.ADAPTER.redact(initialBlockerData) : null;
        CardOrderData cardOrderData = uiIssuedCard.card_order_data;
        CardOrderData cardOrderData2 = cardOrderData != null ? (CardOrderData) CardOrderData.ADAPTER.redact(cardOrderData) : null;
        CustomerData customerData = uiIssuedCard.customer_data;
        CustomerData customerData2 = customerData != null ? (CustomerData) CustomerData.ADAPTER.redact(customerData) : null;
        ByteString byteString = ByteString.EMPTY;
        UiIssuedCard.Mode mode = uiIssuedCard.mode;
        byteString.getClass();
        return new UiIssuedCard(issuedCard2, cashDrawerData2, mode, cardScheme2, roundUpsData2, initialBlockerData2, cardOrderData2, customerData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiIssuedCard uiIssuedCard = (UiIssuedCard) obj;
        uiIssuedCard.getClass();
        IssuedCard.ADAPTER.encodeWithTag(protoWriter, 1, uiIssuedCard.issued_card);
        CashDrawerData.ADAPTER.encodeWithTag(protoWriter, 2, uiIssuedCard.cash_drawer_data);
        UiIssuedCard.Mode.ADAPTER.encodeWithTag(protoWriter, 3, uiIssuedCard.mode);
        CardScheme.ADAPTER.encodeWithTag(protoWriter, 4, uiIssuedCard.card_scheme);
        RoundUpsData.ADAPTER.encodeWithTag(protoWriter, 5, uiIssuedCard.round_ups_data);
        InitialBlockerData.ADAPTER.encodeWithTag(protoWriter, 6, uiIssuedCard.initial_blocker_data);
        CardOrderData.ADAPTER.encodeWithTag(protoWriter, 7, uiIssuedCard.card_order_data);
        CustomerData.ADAPTER.encodeWithTag(protoWriter, 8, uiIssuedCard.customer_data);
        protoWriter.writeBytes(uiIssuedCard.unknownFields());
    }
}
