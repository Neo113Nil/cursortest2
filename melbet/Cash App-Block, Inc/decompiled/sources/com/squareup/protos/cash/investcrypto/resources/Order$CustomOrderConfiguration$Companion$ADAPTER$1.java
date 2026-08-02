package com.squareup.protos.cash.investcrypto.resources;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Order$CustomOrderConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Order.CustomOrderConfiguration((Money) obj2, (Money) obj3, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
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
        Order.CustomOrderConfiguration customOrderConfiguration = (Order.CustomOrderConfiguration) obj;
        reverseProtoWriter.getClass();
        customOrderConfiguration.getClass();
        reverseProtoWriter.writeBytes(customOrderConfiguration.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, customOrderConfiguration.target_share_price);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, customOrderConfiguration.original_share_price);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, customOrderConfiguration.period_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Order.CustomOrderConfiguration customOrderConfiguration = (Order.CustomOrderConfiguration) obj;
        customOrderConfiguration.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, customOrderConfiguration.period_token) + customOrderConfiguration.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, customOrderConfiguration.target_share_price) + protoAdapter.encodedSizeWithTag(2, customOrderConfiguration.original_share_price) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Order.CustomOrderConfiguration customOrderConfiguration = (Order.CustomOrderConfiguration) obj;
        customOrderConfiguration.getClass();
        Money money = customOrderConfiguration.original_share_price;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = customOrderConfiguration.target_share_price;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = customOrderConfiguration.period_token;
        byteString.getClass();
        return new Order.CustomOrderConfiguration(money2, money4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Order.CustomOrderConfiguration customOrderConfiguration = (Order.CustomOrderConfiguration) obj;
        customOrderConfiguration.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customOrderConfiguration.period_token);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, customOrderConfiguration.original_share_price);
        protoAdapter.encodeWithTag(protoWriter, 3, customOrderConfiguration.target_share_price);
        protoWriter.writeBytes(customOrderConfiguration.unknownFields());
    }
}
