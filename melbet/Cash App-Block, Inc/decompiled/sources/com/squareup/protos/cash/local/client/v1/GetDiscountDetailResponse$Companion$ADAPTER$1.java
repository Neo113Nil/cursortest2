package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzib;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetDiscountDetailResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzib zzibVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetDiscountDetailResponse(zzibVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzibVar = new GetDiscountDetailResponse$Response$Detail((LocalMenuDiscountDetail) LocalMenuDiscountDetail.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzibVar = new GetDiscountDetailResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetDiscountDetailResponse getDiscountDetailResponse = (GetDiscountDetailResponse) obj;
        reverseProtoWriter.getClass();
        getDiscountDetailResponse.getClass();
        reverseProtoWriter.writeBytes(getDiscountDetailResponse.unknownFields());
        zzib zzibVar = getDiscountDetailResponse.response;
        if (zzibVar instanceof GetDiscountDetailResponse$Response$Detail) {
            LocalMenuDiscountDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetDiscountDetailResponse$Response$Detail) zzibVar).value);
        } else if (zzibVar instanceof GetDiscountDetailResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetDiscountDetailResponse$Response$ErrorResponse) zzibVar).value);
        } else {
            if (zzibVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetDiscountDetailResponse getDiscountDetailResponse = (GetDiscountDetailResponse) obj;
        getDiscountDetailResponse.getClass();
        int size$okio = getDiscountDetailResponse.unknownFields().getSize$okio();
        zzib zzibVar = getDiscountDetailResponse.response;
        if (zzibVar instanceof GetDiscountDetailResponse$Response$Detail) {
            encodedSizeWithTag = LocalMenuDiscountDetail.ADAPTER.encodedSizeWithTag(1, ((GetDiscountDetailResponse$Response$Detail) zzibVar).value);
        } else {
            if (!(zzibVar instanceof GetDiscountDetailResponse$Response$ErrorResponse)) {
                if (zzibVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((GetDiscountDetailResponse$Response$ErrorResponse) zzibVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDiscountDetailResponse getDiscountDetailResponse = (GetDiscountDetailResponse) obj;
        getDiscountDetailResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzib zzibVar = getDiscountDetailResponse.response;
        byteString.getClass();
        return new GetDiscountDetailResponse(zzibVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDiscountDetailResponse getDiscountDetailResponse = (GetDiscountDetailResponse) obj;
        getDiscountDetailResponse.getClass();
        zzib zzibVar = getDiscountDetailResponse.response;
        if (zzibVar instanceof GetDiscountDetailResponse$Response$Detail) {
            LocalMenuDiscountDetail.ADAPTER.encodeWithTag(protoWriter, 1, ((GetDiscountDetailResponse$Response$Detail) zzibVar).value);
        } else if (zzibVar instanceof GetDiscountDetailResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((GetDiscountDetailResponse$Response$ErrorResponse) zzibVar).value);
        } else if (zzibVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getDiscountDetailResponse.unknownFields());
    }
}
