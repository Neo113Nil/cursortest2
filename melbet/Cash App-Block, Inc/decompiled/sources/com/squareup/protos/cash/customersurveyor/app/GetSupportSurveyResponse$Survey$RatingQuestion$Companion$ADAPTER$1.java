package com.squareup.protos.cash.customersurveyor.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSupportSurveyResponse$Survey$RatingQuestion$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSupportSurveyResponse.Survey.RatingQuestion((String) obj, (GetSupportSurveyResponse.Survey.ReasonList) obj2, (GetSupportSurveyResponse.Survey.ReasonList) obj3, (GetSupportSurveyResponse.Survey.ReasonList) obj4, (GetSupportSurveyResponse.Survey.ReasonList) obj5, (GetSupportSurveyResponse.Survey.ReasonList) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(GetSupportSurveyResponse.Survey.ReasonList.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(GetSupportSurveyResponse.Survey.ReasonList.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(GetSupportSurveyResponse.Survey.ReasonList.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(GetSupportSurveyResponse.Survey.ReasonList.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(GetSupportSurveyResponse.Survey.ReasonList.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSupportSurveyResponse.Survey.RatingQuestion ratingQuestion = (GetSupportSurveyResponse.Survey.RatingQuestion) obj;
        reverseProtoWriter.getClass();
        ratingQuestion.getClass();
        reverseProtoWriter.writeBytes(ratingQuestion.unknownFields());
        ProtoAdapter protoAdapter = GetSupportSurveyResponse.Survey.ReasonList.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, ratingQuestion.five_star_reasons);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, ratingQuestion.four_star_reasons);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, ratingQuestion.three_star_reasons);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, ratingQuestion.two_star_reasons);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, ratingQuestion.one_star_reasons);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, ratingQuestion.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSupportSurveyResponse.Survey.RatingQuestion ratingQuestion = (GetSupportSurveyResponse.Survey.RatingQuestion) obj;
        ratingQuestion.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, ratingQuestion.title) + ratingQuestion.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = GetSupportSurveyResponse.Survey.ReasonList.ADAPTER;
        return protoAdapter.encodedSizeWithTag(6, ratingQuestion.five_star_reasons) + protoAdapter.encodedSizeWithTag(5, ratingQuestion.four_star_reasons) + protoAdapter.encodedSizeWithTag(4, ratingQuestion.three_star_reasons) + protoAdapter.encodedSizeWithTag(3, ratingQuestion.two_star_reasons) + protoAdapter.encodedSizeWithTag(2, ratingQuestion.one_star_reasons) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSupportSurveyResponse.Survey.RatingQuestion ratingQuestion = (GetSupportSurveyResponse.Survey.RatingQuestion) obj;
        ratingQuestion.getClass();
        GetSupportSurveyResponse.Survey.ReasonList reasonList = ratingQuestion.one_star_reasons;
        GetSupportSurveyResponse.Survey.ReasonList reasonList2 = reasonList != null ? (GetSupportSurveyResponse.Survey.ReasonList) GetSupportSurveyResponse.Survey.ReasonList.ADAPTER.redact(reasonList) : null;
        GetSupportSurveyResponse.Survey.ReasonList reasonList3 = ratingQuestion.two_star_reasons;
        GetSupportSurveyResponse.Survey.ReasonList reasonList4 = reasonList3 != null ? (GetSupportSurveyResponse.Survey.ReasonList) GetSupportSurveyResponse.Survey.ReasonList.ADAPTER.redact(reasonList3) : null;
        GetSupportSurveyResponse.Survey.ReasonList reasonList5 = ratingQuestion.three_star_reasons;
        GetSupportSurveyResponse.Survey.ReasonList reasonList6 = reasonList5 != null ? (GetSupportSurveyResponse.Survey.ReasonList) GetSupportSurveyResponse.Survey.ReasonList.ADAPTER.redact(reasonList5) : null;
        GetSupportSurveyResponse.Survey.ReasonList reasonList7 = ratingQuestion.four_star_reasons;
        GetSupportSurveyResponse.Survey.ReasonList reasonList8 = reasonList7 != null ? (GetSupportSurveyResponse.Survey.ReasonList) GetSupportSurveyResponse.Survey.ReasonList.ADAPTER.redact(reasonList7) : null;
        GetSupportSurveyResponse.Survey.ReasonList reasonList9 = ratingQuestion.five_star_reasons;
        GetSupportSurveyResponse.Survey.ReasonList reasonList10 = reasonList9 != null ? (GetSupportSurveyResponse.Survey.ReasonList) GetSupportSurveyResponse.Survey.ReasonList.ADAPTER.redact(reasonList9) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = ratingQuestion.title;
        byteString.getClass();
        return new GetSupportSurveyResponse.Survey.RatingQuestion(str, reasonList2, reasonList4, reasonList6, reasonList8, reasonList10, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSupportSurveyResponse.Survey.RatingQuestion ratingQuestion = (GetSupportSurveyResponse.Survey.RatingQuestion) obj;
        ratingQuestion.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ratingQuestion.title);
        ProtoAdapter protoAdapter = GetSupportSurveyResponse.Survey.ReasonList.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, ratingQuestion.one_star_reasons);
        protoAdapter.encodeWithTag(protoWriter, 3, ratingQuestion.two_star_reasons);
        protoAdapter.encodeWithTag(protoWriter, 4, ratingQuestion.three_star_reasons);
        protoAdapter.encodeWithTag(protoWriter, 5, ratingQuestion.four_star_reasons);
        protoAdapter.encodeWithTag(protoWriter, 6, ratingQuestion.five_star_reasons);
        protoWriter.writeBytes(ratingQuestion.unknownFields());
    }
}
