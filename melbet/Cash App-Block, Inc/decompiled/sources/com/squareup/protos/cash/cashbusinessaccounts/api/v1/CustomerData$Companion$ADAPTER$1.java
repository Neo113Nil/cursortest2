package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CustomerData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CustomerData((Integer) obj, (Integer) obj2, (Money) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerData customerData = (CustomerData) obj;
        reverseProtoWriter.getClass();
        customerData.getClass();
        reverseProtoWriter.writeBytes(customerData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, customerData.photo);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, customerData.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, customerData.customer_token);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, customerData.sales_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, customerData.sales);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, customerData.position);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerData customerData = (CustomerData) obj;
        customerData.getClass();
        int size$okio = customerData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(3, customerData.sales_amount) + protoAdapter.encodedSizeWithTag(2, customerData.sales) + protoAdapter.encodedSizeWithTag(1, customerData.position) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter2.encodedSizeWithTag(6, customerData.photo) + protoAdapter2.encodedSizeWithTag(5, customerData.cashtag) + protoAdapter2.encodedSizeWithTag(4, customerData.customer_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerData customerData = (CustomerData) obj;
        customerData.getClass();
        Money money = customerData.sales_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = customerData.position;
        Integer num2 = customerData.sales;
        String str = customerData.customer_token;
        byteString.getClass();
        return new CustomerData(num, num2, money2, str, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerData customerData = (CustomerData) obj;
        customerData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, customerData.position);
        protoAdapter.encodeWithTag(protoWriter, 2, customerData.sales);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, customerData.sales_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, customerData.customer_token);
        protoAdapter2.encodeWithTag(protoWriter, 5, customerData.cashtag);
        protoAdapter2.encodeWithTag(protoWriter, 6, customerData.photo);
        protoWriter.writeBytes(customerData.unknownFields());
    }
}
