package com.squareup.protos.cash.bitcoin;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BitcoinBuyClientRouteParams$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BitcoinBuyClientRouteParams((Money) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BitcoinBuyClientRouteParams bitcoinBuyClientRouteParams = (BitcoinBuyClientRouteParams) obj;
        reverseProtoWriter.getClass();
        bitcoinBuyClientRouteParams.getClass();
        reverseProtoWriter.writeBytes(bitcoinBuyClientRouteParams.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, bitcoinBuyClientRouteParams.instrument_token);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bitcoinBuyClientRouteParams.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BitcoinBuyClientRouteParams bitcoinBuyClientRouteParams = (BitcoinBuyClientRouteParams) obj;
        bitcoinBuyClientRouteParams.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, bitcoinBuyClientRouteParams.instrument_token) + Money.ADAPTER.encodedSizeWithTag(1, bitcoinBuyClientRouteParams.amount) + bitcoinBuyClientRouteParams.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BitcoinBuyClientRouteParams bitcoinBuyClientRouteParams = (BitcoinBuyClientRouteParams) obj;
        bitcoinBuyClientRouteParams.getClass();
        Money money = bitcoinBuyClientRouteParams.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = bitcoinBuyClientRouteParams.instrument_token;
        byteString.getClass();
        return new BitcoinBuyClientRouteParams(money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BitcoinBuyClientRouteParams bitcoinBuyClientRouteParams = (BitcoinBuyClientRouteParams) obj;
        bitcoinBuyClientRouteParams.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, bitcoinBuyClientRouteParams.amount);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bitcoinBuyClientRouteParams.instrument_token);
        protoWriter.writeBytes(bitcoinBuyClientRouteParams.unknownFields());
    }
}
