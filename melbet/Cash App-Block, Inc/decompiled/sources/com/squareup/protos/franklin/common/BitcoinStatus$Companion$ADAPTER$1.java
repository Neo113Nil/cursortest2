package com.squareup.protos.franklin.common;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BitcoinStatus$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BitcoinStatus((Long) obj, (BitcoinState) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = BitcoinState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BitcoinStatus bitcoinStatus = (BitcoinStatus) obj;
        reverseProtoWriter.getClass();
        bitcoinStatus.getClass();
        reverseProtoWriter.writeBytes(bitcoinStatus.unknownFields());
        BitcoinState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, bitcoinStatus.state);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, bitcoinStatus.entered_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BitcoinStatus bitcoinStatus = (BitcoinStatus) obj;
        bitcoinStatus.getClass();
        return BitcoinState.ADAPTER.encodedSizeWithTag(2, bitcoinStatus.state) + ProtoAdapter.INT64.encodedSizeWithTag(1, bitcoinStatus.entered_at) + bitcoinStatus.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BitcoinStatus bitcoinStatus = (BitcoinStatus) obj;
        bitcoinStatus.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = bitcoinStatus.entered_at;
        BitcoinState bitcoinState = bitcoinStatus.state;
        byteString.getClass();
        return new BitcoinStatus(l, bitcoinState, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BitcoinStatus bitcoinStatus = (BitcoinStatus) obj;
        bitcoinStatus.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, bitcoinStatus.entered_at);
        BitcoinState.ADAPTER.encodeWithTag(protoWriter, 2, bitcoinStatus.state);
        protoWriter.writeBytes(bitcoinStatus.unknownFields());
    }
}
