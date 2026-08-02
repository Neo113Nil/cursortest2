package com.squareup.protos.cash.cashplato.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.consentsys.service.CopyParameters;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPersonalizedAdsStateRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPersonalizedAdsStateRequest((CopyParameters) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CopyParameters.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPersonalizedAdsStateRequest getPersonalizedAdsStateRequest = (GetPersonalizedAdsStateRequest) obj;
        reverseProtoWriter.getClass();
        getPersonalizedAdsStateRequest.getClass();
        reverseProtoWriter.writeBytes(getPersonalizedAdsStateRequest.unknownFields());
        CopyParameters.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getPersonalizedAdsStateRequest.copy_parameters);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPersonalizedAdsStateRequest getPersonalizedAdsStateRequest = (GetPersonalizedAdsStateRequest) obj;
        getPersonalizedAdsStateRequest.getClass();
        return CopyParameters.ADAPTER.encodedSizeWithTag(1, getPersonalizedAdsStateRequest.copy_parameters) + getPersonalizedAdsStateRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPersonalizedAdsStateRequest getPersonalizedAdsStateRequest = (GetPersonalizedAdsStateRequest) obj;
        getPersonalizedAdsStateRequest.getClass();
        CopyParameters copyParameters = getPersonalizedAdsStateRequest.copy_parameters;
        CopyParameters copyParameters2 = copyParameters != null ? (CopyParameters) CopyParameters.ADAPTER.redact(copyParameters) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPersonalizedAdsStateRequest(copyParameters2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPersonalizedAdsStateRequest getPersonalizedAdsStateRequest = (GetPersonalizedAdsStateRequest) obj;
        getPersonalizedAdsStateRequest.getClass();
        CopyParameters.ADAPTER.encodeWithTag(protoWriter, 1, getPersonalizedAdsStateRequest.copy_parameters);
        protoWriter.writeBytes(getPersonalizedAdsStateRequest.unknownFields());
    }
}
