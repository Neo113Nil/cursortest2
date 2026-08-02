package com.squareup.protos.cash.investcrypto.event;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.investcrypto.resources.OrderStateReason;
import com.squareup.protos.franklin.api.Region;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CryptoOrderEvent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CryptoOrderEvent((Order) obj, (Long) obj2, (Long) obj3, (Long) obj4, (OrderStateReason) obj5, (LedgerProcessor) obj6, (Region) obj7, (Long) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Order.ADAPTER, protoReader, obj);
                    break;
                case 2:
                case 6:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 3:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    try {
                        obj5 = OrderStateReason.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 8:
                    try {
                        obj6 = LedgerProcessor.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 9:
                    try {
                        obj7 = Region.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 10:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CryptoOrderEvent cryptoOrderEvent = (CryptoOrderEvent) obj;
        reverseProtoWriter.getClass();
        cryptoOrderEvent.getClass();
        reverseProtoWriter.writeBytes(cryptoOrderEvent.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, cryptoOrderEvent.last_state_updated_at);
        Region.ADAPTER.encodeWithTag(reverseProtoWriter, 9, cryptoOrderEvent.region);
        LedgerProcessor.ADAPTER.encodeWithTag(reverseProtoWriter, 8, cryptoOrderEvent.ledger_processor);
        OrderStateReason.ADAPTER.encodeWithTag(reverseProtoWriter, 7, cryptoOrderEvent.reason);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cryptoOrderEvent.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cryptoOrderEvent.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cryptoOrderEvent.version);
        Order.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cryptoOrderEvent.order);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CryptoOrderEvent cryptoOrderEvent = (CryptoOrderEvent) obj;
        cryptoOrderEvent.getClass();
        int encodedSizeWithTag = Order.ADAPTER.encodedSizeWithTag(1, cryptoOrderEvent.order) + cryptoOrderEvent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(10, cryptoOrderEvent.last_state_updated_at) + Region.ADAPTER.encodedSizeWithTag(9, cryptoOrderEvent.region) + LedgerProcessor.ADAPTER.encodedSizeWithTag(8, cryptoOrderEvent.ledger_processor) + OrderStateReason.ADAPTER.encodedSizeWithTag(7, cryptoOrderEvent.reason) + protoAdapter.encodedSizeWithTag(5, cryptoOrderEvent.updated_at) + protoAdapter.encodedSizeWithTag(4, cryptoOrderEvent.created_at) + protoAdapter.encodedSizeWithTag(3, cryptoOrderEvent.version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CryptoOrderEvent cryptoOrderEvent = (CryptoOrderEvent) obj;
        cryptoOrderEvent.getClass();
        Order order = cryptoOrderEvent.order;
        Order order2 = order != null ? (Order) Order.ADAPTER.redact(order) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = cryptoOrderEvent.version;
        Long l2 = cryptoOrderEvent.created_at;
        Long l3 = cryptoOrderEvent.updated_at;
        OrderStateReason orderStateReason = cryptoOrderEvent.reason;
        LedgerProcessor ledgerProcessor = cryptoOrderEvent.ledger_processor;
        Region region = cryptoOrderEvent.region;
        Long l4 = cryptoOrderEvent.last_state_updated_at;
        byteString.getClass();
        return new CryptoOrderEvent(order2, l, l2, l3, orderStateReason, ledgerProcessor, region, l4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CryptoOrderEvent cryptoOrderEvent = (CryptoOrderEvent) obj;
        cryptoOrderEvent.getClass();
        Order.ADAPTER.encodeWithTag(protoWriter, 1, cryptoOrderEvent.order);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, cryptoOrderEvent.version);
        protoAdapter.encodeWithTag(protoWriter, 4, cryptoOrderEvent.created_at);
        protoAdapter.encodeWithTag(protoWriter, 5, cryptoOrderEvent.updated_at);
        OrderStateReason.ADAPTER.encodeWithTag(protoWriter, 7, cryptoOrderEvent.reason);
        LedgerProcessor.ADAPTER.encodeWithTag(protoWriter, 8, cryptoOrderEvent.ledger_processor);
        Region.ADAPTER.encodeWithTag(protoWriter, 9, cryptoOrderEvent.region);
        protoAdapter.encodeWithTag(protoWriter, 10, cryptoOrderEvent.last_state_updated_at);
        protoWriter.writeBytes(cryptoOrderEvent.unknownFields());
    }
}
