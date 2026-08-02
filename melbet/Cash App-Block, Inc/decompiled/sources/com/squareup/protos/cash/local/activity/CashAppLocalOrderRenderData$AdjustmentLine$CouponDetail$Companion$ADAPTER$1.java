package com.squareup.protos.cash.local.activity;

import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$AdjustmentLine$CouponDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail couponDetail = (CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail) obj;
        reverseProtoWriter.getClass();
        couponDetail.getClass();
        reverseProtoWriter.writeBytes(couponDetail.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, couponDetail.code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail couponDetail = (CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail) obj;
        couponDetail.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, couponDetail.code) + couponDetail.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail couponDetail = (CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail) obj;
        couponDetail.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = couponDetail.code;
        byteString.getClass();
        return new CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail couponDetail = (CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail) obj;
        couponDetail.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, couponDetail.code);
        protoWriter.writeBytes(couponDetail.unknownFields());
    }
}
