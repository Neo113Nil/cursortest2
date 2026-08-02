package com.squareup.protos.cash.customersurveyor.app;

import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSupportSurveyResponse$AlreadySubmitted$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSupportSurveyResponse.AlreadySubmitted(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSupportSurveyResponse.AlreadySubmitted alreadySubmitted = (GetSupportSurveyResponse.AlreadySubmitted) obj;
        reverseProtoWriter.getClass();
        alreadySubmitted.getClass();
        reverseProtoWriter.writeBytes(alreadySubmitted.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSupportSurveyResponse.AlreadySubmitted alreadySubmitted = (GetSupportSurveyResponse.AlreadySubmitted) obj;
        alreadySubmitted.getClass();
        return alreadySubmitted.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((GetSupportSurveyResponse.AlreadySubmitted) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetSupportSurveyResponse.AlreadySubmitted(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSupportSurveyResponse.AlreadySubmitted alreadySubmitted = (GetSupportSurveyResponse.AlreadySubmitted) obj;
        alreadySubmitted.getClass();
        protoWriter.writeBytes(alreadySubmitted.unknownFields());
    }
}
