package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzji;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateUserIntentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzji zzjiVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateUserIntentResponse(zzjiVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzjiVar = new UpdateUserIntentResponse$Response$Success((UpdateUserIntentResponse.Success) UpdateUserIntentResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjiVar = new UpdateUserIntentResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateUserIntentResponse updateUserIntentResponse = (UpdateUserIntentResponse) obj;
        reverseProtoWriter.getClass();
        updateUserIntentResponse.getClass();
        reverseProtoWriter.writeBytes(updateUserIntentResponse.unknownFields());
        zzji zzjiVar = updateUserIntentResponse.response;
        if (zzjiVar instanceof UpdateUserIntentResponse$Response$Success) {
            UpdateUserIntentResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((UpdateUserIntentResponse$Response$Success) zzjiVar).value);
        } else if (zzjiVar instanceof UpdateUserIntentResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((UpdateUserIntentResponse$Response$ErrorResponse) zzjiVar).value);
        } else {
            if (zzjiVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        UpdateUserIntentResponse updateUserIntentResponse = (UpdateUserIntentResponse) obj;
        updateUserIntentResponse.getClass();
        int size$okio = updateUserIntentResponse.unknownFields().getSize$okio();
        zzji zzjiVar = updateUserIntentResponse.response;
        if (zzjiVar instanceof UpdateUserIntentResponse$Response$Success) {
            encodedSizeWithTag = UpdateUserIntentResponse.Success.ADAPTER.encodedSizeWithTag(1, ((UpdateUserIntentResponse$Response$Success) zzjiVar).value);
        } else {
            if (!(zzjiVar instanceof UpdateUserIntentResponse$Response$ErrorResponse)) {
                if (zzjiVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((UpdateUserIntentResponse$Response$ErrorResponse) zzjiVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateUserIntentResponse updateUserIntentResponse = (UpdateUserIntentResponse) obj;
        updateUserIntentResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzji zzjiVar = updateUserIntentResponse.response;
        byteString.getClass();
        return new UpdateUserIntentResponse(zzjiVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateUserIntentResponse updateUserIntentResponse = (UpdateUserIntentResponse) obj;
        updateUserIntentResponse.getClass();
        zzji zzjiVar = updateUserIntentResponse.response;
        if (zzjiVar instanceof UpdateUserIntentResponse$Response$Success) {
            UpdateUserIntentResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((UpdateUserIntentResponse$Response$Success) zzjiVar).value);
        } else if (zzjiVar instanceof UpdateUserIntentResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((UpdateUserIntentResponse$Response$ErrorResponse) zzjiVar).value);
        } else if (zzjiVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(updateUserIntentResponse.unknownFields());
    }
}
