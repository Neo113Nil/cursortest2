package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.CustomerAdjustmentRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomerAdjustmentRenderData$AdditionalAchContext$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CustomerAdjustmentRenderData.AdditionalAchContext((CustomerAdjustmentRenderData.BitcoinContext) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CustomerAdjustmentRenderData.BitcoinContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerAdjustmentRenderData.AdditionalAchContext additionalAchContext = (CustomerAdjustmentRenderData.AdditionalAchContext) obj;
        reverseProtoWriter.getClass();
        additionalAchContext.getClass();
        reverseProtoWriter.writeBytes(additionalAchContext.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, additionalAchContext.product_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, additionalAchContext.return_code);
        CustomerAdjustmentRenderData.BitcoinContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, additionalAchContext.bitcoin_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerAdjustmentRenderData.AdditionalAchContext additionalAchContext = (CustomerAdjustmentRenderData.AdditionalAchContext) obj;
        additionalAchContext.getClass();
        int encodedSizeWithTag = CustomerAdjustmentRenderData.BitcoinContext.ADAPTER.encodedSizeWithTag(1, additionalAchContext.bitcoin_context) + additionalAchContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, additionalAchContext.product_id) + protoAdapter.encodedSizeWithTag(2, additionalAchContext.return_code) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerAdjustmentRenderData.AdditionalAchContext additionalAchContext = (CustomerAdjustmentRenderData.AdditionalAchContext) obj;
        additionalAchContext.getClass();
        CustomerAdjustmentRenderData.BitcoinContext bitcoinContext = additionalAchContext.bitcoin_context;
        CustomerAdjustmentRenderData.BitcoinContext bitcoinContext2 = bitcoinContext != null ? (CustomerAdjustmentRenderData.BitcoinContext) CustomerAdjustmentRenderData.BitcoinContext.ADAPTER.redact(bitcoinContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = additionalAchContext.return_code;
        String str2 = additionalAchContext.product_id;
        byteString.getClass();
        return new CustomerAdjustmentRenderData.AdditionalAchContext(bitcoinContext2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerAdjustmentRenderData.AdditionalAchContext additionalAchContext = (CustomerAdjustmentRenderData.AdditionalAchContext) obj;
        additionalAchContext.getClass();
        CustomerAdjustmentRenderData.BitcoinContext.ADAPTER.encodeWithTag(protoWriter, 1, additionalAchContext.bitcoin_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, additionalAchContext.return_code);
        protoAdapter.encodeWithTag(protoWriter, 3, additionalAchContext.product_id);
        protoWriter.writeBytes(additionalAchContext.unknownFields());
    }
}
