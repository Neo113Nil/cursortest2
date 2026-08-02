package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzlp zzlpVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupportPhoneStatusResponse(zzlpVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzlpVar = new SupportPhoneStatusResponse$Access$Granted((SupportPhoneStatusResponse.Granted) SupportPhoneStatusResponse.Granted.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzlpVar = new SupportPhoneStatusResponse$Access$Denied((SupportPhoneStatusResponse.Denied) SupportPhoneStatusResponse.Denied.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportPhoneStatusResponse supportPhoneStatusResponse = (SupportPhoneStatusResponse) obj;
        reverseProtoWriter.getClass();
        supportPhoneStatusResponse.getClass();
        reverseProtoWriter.writeBytes(supportPhoneStatusResponse.unknownFields());
        zzlp zzlpVar = supportPhoneStatusResponse.access;
        if (zzlpVar instanceof SupportPhoneStatusResponse$Access$Granted) {
            SupportPhoneStatusResponse.Granted.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SupportPhoneStatusResponse$Access$Granted) zzlpVar).value);
        } else if (zzlpVar instanceof SupportPhoneStatusResponse$Access$Denied) {
            SupportPhoneStatusResponse.Denied.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SupportPhoneStatusResponse$Access$Denied) zzlpVar).value);
        } else {
            if (zzlpVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SupportPhoneStatusResponse supportPhoneStatusResponse = (SupportPhoneStatusResponse) obj;
        supportPhoneStatusResponse.getClass();
        int size$okio = supportPhoneStatusResponse.unknownFields().getSize$okio();
        zzlp zzlpVar = supportPhoneStatusResponse.access;
        if (zzlpVar instanceof SupportPhoneStatusResponse$Access$Granted) {
            encodedSizeWithTag = SupportPhoneStatusResponse.Granted.ADAPTER.encodedSizeWithTag(1, ((SupportPhoneStatusResponse$Access$Granted) zzlpVar).value);
        } else {
            if (!(zzlpVar instanceof SupportPhoneStatusResponse$Access$Denied)) {
                if (zzlpVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = SupportPhoneStatusResponse.Denied.ADAPTER.encodedSizeWithTag(2, ((SupportPhoneStatusResponse$Access$Denied) zzlpVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportPhoneStatusResponse supportPhoneStatusResponse = (SupportPhoneStatusResponse) obj;
        supportPhoneStatusResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzlp zzlpVar = supportPhoneStatusResponse.access;
        byteString.getClass();
        return new SupportPhoneStatusResponse(zzlpVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportPhoneStatusResponse supportPhoneStatusResponse = (SupportPhoneStatusResponse) obj;
        supportPhoneStatusResponse.getClass();
        zzlp zzlpVar = supportPhoneStatusResponse.access;
        if (zzlpVar instanceof SupportPhoneStatusResponse$Access$Granted) {
            SupportPhoneStatusResponse.Granted.ADAPTER.encodeWithTag(protoWriter, 1, ((SupportPhoneStatusResponse$Access$Granted) zzlpVar).value);
        } else if (zzlpVar instanceof SupportPhoneStatusResponse$Access$Denied) {
            SupportPhoneStatusResponse.Denied.ADAPTER.encodeWithTag(protoWriter, 2, ((SupportPhoneStatusResponse$Access$Denied) zzlpVar).value);
        } else if (zzlpVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(supportPhoneStatusResponse.unknownFields());
    }
}
