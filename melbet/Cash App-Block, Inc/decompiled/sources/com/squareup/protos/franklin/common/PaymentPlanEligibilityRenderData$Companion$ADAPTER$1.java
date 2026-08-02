package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdx;
import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentPlanEligibilityRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzdx paymentPlanEligibilityRenderData$UiStateData$EligibilityUiData;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        zzdx zzdxVar = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentPlanEligibilityRenderData((PaymentPlanEligibilityRenderData.UiState) obj, zzdxVar, (PaymentPlanEligibilityRenderData.Source) obj2, (Boolean) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = PaymentPlanEligibilityRenderData.UiState.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    paymentPlanEligibilityRenderData$UiStateData$EligibilityUiData = new PaymentPlanEligibilityRenderData$UiStateData$EligibilityUiData((PaymentPlanEligibilityRenderData.EligibilityUiData) PaymentPlanEligibilityRenderData.EligibilityUiData.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    paymentPlanEligibilityRenderData$UiStateData$EligibilityUiData = new PaymentPlanEligibilityRenderData$UiStateData$EligibleUiData((PaymentPlanEligibilityRenderData.EligibleUiData) PaymentPlanEligibilityRenderData.EligibleUiData.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    try {
                        obj2 = PaymentPlanEligibilityRenderData.Source.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    paymentPlanEligibilityRenderData$UiStateData$EligibilityUiData = new PaymentPlanEligibilityRenderData$UiStateData$ConvertedUiData((PaymentPlanEligibilityRenderData.ConvertedUiData) PaymentPlanEligibilityRenderData.ConvertedUiData.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 7:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            zzdxVar = paymentPlanEligibilityRenderData$UiStateData$EligibilityUiData;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentPlanEligibilityRenderData paymentPlanEligibilityRenderData = (PaymentPlanEligibilityRenderData) obj;
        reverseProtoWriter.getClass();
        paymentPlanEligibilityRenderData.getClass();
        reverseProtoWriter.writeBytes(paymentPlanEligibilityRenderData.unknownFields());
        zzdx zzdxVar = paymentPlanEligibilityRenderData.ui_state_data;
        if (zzdxVar instanceof PaymentPlanEligibilityRenderData$UiStateData$EligibilityUiData) {
            PaymentPlanEligibilityRenderData.EligibilityUiData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PaymentPlanEligibilityRenderData$UiStateData$EligibilityUiData) zzdxVar).value);
        } else if (zzdxVar instanceof PaymentPlanEligibilityRenderData$UiStateData$EligibleUiData) {
            PaymentPlanEligibilityRenderData.EligibleUiData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((PaymentPlanEligibilityRenderData$UiStateData$EligibleUiData) zzdxVar).value);
        } else if (zzdxVar instanceof PaymentPlanEligibilityRenderData$UiStateData$ConvertedUiData) {
            PaymentPlanEligibilityRenderData.ConvertedUiData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((PaymentPlanEligibilityRenderData$UiStateData$ConvertedUiData) zzdxVar).value);
        } else if (zzdxVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, paymentPlanEligibilityRenderData.expire_at);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, paymentPlanEligibilityRenderData.is_p2p_eligible_customer);
        PaymentPlanEligibilityRenderData.Source.ADAPTER.encodeWithTag(reverseProtoWriter, 4, paymentPlanEligibilityRenderData.source);
        PaymentPlanEligibilityRenderData.UiState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, paymentPlanEligibilityRenderData.ui_state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PaymentPlanEligibilityRenderData paymentPlanEligibilityRenderData = (PaymentPlanEligibilityRenderData) obj;
        paymentPlanEligibilityRenderData.getClass();
        int encodedSizeWithTag2 = PaymentPlanEligibilityRenderData.UiState.ADAPTER.encodedSizeWithTag(1, paymentPlanEligibilityRenderData.ui_state) + paymentPlanEligibilityRenderData.unknownFields().getSize$okio();
        zzdx zzdxVar = paymentPlanEligibilityRenderData.ui_state_data;
        if (zzdxVar instanceof PaymentPlanEligibilityRenderData$UiStateData$EligibilityUiData) {
            encodedSizeWithTag = PaymentPlanEligibilityRenderData.EligibilityUiData.ADAPTER.encodedSizeWithTag(2, ((PaymentPlanEligibilityRenderData$UiStateData$EligibilityUiData) zzdxVar).value);
        } else if (zzdxVar instanceof PaymentPlanEligibilityRenderData$UiStateData$EligibleUiData) {
            encodedSizeWithTag = PaymentPlanEligibilityRenderData.EligibleUiData.ADAPTER.encodedSizeWithTag(3, ((PaymentPlanEligibilityRenderData$UiStateData$EligibleUiData) zzdxVar).value);
        } else {
            if (!(zzdxVar instanceof PaymentPlanEligibilityRenderData$UiStateData$ConvertedUiData)) {
                if (zzdxVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.INT64.encodedSizeWithTag(7, paymentPlanEligibilityRenderData.expire_at) + ProtoAdapter.BOOL.encodedSizeWithTag(6, paymentPlanEligibilityRenderData.is_p2p_eligible_customer) + PaymentPlanEligibilityRenderData.Source.ADAPTER.encodedSizeWithTag(4, paymentPlanEligibilityRenderData.source) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = PaymentPlanEligibilityRenderData.ConvertedUiData.ADAPTER.encodedSizeWithTag(5, ((PaymentPlanEligibilityRenderData$UiStateData$ConvertedUiData) zzdxVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ProtoAdapter.INT64.encodedSizeWithTag(7, paymentPlanEligibilityRenderData.expire_at) + ProtoAdapter.BOOL.encodedSizeWithTag(6, paymentPlanEligibilityRenderData.is_p2p_eligible_customer) + PaymentPlanEligibilityRenderData.Source.ADAPTER.encodedSizeWithTag(4, paymentPlanEligibilityRenderData.source) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentPlanEligibilityRenderData paymentPlanEligibilityRenderData = (PaymentPlanEligibilityRenderData) obj;
        paymentPlanEligibilityRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        PaymentPlanEligibilityRenderData.UiState uiState = paymentPlanEligibilityRenderData.ui_state;
        zzdx zzdxVar = paymentPlanEligibilityRenderData.ui_state_data;
        PaymentPlanEligibilityRenderData.Source source = paymentPlanEligibilityRenderData.source;
        Boolean bool = paymentPlanEligibilityRenderData.is_p2p_eligible_customer;
        Long l = paymentPlanEligibilityRenderData.expire_at;
        byteString.getClass();
        return new PaymentPlanEligibilityRenderData(uiState, zzdxVar, source, bool, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentPlanEligibilityRenderData paymentPlanEligibilityRenderData = (PaymentPlanEligibilityRenderData) obj;
        paymentPlanEligibilityRenderData.getClass();
        PaymentPlanEligibilityRenderData.UiState.ADAPTER.encodeWithTag(protoWriter, 1, paymentPlanEligibilityRenderData.ui_state);
        PaymentPlanEligibilityRenderData.Source.ADAPTER.encodeWithTag(protoWriter, 4, paymentPlanEligibilityRenderData.source);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, paymentPlanEligibilityRenderData.is_p2p_eligible_customer);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, paymentPlanEligibilityRenderData.expire_at);
        zzdx zzdxVar = paymentPlanEligibilityRenderData.ui_state_data;
        if (zzdxVar instanceof PaymentPlanEligibilityRenderData$UiStateData$EligibilityUiData) {
            PaymentPlanEligibilityRenderData.EligibilityUiData.ADAPTER.encodeWithTag(protoWriter, 2, ((PaymentPlanEligibilityRenderData$UiStateData$EligibilityUiData) zzdxVar).value);
        } else if (zzdxVar instanceof PaymentPlanEligibilityRenderData$UiStateData$EligibleUiData) {
            PaymentPlanEligibilityRenderData.EligibleUiData.ADAPTER.encodeWithTag(protoWriter, 3, ((PaymentPlanEligibilityRenderData$UiStateData$EligibleUiData) zzdxVar).value);
        } else if (zzdxVar instanceof PaymentPlanEligibilityRenderData$UiStateData$ConvertedUiData) {
            PaymentPlanEligibilityRenderData.ConvertedUiData.ADAPTER.encodeWithTag(protoWriter, 5, ((PaymentPlanEligibilityRenderData$UiStateData$ConvertedUiData) zzdxVar).value);
        } else if (zzdxVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(paymentPlanEligibilityRenderData.unknownFields());
    }
}
