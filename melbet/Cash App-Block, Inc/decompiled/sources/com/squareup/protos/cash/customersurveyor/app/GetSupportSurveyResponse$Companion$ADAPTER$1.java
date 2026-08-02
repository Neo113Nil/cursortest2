package com.squareup.protos.cash.customersurveyor.app;

import app.cash.zipline.loader.LoaderJniKt;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSupportSurveyResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        LoaderJniKt loaderJniKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSupportSurveyResponse(loaderJniKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                loaderJniKt = new GetSupportSurveyResponse$Result$AlreadySubmitted((GetSupportSurveyResponse.AlreadySubmitted) GetSupportSurveyResponse.AlreadySubmitted.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                loaderJniKt = new GetSupportSurveyResponse$Result$Survey((GetSupportSurveyResponse.Survey) GetSupportSurveyResponse.Survey.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSupportSurveyResponse getSupportSurveyResponse = (GetSupportSurveyResponse) obj;
        reverseProtoWriter.getClass();
        getSupportSurveyResponse.getClass();
        reverseProtoWriter.writeBytes(getSupportSurveyResponse.unknownFields());
        LoaderJniKt loaderJniKt = getSupportSurveyResponse.result;
        if (loaderJniKt instanceof GetSupportSurveyResponse$Result$AlreadySubmitted) {
            GetSupportSurveyResponse.AlreadySubmitted.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetSupportSurveyResponse$Result$AlreadySubmitted) loaderJniKt).value);
        } else if (loaderJniKt instanceof GetSupportSurveyResponse$Result$Survey) {
            GetSupportSurveyResponse.Survey.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetSupportSurveyResponse$Result$Survey) loaderJniKt).value);
        } else {
            if (loaderJniKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetSupportSurveyResponse getSupportSurveyResponse = (GetSupportSurveyResponse) obj;
        getSupportSurveyResponse.getClass();
        int size$okio = getSupportSurveyResponse.unknownFields().getSize$okio();
        LoaderJniKt loaderJniKt = getSupportSurveyResponse.result;
        if (loaderJniKt instanceof GetSupportSurveyResponse$Result$AlreadySubmitted) {
            encodedSizeWithTag = GetSupportSurveyResponse.AlreadySubmitted.ADAPTER.encodedSizeWithTag(1, ((GetSupportSurveyResponse$Result$AlreadySubmitted) loaderJniKt).value);
        } else {
            if (!(loaderJniKt instanceof GetSupportSurveyResponse$Result$Survey)) {
                if (loaderJniKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GetSupportSurveyResponse.Survey.ADAPTER.encodedSizeWithTag(2, ((GetSupportSurveyResponse$Result$Survey) loaderJniKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSupportSurveyResponse getSupportSurveyResponse = (GetSupportSurveyResponse) obj;
        getSupportSurveyResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        LoaderJniKt loaderJniKt = getSupportSurveyResponse.result;
        byteString.getClass();
        return new GetSupportSurveyResponse(loaderJniKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSupportSurveyResponse getSupportSurveyResponse = (GetSupportSurveyResponse) obj;
        getSupportSurveyResponse.getClass();
        LoaderJniKt loaderJniKt = getSupportSurveyResponse.result;
        if (loaderJniKt instanceof GetSupportSurveyResponse$Result$AlreadySubmitted) {
            GetSupportSurveyResponse.AlreadySubmitted.ADAPTER.encodeWithTag(protoWriter, 1, ((GetSupportSurveyResponse$Result$AlreadySubmitted) loaderJniKt).value);
        } else if (loaderJniKt instanceof GetSupportSurveyResponse$Result$Survey) {
            GetSupportSurveyResponse.Survey.ADAPTER.encodeWithTag(protoWriter, 2, ((GetSupportSurveyResponse$Result$Survey) loaderJniKt).value);
        } else if (loaderJniKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getSupportSurveyResponse.unknownFields());
    }
}
