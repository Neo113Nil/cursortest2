package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitBlockerResponse$FlowResponseContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitBlockerResponse.FlowResponseContext((ScenarioPlan) obj, (StatusResult) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ScenarioPlan.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitBlockerResponse.FlowResponseContext flowResponseContext = (SubmitBlockerResponse.FlowResponseContext) obj;
        reverseProtoWriter.getClass();
        flowResponseContext.getClass();
        reverseProtoWriter.writeBytes(flowResponseContext.unknownFields());
        StatusResult.ADAPTER.encodeWithTag(reverseProtoWriter, 2, flowResponseContext.status_result);
        ScenarioPlan.ADAPTER.encodeWithTag(reverseProtoWriter, 1, flowResponseContext.scenario_plan);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitBlockerResponse.FlowResponseContext flowResponseContext = (SubmitBlockerResponse.FlowResponseContext) obj;
        flowResponseContext.getClass();
        return StatusResult.ADAPTER.encodedSizeWithTag(2, flowResponseContext.status_result) + ScenarioPlan.ADAPTER.encodedSizeWithTag(1, flowResponseContext.scenario_plan) + flowResponseContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitBlockerResponse.FlowResponseContext flowResponseContext = (SubmitBlockerResponse.FlowResponseContext) obj;
        flowResponseContext.getClass();
        ScenarioPlan scenarioPlan = flowResponseContext.scenario_plan;
        ScenarioPlan scenarioPlan2 = scenarioPlan != null ? (ScenarioPlan) ScenarioPlan.ADAPTER.redact(scenarioPlan) : null;
        StatusResult statusResult = flowResponseContext.status_result;
        StatusResult statusResult2 = statusResult != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitBlockerResponse.FlowResponseContext(scenarioPlan2, statusResult2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitBlockerResponse.FlowResponseContext flowResponseContext = (SubmitBlockerResponse.FlowResponseContext) obj;
        flowResponseContext.getClass();
        ScenarioPlan.ADAPTER.encodeWithTag(protoWriter, 1, flowResponseContext.scenario_plan);
        StatusResult.ADAPTER.encodeWithTag(protoWriter, 2, flowResponseContext.status_result);
        protoWriter.writeBytes(flowResponseContext.unknownFields());
    }
}
