package com.squareup.protos.cash.customersurveyor.app;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSupportSurveyResponse$Survey$ReasonList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSupportSurveyResponse.Survey.ReasonList((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSupportSurveyResponse.Survey.ReasonList reasonList = (GetSupportSurveyResponse.Survey.ReasonList) obj;
        reverseProtoWriter.getClass();
        reasonList.getClass();
        reverseProtoWriter.writeBytes(reasonList.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, reasonList.reasons);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, reasonList.prompt);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSupportSurveyResponse.Survey.ReasonList reasonList = (GetSupportSurveyResponse.Survey.ReasonList) obj;
        reasonList.getClass();
        int size$okio = reasonList.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, reasonList.reasons) + protoAdapter.encodedSizeWithTag(1, reasonList.prompt) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSupportSurveyResponse.Survey.ReasonList reasonList = (GetSupportSurveyResponse.Survey.ReasonList) obj;
        reasonList.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = reasonList.prompt;
        List list = reasonList.reasons;
        list.getClass();
        byteString.getClass();
        return new GetSupportSurveyResponse.Survey.ReasonList(str, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSupportSurveyResponse.Survey.ReasonList reasonList = (GetSupportSurveyResponse.Survey.ReasonList) obj;
        reasonList.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, reasonList.prompt);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, reasonList.reasons);
        protoWriter.writeBytes(reasonList.unknownFields());
    }
}
