package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import com.squareup.protos.cash.local.client.v1.ConfirmArrivalResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ConfirmArrivalResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ByteArrayExtKt byteArrayExtKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ConfirmArrivalResponse(byteArrayExtKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                byteArrayExtKt = new ConfirmArrivalResponse$Response$Success((ConfirmArrivalResponse.Success) ConfirmArrivalResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                byteArrayExtKt = new ConfirmArrivalResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ConfirmArrivalResponse confirmArrivalResponse = (ConfirmArrivalResponse) obj;
        reverseProtoWriter.getClass();
        confirmArrivalResponse.getClass();
        reverseProtoWriter.writeBytes(confirmArrivalResponse.unknownFields());
        ByteArrayExtKt byteArrayExtKt = confirmArrivalResponse.response;
        if (byteArrayExtKt instanceof ConfirmArrivalResponse$Response$Success) {
            ConfirmArrivalResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ConfirmArrivalResponse$Response$Success) byteArrayExtKt).value);
        } else if (byteArrayExtKt instanceof ConfirmArrivalResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ConfirmArrivalResponse$Response$ErrorResponse) byteArrayExtKt).value);
        } else {
            if (byteArrayExtKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ConfirmArrivalResponse confirmArrivalResponse = (ConfirmArrivalResponse) obj;
        confirmArrivalResponse.getClass();
        int size$okio = confirmArrivalResponse.unknownFields().getSize$okio();
        ByteArrayExtKt byteArrayExtKt = confirmArrivalResponse.response;
        if (byteArrayExtKt instanceof ConfirmArrivalResponse$Response$Success) {
            encodedSizeWithTag = ConfirmArrivalResponse.Success.ADAPTER.encodedSizeWithTag(1, ((ConfirmArrivalResponse$Response$Success) byteArrayExtKt).value);
        } else {
            if (!(byteArrayExtKt instanceof ConfirmArrivalResponse$Response$ErrorResponse)) {
                if (byteArrayExtKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(3, ((ConfirmArrivalResponse$Response$ErrorResponse) byteArrayExtKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ConfirmArrivalResponse confirmArrivalResponse = (ConfirmArrivalResponse) obj;
        confirmArrivalResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteArrayExtKt byteArrayExtKt = confirmArrivalResponse.response;
        byteString.getClass();
        return new ConfirmArrivalResponse(byteArrayExtKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ConfirmArrivalResponse confirmArrivalResponse = (ConfirmArrivalResponse) obj;
        confirmArrivalResponse.getClass();
        ByteArrayExtKt byteArrayExtKt = confirmArrivalResponse.response;
        if (byteArrayExtKt instanceof ConfirmArrivalResponse$Response$Success) {
            ConfirmArrivalResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((ConfirmArrivalResponse$Response$Success) byteArrayExtKt).value);
        } else if (byteArrayExtKt instanceof ConfirmArrivalResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 3, ((ConfirmArrivalResponse$Response$ErrorResponse) byteArrayExtKt).value);
        } else if (byteArrayExtKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(confirmArrivalResponse.unknownFields());
    }
}
