package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayOrderRenderData$RetroEligibility$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayOrderRenderData.RetroEligibility((CashAppPayOrderRenderData.RetroEligibility.UiState) obj, (CashAppPayOrderRenderData.RetroEligibility.EligibleData) obj2, (CashAppPayOrderRenderData.RetroEligibility.ConvertedData) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CashAppPayOrderRenderData.RetroEligibility.UiState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CashAppPayOrderRenderData.RetroEligibility.EligibleData.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(CashAppPayOrderRenderData.RetroEligibility.ConvertedData.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayOrderRenderData.RetroEligibility retroEligibility = (CashAppPayOrderRenderData.RetroEligibility) obj;
        reverseProtoWriter.getClass();
        retroEligibility.getClass();
        reverseProtoWriter.writeBytes(retroEligibility.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, retroEligibility.expire_at);
        CashAppPayOrderRenderData.RetroEligibility.ConvertedData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, retroEligibility.converted_data);
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, retroEligibility.eligible_data);
        CashAppPayOrderRenderData.RetroEligibility.UiState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, retroEligibility.ui_state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayOrderRenderData.RetroEligibility retroEligibility = (CashAppPayOrderRenderData.RetroEligibility) obj;
        retroEligibility.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(4, retroEligibility.expire_at) + CashAppPayOrderRenderData.RetroEligibility.ConvertedData.ADAPTER.encodedSizeWithTag(3, retroEligibility.converted_data) + CashAppPayOrderRenderData.RetroEligibility.EligibleData.ADAPTER.encodedSizeWithTag(2, retroEligibility.eligible_data) + CashAppPayOrderRenderData.RetroEligibility.UiState.ADAPTER.encodedSizeWithTag(1, retroEligibility.ui_state) + retroEligibility.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayOrderRenderData.RetroEligibility retroEligibility = (CashAppPayOrderRenderData.RetroEligibility) obj;
        retroEligibility.getClass();
        CashAppPayOrderRenderData.RetroEligibility.EligibleData eligibleData = retroEligibility.eligible_data;
        CashAppPayOrderRenderData.RetroEligibility.EligibleData eligibleData2 = eligibleData != null ? (CashAppPayOrderRenderData.RetroEligibility.EligibleData) CashAppPayOrderRenderData.RetroEligibility.EligibleData.ADAPTER.redact(eligibleData) : null;
        CashAppPayOrderRenderData.RetroEligibility.ConvertedData convertedData = retroEligibility.converted_data;
        CashAppPayOrderRenderData.RetroEligibility.ConvertedData convertedData2 = convertedData != null ? (CashAppPayOrderRenderData.RetroEligibility.ConvertedData) CashAppPayOrderRenderData.RetroEligibility.ConvertedData.ADAPTER.redact(convertedData) : null;
        ByteString byteString = ByteString.EMPTY;
        CashAppPayOrderRenderData.RetroEligibility.UiState uiState = retroEligibility.ui_state;
        Long l = retroEligibility.expire_at;
        byteString.getClass();
        return new CashAppPayOrderRenderData.RetroEligibility(uiState, eligibleData2, convertedData2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayOrderRenderData.RetroEligibility retroEligibility = (CashAppPayOrderRenderData.RetroEligibility) obj;
        retroEligibility.getClass();
        CashAppPayOrderRenderData.RetroEligibility.UiState.ADAPTER.encodeWithTag(protoWriter, 1, retroEligibility.ui_state);
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.ADAPTER.encodeWithTag(protoWriter, 2, retroEligibility.eligible_data);
        CashAppPayOrderRenderData.RetroEligibility.ConvertedData.ADAPTER.encodeWithTag(protoWriter, 3, retroEligibility.converted_data);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, retroEligibility.expire_at);
        protoWriter.writeBytes(retroEligibility.unknownFields());
    }
}
