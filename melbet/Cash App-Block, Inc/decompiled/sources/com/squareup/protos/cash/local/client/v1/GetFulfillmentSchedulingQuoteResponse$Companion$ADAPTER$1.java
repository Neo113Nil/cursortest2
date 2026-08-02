package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetFulfillmentSchedulingQuoteResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        RumTagsUtilsKt rumTagsUtilsKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetFulfillmentSchedulingQuoteResponse(rumTagsUtilsKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                rumTagsUtilsKt = new GetFulfillmentSchedulingQuoteResponse$Response$Quote((GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote) GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                rumTagsUtilsKt = new GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetFulfillmentSchedulingQuoteResponse getFulfillmentSchedulingQuoteResponse = (GetFulfillmentSchedulingQuoteResponse) obj;
        reverseProtoWriter.getClass();
        getFulfillmentSchedulingQuoteResponse.getClass();
        reverseProtoWriter.writeBytes(getFulfillmentSchedulingQuoteResponse.unknownFields());
        RumTagsUtilsKt rumTagsUtilsKt = getFulfillmentSchedulingQuoteResponse.response;
        if (rumTagsUtilsKt instanceof GetFulfillmentSchedulingQuoteResponse$Response$Quote) {
            GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetFulfillmentSchedulingQuoteResponse$Response$Quote) rumTagsUtilsKt).value);
        } else if (rumTagsUtilsKt instanceof GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse) rumTagsUtilsKt).value);
        } else {
            if (rumTagsUtilsKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetFulfillmentSchedulingQuoteResponse getFulfillmentSchedulingQuoteResponse = (GetFulfillmentSchedulingQuoteResponse) obj;
        getFulfillmentSchedulingQuoteResponse.getClass();
        int size$okio = getFulfillmentSchedulingQuoteResponse.unknownFields().getSize$okio();
        RumTagsUtilsKt rumTagsUtilsKt = getFulfillmentSchedulingQuoteResponse.response;
        if (rumTagsUtilsKt instanceof GetFulfillmentSchedulingQuoteResponse$Response$Quote) {
            encodedSizeWithTag = GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote.ADAPTER.encodedSizeWithTag(1, ((GetFulfillmentSchedulingQuoteResponse$Response$Quote) rumTagsUtilsKt).value);
        } else {
            if (!(rumTagsUtilsKt instanceof GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse)) {
                if (rumTagsUtilsKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse) rumTagsUtilsKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetFulfillmentSchedulingQuoteResponse getFulfillmentSchedulingQuoteResponse = (GetFulfillmentSchedulingQuoteResponse) obj;
        getFulfillmentSchedulingQuoteResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        RumTagsUtilsKt rumTagsUtilsKt = getFulfillmentSchedulingQuoteResponse.response;
        byteString.getClass();
        return new GetFulfillmentSchedulingQuoteResponse(rumTagsUtilsKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetFulfillmentSchedulingQuoteResponse getFulfillmentSchedulingQuoteResponse = (GetFulfillmentSchedulingQuoteResponse) obj;
        getFulfillmentSchedulingQuoteResponse.getClass();
        RumTagsUtilsKt rumTagsUtilsKt = getFulfillmentSchedulingQuoteResponse.response;
        if (rumTagsUtilsKt instanceof GetFulfillmentSchedulingQuoteResponse$Response$Quote) {
            GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote.ADAPTER.encodeWithTag(protoWriter, 1, ((GetFulfillmentSchedulingQuoteResponse$Response$Quote) rumTagsUtilsKt).value);
        } else if (rumTagsUtilsKt instanceof GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse) rumTagsUtilsKt).value);
        } else if (rumTagsUtilsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getFulfillmentSchedulingQuoteResponse.unknownFields());
    }
}
