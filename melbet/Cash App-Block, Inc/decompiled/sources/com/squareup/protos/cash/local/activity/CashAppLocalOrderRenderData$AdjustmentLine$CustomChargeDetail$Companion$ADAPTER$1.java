package com.squareup.protos.cash.local.activity;

import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$AdjustmentLine$CustomChargeDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail customChargeDetail = (CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail) obj;
        reverseProtoWriter.getClass();
        customChargeDetail.getClass();
        reverseProtoWriter.writeBytes(customChargeDetail.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, customChargeDetail.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail customChargeDetail = (CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail) obj;
        customChargeDetail.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, customChargeDetail.name) + customChargeDetail.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail customChargeDetail = (CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail) obj;
        customChargeDetail.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = customChargeDetail.name;
        byteString.getClass();
        return new CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail customChargeDetail = (CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail) obj;
        customChargeDetail.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customChargeDetail.name);
        protoWriter.writeBytes(customChargeDetail.unknownFields());
    }
}
