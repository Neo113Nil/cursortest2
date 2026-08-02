package com.squareup.protos.cash.local.activity;

import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$AdjustmentLine$TaxDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail taxDetail = (CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail) obj;
        reverseProtoWriter.getClass();
        taxDetail.getClass();
        reverseProtoWriter.writeBytes(taxDetail.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, taxDetail.rate_percentage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, taxDetail.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail taxDetail = (CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail) obj;
        taxDetail.getClass();
        int size$okio = taxDetail.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, taxDetail.rate_percentage) + protoAdapter.encodedSizeWithTag(1, taxDetail.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail taxDetail = (CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail) obj;
        taxDetail.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = taxDetail.name;
        String str2 = taxDetail.rate_percentage;
        byteString.getClass();
        return new CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail taxDetail = (CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail) obj;
        taxDetail.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, taxDetail.name);
        protoAdapter.encodeWithTag(protoWriter, 2, taxDetail.rate_percentage);
        protoWriter.writeBytes(taxDetail.unknownFields());
    }
}
