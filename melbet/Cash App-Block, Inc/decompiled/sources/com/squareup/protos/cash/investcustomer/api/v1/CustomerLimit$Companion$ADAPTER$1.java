package com.squareup.protos.cash.investcustomer.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerLimit;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CustomerLimit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomerLimit((CustomerLimit.Frequency) obj, (Money) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CustomerLimit.Frequency.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerLimit customerLimit = (CustomerLimit) obj;
        reverseProtoWriter.getClass();
        customerLimit.getClass();
        reverseProtoWriter.writeBytes(customerLimit.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, customerLimit.remaining_usage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, customerLimit.max);
        CustomerLimit.Frequency.ADAPTER.encodeWithTag(reverseProtoWriter, 1, customerLimit.frequency);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerLimit customerLimit = (CustomerLimit) obj;
        customerLimit.getClass();
        int encodedSizeWithTag = CustomerLimit.Frequency.ADAPTER.encodedSizeWithTag(1, customerLimit.frequency) + customerLimit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, customerLimit.remaining_usage) + protoAdapter.encodedSizeWithTag(2, customerLimit.max) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerLimit customerLimit = (CustomerLimit) obj;
        customerLimit.getClass();
        Money money = customerLimit.max;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = customerLimit.remaining_usage;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        CustomerLimit.Frequency frequency = customerLimit.frequency;
        byteString.getClass();
        return new CustomerLimit(frequency, money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerLimit customerLimit = (CustomerLimit) obj;
        customerLimit.getClass();
        CustomerLimit.Frequency.ADAPTER.encodeWithTag(protoWriter, 1, customerLimit.frequency);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, customerLimit.max);
        protoAdapter.encodeWithTag(protoWriter, 3, customerLimit.remaining_usage);
        protoWriter.writeBytes(customerLimit.unknownFields());
    }
}
