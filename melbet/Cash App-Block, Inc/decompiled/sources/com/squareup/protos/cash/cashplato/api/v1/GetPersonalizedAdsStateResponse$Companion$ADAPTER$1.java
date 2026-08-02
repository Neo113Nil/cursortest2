package com.squareup.protos.cash.cashplato.api.v1;

import app.cash.local.viewmodels.sheet.EducationalButtonAction;
import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPersonalizedAdsStateResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        EducationalButtonAction educationalButtonAction = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPersonalizedAdsStateResponse(educationalButtonAction, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                educationalButtonAction = new GetPersonalizedAdsStateResponse$Response$State((GetPersonalizedAdsStateResponse.State) GetPersonalizedAdsStateResponse.State.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                educationalButtonAction = new GetPersonalizedAdsStateResponse$Response$Error((PersonalizedAdsError) PersonalizedAdsError.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPersonalizedAdsStateResponse getPersonalizedAdsStateResponse = (GetPersonalizedAdsStateResponse) obj;
        reverseProtoWriter.getClass();
        getPersonalizedAdsStateResponse.getClass();
        reverseProtoWriter.writeBytes(getPersonalizedAdsStateResponse.unknownFields());
        EducationalButtonAction educationalButtonAction = getPersonalizedAdsStateResponse.response;
        if (educationalButtonAction instanceof GetPersonalizedAdsStateResponse$Response$State) {
            GetPersonalizedAdsStateResponse.State.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetPersonalizedAdsStateResponse$Response$State) educationalButtonAction).value);
        } else if (educationalButtonAction instanceof GetPersonalizedAdsStateResponse$Response$Error) {
            PersonalizedAdsError.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetPersonalizedAdsStateResponse$Response$Error) educationalButtonAction).value);
        } else {
            if (educationalButtonAction == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetPersonalizedAdsStateResponse getPersonalizedAdsStateResponse = (GetPersonalizedAdsStateResponse) obj;
        getPersonalizedAdsStateResponse.getClass();
        int size$okio = getPersonalizedAdsStateResponse.unknownFields().getSize$okio();
        EducationalButtonAction educationalButtonAction = getPersonalizedAdsStateResponse.response;
        if (educationalButtonAction instanceof GetPersonalizedAdsStateResponse$Response$State) {
            encodedSizeWithTag = GetPersonalizedAdsStateResponse.State.ADAPTER.encodedSizeWithTag(1, ((GetPersonalizedAdsStateResponse$Response$State) educationalButtonAction).value);
        } else {
            if (!(educationalButtonAction instanceof GetPersonalizedAdsStateResponse$Response$Error)) {
                if (educationalButtonAction == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = PersonalizedAdsError.ADAPTER.encodedSizeWithTag(2, ((GetPersonalizedAdsStateResponse$Response$Error) educationalButtonAction).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPersonalizedAdsStateResponse getPersonalizedAdsStateResponse = (GetPersonalizedAdsStateResponse) obj;
        getPersonalizedAdsStateResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        EducationalButtonAction educationalButtonAction = getPersonalizedAdsStateResponse.response;
        byteString.getClass();
        return new GetPersonalizedAdsStateResponse(educationalButtonAction, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPersonalizedAdsStateResponse getPersonalizedAdsStateResponse = (GetPersonalizedAdsStateResponse) obj;
        getPersonalizedAdsStateResponse.getClass();
        EducationalButtonAction educationalButtonAction = getPersonalizedAdsStateResponse.response;
        if (educationalButtonAction instanceof GetPersonalizedAdsStateResponse$Response$State) {
            GetPersonalizedAdsStateResponse.State.ADAPTER.encodeWithTag(protoWriter, 1, ((GetPersonalizedAdsStateResponse$Response$State) educationalButtonAction).value);
        } else if (educationalButtonAction instanceof GetPersonalizedAdsStateResponse$Response$Error) {
            PersonalizedAdsError.ADAPTER.encodeWithTag(protoWriter, 2, ((GetPersonalizedAdsStateResponse$Response$Error) educationalButtonAction).value);
        } else if (educationalButtonAction != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getPersonalizedAdsStateResponse.unknownFields());
    }
}
