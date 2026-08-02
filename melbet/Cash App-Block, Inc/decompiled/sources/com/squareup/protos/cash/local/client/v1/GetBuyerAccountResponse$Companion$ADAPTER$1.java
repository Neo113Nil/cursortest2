package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhy;
import com.squareup.protos.cash.local.client.v1.GetBuyerAccountResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetBuyerAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzhy zzhyVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBuyerAccountResponse(zzhyVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzhyVar = new GetBuyerAccountResponse$Response$Success((GetBuyerAccountResponse.Success) GetBuyerAccountResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzhyVar = new GetBuyerAccountResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBuyerAccountResponse getBuyerAccountResponse = (GetBuyerAccountResponse) obj;
        reverseProtoWriter.getClass();
        getBuyerAccountResponse.getClass();
        reverseProtoWriter.writeBytes(getBuyerAccountResponse.unknownFields());
        zzhy zzhyVar = getBuyerAccountResponse.response;
        if (zzhyVar instanceof GetBuyerAccountResponse$Response$Success) {
            GetBuyerAccountResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetBuyerAccountResponse$Response$Success) zzhyVar).value);
        } else if (zzhyVar instanceof GetBuyerAccountResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetBuyerAccountResponse$Response$ErrorResponse) zzhyVar).value);
        } else {
            if (zzhyVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetBuyerAccountResponse getBuyerAccountResponse = (GetBuyerAccountResponse) obj;
        getBuyerAccountResponse.getClass();
        int size$okio = getBuyerAccountResponse.unknownFields().getSize$okio();
        zzhy zzhyVar = getBuyerAccountResponse.response;
        if (zzhyVar instanceof GetBuyerAccountResponse$Response$Success) {
            encodedSizeWithTag = GetBuyerAccountResponse.Success.ADAPTER.encodedSizeWithTag(1, ((GetBuyerAccountResponse$Response$Success) zzhyVar).value);
        } else {
            if (!(zzhyVar instanceof GetBuyerAccountResponse$Response$ErrorResponse)) {
                if (zzhyVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((GetBuyerAccountResponse$Response$ErrorResponse) zzhyVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBuyerAccountResponse getBuyerAccountResponse = (GetBuyerAccountResponse) obj;
        getBuyerAccountResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzhy zzhyVar = getBuyerAccountResponse.response;
        byteString.getClass();
        return new GetBuyerAccountResponse(zzhyVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBuyerAccountResponse getBuyerAccountResponse = (GetBuyerAccountResponse) obj;
        getBuyerAccountResponse.getClass();
        zzhy zzhyVar = getBuyerAccountResponse.response;
        if (zzhyVar instanceof GetBuyerAccountResponse$Response$Success) {
            GetBuyerAccountResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((GetBuyerAccountResponse$Response$Success) zzhyVar).value);
        } else if (zzhyVar instanceof GetBuyerAccountResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((GetBuyerAccountResponse$Response$ErrorResponse) zzhyVar).value);
        } else if (zzhyVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getBuyerAccountResponse.unknownFields());
    }
}
