package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzia;
import com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetDeliveryQuoteResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzia zziaVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetDeliveryQuoteResponse(zziaVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zziaVar = new GetDeliveryQuoteResponse$Response$DeliveryQuote((GetDeliveryQuoteResponse.DeliveryQuote) GetDeliveryQuoteResponse.DeliveryQuote.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zziaVar = new GetDeliveryQuoteResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetDeliveryQuoteResponse getDeliveryQuoteResponse = (GetDeliveryQuoteResponse) obj;
        reverseProtoWriter.getClass();
        getDeliveryQuoteResponse.getClass();
        reverseProtoWriter.writeBytes(getDeliveryQuoteResponse.unknownFields());
        zzia zziaVar = getDeliveryQuoteResponse.response;
        if (zziaVar instanceof GetDeliveryQuoteResponse$Response$DeliveryQuote) {
            GetDeliveryQuoteResponse.DeliveryQuote.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetDeliveryQuoteResponse$Response$DeliveryQuote) zziaVar).value);
        } else if (zziaVar instanceof GetDeliveryQuoteResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetDeliveryQuoteResponse$Response$ErrorResponse) zziaVar).value);
        } else {
            if (zziaVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetDeliveryQuoteResponse getDeliveryQuoteResponse = (GetDeliveryQuoteResponse) obj;
        getDeliveryQuoteResponse.getClass();
        int size$okio = getDeliveryQuoteResponse.unknownFields().getSize$okio();
        zzia zziaVar = getDeliveryQuoteResponse.response;
        if (zziaVar instanceof GetDeliveryQuoteResponse$Response$DeliveryQuote) {
            encodedSizeWithTag = GetDeliveryQuoteResponse.DeliveryQuote.ADAPTER.encodedSizeWithTag(1, ((GetDeliveryQuoteResponse$Response$DeliveryQuote) zziaVar).value);
        } else {
            if (!(zziaVar instanceof GetDeliveryQuoteResponse$Response$ErrorResponse)) {
                if (zziaVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((GetDeliveryQuoteResponse$Response$ErrorResponse) zziaVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDeliveryQuoteResponse getDeliveryQuoteResponse = (GetDeliveryQuoteResponse) obj;
        getDeliveryQuoteResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzia zziaVar = getDeliveryQuoteResponse.response;
        byteString.getClass();
        return new GetDeliveryQuoteResponse(zziaVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDeliveryQuoteResponse getDeliveryQuoteResponse = (GetDeliveryQuoteResponse) obj;
        getDeliveryQuoteResponse.getClass();
        zzia zziaVar = getDeliveryQuoteResponse.response;
        if (zziaVar instanceof GetDeliveryQuoteResponse$Response$DeliveryQuote) {
            GetDeliveryQuoteResponse.DeliveryQuote.ADAPTER.encodeWithTag(protoWriter, 1, ((GetDeliveryQuoteResponse$Response$DeliveryQuote) zziaVar).value);
        } else if (zziaVar instanceof GetDeliveryQuoteResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((GetDeliveryQuoteResponse$Response$ErrorResponse) zziaVar).value);
        } else if (zziaVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getDeliveryQuoteResponse.unknownFields());
    }
}
