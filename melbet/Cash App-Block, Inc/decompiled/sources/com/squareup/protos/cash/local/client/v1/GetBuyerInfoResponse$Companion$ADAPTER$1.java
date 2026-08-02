package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhz;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetBuyerInfoResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzhz zzhzVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBuyerInfoResponse(zzhzVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzhzVar = new GetBuyerInfoResponse$Response$BuyerInfo((GetBuyerInfoResponse.BuyerInfo) GetBuyerInfoResponse.BuyerInfo.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzhzVar = new GetBuyerInfoResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBuyerInfoResponse getBuyerInfoResponse = (GetBuyerInfoResponse) obj;
        reverseProtoWriter.getClass();
        getBuyerInfoResponse.getClass();
        reverseProtoWriter.writeBytes(getBuyerInfoResponse.unknownFields());
        zzhz zzhzVar = getBuyerInfoResponse.response;
        if (zzhzVar instanceof GetBuyerInfoResponse$Response$BuyerInfo) {
            GetBuyerInfoResponse.BuyerInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetBuyerInfoResponse$Response$BuyerInfo) zzhzVar).value);
        } else if (zzhzVar instanceof GetBuyerInfoResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetBuyerInfoResponse$Response$ErrorResponse) zzhzVar).value);
        } else {
            if (zzhzVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetBuyerInfoResponse getBuyerInfoResponse = (GetBuyerInfoResponse) obj;
        getBuyerInfoResponse.getClass();
        int size$okio = getBuyerInfoResponse.unknownFields().getSize$okio();
        zzhz zzhzVar = getBuyerInfoResponse.response;
        if (zzhzVar instanceof GetBuyerInfoResponse$Response$BuyerInfo) {
            encodedSizeWithTag = GetBuyerInfoResponse.BuyerInfo.ADAPTER.encodedSizeWithTag(1, ((GetBuyerInfoResponse$Response$BuyerInfo) zzhzVar).value);
        } else {
            if (!(zzhzVar instanceof GetBuyerInfoResponse$Response$ErrorResponse)) {
                if (zzhzVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((GetBuyerInfoResponse$Response$ErrorResponse) zzhzVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBuyerInfoResponse getBuyerInfoResponse = (GetBuyerInfoResponse) obj;
        getBuyerInfoResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzhz zzhzVar = getBuyerInfoResponse.response;
        byteString.getClass();
        return new GetBuyerInfoResponse(zzhzVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBuyerInfoResponse getBuyerInfoResponse = (GetBuyerInfoResponse) obj;
        getBuyerInfoResponse.getClass();
        zzhz zzhzVar = getBuyerInfoResponse.response;
        if (zzhzVar instanceof GetBuyerInfoResponse$Response$BuyerInfo) {
            GetBuyerInfoResponse.BuyerInfo.ADAPTER.encodeWithTag(protoWriter, 1, ((GetBuyerInfoResponse$Response$BuyerInfo) zzhzVar).value);
        } else if (zzhzVar instanceof GetBuyerInfoResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((GetBuyerInfoResponse$Response$ErrorResponse) zzhzVar).value);
        } else if (zzhzVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getBuyerInfoResponse.unknownFields());
    }
}
