package com.squareup.protos.cash.customersurveyor.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SubmitSupportSurveyResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitSupportSurveyResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitSupportSurveyResponse submitSupportSurveyResponse = (SubmitSupportSurveyResponse) obj;
        reverseProtoWriter.getClass();
        submitSupportSurveyResponse.getClass();
        reverseProtoWriter.writeBytes(submitSupportSurveyResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitSupportSurveyResponse submitSupportSurveyResponse = (SubmitSupportSurveyResponse) obj;
        submitSupportSurveyResponse.getClass();
        return submitSupportSurveyResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SubmitSupportSurveyResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitSupportSurveyResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitSupportSurveyResponse submitSupportSurveyResponse = (SubmitSupportSurveyResponse) obj;
        submitSupportSurveyResponse.getClass();
        protoWriter.writeBytes(submitSupportSurveyResponse.unknownFields());
    }
}
