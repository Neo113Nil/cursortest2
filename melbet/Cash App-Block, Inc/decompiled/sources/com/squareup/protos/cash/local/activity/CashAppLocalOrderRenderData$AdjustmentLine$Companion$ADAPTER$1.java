package com.squareup.protos.cash.local.activity;

import androidx.room.TransactorKt;
import com.bumptech.glide.module.ManifestParser;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$AdjustmentLine$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ManifestParser cashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        ManifestParser manifestParser = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppLocalOrderRenderData.AdjustmentLine((CashAppLocalOrderRenderData.AdjustmentLine.Type) obj, (Money) obj2, manifestParser, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CashAppLocalOrderRenderData.AdjustmentLine.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                switch (nextTag) {
                    case 10:
                        cashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail = new CashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail((CashAppLocalOrderRenderData.AdjustmentLine.GiftCardDetail) CashAppLocalOrderRenderData.AdjustmentLine.GiftCardDetail.ADAPTER.decode(protoReader));
                        break;
                    case 11:
                        cashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail = new CashAppLocalOrderRenderData$AdjustmentLine$Detail$TaxDetail((CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail) CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail.ADAPTER.decode(protoReader));
                        break;
                    case 12:
                        cashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail = new CashAppLocalOrderRenderData$AdjustmentLine$Detail$CouponDetail((CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail) CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail.ADAPTER.decode(protoReader));
                        break;
                    case 13:
                        cashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail = new CashAppLocalOrderRenderData$AdjustmentLine$Detail$DiscountDetail((CashAppLocalOrderRenderData.AdjustmentLine.DiscountDetail) CashAppLocalOrderRenderData.AdjustmentLine.DiscountDetail.ADAPTER.decode(protoReader));
                        break;
                    case 14:
                        cashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail = new CashAppLocalOrderRenderData$AdjustmentLine$Detail$CustomChargeDetail((CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail) CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail.ADAPTER.decode(protoReader));
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        continue;
                }
                manifestParser = cashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail;
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine adjustmentLine = (CashAppLocalOrderRenderData.AdjustmentLine) obj;
        reverseProtoWriter.getClass();
        adjustmentLine.getClass();
        reverseProtoWriter.writeBytes(adjustmentLine.unknownFields());
        ManifestParser manifestParser = adjustmentLine.detail;
        if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail) {
            CashAppLocalOrderRenderData.AdjustmentLine.GiftCardDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail) manifestParser).value);
        } else if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$TaxDetail) {
            CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$TaxDetail) manifestParser).value);
        } else if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$CouponDetail) {
            CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$CouponDetail) manifestParser).value);
        } else if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$DiscountDetail) {
            CashAppLocalOrderRenderData.AdjustmentLine.DiscountDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$DiscountDetail) manifestParser).value);
        } else if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$CustomChargeDetail) {
            CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$CustomChargeDetail) manifestParser).value);
        } else if (manifestParser != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, adjustmentLine.description);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, adjustmentLine.amount);
        CashAppLocalOrderRenderData.AdjustmentLine.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, adjustmentLine.f1302type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CashAppLocalOrderRenderData.AdjustmentLine adjustmentLine = (CashAppLocalOrderRenderData.AdjustmentLine) obj;
        adjustmentLine.getClass();
        int encodedSizeWithTag2 = Money.ADAPTER.encodedSizeWithTag(2, adjustmentLine.amount) + CashAppLocalOrderRenderData.AdjustmentLine.Type.ADAPTER.encodedSizeWithTag(1, adjustmentLine.f1302type) + adjustmentLine.unknownFields().getSize$okio();
        ManifestParser manifestParser = adjustmentLine.detail;
        if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail) {
            encodedSizeWithTag = CashAppLocalOrderRenderData.AdjustmentLine.GiftCardDetail.ADAPTER.encodedSizeWithTag(10, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail) manifestParser).value);
        } else if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$TaxDetail) {
            encodedSizeWithTag = CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail.ADAPTER.encodedSizeWithTag(11, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$TaxDetail) manifestParser).value);
        } else if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$CouponDetail) {
            encodedSizeWithTag = CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail.ADAPTER.encodedSizeWithTag(12, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$CouponDetail) manifestParser).value);
        } else if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$DiscountDetail) {
            encodedSizeWithTag = CashAppLocalOrderRenderData.AdjustmentLine.DiscountDetail.ADAPTER.encodedSizeWithTag(13, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$DiscountDetail) manifestParser).value);
        } else {
            if (!(manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$CustomChargeDetail)) {
                if (manifestParser != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(4, adjustmentLine.description) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail.ADAPTER.encodedSizeWithTag(14, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$CustomChargeDetail) manifestParser).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ProtoAdapter.STRING.encodedSizeWithTag(4, adjustmentLine.description) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine adjustmentLine = (CashAppLocalOrderRenderData.AdjustmentLine) obj;
        adjustmentLine.getClass();
        Money money = adjustmentLine.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        CashAppLocalOrderRenderData.AdjustmentLine.Type type2 = adjustmentLine.f1302type;
        ManifestParser manifestParser = adjustmentLine.detail;
        String str = adjustmentLine.description;
        byteString.getClass();
        return new CashAppLocalOrderRenderData.AdjustmentLine(type2, money2, manifestParser, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalOrderRenderData.AdjustmentLine adjustmentLine = (CashAppLocalOrderRenderData.AdjustmentLine) obj;
        adjustmentLine.getClass();
        CashAppLocalOrderRenderData.AdjustmentLine.Type.ADAPTER.encodeWithTag(protoWriter, 1, adjustmentLine.f1302type);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, adjustmentLine.amount);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, adjustmentLine.description);
        ManifestParser manifestParser = adjustmentLine.detail;
        if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail) {
            CashAppLocalOrderRenderData.AdjustmentLine.GiftCardDetail.ADAPTER.encodeWithTag(protoWriter, 10, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$GiftCardDetail) manifestParser).value);
        } else if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$TaxDetail) {
            CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail.ADAPTER.encodeWithTag(protoWriter, 11, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$TaxDetail) manifestParser).value);
        } else if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$CouponDetail) {
            CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail.ADAPTER.encodeWithTag(protoWriter, 12, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$CouponDetail) manifestParser).value);
        } else if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$DiscountDetail) {
            CashAppLocalOrderRenderData.AdjustmentLine.DiscountDetail.ADAPTER.encodeWithTag(protoWriter, 13, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$DiscountDetail) manifestParser).value);
        } else if (manifestParser instanceof CashAppLocalOrderRenderData$AdjustmentLine$Detail$CustomChargeDetail) {
            CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail.ADAPTER.encodeWithTag(protoWriter, 14, ((CashAppLocalOrderRenderData$AdjustmentLine$Detail$CustomChargeDetail) manifestParser).value);
        } else if (manifestParser != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(adjustmentLine.unknownFields());
    }
}
