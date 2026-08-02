package com.squareup.protos.cash.customersurveyor.app;

import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSupportSurveyResponse$Survey$ResolutionQuestion$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSupportSurveyResponse.Survey.ResolutionQuestion((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetSupportSurveyResponse.Survey.ResolutionQuestion resolutionQuestion = (GetSupportSurveyResponse.Survey.ResolutionQuestion) obj;
        reverseProtoWriter.getClass();
        resolutionQuestion.getClass();
        reverseProtoWriter.writeBytes(resolutionQuestion.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, resolutionQuestion.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, resolutionQuestion.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSupportSurveyResponse.Survey.ResolutionQuestion resolutionQuestion = (GetSupportSurveyResponse.Survey.ResolutionQuestion) obj;
        resolutionQuestion.getClass();
        int size$okio = resolutionQuestion.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, resolutionQuestion.subtitle) + protoAdapter.encodedSizeWithTag(1, resolutionQuestion.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSupportSurveyResponse.Survey.ResolutionQuestion resolutionQuestion = (GetSupportSurveyResponse.Survey.ResolutionQuestion) obj;
        resolutionQuestion.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = resolutionQuestion.title;
        String str2 = resolutionQuestion.subtitle;
        byteString.getClass();
        return new GetSupportSurveyResponse.Survey.ResolutionQuestion(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSupportSurveyResponse.Survey.ResolutionQuestion resolutionQuestion = (GetSupportSurveyResponse.Survey.ResolutionQuestion) obj;
        resolutionQuestion.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, resolutionQuestion.title);
        protoAdapter.encodeWithTag(protoWriter, 2, resolutionQuestion.subtitle);
        protoWriter.writeBytes(resolutionQuestion.unknownFields());
    }
}
