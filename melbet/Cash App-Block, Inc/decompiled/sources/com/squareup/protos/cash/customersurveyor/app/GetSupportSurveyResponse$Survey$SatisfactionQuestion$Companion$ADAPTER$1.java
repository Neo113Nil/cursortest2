package com.squareup.protos.cash.customersurveyor.app;

import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSupportSurveyResponse$Survey$SatisfactionQuestion$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSupportSurveyResponse.Survey.SatisfactionQuestion((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSupportSurveyResponse.Survey.SatisfactionQuestion satisfactionQuestion = (GetSupportSurveyResponse.Survey.SatisfactionQuestion) obj;
        reverseProtoWriter.getClass();
        satisfactionQuestion.getClass();
        reverseProtoWriter.writeBytes(satisfactionQuestion.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, satisfactionQuestion.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSupportSurveyResponse.Survey.SatisfactionQuestion satisfactionQuestion = (GetSupportSurveyResponse.Survey.SatisfactionQuestion) obj;
        satisfactionQuestion.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, satisfactionQuestion.title) + satisfactionQuestion.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSupportSurveyResponse.Survey.SatisfactionQuestion satisfactionQuestion = (GetSupportSurveyResponse.Survey.SatisfactionQuestion) obj;
        satisfactionQuestion.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = satisfactionQuestion.title;
        byteString.getClass();
        return new GetSupportSurveyResponse.Survey.SatisfactionQuestion(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSupportSurveyResponse.Survey.SatisfactionQuestion satisfactionQuestion = (GetSupportSurveyResponse.Survey.SatisfactionQuestion) obj;
        satisfactionQuestion.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, satisfactionQuestion.title);
        protoWriter.writeBytes(satisfactionQuestion.unknownFields());
    }
}
