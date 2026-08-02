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
public final class Order$FeatureMetadata$P2pReceiveMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Order.FeatureMetadata.P2pReceiveMetadata((String) obj, (String) obj2, (Integer) obj3, (Money) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Order.FeatureMetadata.P2pReceiveMetadata p2pReceiveMetadata = (Order.FeatureMetadata.P2pReceiveMetadata) obj;
        reverseProtoWriter.getClass();
        p2pReceiveMetadata.getClass();
        reverseProtoWriter.writeBytes(p2pReceiveMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, p2pReceiveMetadata.sender_customer_token);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, p2pReceiveMetadata.payment_amount);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, p2pReceiveMetadata.conversion_bps);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, p2pReceiveMetadata.payment_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, p2pReceiveMetadata.sender_display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Order.FeatureMetadata.P2pReceiveMetadata p2pReceiveMetadata = (Order.FeatureMetadata.P2pReceiveMetadata) obj;
        p2pReceiveMetadata.getClass();
        int size$okio = p2pReceiveMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, p2pReceiveMetadata.sender_customer_token) + Money.ADAPTER.encodedSizeWithTag(4, p2pReceiveMetadata.payment_amount) + ProtoAdapter.INT32.encodedSizeWithTag(3, p2pReceiveMetadata.conversion_bps) + protoAdapter.encodedSizeWithTag(2, p2pReceiveMetadata.payment_id) + protoAdapter.encodedSizeWithTag(1, p2pReceiveMetadata.sender_display_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Order.FeatureMetadata.P2pReceiveMetadata p2pReceiveMetadata = (Order.FeatureMetadata.P2pReceiveMetadata) obj;
        p2pReceiveMetadata.getClass();
        Money money = p2pReceiveMetadata.payment_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = p2pReceiveMetadata.sender_display_name;
        String str2 = p2pReceiveMetadata.payment_id;
        Integer num = p2pReceiveMetadata.conversion_bps;
        String str3 = p2pReceiveMetadata.sender_customer_token;
        byteString.getClass();
        return new Order.FeatureMetadata.P2pReceiveMetadata(str, str2, num, money2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Order.FeatureMetadata.P2pReceiveMetadata p2pReceiveMetadata = (Order.FeatureMetadata.P2pReceiveMetadata) obj;
        p2pReceiveMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, p2pReceiveMetadata.sender_display_name);
        protoAdapter.encodeWithTag(protoWriter, 2, p2pReceiveMetadata.payment_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, p2pReceiveMetadata.conversion_bps);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, p2pReceiveMetadata.payment_amount);
        protoAdapter.encodeWithTag(protoWriter, 5, p2pReceiveMetadata.sender_customer_token);
        protoWriter.writeBytes(p2pReceiveMetadata.unknownFields());
    }
}
