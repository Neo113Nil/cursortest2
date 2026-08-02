package com.squareup.protos.cash.blockstable.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvailableNetwork$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvailableNetwork((Chain) obj, (String) obj2, (String) obj3, (Money) obj4, (Asset) obj5, (String) obj6, (Money) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Chain.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Asset.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvailableNetwork availableNetwork = (AvailableNetwork) obj;
        reverseProtoWriter.getClass();
        availableNetwork.getClass();
        reverseProtoWriter.writeBytes(availableNetwork.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, availableNetwork.gas_fee_in_fiat);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, availableNetwork.gas_fee);
        Asset.ADAPTER.encodeWithTag(reverseProtoWriter, 5, availableNetwork.asset);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, availableNetwork.amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, availableNetwork.truncated_address);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, availableNetwork.destination_address);
        Chain.ADAPTER.encodeWithTag(reverseProtoWriter, 1, availableNetwork.chain);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvailableNetwork availableNetwork = (AvailableNetwork) obj;
        availableNetwork.getClass();
        int encodedSizeWithTag = Chain.ADAPTER.encodedSizeWithTag(1, availableNetwork.chain) + availableNetwork.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, availableNetwork.truncated_address) + protoAdapter.encodedSizeWithTag(2, availableNetwork.destination_address) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(7, availableNetwork.gas_fee_in_fiat) + protoAdapter.encodedSizeWithTag(6, availableNetwork.gas_fee) + Asset.ADAPTER.encodedSizeWithTag(5, availableNetwork.asset) + protoAdapter2.encodedSizeWithTag(4, availableNetwork.amount) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvailableNetwork availableNetwork = (AvailableNetwork) obj;
        availableNetwork.getClass();
        Chain chain = availableNetwork.chain;
        Chain chain2 = chain != null ? (Chain) Chain.ADAPTER.redact(chain) : null;
        Money money = availableNetwork.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Asset asset = availableNetwork.asset;
        Asset asset2 = asset != null ? (Asset) Asset.ADAPTER.redact(asset) : null;
        Money money3 = availableNetwork.gas_fee_in_fiat;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = availableNetwork.destination_address;
        String str2 = availableNetwork.truncated_address;
        String str3 = availableNetwork.gas_fee;
        byteString.getClass();
        return new AvailableNetwork(chain2, str, str2, money2, asset2, str3, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvailableNetwork availableNetwork = (AvailableNetwork) obj;
        availableNetwork.getClass();
        Chain.ADAPTER.encodeWithTag(protoWriter, 1, availableNetwork.chain);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, availableNetwork.destination_address);
        protoAdapter.encodeWithTag(protoWriter, 3, availableNetwork.truncated_address);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, availableNetwork.amount);
        Asset.ADAPTER.encodeWithTag(protoWriter, 5, availableNetwork.asset);
        protoAdapter.encodeWithTag(protoWriter, 6, availableNetwork.gas_fee);
        protoAdapter2.encodeWithTag(protoWriter, 7, availableNetwork.gas_fee_in_fiat);
        protoWriter.writeBytes(availableNetwork.unknownFields());
    }
}
