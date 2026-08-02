package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.InvestingAutomationTriggerRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvestingAutomationTriggerRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InvestingAutomationTriggerRenderData((String) obj, (Money) obj2, (InvestingAutomationTriggerRenderData.ExecutionFailureReason) obj3, (Boolean) obj4, (InvestingAutomationFeature) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = InvestingAutomationTriggerRenderData.ExecutionFailureReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = InvestingAutomationFeature.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestingAutomationTriggerRenderData investingAutomationTriggerRenderData = (InvestingAutomationTriggerRenderData) obj;
        reverseProtoWriter.getClass();
        investingAutomationTriggerRenderData.getClass();
        reverseProtoWriter.writeBytes(investingAutomationTriggerRenderData.unknownFields());
        InvestingAutomationFeature.ADAPTER.encodeWithTag(reverseProtoWriter, 5, investingAutomationTriggerRenderData.feature);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, investingAutomationTriggerRenderData.automation_activated);
        InvestingAutomationTriggerRenderData.ExecutionFailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 3, investingAutomationTriggerRenderData.execution_failure_reason);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, investingAutomationTriggerRenderData.contributed_execution_amount);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, investingAutomationTriggerRenderData.execution_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestingAutomationTriggerRenderData investingAutomationTriggerRenderData = (InvestingAutomationTriggerRenderData) obj;
        investingAutomationTriggerRenderData.getClass();
        return InvestingAutomationFeature.ADAPTER.encodedSizeWithTag(5, investingAutomationTriggerRenderData.feature) + ProtoAdapter.BOOL.encodedSizeWithTag(4, investingAutomationTriggerRenderData.automation_activated) + InvestingAutomationTriggerRenderData.ExecutionFailureReason.ADAPTER.encodedSizeWithTag(3, investingAutomationTriggerRenderData.execution_failure_reason) + Money.ADAPTER.encodedSizeWithTag(2, investingAutomationTriggerRenderData.contributed_execution_amount) + ProtoAdapter.STRING.encodedSizeWithTag(1, investingAutomationTriggerRenderData.execution_token) + investingAutomationTriggerRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestingAutomationTriggerRenderData investingAutomationTriggerRenderData = (InvestingAutomationTriggerRenderData) obj;
        investingAutomationTriggerRenderData.getClass();
        Money money = investingAutomationTriggerRenderData.contributed_execution_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = investingAutomationTriggerRenderData.execution_token;
        InvestingAutomationTriggerRenderData.ExecutionFailureReason executionFailureReason = investingAutomationTriggerRenderData.execution_failure_reason;
        Boolean bool = investingAutomationTriggerRenderData.automation_activated;
        InvestingAutomationFeature investingAutomationFeature = investingAutomationTriggerRenderData.feature;
        byteString.getClass();
        return new InvestingAutomationTriggerRenderData(str, money2, executionFailureReason, bool, investingAutomationFeature, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestingAutomationTriggerRenderData investingAutomationTriggerRenderData = (InvestingAutomationTriggerRenderData) obj;
        investingAutomationTriggerRenderData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, investingAutomationTriggerRenderData.execution_token);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, investingAutomationTriggerRenderData.contributed_execution_amount);
        InvestingAutomationTriggerRenderData.ExecutionFailureReason.ADAPTER.encodeWithTag(protoWriter, 3, investingAutomationTriggerRenderData.execution_failure_reason);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, investingAutomationTriggerRenderData.automation_activated);
        InvestingAutomationFeature.ADAPTER.encodeWithTag(protoWriter, 5, investingAutomationTriggerRenderData.feature);
        protoWriter.writeBytes(investingAutomationTriggerRenderData.unknownFields());
    }
}
