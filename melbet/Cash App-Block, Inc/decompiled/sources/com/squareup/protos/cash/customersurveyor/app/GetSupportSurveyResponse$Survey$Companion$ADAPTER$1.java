package com.squareup.protos.cash.customersurveyor.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSupportSurveyResponse$Survey$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSupportSurveyResponse.Survey((GetSupportSurveyResponse.Survey.ResolutionQuestion) obj, (GetSupportSurveyResponse.Survey.RatingQuestion) obj2, (String) obj3, (GetSupportSurveyResponse.Survey.SatisfactionQuestion) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GetSupportSurveyResponse.Survey.ResolutionQuestion.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(GetSupportSurveyResponse.Survey.RatingQuestion.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(GetSupportSurveyResponse.Survey.SatisfactionQuestion.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSupportSurveyResponse.Survey survey = (GetSupportSurveyResponse.Survey) obj;
        reverseProtoWriter.getClass();
        survey.getClass();
        reverseProtoWriter.writeBytes(survey.unknownFields());
        GetSupportSurveyResponse.Survey.SatisfactionQuestion.ADAPTER.encodeWithTag(reverseProtoWriter, 4, survey.satisfaction_question);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, survey.free_text_placeholder);
        GetSupportSurveyResponse.Survey.RatingQuestion.ADAPTER.encodeWithTag(reverseProtoWriter, 2, survey.rating_question);
        GetSupportSurveyResponse.Survey.ResolutionQuestion.ADAPTER.encodeWithTag(reverseProtoWriter, 1, survey.resolution_question);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSupportSurveyResponse.Survey survey = (GetSupportSurveyResponse.Survey) obj;
        survey.getClass();
        return GetSupportSurveyResponse.Survey.SatisfactionQuestion.ADAPTER.encodedSizeWithTag(4, survey.satisfaction_question) + ProtoAdapter.STRING.encodedSizeWithTag(3, survey.free_text_placeholder) + GetSupportSurveyResponse.Survey.RatingQuestion.ADAPTER.encodedSizeWithTag(2, survey.rating_question) + GetSupportSurveyResponse.Survey.ResolutionQuestion.ADAPTER.encodedSizeWithTag(1, survey.resolution_question) + survey.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSupportSurveyResponse.Survey survey = (GetSupportSurveyResponse.Survey) obj;
        survey.getClass();
        GetSupportSurveyResponse.Survey.ResolutionQuestion resolutionQuestion = survey.resolution_question;
        GetSupportSurveyResponse.Survey.ResolutionQuestion resolutionQuestion2 = resolutionQuestion != null ? (GetSupportSurveyResponse.Survey.ResolutionQuestion) GetSupportSurveyResponse.Survey.ResolutionQuestion.ADAPTER.redact(resolutionQuestion) : null;
        GetSupportSurveyResponse.Survey.RatingQuestion ratingQuestion = survey.rating_question;
        GetSupportSurveyResponse.Survey.RatingQuestion ratingQuestion2 = ratingQuestion != null ? (GetSupportSurveyResponse.Survey.RatingQuestion) GetSupportSurveyResponse.Survey.RatingQuestion.ADAPTER.redact(ratingQuestion) : null;
        GetSupportSurveyResponse.Survey.SatisfactionQuestion satisfactionQuestion = survey.satisfaction_question;
        GetSupportSurveyResponse.Survey.SatisfactionQuestion satisfactionQuestion2 = satisfactionQuestion != null ? (GetSupportSurveyResponse.Survey.SatisfactionQuestion) GetSupportSurveyResponse.Survey.SatisfactionQuestion.ADAPTER.redact(satisfactionQuestion) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = survey.free_text_placeholder;
        byteString.getClass();
        return new GetSupportSurveyResponse.Survey(resolutionQuestion2, ratingQuestion2, str, satisfactionQuestion2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSupportSurveyResponse.Survey survey = (GetSupportSurveyResponse.Survey) obj;
        survey.getClass();
        GetSupportSurveyResponse.Survey.ResolutionQuestion.ADAPTER.encodeWithTag(protoWriter, 1, survey.resolution_question);
        GetSupportSurveyResponse.Survey.RatingQuestion.ADAPTER.encodeWithTag(protoWriter, 2, survey.rating_question);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, survey.free_text_placeholder);
        GetSupportSurveyResponse.Survey.SatisfactionQuestion.ADAPTER.encodeWithTag(protoWriter, 4, survey.satisfaction_question);
        protoWriter.writeBytes(survey.unknownFields());
    }
}
