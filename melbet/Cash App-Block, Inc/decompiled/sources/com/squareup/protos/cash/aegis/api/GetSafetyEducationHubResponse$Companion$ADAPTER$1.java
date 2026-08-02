package com.squareup.protos.cash.aegis.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.aegis.core.SafetyEducationHub;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSafetyEducationHubResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSafetyEducationHubResponse((SafetyEducationHub) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SafetyEducationHub.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSafetyEducationHubResponse getSafetyEducationHubResponse = (GetSafetyEducationHubResponse) obj;
        reverseProtoWriter.getClass();
        getSafetyEducationHubResponse.getClass();
        reverseProtoWriter.writeBytes(getSafetyEducationHubResponse.unknownFields());
        SafetyEducationHub.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getSafetyEducationHubResponse.safety_education_hub);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSafetyEducationHubResponse getSafetyEducationHubResponse = (GetSafetyEducationHubResponse) obj;
        getSafetyEducationHubResponse.getClass();
        return SafetyEducationHub.ADAPTER.encodedSizeWithTag(1, getSafetyEducationHubResponse.safety_education_hub) + getSafetyEducationHubResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSafetyEducationHubResponse getSafetyEducationHubResponse = (GetSafetyEducationHubResponse) obj;
        getSafetyEducationHubResponse.getClass();
        SafetyEducationHub safetyEducationHub = getSafetyEducationHubResponse.safety_education_hub;
        SafetyEducationHub safetyEducationHub2 = safetyEducationHub != null ? (SafetyEducationHub) SafetyEducationHub.ADAPTER.redact(safetyEducationHub) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetSafetyEducationHubResponse(safetyEducationHub2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSafetyEducationHubResponse getSafetyEducationHubResponse = (GetSafetyEducationHubResponse) obj;
        getSafetyEducationHubResponse.getClass();
        SafetyEducationHub.ADAPTER.encodeWithTag(protoWriter, 1, getSafetyEducationHubResponse.safety_education_hub);
        protoWriter.writeBytes(getSafetyEducationHubResponse.unknownFields());
    }
}
