package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.InvestPaymentRenderData;
import com.squareup.protos.franklin.investing.resources.OrderType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvestPaymentRenderData$RecipientData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
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
        InvestPaymentRenderData.RecipientData.Status status = null;
        String str8 = null;
        OrderType orderType = null;
        Object obj = null;
        Object obj2 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestPaymentRenderData.RecipientData(str4, str5, str6, str7, status, str8, orderType, (Money) obj, (Money) obj2, str9, str10, str11, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    try {
                        status = InvestPaymentRenderData.RecipientData.Status.ADAPTER.decode(protoReader);
                        str5 = str;
                        str6 = str2;
                        str7 = str3;
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 7:
                    try {
                        orderType = OrderType.ADAPTER.decode(protoReader);
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 8:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    decode = str4;
                    break;
                case 9:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    decode = str4;
                    break;
                case 10:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 11:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 12:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
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
            }
            str4 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestPaymentRenderData.RecipientData recipientData = (InvestPaymentRenderData.RecipientData) obj;
        reverseProtoWriter.getClass();
        recipientData.getClass();
        reverseProtoWriter.writeBytes(recipientData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, recipientData.owner_customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, recipientData.cancel_deep_link);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, recipientData.crypto_order_token);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, recipientData.fees);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, recipientData.share_price);
        OrderType.ADAPTER.encodeWithTag(reverseProtoWriter, 7, recipientData.order_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, recipientData.view_equity_link);
        InvestPaymentRenderData.RecipientData.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 5, recipientData.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, recipientData.trade_confirmation_file_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, recipientData.localized_market_hours);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, recipientData.action_deep_link);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, recipientData.shares);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestPaymentRenderData.RecipientData recipientData = (InvestPaymentRenderData.RecipientData) obj;
        recipientData.getClass();
        int size$okio = recipientData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = OrderType.ADAPTER.encodedSizeWithTag(7, recipientData.order_type) + protoAdapter.encodedSizeWithTag(6, recipientData.view_equity_link) + InvestPaymentRenderData.RecipientData.Status.ADAPTER.encodedSizeWithTag(5, recipientData.status) + protoAdapter.encodedSizeWithTag(4, recipientData.trade_confirmation_file_key) + protoAdapter.encodedSizeWithTag(3, recipientData.localized_market_hours) + protoAdapter.encodedSizeWithTag(2, recipientData.action_deep_link) + protoAdapter.encodedSizeWithTag(1, recipientData.shares) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(12, recipientData.owner_customer_token) + protoAdapter.encodedSizeWithTag(11, recipientData.cancel_deep_link) + protoAdapter.encodedSizeWithTag(10, recipientData.crypto_order_token) + protoAdapter2.encodedSizeWithTag(9, recipientData.fees) + protoAdapter2.encodedSizeWithTag(8, recipientData.share_price) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestPaymentRenderData.RecipientData recipientData = (InvestPaymentRenderData.RecipientData) obj;
        recipientData.getClass();
        Money money = recipientData.share_price;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = recipientData.fees;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = recipientData.shares;
        String str2 = recipientData.action_deep_link;
        String str3 = recipientData.localized_market_hours;
        String str4 = recipientData.trade_confirmation_file_key;
        InvestPaymentRenderData.RecipientData.Status status = recipientData.status;
        String str5 = recipientData.view_equity_link;
        OrderType orderType = recipientData.order_type;
        String str6 = recipientData.crypto_order_token;
        String str7 = recipientData.cancel_deep_link;
        String str8 = recipientData.owner_customer_token;
        byteString.getClass();
        return new InvestPaymentRenderData.RecipientData(str, str2, str3, str4, status, str5, orderType, money2, money4, str6, str7, str8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestPaymentRenderData.RecipientData recipientData = (InvestPaymentRenderData.RecipientData) obj;
        recipientData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, recipientData.shares);
        protoAdapter.encodeWithTag(protoWriter, 2, recipientData.action_deep_link);
        protoAdapter.encodeWithTag(protoWriter, 3, recipientData.localized_market_hours);
        protoAdapter.encodeWithTag(protoWriter, 4, recipientData.trade_confirmation_file_key);
        InvestPaymentRenderData.RecipientData.Status.ADAPTER.encodeWithTag(protoWriter, 5, recipientData.status);
        protoAdapter.encodeWithTag(protoWriter, 6, recipientData.view_equity_link);
        OrderType.ADAPTER.encodeWithTag(protoWriter, 7, recipientData.order_type);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 8, recipientData.share_price);
        protoAdapter2.encodeWithTag(protoWriter, 9, recipientData.fees);
        protoAdapter.encodeWithTag(protoWriter, 10, recipientData.crypto_order_token);
        protoAdapter.encodeWithTag(protoWriter, 11, recipientData.cancel_deep_link);
        protoAdapter.encodeWithTag(protoWriter, 12, recipientData.owner_customer_token);
        protoWriter.writeBytes(recipientData.unknownFields());
    }
}
