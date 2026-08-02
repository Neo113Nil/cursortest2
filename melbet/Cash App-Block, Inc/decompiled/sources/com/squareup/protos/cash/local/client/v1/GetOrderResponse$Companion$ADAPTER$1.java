package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetOrderResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        SdkCoreExtKt sdkCoreExtKt = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetOrderResponse(sdkCoreExtKt, (SignupOrEnrollUpsell) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                sdkCoreExtKt = new GetOrderResponse$Response$Order((LocalOrder) LocalOrder.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(SignupOrEnrollUpsell.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                sdkCoreExtKt = new GetOrderResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetOrderResponse getOrderResponse = (GetOrderResponse) obj;
        reverseProtoWriter.getClass();
        getOrderResponse.getClass();
        reverseProtoWriter.writeBytes(getOrderResponse.unknownFields());
        SdkCoreExtKt sdkCoreExtKt = getOrderResponse.response;
        if (sdkCoreExtKt instanceof GetOrderResponse$Response$Order) {
            LocalOrder.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetOrderResponse$Response$Order) sdkCoreExtKt).value);
        } else if (sdkCoreExtKt instanceof GetOrderResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GetOrderResponse$Response$ErrorResponse) sdkCoreExtKt).value);
        } else if (sdkCoreExtKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, getOrderResponse.account_creation_intent_token);
        SignupOrEnrollUpsell.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getOrderResponse.signup_or_enroll_upsell);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetOrderResponse getOrderResponse = (GetOrderResponse) obj;
        getOrderResponse.getClass();
        int size$okio = getOrderResponse.unknownFields().getSize$okio();
        SdkCoreExtKt sdkCoreExtKt = getOrderResponse.response;
        if (sdkCoreExtKt instanceof GetOrderResponse$Response$Order) {
            encodedSizeWithTag = LocalOrder.ADAPTER.encodedSizeWithTag(1, ((GetOrderResponse$Response$Order) sdkCoreExtKt).value);
        } else {
            if (!(sdkCoreExtKt instanceof GetOrderResponse$Response$ErrorResponse)) {
                if (sdkCoreExtKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(4, getOrderResponse.account_creation_intent_token) + SignupOrEnrollUpsell.ADAPTER.encodedSizeWithTag(2, getOrderResponse.signup_or_enroll_upsell) + size$okio;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(3, ((GetOrderResponse$Response$ErrorResponse) sdkCoreExtKt).value);
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.STRING.encodedSizeWithTag(4, getOrderResponse.account_creation_intent_token) + SignupOrEnrollUpsell.ADAPTER.encodedSizeWithTag(2, getOrderResponse.signup_or_enroll_upsell) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetOrderResponse getOrderResponse = (GetOrderResponse) obj;
        getOrderResponse.getClass();
        SignupOrEnrollUpsell signupOrEnrollUpsell = getOrderResponse.signup_or_enroll_upsell;
        SignupOrEnrollUpsell signupOrEnrollUpsell2 = signupOrEnrollUpsell != null ? (SignupOrEnrollUpsell) SignupOrEnrollUpsell.ADAPTER.redact(signupOrEnrollUpsell) : null;
        ByteString byteString = ByteString.EMPTY;
        SdkCoreExtKt sdkCoreExtKt = getOrderResponse.response;
        String str = getOrderResponse.account_creation_intent_token;
        byteString.getClass();
        return new GetOrderResponse(sdkCoreExtKt, signupOrEnrollUpsell2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetOrderResponse getOrderResponse = (GetOrderResponse) obj;
        getOrderResponse.getClass();
        SignupOrEnrollUpsell.ADAPTER.encodeWithTag(protoWriter, 2, getOrderResponse.signup_or_enroll_upsell);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getOrderResponse.account_creation_intent_token);
        SdkCoreExtKt sdkCoreExtKt = getOrderResponse.response;
        if (sdkCoreExtKt instanceof GetOrderResponse$Response$Order) {
            LocalOrder.ADAPTER.encodeWithTag(protoWriter, 1, ((GetOrderResponse$Response$Order) sdkCoreExtKt).value);
        } else if (sdkCoreExtKt instanceof GetOrderResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 3, ((GetOrderResponse$Response$ErrorResponse) sdkCoreExtKt).value);
        } else if (sdkCoreExtKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getOrderResponse.unknownFields());
    }
}
