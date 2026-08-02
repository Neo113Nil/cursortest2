package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzij;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSuggestedReordersResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzij zzijVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSuggestedReordersResponse(zzijVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzijVar = new GetSuggestedReordersResponse$Response$SuggestedReorders((GetSuggestedReordersResponse.SuggestedReorders) GetSuggestedReordersResponse.SuggestedReorders.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzijVar = new GetSuggestedReordersResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSuggestedReordersResponse getSuggestedReordersResponse = (GetSuggestedReordersResponse) obj;
        reverseProtoWriter.getClass();
        getSuggestedReordersResponse.getClass();
        reverseProtoWriter.writeBytes(getSuggestedReordersResponse.unknownFields());
        zzij zzijVar = getSuggestedReordersResponse.response;
        if (zzijVar instanceof GetSuggestedReordersResponse$Response$SuggestedReorders) {
            GetSuggestedReordersResponse.SuggestedReorders.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetSuggestedReordersResponse$Response$SuggestedReorders) zzijVar).value);
        } else if (zzijVar instanceof GetSuggestedReordersResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetSuggestedReordersResponse$Response$ErrorResponse) zzijVar).value);
        } else {
            if (zzijVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetSuggestedReordersResponse getSuggestedReordersResponse = (GetSuggestedReordersResponse) obj;
        getSuggestedReordersResponse.getClass();
        int size$okio = getSuggestedReordersResponse.unknownFields().getSize$okio();
        zzij zzijVar = getSuggestedReordersResponse.response;
        if (zzijVar instanceof GetSuggestedReordersResponse$Response$SuggestedReorders) {
            encodedSizeWithTag = GetSuggestedReordersResponse.SuggestedReorders.ADAPTER.encodedSizeWithTag(1, ((GetSuggestedReordersResponse$Response$SuggestedReorders) zzijVar).value);
        } else {
            if (!(zzijVar instanceof GetSuggestedReordersResponse$Response$ErrorResponse)) {
                if (zzijVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((GetSuggestedReordersResponse$Response$ErrorResponse) zzijVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSuggestedReordersResponse getSuggestedReordersResponse = (GetSuggestedReordersResponse) obj;
        getSuggestedReordersResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzij zzijVar = getSuggestedReordersResponse.response;
        byteString.getClass();
        return new GetSuggestedReordersResponse(zzijVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSuggestedReordersResponse getSuggestedReordersResponse = (GetSuggestedReordersResponse) obj;
        getSuggestedReordersResponse.getClass();
        zzij zzijVar = getSuggestedReordersResponse.response;
        if (zzijVar instanceof GetSuggestedReordersResponse$Response$SuggestedReorders) {
            GetSuggestedReordersResponse.SuggestedReorders.ADAPTER.encodeWithTag(protoWriter, 1, ((GetSuggestedReordersResponse$Response$SuggestedReorders) zzijVar).value);
        } else if (zzijVar instanceof GetSuggestedReordersResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((GetSuggestedReordersResponse$Response$ErrorResponse) zzijVar).value);
        } else if (zzijVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getSuggestedReordersResponse.unknownFields());
    }
}
