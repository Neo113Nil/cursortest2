package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzjd;
import com.squareup.protos.cash.local.client.v1.SetPushToStartLiveActivityTokenResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetPushToStartLiveActivityTokenResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzjd zzjdVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetPushToStartLiveActivityTokenResponse(zzjdVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzjdVar = new SetPushToStartLiveActivityTokenResponse$Response$Success((SetPushToStartLiveActivityTokenResponse.Success) SetPushToStartLiveActivityTokenResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjdVar = new SetPushToStartLiveActivityTokenResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetPushToStartLiveActivityTokenResponse setPushToStartLiveActivityTokenResponse = (SetPushToStartLiveActivityTokenResponse) obj;
        reverseProtoWriter.getClass();
        setPushToStartLiveActivityTokenResponse.getClass();
        reverseProtoWriter.writeBytes(setPushToStartLiveActivityTokenResponse.unknownFields());
        zzjd zzjdVar = setPushToStartLiveActivityTokenResponse.response;
        if (zzjdVar instanceof SetPushToStartLiveActivityTokenResponse$Response$Success) {
            SetPushToStartLiveActivityTokenResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SetPushToStartLiveActivityTokenResponse$Response$Success) zzjdVar).value);
        } else if (zzjdVar instanceof SetPushToStartLiveActivityTokenResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SetPushToStartLiveActivityTokenResponse$Response$ErrorResponse) zzjdVar).value);
        } else {
            if (zzjdVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SetPushToStartLiveActivityTokenResponse setPushToStartLiveActivityTokenResponse = (SetPushToStartLiveActivityTokenResponse) obj;
        setPushToStartLiveActivityTokenResponse.getClass();
        int size$okio = setPushToStartLiveActivityTokenResponse.unknownFields().getSize$okio();
        zzjd zzjdVar = setPushToStartLiveActivityTokenResponse.response;
        if (zzjdVar instanceof SetPushToStartLiveActivityTokenResponse$Response$Success) {
            encodedSizeWithTag = SetPushToStartLiveActivityTokenResponse.Success.ADAPTER.encodedSizeWithTag(1, ((SetPushToStartLiveActivityTokenResponse$Response$Success) zzjdVar).value);
        } else {
            if (!(zzjdVar instanceof SetPushToStartLiveActivityTokenResponse$Response$ErrorResponse)) {
                if (zzjdVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((SetPushToStartLiveActivityTokenResponse$Response$ErrorResponse) zzjdVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetPushToStartLiveActivityTokenResponse setPushToStartLiveActivityTokenResponse = (SetPushToStartLiveActivityTokenResponse) obj;
        setPushToStartLiveActivityTokenResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzjd zzjdVar = setPushToStartLiveActivityTokenResponse.response;
        byteString.getClass();
        return new SetPushToStartLiveActivityTokenResponse(zzjdVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetPushToStartLiveActivityTokenResponse setPushToStartLiveActivityTokenResponse = (SetPushToStartLiveActivityTokenResponse) obj;
        setPushToStartLiveActivityTokenResponse.getClass();
        zzjd zzjdVar = setPushToStartLiveActivityTokenResponse.response;
        if (zzjdVar instanceof SetPushToStartLiveActivityTokenResponse$Response$Success) {
            SetPushToStartLiveActivityTokenResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((SetPushToStartLiveActivityTokenResponse$Response$Success) zzjdVar).value);
        } else if (zzjdVar instanceof SetPushToStartLiveActivityTokenResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((SetPushToStartLiveActivityTokenResponse$Response$ErrorResponse) zzjdVar).value);
        } else if (zzjdVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(setPushToStartLiveActivityTokenResponse.unknownFields());
    }
}
