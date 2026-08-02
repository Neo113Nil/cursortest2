package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import com.squareup.protos.cash.supportal.app.OpenChatResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OpenChatResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzlm zzlmVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OpenChatResponse(zzlmVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzlmVar = new OpenChatResponse$Result$Allowed((OpenChatResponse.Allowed) OpenChatResponse.Allowed.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzlmVar = new OpenChatResponse$Result$Denied((OpenChatResponse.Denied) OpenChatResponse.Denied.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OpenChatResponse openChatResponse = (OpenChatResponse) obj;
        reverseProtoWriter.getClass();
        openChatResponse.getClass();
        reverseProtoWriter.writeBytes(openChatResponse.unknownFields());
        zzlm zzlmVar = openChatResponse.result;
        if (zzlmVar instanceof OpenChatResponse$Result$Allowed) {
            OpenChatResponse.Allowed.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((OpenChatResponse$Result$Allowed) zzlmVar).value);
        } else if (zzlmVar instanceof OpenChatResponse$Result$Denied) {
            OpenChatResponse.Denied.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((OpenChatResponse$Result$Denied) zzlmVar).value);
        } else {
            if (zzlmVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        OpenChatResponse openChatResponse = (OpenChatResponse) obj;
        openChatResponse.getClass();
        int size$okio = openChatResponse.unknownFields().getSize$okio();
        zzlm zzlmVar = openChatResponse.result;
        if (zzlmVar instanceof OpenChatResponse$Result$Allowed) {
            encodedSizeWithTag = OpenChatResponse.Allowed.ADAPTER.encodedSizeWithTag(1, ((OpenChatResponse$Result$Allowed) zzlmVar).value);
        } else {
            if (!(zzlmVar instanceof OpenChatResponse$Result$Denied)) {
                if (zzlmVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = OpenChatResponse.Denied.ADAPTER.encodedSizeWithTag(2, ((OpenChatResponse$Result$Denied) zzlmVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OpenChatResponse openChatResponse = (OpenChatResponse) obj;
        openChatResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzlm zzlmVar = openChatResponse.result;
        byteString.getClass();
        return new OpenChatResponse(zzlmVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OpenChatResponse openChatResponse = (OpenChatResponse) obj;
        openChatResponse.getClass();
        zzlm zzlmVar = openChatResponse.result;
        if (zzlmVar instanceof OpenChatResponse$Result$Allowed) {
            OpenChatResponse.Allowed.ADAPTER.encodeWithTag(protoWriter, 1, ((OpenChatResponse$Result$Allowed) zzlmVar).value);
        } else if (zzlmVar instanceof OpenChatResponse$Result$Denied) {
            OpenChatResponse.Denied.ADAPTER.encodeWithTag(protoWriter, 2, ((OpenChatResponse$Result$Denied) zzlmVar).value);
        } else if (zzlmVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(openChatResponse.unknownFields());
    }
}
