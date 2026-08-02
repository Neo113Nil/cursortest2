package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentPlanEligibilityRenderData$ConvertedUiData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentPlanEligibilityRenderData.ConvertedUiData((String) obj, (Money) obj2, (Money) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentPlanEligibilityRenderData.ConvertedUiData convertedUiData = (PaymentPlanEligibilityRenderData.ConvertedUiData) obj;
        reverseProtoWriter.getClass();
        convertedUiData.getClass();
        reverseProtoWriter.writeBytes(convertedUiData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, convertedUiData.order_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, convertedUiData.loan_token);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, convertedUiData.drawdown_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, convertedUiData.downpayment_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, convertedUiData.start_plasma_flow_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentPlanEligibilityRenderData.ConvertedUiData convertedUiData = (PaymentPlanEligibilityRenderData.ConvertedUiData) obj;
        convertedUiData.getClass();
        int size$okio = convertedUiData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, convertedUiData.start_plasma_flow_url) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, convertedUiData.order_id) + protoAdapter.encodedSizeWithTag(4, convertedUiData.loan_token) + protoAdapter2.encodedSizeWithTag(3, convertedUiData.drawdown_amount) + protoAdapter2.encodedSizeWithTag(2, convertedUiData.downpayment_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentPlanEligibilityRenderData.ConvertedUiData convertedUiData = (PaymentPlanEligibilityRenderData.ConvertedUiData) obj;
        convertedUiData.getClass();
        Money money = convertedUiData.downpayment_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = convertedUiData.drawdown_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = convertedUiData.start_plasma_flow_url;
        String str2 = convertedUiData.loan_token;
        String str3 = convertedUiData.order_id;
        byteString.getClass();
        return new PaymentPlanEligibilityRenderData.ConvertedUiData(str, money2, money4, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentPlanEligibilityRenderData.ConvertedUiData convertedUiData = (PaymentPlanEligibilityRenderData.ConvertedUiData) obj;
        convertedUiData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, convertedUiData.start_plasma_flow_url);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, convertedUiData.downpayment_amount);
        protoAdapter2.encodeWithTag(protoWriter, 3, convertedUiData.drawdown_amount);
        protoAdapter.encodeWithTag(protoWriter, 4, convertedUiData.loan_token);
        protoAdapter.encodeWithTag(protoWriter, 5, convertedUiData.order_id);
        protoWriter.writeBytes(convertedUiData.unknownFields());
    }
}
