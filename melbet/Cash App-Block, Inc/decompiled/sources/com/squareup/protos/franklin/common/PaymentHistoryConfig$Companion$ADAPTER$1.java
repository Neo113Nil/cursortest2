package com.squareup.protos.franklin.common;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentHistoryConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentHistoryConfig((String) obj, (String) obj2, m, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 4:
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 5:
                    arrayList2.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 6:
                    arrayList3.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 7:
                    arrayList4.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 8:
                    arrayList5.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 9:
                    arrayList6.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 10:
                    arrayList7.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 11:
                    arrayList8.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentHistoryConfig paymentHistoryConfig = (PaymentHistoryConfig) obj;
        reverseProtoWriter.getClass();
        paymentHistoryConfig.getClass();
        reverseProtoWriter.writeBytes(paymentHistoryConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 11, paymentHistoryConfig.business_payments_customer_ids);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 10, paymentHistoryConfig.automated_investment_payment_types);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 9, paymentHistoryConfig.loyalty_merchant_payment_activity_hidden_payment_types);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 8, paymentHistoryConfig.top_level_hidden_payment_types);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 7, paymentHistoryConfig.referral_customer_ids);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 6, paymentHistoryConfig.lending_transaction_customer_ids);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, paymentHistoryConfig.bitcoin_transaction_customer_ids);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, paymentHistoryConfig.banking_transaction_customer_ids);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, paymentHistoryConfig.transfer_customer_ids);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, paymentHistoryConfig.search_script_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, paymentHistoryConfig.script_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentHistoryConfig paymentHistoryConfig = (PaymentHistoryConfig) obj;
        paymentHistoryConfig.getClass();
        int size$okio = paymentHistoryConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(11, paymentHistoryConfig.business_payments_customer_ids) + protoAdapter.asRepeated().encodedSizeWithTag(10, paymentHistoryConfig.automated_investment_payment_types) + protoAdapter.asRepeated().encodedSizeWithTag(9, paymentHistoryConfig.loyalty_merchant_payment_activity_hidden_payment_types) + protoAdapter.asRepeated().encodedSizeWithTag(8, paymentHistoryConfig.top_level_hidden_payment_types) + protoAdapter.asRepeated().encodedSizeWithTag(7, paymentHistoryConfig.referral_customer_ids) + protoAdapter.asRepeated().encodedSizeWithTag(6, paymentHistoryConfig.lending_transaction_customer_ids) + protoAdapter.asRepeated().encodedSizeWithTag(5, paymentHistoryConfig.bitcoin_transaction_customer_ids) + protoAdapter.asRepeated().encodedSizeWithTag(4, paymentHistoryConfig.banking_transaction_customer_ids) + protoAdapter.asRepeated().encodedSizeWithTag(3, paymentHistoryConfig.transfer_customer_ids) + protoAdapter.encodedSizeWithTag(2, paymentHistoryConfig.search_script_url) + protoAdapter.encodedSizeWithTag(1, paymentHistoryConfig.script_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentHistoryConfig paymentHistoryConfig = (PaymentHistoryConfig) obj;
        paymentHistoryConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = paymentHistoryConfig.script_url;
        String str2 = paymentHistoryConfig.search_script_url;
        List list = paymentHistoryConfig.transfer_customer_ids;
        List list2 = paymentHistoryConfig.banking_transaction_customer_ids;
        List list3 = paymentHistoryConfig.bitcoin_transaction_customer_ids;
        List list4 = paymentHistoryConfig.lending_transaction_customer_ids;
        List list5 = paymentHistoryConfig.referral_customer_ids;
        List list6 = paymentHistoryConfig.top_level_hidden_payment_types;
        List list7 = paymentHistoryConfig.loyalty_merchant_payment_activity_hidden_payment_types;
        List list8 = paymentHistoryConfig.automated_investment_payment_types;
        List list9 = paymentHistoryConfig.business_payments_customer_ids;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        byteString.getClass();
        return new PaymentHistoryConfig(str, str2, list, list2, list3, list4, list5, list6, list7, list8, list9, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentHistoryConfig paymentHistoryConfig = (PaymentHistoryConfig) obj;
        paymentHistoryConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, paymentHistoryConfig.script_url);
        protoAdapter.encodeWithTag(protoWriter, 2, paymentHistoryConfig.search_script_url);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, paymentHistoryConfig.transfer_customer_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, paymentHistoryConfig.banking_transaction_customer_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, paymentHistoryConfig.bitcoin_transaction_customer_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, paymentHistoryConfig.lending_transaction_customer_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, paymentHistoryConfig.referral_customer_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 8, paymentHistoryConfig.top_level_hidden_payment_types);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 9, paymentHistoryConfig.loyalty_merchant_payment_activity_hidden_payment_types);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 10, paymentHistoryConfig.automated_investment_payment_types);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 11, paymentHistoryConfig.business_payments_customer_ids);
        protoWriter.writeBytes(paymentHistoryConfig.unknownFields());
    }
}
