package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.InvestingAutomationExecutionRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvestingAutomationExecutionRenderData$PaycheckAllocationMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata((Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata paycheckAllocationMetadata = (InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata) obj;
        reverseProtoWriter.getClass();
        paycheckAllocationMetadata.getClass();
        reverseProtoWriter.writeBytes(paycheckAllocationMetadata.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, paycheckAllocationMetadata.percentage);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata paycheckAllocationMetadata = (InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata) obj;
        paycheckAllocationMetadata.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(1, paycheckAllocationMetadata.percentage) + paycheckAllocationMetadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata paycheckAllocationMetadata = (InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata) obj;
        paycheckAllocationMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = paycheckAllocationMetadata.percentage;
        byteString.getClass();
        return new InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata(num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata paycheckAllocationMetadata = (InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata) obj;
        paycheckAllocationMetadata.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, paycheckAllocationMetadata.percentage);
        protoWriter.writeBytes(paycheckAllocationMetadata.unknownFields());
    }
}
