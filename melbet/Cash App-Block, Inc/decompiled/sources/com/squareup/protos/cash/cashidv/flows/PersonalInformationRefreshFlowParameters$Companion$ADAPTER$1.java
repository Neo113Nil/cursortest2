package com.squareup.protos.cash.cashidv.flows;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PersonalInformationRefreshFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PersonalInformationRefreshFlowParameters((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PersonalInformationRefreshFlowParameters personalInformationRefreshFlowParameters = (PersonalInformationRefreshFlowParameters) obj;
        reverseProtoWriter.getClass();
        personalInformationRefreshFlowParameters.getClass();
        reverseProtoWriter.writeBytes(personalInformationRefreshFlowParameters.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, personalInformationRefreshFlowParameters.confirm_without_review);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PersonalInformationRefreshFlowParameters personalInformationRefreshFlowParameters = (PersonalInformationRefreshFlowParameters) obj;
        personalInformationRefreshFlowParameters.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, personalInformationRefreshFlowParameters.confirm_without_review) + personalInformationRefreshFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PersonalInformationRefreshFlowParameters personalInformationRefreshFlowParameters = (PersonalInformationRefreshFlowParameters) obj;
        personalInformationRefreshFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = personalInformationRefreshFlowParameters.confirm_without_review;
        byteString.getClass();
        return new PersonalInformationRefreshFlowParameters(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PersonalInformationRefreshFlowParameters personalInformationRefreshFlowParameters = (PersonalInformationRefreshFlowParameters) obj;
        personalInformationRefreshFlowParameters.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, personalInformationRefreshFlowParameters.confirm_without_review);
        protoWriter.writeBytes(personalInformationRefreshFlowParameters.unknownFields());
    }
}
