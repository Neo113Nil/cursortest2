package com.squareup.protos.cash.investautomator.api.flows;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.plasma.common.CallContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InitiateRoundUpOnboardingFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InitiateRoundUpOnboardingFlowParameters((CallContext) obj, (Automation) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CallContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Automation.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitiateRoundUpOnboardingFlowParameters initiateRoundUpOnboardingFlowParameters = (InitiateRoundUpOnboardingFlowParameters) obj;
        reverseProtoWriter.getClass();
        initiateRoundUpOnboardingFlowParameters.getClass();
        reverseProtoWriter.writeBytes(initiateRoundUpOnboardingFlowParameters.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, initiateRoundUpOnboardingFlowParameters.end_flow);
        Automation.ADAPTER.encodeWithTag(reverseProtoWriter, 2, initiateRoundUpOnboardingFlowParameters.automation);
        CallContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateRoundUpOnboardingFlowParameters.call_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiateRoundUpOnboardingFlowParameters initiateRoundUpOnboardingFlowParameters = (InitiateRoundUpOnboardingFlowParameters) obj;
        initiateRoundUpOnboardingFlowParameters.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, initiateRoundUpOnboardingFlowParameters.end_flow) + Automation.ADAPTER.encodedSizeWithTag(2, initiateRoundUpOnboardingFlowParameters.automation) + CallContext.ADAPTER.encodedSizeWithTag(1, initiateRoundUpOnboardingFlowParameters.call_context) + initiateRoundUpOnboardingFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiateRoundUpOnboardingFlowParameters initiateRoundUpOnboardingFlowParameters = (InitiateRoundUpOnboardingFlowParameters) obj;
        initiateRoundUpOnboardingFlowParameters.getClass();
        CallContext callContext = initiateRoundUpOnboardingFlowParameters.call_context;
        CallContext callContext2 = callContext != null ? (CallContext) CallContext.ADAPTER.redact(callContext) : null;
        Automation automation = initiateRoundUpOnboardingFlowParameters.automation;
        Automation automation2 = automation != null ? (Automation) Automation.ADAPTER.redact(automation) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = initiateRoundUpOnboardingFlowParameters.end_flow;
        byteString.getClass();
        return new InitiateRoundUpOnboardingFlowParameters(callContext2, automation2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiateRoundUpOnboardingFlowParameters initiateRoundUpOnboardingFlowParameters = (InitiateRoundUpOnboardingFlowParameters) obj;
        initiateRoundUpOnboardingFlowParameters.getClass();
        CallContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateRoundUpOnboardingFlowParameters.call_context);
        Automation.ADAPTER.encodeWithTag(protoWriter, 2, initiateRoundUpOnboardingFlowParameters.automation);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, initiateRoundUpOnboardingFlowParameters.end_flow);
        protoWriter.writeBytes(initiateRoundUpOnboardingFlowParameters.unknownFields());
    }
}
