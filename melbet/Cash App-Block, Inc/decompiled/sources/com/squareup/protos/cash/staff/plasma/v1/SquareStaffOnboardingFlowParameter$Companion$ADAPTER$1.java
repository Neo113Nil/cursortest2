package com.squareup.protos.cash.staff.plasma.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SquareStaffOnboardingFlowParameter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SquareStaffOnboardingFlowParameter((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SquareStaffOnboardingFlowParameter squareStaffOnboardingFlowParameter = (SquareStaffOnboardingFlowParameter) obj;
        reverseProtoWriter.getClass();
        squareStaffOnboardingFlowParameter.getClass();
        reverseProtoWriter.writeBytes(squareStaffOnboardingFlowParameter.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, squareStaffOnboardingFlowParameter.selected_customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, squareStaffOnboardingFlowParameter.invitation_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SquareStaffOnboardingFlowParameter squareStaffOnboardingFlowParameter = (SquareStaffOnboardingFlowParameter) obj;
        squareStaffOnboardingFlowParameter.getClass();
        int size$okio = squareStaffOnboardingFlowParameter.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, squareStaffOnboardingFlowParameter.selected_customer_token) + protoAdapter.encodedSizeWithTag(1, squareStaffOnboardingFlowParameter.invitation_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SquareStaffOnboardingFlowParameter) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SquareStaffOnboardingFlowParameter(null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SquareStaffOnboardingFlowParameter squareStaffOnboardingFlowParameter = (SquareStaffOnboardingFlowParameter) obj;
        squareStaffOnboardingFlowParameter.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, squareStaffOnboardingFlowParameter.invitation_token);
        protoAdapter.encodeWithTag(protoWriter, 2, squareStaffOnboardingFlowParameter.selected_customer_token);
        protoWriter.writeBytes(squareStaffOnboardingFlowParameter.unknownFields());
    }
}
