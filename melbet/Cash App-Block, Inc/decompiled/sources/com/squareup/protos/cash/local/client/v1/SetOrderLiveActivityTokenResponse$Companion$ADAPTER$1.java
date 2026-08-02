package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzjc;
import com.squareup.protos.cash.local.client.v1.SetOrderLiveActivityTokenResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetOrderLiveActivityTokenResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzjc zzjcVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetOrderLiveActivityTokenResponse(zzjcVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzjcVar = new SetOrderLiveActivityTokenResponse$Response$Success((SetOrderLiveActivityTokenResponse.Success) SetOrderLiveActivityTokenResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjcVar = new SetOrderLiveActivityTokenResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetOrderLiveActivityTokenResponse setOrderLiveActivityTokenResponse = (SetOrderLiveActivityTokenResponse) obj;
        reverseProtoWriter.getClass();
        setOrderLiveActivityTokenResponse.getClass();
        reverseProtoWriter.writeBytes(setOrderLiveActivityTokenResponse.unknownFields());
        zzjc zzjcVar = setOrderLiveActivityTokenResponse.response;
        if (zzjcVar instanceof SetOrderLiveActivityTokenResponse$Response$Success) {
            SetOrderLiveActivityTokenResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SetOrderLiveActivityTokenResponse$Response$Success) zzjcVar).value);
        } else if (zzjcVar instanceof SetOrderLiveActivityTokenResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SetOrderLiveActivityTokenResponse$Response$ErrorResponse) zzjcVar).value);
        } else {
            if (zzjcVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SetOrderLiveActivityTokenResponse setOrderLiveActivityTokenResponse = (SetOrderLiveActivityTokenResponse) obj;
        setOrderLiveActivityTokenResponse.getClass();
        int size$okio = setOrderLiveActivityTokenResponse.unknownFields().getSize$okio();
        zzjc zzjcVar = setOrderLiveActivityTokenResponse.response;
        if (zzjcVar instanceof SetOrderLiveActivityTokenResponse$Response$Success) {
            encodedSizeWithTag = SetOrderLiveActivityTokenResponse.Success.ADAPTER.encodedSizeWithTag(1, ((SetOrderLiveActivityTokenResponse$Response$Success) zzjcVar).value);
        } else {
            if (!(zzjcVar instanceof SetOrderLiveActivityTokenResponse$Response$ErrorResponse)) {
                if (zzjcVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((SetOrderLiveActivityTokenResponse$Response$ErrorResponse) zzjcVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetOrderLiveActivityTokenResponse setOrderLiveActivityTokenResponse = (SetOrderLiveActivityTokenResponse) obj;
        setOrderLiveActivityTokenResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzjc zzjcVar = setOrderLiveActivityTokenResponse.response;
        byteString.getClass();
        return new SetOrderLiveActivityTokenResponse(zzjcVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetOrderLiveActivityTokenResponse setOrderLiveActivityTokenResponse = (SetOrderLiveActivityTokenResponse) obj;
        setOrderLiveActivityTokenResponse.getClass();
        zzjc zzjcVar = setOrderLiveActivityTokenResponse.response;
        if (zzjcVar instanceof SetOrderLiveActivityTokenResponse$Response$Success) {
            SetOrderLiveActivityTokenResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((SetOrderLiveActivityTokenResponse$Response$Success) zzjcVar).value);
        } else if (zzjcVar instanceof SetOrderLiveActivityTokenResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((SetOrderLiveActivityTokenResponse$Response$ErrorResponse) zzjcVar).value);
        } else if (zzjcVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(setOrderLiveActivityTokenResponse.unknownFields());
    }
}
