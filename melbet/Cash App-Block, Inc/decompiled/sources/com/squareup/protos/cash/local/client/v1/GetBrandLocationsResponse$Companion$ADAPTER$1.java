package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhw;
import com.squareup.protos.cash.local.client.v1.GetBrandLocationsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetBrandLocationsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzhw zzhwVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBrandLocationsResponse(zzhwVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzhwVar = new GetBrandLocationsResponse$Response$Success((GetBrandLocationsResponse.Success) GetBrandLocationsResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzhwVar = new GetBrandLocationsResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBrandLocationsResponse getBrandLocationsResponse = (GetBrandLocationsResponse) obj;
        reverseProtoWriter.getClass();
        getBrandLocationsResponse.getClass();
        reverseProtoWriter.writeBytes(getBrandLocationsResponse.unknownFields());
        zzhw zzhwVar = getBrandLocationsResponse.response;
        if (zzhwVar instanceof GetBrandLocationsResponse$Response$Success) {
            GetBrandLocationsResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetBrandLocationsResponse$Response$Success) zzhwVar).value);
        } else if (zzhwVar instanceof GetBrandLocationsResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetBrandLocationsResponse$Response$ErrorResponse) zzhwVar).value);
        } else {
            if (zzhwVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetBrandLocationsResponse getBrandLocationsResponse = (GetBrandLocationsResponse) obj;
        getBrandLocationsResponse.getClass();
        int size$okio = getBrandLocationsResponse.unknownFields().getSize$okio();
        zzhw zzhwVar = getBrandLocationsResponse.response;
        if (zzhwVar instanceof GetBrandLocationsResponse$Response$Success) {
            encodedSizeWithTag = GetBrandLocationsResponse.Success.ADAPTER.encodedSizeWithTag(1, ((GetBrandLocationsResponse$Response$Success) zzhwVar).value);
        } else {
            if (!(zzhwVar instanceof GetBrandLocationsResponse$Response$ErrorResponse)) {
                if (zzhwVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((GetBrandLocationsResponse$Response$ErrorResponse) zzhwVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBrandLocationsResponse getBrandLocationsResponse = (GetBrandLocationsResponse) obj;
        getBrandLocationsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzhw zzhwVar = getBrandLocationsResponse.response;
        byteString.getClass();
        return new GetBrandLocationsResponse(zzhwVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBrandLocationsResponse getBrandLocationsResponse = (GetBrandLocationsResponse) obj;
        getBrandLocationsResponse.getClass();
        zzhw zzhwVar = getBrandLocationsResponse.response;
        if (zzhwVar instanceof GetBrandLocationsResponse$Response$Success) {
            GetBrandLocationsResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((GetBrandLocationsResponse$Response$Success) zzhwVar).value);
        } else if (zzhwVar instanceof GetBrandLocationsResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((GetBrandLocationsResponse$Response$ErrorResponse) zzhwVar).value);
        } else if (zzhwVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getBrandLocationsResponse.unknownFields());
    }
}
