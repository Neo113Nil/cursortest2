package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.internal.utils.MiscUtilsKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateLoyaltyAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        MiscUtilsKt miscUtilsKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateLoyaltyAccountResponse(miscUtilsKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                miscUtilsKt = new CreateLoyaltyAccountResponse$Response$LoyaltyAccount((LocalLoyaltyAccount) LocalLoyaltyAccount.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                miscUtilsKt = new CreateLoyaltyAccountResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateLoyaltyAccountResponse createLoyaltyAccountResponse = (CreateLoyaltyAccountResponse) obj;
        reverseProtoWriter.getClass();
        createLoyaltyAccountResponse.getClass();
        reverseProtoWriter.writeBytes(createLoyaltyAccountResponse.unknownFields());
        MiscUtilsKt miscUtilsKt = createLoyaltyAccountResponse.response;
        if (miscUtilsKt instanceof CreateLoyaltyAccountResponse$Response$LoyaltyAccount) {
            LocalLoyaltyAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CreateLoyaltyAccountResponse$Response$LoyaltyAccount) miscUtilsKt).value);
        } else if (miscUtilsKt instanceof CreateLoyaltyAccountResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CreateLoyaltyAccountResponse$Response$ErrorResponse) miscUtilsKt).value);
        } else {
            if (miscUtilsKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CreateLoyaltyAccountResponse createLoyaltyAccountResponse = (CreateLoyaltyAccountResponse) obj;
        createLoyaltyAccountResponse.getClass();
        int size$okio = createLoyaltyAccountResponse.unknownFields().getSize$okio();
        MiscUtilsKt miscUtilsKt = createLoyaltyAccountResponse.response;
        if (miscUtilsKt instanceof CreateLoyaltyAccountResponse$Response$LoyaltyAccount) {
            encodedSizeWithTag = LocalLoyaltyAccount.ADAPTER.encodedSizeWithTag(1, ((CreateLoyaltyAccountResponse$Response$LoyaltyAccount) miscUtilsKt).value);
        } else {
            if (!(miscUtilsKt instanceof CreateLoyaltyAccountResponse$Response$ErrorResponse)) {
                if (miscUtilsKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((CreateLoyaltyAccountResponse$Response$ErrorResponse) miscUtilsKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateLoyaltyAccountResponse createLoyaltyAccountResponse = (CreateLoyaltyAccountResponse) obj;
        createLoyaltyAccountResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        MiscUtilsKt miscUtilsKt = createLoyaltyAccountResponse.response;
        byteString.getClass();
        return new CreateLoyaltyAccountResponse(miscUtilsKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateLoyaltyAccountResponse createLoyaltyAccountResponse = (CreateLoyaltyAccountResponse) obj;
        createLoyaltyAccountResponse.getClass();
        MiscUtilsKt miscUtilsKt = createLoyaltyAccountResponse.response;
        if (miscUtilsKt instanceof CreateLoyaltyAccountResponse$Response$LoyaltyAccount) {
            LocalLoyaltyAccount.ADAPTER.encodeWithTag(protoWriter, 1, ((CreateLoyaltyAccountResponse$Response$LoyaltyAccount) miscUtilsKt).value);
        } else if (miscUtilsKt instanceof CreateLoyaltyAccountResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((CreateLoyaltyAccountResponse$Response$ErrorResponse) miscUtilsKt).value);
        } else if (miscUtilsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(createLoyaltyAccountResponse.unknownFields());
    }
}
