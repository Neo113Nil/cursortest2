package com.squareup.protos.cash.cashliteflow.api.v1;

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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvailableNetwork((AvailableChain) obj, (String) obj2, (String) obj3, (Money) obj4, (AvailableAsset) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AvailableChain.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(AvailableAsset.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvailableNetwork availableNetwork = (AvailableNetwork) obj;
        reverseProtoWriter.getClass();
        availableNetwork.getClass();
        reverseProtoWriter.writeBytes(availableNetwork.unknownFields());
        AvailableAsset.ADAPTER.encodeWithTag(reverseProtoWriter, 5, availableNetwork.asset);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, availableNetwork.amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, availableNetwork.truncated_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, availableNetwork.destination_address);
        AvailableChain.ADAPTER.encodeWithTag(reverseProtoWriter, 1, availableNetwork.chain);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvailableNetwork availableNetwork = (AvailableNetwork) obj;
        availableNetwork.getClass();
        int encodedSizeWithTag = AvailableChain.ADAPTER.encodedSizeWithTag(1, availableNetwork.chain) + availableNetwork.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return AvailableAsset.ADAPTER.encodedSizeWithTag(5, availableNetwork.asset) + Money.ADAPTER.encodedSizeWithTag(4, availableNetwork.amount) + protoAdapter.encodedSizeWithTag(3, availableNetwork.truncated_address) + protoAdapter.encodedSizeWithTag(2, availableNetwork.destination_address) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvailableNetwork availableNetwork = (AvailableNetwork) obj;
        availableNetwork.getClass();
        AvailableChain availableChain = availableNetwork.chain;
        AvailableChain availableChain2 = availableChain != null ? (AvailableChain) AvailableChain.ADAPTER.redact(availableChain) : null;
        Money money = availableNetwork.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        AvailableAsset availableAsset = availableNetwork.asset;
        AvailableAsset availableAsset2 = availableAsset != null ? (AvailableAsset) AvailableAsset.ADAPTER.redact(availableAsset) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = availableNetwork.destination_address;
        String str2 = availableNetwork.truncated_address;
        byteString.getClass();
        return new AvailableNetwork(availableChain2, str, str2, money2, availableAsset2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvailableNetwork availableNetwork = (AvailableNetwork) obj;
        availableNetwork.getClass();
        AvailableChain.ADAPTER.encodeWithTag(protoWriter, 1, availableNetwork.chain);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, availableNetwork.destination_address);
        protoAdapter.encodeWithTag(protoWriter, 3, availableNetwork.truncated_address);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, availableNetwork.amount);
        AvailableAsset.ADAPTER.encodeWithTag(protoWriter, 5, availableNetwork.asset);
        protoWriter.writeBytes(availableNetwork.unknownFields());
    }
}
