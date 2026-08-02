package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.squareup.protos.cash.local.client.v1.GetMarketingCouponOfferDetailsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetMarketingCouponOfferDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        RuntimeUtilsKt runtimeUtilsKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMarketingCouponOfferDetailsResponse(runtimeUtilsKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                runtimeUtilsKt = new GetMarketingCouponOfferDetailsResponse$Response$Details((GetMarketingCouponOfferDetailsResponse.CouponOfferDetails) GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                runtimeUtilsKt = new GetMarketingCouponOfferDetailsResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMarketingCouponOfferDetailsResponse getMarketingCouponOfferDetailsResponse = (GetMarketingCouponOfferDetailsResponse) obj;
        reverseProtoWriter.getClass();
        getMarketingCouponOfferDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(getMarketingCouponOfferDetailsResponse.unknownFields());
        RuntimeUtilsKt runtimeUtilsKt = getMarketingCouponOfferDetailsResponse.response;
        if (runtimeUtilsKt instanceof GetMarketingCouponOfferDetailsResponse$Response$Details) {
            GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetMarketingCouponOfferDetailsResponse$Response$Details) runtimeUtilsKt).value);
        } else if (runtimeUtilsKt instanceof GetMarketingCouponOfferDetailsResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetMarketingCouponOfferDetailsResponse$Response$ErrorResponse) runtimeUtilsKt).value);
        } else {
            if (runtimeUtilsKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetMarketingCouponOfferDetailsResponse getMarketingCouponOfferDetailsResponse = (GetMarketingCouponOfferDetailsResponse) obj;
        getMarketingCouponOfferDetailsResponse.getClass();
        int size$okio = getMarketingCouponOfferDetailsResponse.unknownFields().getSize$okio();
        RuntimeUtilsKt runtimeUtilsKt = getMarketingCouponOfferDetailsResponse.response;
        if (runtimeUtilsKt instanceof GetMarketingCouponOfferDetailsResponse$Response$Details) {
            encodedSizeWithTag = GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.ADAPTER.encodedSizeWithTag(1, ((GetMarketingCouponOfferDetailsResponse$Response$Details) runtimeUtilsKt).value);
        } else {
            if (!(runtimeUtilsKt instanceof GetMarketingCouponOfferDetailsResponse$Response$ErrorResponse)) {
                if (runtimeUtilsKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((GetMarketingCouponOfferDetailsResponse$Response$ErrorResponse) runtimeUtilsKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMarketingCouponOfferDetailsResponse getMarketingCouponOfferDetailsResponse = (GetMarketingCouponOfferDetailsResponse) obj;
        getMarketingCouponOfferDetailsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        RuntimeUtilsKt runtimeUtilsKt = getMarketingCouponOfferDetailsResponse.response;
        byteString.getClass();
        return new GetMarketingCouponOfferDetailsResponse(runtimeUtilsKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMarketingCouponOfferDetailsResponse getMarketingCouponOfferDetailsResponse = (GetMarketingCouponOfferDetailsResponse) obj;
        getMarketingCouponOfferDetailsResponse.getClass();
        RuntimeUtilsKt runtimeUtilsKt = getMarketingCouponOfferDetailsResponse.response;
        if (runtimeUtilsKt instanceof GetMarketingCouponOfferDetailsResponse$Response$Details) {
            GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.ADAPTER.encodeWithTag(protoWriter, 1, ((GetMarketingCouponOfferDetailsResponse$Response$Details) runtimeUtilsKt).value);
        } else if (runtimeUtilsKt instanceof GetMarketingCouponOfferDetailsResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((GetMarketingCouponOfferDetailsResponse$Response$ErrorResponse) runtimeUtilsKt).value);
        } else if (runtimeUtilsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getMarketingCouponOfferDetailsResponse.unknownFields());
    }
}
