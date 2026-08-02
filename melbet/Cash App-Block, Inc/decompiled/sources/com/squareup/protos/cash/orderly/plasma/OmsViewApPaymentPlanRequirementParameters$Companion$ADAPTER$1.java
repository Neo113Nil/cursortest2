package com.squareup.protos.cash.orderly.plasma;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OmsViewApPaymentPlanRequirementParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OmsViewApPaymentPlanRequirementParameters((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OmsViewApPaymentPlanRequirementParameters omsViewApPaymentPlanRequirementParameters = (OmsViewApPaymentPlanRequirementParameters) obj;
        reverseProtoWriter.getClass();
        omsViewApPaymentPlanRequirementParameters.getClass();
        reverseProtoWriter.writeBytes(omsViewApPaymentPlanRequirementParameters.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, omsViewApPaymentPlanRequirementParameters.loan_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, omsViewApPaymentPlanRequirementParameters.order_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OmsViewApPaymentPlanRequirementParameters omsViewApPaymentPlanRequirementParameters = (OmsViewApPaymentPlanRequirementParameters) obj;
        omsViewApPaymentPlanRequirementParameters.getClass();
        int size$okio = omsViewApPaymentPlanRequirementParameters.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, omsViewApPaymentPlanRequirementParameters.loan_id) + protoAdapter.encodedSizeWithTag(1, omsViewApPaymentPlanRequirementParameters.order_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OmsViewApPaymentPlanRequirementParameters omsViewApPaymentPlanRequirementParameters = (OmsViewApPaymentPlanRequirementParameters) obj;
        omsViewApPaymentPlanRequirementParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = omsViewApPaymentPlanRequirementParameters.order_id;
        String str2 = omsViewApPaymentPlanRequirementParameters.loan_id;
        byteString.getClass();
        return new OmsViewApPaymentPlanRequirementParameters(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OmsViewApPaymentPlanRequirementParameters omsViewApPaymentPlanRequirementParameters = (OmsViewApPaymentPlanRequirementParameters) obj;
        omsViewApPaymentPlanRequirementParameters.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, omsViewApPaymentPlanRequirementParameters.order_id);
        protoAdapter.encodeWithTag(protoWriter, 2, omsViewApPaymentPlanRequirementParameters.loan_id);
        protoWriter.writeBytes(omsViewApPaymentPlanRequirementParameters.unknownFields());
    }
}
