package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.PaymentActivity;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentActivity$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        String str;
        String str2;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Object obj = null;
        String str6 = null;
        String str7 = null;
        Object obj2 = null;
        Boolean bool = null;
        String str8 = null;
        PaymentActivity.State state = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentActivity(str3, str4, str5, (Instant) obj, str6, str7, (Money) obj2, bool, str8, state, str9, str10, str11, str12, str13, str14, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = m;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    arrayList = m;
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 3:
                    arrayList = m;
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 4:
                    arrayList = m;
                    obj = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj);
                    decode = str3;
                    break;
                case 5:
                    arrayList = m;
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 6:
                    arrayList = m;
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 7:
                    arrayList = m;
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    decode = str3;
                    break;
                case 8:
                    arrayList = m;
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str3;
                    break;
                case 9:
                    arrayList = m;
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 10:
                    try {
                        state = PaymentActivity.State.ADAPTER.decode(protoReader);
                        arrayList = m;
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        arrayList = m;
                        str = str4;
                        str2 = str5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 11:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str3;
                    break;
                case 12:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str3;
                    break;
                case 13:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str3;
                    break;
                case 14:
                    str12 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str3;
                    break;
                case 15:
                    str13 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str3;
                    break;
                case 16:
                    str14 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str3;
                    break;
                case 17:
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = m;
                    str = str4;
                    str2 = str5;
                    decode = str3;
                    str4 = str;
                    str5 = str2;
                    break;
                case 18:
                    m.add(TransactionEvent.ADAPTER.decode(protoReader));
                    arrayList = m;
                    str = str4;
                    str2 = str5;
                    decode = str3;
                    str4 = str;
                    str5 = str2;
                    break;
            }
            str3 = decode;
            m = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentActivity paymentActivity = (PaymentActivity) obj;
        reverseProtoWriter.getClass();
        paymentActivity.getClass();
        reverseProtoWriter.writeBytes(paymentActivity.unknownFields());
        TransactionEvent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 18, paymentActivity.transaction_events);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, paymentActivity.listing_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, paymentActivity.application_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, paymentActivity.application_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, paymentActivity.auth_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, paymentActivity.statement_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, paymentActivity.payment_method);
        PaymentActivity.State.ADAPTER.encodeWithTag(reverseProtoWriter, 10, paymentActivity.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, paymentActivity.fee_amount_cents);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 8, paymentActivity.is_refunded);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 7, paymentActivity.amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, paymentActivity.note);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, paymentActivity.time_zone);
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 4, paymentActivity.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, paymentActivity.display_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, paymentActivity.payment_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, paymentActivity.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentActivity paymentActivity = (PaymentActivity) obj;
        paymentActivity.getClass();
        int size$okio = paymentActivity.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return TransactionEvent.ADAPTER.asRepeated().encodedSizeWithTag(18, paymentActivity.transaction_events) + protoAdapter.encodedSizeWithTag(16, paymentActivity.listing_title) + protoAdapter.encodedSizeWithTag(15, paymentActivity.application_name) + protoAdapter.encodedSizeWithTag(14, paymentActivity.application_id) + protoAdapter.encodedSizeWithTag(13, paymentActivity.auth_code) + protoAdapter.encodedSizeWithTag(12, paymentActivity.statement_description) + protoAdapter.encodedSizeWithTag(11, paymentActivity.payment_method) + PaymentActivity.State.ADAPTER.encodedSizeWithTag(10, paymentActivity.state) + protoAdapter.encodedSizeWithTag(9, paymentActivity.fee_amount_cents) + ProtoAdapter.BOOL.encodedSizeWithTag(8, paymentActivity.is_refunded) + Money.ADAPTER.encodedSizeWithTag(7, paymentActivity.amount) + protoAdapter.encodedSizeWithTag(6, paymentActivity.note) + protoAdapter.encodedSizeWithTag(5, paymentActivity.time_zone) + ProtoAdapter.INSTANT.encodedSizeWithTag(4, paymentActivity.created_at) + protoAdapter.encodedSizeWithTag(3, paymentActivity.display_id) + protoAdapter.encodedSizeWithTag(2, paymentActivity.payment_token) + protoAdapter.encodedSizeWithTag(1, paymentActivity.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentActivity paymentActivity = (PaymentActivity) obj;
        paymentActivity.getClass();
        Instant instant = paymentActivity.created_at;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        Money money = paymentActivity.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(paymentActivity.transaction_events, TransactionEvent.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = paymentActivity.customer_token;
        String str2 = paymentActivity.payment_token;
        String str3 = paymentActivity.display_id;
        String str4 = paymentActivity.time_zone;
        Boolean bool = paymentActivity.is_refunded;
        String str5 = paymentActivity.fee_amount_cents;
        PaymentActivity.State state = paymentActivity.state;
        String str6 = paymentActivity.application_id;
        String str7 = paymentActivity.application_name;
        String str8 = paymentActivity.listing_title;
        byteString.getClass();
        return new PaymentActivity(str, str2, str3, instant2, str4, null, money2, bool, str5, state, null, null, null, str6, str7, str8, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentActivity paymentActivity = (PaymentActivity) obj;
        paymentActivity.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, paymentActivity.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, paymentActivity.payment_token);
        protoAdapter.encodeWithTag(protoWriter, 3, paymentActivity.display_id);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 4, paymentActivity.created_at);
        protoAdapter.encodeWithTag(protoWriter, 5, paymentActivity.time_zone);
        protoAdapter.encodeWithTag(protoWriter, 6, paymentActivity.note);
        Money.ADAPTER.encodeWithTag(protoWriter, 7, paymentActivity.amount);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, paymentActivity.is_refunded);
        protoAdapter.encodeWithTag(protoWriter, 9, paymentActivity.fee_amount_cents);
        PaymentActivity.State.ADAPTER.encodeWithTag(protoWriter, 10, paymentActivity.state);
        protoAdapter.encodeWithTag(protoWriter, 11, paymentActivity.payment_method);
        protoAdapter.encodeWithTag(protoWriter, 12, paymentActivity.statement_description);
        protoAdapter.encodeWithTag(protoWriter, 13, paymentActivity.auth_code);
        protoAdapter.encodeWithTag(protoWriter, 14, paymentActivity.application_id);
        protoAdapter.encodeWithTag(protoWriter, 15, paymentActivity.application_name);
        protoAdapter.encodeWithTag(protoWriter, 16, paymentActivity.listing_title);
        TransactionEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 18, paymentActivity.transaction_events);
        protoWriter.writeBytes(paymentActivity.unknownFields());
    }
}
