package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupOffersTabCreditLine$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SupOffersTabCreditLine((String) obj, (Money) obj2, (Money) obj3, (Money) obj4, (Integer) obj5, (Integer) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupOffersTabCreditLine supOffersTabCreditLine = (SupOffersTabCreditLine) obj;
        reverseProtoWriter.getClass();
        supOffersTabCreditLine.getClass();
        reverseProtoWriter.writeBytes(supOffersTabCreditLine.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, supOffersTabCreditLine.active_loan_count);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, supOffersTabCreditLine.active_loan_limit);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, supOffersTabCreditLine.outstanding_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, supOffersTabCreditLine.available_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, supOffersTabCreditLine.credit_limit);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, supOffersTabCreditLine.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupOffersTabCreditLine supOffersTabCreditLine = (SupOffersTabCreditLine) obj;
        supOffersTabCreditLine.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, supOffersTabCreditLine.token) + supOffersTabCreditLine.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, supOffersTabCreditLine.outstanding_amount) + protoAdapter.encodedSizeWithTag(3, supOffersTabCreditLine.available_amount) + protoAdapter.encodedSizeWithTag(2, supOffersTabCreditLine.credit_limit) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        return protoAdapter2.encodedSizeWithTag(6, supOffersTabCreditLine.active_loan_count) + protoAdapter2.encodedSizeWithTag(5, supOffersTabCreditLine.active_loan_limit) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupOffersTabCreditLine supOffersTabCreditLine = (SupOffersTabCreditLine) obj;
        supOffersTabCreditLine.getClass();
        Money money = supOffersTabCreditLine.credit_limit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = supOffersTabCreditLine.available_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = supOffersTabCreditLine.outstanding_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = supOffersTabCreditLine.token;
        Integer num = supOffersTabCreditLine.active_loan_limit;
        Integer num2 = supOffersTabCreditLine.active_loan_count;
        byteString.getClass();
        return new SupOffersTabCreditLine(str, money2, money4, money6, num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupOffersTabCreditLine supOffersTabCreditLine = (SupOffersTabCreditLine) obj;
        supOffersTabCreditLine.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, supOffersTabCreditLine.token);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, supOffersTabCreditLine.credit_limit);
        protoAdapter.encodeWithTag(protoWriter, 3, supOffersTabCreditLine.available_amount);
        protoAdapter.encodeWithTag(protoWriter, 4, supOffersTabCreditLine.outstanding_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 5, supOffersTabCreditLine.active_loan_limit);
        protoAdapter2.encodeWithTag(protoWriter, 6, supOffersTabCreditLine.active_loan_count);
        protoWriter.writeBytes(supOffersTabCreditLine.unknownFields());
    }
}
