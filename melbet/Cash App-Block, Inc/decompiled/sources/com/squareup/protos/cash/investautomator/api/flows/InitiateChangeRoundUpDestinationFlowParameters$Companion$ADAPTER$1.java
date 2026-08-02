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
public final class InitiateChangeRoundUpDestinationFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiateChangeRoundUpDestinationFlowParameters((CallContext) obj, (Automation) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CallContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Automation.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitiateChangeRoundUpDestinationFlowParameters initiateChangeRoundUpDestinationFlowParameters = (InitiateChangeRoundUpDestinationFlowParameters) obj;
        reverseProtoWriter.getClass();
        initiateChangeRoundUpDestinationFlowParameters.getClass();
        reverseProtoWriter.writeBytes(initiateChangeRoundUpDestinationFlowParameters.unknownFields());
        Automation.ADAPTER.encodeWithTag(reverseProtoWriter, 2, initiateChangeRoundUpDestinationFlowParameters.automation);
        CallContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateChangeRoundUpDestinationFlowParameters.call_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiateChangeRoundUpDestinationFlowParameters initiateChangeRoundUpDestinationFlowParameters = (InitiateChangeRoundUpDestinationFlowParameters) obj;
        initiateChangeRoundUpDestinationFlowParameters.getClass();
        return Automation.ADAPTER.encodedSizeWithTag(2, initiateChangeRoundUpDestinationFlowParameters.automation) + CallContext.ADAPTER.encodedSizeWithTag(1, initiateChangeRoundUpDestinationFlowParameters.call_context) + initiateChangeRoundUpDestinationFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiateChangeRoundUpDestinationFlowParameters initiateChangeRoundUpDestinationFlowParameters = (InitiateChangeRoundUpDestinationFlowParameters) obj;
        initiateChangeRoundUpDestinationFlowParameters.getClass();
        CallContext callContext = initiateChangeRoundUpDestinationFlowParameters.call_context;
        CallContext callContext2 = callContext != null ? (CallContext) CallContext.ADAPTER.redact(callContext) : null;
        Automation automation = initiateChangeRoundUpDestinationFlowParameters.automation;
        Automation automation2 = automation != null ? (Automation) Automation.ADAPTER.redact(automation) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InitiateChangeRoundUpDestinationFlowParameters(callContext2, automation2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiateChangeRoundUpDestinationFlowParameters initiateChangeRoundUpDestinationFlowParameters = (InitiateChangeRoundUpDestinationFlowParameters) obj;
        initiateChangeRoundUpDestinationFlowParameters.getClass();
        CallContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateChangeRoundUpDestinationFlowParameters.call_context);
        Automation.ADAPTER.encodeWithTag(protoWriter, 2, initiateChangeRoundUpDestinationFlowParameters.automation);
        protoWriter.writeBytes(initiateChangeRoundUpDestinationFlowParameters.unknownFields());
    }
}
