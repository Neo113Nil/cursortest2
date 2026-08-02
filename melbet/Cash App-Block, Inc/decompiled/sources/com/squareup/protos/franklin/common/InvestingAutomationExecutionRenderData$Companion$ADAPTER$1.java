package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.InvestingAutomationExecutionRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvestingAutomationExecutionRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestingAutomationExecutionRenderData(m, (String) obj, (InvestingAutomationFeature) obj2, (Money) obj3, (InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj2 = InvestingAutomationFeature.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestingAutomationExecutionRenderData investingAutomationExecutionRenderData = (InvestingAutomationExecutionRenderData) obj;
        reverseProtoWriter.getClass();
        investingAutomationExecutionRenderData.getClass();
        reverseProtoWriter.writeBytes(investingAutomationExecutionRenderData.unknownFields());
        InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 5, investingAutomationExecutionRenderData.paycheckAllocation);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, investingAutomationExecutionRenderData.total_contributed_execution_amount);
        InvestingAutomationFeature.ADAPTER.encodeWithTag(reverseProtoWriter, 3, investingAutomationExecutionRenderData.feature);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, investingAutomationExecutionRenderData.cancel_deep_link);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, investingAutomationExecutionRenderData.trigger_event_tokens);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestingAutomationExecutionRenderData investingAutomationExecutionRenderData = (InvestingAutomationExecutionRenderData) obj;
        investingAutomationExecutionRenderData.getClass();
        int size$okio = investingAutomationExecutionRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata.ADAPTER.encodedSizeWithTag(5, investingAutomationExecutionRenderData.paycheckAllocation) + Money.ADAPTER.encodedSizeWithTag(4, investingAutomationExecutionRenderData.total_contributed_execution_amount) + InvestingAutomationFeature.ADAPTER.encodedSizeWithTag(3, investingAutomationExecutionRenderData.feature) + protoAdapter.encodedSizeWithTag(2, investingAutomationExecutionRenderData.cancel_deep_link) + protoAdapter.asRepeated().encodedSizeWithTag(1, investingAutomationExecutionRenderData.trigger_event_tokens) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestingAutomationExecutionRenderData investingAutomationExecutionRenderData = (InvestingAutomationExecutionRenderData) obj;
        investingAutomationExecutionRenderData.getClass();
        Money money = investingAutomationExecutionRenderData.total_contributed_execution_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata paycheckAllocationMetadata = investingAutomationExecutionRenderData.paycheckAllocation;
        InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata paycheckAllocationMetadata2 = paycheckAllocationMetadata != null ? (InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata) InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata.ADAPTER.redact(paycheckAllocationMetadata) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = investingAutomationExecutionRenderData.trigger_event_tokens;
        String str = investingAutomationExecutionRenderData.cancel_deep_link;
        InvestingAutomationFeature investingAutomationFeature = investingAutomationExecutionRenderData.feature;
        list.getClass();
        byteString.getClass();
        return new InvestingAutomationExecutionRenderData(list, str, investingAutomationFeature, money2, paycheckAllocationMetadata2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestingAutomationExecutionRenderData investingAutomationExecutionRenderData = (InvestingAutomationExecutionRenderData) obj;
        investingAutomationExecutionRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, investingAutomationExecutionRenderData.trigger_event_tokens);
        protoAdapter.encodeWithTag(protoWriter, 2, investingAutomationExecutionRenderData.cancel_deep_link);
        InvestingAutomationFeature.ADAPTER.encodeWithTag(protoWriter, 3, investingAutomationExecutionRenderData.feature);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, investingAutomationExecutionRenderData.total_contributed_execution_amount);
        InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata.ADAPTER.encodeWithTag(protoWriter, 5, investingAutomationExecutionRenderData.paycheckAllocation);
        protoWriter.writeBytes(investingAutomationExecutionRenderData.unknownFields());
    }
}
