package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.BitcoinLightningRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BitcoinLightningRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BitcoinLightningRenderData((String) obj, (String) obj2, (String) obj3, (BitcoinLightningRenderData.FundingSource) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    try {
                        obj4 = BitcoinLightningRenderData.FundingSource.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BitcoinLightningRenderData bitcoinLightningRenderData = (BitcoinLightningRenderData) obj;
        reverseProtoWriter.getClass();
        bitcoinLightningRenderData.getClass();
        reverseProtoWriter.writeBytes(bitcoinLightningRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, bitcoinLightningRenderData.preimage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, bitcoinLightningRenderData.payment_hash);
        BitcoinLightningRenderData.FundingSource.ADAPTER.encodeWithTag(reverseProtoWriter, 4, bitcoinLightningRenderData.funding_source);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, bitcoinLightningRenderData.order_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bitcoinLightningRenderData.invoice);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bitcoinLightningRenderData.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BitcoinLightningRenderData bitcoinLightningRenderData = (BitcoinLightningRenderData) obj;
        bitcoinLightningRenderData.getClass();
        int size$okio = bitcoinLightningRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, bitcoinLightningRenderData.preimage) + protoAdapter.encodedSizeWithTag(5, bitcoinLightningRenderData.payment_hash) + BitcoinLightningRenderData.FundingSource.ADAPTER.encodedSizeWithTag(4, bitcoinLightningRenderData.funding_source) + protoAdapter.encodedSizeWithTag(3, bitcoinLightningRenderData.order_token) + protoAdapter.encodedSizeWithTag(2, bitcoinLightningRenderData.invoice) + protoAdapter.encodedSizeWithTag(1, bitcoinLightningRenderData.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BitcoinLightningRenderData bitcoinLightningRenderData = (BitcoinLightningRenderData) obj;
        bitcoinLightningRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = bitcoinLightningRenderData.token;
        String str2 = bitcoinLightningRenderData.order_token;
        BitcoinLightningRenderData.FundingSource fundingSource = bitcoinLightningRenderData.funding_source;
        String str3 = bitcoinLightningRenderData.payment_hash;
        String str4 = bitcoinLightningRenderData.preimage;
        byteString.getClass();
        return new BitcoinLightningRenderData(str, null, str2, fundingSource, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BitcoinLightningRenderData bitcoinLightningRenderData = (BitcoinLightningRenderData) obj;
        bitcoinLightningRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, bitcoinLightningRenderData.token);
        protoAdapter.encodeWithTag(protoWriter, 2, bitcoinLightningRenderData.invoice);
        protoAdapter.encodeWithTag(protoWriter, 3, bitcoinLightningRenderData.order_token);
        BitcoinLightningRenderData.FundingSource.ADAPTER.encodeWithTag(protoWriter, 4, bitcoinLightningRenderData.funding_source);
        protoAdapter.encodeWithTag(protoWriter, 5, bitcoinLightningRenderData.payment_hash);
        protoAdapter.encodeWithTag(protoWriter, 6, bitcoinLightningRenderData.preimage);
        protoWriter.writeBytes(bitcoinLightningRenderData.unknownFields());
    }
}
