package com.squareup.protos.franklin.investing.resources;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomOrder$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CustomOrder((Money) obj2, (Money) obj3, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CustomOrder customOrder = (CustomOrder) obj;
        reverseProtoWriter.getClass();
        customOrder.getClass();
        reverseProtoWriter.writeBytes(customOrder.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, customOrder.target_share_price);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, customOrder.original_share_price);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, customOrder.period_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomOrder customOrder = (CustomOrder) obj;
        customOrder.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, customOrder.period_token) + customOrder.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, customOrder.target_share_price) + protoAdapter.encodedSizeWithTag(2, customOrder.original_share_price) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomOrder customOrder = (CustomOrder) obj;
        customOrder.getClass();
        Money money = customOrder.original_share_price;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = customOrder.target_share_price;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = customOrder.period_token;
        byteString.getClass();
        return new CustomOrder(money2, money4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomOrder customOrder = (CustomOrder) obj;
        customOrder.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customOrder.period_token);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, customOrder.original_share_price);
        protoAdapter.encodeWithTag(protoWriter, 3, customOrder.target_share_price);
        protoWriter.writeBytes(customOrder.unknownFields());
    }
}
