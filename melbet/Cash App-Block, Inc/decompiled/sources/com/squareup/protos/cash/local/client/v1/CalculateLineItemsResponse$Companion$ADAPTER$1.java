package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.internal.thread.ThreadExtKt;
import com.squareup.protos.cash.local.client.v1.CalculateLineItemsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CalculateLineItemsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ThreadExtKt threadExtKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CalculateLineItemsResponse(threadExtKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                threadExtKt = new CalculateLineItemsResponse$Response$Success((CalculateLineItemsResponse.Success) CalculateLineItemsResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                threadExtKt = new CalculateLineItemsResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CalculateLineItemsResponse calculateLineItemsResponse = (CalculateLineItemsResponse) obj;
        reverseProtoWriter.getClass();
        calculateLineItemsResponse.getClass();
        reverseProtoWriter.writeBytes(calculateLineItemsResponse.unknownFields());
        ThreadExtKt threadExtKt = calculateLineItemsResponse.response;
        if (threadExtKt instanceof CalculateLineItemsResponse$Response$Success) {
            CalculateLineItemsResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CalculateLineItemsResponse$Response$Success) threadExtKt).value);
        } else if (threadExtKt instanceof CalculateLineItemsResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CalculateLineItemsResponse$Response$ErrorResponse) threadExtKt).value);
        } else {
            if (threadExtKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CalculateLineItemsResponse calculateLineItemsResponse = (CalculateLineItemsResponse) obj;
        calculateLineItemsResponse.getClass();
        int size$okio = calculateLineItemsResponse.unknownFields().getSize$okio();
        ThreadExtKt threadExtKt = calculateLineItemsResponse.response;
        if (threadExtKt instanceof CalculateLineItemsResponse$Response$Success) {
            encodedSizeWithTag = CalculateLineItemsResponse.Success.ADAPTER.encodedSizeWithTag(1, ((CalculateLineItemsResponse$Response$Success) threadExtKt).value);
        } else {
            if (!(threadExtKt instanceof CalculateLineItemsResponse$Response$ErrorResponse)) {
                if (threadExtKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((CalculateLineItemsResponse$Response$ErrorResponse) threadExtKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CalculateLineItemsResponse calculateLineItemsResponse = (CalculateLineItemsResponse) obj;
        calculateLineItemsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        ThreadExtKt threadExtKt = calculateLineItemsResponse.response;
        byteString.getClass();
        return new CalculateLineItemsResponse(threadExtKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CalculateLineItemsResponse calculateLineItemsResponse = (CalculateLineItemsResponse) obj;
        calculateLineItemsResponse.getClass();
        ThreadExtKt threadExtKt = calculateLineItemsResponse.response;
        if (threadExtKt instanceof CalculateLineItemsResponse$Response$Success) {
            CalculateLineItemsResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((CalculateLineItemsResponse$Response$Success) threadExtKt).value);
        } else if (threadExtKt instanceof CalculateLineItemsResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((CalculateLineItemsResponse$Response$ErrorResponse) threadExtKt).value);
        } else if (threadExtKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(calculateLineItemsResponse.unknownFields());
    }
}
