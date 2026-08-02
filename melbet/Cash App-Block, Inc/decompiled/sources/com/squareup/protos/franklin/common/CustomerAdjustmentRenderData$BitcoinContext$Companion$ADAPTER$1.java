package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CustomerAdjustmentRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomerAdjustmentRenderData$BitcoinContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomerAdjustmentRenderData.BitcoinContext((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerAdjustmentRenderData.BitcoinContext bitcoinContext = (CustomerAdjustmentRenderData.BitcoinContext) obj;
        reverseProtoWriter.getClass();
        bitcoinContext.getClass();
        reverseProtoWriter.writeBytes(bitcoinContext.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, bitcoinContext.btc_sold);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerAdjustmentRenderData.BitcoinContext bitcoinContext = (CustomerAdjustmentRenderData.BitcoinContext) obj;
        bitcoinContext.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, bitcoinContext.btc_sold) + bitcoinContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerAdjustmentRenderData.BitcoinContext bitcoinContext = (CustomerAdjustmentRenderData.BitcoinContext) obj;
        bitcoinContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = bitcoinContext.btc_sold;
        byteString.getClass();
        return new CustomerAdjustmentRenderData.BitcoinContext(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerAdjustmentRenderData.BitcoinContext bitcoinContext = (CustomerAdjustmentRenderData.BitcoinContext) obj;
        bitcoinContext.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, bitcoinContext.btc_sold);
        protoWriter.writeBytes(bitcoinContext.unknownFields());
    }
}
